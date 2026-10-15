package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0846l1 {

    /* renamed from: a, reason: collision with root package name */
    public final V f9348a;
    public C1189t1 d;

    /* renamed from: e, reason: collision with root package name */
    public C0760j1 f9350e;

    /* renamed from: f, reason: collision with root package name */
    public int f9351f;

    /* renamed from: g, reason: collision with root package name */
    public int f9352g;

    /* renamed from: h, reason: collision with root package name */
    public int f9353h;

    /* renamed from: i, reason: collision with root package name */
    public int f9354i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9357l;

    /* renamed from: b, reason: collision with root package name */
    public final C1146s1 f9349b = new C1146s1();
    public final C1134rq c = new C1134rq();

    /* renamed from: j, reason: collision with root package name */
    public final C1134rq f9355j = new C1134rq(1);

    /* renamed from: k, reason: collision with root package name */
    public final C1134rq f9356k = new C1134rq();

    public C0846l1(V v4, C1189t1 c1189t1, C0760j1 c0760j1) {
        this.f9348a = v4;
        this.d = c1189t1;
        this.f9350e = c0760j1;
        this.d = c1189t1;
        this.f9350e = c0760j1;
        v4.a(c1189t1.f10661a.f10073f);
        c();
    }

    public final int a(int i4, int i5) {
        C1134rq c1134rq;
        C1103r1 b4 = b();
        if (b4 == null) {
            return 0;
        }
        int i6 = b4.d;
        C1146s1 c1146s1 = this.f9349b;
        if (i6 != 0) {
            c1134rq = c1146s1.f10573n;
        } else {
            byte[] bArr = b4.f10449e;
            int i7 = AbstractC0751is.f9071a;
            i6 = bArr.length;
            C1134rq c1134rq2 = this.f9356k;
            c1134rq2.c(i6, bArr);
            c1134rq = c1134rq2;
        }
        boolean z4 = c1146s1.f10570k && c1146s1.f10571l[this.f9351f];
        boolean z5 = z4 || i5 != 0;
        int i8 = true != z5 ? 0 : 128;
        C1134rq c1134rq3 = this.f9355j;
        c1134rq3.f10536a[0] = (byte) (i8 | i6);
        c1134rq3.e(0);
        V v4 = this.f9348a;
        v4.c(1, c1134rq3);
        v4.c(i6, c1134rq);
        if (!z5) {
            return i6 + 1;
        }
        C1134rq c1134rq4 = this.c;
        if (!z4) {
            c1134rq4.b(8);
            byte[] bArr2 = c1134rq4.f10536a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i5;
            bArr2[4] = (byte) ((i4 >> 24) & 255);
            bArr2[5] = (byte) ((i4 >> 16) & 255);
            bArr2[6] = (byte) ((i4 >> 8) & 255);
            bArr2[7] = (byte) (i4 & 255);
            v4.c(8, c1134rq4);
            return i6 + 9;
        }
        int i9 = i6 + 1;
        C1134rq c1134rq5 = c1146s1.f10573n;
        int q4 = c1134rq5.q();
        c1134rq5.f(-2);
        int i10 = (q4 * 6) + 2;
        if (i5 != 0) {
            c1134rq4.b(i10);
            byte[] bArr3 = c1134rq4.f10536a;
            c1134rq5.a(bArr3, 0, i10);
            int i11 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i5;
            bArr3[2] = (byte) ((i11 >> 8) & 255);
            bArr3[3] = (byte) (i11 & 255);
        } else {
            c1134rq4 = c1134rq5;
        }
        v4.c(i10, c1134rq4);
        return i9 + i10;
    }

    public final C1103r1 b() {
        if (!this.f9357l) {
            return null;
        }
        C1146s1 c1146s1 = this.f9349b;
        C0760j1 c0760j1 = c1146s1.f10562a;
        int i4 = AbstractC0751is.f9071a;
        int i5 = c0760j1.f9114a;
        C1103r1 c1103r1 = c1146s1.f10572m;
        if (c1103r1 == null) {
            c1103r1 = this.d.f10661a.f10078k[i5];
        }
        if (c1103r1 == null || !c1103r1.f10447a) {
            return null;
        }
        return c1103r1;
    }

    public final void c() {
        C1146s1 c1146s1 = this.f9349b;
        c1146s1.d = 0;
        c1146s1.f10575p = 0L;
        c1146s1.f10576q = false;
        c1146s1.f10570k = false;
        c1146s1.f10574o = false;
        c1146s1.f10572m = null;
        this.f9351f = 0;
        this.f9353h = 0;
        this.f9352g = 0;
        this.f9354i = 0;
        this.f9357l = false;
    }

    public final boolean d() {
        this.f9351f++;
        if (!this.f9357l) {
            return false;
        }
        int i4 = this.f9352g + 1;
        this.f9352g = i4;
        int[] iArr = this.f9349b.f10566g;
        int i5 = this.f9353h;
        if (i4 != iArr[i5]) {
            return true;
        }
        this.f9353h = i5 + 1;
        this.f9352g = 0;
        return false;
    }
}
