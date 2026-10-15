package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0866lf implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9439o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0952nf f9440p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9441q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9442r;

    public /* synthetic */ RunnableC0866lf(C0952nf c0952nf, int i4, int i5, int i6) {
        this.f9439o = i6;
        this.f9440p = c0952nf;
        this.f9441q = i4;
        this.f9442r = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9439o) {
            case 0:
                this.f9440p.o(this.f9441q - 1, this.f9442r);
                return;
            default:
                C0952nf c0952nf = this.f9440p;
                c0952nf.f9748p.execute(new RunnableC0866lf(c0952nf, this.f9441q, this.f9442r, 0));
                return;
        }
    }
}
