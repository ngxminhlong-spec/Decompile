package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0823kf implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9297o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0952nf f9298p;

    public /* synthetic */ RunnableC0823kf(C0952nf c0952nf, int i4) {
        this.f9297o = i4;
        this.f9298p = c0952nf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9297o) {
            case 0:
                C0952nf c0952nf = this.f9298p;
                c0952nf.f9748p.execute(new RunnableC0823kf(c0952nf, 1));
                return;
            default:
                this.f9298p.l();
                return;
        }
    }
}
