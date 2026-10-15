package W3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2088a = new ThreadLocal();

    public static C a() {
        ThreadLocal threadLocal = f2088a;
        C c = (C) threadLocal.get();
        if (c != null) {
            return c;
        }
        C0123b c0123b = new C0123b(Thread.currentThread());
        threadLocal.set(c0123b);
        return c0123b;
    }
}
