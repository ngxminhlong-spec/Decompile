package v1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f15078a;

    /* renamed from: b, reason: collision with root package name */
    public final t f15079b;

    public n(u uVar, t tVar) {
        this.f15078a = uVar;
        this.f15079b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f15078a;
            if (uVar != null ? uVar.equals(((n) vVar).f15078a) : ((n) vVar).f15078a == null) {
                t tVar = this.f15079b;
                if (tVar != null ? tVar.equals(((n) vVar).f15079b) : ((n) vVar).f15079b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f15078a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f15079b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f15078a + ", mobileSubtype=" + this.f15079b + "}";
    }
}
