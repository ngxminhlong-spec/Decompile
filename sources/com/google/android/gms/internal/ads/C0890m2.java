package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890m2 implements P {

    /* renamed from: a, reason: collision with root package name */
    public final C0676h1 f9557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9558b;
    public final long c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9559e;

    public C0890m2(C0676h1 c0676h1, int i4, long j4, long j5) {
        this.f9557a = c0676h1;
        this.f9558b = i4;
        this.c = j4;
        long j6 = (j5 - j4) / c0676h1.c;
        this.d = j6;
        this.f9559e = d(j6);
    }

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        return this.f9559e;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        long j5 = this.f9558b;
        C0676h1 c0676h1 = this.f9557a;
        long j6 = (c0676h1.f8903b * j4) / (j5 * 1000000);
        long j7 = this.d;
        long max = Math.max(0L, Math.min(j6, j7 - 1));
        long d = d(max);
        long j8 = this.c;
        Q q4 = new Q(d, (c0676h1.c * max) + j8);
        if (d >= j4 || max == j7 - 1) {
            return new O(q4, q4);
        }
        long j9 = max + 1;
        return new O(q4, new Q(d(j9), (j9 * c0676h1.c) + j8));
    }

    public final long d(long j4) {
        return AbstractC0751is.v(j4 * this.f9558b, 1000000L, this.f9557a.f8903b, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        return true;
    }
}
