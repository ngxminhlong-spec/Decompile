package S3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Class f1789a;

    public g(Class cls) {
        this.f1789a = cls;
    }

    @Override // S3.b
    public final Class a() {
        return this.f1789a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return e.a(this.f1789a, ((g) obj).f1789a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1789a.hashCode();
    }

    public final String toString() {
        return this.f1789a.toString() + " (Kotlin reflection is not available)";
    }
}
