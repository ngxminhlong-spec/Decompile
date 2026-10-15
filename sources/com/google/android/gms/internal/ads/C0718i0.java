package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718i0 implements B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9020a;

    /* renamed from: b, reason: collision with root package name */
    public final B f9021b;

    public C0718i0(int i4) {
        this.f9020a = i4;
        switch (i4) {
            case 1:
                this.f9021b = new S(35152, 2, "image/png");
                return;
            case 2:
                this.f9021b = new C1102r0();
                return;
            default:
                this.f9021b = new S(16973, 2, "image/bmp");
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        switch (this.f9020a) {
            case 0:
                return ((S) this.f9021b).d(c);
            case 1:
                return ((S) this.f9021b).d(c);
            default:
                return ((C1102r0) this.f9021b).d(c);
        }
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        switch (this.f9020a) {
            case 0:
                ((S) this.f9021b).g(d);
                return;
            case 1:
                ((S) this.f9021b).g(d);
                return;
            default:
                ((C1102r0) this.f9021b).f10440b = d;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.B
    public final int h(C c, F f4) {
        switch (this.f9020a) {
            case 0:
                return ((S) this.f9021b).h(c, f4);
            case 1:
                return ((S) this.f9021b).h(c, f4);
            default:
                return ((C1102r0) this.f9021b).h(c, f4);
        }
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        switch (this.f9020a) {
            case 0:
                ((S) this.f9021b).i(j4, j5);
                return;
            case 1:
                ((S) this.f9021b).i(j4, j5);
                return;
            default:
                ((C1102r0) this.f9021b).i(j4, j5);
                return;
        }
    }
}
