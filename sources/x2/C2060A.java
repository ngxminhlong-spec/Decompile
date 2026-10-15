package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2060A {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f15254g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f15255a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2108y f15256b;
    public final Object c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15257e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f15258f = null;

    public /* synthetic */ C2060A(String str, Object obj, Object obj2, InterfaceC2108y interfaceC2108y) {
        this.f15255a = str;
        this.c = obj;
        this.d = obj2;
        this.f15256b = interfaceC2108y;
    }

    public final Object a(Object obj) {
        synchronized (this.f15257e) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC2080j0.f15687k == null) {
            return this.c;
        }
        synchronized (f15254g) {
            try {
                if (C2106x.a()) {
                    return this.f15258f == null ? this.c : this.f15258f;
                }
                try {
                    for (C2060A c2060a : B.f15289a) {
                        if (C2106x.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            InterfaceC2108y interfaceC2108y = c2060a.f15256b;
                            if (interfaceC2108y != null) {
                                obj2 = interfaceC2108y.b();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f15254g) {
                            c2060a.f15258f = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC2108y interfaceC2108y2 = this.f15256b;
                if (interfaceC2108y2 == null) {
                    return this.c;
                }
                try {
                    return interfaceC2108y2.b();
                } catch (IllegalStateException unused3) {
                    return this.c;
                } catch (SecurityException unused4) {
                    return this.c;
                }
            } finally {
            }
        }
    }
}
