package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Q extends AbstractRunnableC1489a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11802s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f11803t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1509e0 f11804u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(C1509e0 c1509e0, Bundle bundle, int i4) {
        super(c1509e0, true);
        this.f11802s = i4;
        this.f11804u = c1509e0;
        this.f11803t = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public final void a() {
        switch (this.f11802s) {
            case 0:
                H h4 = this.f11804u.f11911f;
                h2.y.i(h4);
                h4.setConditionalUserProperty(this.f11803t, this.f11871o);
                return;
            default:
                H h5 = this.f11804u.f11911f;
                h2.y.i(h5);
                h5.setConsent(this.f11803t, this.f11871o);
                return;
        }
    }
}
