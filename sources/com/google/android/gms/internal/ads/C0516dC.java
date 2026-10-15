package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0516dC implements InterfaceC1132ro {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8476o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ FC f8477p;

    public /* synthetic */ C0516dC(FC fc, int i4) {
        this.f8476o = 0;
        this.f8477p = fc;
    }

    public /* synthetic */ C0516dC(FC fc, int i4, byte b4) {
        this.f8476o = i4;
        this.f8477p = fc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public final void mo6l(Object obj) {
        OC b4;
        int i4 = this.f8476o;
        FC fc = this.f8477p;
        VC vc = (VC) obj;
        switch (i4) {
            case 0:
                int i5 = C0857lC.f9381k0;
                boolean z4 = fc.f5003l;
                vc.e(vc.b(), 5, new C0558eC(23));
                return;
            case 1:
                int i6 = C0857lC.f9381k0;
                fc.getClass();
                vc.e(vc.b(), 7, new C0558eC(17));
                return;
            case 2:
                int i7 = C0857lC.f9381k0;
                ZB zb = fc.f4997f;
                if (zb instanceof ZB) {
                    vc.getClass();
                    C1202tE c1202tE = zb.f7977v;
                    if (c1202tE != null) {
                        b4 = vc.f(c1202tE);
                        vc.e(b4, 10, new C0558eC(22));
                        return;
                    }
                }
                b4 = vc.b();
                vc.e(b4, 10, new C0558eC(22));
                return;
            case 3:
                int i8 = C0857lC.f9381k0;
                Object obj2 = fc.f5000i.f9287r;
                vc.e(vc.b(), 2, new C0558eC(18));
                return;
            default:
                int i9 = C0857lC.f9381k0;
                boolean z5 = fc.f5003l;
                vc.e(vc.b(), -1, new C0558eC(15));
                return;
        }
    }
}
