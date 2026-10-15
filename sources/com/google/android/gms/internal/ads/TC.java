package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class TC implements InterfaceC1132ro, InterfaceC0475cE {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0976o2 f7053o;

    public /* synthetic */ TC(OC oc, C0976o2 c0976o2, WB wb) {
        this.f7053o = c0976o2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public int mo6l(Object obj) {
        SD sd = (SD) obj;
        Pattern pattern = AbstractC0518dE.f8479a;
        String str = sd.f6958b;
        C0976o2 c0976o2 = this.f7053o;
        return ((str.equals(c0976o2.f9813k) || str.equals(AbstractC0518dE.c(c0976o2))) && sd.i(c0976o2, false)) ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public void mo6l(Object obj) {
        ((PC) obj).d(this.f7053o);
    }
}
