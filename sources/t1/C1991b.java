package t1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1991b {

    /* renamed from: a, reason: collision with root package name */
    public final String f14843a;

    public C1991b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f14843a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1991b)) {
            return false;
        }
        return this.f14843a.equals(((C1991b) obj).f14843a);
    }

    public final int hashCode() {
        return this.f14843a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return n0.a.j(new StringBuilder("Encoding{name=\""), this.f14843a, "\"}");
    }
}
