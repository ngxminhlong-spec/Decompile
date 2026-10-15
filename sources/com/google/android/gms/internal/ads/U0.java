package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U0 implements Y0, P {

    /* renamed from: a, reason: collision with root package name */
    public final long f7104a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7105b;
    public final int c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7106e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7107f;

    public U0(long j4, long j5, M m4) {
        long max;
        int i4 = m4.f6187e;
        int i5 = m4.f6186b;
        this.f7104a = j4;
        this.f7105b = j5;
        this.c = i5 == -1 ? 1 : i5;
        this.f7106e = i4;
        if (j4 == -1) {
            this.d = -1L;
            max = -9223372036854775807L;
        } else {
            long j6 = j4 - j5;
            this.d = j6;
            max = (Math.max(0L, j6) * 8000000) / i4;
        }
        this.f7107f = max;
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final long a(long j4) {
        return (Math.max(0L, j4 - this.f7105b) * 8000000) / this.f7106e;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        return this.f7107f;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        long j5 = this.d;
        long j6 = this.f7105b;
        if (j5 == -1) {
            Q q4 = new Q(0L, j6);
            return new O(q4, q4);
        }
        int i4 = this.f7106e;
        long j7 = this.c;
        long j8 = (((i4 * j4) / 8000000) / j7) * j7;
        if (j5 != -1) {
            j8 = Math.min(j8, j5 - j7);
        }
        long max = Math.max(j8, 0L) + j6;
        long max2 = (Math.max(0L, max - j6) * 8000000) / i4;
        Q q5 = new Q(max2, max);
        if (j5 != -1 && max2 < j4) {
            long j9 = max + j7;
            if (j9 < this.f7104a) {
                return new O(q5, new Q((Math.max(0L, j9 - j6) * 8000000) / i4, j9));
            }
        }
        return new O(q5, q5);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final long e() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        return this.d != -1;
    }
}
