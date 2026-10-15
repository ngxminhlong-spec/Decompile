package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Q {
    public static final Q c = new Q(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f6626a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6627b;

    public Q(long j4, long j5) {
        this.f6626a = j4;
        this.f6627b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q.class == obj.getClass()) {
            Q q4 = (Q) obj;
            if (this.f6626a == q4.f6626a && this.f6627b == q4.f6627b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6626a) * 31) + ((int) this.f6627b);
    }

    public final String toString() {
        return "[timeUs=" + this.f6626a + ", position=" + this.f6627b + "]";
    }
}
