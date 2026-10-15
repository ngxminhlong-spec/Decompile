package t;

import c3.InterfaceFutureC0239a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j implements InterfaceFutureC0239a {

    /* renamed from: o, reason: collision with root package name */
    public final WeakReference f14835o;

    /* renamed from: p, reason: collision with root package name */
    public final i f14836p = new i(this);

    public j(h hVar) {
        this.f14835o = new WeakReference(hVar);
    }

    @Override // c3.InterfaceFutureC0239a
    public final void a(Runnable runnable, Executor executor) {
        this.f14836p.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        h hVar = (h) this.f14835o.get();
        boolean cancel = this.f14836p.cancel(z4);
        if (cancel && hVar != null) {
            hVar.f14832a = null;
            hVar.f14833b = null;
            hVar.c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14836p.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        return this.f14836p.get(j4, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14836p.f14829o instanceof C1986a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14836p.isDone();
    }

    public final String toString() {
        return this.f14836p.toString();
    }
}
