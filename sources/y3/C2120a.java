package y3;

import Z.e;
import com.google.android.gms.internal.ads.Z8;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2120a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15913a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15914b;
    public final String c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15915e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15916f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15917g;

    public C2120a(String str, int i4, String str2, String str3, long j4, long j5, String str4) {
        this.f15913a = str;
        this.f15914b = i4;
        this.c = str2;
        this.d = str3;
        this.f15915e = j4;
        this.f15916f = j5;
        this.f15917g = str4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.Z8] */
    public final Z8 a() {
        ?? obj = new Object();
        obj.f7964a = this.f15913a;
        obj.f7965b = this.f15914b;
        obj.c = this.c;
        obj.d = this.d;
        obj.f7966e = Long.valueOf(this.f15915e);
        obj.f7967f = Long.valueOf(this.f15916f);
        obj.f7968g = this.f15917g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2120a)) {
            return false;
        }
        C2120a c2120a = (C2120a) obj;
        String str = c2120a.f15917g;
        String str2 = c2120a.d;
        String str3 = c2120a.c;
        String str4 = c2120a.f15913a;
        String str5 = this.f15913a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!e.a(this.f15914b, c2120a.f15914b)) {
            return false;
        }
        String str6 = this.c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f15915e != c2120a.f15915e || this.f15916f != c2120a.f15916f) {
            return false;
        }
        String str8 = this.f15917g;
        return str8 == null ? str == null : str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f15913a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ e.b(this.f15914b)) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j4 = this.f15915e;
        int i4 = (hashCode3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f15916f;
        int i5 = (i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        String str4 = this.f15917g;
        return (str4 != null ? str4.hashCode() : 0) ^ i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f15913a);
        sb.append(", registrationStatus=");
        int i4 = this.f15914b;
        sb.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.f15915e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f15916f);
        sb.append(", fisError=");
        return n0.a.j(sb, this.f15917g, "}");
    }
}
