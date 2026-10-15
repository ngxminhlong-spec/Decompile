package x2;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2099t0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15792o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.J f15793p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f15794q;

    public /* synthetic */ RunnableC2099t0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.J j4, int i4) {
        this.f15792o = i4;
        this.f15794q = appMeasurementDynamiteService;
        this.f15793p = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15792o) {
            case 0:
                J0 q4 = this.f15794q.f12272o.q();
                com.google.android.gms.internal.measurement.J j4 = this.f15793p;
                q4.g();
                q4.e();
                q4.r(new E.n(q4, q4.o(false), j4, 20, false));
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f15794q;
                b1 b1Var = appMeasurementDynamiteService.f12272o.f15571l;
                C2066c0.g(b1Var);
                com.google.android.gms.internal.measurement.J j5 = this.f15793p;
                C2066c0 c2066c0 = appMeasurementDynamiteService.f12272o;
                b1Var.z(j5, c2066c0.f15555A != null && c2066c0.f15555A.booleanValue());
                return;
        }
    }
}
