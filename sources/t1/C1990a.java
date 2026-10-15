package t1;

import com.google.android.gms.internal.play_billing.P0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1990a {

    /* renamed from: a, reason: collision with root package name */
    public final P0 f14842a;

    public C1990a(P0 p02) {
        this.f14842a = p02;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1990a) || !this.f14842a.equals(((C1990a) obj).f14842a)) {
            return false;
        }
        Object obj2 = EnumC1992c.f14844o;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return EnumC1992c.f14844o.hashCode() ^ (((1000003 * 1000003) ^ this.f14842a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f14842a + ", priority=" + EnumC1992c.f14844o + "}";
    }
}
