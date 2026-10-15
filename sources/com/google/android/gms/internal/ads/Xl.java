package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xl extends SQLiteOpenHelper {

    /* renamed from: o, reason: collision with root package name */
    public final Context f7689o;

    /* renamed from: p, reason: collision with root package name */
    public final Su f7690p;

    public Xl(Context context, Su su) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) O1.r.d.c.a(AbstractC1066q6.p7)).intValue());
        this.f7689o = context;
        this.f7690p = su;
    }

    public static void e(SQLiteDatabase sQLiteDatabase, C0242Ac c0242Ac) {
        SQLiteDatabase sQLiteDatabase2;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor query = sQLiteDatabase2.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
                int count = query.getCount();
                String[] strArr = new String[count];
                int i4 = 0;
                while (query.moveToNext()) {
                    int columnIndex = query.getColumnIndex("url");
                    if (columnIndex != -1) {
                        strArr[i4] = query.getString(columnIndex);
                    }
                    i4++;
                }
                query.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i5 = 0; i5 < count; i5++) {
                    c0242Ac.o(strArr[i5]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    public final void a(String str) {
        d(new C0753iv(str, 9));
    }

    public final void b(N2 n22) {
        d(new Wl(0, this, n22));
    }

    public final void d(InterfaceC0749iq interfaceC0749iq) {
        CallableC0336Sb callableC0336Sb = new CallableC0336Sb(6, this);
        Su su = this.f7690p;
        InterfaceFutureC0239a b4 = ((C0260Dc) su).b(callableC0336Sb);
        b4.a(new Nu(0, b4, new Ol(interfaceC0749iq, 1)), su);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
