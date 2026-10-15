package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0565ed implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8617o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f8618p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f8619q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8620r;

    public /* synthetic */ RunnableC0565ed(Object obj, boolean z4, long j4, int i4) {
        this.f8617o = i4;
        this.f8620r = obj;
        this.f8618p = z4;
        this.f8619q = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8617o) {
            case 0:
                TextureViewSurfaceTextureListenerC0651gd textureViewSurfaceTextureListenerC0651gd = (TextureViewSurfaceTextureListenerC0651gd) this.f8620r;
                textureViewSurfaceTextureListenerC0651gd.f8828q.N0(this.f8618p, this.f8619q);
                return;
            default:
                ((InterfaceC0308Md) this.f8620r).N0(this.f8618p, this.f8619q);
                return;
        }
    }
}
