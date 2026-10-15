package com.google.android.gms.internal.ads;

import O1.InterfaceC0051a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953ng implements InterfaceC0051a {

    /* renamed from: o, reason: collision with root package name */
    public final C1082qg f9758o;

    /* renamed from: p, reason: collision with root package name */
    public final Jp f9759p;

    public C0953ng(C1082qg c1082qg, Jp jp) {
        this.f9758o = c1082qg;
        this.f9759p = jp;
    }

    @Override // O1.InterfaceC0051a
    public final void D() {
        Jp jp = this.f9759p;
        C1082qg c1082qg = this.f9758o;
        String str = jp.f5911f;
        synchronized (c1082qg.f10375a) {
            try {
                Integer num = (Integer) c1082qg.f10376b.get(str);
                c1082qg.f10376b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
