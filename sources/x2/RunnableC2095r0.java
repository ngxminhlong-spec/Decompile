package x2;

import com.google.android.gms.internal.measurement.t3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2095r0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2077i f15774o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f15775p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15776q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f15777r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f15778s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C2077i f15779t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2103v0 f15780u;

    public RunnableC2095r0(C2103v0 c2103v0, C2077i c2077i, long j4, int i4, long j5, boolean z4, C2077i c2077i2) {
        this.f15780u = c2103v0;
        this.f15774o = c2077i;
        this.f15775p = j4;
        this.f15776q = i4;
        this.f15777r = j5;
        this.f15778s = z4;
        this.f15779t = c2077i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103v0 c2103v0 = this.f15780u;
        C2077i c2077i = this.f15774o;
        c2103v0.u(c2077i);
        c2103v0.p(false, this.f15775p);
        C2103v0.C(c2103v0, this.f15774o, this.f15776q, this.f15777r, true, this.f15778s);
        t3.a();
        if (((C2066c0) c2103v0.f1719a).f15566g.p(null, B.f15318p0)) {
            C2103v0.B(c2103v0, c2077i, this.f15779t);
        }
    }
}
