package t2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E implements H {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f14859q = new Object();

    /* renamed from: o, reason: collision with root package name */
    public volatile F f14860o;

    /* renamed from: p, reason: collision with root package name */
    public volatile Object f14861p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [t2.E, java.lang.Object] */
    public static E a(F f4) {
        if (f4 instanceof E) {
            return (E) f4;
        }
        ?? obj = new Object();
        obj.f14861p = f14859q;
        obj.f14860o = f4;
        return obj;
    }

    @Override // t2.H
    public final Object c() {
        Object obj;
        Object obj2 = this.f14861p;
        Object obj3 = f14859q;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f14861p;
                if (obj == obj3) {
                    obj = this.f14860o.c();
                    Object obj4 = this.f14861p;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f14861p = obj;
                    this.f14860o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
