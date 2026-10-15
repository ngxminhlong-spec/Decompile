package w1;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: w1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2045h {

    /* renamed from: a, reason: collision with root package name */
    public final String f15147a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f15148b;
    public final C2049l c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15149e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f15150f;

    public C2045h(String str, Integer num, C2049l c2049l, long j4, long j5, HashMap hashMap) {
        this.f15147a = str;
        this.f15148b = num;
        this.c = c2049l;
        this.d = j4;
        this.f15149e = j5;
        this.f15150f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15150f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15150f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final N1.l c() {
        N1.l lVar = new N1.l(6);
        String str = this.f15147a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        lVar.f1190q = str;
        lVar.f1189p = this.f15148b;
        C2049l c2049l = this.c;
        if (c2049l == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        lVar.f1191r = c2049l;
        lVar.f1192s = Long.valueOf(this.d);
        lVar.f1193t = Long.valueOf(this.f15149e);
        lVar.f1194u = new HashMap(this.f15150f);
        return lVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2045h) {
            C2045h c2045h = (C2045h) obj;
            Integer num2 = c2045h.f15148b;
            if (this.f15147a.equals(c2045h.f15147a) && ((num = this.f15148b) != null ? num.equals(num2) : num2 == null) && this.c.equals(c2045h.c) && this.d == c2045h.d && this.f15149e == c2045h.f15149e && this.f15150f.equals(c2045h.f15150f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f15147a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15148b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j4 = this.d;
        int i4 = (hashCode2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f15149e;
        return ((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.f15150f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15147a + ", code=" + this.f15148b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15149e + ", autoMetadata=" + this.f15150f + "}";
    }
}
