package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542dx extends AbstractC0970nx {

    /* renamed from: a, reason: collision with root package name */
    public final int f8527a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8528b;
    public final Iv c;

    public C0542dx(int i4, int i5, Iv iv) {
        this.f8527a = i4;
        this.f8528b = i5;
        this.c = iv;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1054pv
    public final boolean a() {
        return this.c != Iv.f5759K;
    }

    public final int b() {
        Iv iv = Iv.f5759K;
        int i4 = this.f8528b;
        Iv iv2 = this.c;
        if (iv2 == iv) {
            return i4;
        }
        if (iv2 == Iv.f5756H || iv2 == Iv.f5757I || iv2 == Iv.f5758J) {
            return i4 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0542dx)) {
            return false;
        }
        C0542dx c0542dx = (C0542dx) obj;
        return c0542dx.f8527a == this.f8527a && c0542dx.b() == b() && c0542dx.c == this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C0542dx.class, Integer.valueOf(this.f8527a), Integer.valueOf(this.f8528b), this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(this.f8528b);
        sb.append("-byte tags, and ");
        return U.a.l(sb, this.f8527a, "-byte key)");
    }
}
