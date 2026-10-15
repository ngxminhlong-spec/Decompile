package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L implements P {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f6082a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f6083b;
    public final long c;
    public final boolean d;

    public L(long j4, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        Zf.O(length == length2);
        boolean z4 = length2 > 0;
        this.d = z4;
        if (!z4 || jArr2[0] <= 0) {
            this.f6082a = jArr;
            this.f6083b = jArr2;
        } else {
            int i4 = length2 + 1;
            long[] jArr3 = new long[i4];
            this.f6082a = jArr3;
            long[] jArr4 = new long[i4];
            this.f6083b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.c = j4;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        if (!this.d) {
            Q q4 = Q.c;
            return new O(q4, q4);
        }
        long[] jArr = this.f6083b;
        int k3 = AbstractC0751is.k(jArr, j4, true);
        long j5 = jArr[k3];
        long[] jArr2 = this.f6082a;
        Q q5 = new Q(j5, jArr2[k3]);
        if (j5 == j4 || k3 == jArr.length - 1) {
            return new O(q5, q5);
        }
        int i4 = k3 + 1;
        return new O(q5, new Q(jArr[i4], jArr2[i4]));
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        return this.d;
    }
}
