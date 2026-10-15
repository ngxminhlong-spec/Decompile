package C1;

import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f470a;

    /* renamed from: b, reason: collision with root package name */
    public final long f471b;
    public final Set c;

    public c(long j4, long j5, Set set) {
        this.f470a = j4;
        this.f471b = j5;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f470a == cVar.f470a && this.f471b == cVar.f471b && this.c.equals(cVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f470a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j5 = this.f471b;
        return ((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f470a + ", maxAllowedDelay=" + this.f471b + ", flags=" + this.c + "}";
    }
}
