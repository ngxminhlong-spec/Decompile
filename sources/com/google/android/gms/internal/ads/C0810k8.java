package com.google.android.gms.internal.ads;

import O1.InterfaceC0051a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.k8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810k8 implements P1.j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9274a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9275b;
    public final /* synthetic */ InterfaceC0051a c;
    public final /* synthetic */ HashMap d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f9276e;

    public C0810k8(boolean z4, InterfaceC0051a interfaceC0051a, HashMap hashMap, Map map) {
        this.f9275b = z4;
        this.c = interfaceC0051a;
        this.d = hashMap;
        this.f9276e = map;
    }

    @Override // P1.j
    public final void u(int i4) {
    }

    @Override // P1.j
    public final void v(boolean z4) {
        if (this.f9274a) {
            return;
        }
        InterfaceC0051a interfaceC0051a = this.c;
        if (z4 && this.f9275b) {
            ((Sh) interfaceC0051a).G0();
        }
        this.f9274a = true;
        String str = (String) this.f9276e.get("event_id");
        Boolean valueOf = Boolean.valueOf(z4);
        HashMap hashMap = this.d;
        hashMap.put(str, valueOf);
        ((I8) interfaceC0051a).b("openIntentAsync", hashMap);
    }
}
