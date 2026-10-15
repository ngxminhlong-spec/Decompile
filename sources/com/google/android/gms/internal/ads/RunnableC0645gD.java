package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0645gD implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8794o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0831kn f8795p;

    public /* synthetic */ RunnableC0645gD(C0831kn c0831kn, int i4, long j4, long j5) {
        this.f8794o = 2;
        this.f8795p = c0831kn;
    }

    public /* synthetic */ RunnableC0645gD(C0831kn c0831kn, long j4) {
        this.f8794o = 1;
        this.f8795p = c0831kn;
    }

    public /* synthetic */ RunnableC0645gD(C0831kn c0831kn, Object obj, int i4) {
        this.f8794o = i4;
        this.f8795p = c0831kn;
    }

    public /* synthetic */ RunnableC0645gD(C0831kn c0831kn, String str, long j4, long j5) {
        this.f8794o = 7;
        this.f8795p = c0831kn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f8794o;
        C0831kn c0831kn = this.f8795p;
        c0831kn.getClass();
        switch (i4) {
            case 0:
                int i5 = AbstractC0751is.f9071a;
                C0857lC c0857lC = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o;
                c0857lC.getClass();
                VC vc = c0857lC.f9386E;
                vc.e(vc.j(), 1007, new C0558eC(4));
                return;
            case 1:
                int i6 = AbstractC0751is.f9071a;
                VC vc2 = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o.f9386E;
                vc2.e(vc2.j(), 1010, new C0558eC(16));
                return;
            case 2:
                int i7 = AbstractC0751is.f9071a;
                VC vc3 = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o.f9386E;
                vc3.e(vc3.j(), 1011, new C0558eC(14));
                return;
            case 3:
                int i8 = AbstractC0751is.f9071a;
                VC vc4 = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o.f9386E;
                vc4.e(vc4.j(), 1031, new C0558eC(28));
                return;
            case 4:
                int i9 = AbstractC0751is.f9071a;
                VC vc5 = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o.f9386E;
                vc5.e(vc5.j(), 1032, new UC(3));
                return;
            case 5:
                int i10 = AbstractC0751is.f9071a;
                VC vc6 = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o.f9386E;
                vc6.e(vc6.j(), 1029, new UC(1));
                return;
            case 6:
                int i11 = AbstractC0751is.f9071a;
                VC vc7 = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o.f9386E;
                vc7.e(vc7.j(), 1014, new UC(4));
                return;
            case 7:
                int i12 = AbstractC0751is.f9071a;
                VC vc8 = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o.f9386E;
                vc8.e(vc8.j(), 1008, new C0558eC(19));
                return;
            default:
                int i13 = AbstractC0751is.f9071a;
                VC vc9 = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o.f9386E;
                vc9.e(vc9.j(), 1012, new C0558eC(6));
                return;
        }
    }
}
