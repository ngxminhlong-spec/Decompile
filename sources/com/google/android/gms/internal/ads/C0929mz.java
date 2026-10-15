package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.mz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929mz extends AbstractC1012ow {
    public final byte[] c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f9677e;

    /* renamed from: f, reason: collision with root package name */
    public int f9678f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9679g;

    /* renamed from: h, reason: collision with root package name */
    public int f9680h;

    /* renamed from: i, reason: collision with root package name */
    public int f9681i = Integer.MAX_VALUE;

    public /* synthetic */ C0929mz(byte[] bArr, int i4, int i5) {
        this.c = bArr;
        this.d = i5 + i4;
        this.f9678f = i4;
        this.f9679g = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final String A() {
        int E4 = E();
        if (E4 > 0) {
            int i4 = this.d;
            int i5 = this.f9678f;
            if (E4 <= i4 - i5) {
                DA.f4592a.getClass();
                String i6 = C0347Uc.i(this.c, i5, E4);
                this.f9678f += E4;
                return i6;
            }
        }
        if (E4 == 0) {
            return "";
        }
        if (E4 <= 0) {
            throw Oz.d();
        }
        throw Oz.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final void B(int i4) {
        if (this.f9680h != i4) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void C() {
        int i4 = this.d + this.f9677e;
        this.d = i4;
        int i5 = i4 - this.f9679g;
        int i6 = this.f9681i;
        if (i5 <= i6) {
            this.f9677e = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f9677e = i7;
        this.d = i4 - i7;
    }

    public final int D() {
        int i4 = this.f9678f;
        if (this.d - i4 < 4) {
            throw Oz.f();
        }
        this.f9678f = i4 + 4;
        byte[] bArr = this.c;
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    public final int E() {
        int i4;
        int i5 = this.f9678f;
        int i6 = this.d;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.c;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.f9678f = i7;
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
                this.f9678f = i8;
                return i4;
            }
        }
        return (int) H();
    }

    public final long F() {
        int i4 = this.f9678f;
        if (this.d - i4 < 8) {
            throw Oz.f();
        }
        this.f9678f = i4 + 8;
        byte[] bArr = this.c;
        long j4 = bArr[i4];
        long j5 = bArr[i4 + 2];
        long j6 = bArr[i4 + 3];
        return ((bArr[i4 + 6] & 255) << 48) | (j4 & 255) | ((bArr[i4 + 1] & 255) << 8) | ((j5 & 255) << 16) | ((j6 & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 7] & 255) << 56);
    }

    public final long G() {
        long j4;
        long j5;
        long j6;
        long j7;
        int i4 = this.f9678f;
        int i5 = this.d;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.c;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f9678f = i6;
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
                this.f9678f = i7;
                return j5;
            }
        }
        return H();
    }

    public final long H() {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            int i5 = this.f9678f;
            if (i5 == this.d) {
                throw Oz.f();
            }
            this.f9678f = i5 + 1;
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((this.c[i5] & 128) == 0) {
                return j4;
            }
        }
        throw Oz.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final void a(int i4) {
        this.f9681i = i4;
        C();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final boolean b() {
        return this.f9678f == this.d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final boolean c() {
        return G() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final double g() {
        return Double.longBitsToDouble(F());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final float i() {
        return Float.intBitsToFloat(D());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int k() {
        return this.f9678f - this.f9679g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int l(int i4) {
        if (i4 < 0) {
            throw Oz.d();
        }
        int i5 = (this.f9678f - this.f9679g) + i4;
        if (i5 < 0) {
            throw Oz.e();
        }
        int i6 = this.f9681i;
        if (i5 > i6) {
            throw Oz.f();
        }
        this.f9681i = i5;
        C();
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int m() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int n() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int o() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int p() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int q() {
        return AbstractC1012ow.d(E());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int r() {
        if (b()) {
            this.f9680h = 0;
            return 0;
        }
        int E4 = E();
        this.f9680h = E4;
        if ((E4 >>> 3) != 0) {
            return E4;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int s() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long t() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long u() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long v() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long w() {
        return AbstractC1012ow.e(G());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long x() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final C0800jz y() {
        int E4 = E();
        byte[] bArr = this.c;
        if (E4 > 0) {
            int i4 = this.d;
            int i5 = this.f9678f;
            if (E4 <= i4 - i5) {
                C0800jz A3 = AbstractC0886lz.A(bArr, i5, E4);
                this.f9678f += E4;
                return A3;
            }
        }
        if (E4 == 0) {
            return AbstractC0886lz.f9510p;
        }
        if (E4 > 0) {
            int i6 = this.d;
            int i7 = this.f9678f;
            if (E4 <= i6 - i7) {
                int i8 = E4 + i7;
                this.f9678f = i8;
                return new C0800jz(Arrays.copyOfRange(bArr, i7, i8));
            }
        }
        if (E4 <= 0) {
            throw Oz.d();
        }
        throw Oz.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final String z() {
        int E4 = E();
        if (E4 > 0) {
            int i4 = this.d;
            int i5 = this.f9678f;
            if (E4 <= i4 - i5) {
                String str = new String(this.c, i5, E4, Mz.f6292a);
                this.f9678f += E4;
                return str;
            }
        }
        if (E4 == 0) {
            return "";
        }
        if (E4 < 0) {
            throw Oz.d();
        }
        throw Oz.f();
    }
}
