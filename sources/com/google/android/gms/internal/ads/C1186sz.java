package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1186sz extends AbstractC1229tz {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10656e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10657f;

    /* renamed from: g, reason: collision with root package name */
    public int f10658g;

    /* renamed from: h, reason: collision with root package name */
    public final C0843kz f10659h;

    public C1186sz(C0843kz c0843kz, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i4, 20);
        this.f10656e = new byte[max];
        this.f10657f = max;
        this.f10659h = c0843kz;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void C(byte b4) {
        if (this.f10658g == this.f10657f) {
            U();
        }
        int i4 = this.f10658g;
        this.f10658g = i4 + 1;
        this.f10656e[i4] = b4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void D(int i4, boolean z4) {
        V(11);
        Y(i4 << 3);
        int i5 = this.f10658g;
        this.f10658g = i5 + 1;
        this.f10656e[i5] = z4 ? (byte) 1 : (byte) 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void E(int i4, AbstractC0886lz abstractC0886lz) {
        P((i4 << 3) | 2);
        P(abstractC0886lz.l());
        abstractC0886lz.v(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void F(int i4, int i5) {
        V(14);
        Y((i4 << 3) | 5);
        W(i5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void G(int i4) {
        V(4);
        W(i4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void H(int i4, long j4) {
        V(18);
        Y((i4 << 3) | 1);
        X(j4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void I(long j4) {
        V(8);
        X(j4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void J(int i4, int i5) {
        V(20);
        Y(i4 << 3);
        if (i5 >= 0) {
            Y(i5);
        } else {
            Z(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void K(int i4) {
        if (i4 >= 0) {
            P(i4);
        } else {
            R(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void L(int i4, AbstractC0417az abstractC0417az, InterfaceC0984oA interfaceC0984oA) {
        P((i4 << 3) | 2);
        P(abstractC0417az.b(interfaceC0984oA));
        interfaceC0984oA.f(abstractC0417az, this.f10762b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void M(String str, int i4) {
        P((i4 << 3) | 2);
        try {
            int length = str.length() * 3;
            int z4 = AbstractC1229tz.z(length);
            int i5 = z4 + length;
            int i6 = this.f10657f;
            if (i5 > i6) {
                byte[] bArr = new byte[length];
                int b4 = DA.b(str, bArr, 0, length);
                P(b4);
                a0(bArr, 0, b4);
                return;
            }
            if (i5 > i6 - this.f10658g) {
                U();
            }
            int z5 = AbstractC1229tz.z(str.length());
            int i7 = this.f10658g;
            byte[] bArr2 = this.f10656e;
            try {
                if (z5 == z4) {
                    int i8 = i7 + z5;
                    this.f10658g = i8;
                    int b5 = DA.b(str, bArr2, i8, i6 - i8);
                    this.f10658g = i7;
                    Y((b5 - i7) - z5);
                    this.f10658g = b5;
                } else {
                    int c = DA.c(str);
                    Y(c);
                    this.f10658g = DA.b(str, bArr2, this.f10658g, c);
                }
            } catch (CA e4) {
                this.f10658g = i7;
                throw e4;
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new C1143rz(e5);
            }
        } catch (CA e6) {
            B(str, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void N(int i4, int i5) {
        P((i4 << 3) | i5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void O(int i4, int i5) {
        V(20);
        Y(i4 << 3);
        Y(i5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void P(int i4) {
        V(5);
        Y(i4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void Q(int i4, long j4) {
        V(20);
        Y(i4 << 3);
        Z(j4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void R(long j4) {
        V(10);
        Z(j4);
    }

    public final void U() {
        this.f10659h.write(this.f10656e, 0, this.f10658g);
        this.f10658g = 0;
    }

    public final void V(int i4) {
        if (this.f10657f - this.f10658g < i4) {
            U();
        }
    }

    public final void W(int i4) {
        int i5 = this.f10658g;
        int i6 = i5 + 1;
        this.f10658g = i6;
        byte[] bArr = this.f10656e;
        bArr[i5] = (byte) (i4 & 255);
        int i7 = i5 + 2;
        this.f10658g = i7;
        bArr[i6] = (byte) ((i4 >> 8) & 255);
        int i8 = i5 + 3;
        this.f10658g = i8;
        bArr[i7] = (byte) ((i4 >> 16) & 255);
        this.f10658g = i5 + 4;
        bArr[i8] = (byte) ((i4 >> 24) & 255);
    }

    public final void X(long j4) {
        int i4 = this.f10658g;
        int i5 = i4 + 1;
        this.f10658g = i5;
        byte[] bArr = this.f10656e;
        bArr[i4] = (byte) (j4 & 255);
        int i6 = i4 + 2;
        this.f10658g = i6;
        bArr[i5] = (byte) ((j4 >> 8) & 255);
        int i7 = i4 + 3;
        this.f10658g = i7;
        bArr[i6] = (byte) ((j4 >> 16) & 255);
        int i8 = i4 + 4;
        this.f10658g = i8;
        bArr[i7] = (byte) (255 & (j4 >> 24));
        int i9 = i4 + 5;
        this.f10658g = i9;
        bArr[i8] = (byte) (((int) (j4 >> 32)) & 255);
        int i10 = i4 + 6;
        this.f10658g = i10;
        bArr[i9] = (byte) (((int) (j4 >> 40)) & 255);
        int i11 = i4 + 7;
        this.f10658g = i11;
        bArr[i10] = (byte) (((int) (j4 >> 48)) & 255);
        this.f10658g = i4 + 8;
        bArr[i11] = (byte) (((int) (j4 >> 56)) & 255);
    }

    public final void Y(int i4) {
        boolean z4 = AbstractC1229tz.d;
        byte[] bArr = this.f10656e;
        if (z4) {
            while ((i4 & (-128)) != 0) {
                int i5 = this.f10658g;
                this.f10658g = i5 + 1;
                BA.l(bArr, i5, (byte) ((i4 & 127) | 128));
                i4 >>>= 7;
            }
            int i6 = this.f10658g;
            this.f10658g = i6 + 1;
            BA.l(bArr, i6, (byte) i4);
            return;
        }
        while ((i4 & (-128)) != 0) {
            int i7 = this.f10658g;
            this.f10658g = i7 + 1;
            bArr[i7] = (byte) ((i4 & 127) | 128);
            i4 >>>= 7;
        }
        int i8 = this.f10658g;
        this.f10658g = i8 + 1;
        bArr[i8] = (byte) i4;
    }

    public final void Z(long j4) {
        boolean z4 = AbstractC1229tz.d;
        byte[] bArr = this.f10656e;
        if (z4) {
            while (true) {
                int i4 = (int) j4;
                if ((j4 & (-128)) == 0) {
                    int i5 = this.f10658g;
                    this.f10658g = i5 + 1;
                    BA.l(bArr, i5, (byte) i4);
                    return;
                } else {
                    int i6 = this.f10658g;
                    this.f10658g = i6 + 1;
                    BA.l(bArr, i6, (byte) ((i4 & 127) | 128));
                    j4 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i7 = (int) j4;
                if ((j4 & (-128)) == 0) {
                    int i8 = this.f10658g;
                    this.f10658g = i8 + 1;
                    bArr[i8] = (byte) i7;
                    return;
                } else {
                    int i9 = this.f10658g;
                    this.f10658g = i9 + 1;
                    bArr[i9] = (byte) ((i7 & 127) | 128);
                    j4 >>>= 7;
                }
            }
        }
    }

    public final void a0(byte[] bArr, int i4, int i5) {
        int i6 = this.f10658g;
        int i7 = this.f10657f;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f10656e;
        if (i8 >= i5) {
            System.arraycopy(bArr, i4, bArr2, i6, i5);
            this.f10658g += i5;
            return;
        }
        System.arraycopy(bArr, i4, bArr2, i6, i8);
        int i9 = i4 + i8;
        this.f10658g = i7;
        U();
        int i10 = i5 - i8;
        if (i10 > i7) {
            this.f10659h.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f10658g = i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0587ez
    public final void i(byte[] bArr, int i4, int i5) {
        a0(bArr, i4, i5);
    }
}
