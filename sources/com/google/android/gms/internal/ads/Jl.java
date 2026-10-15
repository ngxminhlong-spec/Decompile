package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Jl implements InterfaceC0954nh, Yg, Lg {

    /* renamed from: o, reason: collision with root package name */
    public final C1220tq f5896o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1263uq f5897p;

    /* renamed from: q, reason: collision with root package name */
    public final C1163sc f5898q;

    public Jl(C1220tq c1220tq, InterfaceC1263uq interfaceC1263uq, C1163sc c1163sc) {
        this.f5896o = c1220tq;
        this.f5897p = interfaceC1263uq;
        this.f5898q = c1163sc;
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final void J(C0101z0 c0101z0) {
        C1220tq c1220tq = this.f5896o;
        c1220tq.a("action", "ftl");
        c1220tq.a("ftl", String.valueOf(c0101z0.f1405o));
        c1220tq.a("ed", c0101z0.f1407q);
        this.f5897p.b(c1220tq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void K0(Ep ep) {
        this.f5896o.f(ep, this.f5898q);
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final void M() {
        C1220tq c1220tq = this.f5896o;
        c1220tq.a("action", "loaded");
        this.f5897p.b(c1220tq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void N(C0370Za c0370Za) {
        Bundle bundle = c0370Za.f7989o;
        HashMap hashMap = this.f5896o.f10751a;
        if (bundle.containsKey("cnt")) {
            hashMap.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            hashMap.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
