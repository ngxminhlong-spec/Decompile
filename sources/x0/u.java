package x0;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final String f15245e = n0.n.h("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f15246a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15247b;
    public final HashMap c;
    public final Object d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x0.r, java.util.concurrent.ThreadFactory] */
    public u() {
        ?? obj = new Object();
        obj.f15242a = 0;
        this.f15247b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.f15246a = Executors.newSingleThreadScheduledExecutor(obj);
    }

    public final void a(String str, q0.e eVar) {
        synchronized (this.d) {
            n0.n.d().a(f15245e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            t tVar = new t(this, str);
            this.f15247b.put(str, tVar);
            this.c.put(str, eVar);
            this.f15246a.schedule(tVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            try {
                if (((t) this.f15247b.remove(str)) != null) {
                    n0.n.d().a(f15245e, "Stopping timer for " + str, new Throwable[0]);
                    this.c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
