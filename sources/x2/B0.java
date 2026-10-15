package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15336o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0 f15337p;

    public /* synthetic */ B0(C0 c02, int i4) {
        this.f15336o = i4;
        this.f15337p = c02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15336o) {
            case 0:
                C0 c02 = this.f15337p;
                c02.f15338e = c02.f15343j;
                return;
            default:
                this.f15337p.f15343j = null;
                return;
        }
    }
}
