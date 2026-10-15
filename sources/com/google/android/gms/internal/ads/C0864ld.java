package com.google.android.gms.internal.ads;

import Q1.AbstractC0115n;
import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864ld extends AbstractC0115n {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0308Md f9436b;
    public final AbstractC1250ud c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f9437e;

    public C0864ld(InterfaceC0308Md interfaceC0308Md, AbstractC1250ud abstractC1250ud, String str, String[] strArr) {
        super(0);
        this.f9436b = interfaceC0308Md;
        this.c = abstractC1250ud;
        this.d = str;
        this.f9437e = strArr;
        N1.n.f1204A.y.f9741o.add(this);
    }

    @Override // Q1.AbstractC0115n
    public final void e() {
        try {
            this.c.s(this.d, this.f9437e);
        } finally {
            Q1.N.f1668k.post(new D3(12, this));
        }
    }

    @Override // Q1.AbstractC0115n
    public final InterfaceFutureC0239a f() {
        return (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10120J1)).booleanValue() && (this.c instanceof C1422yd)) ? AbstractC0266Ec.f4899e.b(new CallableC0336Sb(2, this)) : super.f();
    }
}
