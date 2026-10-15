package q3;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f14714a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f14715b;

    public c(String str, Map map) {
        this.f14714a = str;
        this.f14715b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14714a.equals(cVar.f14714a) && this.f14715b.equals(cVar.f14715b);
    }

    public final int hashCode() {
        return this.f14715b.hashCode() + (this.f14714a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f14714a + ", properties=" + this.f14715b.values() + "}";
    }
}
