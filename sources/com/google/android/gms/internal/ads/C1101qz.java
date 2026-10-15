package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1101qz extends AbstractC1229tz {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10436e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10437f;

    /* renamed from: g, reason: collision with root package name */
    public int f10438g;

    public C1101qz(int i4, byte[] bArr) {
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i4)));
        }
        this.f10436e = bArr;
        this.f10438g = 0;
        this.f10437f = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void C(byte b4) {
        try {
            byte[] bArr = this.f10436e;
            int i4 = this.f10438g;
            this.f10438g = i4 + 1;
            bArr[i4] = b4;
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10438g), Integer.valueOf(this.f10437f), 1), e4, 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void D(int i4, boolean z4) {
        P(i4 << 3);
        C(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void E(int i4, AbstractC0886lz abstractC0886lz) {
        P((i4 << 3) | 2);
        P(abstractC0886lz.l());
        abstractC0886lz.v(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void F(int i4, int i5) {
        P((i4 << 3) | 5);
        G(i5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void G(int i4) {
        try {
            byte[] bArr = this.f10436e;
            int i5 = this.f10438g;
            int i6 = i5 + 1;
            this.f10438g = i6;
            bArr[i5] = (byte) (i4 & 255);
            int i7 = i5 + 2;
            this.f10438g = i7;
            bArr[i6] = (byte) ((i4 >> 8) & 255);
            int i8 = i5 + 3;
            this.f10438g = i8;
            bArr[i7] = (byte) ((i4 >> 16) & 255);
            this.f10438g = i5 + 4;
            bArr[i8] = (byte) ((i4 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10438g), Integer.valueOf(this.f10437f), 1), e4, 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void H(int i4, long j4) {
        P((i4 << 3) | 1);
        I(j4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void I(long j4) {
        try {
            byte[] bArr = this.f10436e;
            int i4 = this.f10438g;
            int i5 = i4 + 1;
            this.f10438g = i5;
            bArr[i4] = (byte) (((int) j4) & 255);
            int i6 = i4 + 2;
            this.f10438g = i6;
            bArr[i5] = (byte) (((int) (j4 >> 8)) & 255);
            int i7 = i4 + 3;
            this.f10438g = i7;
            bArr[i6] = (byte) (((int) (j4 >> 16)) & 255);
            int i8 = i4 + 4;
            this.f10438g = i8;
            bArr[i7] = (byte) (((int) (j4 >> 24)) & 255);
            int i9 = i4 + 5;
            this.f10438g = i9;
            bArr[i8] = (byte) (((int) (j4 >> 32)) & 255);
            int i10 = i4 + 6;
            this.f10438g = i10;
            bArr[i9] = (byte) (((int) (j4 >> 40)) & 255);
            int i11 = i4 + 7;
            this.f10438g = i11;
            bArr[i10] = (byte) (((int) (j4 >> 48)) & 255);
            this.f10438g = i4 + 8;
            bArr[i11] = (byte) (((int) (j4 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10438g), Integer.valueOf(this.f10437f), 1), e4, 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void J(int i4, int i5) {
        P(i4 << 3);
        K(i5);
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
        int i5 = this.f10438g;
        try {
            int z4 = AbstractC1229tz.z(str.length() * 3);
            int z5 = AbstractC1229tz.z(str.length());
            int i6 = this.f10437f;
            byte[] bArr = this.f10436e;
            if (z5 != z4) {
                P(DA.c(str));
                int i7 = this.f10438g;
                this.f10438g = DA.b(str, bArr, i7, i6 - i7);
            } else {
                int i8 = i5 + z5;
                this.f10438g = i8;
                int b4 = DA.b(str, bArr, i8, i6 - i8);
                this.f10438g = i5;
                P((b4 - i5) - z5);
                this.f10438g = b4;
            }
        } catch (CA e4) {
            this.f10438g = i5;
            B(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new C1143rz(e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void N(int i4, int i5) {
        P((i4 << 3) | i5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void O(int i4, int i5) {
        P(i4 << 3);
        P(i5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void P(int i4) {
        while (true) {
            int i5 = i4 & (-128);
            byte[] bArr = this.f10436e;
            if (i5 == 0) {
                int i6 = this.f10438g;
                this.f10438g = i6 + 1;
                bArr[i6] = (byte) i4;
                return;
            } else {
                try {
                    int i7 = this.f10438g;
                    this.f10438g = i7 + 1;
                    bArr[i7] = (byte) ((i4 & 127) | 128);
                    i4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10438g), Integer.valueOf(this.f10437f), 1), e4, 0);
                }
            }
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10438g), Integer.valueOf(this.f10437f), 1), e4, 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void Q(int i4, long j4) {
        P(i4 << 3);
        R(j4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229tz
    public final void R(long j4) {
        boolean z4 = AbstractC1229tz.d;
        int i4 = this.f10437f;
        byte[] bArr = this.f10436e;
        if (!z4 || i4 - this.f10438g < 10) {
            while ((j4 & (-128)) != 0) {
                try {
                    int i5 = this.f10438g;
                    this.f10438g = i5 + 1;
                    bArr[i5] = (byte) ((((int) j4) & 127) | 128);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10438g), Integer.valueOf(i4), 1), e4, 0);
                }
            }
            int i6 = this.f10438g;
            this.f10438g = i6 + 1;
            bArr[i6] = (byte) j4;
            return;
        }
        while (true) {
            int i7 = (int) j4;
            if ((j4 & (-128)) == 0) {
                int i8 = this.f10438g;
                this.f10438g = i8 + 1;
                BA.l(bArr, i8, (byte) i7);
                return;
            } else {
                int i9 = this.f10438g;
                this.f10438g = i9 + 1;
                BA.l(bArr, i9, (byte) ((i7 & 127) | 128));
                j4 >>>= 7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0587ez
    public final void i(byte[] bArr, int i4, int i5) {
        try {
            System.arraycopy(bArr, i4, this.f10436e, this.f10438g, i5);
            this.f10438g += i5;
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10438g), Integer.valueOf(this.f10437f), Integer.valueOf(i5)), e4, 0);
        }
    }
}
