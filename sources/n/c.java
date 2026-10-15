package n;

import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: o, reason: collision with root package name */
    public final Object f14060o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f14061p;

    /* renamed from: q, reason: collision with root package name */
    public c f14062q;

    /* renamed from: r, reason: collision with root package name */
    public c f14063r;

    public c(Object obj, Object obj2) {
        this.f14060o = obj;
        this.f14061p = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14060o.equals(cVar.f14060o) && this.f14061p.equals(cVar.f14061p);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14060o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14061p;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f14060o.hashCode() ^ this.f14061p.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f14060o + "=" + this.f14061p;
    }
}
