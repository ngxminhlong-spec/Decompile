package x2;

import com.google.android.gms.internal.measurement.t3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2097s0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2077i f15785o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15786p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f15787q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f15788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2077i f15789s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C2103v0 f15790t;

    public RunnableC2097s0(C2103v0 c2103v0, C2077i c2077i, int i4, long j4, boolean z4, C2077i c2077i2) {
        this.f15790t = c2103v0;
        this.f15785o = c2077i;
        this.f15786p = i4;
        this.f15787q = j4;
        this.f15788r = z4;
        this.f15789s = c2077i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103v0 c2103v0 = this.f15790t;
        C2077i c2077i = this.f15785o;
        c2103v0.u(c2077i);
        C2103v0.C(c2103v0, this.f15785o, this.f15786p, this.f15787q, false, this.f15788r);
        t3.a();
        if (((C2066c0) c2103v0.f1719a).f15566g.p(null, B.f15318p0)) {
            C2103v0.B(c2103v0, c2077i, this.f15789s);
        }
    }
}
