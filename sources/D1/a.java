package D1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f644f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f645a;

    /* renamed from: b, reason: collision with root package name */
    public final int f646b;
    public final int c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final int f647e;

    public a(long j4, int i4, int i5, long j5, int i6) {
        this.f645a = j4;
        this.f646b = i4;
        this.c = i5;
        this.d = j5;
        this.f647e = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f645a == aVar.f645a && this.f646b == aVar.f646b && this.c == aVar.c && this.d == aVar.d && this.f647e == aVar.f647e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f645a;
        int i4 = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f646b) * 1000003) ^ this.c) * 1000003;
        long j5 = this.d;
        return ((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.f647e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f645a);
        sb.append(", loadBatchSize=");
        sb.append(this.f646b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return U.a.l(sb, this.f647e, "}");
    }
}
