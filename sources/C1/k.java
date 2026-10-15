package C1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import w1.C2046i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements E1.b, D1.f {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f497o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f498p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f499q;

    public /* synthetic */ k(long j4, Object obj, Object obj2) {
        this.f498p = obj;
        this.f499q = obj2;
        this.f497o = j4;
    }

    @Override // E1.b
    public Object a() {
        l lVar = (l) this.f498p;
        C2046i c2046i = (C2046i) this.f499q;
        D1.d dVar = (D1.d) lVar.c;
        long c = ((F1.a) lVar.f504g).c() + this.f497o;
        D1.h hVar = (D1.h) dVar;
        hVar.getClass();
        hVar.d(new D1.e(c, c2046i));
        return null;
    }

    @Override // D1.f
    public Object apply(Object obj) {
        String str = (String) this.f498p;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i4 = ((z1.c) this.f499q).f15958o;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i4)});
        try {
            boolean z4 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j4 = this.f497o;
            if (z4) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j4 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i4)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i4));
            contentValues.put("events_dropped_count", Long.valueOf(j4));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
