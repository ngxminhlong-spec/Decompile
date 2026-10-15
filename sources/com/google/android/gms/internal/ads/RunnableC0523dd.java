package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0523dd implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8489o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0651gd f8490p;

    public /* synthetic */ RunnableC0523dd(TextureViewSurfaceTextureListenerC0651gd textureViewSurfaceTextureListenerC0651gd, int i4) {
        this.f8489o = i4;
        this.f8490p = textureViewSurfaceTextureListenerC0651gd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8489o) {
            case 0:
                C0337Sc c0337Sc = this.f8490p.f8831t;
                if (c0337Sc != null) {
                    c0337Sc.f6975q.setVisibility(4);
                    Q1.N.f1668k.post(new RunnableC0327Qc(c0337Sc, 0));
                    return;
                }
                return;
            case 1:
                C0337Sc c0337Sc2 = this.f8490p.f8831t;
                if (c0337Sc2 != null) {
                    c0337Sc2.e();
                    return;
                }
                return;
            case 2:
                TextureViewSurfaceTextureListenerC0651gd textureViewSurfaceTextureListenerC0651gd = this.f8490p;
                C0480cd c0480cd = textureViewSurfaceTextureListenerC0651gd.f6585p;
                float f4 = c0480cd.c ? c0480cd.f8369e ? 0.0f : c0480cd.f8370f : 0.0f;
                C0273Fd c0273Fd = textureViewSurfaceTextureListenerC0651gd.f8833v;
                if (c0273Fd == null) {
                    Y9.s("Trying to set volume before player is initialized.");
                    return;
                }
                try {
                    MC mc = c0273Fd.f5034u;
                    if (mc != null) {
                        mc.f6223r.a();
                        C0857lC c0857lC = mc.f6222q;
                        c0857lC.E1();
                        float max = Math.max(0.0f, Math.min(f4, 1.0f));
                        if (c0857lC.f9407a0 == max) {
                            return;
                        }
                        c0857lC.f9407a0 = max;
                        c0857lC.z1(1, 2, Float.valueOf(c0857lC.f9392K.f7149e * max));
                        C0.s0 s0Var = c0857lC.f9425z;
                        s0Var.f(22, new C0347Uc(max));
                        s0Var.e();
                        return;
                    }
                    return;
                } catch (IOException e4) {
                    Y9.t("", e4);
                    return;
                }
            case 3:
                C0337Sc c0337Sc3 = this.f8490p.f8831t;
                if (c0337Sc3 != null) {
                    c0337Sc3.g();
                    return;
                }
                return;
            case 4:
                C0337Sc c0337Sc4 = this.f8490p.f8831t;
                if (c0337Sc4 != null) {
                    c0337Sc4.c("pause", new String[0]);
                    c0337Sc4.b();
                    c0337Sc4.f6980v = false;
                    return;
                }
                return;
            case 5:
                C0337Sc c0337Sc5 = this.f8490p.f8831t;
                if (c0337Sc5 != null) {
                    RunnableC0332Rc runnableC0332Rc = c0337Sc5.f6977s;
                    runnableC0332Rc.f6804p = false;
                    Q1.J j4 = Q1.N.f1668k;
                    j4.removeCallbacks(runnableC0332Rc);
                    j4.postDelayed(runnableC0332Rc, 250L);
                    j4.post(new RunnableC0327Qc(c0337Sc5, 1));
                    return;
                }
                return;
            case 6:
                C0337Sc c0337Sc6 = this.f8490p.f8831t;
                if (c0337Sc6 != null) {
                    c0337Sc6.d();
                    return;
                }
                return;
            default:
                C0337Sc c0337Sc7 = this.f8490p.f8831t;
                if (c0337Sc7 != null) {
                    c0337Sc7.f();
                    return;
                }
                return;
        }
    }
}
