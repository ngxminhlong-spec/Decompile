package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V8 implements InterfaceC0277Gc {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7236o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X8 f7237p;

    public /* synthetic */ V8(X8 x8, int i4) {
        this.f7236o = i4;
        this.f7237p = x8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0277Gc
    /* renamed from: b */
    public final void mo1b() {
        switch (this.f7236o) {
            case 0:
                this.f7237p.d.q();
                return;
            default:
                Q1.I.w("Rejecting reference for JS Engine.");
                ((C0272Fc) this.f7237p.f5574a).c(new Exception());
                return;
        }
    }
}
