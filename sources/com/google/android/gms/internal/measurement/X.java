package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X extends AbstractRunnableC1489a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11841s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f11842t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1509e0 f11843u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(C1509e0 c1509e0, D d, int i4) {
        super(c1509e0, true);
        this.f11841s = i4;
        this.f11843u = c1509e0;
        this.f11842t = d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public final void a() {
        switch (this.f11841s) {
            case 0:
                H h4 = this.f11843u.f11911f;
                h2.y.i(h4);
                h4.getGmpAppId(this.f11842t);
                return;
            case 1:
                H h5 = this.f11843u.f11911f;
                h2.y.i(h5);
                h5.getCachedAppInstanceId(this.f11842t);
                return;
            case 2:
                H h6 = this.f11843u.f11911f;
                h2.y.i(h6);
                h6.generateEventId(this.f11842t);
                return;
            case 3:
                H h7 = this.f11843u.f11911f;
                h2.y.i(h7);
                h7.getCurrentScreenName(this.f11842t);
                return;
            default:
                H h8 = this.f11843u.f11911f;
                h2.y.i(h8);
                h8.getCurrentScreenClass(this.f11842t);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public final void b() {
        switch (this.f11841s) {
            case 0:
                this.f11842t.d3(null);
                return;
            case 1:
                this.f11842t.d3(null);
                return;
            case 2:
                this.f11842t.d3(null);
                return;
            case 3:
                this.f11842t.d3(null);
                return;
            default:
                this.f11842t.d3(null);
                return;
        }
    }
}
