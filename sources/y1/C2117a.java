package y1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2117a implements I3.a {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f15908q = new Object();

    /* renamed from: o, reason: collision with root package name */
    public volatile b f15909o;

    /* renamed from: p, reason: collision with root package name */
    public volatile Object f15910p;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, y1.a, I3.a] */
    public static I3.a a(b bVar) {
        if (bVar instanceof C2117a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f15910p = f15908q;
        obj.f15909o = bVar;
        return obj;
    }

    @Override // I3.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f15910p;
        Object obj3 = f15908q;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f15910p;
                if (obj == obj3) {
                    obj = this.f15909o.get();
                    Object obj4 = this.f15910p;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f15910p = obj;
                    this.f15909o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
