package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1134rq {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f10536a;

    /* renamed from: b, reason: collision with root package name */
    public int f10537b;
    public int c;

    static {
        AbstractC1266ut.t(5, AbstractC1480zs.f11691a, AbstractC1480zs.c, AbstractC1480zs.f11694f, AbstractC1480zs.d, AbstractC1480zs.f11693e);
    }

    public C1134rq() {
        this.f10536a = AbstractC0751is.f9074f;
    }

    public C1134rq(int i4) {
        this.f10536a = new byte[i4];
        this.c = i4;
    }

    public C1134rq(int i4, byte[] bArr) {
        this.f10536a = bArr;
        this.c = i4;
    }

    public C1134rq(byte[] bArr) {
        this.f10536a = bArr;
        this.c = bArr.length;
    }

    public final short A() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        int i6 = bArr[i4] & 255;
        this.f10537b = i4 + 2;
        return (short) ((bArr[i5] & 255) | (i6 << 8));
    }

    public final void a(byte[] bArr, int i4, int i5) {
        System.arraycopy(this.f10536a, this.f10537b, bArr, i4, i5);
        this.f10537b += i5;
    }

    public final void b(int i4) {
        byte[] bArr = this.f10536a;
        if (bArr.length < i4) {
            bArr = new byte[i4];
        }
        c(i4, bArr);
    }

    public final void c(int i4, byte[] bArr) {
        this.f10536a = bArr;
        this.c = i4;
        this.f10537b = 0;
    }

    public final void d(int i4) {
        boolean z4 = false;
        if (i4 >= 0 && i4 <= this.f10536a.length) {
            z4 = true;
        }
        Zf.O(z4);
        this.c = i4;
    }

    public final void e(int i4) {
        boolean z4 = false;
        if (i4 >= 0 && i4 <= this.c) {
            z4 = true;
        }
        Zf.O(z4);
        this.f10537b = i4;
    }

    public final void f(int i4) {
        e(this.f10537b + i4);
    }

    public final int g() {
        return this.c - this.f10537b;
    }

    public final int h() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        int i6 = bArr[i4] & 255;
        int i7 = i4 + 2;
        this.f10537b = i7;
        int i8 = bArr[i5] & 255;
        int i9 = i4 + 3;
        this.f10537b = i9;
        int i10 = bArr[i7] & 255;
        this.f10537b = i4 + 4;
        return (bArr[i9] & 255) | (i6 << 24) | (i8 << 16) | (i10 << 8);
    }

    public final int i() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        int i6 = bArr[i4] & 255;
        int i7 = i4 + 2;
        this.f10537b = i7;
        int i8 = bArr[i5] & 255;
        int i9 = i4 + 3;
        this.f10537b = i9;
        int i10 = bArr[i7] & 255;
        this.f10537b = i4 + 4;
        return ((bArr[i9] & 255) << 24) | (i8 << 8) | i6 | (i10 << 16);
    }

    public final int j() {
        int i4 = i();
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalStateException(U.a.i("Top bit not zero: ", i4));
    }

    public final int k() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        int i6 = bArr[i4] & 255;
        this.f10537b = i4 + 2;
        return ((bArr[i5] & 255) << 8) | i6;
    }

    public final int l() {
        return (m() << 21) | (m() << 14) | (m() << 7) | m();
    }

    public final int m() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        this.f10537b = i4 + 1;
        return bArr[i4] & 255;
    }

    public final int n() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        int i6 = bArr[i4] & 255;
        this.f10537b = i4 + 2;
        int i7 = bArr[i5] & 255;
        this.f10537b = i4 + 4;
        return i7 | (i6 << 8);
    }

    public final int o() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        int i6 = bArr[i4] & 255;
        int i7 = i4 + 2;
        this.f10537b = i7;
        int i8 = bArr[i5] & 255;
        this.f10537b = i4 + 3;
        return (bArr[i7] & 255) | (i6 << 16) | (i8 << 8);
    }

    public final int p() {
        int h4 = h();
        if (h4 >= 0) {
            return h4;
        }
        throw new IllegalStateException(U.a.i("Top bit not zero: ", h4));
    }

    public final int q() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        int i6 = bArr[i4] & 255;
        this.f10537b = i4 + 2;
        return (bArr[i5] & 255) | (i6 << 8);
    }

    public final long r() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        long j4 = bArr[i4];
        int i6 = i4 + 2;
        this.f10537b = i6;
        long j5 = bArr[i5];
        int i7 = i4 + 3;
        this.f10537b = i7;
        long j6 = bArr[i6];
        int i8 = i4 + 4;
        this.f10537b = i8;
        long j7 = bArr[i7];
        int i9 = i4 + 5;
        this.f10537b = i9;
        long j8 = bArr[i8];
        int i10 = i4 + 6;
        this.f10537b = i10;
        long j9 = bArr[i9];
        this.f10537b = i4 + 7;
        long j10 = bArr[i10];
        this.f10537b = i4 + 8;
        return ((bArr[r3] & 255) << 56) | (255 & j4) | ((j5 & 255) << 8) | ((j6 & 255) << 16) | ((j7 & 255) << 24) | ((j8 & 255) << 32) | ((j9 & 255) << 40) | ((j10 & 255) << 48);
    }

    public final long s() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        long j4 = bArr[i4];
        int i6 = i4 + 2;
        this.f10537b = i6;
        long j5 = bArr[i5];
        this.f10537b = i4 + 3;
        long j6 = bArr[i6];
        this.f10537b = i4 + 4;
        return ((bArr[r2] & 255) << 24) | (j4 & 255) | ((j5 & 255) << 8) | ((j6 & 255) << 16);
    }

    public final long t() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        long j4 = bArr[i4];
        int i6 = i4 + 2;
        this.f10537b = i6;
        long j5 = bArr[i5];
        int i7 = i4 + 3;
        this.f10537b = i7;
        long j6 = bArr[i6];
        int i8 = i4 + 4;
        this.f10537b = i8;
        long j7 = bArr[i7];
        int i9 = i4 + 5;
        this.f10537b = i9;
        long j8 = bArr[i8];
        int i10 = i4 + 6;
        this.f10537b = i10;
        long j9 = bArr[i9];
        this.f10537b = i4 + 7;
        long j10 = bArr[i10];
        this.f10537b = i4 + 8;
        return (bArr[r3] & 255) | ((j4 & 255) << 56) | ((j5 & 255) << 48) | ((j6 & 255) << 40) | ((j7 & 255) << 32) | ((j8 & 255) << 24) | ((j9 & 255) << 16) | ((j10 & 255) << 8);
    }

    public final long u() {
        byte[] bArr = this.f10536a;
        int i4 = this.f10537b;
        int i5 = i4 + 1;
        this.f10537b = i5;
        long j4 = bArr[i4];
        int i6 = i4 + 2;
        this.f10537b = i6;
        long j5 = bArr[i5];
        this.f10537b = i4 + 3;
        long j6 = bArr[i6];
        this.f10537b = i4 + 4;
        return (bArr[r2] & 255) | ((j4 & 255) << 24) | ((j5 & 255) << 16) | ((j6 & 255) << 8);
    }

    public final long v() {
        long t4 = t();
        if (t4 >= 0) {
            return t4;
        }
        throw new IllegalStateException("Top bit not zero: " + t4);
    }

    public final long w() {
        int i4;
        int i5;
        long j4 = this.f10536a[this.f10537b];
        int i6 = 7;
        while (true) {
            i4 = 0;
            if (i6 < 0) {
                break;
            }
            if (((1 << i6) & j4) != 0) {
                i6--;
            } else if (i6 < 6) {
                j4 &= r7 - 1;
                i4 = 7 - i6;
            } else if (i6 == 7) {
                i4 = 1;
            }
        }
        if (i4 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j4);
        }
        for (i5 = 1; i5 < i4; i5++) {
            if ((this.f10536a[this.f10537b + i5] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j4);
            }
            j4 = (j4 << 6) | (r2 & 63);
        }
        this.f10537b += i4;
        return j4;
    }

    public final String x() {
        int i4 = this.c;
        int i5 = this.f10537b;
        if (i4 - i5 == 0) {
            return null;
        }
        while (i5 < this.c && this.f10536a[i5] != 0) {
            i5++;
        }
        byte[] bArr = this.f10536a;
        int i6 = this.f10537b;
        int i7 = AbstractC0751is.f9071a;
        String str = new String(bArr, i6, i5 - i6, AbstractC1480zs.c);
        this.f10537b = i5;
        if (i5 < this.c) {
            this.f10537b = i5 + 1;
        }
        return str;
    }

    public final String y(int i4) {
        if (i4 == 0) {
            return "";
        }
        int i5 = this.f10537b;
        int i6 = (i5 + i4) - 1;
        int i7 = (i6 >= this.c || this.f10536a[i6] != 0) ? i4 : i4 - 1;
        byte[] bArr = this.f10536a;
        int i8 = AbstractC0751is.f9071a;
        String str = new String(bArr, i5, i7, AbstractC1480zs.c);
        this.f10537b += i4;
        return str;
    }

    public final String z(int i4, Charset charset) {
        byte[] bArr = this.f10536a;
        int i5 = this.f10537b;
        String str = new String(bArr, i5, i4, charset);
        this.f10537b = i5 + i4;
        return str;
    }
}
