package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232u1 implements P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1275v1 f10770a;

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        C1275v1 c1275v1 = this.f10770a;
        C1 c12 = c1275v1.f10973r;
        return (c1275v1.f10975t * 1000000) / c12.f4221i;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        C1275v1 c1275v1 = this.f10770a;
        long j5 = c1275v1.f10971p;
        BigInteger valueOf = BigInteger.valueOf((c1275v1.f10973r.f4221i * j4) / 1000000);
        Q q4 = new Q(j4, Math.max(j5, Math.min((valueOf.multiply(BigInteger.valueOf(r5 - j5)).divide(BigInteger.valueOf(c1275v1.f10975t)).longValue() + j5) - 30000, c1275v1.f10972q - 1)));
        return new O(q4, q4);
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        return true;
    }
}
