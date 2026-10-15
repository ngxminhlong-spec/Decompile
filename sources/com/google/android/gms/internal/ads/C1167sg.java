package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167sg implements InterfaceC0954nh {

    /* renamed from: o, reason: collision with root package name */
    public final Context f10616o;

    /* renamed from: p, reason: collision with root package name */
    public final Jp f10617p;

    /* renamed from: q, reason: collision with root package name */
    public final C0248Bc f10618q;

    /* renamed from: r, reason: collision with root package name */
    public final Q1.K f10619r;

    /* renamed from: s, reason: collision with root package name */
    public final Ck f10620s;

    /* renamed from: t, reason: collision with root package name */
    public final Fq f10621t;

    public C1167sg(Context context, Jp jp, C0248Bc c0248Bc, Q1.K k3, Ck ck, Fq fq) {
        this.f10616o = context;
        this.f10617p = jp;
        this.f10618q = c0248Bc;
        this.f10619r = k3;
        this.f10620s = ck;
        this.f10621t = fq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void K0(Ep ep) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void N(C0370Za c0370Za) {
        String str;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10293u3)).booleanValue()) {
            String str2 = this.f10617p.f5911f;
            C0949nc x4 = this.f10619r.x();
            N1.d dVar = N1.n.f1204A.f1213k;
            if (x4 != null) {
                dVar.getClass();
                str = x4.d;
            } else {
                str = null;
            }
            dVar.q(this.f10616o, this.f10618q, false, x4, str, str2, null, this.f10621t);
        }
        this.f10620s.b();
    }
}
