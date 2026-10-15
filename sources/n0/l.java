package n0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final g f14095a;

    public l(g gVar) {
        this.f14095a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f14095a.equals(((l) obj).f14095a);
    }

    public final int hashCode() {
        return this.f14095a.hashCode() + (l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f14095a + '}';
    }
}
