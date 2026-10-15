package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F0 extends AbstractC2085m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J0 f15367f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(J0 j02, C2066c0 c2066c0, int i4) {
        super(c2066c0);
        this.f15366e = i4;
        this.f15367f = j02;
    }

    @Override // x2.AbstractC2085m
    public final void b() {
        switch (this.f15366e) {
            case 0:
                J0 j02 = this.f15367f;
                j02.g();
                if (j02.l()) {
                    K k3 = ((C2066c0) j02.f1719a).f15568i;
                    C2066c0.i(k3);
                    k3.f15402n.a("Inactivity, disconnecting from the service");
                    j02.x();
                    return;
                }
                return;
            default:
                K k4 = ((C2066c0) this.f15367f.f1719a).f15568i;
                C2066c0.i(k4);
                k4.f15397i.a("Tasks have been queued for a long time");
                return;
        }
    }
}
