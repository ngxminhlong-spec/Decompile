package Z3;

import W3.r;
import n0.n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: q, reason: collision with root package name */
    public final Runnable f2335q;

    public j(Runnable runnable, long j4, n nVar) {
        super(j4, nVar);
        this.f2335q = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2335q.run();
        } finally {
            this.f2334p.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f2335q;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(r.d(runnable));
        sb.append(", ");
        sb.append(this.f2333o);
        sb.append(", ");
        sb.append(this.f2334p);
        sb.append(']');
        return sb.toString();
    }
}
