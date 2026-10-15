package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0328Qd implements InterfaceC0481ce, InterfaceC0524de {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6665o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0594f5 f6666p;

    public /* synthetic */ C0328Qd(C0594f5 c0594f5, int i4) {
        this.f6665o = i4;
        this.f6666p = c0594f5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0481ce
    public void F(String str, int i4, String str2, boolean z4) {
        switch (this.f6665o) {
            case 0:
                this.f6666p.d();
                return;
            default:
                C0594f5 c0594f5 = this.f6666p;
                if (z4) {
                    c0594f5.d();
                    return;
                }
                c0594f5.c(new Xk("Image Web View failed to load. Error code: " + i4 + ", Description: " + str + ", Failing URL: " + str2, 1));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0524de
    /* renamed from: b */
    public void mo7b() {
        this.f6666p.d();
    }
}
