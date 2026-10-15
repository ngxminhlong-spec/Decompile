package c0;

import D0.o;
import Q1.F;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import h0.C1694b;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223d {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f3504j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3506b;
    public final WorkDatabase_Impl c;

    /* renamed from: f, reason: collision with root package name */
    public volatile h0.f f3508f;

    /* renamed from: g, reason: collision with root package name */
    public final F f3509g;
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f3507e = false;

    /* renamed from: h, reason: collision with root package name */
    public final n.f f3510h = new n.f();

    /* renamed from: i, reason: collision with root package name */
    public final o f3511i = new o(22, this);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3505a = new HashMap();

    public C0223d(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.c = workDatabase_Impl;
        this.f3509g = new F(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f3506b = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr[i4];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f3505a.put(lowerCase, Integer.valueOf(i4));
            String str2 = (String) hashMap.get(strArr[i4]);
            if (str2 != null) {
                this.f3506b[i4] = str2.toLowerCase(locale);
            } else {
                this.f3506b[i4] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f3505a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap3 = this.f3505a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        C1694b c1694b = this.c.f3524a;
        if (c1694b == null || !((SQLiteDatabase) c1694b.f13103p).isOpen()) {
            return false;
        }
        if (!this.f3507e) {
            this.c.c.c();
        }
        if (this.f3507e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(C1694b c1694b, int i4) {
        c1694b.h(U.a.h(i4, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        String str = this.f3506b[i4];
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < 3; i5++) {
            String str2 = f3504j[i5];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i4);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            c1694b.h(sb.toString());
        }
    }

    public final void c(C1694b c1694b) {
        if (((SQLiteDatabase) c1694b.f13103p).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.c.f3529h.readLock();
                readLock.lock();
                try {
                    int[] a4 = this.f3509g.a();
                    if (a4 == null) {
                        readLock.unlock();
                        return;
                    }
                    int length = a4.length;
                    c1694b.a();
                    for (int i4 = 0; i4 < length; i4++) {
                        try {
                            int i5 = a4[i4];
                            if (i5 == 1) {
                                b(c1694b, i4);
                            } else if (i5 == 2) {
                                String str = this.f3506b[i4];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f3504j;
                                for (int i6 = 0; i6 < 3; i6++) {
                                    String str2 = strArr[i6];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    c1694b.h(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            c1694b.g();
                            throw th;
                        }
                    }
                    c1694b.k();
                    c1694b.g();
                    F f4 = this.f3509g;
                    synchronized (f4) {
                        f4.f1627p = false;
                    }
                    readLock.unlock();
                } catch (Throwable th2) {
                    readLock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e4) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
                return;
            }
        }
    }
}
