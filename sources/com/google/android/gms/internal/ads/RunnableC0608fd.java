package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0608fd implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8707o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0651gd f8708p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f8709q;

    public /* synthetic */ RunnableC0608fd(TextureViewSurfaceTextureListenerC0651gd textureViewSurfaceTextureListenerC0651gd, String str, int i4) {
        this.f8707o = i4;
        this.f8708p = textureViewSurfaceTextureListenerC0651gd;
        this.f8709q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8707o) {
            case 0:
                C0337Sc c0337Sc = this.f8708p.f8831t;
                if (c0337Sc != null) {
                    c0337Sc.c("exception", "what", "ExoPlayerAdapter exception", "extra", this.f8709q);
                    return;
                }
                return;
            default:
                C0337Sc c0337Sc2 = this.f8708p.f8831t;
                if (c0337Sc2 != null) {
                    c0337Sc2.c("error", "what", "ExoPlayerAdapter error", "extra", this.f8709q);
                    return;
                }
                return;
        }
    }
}
