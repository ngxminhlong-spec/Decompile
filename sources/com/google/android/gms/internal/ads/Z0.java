package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z0 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f7950a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f7951b;
    public final long c;
    public final long d;

    public Z0(long[] jArr, long[] jArr2, long j4, long j5) {
        this.f7950a = jArr;
        this.f7951b = jArr2;
        this.c = j4;
        this.d = j5;
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final long a(long j4) {
        return this.f7950a[AbstractC0751is.k(this.f7951b, j4, true)];
    }

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        long[] jArr = this.f7950a;
        int k3 = AbstractC0751is.k(jArr, j4, true);
        long j5 = jArr[k3];
        long[] jArr2 = this.f7951b;
        Q q4 = new Q(j5, jArr2[k3]);
        if (j5 >= j4 || k3 == jArr.length - 1) {
            return new O(q4, q4);
        }
        int i4 = k3 + 1;
        return new O(q4, new Q(jArr[i4], jArr2[i4]));
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final long e() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        return true;
    }
}
