package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.oz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1015oz extends AbstractC1012ow {
    public final InputStream c;
    public final byte[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f9867e;

    /* renamed from: f, reason: collision with root package name */
    public int f9868f;

    /* renamed from: g, reason: collision with root package name */
    public int f9869g;

    /* renamed from: h, reason: collision with root package name */
    public int f9870h;

    /* renamed from: i, reason: collision with root package name */
    public int f9871i;

    /* renamed from: j, reason: collision with root package name */
    public int f9872j = Integer.MAX_VALUE;

    public /* synthetic */ C1015oz(InputStream inputStream) {
        Charset charset = Mz.f6292a;
        this.c = inputStream;
        this.d = new byte[4096];
        this.f9867e = 0;
        this.f9869g = 0;
        this.f9871i = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final String A() {
        int K2 = K();
        int i4 = this.f9869g;
        int i5 = this.f9867e;
        int i6 = i5 - i4;
        byte[] bArr = this.d;
        if (K2 <= i6 && K2 > 0) {
            this.f9869g = i4 + K2;
        } else {
            if (K2 == 0) {
                return "";
            }
            i4 = 0;
            if (K2 <= i5) {
                F(K2);
                this.f9869g = K2;
            } else {
                bArr = H(K2);
            }
        }
        DA.f4592a.getClass();
        return C0347Uc.i(bArr, i4, K2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final void B(int i4) {
        if (this.f9870h != i4) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void C(int i4) {
        InputStream inputStream = this.c;
        int i5 = this.f9867e;
        int i6 = this.f9869g;
        int i7 = i5 - i6;
        if (i4 <= i7 && i4 >= 0) {
            this.f9869g = i6 + i4;
            return;
        }
        if (i4 < 0) {
            throw Oz.d();
        }
        int i8 = this.f9871i;
        int i9 = i8 + i6;
        int i10 = this.f9872j;
        if (i9 + i4 > i10) {
            C((i10 - i8) - i6);
            throw Oz.f();
        }
        this.f9871i = i9;
        this.f9867e = 0;
        this.f9869g = 0;
        while (i7 < i4) {
            long j4 = i4 - i7;
            try {
                try {
                    long skip = inputStream.skip(j4);
                    if (skip < 0 || skip > j4) {
                        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i7 += (int) skip;
                    }
                } catch (Oz e4) {
                    e4.f6544o = true;
                    throw e4;
                }
            } catch (Throwable th) {
                this.f9871i += i7;
                E();
                throw th;
            }
        }
        this.f9871i += i7;
        E();
        if (i7 >= i4) {
            return;
        }
        int i11 = this.f9867e;
        int i12 = i11 - this.f9869g;
        this.f9869g = i11;
        F(1);
        while (true) {
            int i13 = i4 - i12;
            int i14 = this.f9867e;
            if (i13 <= i14) {
                this.f9869g = i13;
                return;
            } else {
                i12 += i14;
                this.f9869g = i14;
                F(1);
            }
        }
    }

    public final ArrayList D(int i4) {
        ArrayList arrayList = new ArrayList();
        while (i4 > 0) {
            int min = Math.min(i4, 4096);
            byte[] bArr = new byte[min];
            int i5 = 0;
            while (i5 < min) {
                int read = this.c.read(bArr, i5, min - i5);
                if (read == -1) {
                    throw Oz.f();
                }
                this.f9871i += read;
                i5 += read;
            }
            i4 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void E() {
        int i4 = this.f9867e + this.f9868f;
        this.f9867e = i4;
        int i5 = this.f9871i + i4;
        int i6 = this.f9872j;
        if (i5 <= i6) {
            this.f9868f = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f9868f = i7;
        this.f9867e = i4 - i7;
    }

    public final void F(int i4) {
        if (G(i4)) {
            return;
        }
        if (i4 <= (Integer.MAX_VALUE - this.f9871i) - this.f9869g) {
            throw Oz.f();
        }
        throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean G(int i4) {
        InputStream inputStream = this.c;
        int i5 = this.f9869g;
        int i6 = i5 + i4;
        int i7 = this.f9867e;
        if (i6 <= i7) {
            throw new IllegalStateException(U.a.h(i4, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i8 = this.f9871i;
        if (i4 > (Integer.MAX_VALUE - i8) - i5 || i8 + i5 + i4 > this.f9872j) {
            return false;
        }
        byte[] bArr = this.d;
        if (i5 > 0) {
            if (i7 > i5) {
                System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
            }
            i8 = this.f9871i + i5;
            this.f9871i = i8;
            i7 = this.f9867e - i5;
            this.f9867e = i7;
            this.f9869g = 0;
        }
        try {
            int read = inputStream.read(bArr, i7, Math.min(4096 - i7, (Integer.MAX_VALUE - i8) - i7));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f9867e += read;
            E();
            if (this.f9867e >= i4) {
                return true;
            }
            return G(i4);
        } catch (Oz e4) {
            e4.f6544o = true;
            throw e4;
        }
    }

    public final byte[] H(int i4) {
        byte[] I4 = I(i4);
        if (I4 != null) {
            return I4;
        }
        int i5 = this.f9869g;
        int i6 = this.f9867e;
        int i7 = i6 - i5;
        this.f9871i += i6;
        this.f9869g = 0;
        this.f9867e = 0;
        ArrayList D4 = D(i4 - i7);
        byte[] bArr = new byte[i4];
        System.arraycopy(this.d, i5, bArr, 0, i7);
        int size = D4.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = D4.get(i8);
            i8++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i7, length);
            i7 += length;
        }
        return bArr;
    }

    public final byte[] I(int i4) {
        if (i4 == 0) {
            return Mz.f6293b;
        }
        if (i4 < 0) {
            throw Oz.d();
        }
        int i5 = this.f9871i;
        int i6 = this.f9869g;
        int i7 = i5 + i6 + i4;
        if ((-2147483647) + i7 > 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.f9872j;
        if (i7 > i8) {
            C((i8 - i5) - i6);
            throw Oz.f();
        }
        int i9 = this.f9867e - i6;
        int i10 = i4 - i9;
        InputStream inputStream = this.c;
        if (i10 >= 4096) {
            try {
                if (i10 > inputStream.available()) {
                    return null;
                }
            } catch (Oz e4) {
                e4.f6544o = true;
                throw e4;
            }
        }
        byte[] bArr = new byte[i4];
        System.arraycopy(this.d, this.f9869g, bArr, 0, i9);
        this.f9871i += this.f9867e;
        this.f9869g = 0;
        this.f9867e = 0;
        while (i9 < i4) {
            try {
                int read = inputStream.read(bArr, i9, i4 - i9);
                if (read == -1) {
                    throw Oz.f();
                }
                this.f9871i += read;
                i9 += read;
            } catch (Oz e5) {
                e5.f6544o = true;
                throw e5;
            }
        }
        return bArr;
    }

    public final int J() {
        int i4 = this.f9869g;
        if (this.f9867e - i4 < 4) {
            F(4);
            i4 = this.f9869g;
        }
        this.f9869g = i4 + 4;
        byte[] bArr = this.d;
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    public final int K() {
        int i4;
        int i5 = this.f9869g;
        int i6 = this.f9867e;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.d;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.f9869g = i7;
                return b4;
            }
            if (i6 - i7 >= 9) {
                int i8 = i5 + 2;
                int i9 = (bArr[i7] << 7) ^ b4;
                if (i9 < 0) {
                    i4 = i9 ^ (-128);
                } else {
                    int i10 = i5 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i4 = i11 ^ 16256;
                    } else {
                        int i12 = i5 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i4 = (-2080896) ^ i13;
                        } else {
                            i10 = i5 + 5;
                            byte b5 = bArr[i12];
                            int i14 = (i13 ^ (b5 << 28)) ^ 266354560;
                            if (b5 < 0) {
                                i12 = i5 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i5 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i5 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i5 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i5 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i4 = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i14;
                            }
                            i4 = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.f9869g = i8;
                return i4;
            }
        }
        return (int) N();
    }

    public final long L() {
        int i4 = this.f9869g;
        if (this.f9867e - i4 < 8) {
            F(8);
            i4 = this.f9869g;
        }
        this.f9869g = i4 + 8;
        byte[] bArr = this.d;
        long j4 = bArr[i4];
        long j5 = bArr[i4 + 2];
        long j6 = bArr[i4 + 3];
        return ((bArr[i4 + 6] & 255) << 48) | (j4 & 255) | ((bArr[i4 + 1] & 255) << 8) | ((j5 & 255) << 16) | ((j6 & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 7] & 255) << 56);
    }

    public final long M() {
        long j4;
        long j5;
        long j6;
        long j7;
        int i4 = this.f9869g;
        int i5 = this.f9867e;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.d;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f9869g = i6;
                return b4;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b4;
                if (i8 < 0) {
                    j5 = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j5 = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            long j8 = (-2080896) ^ i12;
                            i7 = i11;
                            j5 = j8;
                        } else {
                            i9 = i4 + 5;
                            long j9 = i12 ^ (bArr[i11] << 28);
                            if (j9 >= 0) {
                                j7 = 266354560;
                            } else {
                                int i13 = i4 + 6;
                                long j10 = j9 ^ (bArr[i9] << 35);
                                if (j10 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i9 = i4 + 7;
                                    j9 = j10 ^ (bArr[i13] << 42);
                                    if (j9 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i13 = i4 + 8;
                                        j10 = j9 ^ (bArr[i9] << 49);
                                        if (j10 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i9 = i4 + 9;
                                            j4 = (j10 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j4 < 0) {
                                                int i14 = i4 + 10;
                                                if (bArr[i9] >= 0) {
                                                    j5 = j4;
                                                    i7 = i14;
                                                }
                                            }
                                            j5 = j4;
                                        }
                                    }
                                }
                                j5 = j10 ^ j6;
                                i7 = i13;
                            }
                            j4 = j9 ^ j7;
                            j5 = j4;
                        }
                    }
                    i7 = i9;
                }
                this.f9869g = i7;
                return j5;
            }
        }
        return N();
    }

    public final long N() {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            if (this.f9869g == this.f9867e) {
                F(1);
            }
            int i5 = this.f9869g;
            this.f9869g = i5 + 1;
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((this.d[i5] & 128) == 0) {
                return j4;
            }
        }
        throw Oz.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final void a(int i4) {
        this.f9872j = i4;
        E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final boolean b() {
        return this.f9869g == this.f9867e && !G(1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final boolean c() {
        return M() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final double g() {
        return Double.longBitsToDouble(L());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final float i() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int k() {
        return this.f9871i + this.f9869g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int l(int i4) {
        if (i4 < 0) {
            throw Oz.d();
        }
        int i5 = this.f9871i + this.f9869g;
        int i6 = this.f9872j;
        int i7 = i4 + i5;
        if (i7 > i6) {
            throw Oz.f();
        }
        this.f9872j = i7;
        E();
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int m() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int n() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int o() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int p() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int q() {
        return AbstractC1012ow.d(K());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int r() {
        if (b()) {
            this.f9870h = 0;
            return 0;
        }
        int K2 = K();
        this.f9870h = K2;
        if ((K2 >>> 3) != 0) {
            return K2;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int s() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long t() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long u() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long v() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long w() {
        return AbstractC1012ow.e(M());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long x() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final C0800jz y() {
        int K2 = K();
        int i4 = this.f9867e;
        int i5 = this.f9869g;
        int i6 = i4 - i5;
        byte[] bArr = this.d;
        if (K2 <= i6 && K2 > 0) {
            C0800jz A3 = AbstractC0886lz.A(bArr, i5, K2);
            this.f9869g += K2;
            return A3;
        }
        if (K2 == 0) {
            return AbstractC0886lz.f9510p;
        }
        byte[] I4 = I(K2);
        if (I4 != null) {
            return AbstractC0886lz.A(I4, 0, I4.length);
        }
        int i7 = this.f9869g;
        int i8 = this.f9867e;
        int i9 = i8 - i7;
        this.f9871i += i8;
        this.f9869g = 0;
        this.f9867e = 0;
        ArrayList D4 = D(K2 - i9);
        byte[] bArr2 = new byte[K2];
        System.arraycopy(bArr, i7, bArr2, 0, i9);
        int size = D4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = D4.get(i10);
            i10++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i9, length);
            i9 += length;
        }
        return new C0800jz(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final String z() {
        int K2 = K();
        byte[] bArr = this.d;
        if (K2 > 0) {
            int i4 = this.f9867e;
            int i5 = this.f9869g;
            if (K2 <= i4 - i5) {
                String str = new String(bArr, i5, K2, Mz.f6292a);
                this.f9869g += K2;
                return str;
            }
        }
        if (K2 == 0) {
            return "";
        }
        if (K2 > this.f9867e) {
            return new String(H(K2), Mz.f6292a);
        }
        F(K2);
        String str2 = new String(bArr, this.f9869g, K2, Mz.f6292a);
        this.f9869g += K2;
        return str2;
    }
}
