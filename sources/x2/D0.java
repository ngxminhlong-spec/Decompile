package x2;

import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15346o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d1 f15347p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f15348q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J0 f15349r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC1717a f15350s;

    public /* synthetic */ D0(J0 j02, d1 d1Var, boolean z4, AbstractC1717a abstractC1717a, int i4) {
        this.f15346o = i4;
        this.f15349r = j02;
        this.f15347p = d1Var;
        this.f15348q = z4;
        this.f15350s = abstractC1717a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15346o) {
            case 0:
                J0 j02 = this.f15349r;
                D d = j02.d;
                if (d != null) {
                    j02.j(d, this.f15348q ? null : (Y0) this.f15350s, this.f15347p);
                    j02.q();
                    return;
                } else {
                    K k3 = ((C2066c0) j02.f1719a).f15568i;
                    C2066c0.i(k3);
                    k3.f15394f.a("Discarding data. Failed to set user property");
                    return;
                }
            case 1:
                J0 j03 = this.f15349r;
                D d4 = j03.d;
                if (d4 != null) {
                    j03.j(d4, this.f15348q ? null : (C2096s) this.f15350s, this.f15347p);
                    j03.q();
                    return;
                } else {
                    K k4 = ((C2066c0) j03.f1719a).f15568i;
                    C2066c0.i(k4);
                    k4.f15394f.a("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                J0 j04 = this.f15349r;
                D d5 = j04.d;
                if (d5 != null) {
                    j04.j(d5, this.f15348q ? null : (C2065c) this.f15350s, this.f15347p);
                    j04.q();
                    return;
                } else {
                    K k5 = ((C2066c0) j04.f1719a).f15568i;
                    C2066c0.i(k5);
                    k5.f15394f.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }
}
