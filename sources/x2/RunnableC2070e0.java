package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2070e0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15642o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d1 f15643p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ BinderC2074g0 f15644q;

    public /* synthetic */ RunnableC2070e0(BinderC2074g0 binderC2074g0, d1 d1Var, int i4) {
        this.f15642o = i4;
        this.f15644q = binderC2074g0;
        this.f15643p = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15642o) {
            case 0:
                X0 x02 = this.f15644q.f15665o;
                x02.a();
                x02.o(this.f15643p);
                return;
            case 1:
                X0 x03 = this.f15644q.f15665o;
                x03.a();
                x03.t().g();
                x03.e();
                d1 d1Var = this.f15643p;
                h2.y.e(d1Var.f15603o);
                x03.J(d1Var);
                return;
            case 2:
                X0 x04 = this.f15644q.f15665o;
                x04.a();
                x04.t().g();
                x04.e();
                d1 d1Var2 = this.f15643p;
                h2.y.e(d1Var2.f15603o);
                C2077i b4 = C2077i.b(d1Var2.f15600J);
                String str = d1Var2.f15603o;
                C2077i L4 = x04.L(str);
                x04.c().f15402n.c(str, b4, "Setting consent, package, consent");
                x04.q(str, b4);
                if (b4.g(L4, (EnumC2075h[]) b4.f15675a.keySet().toArray(new EnumC2075h[0]))) {
                    x04.o(d1Var2);
                    return;
                }
                return;
            default:
                X0 x05 = this.f15644q.f15665o;
                x05.a();
                x05.l(this.f15643p);
                return;
        }
    }
}
