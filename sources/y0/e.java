package y0;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final j f15895o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceFutureC0239a f15896p;

    public e(j jVar, InterfaceFutureC0239a interfaceFutureC0239a) {
        this.f15895o = jVar;
        this.f15896p = interfaceFutureC0239a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15895o.f15903o != this) {
            return;
        }
        if (h.f15901t.d(this.f15895o, this, h.f(this.f15896p))) {
            h.c(this.f15895o);
        }
    }
}
