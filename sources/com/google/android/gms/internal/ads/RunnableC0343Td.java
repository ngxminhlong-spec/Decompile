package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0343Td implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7059o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0308Md f7060p;

    public /* synthetic */ RunnableC0343Td(InterfaceC0308Md interfaceC0308Md, int i4) {
        this.f7059o = i4;
        this.f7060p = interfaceC0308Md;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, r.i] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7059o) {
            case 0:
                this.f7060p.destroy();
                return;
            case 1:
                this.f7060p.destroy();
                return;
            case 2:
                this.f7060p.b("onSdkImpression", new r.i(0));
                return;
            default:
                this.f7060p.destroy();
                return;
        }
    }
}
