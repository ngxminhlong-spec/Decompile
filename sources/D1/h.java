package D1;

import C1.k;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import t1.C1991b;
import w1.C2046i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h implements d, E1.c, c {

    /* renamed from: t, reason: collision with root package name */
    public static final C1991b f655t = new C1991b("proto");

    /* renamed from: o, reason: collision with root package name */
    public final j f656o;

    /* renamed from: p, reason: collision with root package name */
    public final F1.a f657p;

    /* renamed from: q, reason: collision with root package name */
    public final F1.a f658q;

    /* renamed from: r, reason: collision with root package name */
    public final a f659r;

    /* renamed from: s, reason: collision with root package name */
    public final I3.a f660s;

    public h(F1.a aVar, F1.a aVar2, a aVar3, j jVar, I3.a aVar4) {
        this.f656o = jVar;
        this.f657p = aVar;
        this.f658q = aVar2;
        this.f659r = aVar3;
        this.f660s = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, C2046i c2046i) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c2046i.f15151a, String.valueOf(G1.a.a(c2046i.c))));
        byte[] bArr = c2046i.f15152b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String h(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f648a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object i(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        j jVar = this.f656o;
        Objects.requireNonNull(jVar);
        F1.a aVar = this.f658q;
        long c = aVar.c();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e4) {
                if (aVar.c() >= this.f659r.c + c) {
                    throw new RuntimeException("Timed out while trying to open db.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f656o.close();
    }

    public final Object d(f fVar) {
        SQLiteDatabase a4 = a();
        a4.beginTransaction();
        try {
            Object apply = fVar.apply(a4);
            a4.setTransactionSuccessful();
            return apply;
        } finally {
            a4.endTransaction();
        }
    }

    public final ArrayList e(SQLiteDatabase sQLiteDatabase, C2046i c2046i, int i4) {
        ArrayList arrayList = new ArrayList();
        Long b4 = b(sQLiteDatabase, c2046i);
        if (b4 == null) {
            return arrayList;
        }
        i(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b4.toString()}, null, null, null, String.valueOf(i4)), new B1.b(this, (Object) arrayList, c2046i, 2));
        return arrayList;
    }

    public final void f(long j4, z1.c cVar, String str) {
        d(new k(j4, str, cVar));
    }

    public final Object g(E1.b bVar) {
        SQLiteDatabase a4 = a();
        F1.a aVar = this.f658q;
        long c = aVar.c();
        while (true) {
            try {
                a4.beginTransaction();
                try {
                    Object a5 = bVar.a();
                    a4.setTransactionSuccessful();
                    return a5;
                } finally {
                    a4.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e4) {
                if (aVar.c() >= this.f659r.c + c) {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
