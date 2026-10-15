package z3;

import Z.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2135b {

    /* renamed from: a, reason: collision with root package name */
    public final String f15981a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15982b;
    public final int c;

    public C2135b(int i4, long j4, String str) {
        this.f15981a = str;
        this.f15982b = j4;
        this.c = i4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.c, java.lang.Object] */
    public static androidx.activity.result.c a() {
        ?? obj = new Object();
        obj.c = 0L;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2135b)) {
            return false;
        }
        C2135b c2135b = (C2135b) obj;
        int i4 = c2135b.c;
        String str = c2135b.f15981a;
        String str2 = this.f15981a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f15982b != c2135b.f15982b) {
            return false;
        }
        int i5 = this.c;
        return i5 == 0 ? i4 == 0 : e.a(i5, i4);
    }

    public final int hashCode() {
        String str = this.f15981a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j4 = this.f15982b;
        int i4 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        int i5 = this.c;
        return (i5 != 0 ? e.b(i5) : 0) ^ i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f15981a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f15982b);
        sb.append(", responseCode=");
        int i4 = this.c;
        sb.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
