package D1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import t1.EnumC1992c;
import w1.C2046i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f650o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f651p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f652q;

    public /* synthetic */ e(long j4, C2046i c2046i) {
        this.f651p = j4;
        this.f652q = c2046i;
    }

    public /* synthetic */ e(h hVar, long j4) {
        this.f652q = hVar;
        this.f651p = j4;
    }

    @Override // D1.f
    public final Object apply(Object obj) {
        switch (this.f650o) {
            case 0:
                h hVar = (h) this.f652q;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                hVar.getClass();
                String[] strArr = {String.valueOf(this.f651p)};
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.f(rawQuery.getInt(0), z1.c.f15951q, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                C2046i c2046i = (C2046i) this.f652q;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(this.f651p));
                String str = c2046i.f15151a;
                EnumC1992c enumC1992c = c2046i.c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(G1.a.a(enumC1992c))}) < 1) {
                    contentValues.put("backend_name", c2046i.f15151a);
                    contentValues.put("priority", Integer.valueOf(G1.a.a(enumC1992c)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }
}
