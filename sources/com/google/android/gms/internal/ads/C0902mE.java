package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.mE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902mE implements InterfaceC1159sE, InterfaceC1116rE {

    /* renamed from: o, reason: collision with root package name */
    public final C1202tE f9605o;

    /* renamed from: p, reason: collision with root package name */
    public final long f9606p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0560eE f9607q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1159sE f9608r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1116rE f9609s;

    /* renamed from: t, reason: collision with root package name */
    public long f9610t = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public final C1058pz f9611u;

    public C0902mE(C1202tE c1202tE, C1058pz c1058pz, long j4) {
        this.f9605o = c1202tE;
        this.f9611u = c1058pz;
        this.f9606p = j4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1116rE
    public final /* bridge */ /* synthetic */ void a(ME me) {
        InterfaceC1116rE interfaceC1116rE = this.f9609s;
        int i4 = AbstractC0751is.f9071a;
        interfaceC1116rE.a(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1116rE
    public final void b(InterfaceC1159sE interfaceC1159sE) {
        InterfaceC1116rE interfaceC1116rE = this.f9609s;
        int i4 = AbstractC0751is.f9071a;
        interfaceC1116rE.b(this);
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final long c() {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        int i4 = AbstractC0751is.f9071a;
        return interfaceC1159sE.c();
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final void d(long j4) {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        int i4 = AbstractC0751is.f9071a;
        interfaceC1159sE.d(j4);
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final long e() {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        int i4 = AbstractC0751is.f9071a;
        return interfaceC1159sE.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void f() {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        if (interfaceC1159sE != null) {
            interfaceC1159sE.f();
            return;
        }
        AbstractC0560eE abstractC0560eE = this.f9607q;
        if (abstractC0560eE != null) {
            abstractC0560eE.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final RE g() {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        int i4 = AbstractC0751is.f9071a;
        return interfaceC1159sE.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long h(long j4) {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        int i4 = AbstractC0751is.f9071a;
        return interfaceC1159sE.h(j4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long i() {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        int i4 = AbstractC0751is.f9071a;
        return interfaceC1159sE.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void j(InterfaceC1116rE interfaceC1116rE, long j4) {
        this.f9609s = interfaceC1116rE;
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        if (interfaceC1159sE != null) {
            long j5 = this.f9610t;
            if (j5 == -9223372036854775807L) {
                j5 = this.f9606p;
            }
            interfaceC1159sE.j(this, j5);
        }
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final boolean k(C1200tC c1200tC) {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        return interfaceC1159sE != null && interfaceC1159sE.k(c1200tC);
    }

    public final void l(C1202tE c1202tE) {
        long j4 = this.f9610t;
        if (j4 == -9223372036854775807L) {
            j4 = this.f9606p;
        }
        AbstractC0560eE abstractC0560eE = this.f9607q;
        abstractC0560eE.getClass();
        InterfaceC1159sE b4 = abstractC0560eE.b(c1202tE, this.f9611u, j4);
        this.f9608r = b4;
        if (this.f9609s != null) {
            b4.j(this, j4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void m(long j4) {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        int i4 = AbstractC0751is.f9071a;
        interfaceC1159sE.m(j4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long n(InterfaceC0690hF[] interfaceC0690hFArr, boolean[] zArr, LE[] leArr, boolean[] zArr2, long j4) {
        long j5;
        long j6 = this.f9610t;
        if (j6 == -9223372036854775807L || j4 != this.f9606p) {
            j5 = j4;
        } else {
            this.f9610t = -9223372036854775807L;
            j5 = j6;
        }
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        int i4 = AbstractC0751is.f9071a;
        return interfaceC1159sE.n(interfaceC0690hFArr, zArr, leArr, zArr2, j5);
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final boolean o() {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        return interfaceC1159sE != null && interfaceC1159sE.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long p(long j4, LC lc) {
        InterfaceC1159sE interfaceC1159sE = this.f9608r;
        int i4 = AbstractC0751is.f9071a;
        return interfaceC1159sE.p(j4, lc);
    }
}
