package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0302Lc implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6143o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0312Nc f6144p;

    public /* synthetic */ RunnableC0302Lc(TextureViewSurfaceTextureListenerC0312Nc textureViewSurfaceTextureListenerC0312Nc, int i4) {
        this.f6143o = i4;
        this.f6144p = textureViewSurfaceTextureListenerC0312Nc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6143o) {
            case 0:
                C0337Sc c0337Sc = this.f6144p.f6324D;
                if (c0337Sc != null) {
                    c0337Sc.d();
                    return;
                }
                return;
            case 1:
                C0337Sc c0337Sc2 = this.f6144p.f6324D;
                if (c0337Sc2 != null) {
                    RunnableC0332Rc runnableC0332Rc = c0337Sc2.f6977s;
                    runnableC0332Rc.f6804p = false;
                    Q1.J j4 = Q1.N.f1668k;
                    j4.removeCallbacks(runnableC0332Rc);
                    j4.postDelayed(runnableC0332Rc, 250L);
                    j4.post(new RunnableC0327Qc(c0337Sc2, 1));
                    return;
                }
                return;
            case 2:
                TextureViewSurfaceTextureListenerC0312Nc textureViewSurfaceTextureListenerC0312Nc = this.f6144p;
                C0337Sc c0337Sc3 = textureViewSurfaceTextureListenerC0312Nc.f6324D;
                if (c0337Sc3 != null) {
                    c0337Sc3.c("pause", new String[0]);
                    c0337Sc3.b();
                    c0337Sc3.f6980v = false;
                    textureViewSurfaceTextureListenerC0312Nc.f6324D.g();
                    return;
                }
                return;
            case 3:
                TextureViewSurfaceTextureListenerC0312Nc textureViewSurfaceTextureListenerC0312Nc2 = this.f6144p;
                C0337Sc c0337Sc4 = textureViewSurfaceTextureListenerC0312Nc2.f6324D;
                if (c0337Sc4 != null) {
                    if (!textureViewSurfaceTextureListenerC0312Nc2.f6325E) {
                        c0337Sc4.f6975q.setVisibility(4);
                        Q1.N.f1668k.post(new RunnableC0327Qc(c0337Sc4, 0));
                        textureViewSurfaceTextureListenerC0312Nc2.f6325E = true;
                    }
                    textureViewSurfaceTextureListenerC0312Nc2.f6324D.e();
                    return;
                }
                return;
            default:
                C0337Sc c0337Sc5 = this.f6144p.f6324D;
                if (c0337Sc5 != null) {
                    c0337Sc5.c("pause", new String[0]);
                    c0337Sc5.b();
                    c0337Sc5.f6980v = false;
                    return;
                }
                return;
        }
    }
}
