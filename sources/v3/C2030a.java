package v3;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2030a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15091a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15092b;

    public C2030a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f15091a = str;
        this.f15092b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2030a)) {
            return false;
        }
        C2030a c2030a = (C2030a) obj;
        return this.f15091a.equals(c2030a.f15091a) && this.f15092b.equals(c2030a.f15092b);
    }

    public final int hashCode() {
        return ((this.f15091a.hashCode() ^ 1000003) * 1000003) ^ this.f15092b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15091a + ", usedDates=" + this.f15092b + "}";
    }
}
