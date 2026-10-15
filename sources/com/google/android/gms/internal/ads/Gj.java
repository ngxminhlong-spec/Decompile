package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Gj implements InterfaceC0982o8 {

    /* renamed from: o, reason: collision with root package name */
    public final Vg f5321o;

    /* renamed from: p, reason: collision with root package name */
    public final C0948nb f5322p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5323q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5324r;

    public Gj(Vg vg, C1434yp c1434yp) {
        this.f5321o = vg;
        this.f5322p = c1434yp.f11520l;
        this.f5323q = c1434yp.f11516j;
        this.f5324r = c1434yp.f11518k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0982o8
    public final void L0(C0948nb c0948nb) {
        int i4;
        String str;
        C0948nb c0948nb2 = this.f5322p;
        if (c0948nb2 != null) {
            c0948nb = c0948nb2;
        }
        if (c0948nb != null) {
            str = c0948nb.f9731o;
            i4 = c0948nb.f9732p;
        } else {
            i4 = 1;
            str = "";
        }
        BinderC0606fb binderC0606fb = new BinderC0606fb(str, i4);
        Vg vg = this.f5321o;
        vg.getClass();
        vg.n1(new Op(binderC0606fb, this.f5323q, this.f5324r, 11, (byte) 0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0982o8
    public final void c() {
        this.f5321o.n1(BF.f4063L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0982o8
    public final void e() {
        this.f5321o.n1(BF.f4062K);
    }
}
