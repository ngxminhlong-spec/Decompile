package z3;

import Z.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2134a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15978a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15979b;
    public final String c;
    public final C2135b d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15980e;

    public C2134a(String str, String str2, String str3, C2135b c2135b, int i4) {
        this.f15978a = str;
        this.f15979b = str2;
        this.c = str3;
        this.d = c2135b;
        this.f15980e = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2134a)) {
            return false;
        }
        C2134a c2134a = (C2134a) obj;
        int i4 = c2134a.f15980e;
        C2135b c2135b = c2134a.d;
        String str = c2134a.c;
        String str2 = c2134a.f15979b;
        String str3 = c2134a.f15978a;
        String str4 = this.f15978a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f15979b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        C2135b c2135b2 = this.d;
        if (c2135b2 == null) {
            if (c2135b != null) {
                return false;
            }
        } else if (!c2135b2.equals(c2135b)) {
            return false;
        }
        int i5 = this.f15980e;
        return i5 == 0 ? i4 == 0 : e.a(i5, i4);
    }

    public final int hashCode() {
        String str = this.f15978a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f15979b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C2135b c2135b = this.d;
        int hashCode4 = (hashCode3 ^ (c2135b == null ? 0 : c2135b.hashCode())) * 1000003;
        int i4 = this.f15980e;
        return (i4 != 0 ? e.b(i4) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f15978a);
        sb.append(", fid=");
        sb.append(this.f15979b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i4 = this.f15980e;
        sb.append(i4 != 1 ? i4 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
