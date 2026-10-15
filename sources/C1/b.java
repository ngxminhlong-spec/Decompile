package C1;

import java.util.HashMap;
import t1.EnumC1992c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final F1.a f468a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f469b;

    public b(F1.a aVar, HashMap hashMap) {
        this.f468a = aVar;
        this.f469b = hashMap;
    }

    public final long a(EnumC1992c enumC1992c, long j4, int i4) {
        long c = j4 - this.f468a.c();
        c cVar = (c) this.f469b.get(enumC1992c);
        long j5 = cVar.f470a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i4 - 1) * j5 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j5 > 1 ? j5 : 2L) * r12))), c), cVar.f471b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f468a.equals(bVar.f468a) && this.f469b.equals(bVar.f469b);
    }

    public final int hashCode() {
        return ((this.f468a.hashCode() ^ 1000003) * 1000003) ^ this.f469b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f468a + ", values=" + this.f469b + "}";
    }
}
