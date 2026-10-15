package J3;

import java.io.Serializable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final Object f1029o;

    /* renamed from: p, reason: collision with root package name */
    public final Serializable f1030p;

    public c(Serializable serializable, Serializable serializable2) {
        this.f1029o = serializable;
        this.f1030p = serializable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return S3.e.a(this.f1029o, cVar.f1029o) && this.f1030p.equals(cVar.f1030p);
    }

    public final int hashCode() {
        Object obj = this.f1029o;
        return this.f1030p.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "(" + this.f1029o + ", " + this.f1030p + ')';
    }
}
