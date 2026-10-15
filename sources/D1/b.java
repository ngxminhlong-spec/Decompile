package D1;

import w1.C2045h;
import w1.C2046i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f648a;

    /* renamed from: b, reason: collision with root package name */
    public final C2046i f649b;
    public final C2045h c;

    public b(long j4, C2046i c2046i, C2045h c2045h) {
        this.f648a = j4;
        this.f649b = c2046i;
        this.c = c2045h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f648a == bVar.f648a && this.f649b.equals(bVar.f649b) && this.c.equals(bVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f648a;
        return ((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f649b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f648a + ", transportContext=" + this.f649b + ", event=" + this.c + "}";
    }
}
