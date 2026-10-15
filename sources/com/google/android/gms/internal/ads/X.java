package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7583a;

    /* renamed from: b, reason: collision with root package name */
    public int f7584b;
    public int c;
    public int d;

    public X() {
        this.f7583a = AbstractC0751is.f9074f;
    }

    public X(int i4, byte[] bArr) {
        this.f7583a = bArr;
        this.d = i4;
    }

    public X(byte[] bArr, int i4, int i5) {
        this.f7583a = bArr;
        this.c = i4;
        this.f7584b = i5;
        this.d = 0;
        n();
    }

    public int a() {
        return ((this.d - this.f7584b) * 8) - this.c;
    }

    public int b(int i4) {
        int i5;
        byte[] bArr = this.f7583a;
        this.d += i4;
        int i6 = 0;
        while (true) {
            i5 = this.d;
            if (i5 <= 8) {
                break;
            }
            int i7 = i5 - 8;
            this.d = i7;
            int i8 = this.c;
            i6 |= (bArr[i8] & 255) << i7;
            if (true != p(i8 + 1)) {
                r4 = 1;
            }
            this.c = i8 + r4;
        }
        int i9 = this.c;
        int i10 = ((bArr[i9] & 255) >> (8 - i5)) | i6;
        int i11 = 32 - i4;
        if (i5 == 8) {
            this.d = 0;
            this.c = i9 + (true != p(i9 + 1) ? 1 : 2);
        }
        int i12 = ((-1) >>> i11) & i10;
        n();
        return i12;
    }

    public int c() {
        int l4 = l();
        int i4 = l4 % 2;
        return ((l4 + 1) / 2) * (i4 == 0 ? -1 : 1);
    }

    public int d(int i4) {
        int i5 = this.c;
        int i6 = 8 - this.d;
        int i7 = i5 + 1;
        byte[] bArr = this.f7583a;
        int min = Math.min(i4, i6);
        int i8 = ((bArr[i5] & 255) >> this.d) & (255 >> (8 - min));
        while (min < i4) {
            i8 |= (bArr[i7] & 255) << min;
            min += 8;
            i7++;
        }
        int i9 = i8 & ((-1) >>> (32 - i4));
        e(i4);
        return i9;
    }

    public void e(int i4) {
        int i5;
        int i6 = i4 / 8;
        int i7 = this.c + i6;
        this.c = i7;
        int i8 = (i4 - (i6 * 8)) + this.d;
        this.d = i8;
        if (i8 > 7) {
            i7++;
            this.c = i7;
            i8 -= 8;
            this.d = i8;
        }
        boolean z4 = false;
        if (i7 >= 0 && (i7 < (i5 = this.f7584b) || (i7 == i5 && i8 == 0))) {
            z4 = true;
        }
        Zf.X(z4);
    }

    public int f(int i4) {
        int i5;
        if (i4 == 0) {
            return 0;
        }
        this.c += i4;
        int i6 = 0;
        while (true) {
            i5 = this.c;
            if (i5 <= 8) {
                break;
            }
            int i7 = i5 - 8;
            this.c = i7;
            byte[] bArr = this.f7583a;
            int i8 = this.f7584b;
            this.f7584b = i8 + 1;
            i6 |= (bArr[i8] & 255) << i7;
        }
        byte[] bArr2 = this.f7583a;
        int i9 = this.f7584b;
        int i10 = i6 | ((bArr2[i9] & 255) >> (8 - i5));
        int i11 = 32 - i4;
        if (i5 == 8) {
            this.c = 0;
            this.f7584b = i9 + 1;
        }
        int i12 = ((-1) >>> i11) & i10;
        u();
        return i12;
    }

    public void g() {
        int i4 = this.d + 1;
        this.d = i4;
        if (i4 == 8) {
            this.d = 0;
            int i5 = this.c;
            this.c = i5 + (true == p(i5 + 1) ? 2 : 1);
        }
        n();
    }

    public boolean h() {
        int i4 = (this.f7583a[this.c] & 255) >> this.d;
        e(1);
        return 1 == (i4 & 1);
    }

    public void i() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.f7584b++;
        u();
    }

    public void j(int i4) {
        int i5 = this.c;
        int i6 = i4 / 8;
        int i7 = i5 + i6;
        this.c = i7;
        int i8 = (i4 - (i6 * 8)) + this.d;
        this.d = i8;
        if (i8 > 7) {
            this.c = i7 + 1;
            this.d = i8 - 8;
        }
        while (true) {
            i5++;
            if (i5 > this.c) {
                n();
                return;
            } else if (p(i5)) {
                this.c++;
                i5 += 2;
            }
        }
    }

    public boolean k() {
        int i4 = this.f7583a[this.c] & (128 >> this.d);
        g();
        return i4 != 0;
    }

    public int l() {
        int i4 = 0;
        while (!k()) {
            i4++;
        }
        return ((1 << i4) - 1) + (i4 > 0 ? b(i4) : 0);
    }

    public void m(int i4, byte[] bArr) {
        int i5;
        int i6 = 0;
        while (true) {
            i5 = i4 >> 3;
            if (i6 >= i5) {
                break;
            }
            byte[] bArr2 = this.f7583a;
            int i7 = this.f7584b;
            int i8 = i7 + 1;
            this.f7584b = i8;
            byte b4 = bArr2[i7];
            int i9 = this.c;
            byte b5 = (byte) (b4 << i9);
            bArr[i6] = b5;
            bArr[i6] = (byte) (((bArr2[i8] & 255) >> (8 - i9)) | b5);
            i6++;
        }
        int i10 = i4 & 7;
        if (i10 == 0) {
            return;
        }
        byte b6 = (byte) (bArr[i5] & (255 >> i10));
        bArr[i5] = b6;
        int i11 = this.c;
        if (i11 + i10 > 8) {
            byte[] bArr3 = this.f7583a;
            int i12 = this.f7584b;
            this.f7584b = i12 + 1;
            b6 = (byte) (b6 | ((bArr3[i12] & 255) << i11));
            bArr[i5] = b6;
            i11 -= 8;
        }
        int i13 = i11 + i10;
        this.c = i13;
        byte[] bArr4 = this.f7583a;
        int i14 = this.f7584b;
        bArr[i5] = (byte) (((byte) (((255 & bArr4[i14]) >> (8 - i13)) << (8 - i10))) | b6);
        if (i13 == 8) {
            this.c = 0;
            this.f7584b = i14 + 1;
        }
        u();
    }

    public void n() {
        int i4;
        int i5 = this.c;
        boolean z4 = false;
        if (i5 >= 0 && (i5 < (i4 = this.f7584b) || (i5 == i4 && this.d == 0))) {
            z4 = true;
        }
        Zf.X(z4);
    }

    public void o(C1134rq c1134rq) {
        byte[] bArr = c1134rq.f10536a;
        int i4 = c1134rq.c;
        this.f7583a = bArr;
        this.f7584b = 0;
        this.c = 0;
        this.d = i4;
        q(c1134rq.f10537b * 8);
    }

    public boolean p(int i4) {
        if (i4 < 2 || i4 >= this.f7584b) {
            return false;
        }
        byte[] bArr = this.f7583a;
        return bArr[i4] == 3 && bArr[i4 + (-2)] == 0 && bArr[i4 + (-1)] == 0;
    }

    public void q(int i4) {
        int i5 = i4 / 8;
        this.f7584b = i5;
        this.c = i4 - (i5 * 8);
        u();
    }

    public void r() {
        int i4 = this.c + 1;
        this.c = i4;
        if (i4 == 8) {
            this.c = 0;
            this.f7584b++;
        }
        u();
    }

    public void s(int i4) {
        int i5 = i4 / 8;
        int i6 = this.f7584b + i5;
        this.f7584b = i6;
        int i7 = (i4 - (i5 * 8)) + this.c;
        this.c = i7;
        if (i7 > 7) {
            this.f7584b = i6 + 1;
            this.c = i7 - 8;
        }
        u();
    }

    public boolean t() {
        int i4 = this.f7583a[this.f7584b] & (128 >> this.c);
        r();
        return i4 != 0;
    }

    public void u() {
        int i4;
        int i5 = this.f7584b;
        boolean z4 = false;
        if (i5 >= 0 && (i5 < (i4 = this.d) || (i5 == i4 && this.c == 0))) {
            z4 = true;
        }
        Zf.X(z4);
    }
}
