package b0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188a {

    /* renamed from: a, reason: collision with root package name */
    public int f3228a;

    /* renamed from: b, reason: collision with root package name */
    public int f3229b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C0188a.class != obj.getClass()) {
                return false;
            }
            C0188a c0188a = (C0188a) obj;
            int i4 = this.f3228a;
            if (i4 != c0188a.f3228a) {
                return false;
            }
            if (i4 != 8 || Math.abs(this.d - this.f3229b) != 1 || this.d != c0188a.f3229b || this.f3229b != c0188a.d) {
                if (this.d != c0188a.d || this.f3229b != c0188a.f3229b) {
                    return false;
                }
                Object obj2 = this.c;
                if (obj2 != null) {
                    if (!obj2.equals(c0188a.c)) {
                        return false;
                    }
                } else if (c0188a.c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f3228a * 31) + this.f3229b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i4 = this.f3228a;
        sb.append(i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f3229b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
