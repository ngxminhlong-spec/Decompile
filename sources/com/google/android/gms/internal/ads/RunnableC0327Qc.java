package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0327Qc implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6663o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0337Sc f6664p;

    public /* synthetic */ RunnableC0327Qc(C0337Sc c0337Sc, int i4) {
        this.f6663o = i4;
        this.f6664p = c0337Sc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6663o) {
            case 0:
                this.f6664p.c("firstFrameRendered", new String[0]);
                return;
            case 1:
                this.f6664p.c("surfaceCreated", new String[0]);
                return;
            default:
                this.f6664p.c("surfaceDestroyed", new String[0]);
                return;
        }
    }
}
