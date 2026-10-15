package o3;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.o;
import t.C1986a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h extends t.g implements ScheduledFuture {

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledFuture f14357v;

    public h(g gVar) {
        this.f14357v = gVar.b(new o(4, this));
    }

    @Override // t.g
    public final void c() {
        ScheduledFuture scheduledFuture = this.f14357v;
        Object obj = this.f14829o;
        scheduledFuture.cancel((obj instanceof C1986a) && ((C1986a) obj).f14813a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f14357v.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f14357v.getDelay(timeUnit);
    }
}
