package w0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f15108a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15109b;

    public d(String str, int i4) {
        this.f15108a = str;
        this.f15109b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f15109b != dVar.f15109b) {
            return false;
        }
        return this.f15108a.equals(dVar.f15108a);
    }

    public final int hashCode() {
        return (this.f15108a.hashCode() * 31) + this.f15109b;
    }
}
