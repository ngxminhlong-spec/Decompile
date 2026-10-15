package d3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1653a {

    /* renamed from: a, reason: collision with root package name */
    public final long f12602a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12603b;
    public final long c;

    public C1653a(long j4, long j5, long j6) {
        this.f12602a = j4;
        this.f12603b = j5;
        this.c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1653a) {
            C1653a c1653a = (C1653a) obj;
            if (this.f12602a == c1653a.f12602a && this.f12603b == c1653a.f12603b && this.c == c1653a.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f12602a;
        long j5 = this.f12603b;
        int i4 = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.c;
        return i4 ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f12602a + ", elapsedRealtime=" + this.f12603b + ", uptimeMillis=" + this.c + "}";
    }
}
