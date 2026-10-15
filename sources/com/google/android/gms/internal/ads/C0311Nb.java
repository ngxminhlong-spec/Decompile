package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Nb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311Nb implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6318a;

    /* renamed from: b, reason: collision with root package name */
    public final AB f6319b;
    public final AB c;
    public final AB d;

    public /* synthetic */ C0311Nb(AB ab, AB ab2, AB ab3, int i4) {
        this.f6318a = i4;
        this.f6319b = ab;
        this.c = ab2;
        this.d = ab3;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6318a) {
            case 0:
                return new SharedPreferencesOnSharedPreferenceChangeListenerC0306Mb((Context) this.f6319b.f3930a, (Q1.K) this.c.f3930a, (C0356Wb) this.d.f3930a);
            default:
                return new C0316Ob((Q1.K) this.c.f3930a, (C0356Wb) this.d.f3930a);
        }
    }
}
