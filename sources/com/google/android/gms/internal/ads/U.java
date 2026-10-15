package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final int f7102a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7103b;
    public final int c;
    public final int d;

    public U(int i4, int i5, int i6, byte[] bArr) {
        this.f7102a = i4;
        this.f7103b = bArr;
        this.c = i5;
        this.d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && U.class == obj.getClass()) {
            U u2 = (U) obj;
            if (this.f7102a == u2.f7102a && this.c == u2.c && this.d == u2.d && Arrays.equals(this.f7103b, u2.f7103b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f7103b) + (this.f7102a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
