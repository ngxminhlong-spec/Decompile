package C0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class t0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f399o;

    /* renamed from: p, reason: collision with root package name */
    public int f400p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f401q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H f402r;

    public /* synthetic */ t0(H h4, int i4) {
        this.f399o = i4;
        this.f402r = h4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f399o) {
            case 0:
                v0 v0Var = (v0) this.f402r;
                if (this.f401q) {
                    return;
                }
                this.f401q = true;
                v0.Q(v0Var, this.f400p, false);
                v0Var.f426h0.postDelayed(new A0.a(20, this), 1000L);
                return;
            default:
                D0.p pVar = (D0.p) this.f402r;
                if (this.f401q) {
                    return;
                }
                this.f401q = true;
                D0.p.Q(pVar, this.f400p, false);
                pVar.f618g0.postDelayed(new D0.o(0, this), 1000L);
                return;
        }
    }
}
