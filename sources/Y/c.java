package Y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f2139a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2140b;
    public final int c;

    public c(int i4, long j4, long j5) {
        this.f2139a = j4;
        this.f2140b = j5;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2139a == cVar.f2139a && this.f2140b == cVar.f2140b && this.c == cVar.c;
    }

    public final int hashCode() {
        long j4 = this.f2139a;
        int i4 = ((int) (j4 ^ (j4 >>> 32))) * 31;
        long j5 = this.f2140b;
        return ((i4 + ((int) ((j5 >>> 32) ^ j5))) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f2139a);
        sb.append(", ModelVersion=");
        sb.append(this.f2140b);
        sb.append(", TopicCode=");
        return n0.a.k("Topic { ", U.a.l(sb, this.c, " }"));
    }
}
