package Z3;

import Y3.r;
import java.util.concurrent.TimeUnit;
import n0.n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2336a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2337b;
    public static final int c;
    public static final int d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2338e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f2339f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f2340g;

    /* renamed from: h, reason: collision with root package name */
    public static final n f2341h;

    static {
        String str;
        int i4 = r.f2250a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f2336a = str;
        f2337b = Y3.a.d("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i5 = r.f2250a;
        if (i5 < 2) {
            i5 = 2;
        }
        c = Y3.a.e(i5, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = Y3.a.e(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f2338e = TimeUnit.SECONDS.toNanos(Y3.a.d("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f2339f = g.f2331a;
        f2340g = new n(0, 1);
        f2341h = new n(1, 1);
    }
}
