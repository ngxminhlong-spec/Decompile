package J3;

import java.io.Serializable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final Throwable f1031o;

    public d(Throwable th) {
        S3.e.e(th, "exception");
        this.f1031o = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return S3.e.a(this.f1031o, ((d) obj).f1031o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1031o.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1031o + ')';
    }
}
