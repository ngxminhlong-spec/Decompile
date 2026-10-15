package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0473cC implements InterfaceC1132ro {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8351o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ FC f8352p;

    public /* synthetic */ C0473cC(FC fc, int i4) {
        this.f8351o = 0;
        this.f8352p = fc;
    }

    public /* synthetic */ C0473cC(FC fc, int i4, byte b4) {
        this.f8351o = i4;
        this.f8352p = fc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public final void mo6l(Object obj) {
        int i4 = this.f8351o;
        FC fc = this.f8352p;
        VC vc = (VC) obj;
        switch (i4) {
            case 0:
                int i5 = C0857lC.f9381k0;
                AbstractC0484ch abstractC0484ch = fc.f4994a;
                AA aa = vc.f7254u;
                aa.getClass();
                C0381a5 c0381a5 = vc.f7251r;
                c0381a5.f8080s = C0381a5.y(aa, (AbstractC1137rt) c0381a5.f8078q, (C1202tE) c0381a5.f8076o, (C1210tg) c0381a5.f8077p);
                c0381a5.B(aa.k1());
                vc.e(vc.b(), 0, new C0558eC(9));
                return;
            case 1:
                int i6 = C0857lC.f9381k0;
                int i7 = fc.f5004m;
                vc.e(vc.b(), 6, new C0558eC(20));
                return;
            case 2:
                int i8 = C0857lC.f9381k0;
                C0951ne c0951ne = fc.f5005n;
                vc.e(vc.b(), 12, new C0558eC(2));
                return;
            case 3:
                int i9 = C0857lC.f9381k0;
                vc.k(fc.f4997f);
                return;
            case 4:
                int i10 = C0857lC.f9381k0;
                boolean z4 = fc.f4998g;
                vc.e(vc.b(), 3, new C0558eC(5));
                return;
            default:
                int i11 = C0857lC.f9381k0;
                int i12 = fc.f4996e;
                OC b4 = vc.b();
                vc.e(b4, 4, new n0.n(b4, i12));
                return;
        }
    }
}
