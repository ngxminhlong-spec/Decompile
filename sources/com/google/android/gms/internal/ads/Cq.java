package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Cq {
    public static final Cq c = new Cq(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f4553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4554b;

    static {
        new Cq(0, 0);
    }

    public Cq(int i4, int i5) {
        boolean z4 = false;
        if ((i4 == -1 || i4 >= 0) && (i5 == -1 || i5 >= 0)) {
            z4 = true;
        }
        Zf.O(z4);
        this.f4553a = i4;
        this.f4554b = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cq) {
            Cq cq = (Cq) obj;
            if (this.f4553a == cq.f4553a && this.f4554b == cq.f4554b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f4553a;
        return ((i4 >>> 16) | (i4 << 16)) ^ this.f4554b;
    }

    public final String toString() {
        return this.f4553a + "x" + this.f4554b;
    }
}
