package com.google.android.gms.internal.ads;

import android.content.Context;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300vk implements InterfaceC1086qk {

    /* renamed from: a, reason: collision with root package name */
    public final long f11054a;

    /* renamed from: b, reason: collision with root package name */
    public final En f11055b;

    public C1300vk(long j4, Context context, C1384xi c1384xi, C1423ye c1423ye, String str) {
        this.f11054a = j4;
        C1423ye c1423ye2 = c1423ye.f11395b;
        O1.X0 x02 = new O1.X0();
        str.getClass();
        En en = (En) ((C1414yB) new C0874ln(c1423ye2, context, str, x02).f9467p).c();
        this.f11055b = en;
        en.w3(new BinderC1257uk(this, c1384xi));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1086qk
    public final void a(O1.U0 u02) {
        this.f11055b.h2(u02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1086qk
    public final void b() {
        this.f11055b.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1086qk
    public final void e() {
        this.f11055b.W0(new BinderC1813b(null));
    }
}
