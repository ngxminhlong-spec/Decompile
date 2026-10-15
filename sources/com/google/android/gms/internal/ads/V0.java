package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V0 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f7213a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f7214b;
    public final long c;

    public V0(long j4, long[] jArr, long[] jArr2) {
        this.f7213a = jArr;
        this.f7214b = jArr2;
        this.c = j4 == -9223372036854775807L ? AbstractC0751is.t(jArr2[jArr2.length - 1]) : j4;
    }

    public static Pair d(long j4, long[] jArr, long[] jArr2) {
        int k3 = AbstractC0751is.k(jArr, j4, true);
        long j5 = jArr[k3];
        long j6 = jArr2[k3];
        int i4 = k3 + 1;
        if (i4 == jArr.length) {
            return Pair.create(Long.valueOf(j5), Long.valueOf(j6));
        }
        return Pair.create(Long.valueOf(j4), Long.valueOf(((long) ((jArr[i4] == j5 ? 0.0d : (j4 - j5) / (r6 - j5)) * (jArr2[i4] - j6))) + j6));
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final long a(long j4) {
        return AbstractC0751is.t(((Long) d(j4, this.f7213a, this.f7214b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        Pair d = d(AbstractC0751is.w(Math.max(0L, Math.min(j4, this.c))), this.f7214b, this.f7213a);
        Q q4 = new Q(AbstractC0751is.t(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new O(q4, q4);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final long e() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        return true;
    }
}
