package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273v implements P {

    /* renamed from: a, reason: collision with root package name */
    public final int f10958a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10959b;
    public final long[] c;
    public final long[] d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f10960e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10961f;

    public C1273v(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f10959b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.f10960e = jArr3;
        int length = iArr.length;
        this.f10958a = length;
        if (length <= 0) {
            this.f10961f = 0L;
        } else {
            int i4 = length - 1;
            this.f10961f = jArr2[i4] + jArr3[i4];
        }
    }

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        return this.f10961f;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        long[] jArr = this.f10960e;
        int k3 = AbstractC0751is.k(jArr, j4, true);
        long j5 = jArr[k3];
        long[] jArr2 = this.c;
        Q q4 = new Q(j5, jArr2[k3]);
        if (j5 >= j4 || k3 == this.f10958a - 1) {
            return new O(q4, q4);
        }
        int i4 = k3 + 1;
        return new O(q4, new Q(jArr[i4], jArr2[i4]));
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        return true;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f10959b);
        String arrays2 = Arrays.toString(this.c);
        String arrays3 = Arrays.toString(this.f10960e);
        String arrays4 = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.f10958a);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        return n0.a.j(sb, arrays4, ")");
    }
}
