package A2;

import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f26a = new r();

    public final void a(Exception exc) {
        this.f26a.k(exc);
    }

    public final void b(Object obj) {
        this.f26a.l(obj);
    }

    public final void c(Exception exc) {
        r rVar = this.f26a;
        rVar.getClass();
        y.j(exc, "Exception must not be null");
        synchronized (rVar.f40a) {
            try {
                if (rVar.c) {
                    return;
                }
                rVar.c = true;
                rVar.f43f = exc;
                rVar.f41b.g(rVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
