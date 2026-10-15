package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377a1 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8069a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8070b;
    public final long c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8071e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f8072f;

    public C0377a1(long j4, int i4, long j5, long j6, long[] jArr) {
        this.f8069a = j4;
        this.f8070b = i4;
        this.c = j5;
        this.f8072f = jArr;
        this.d = j6;
        this.f8071e = j6 != -1 ? j4 + j6 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final long a(long j4) {
        if (!f()) {
            return 0L;
        }
        long j5 = j4 - this.f8069a;
        if (j5 <= this.f8070b) {
            return 0L;
        }
        long[] jArr = this.f8072f;
        Zf.C(jArr);
        double d = (j5 * 256.0d) / this.d;
        int k3 = AbstractC0751is.k(jArr, (long) d, true);
        long j6 = this.c;
        long j7 = (k3 * j6) / 100;
        long j8 = jArr[k3];
        int i4 = k3 + 1;
        long j9 = (j6 * i4) / 100;
        return Math.round((j8 == (k3 == 99 ? 256L : jArr[i4]) ? 0.0d : (d - j8) / (r0 - j8)) * (j9 - j7)) + j7;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        double d;
        double d4;
        boolean f4 = f();
        int i4 = this.f8070b;
        long j5 = this.f8069a;
        if (!f4) {
            Q q4 = new Q(0L, j5 + i4);
            return new O(q4, q4);
        }
        long j6 = this.c;
        long max = Math.max(0L, Math.min(j4, j6));
        double d5 = (max * 100.0d) / j6;
        double d6 = 0.0d;
        if (d5 <= 0.0d) {
            d = 256.0d;
        } else if (d5 >= 100.0d) {
            d = 256.0d;
            d6 = 256.0d;
        } else {
            int i5 = (int) d5;
            long[] jArr = this.f8072f;
            Zf.C(jArr);
            double d7 = jArr[i5];
            if (i5 == 99) {
                d = 256.0d;
                d4 = 256.0d;
            } else {
                d = 256.0d;
                d4 = jArr[i5 + 1];
            }
            d6 = ((d4 - d7) * (d5 - i5)) + d7;
        }
        long j7 = this.d;
        Q q5 = new Q(max, Math.max(i4, Math.min(Math.round((d6 / d) * j7), j7 - 1)) + j5);
        return new O(q5, q5);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final long e() {
        return this.f8071e;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        return this.f8072f != null;
    }
}
