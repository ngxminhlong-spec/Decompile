package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2100u implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15795o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f15796p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC2110z f15797q;

    public /* synthetic */ RunnableC2100u(AbstractC2110z abstractC2110z, long j4, int i4) {
        this.f15795o = i4;
        this.f15797q = abstractC2110z;
        this.f15796p = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15795o) {
            case 0:
                ((C2104w) this.f15797q).m(this.f15796p);
                return;
            default:
                C0 c02 = (C0) this.f15797q;
                ((C2066c0) c02.f1719a).k().j(this.f15796p);
                c02.f15338e = null;
                return;
        }
    }
}
