package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483cg implements Vm {

    /* renamed from: a, reason: collision with root package name */
    public final List f8373a;

    public C0483cg(Yf yf) {
        this.f8373a = Collections.singletonList(Bs.h0(yf));
    }

    public C0483cg(List list) {
        this.f8373a = list;
    }

    @Override // com.google.android.gms.internal.ads.Vm
    public final void p() {
        for (InterfaceFutureC0239a interfaceFutureC0239a : this.f8373a) {
            interfaceFutureC0239a.a(new Nu(0, interfaceFutureC0239a, new C0347Uc(3, (byte) 0)), Iu.f5747o);
        }
    }
}
