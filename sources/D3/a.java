package D3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f670a;

    /* renamed from: b, reason: collision with root package name */
    public final String f671b;

    public a(String str, String str2) {
        this.f670a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f671b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f670a.equals(aVar.f670a) && this.f671b.equals(aVar.f671b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f670a.hashCode() ^ 1000003) * 1000003) ^ this.f671b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f670a);
        sb.append(", version=");
        return n0.a.j(sb, this.f671b, "}");
    }
}
