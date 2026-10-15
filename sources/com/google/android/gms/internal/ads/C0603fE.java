package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603fE implements LE {

    /* renamed from: a, reason: collision with root package name */
    public final LE f8693a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8694b;
    public final /* synthetic */ C0646gE c;

    public C0603fE(C0646gE c0646gE, LE le) {
        this.c = c0646gE;
        this.f8693a = le;
    }

    @Override // com.google.android.gms.internal.ads.LE
    public final boolean a() {
        return !this.c.l() && this.f8693a.a();
    }

    @Override // com.google.android.gms.internal.ads.LE
    public final int b(long j4) {
        if (this.c.l()) {
            return -3;
        }
        return this.f8693a.b(j4);
    }

    @Override // com.google.android.gms.internal.ads.LE
    public final int c(C0831kn c0831kn, RB rb, int i4) {
        C0646gE c0646gE = this.c;
        if (c0646gE.l()) {
            return -3;
        }
        if (this.f8694b) {
            rb.f8436b = 4;
            return -4;
        }
        long c = c0646gE.c();
        int c2 = this.f8693a.c(c0831kn, rb, i4);
        if (c2 != -5) {
            long j4 = c0646gE.f8800s;
            if (j4 == Long.MIN_VALUE || ((c2 != -4 || rb.f6793g < j4) && !(c2 == -3 && c == Long.MIN_VALUE && !rb.f6792f))) {
                return c2;
            }
            rb.d();
            rb.f8436b = 4;
            this.f8694b = true;
            return -4;
        }
        C0976o2 c0976o2 = (C0976o2) c0831kn.f9319p;
        c0976o2.getClass();
        int i5 = c0976o2.f9799B;
        int i6 = c0976o2.f9798A;
        if (i6 == 0) {
            if (i5 == 0) {
                return -5;
            }
            i6 = 0;
        }
        if (c0646gE.f8800s != Long.MIN_VALUE) {
            i5 = 0;
        }
        L1 l12 = new L1(c0976o2);
        l12.f6116z = i6;
        l12.f6089A = i5;
        c0831kn.f9319p = new C0976o2(l12);
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.LE
    public final void i() {
        this.f8693a.i();
    }
}
