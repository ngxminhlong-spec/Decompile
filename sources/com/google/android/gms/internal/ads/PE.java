package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class PE implements LE {

    /* renamed from: a, reason: collision with root package name */
    public final LE f6580a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6581b;

    public PE(LE le, long j4) {
        this.f6580a = le;
        this.f6581b = j4;
    }

    @Override // com.google.android.gms.internal.ads.LE
    public final boolean a() {
        return this.f6580a.a();
    }

    @Override // com.google.android.gms.internal.ads.LE
    public final int b(long j4) {
        return this.f6580a.b(j4 - this.f6581b);
    }

    @Override // com.google.android.gms.internal.ads.LE
    public final int c(C0831kn c0831kn, RB rb, int i4) {
        int c = this.f6580a.c(c0831kn, rb, i4);
        if (c != -4) {
            return c;
        }
        rb.f6793g += this.f6581b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.LE
    public final void i() {
        this.f6580a.i();
    }
}
