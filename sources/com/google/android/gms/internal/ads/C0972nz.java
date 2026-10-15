package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0972nz extends AbstractC1012ow {
    public final Iterator c;
    public ByteBuffer d;

    /* renamed from: e, reason: collision with root package name */
    public int f9783e;

    /* renamed from: f, reason: collision with root package name */
    public int f9784f;

    /* renamed from: h, reason: collision with root package name */
    public int f9786h;

    /* renamed from: j, reason: collision with root package name */
    public long f9788j;

    /* renamed from: k, reason: collision with root package name */
    public long f9789k;

    /* renamed from: l, reason: collision with root package name */
    public long f9790l;

    /* renamed from: g, reason: collision with root package name */
    public int f9785g = Integer.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f9787i = 0;

    public /* synthetic */ C0972nz(int i4, ArrayList arrayList) {
        this.f9783e = i4;
        this.c = arrayList.iterator();
        if (i4 != 0) {
            E();
            return;
        }
        this.d = Mz.c;
        this.f9788j = 0L;
        this.f9789k = 0L;
        this.f9790l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final String A() {
        String k3;
        int H3 = H();
        if (H3 > 0) {
            long j4 = this.f9790l;
            long j5 = this.f9788j;
            long j6 = H3;
            if (j6 <= j4 - j5) {
                long j7 = j5 - this.f9789k;
                ByteBuffer byteBuffer = this.d;
                int i4 = (int) j7;
                C0347Uc c0347Uc = DA.f4592a;
                if (byteBuffer.hasArray()) {
                    int arrayOffset = byteBuffer.arrayOffset();
                    c0347Uc.getClass();
                    k3 = C0347Uc.i(byteBuffer.array(), arrayOffset + i4, H3);
                } else {
                    k3 = byteBuffer.isDirect() ? C0347Uc.k(byteBuffer, i4, H3) : C0347Uc.k(byteBuffer, i4, H3);
                }
                this.f9788j += j6;
                return k3;
            }
        }
        if (H3 >= 0 && H3 <= C()) {
            byte[] bArr = new byte[H3];
            D(H3, bArr);
            DA.f4592a.getClass();
            return C0347Uc.i(bArr, 0, H3);
        }
        if (H3 == 0) {
            return "";
        }
        if (H3 <= 0) {
            throw Oz.d();
        }
        throw Oz.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final void B(int i4) {
        if (this.f9786h != i4) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int C() {
        return (int) (((this.f9783e - this.f9787i) - this.f9788j) + this.f9789k);
    }

    public final void D(int i4, byte[] bArr) {
        if (i4 > C()) {
            if (i4 > 0) {
                throw Oz.f();
            }
            return;
        }
        int i5 = i4;
        while (i5 > 0) {
            if (this.f9790l - this.f9788j == 0) {
                if (!this.c.hasNext()) {
                    throw Oz.f();
                }
                E();
            }
            int min = Math.min(i5, (int) (this.f9790l - this.f9788j));
            long j4 = min;
            BA.c.Z0(this.f9788j, bArr, i4 - i5, j4);
            i5 -= min;
            this.f9788j += j4;
        }
    }

    public final void E() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c.next();
        this.d = byteBuffer;
        this.f9787i += (int) (this.f9788j - this.f9789k);
        long position = byteBuffer.position();
        this.f9788j = position;
        this.f9789k = position;
        this.f9790l = this.d.limit();
        long g4 = BA.g(this.d);
        this.f9788j += g4;
        this.f9789k += g4;
        this.f9790l += g4;
    }

    public final byte F() {
        if (this.f9790l - this.f9788j == 0) {
            if (!this.c.hasNext()) {
                throw Oz.f();
            }
            E();
        }
        long j4 = this.f9788j;
        this.f9788j = 1 + j4;
        return BA.c.R0(j4);
    }

    public final int G() {
        long j4 = this.f9790l;
        long j5 = this.f9788j;
        if (j4 - j5 < 4) {
            int F2 = F() & 255;
            int F4 = (F() & 255) << 8;
            return F2 | F4 | ((F() & 255) << 16) | ((F() & 255) << 24);
        }
        this.f9788j = 4 + j5;
        AA aa = BA.c;
        int R02 = aa.R0(j5) & 255;
        int R03 = (aa.R0(1 + j5) & 255) << 8;
        return ((aa.R0(j5 + 3) & 255) << 24) | R02 | R03 | ((aa.R0(2 + j5) & 255) << 16);
    }

    public final int H() {
        int i4;
        long j4 = this.f9788j;
        if (this.f9790l != j4) {
            long j5 = j4 + 1;
            AA aa = BA.c;
            byte R02 = aa.R0(j4);
            if (R02 >= 0) {
                this.f9788j++;
                return R02;
            }
            if (this.f9790l - this.f9788j >= 10) {
                long j6 = 2 + j4;
                int R03 = (aa.R0(j5) << 7) ^ R02;
                if (R03 < 0) {
                    i4 = R03 ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int R04 = (aa.R0(j6) << 14) ^ R03;
                    if (R04 >= 0) {
                        i4 = R04 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int R05 = R04 ^ (aa.R0(j7) << 21);
                        if (R05 < 0) {
                            i4 = (-2080896) ^ R05;
                        } else {
                            j7 = 5 + j4;
                            byte R06 = aa.R0(j8);
                            int i5 = (R05 ^ (R06 << 28)) ^ 266354560;
                            if (R06 < 0) {
                                j8 = 6 + j4;
                                if (aa.R0(j7) < 0) {
                                    j7 = 7 + j4;
                                    if (aa.R0(j8) < 0) {
                                        j8 = 8 + j4;
                                        if (aa.R0(j7) < 0) {
                                            j7 = 9 + j4;
                                            if (aa.R0(j8) < 0) {
                                                long j9 = j4 + 10;
                                                if (aa.R0(j7) >= 0) {
                                                    i4 = i5;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i5;
                            }
                            i4 = i5;
                        }
                        j6 = j8;
                    }
                    j6 = j7;
                }
                this.f9788j = j6;
                return i4;
            }
        }
        return (int) K();
    }

    public final long I() {
        long j4 = this.f9790l;
        long j5 = this.f9788j;
        if (j4 - j5 < 8) {
            return ((F() & 255) << 56) | (F() & 255) | ((F() & 255) << 8) | ((F() & 255) << 16) | ((F() & 255) << 24) | ((F() & 255) << 32) | ((F() & 255) << 40) | ((F() & 255) << 48);
        }
        this.f9788j = 8 + j5;
        AA aa = BA.c;
        long R02 = aa.R0(j5) & 255;
        long R03 = (aa.R0(j5 + 1) & 255) << 8;
        long R04 = (aa.R0(j5 + 2) & 255) << 16;
        long R05 = (aa.R0(3 + j5) & 255) << 24;
        long R06 = (aa.R0(j5 + 4) & 255) << 32;
        return ((aa.R0(j5 + 7) & 255) << 56) | R02 | R03 | R04 | R05 | R06 | ((aa.R0(j5 + 5) & 255) << 40) | ((aa.R0(j5 + 6) & 255) << 48);
    }

    public final long J() {
        long j4;
        long j5;
        long j6;
        long j7 = this.f9788j;
        if (this.f9790l != j7) {
            long j8 = j7 + 1;
            AA aa = BA.c;
            byte R02 = aa.R0(j7);
            if (R02 >= 0) {
                this.f9788j++;
                return R02;
            }
            if (this.f9790l - this.f9788j >= 10) {
                long j9 = 2 + j7;
                int R03 = (aa.R0(j8) << 7) ^ R02;
                if (R03 < 0) {
                    j4 = R03 ^ (-128);
                } else {
                    long j10 = 3 + j7;
                    int R04 = (aa.R0(j9) << 14) ^ R03;
                    if (R04 >= 0) {
                        j4 = R04 ^ 16256;
                    } else {
                        long j11 = 4 + j7;
                        int R05 = R04 ^ (aa.R0(j10) << 21);
                        if (R05 < 0) {
                            j4 = (-2080896) ^ R05;
                            j9 = j11;
                        } else {
                            j10 = 5 + j7;
                            long R06 = (aa.R0(j11) << 28) ^ R05;
                            if (R06 >= 0) {
                                j6 = 266354560;
                            } else {
                                long j12 = 6 + j7;
                                long R07 = R06 ^ (aa.R0(j10) << 35);
                                if (R07 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    j10 = 7 + j7;
                                    R06 = R07 ^ (aa.R0(j12) << 42);
                                    if (R06 >= 0) {
                                        j6 = 4363953127296L;
                                    } else {
                                        j12 = 8 + j7;
                                        R07 = R06 ^ (aa.R0(j10) << 49);
                                        if (R07 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            j10 = 9 + j7;
                                            long R08 = (R07 ^ (aa.R0(j12) << 56)) ^ 71499008037633920L;
                                            if (R08 < 0) {
                                                long j13 = j7 + 10;
                                                if (aa.R0(j10) >= 0) {
                                                    j9 = j13;
                                                    j4 = R08;
                                                }
                                            } else {
                                                j4 = R08;
                                            }
                                        }
                                    }
                                }
                                j4 = j5 ^ R07;
                                j9 = j12;
                            }
                            j4 = j6 ^ R06;
                        }
                    }
                    j9 = j10;
                }
                this.f9788j = j9;
                return j4;
            }
        }
        return K();
    }

    public final long K() {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((F() & 128) == 0) {
                return j4;
            }
        }
        throw Oz.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final void a(int i4) {
        this.f9785g = i4;
        int i5 = this.f9783e + this.f9784f;
        this.f9783e = i5;
        if (i5 <= i4) {
            this.f9784f = 0;
            return;
        }
        int i6 = i5 - i4;
        this.f9784f = i6;
        this.f9783e = i5 - i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final boolean b() {
        return (((long) this.f9787i) + this.f9788j) - this.f9789k == ((long) this.f9783e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final boolean c() {
        return J() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final double g() {
        return Double.longBitsToDouble(I());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final float i() {
        return Float.intBitsToFloat(G());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int k() {
        return (int) ((this.f9787i + this.f9788j) - this.f9789k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int l(int i4) {
        if (i4 < 0) {
            throw Oz.d();
        }
        int k3 = k() + i4;
        int i5 = this.f9785g;
        if (k3 > i5) {
            throw Oz.f();
        }
        this.f9785g = k3;
        int i6 = this.f9783e + this.f9784f;
        this.f9783e = i6;
        if (i6 <= k3) {
            this.f9784f = 0;
            return i5;
        }
        int i7 = i6 - k3;
        this.f9784f = i7;
        this.f9783e = i6 - i7;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int m() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int n() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int o() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int p() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int q() {
        return AbstractC1012ow.d(H());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int r() {
        if (b()) {
            this.f9786h = 0;
            return 0;
        }
        int H3 = H();
        this.f9786h = H3;
        if ((H3 >>> 3) != 0) {
            return H3;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int s() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long t() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long u() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long v() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long w() {
        return AbstractC1012ow.e(J());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final long x() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final C0800jz y() {
        int H3 = H();
        if (H3 > 0) {
            long j4 = this.f9790l;
            long j5 = this.f9788j;
            long j6 = H3;
            if (j6 <= j4 - j5) {
                byte[] bArr = new byte[H3];
                BA.c.Z0(j5, bArr, 0L, j6);
                this.f9788j += j6;
                return new C0800jz(bArr);
            }
        }
        if (H3 > 0 && H3 <= C()) {
            byte[] bArr2 = new byte[H3];
            D(H3, bArr2);
            return new C0800jz(bArr2);
        }
        if (H3 == 0) {
            return AbstractC0886lz.f9510p;
        }
        if (H3 < 0) {
            throw Oz.d();
        }
        throw Oz.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final String z() {
        int H3 = H();
        if (H3 > 0) {
            long j4 = this.f9790l;
            long j5 = this.f9788j;
            long j6 = H3;
            if (j6 <= j4 - j5) {
                byte[] bArr = new byte[H3];
                BA.c.Z0(j5, bArr, 0L, j6);
                String str = new String(bArr, Mz.f6292a);
                this.f9788j += j6;
                return str;
            }
        }
        if (H3 > 0 && H3 <= C()) {
            byte[] bArr2 = new byte[H3];
            D(H3, bArr2);
            return new String(bArr2, Mz.f6292a);
        }
        if (H3 == 0) {
            return "";
        }
        if (H3 < 0) {
            throw Oz.d();
        }
        throw Oz.f();
    }
}
