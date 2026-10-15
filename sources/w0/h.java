package w0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f15113a;

    /* renamed from: b, reason: collision with root package name */
    public int f15114b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f15114b != hVar.f15114b) {
            return false;
        }
        return this.f15113a.equals(hVar.f15113a);
    }

    public final int hashCode() {
        return Z.e.b(this.f15114b) + (this.f15113a.hashCode() * 31);
    }
}
