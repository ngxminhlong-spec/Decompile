package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U extends AbstractRunnableC1489a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11828s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1509e0 f11829t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Serializable f11830u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C1509e0 c1509e0, Boolean bool) {
        super(c1509e0, true);
        this.f11829t = c1509e0;
        this.f11830u = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C1509e0 c1509e0, Exception exc) {
        super(c1509e0, false);
        this.f11829t = c1509e0;
        this.f11830u = exc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public final void a() {
        switch (this.f11828s) {
            case 0:
                H h4 = this.f11829t.f11911f;
                h2.y.i(h4);
                h4.setMeasurementEnabled(((Boolean) this.f11830u).booleanValue(), this.f11871o);
                return;
            default:
                H h5 = this.f11829t.f11911f;
                h2.y.i(h5);
                h5.logHealthData(5, "Error with data collection. Data lost.", new BinderC1813b((Exception) this.f11830u), new BinderC1813b(null), new BinderC1813b(null));
                return;
        }
    }
}
