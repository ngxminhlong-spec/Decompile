package x1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15248a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15249b;

    public a(int i4, long j4) {
        if (i4 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f15248a = i4;
        this.f15249b = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Z.e.a(this.f15248a, aVar.f15248a) && this.f15249b == aVar.f15249b;
    }

    public final int hashCode() {
        int b4 = (Z.e.b(this.f15248a) ^ 1000003) * 1000003;
        long j4 = this.f15249b;
        return b4 ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i4 = this.f15248a;
        sb.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f15249b);
        sb.append("}");
        return sb.toString();
    }
}
