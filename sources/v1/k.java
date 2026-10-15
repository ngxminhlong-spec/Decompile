package v1;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f15068a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f15069b;
    public final long c;
    public final byte[] d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15070e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15071f;

    /* renamed from: g, reason: collision with root package name */
    public final v f15072g;

    public k(long j4, Integer num, long j5, byte[] bArr, String str, long j6, v vVar) {
        this.f15068a = j4;
        this.f15069b = num;
        this.c = j5;
        this.d = bArr;
        this.f15070e = str;
        this.f15071f = j6;
        this.f15072g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f15072g;
            String str2 = kVar.f15070e;
            Integer num2 = kVar.f15069b;
            if (this.f15068a == kVar.f15068a && ((num = this.f15069b) != null ? num.equals(num2) : num2 == null) && this.c == kVar.c) {
                if (Arrays.equals(this.d, rVar instanceof k ? ((k) rVar).d : kVar.d) && ((str = this.f15070e) != null ? str.equals(str2) : str2 == null) && this.f15071f == kVar.f15071f && ((vVar = this.f15072g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f15068a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f15069b;
        int hashCode = (i4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j5 = this.c;
        int hashCode2 = (((hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f15070e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j6 = this.f15071f;
        int i5 = (hashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        v vVar = this.f15072g;
        return i5 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f15068a + ", eventCode=" + this.f15069b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.f15070e + ", timezoneOffsetSeconds=" + this.f15071f + ", networkConnectionInfo=" + this.f15072g + "}";
    }
}
