package x2;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z extends FutureTask implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final long f15514o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f15515p;

    /* renamed from: q, reason: collision with root package name */
    public final String f15516q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2064b0 f15517r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C2064b0 c2064b0, Runnable runnable, boolean z4, String str) {
        super(runnable, null);
        this.f15517r = c2064b0;
        long andIncrement = C2064b0.f15533k.getAndIncrement();
        this.f15514o = andIncrement;
        this.f15516q = str;
        this.f15515p = z4;
        if (andIncrement == Long.MAX_VALUE) {
            K k3 = ((C2066c0) c2064b0.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15394f.a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C2064b0 c2064b0, Callable callable, boolean z4) {
        super(callable);
        this.f15517r = c2064b0;
        long andIncrement = C2064b0.f15533k.getAndIncrement();
        this.f15514o = andIncrement;
        this.f15516q = "Task exception on worker thread";
        this.f15515p = z4;
        if (andIncrement == Long.MAX_VALUE) {
            K k3 = ((C2066c0) c2064b0.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15394f.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Z z4 = (Z) obj;
        boolean z5 = z4.f15515p;
        boolean z6 = this.f15515p;
        if (z6 != z5) {
            return !z6 ? 1 : -1;
        }
        long j4 = z4.f15514o;
        long j5 = this.f15514o;
        if (j5 < j4) {
            return -1;
        }
        if (j5 > j4) {
            return 1;
        }
        K k3 = ((C2066c0) this.f15517r.f1719a).f15568i;
        C2066c0.i(k3);
        k3.f15395g.b(Long.valueOf(j5), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        K k3 = ((C2066c0) this.f15517r.f1719a).f15568i;
        C2066c0.i(k3);
        k3.f15394f.b(th, this.f15516q);
        super.setException(th);
    }
}
