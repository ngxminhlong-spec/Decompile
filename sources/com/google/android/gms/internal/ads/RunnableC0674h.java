package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0674h implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8899o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0258Da f8900p;

    public /* synthetic */ RunnableC0674h(int i4, long j4, C0258Da c0258Da) {
        this.f8899o = 1;
        this.f8900p = c0258Da;
    }

    public /* synthetic */ RunnableC0674h(C0258Da c0258Da, Object obj, int i4) {
        this.f8899o = i4;
        this.f8900p = c0258Da;
    }

    public /* synthetic */ RunnableC0674h(C0258Da c0258Da, String str, long j4, long j5) {
        this.f8899o = 0;
        this.f8900p = c0258Da;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f8899o;
        C0258Da c0258Da = this.f8900p;
        c0258Da.getClass();
        switch (i4) {
            case 0:
                int i5 = AbstractC0751is.f9071a;
                VC vc = ((SurfaceHolderCallbackC0730iC) c0258Da.f4619q).f9035o.f9386E;
                vc.e(vc.j(), 1016, new UC(2));
                return;
            case 1:
                int i6 = AbstractC0751is.f9071a;
                VC vc2 = ((SurfaceHolderCallbackC0730iC) c0258Da.f4619q).f9035o.f9386E;
                vc2.e(vc2.f((C1202tE) vc2.f7251r.f8076o), 1021, new C0558eC(24));
                return;
            case 2:
                int i7 = AbstractC0751is.f9071a;
                VC vc3 = ((SurfaceHolderCallbackC0730iC) c0258Da.f4619q).f9035o.f9386E;
                vc3.e(vc3.j(), 1030, new C0558eC(13));
                return;
            case 3:
                int i8 = AbstractC0751is.f9071a;
                C0857lC c0857lC = ((SurfaceHolderCallbackC0730iC) c0258Da.f4619q).f9035o;
                c0857lC.getClass();
                VC vc4 = c0857lC.f9386E;
                vc4.e(vc4.j(), 1015, new UC(0));
                return;
            default:
                int i9 = AbstractC0751is.f9071a;
                VC vc5 = ((SurfaceHolderCallbackC0730iC) c0258Da.f4619q).f9035o.f9386E;
                vc5.e(vc5.j(), 1019, new C0558eC(21));
                return;
        }
    }
}
