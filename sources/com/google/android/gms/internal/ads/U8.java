package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U8 implements InterfaceC0282Hc {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7145o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X8 f7146p;

    public /* synthetic */ U8(X8 x8, int i4) {
        this.f7145o = i4;
        this.f7146p = x8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0282Hc, com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public final void mo3l(Object obj) {
        switch (this.f7145o) {
            case 0:
                Q1.I.w("Releasing engine reference.");
                this.f7146p.d.q();
                return;
            default:
                M8 m8 = (M8) obj;
                Q1.I.w("Getting a new session for JS Engine.");
                m8.getClass();
                ((C0272Fc) this.f7146p.f5574a).b(new C0428b9(m8));
                return;
        }
    }
}
