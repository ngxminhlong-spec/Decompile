package v1;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f15073a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15074b;
    public final j c;
    public final Integer d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15075e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f15076f;

    public l(long j4, long j5, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f15086o;
        this.f15073a = j4;
        this.f15074b = j5;
        this.c = jVar;
        this.d = num;
        this.f15075e = str;
        this.f15076f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        Object obj2 = w.f15086o;
        ArrayList arrayList = lVar.f15076f;
        String str = lVar.f15075e;
        Integer num = lVar.d;
        j jVar = lVar.c;
        if (this.f15073a != lVar.f15073a || this.f15074b != lVar.f15074b || !this.c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f15075e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f15076f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j4 = this.f15073a;
        long j5 = this.f15074b;
        int hashCode = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f15075e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f15076f.hashCode()) * 1000003) ^ w.f15086o.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f15073a + ", requestUptimeMs=" + this.f15074b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.f15075e + ", logEvents=" + this.f15076f + ", qosTier=" + w.f15086o + "}";
    }
}
