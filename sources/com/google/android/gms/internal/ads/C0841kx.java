package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841kx extends AbstractC0970nx {

    /* renamed from: a, reason: collision with root package name */
    public final int f9336a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9337b;
    public final C0798jx c;
    public final C0755ix d;

    public C0841kx(int i4, int i5, C0798jx c0798jx, C0755ix c0755ix) {
        this.f9336a = i4;
        this.f9337b = i5;
        this.c = c0798jx;
        this.d = c0755ix;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1054pv
    public final boolean a() {
        return this.c != C0798jx.f9234e;
    }

    public final int b() {
        C0798jx c0798jx = C0798jx.f9234e;
        int i4 = this.f9337b;
        C0798jx c0798jx2 = this.c;
        if (c0798jx2 == c0798jx) {
            return i4;
        }
        if (c0798jx2 == C0798jx.f9233b || c0798jx2 == C0798jx.c || c0798jx2 == C0798jx.d) {
            return i4 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0841kx)) {
            return false;
        }
        C0841kx c0841kx = (C0841kx) obj;
        return c0841kx.f9336a == this.f9336a && c0841kx.b() == b() && c0841kx.c == this.c && c0841kx.d == this.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C0841kx.class, Integer.valueOf(this.f9336a), Integer.valueOf(this.f9337b), this.c, this.d});
    }

    public final String toString() {
        StringBuilder n4 = U.a.n("HMAC Parameters (variant: ", String.valueOf(this.c), ", hashType: ", String.valueOf(this.d), ", ");
        n4.append(this.f9337b);
        n4.append("-byte tags, and ");
        return U.a.l(n4, this.f9336a, "-byte key)");
    }
}
