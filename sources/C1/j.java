package C1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.o;
import w1.C2046i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements E1.b, o3.g {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f492o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f493p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f494q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f495r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f496s;

    public /* synthetic */ j(l lVar, Iterable iterable, C2046i c2046i, long j4) {
        this.f492o = 0;
        this.f494q = lVar;
        this.f495r = iterable;
        this.f496s = c2046i;
        this.f493p = j4;
    }

    public /* synthetic */ j(o3.f fVar, Object obj, long j4, TimeUnit timeUnit, int i4) {
        this.f492o = i4;
        this.f494q = fVar;
        this.f495r = obj;
        this.f493p = j4;
        this.f496s = timeUnit;
    }

    @Override // E1.b
    public Object a() {
        l lVar = (l) this.f494q;
        Iterable iterable = (Iterable) this.f495r;
        C2046i c2046i = (C2046i) this.f496s;
        D1.h hVar = (D1.h) ((D1.d) lVar.c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + D1.h.h(iterable);
            SQLiteDatabase a4 = hVar.a();
            a4.beginTransaction();
            try {
                a4.compileStatement(str).execute();
                Cursor rawQuery = a4.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.f(rawQuery.getInt(0), z1.c.f15954t, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                a4.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a4.setTransactionSuccessful();
            } finally {
                a4.endTransaction();
            }
        }
        hVar.d(new D1.e(((F1.a) lVar.f504g).c() + this.f493p, c2046i));
        return null;
    }

    @Override // o3.g
    public ScheduledFuture b(final o oVar) {
        switch (this.f492o) {
            case 1:
                o3.f fVar = (o3.f) this.f494q;
                Runnable runnable = (Runnable) this.f495r;
                return fVar.f14356p.schedule(new o3.d(fVar, runnable, oVar, 1), this.f493p, (TimeUnit) this.f496s);
            default:
                final o3.f fVar2 = (o3.f) this.f494q;
                final Callable callable = (Callable) this.f495r;
                return fVar2.f14356p.schedule(new Callable() { // from class: o3.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f.this.f14355o.submit(new C1.d(5, callable, oVar));
                    }
                }, this.f493p, (TimeUnit) this.f496s);
        }
    }
}
