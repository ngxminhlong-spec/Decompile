package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class A0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2111z0 f15259o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2111z0 f15260p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f15261q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f15262r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0 f15263s;

    public A0(C0 c02, C2111z0 c2111z0, C2111z0 c2111z02, long j4, boolean z4) {
        this.f15263s = c02;
        this.f15259o = c2111z0;
        this.f15260p = c2111z02;
        this.f15261q = j4;
        this.f15262r = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15263s.j(this.f15259o, this.f15260p, this.f15261q, this.f15262r, null);
    }
}
