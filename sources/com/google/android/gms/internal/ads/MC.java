package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class MC extends AA {

    /* renamed from: q, reason: collision with root package name */
    public final C0857lC f6222q;

    /* renamed from: r, reason: collision with root package name */
    public final Y f6223r;

    public MC(C0431bC c0431bC) {
        super(5);
        Y y = new Y(3);
        this.f6223r = y;
        try {
            this.f6222q = new C0857lC(c0431bC, this);
            y.c();
        } catch (Throwable th) {
            this.f6223r.c();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void T0(int i4, long j4) {
        this.f6223r.a();
        this.f6222q.T0(i4, j4);
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int V0() {
        this.f6223r.a();
        return this.f6222q.V0();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int X0() {
        this.f6223r.a();
        return this.f6222q.X0();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int Y0() {
        this.f6223r.a();
        return this.f6222q.Y0();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void Z() {
        this.f6223r.a();
        this.f6222q.E1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int a1() {
        this.f6223r.a();
        return this.f6222q.a1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int d() {
        this.f6223r.a();
        return this.f6222q.d();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void f() {
        this.f6223r.a();
        this.f6222q.E1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final long g1() {
        this.f6223r.a();
        return this.f6222q.g1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int h() {
        this.f6223r.a();
        return this.f6222q.h();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final long h1() {
        this.f6223r.a();
        return this.f6222q.h1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final long j1() {
        this.f6223r.a();
        return this.f6222q.j1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final AbstractC0484ch k1() {
        this.f6223r.a();
        return this.f6222q.k1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final C0486cj l1() {
        this.f6223r.a();
        return this.f6222q.l1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final boolean o1() {
        this.f6223r.a();
        return this.f6222q.o1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final boolean p1() {
        this.f6223r.a();
        return this.f6222q.p1();
    }

    public final long r1() {
        this.f6223r.a();
        C0857lC c0857lC = this.f6222q;
        c0857lC.E1();
        if (c0857lC.p1()) {
            FC fc = c0857lC.f9412f0;
            return fc.f5002k.equals(fc.f4995b) ? AbstractC0751is.w(c0857lC.f9412f0.f5006o) : c0857lC.F1();
        }
        c0857lC.E1();
        if (c0857lC.f9412f0.f4994a.o()) {
            return c0857lC.f9414h0;
        }
        FC fc2 = c0857lC.f9412f0;
        long j4 = 0;
        if (fc2.f5002k.d != fc2.f4995b.d) {
            return AbstractC0751is.w(fc2.f4994a.e(c0857lC.Y0(), (Rg) c0857lC.f3928o, 0L).f6824k);
        }
        long j5 = fc2.f5006o;
        if (c0857lC.f9412f0.f5002k.b()) {
            FC fc3 = c0857lC.f9412f0;
            fc3.f4994a.n(fc3.f5002k.f10688a, c0857lC.f9383B).f10714f.a(c0857lC.f9412f0.f5002k.f10689b).getClass();
        } else {
            j4 = j5;
        }
        FC fc4 = c0857lC.f9412f0;
        fc4.f4994a.n(fc4.f5002k.f10688a, c0857lC.f9383B);
        return AbstractC0751is.w(j4);
    }

    public final long s1() {
        this.f6223r.a();
        return this.f6222q.F1();
    }
}
