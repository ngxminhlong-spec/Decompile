package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0872ll implements InterfaceC0954nh {

    /* renamed from: o, reason: collision with root package name */
    public final Context f9460o;

    /* renamed from: p, reason: collision with root package name */
    public final C0356Wb f9461p;

    public C0872ll(Context context, C0356Wb c0356Wb) {
        this.f9460o = context;
        this.f9461p = c0356Wb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void K0(Ep ep) {
        if (TextUtils.isEmpty(((Ap) ep.f4943b.f6526q).d)) {
            return;
        }
        C0356Wb c0356Wb = this.f9461p;
        Context context = this.f9460o;
        c0356Wb.getClass();
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10225g0)).booleanValue() && c0356Wb.j(context) && C0356Wb.k(context)) {
            synchronized (c0356Wb.f7456l) {
            }
        }
        this.f9461p.b(this.f9460o, "_aq", ((Ap) ep.f4943b.f6526q).d, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void N(C0370Za c0370Za) {
    }
}
