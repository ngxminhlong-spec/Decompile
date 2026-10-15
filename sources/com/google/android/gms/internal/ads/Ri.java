package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ri {

    /* renamed from: a, reason: collision with root package name */
    public final C0997oh f6827a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f6828b;
    public final boolean[] c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public Ri(C0997oh c0997oh, int[] iArr, boolean[] zArr) {
        this.f6827a = c0997oh;
        this.f6828b = (int[]) iArr.clone();
        this.c = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ri.class == obj.getClass()) {
            Ri ri = (Ri) obj;
            if (this.f6827a.equals(ri.f6827a) && Arrays.equals(this.f6828b, ri.f6828b) && Arrays.equals(this.c, ri.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.f6828b) + (this.f6827a.hashCode() * 961)) * 31);
    }
}
