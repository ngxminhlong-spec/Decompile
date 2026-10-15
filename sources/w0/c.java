package w0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f15106a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f15107b;

    public c(String str, long j4) {
        this.f15106a = str;
        this.f15107b = Long.valueOf(j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Long l4 = cVar.f15107b;
        if (!this.f15106a.equals(cVar.f15106a)) {
            return false;
        }
        Long l5 = this.f15107b;
        return l5 != null ? l5.equals(l4) : l4 == null;
    }

    public final int hashCode() {
        int hashCode = this.f15106a.hashCode() * 31;
        Long l4 = this.f15107b;
        return hashCode + (l4 != null ? l4.hashCode() : 0);
    }
}
