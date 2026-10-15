package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0307Mc implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6248o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6249p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6250q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0322Pc f6251r;

    public /* synthetic */ RunnableC0307Mc(AbstractC0322Pc abstractC0322Pc, int i4, int i5, int i6) {
        this.f6248o = i6;
        this.f6251r = abstractC0322Pc;
        this.f6249p = i4;
        this.f6250q = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6248o) {
            case 0:
                C0337Sc c0337Sc = ((TextureViewSurfaceTextureListenerC0312Nc) this.f6251r).f6324D;
                if (c0337Sc != null) {
                    c0337Sc.h(this.f6249p, this.f6250q);
                    return;
                }
                return;
            default:
                C0337Sc c0337Sc2 = ((TextureViewSurfaceTextureListenerC0651gd) this.f6251r).f8831t;
                if (c0337Sc2 != null) {
                    c0337Sc2.h(this.f6249p, this.f6250q);
                    return;
                }
                return;
        }
    }
}
