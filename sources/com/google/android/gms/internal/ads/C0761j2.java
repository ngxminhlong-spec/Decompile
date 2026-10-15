package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761j2 implements InterfaceC0720i2 {

    /* renamed from: a, reason: collision with root package name */
    public final D f9116a;

    /* renamed from: b, reason: collision with root package name */
    public final V f9117b;
    public final C0676h1 c;
    public final C0976o2 d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9118e;

    /* renamed from: f, reason: collision with root package name */
    public long f9119f;

    /* renamed from: g, reason: collision with root package name */
    public int f9120g;

    /* renamed from: h, reason: collision with root package name */
    public long f9121h;

    public C0761j2(D d, V v4, C0676h1 c0676h1, String str, int i4) {
        this.f9116a = d;
        this.f9117b = v4;
        this.c = c0676h1;
        int i5 = c0676h1.f8902a;
        int i6 = c0676h1.f8903b;
        int i7 = c0676h1.d * i5;
        int i8 = c0676h1.c;
        int i9 = i7 / 8;
        if (i8 != i9) {
            throw C0907md.a("Expected block size: " + i9 + "; got: " + i8, null);
        }
        int i10 = i6 * i9;
        int i11 = i10 * 8;
        int max = Math.max(i9, i10 / 10);
        this.f9118e = max;
        L1 l12 = new L1();
        l12.f6101j = str;
        l12.f6096e = i11;
        l12.f6097f = i11;
        l12.f6102k = max;
        l12.f6114w = i5;
        l12.f6115x = i6;
        l12.y = i4;
        this.d = new C0976o2(l12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0720i2
    public final void b(long j4) {
        this.f9119f = j4;
        this.f9120g = 0;
        this.f9121h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0720i2
    public final void d(int i4, long j4) {
        this.f9116a.B(new C0890m2(this.c, 1, i4, j4));
        this.f9117b.a(this.d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0720i2
    public final boolean e(C c, long j4) {
        int i4;
        int i5;
        long j5 = j4;
        while (j5 > 0 && (i4 = this.f9120g) < (i5 = this.f9118e)) {
            int e4 = this.f9117b.e(c, (int) Math.min(i5 - i4, j5), true);
            if (e4 == -1) {
                j5 = 0;
            } else {
                this.f9120g += e4;
                j5 -= e4;
            }
        }
        int i6 = this.f9120g;
        int i7 = this.c.c;
        int i8 = i6 / i7;
        if (i8 > 0) {
            long v4 = this.f9119f + AbstractC0751is.v(this.f9121h, 1000000L, r2.f8903b, RoundingMode.FLOOR);
            int i9 = i8 * i7;
            int i10 = this.f9120g - i9;
            this.f9117b.d(v4, 1, i9, i10, null);
            this.f9121h += i8;
            this.f9120g = i10;
        }
        return j5 <= 0;
    }
}
