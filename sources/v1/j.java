package v1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f15067a;

    public j(h hVar) {
        this.f15067a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f15080o;
        if (obj2.equals(obj2)) {
            return this.f15067a.equals(((j) qVar).f15067a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f15080o.hashCode() ^ 1000003) * 1000003) ^ this.f15067a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f15080o + ", androidClientInfo=" + this.f15067a + "}";
    }
}
