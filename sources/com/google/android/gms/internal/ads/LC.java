package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class LC {
    public static final LC c;

    /* renamed from: a, reason: collision with root package name */
    public final long f6134a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6135b;

    static {
        LC lc = new LC(0L, 0L);
        new LC(Long.MAX_VALUE, Long.MAX_VALUE);
        new LC(Long.MAX_VALUE, 0L);
        new LC(0L, Long.MAX_VALUE);
        c = lc;
    }

    public LC(long j4, long j5) {
        Zf.O(j4 >= 0);
        Zf.O(j5 >= 0);
        this.f6134a = j4;
        this.f6135b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LC.class == obj.getClass()) {
            LC lc = (LC) obj;
            if (this.f6134a == lc.f6134a && this.f6135b == lc.f6135b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6134a) * 31) + ((int) this.f6135b);
    }
}
