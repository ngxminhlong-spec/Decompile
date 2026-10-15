package x0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final u f15243o;

    /* renamed from: p, reason: collision with root package name */
    public final String f15244p;

    public t(u uVar, String str) {
        this.f15243o = uVar;
        this.f15244p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15243o.d) {
            try {
                if (((t) this.f15243o.f15247b.remove(this.f15244p)) != null) {
                    s sVar = (s) this.f15243o.c.remove(this.f15244p);
                    if (sVar != null) {
                        String str = this.f15244p;
                        n0.n.d().a(q0.e.f14625x, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((q0.e) sVar).f();
                    }
                } else {
                    n0.n.d().a("WrkTimerRunnable", "Timer with " + this.f15244p + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
