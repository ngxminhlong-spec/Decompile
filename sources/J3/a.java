package J3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: p, reason: collision with root package name */
    public static final a f1027p = new a();

    /* renamed from: o, reason: collision with root package name */
    public final int f1028o = 131093;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        S3.e.e(aVar, "other");
        return this.f1028o - aVar.f1028o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a aVar = obj instanceof a ? (a) obj : null;
        return aVar != null && this.f1028o == aVar.f1028o;
    }

    public final int hashCode() {
        return this.f1028o;
    }

    public final String toString() {
        return "2.0.21";
    }
}
