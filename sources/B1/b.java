package B1;

import D1.f;
import D1.h;
import android.util.Log;
import m2.AbstractC1806a;
import t1.EnumC1992c;
import w1.C2045h;
import w1.C2046i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements E1.b, f {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f128o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f129p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f130q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f131r;

    public /* synthetic */ b(h hVar, Object obj, C2046i c2046i, int i4) {
        this.f128o = i4;
        this.f131r = hVar;
        this.f129p = obj;
        this.f130q = c2046i;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i4) {
        this.f128o = i4;
        this.f131r = obj;
        this.f130q = obj2;
        this.f129p = obj3;
    }

    @Override // E1.b
    public Object a() {
        c cVar = (c) this.f131r;
        C2046i c2046i = (C2046i) this.f130q;
        C2045h c2045h = (C2045h) this.f129p;
        h hVar = (h) cVar.d;
        hVar.getClass();
        EnumC1992c enumC1992c = c2046i.c;
        String str = c2045h.f15147a;
        String str2 = c2046i.f15151a;
        String s4 = AbstractC1806a.s("SQLiteEventStore");
        if (Log.isLoggable(s4, 3)) {
            Log.d(s4, "Storing event with priority=" + enumC1992c + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar.d(new b(hVar, (Object) c2045h, c2046i, 1))).getClass();
        cVar.f133a.z(c2046i, 1, false);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // D1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.b.apply(java.lang.Object):java.lang.Object");
    }
}
