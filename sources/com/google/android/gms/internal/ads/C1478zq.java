package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1478zq implements Jh, Pg, Lh {

    /* renamed from: o, reason: collision with root package name */
    public final Eq f11689o;

    /* renamed from: p, reason: collision with root package name */
    public final Aq f11690p;

    public C1478zq(Context context, Eq eq) {
        this.f11689o = eq;
        this.f11690p = Zf.f(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.Lh
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.Lh
    public final void c() {
        if (((Boolean) G6.d.r()).booleanValue()) {
            Aq aq = this.f11690p;
            aq.b(true);
            this.f11689o.a(aq);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jh
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.Jh
    public final void l() {
        if (((Boolean) G6.d.r()).booleanValue()) {
            this.f11690p.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.Pg
    public final void r(C0101z0 c0101z0) {
        if (((Boolean) G6.d.r()).booleanValue()) {
            String aVar = c0101z0.h().toString();
            Aq aq = this.f11690p;
            aq.y(aVar);
            aq.b(false);
            this.f11689o.a(aq);
        }
    }
}
