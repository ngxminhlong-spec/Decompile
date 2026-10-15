package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T extends AbstractRunnableC1489a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11825s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f11826t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1509e0 f11827u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(C1509e0 c1509e0, String str, int i4) {
        super(c1509e0, true);
        this.f11825s = i4;
        this.f11827u = c1509e0;
        this.f11826t = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public final void a() {
        switch (this.f11825s) {
            case 0:
                H h4 = this.f11827u.f11911f;
                h2.y.i(h4);
                h4.setUserId(this.f11826t, this.f11871o);
                return;
            case 1:
                H h5 = this.f11827u.f11911f;
                h2.y.i(h5);
                h5.beginAdUnitExposure(this.f11826t, this.f11872p);
                return;
            default:
                H h6 = this.f11827u.f11911f;
                h2.y.i(h6);
                h6.endAdUnitExposure(this.f11826t, this.f11872p);
                return;
        }
    }
}
