package x2;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2090o0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15749o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f15750p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2103v0 f15751q;

    public /* synthetic */ RunnableC2090o0(C2103v0 c2103v0, long j4, int i4) {
        this.f15749o = i4;
        this.f15751q = c2103v0;
        this.f15750p = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15749o) {
            case 0:
                C2103v0 c2103v0 = this.f15751q;
                T t4 = ((C2066c0) c2103v0.f1719a).f15567h;
                C2066c0.g(t4);
                Q q4 = t4.f15445j;
                long j4 = this.f15750p;
                q4.b(j4);
                K k3 = ((C2066c0) c2103v0.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15401m.b(Long.valueOf(j4), "Session timeout duration set");
                return;
            default:
                long j5 = this.f15750p;
                C2103v0 c2103v02 = this.f15751q;
                c2103v02.p(true, j5);
                ((C2066c0) c2103v02.f1719a).q().y(new AtomicReference());
                return;
        }
    }
}
