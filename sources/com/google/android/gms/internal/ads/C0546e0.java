package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546e0 {

    /* renamed from: a, reason: collision with root package name */
    public final V f8533a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8534b;
    public final int c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8535e;

    /* renamed from: f, reason: collision with root package name */
    public int f8536f;

    /* renamed from: g, reason: collision with root package name */
    public int f8537g;

    /* renamed from: h, reason: collision with root package name */
    public int f8538h;

    /* renamed from: i, reason: collision with root package name */
    public int f8539i;

    /* renamed from: j, reason: collision with root package name */
    public int f8540j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f8541k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f8542l;

    public C0546e0(int i4, int i5, long j4, int i6, V v4) {
        i5 = i5 != 1 ? 2 : i5;
        this.d = j4;
        this.f8535e = i6;
        this.f8533a = v4;
        int i7 = (((i4 % 10) + 48) << 8) | ((i4 / 10) + 48);
        this.f8534b = (i5 == 2 ? 1667497984 : 1651965952) | i7;
        this.c = i5 == 2 ? i7 | 1650720768 : -1;
        this.f8541k = new long[512];
        this.f8542l = new int[512];
    }

    public final O a(long j4) {
        int i4 = (int) (j4 / ((this.d * 1) / this.f8535e));
        int j5 = AbstractC0751is.j(this.f8542l, i4, true, true);
        if (this.f8542l[j5] == i4) {
            Q b4 = b(j5);
            return new O(b4, b4);
        }
        Q b5 = b(j5);
        int i5 = j5 + 1;
        return i5 < this.f8541k.length ? new O(b5, b(i5)) : new O(b5, b5);
    }

    public final Q b(int i4) {
        return new Q(((this.d * 1) / this.f8535e) * this.f8542l[i4], this.f8541k[i4]);
    }
}
