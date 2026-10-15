package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final Q f6421a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f6422b;

    public O(Q q4, Q q5) {
        this.f6421a = q4;
        this.f6422b = q5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O.class == obj.getClass()) {
            O o4 = (O) obj;
            if (this.f6421a.equals(o4.f6421a) && this.f6422b.equals(o4.f6422b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6422b.hashCode() + (this.f6421a.hashCode() * 31);
    }

    public final String toString() {
        Q q4 = this.f6421a;
        String q5 = q4.toString();
        Q q6 = this.f6422b;
        return "[" + q5 + (q4.equals(q6) ? "" : ", ".concat(q6.toString())) + "]";
    }
}
