package x0;

import androidx.work.impl.WorkDatabase;
import o0.C1823b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public static final String f15222r = n0.n.h("StopWorkRunnable");

    /* renamed from: o, reason: collision with root package name */
    public final o0.l f15223o;

    /* renamed from: p, reason: collision with root package name */
    public final String f15224p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15225q;

    public l(o0.l lVar, String str, boolean z4) {
        this.f15223o = lVar;
        this.f15224p = str;
        this.f15225q = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean k3;
        o0.l lVar = this.f15223o;
        WorkDatabase workDatabase = lVar.f14175n;
        C1823b c1823b = lVar.f14178q;
        C1.l n4 = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f15224p;
            synchronized (c1823b.y) {
                containsKey = c1823b.f14150t.containsKey(str);
            }
            if (this.f15225q) {
                k3 = this.f15223o.f14178q.j(this.f15224p);
            } else {
                if (!containsKey && n4.e(this.f15224p) == 2) {
                    n4.o(1, this.f15224p);
                }
                k3 = this.f15223o.f14178q.k(this.f15224p);
            }
            n0.n.d().a(f15222r, "StopWorkRunnable for " + this.f15224p + "; Processor.stopWork = " + k3, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
