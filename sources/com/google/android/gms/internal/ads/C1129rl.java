package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129rl {

    /* renamed from: a, reason: collision with root package name */
    public final int f10501a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10502b;
    public final float c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10503e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10504f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10505g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10506h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f10507i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f10508j;

    /* renamed from: k, reason: collision with root package name */
    public int f10509k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f10510l;

    /* renamed from: m, reason: collision with root package name */
    public int f10511m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f10512n;

    /* renamed from: o, reason: collision with root package name */
    public int f10513o;

    /* renamed from: p, reason: collision with root package name */
    public int f10514p;

    /* renamed from: q, reason: collision with root package name */
    public int f10515q;

    /* renamed from: r, reason: collision with root package name */
    public int f10516r;

    /* renamed from: s, reason: collision with root package name */
    public int f10517s;

    /* renamed from: t, reason: collision with root package name */
    public int f10518t;

    /* renamed from: u, reason: collision with root package name */
    public int f10519u;

    /* renamed from: v, reason: collision with root package name */
    public int f10520v;

    public C1129rl(int i4, int i5, float f4, float f5, int i6) {
        this.f10501a = i4;
        this.f10502b = i5;
        this.c = f4;
        this.d = f5;
        this.f10503e = i4 / i6;
        this.f10504f = i4 / 400;
        int i7 = i4 / 65;
        this.f10505g = i7;
        int i8 = i7 + i7;
        this.f10506h = i8;
        this.f10507i = new short[i8];
        int i9 = i8 * i5;
        this.f10508j = new short[i9];
        this.f10510l = new short[i9];
        this.f10512n = new short[i9];
    }

    public static void d(int i4, int i5, short[] sArr, int i6, short[] sArr2, int i7, short[] sArr3, int i8) {
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i7 * i5) + i9;
            int i11 = (i8 * i5) + i9;
            int i12 = (i6 * i5) + i9;
            for (int i13 = 0; i13 < i4; i13++) {
                sArr[i12] = (short) (((sArr3[i11] * i13) + ((i4 - i13) * sArr2[i10])) / i4);
                i12 += i5;
                i10 += i5;
                i11 += i5;
            }
        }
    }

    public final int a(short[] sArr, int i4, int i5, int i6) {
        int i7 = 1;
        int i8 = 255;
        int i9 = 0;
        int i10 = 0;
        while (i5 <= i6) {
            int i11 = 0;
            for (int i12 = 0; i12 < i5; i12++) {
                int i13 = this.f10502b * i4;
                i11 += Math.abs(sArr[i13 + i12] - sArr[(i13 + i5) + i12]);
            }
            int i14 = i11 * i9;
            int i15 = i7 * i5;
            if (i14 < i15) {
                i7 = i11;
            }
            if (i14 < i15) {
                i9 = i5;
            }
            int i16 = i11 * i8;
            int i17 = i10 * i5;
            if (i16 > i17) {
                i10 = i11;
            }
            if (i16 > i17) {
                i8 = i5;
            }
            i5++;
        }
        this.f10519u = i7 / i9;
        this.f10520v = i10 / i8;
        return i9;
    }

    public final void b(short[] sArr, int i4, int i5) {
        short[] f4 = f(this.f10510l, this.f10511m, i5);
        this.f10510l = f4;
        int i6 = this.f10511m;
        int i7 = this.f10502b;
        System.arraycopy(sArr, i4 * i7, f4, i6 * i7, i5 * i7);
        this.f10511m += i5;
    }

    public final void c(short[] sArr, int i4, int i5) {
        int i6;
        for (int i7 = 0; i7 < this.f10506h / i5; i7++) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = this.f10502b;
                i6 = i10 * i5;
                if (i8 < i6) {
                    i9 += sArr[(i6 * i7) + (i10 * i4) + i8];
                    i8++;
                }
            }
            this.f10507i[i7] = (short) (i9 / i6);
        }
    }

    public final void e() {
        float f4;
        float f5;
        float f6;
        double d;
        int i4;
        int i5;
        int i6;
        int i7;
        float f7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f8 = this.c;
        float f9 = this.d;
        float f10 = f8 / f9;
        double d4 = f10;
        int i12 = this.f10511m;
        int i13 = this.f10501a;
        int i14 = this.f10502b;
        int i15 = 1;
        if (d4 > 1.00001d || d4 < 0.99999d) {
            int i16 = this.f10509k;
            int i17 = this.f10506h;
            if (i16 >= i17) {
                int i18 = 0;
                while (true) {
                    int i19 = this.f10516r;
                    if (i19 > 0) {
                        int min = Math.min(i17, i19);
                        b(this.f10508j, i18, min);
                        this.f10516r -= min;
                        i18 += min;
                        f5 = f10;
                        f6 = f9;
                        d = d4;
                        f4 = 1.0f;
                    } else {
                        short[] sArr = this.f10508j;
                        int i20 = i13 > 4000 ? i13 / 4000 : i15;
                        f4 = 1.0f;
                        int i21 = this.f10505g;
                        int i22 = this.f10504f;
                        if (i14 == i15 && i20 == i15) {
                            i4 = a(sArr, i18, i22, i21);
                            f5 = f10;
                            f6 = f9;
                            d = d4;
                        } else {
                            c(sArr, i18, i20);
                            f5 = f10;
                            f6 = f9;
                            short[] sArr2 = this.f10507i;
                            d = d4;
                            int a4 = a(sArr2, 0, i22 / i20, i21 / i20);
                            if (i20 != 1) {
                                int i23 = a4 * i20;
                                int i24 = i20 * 4;
                                int i25 = i23 - i24;
                                if (i25 >= i22) {
                                    i22 = i25;
                                }
                                int i26 = i23 + i24;
                                if (i26 <= i21) {
                                    i21 = i26;
                                }
                                if (i14 == 1) {
                                    i4 = a(sArr, i18, i22, i21);
                                } else {
                                    c(sArr, i18, 1);
                                    i4 = a(sArr2, 0, i22, i21);
                                }
                            } else {
                                i4 = a4;
                            }
                        }
                        int i27 = this.f10519u;
                        int i28 = this.f10520v;
                        if (i27 == 0 || (i5 = this.f10517s) == 0 || i28 > i27 * 3 || i27 + i27 <= this.f10518t * 3) {
                            i5 = i4;
                        }
                        int i29 = i18 + i5;
                        this.f10518t = i27;
                        this.f10517s = i4;
                        float f11 = i5;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f10508j;
                            float f12 = f5 - 1.0f;
                            if (f5 >= 2.0f) {
                                i7 = (int) (f11 / f12);
                            } else {
                                this.f10516r = (int) (((2.0f - f5) * f11) / f12);
                                i7 = i5;
                            }
                            short[] f13 = f(this.f10510l, this.f10511m, i7);
                            this.f10510l = f13;
                            int i30 = i18;
                            int i31 = i7;
                            d(i31, this.f10502b, f13, this.f10511m, sArr3, i30, sArr3, i29);
                            this.f10511m += i31;
                            i18 = i5 + i31 + i30;
                        } else {
                            int i32 = i18;
                            short[] sArr4 = this.f10508j;
                            float f14 = 1.0f - f5;
                            if (f5 < 0.5f) {
                                i6 = (int) ((f11 * f5) / f14);
                            } else {
                                this.f10516r = (int) ((((f5 + f5) - 1.0f) * f11) / f14);
                                i6 = i5;
                            }
                            int i33 = i5 + i6;
                            short[] f15 = f(this.f10510l, this.f10511m, i33);
                            this.f10510l = f15;
                            System.arraycopy(sArr4, i32 * i14, f15, this.f10511m * i14, i5 * i14);
                            d(i6, this.f10502b, this.f10510l, this.f10511m + i5, sArr4, i29, sArr4, i32);
                            this.f10511m += i33;
                            i18 = i32 + i6;
                        }
                    }
                    if (i18 + i17 > i16) {
                        break;
                    }
                    i15 = 1;
                    f10 = f5;
                    f9 = f6;
                    d4 = d;
                }
                int i34 = this.f10509k - i18;
                short[] sArr5 = this.f10508j;
                System.arraycopy(sArr5, i18 * i14, sArr5, 0, i34 * i14);
                this.f10509k = i34;
                f7 = this.f10503e * f6;
                if (f7 != f4 || this.f10511m == i12) {
                }
                int i35 = (int) (i13 / f7);
                while (true) {
                    if (i35 <= 16384 && i13 <= 16384) {
                        break;
                    }
                    i35 /= 2;
                    i13 /= 2;
                }
                int i36 = this.f10511m - i12;
                short[] f16 = f(this.f10512n, this.f10513o, i36);
                this.f10512n = f16;
                System.arraycopy(this.f10510l, i12 * i14, f16, this.f10513o * i14, i36 * i14);
                this.f10511m = i12;
                this.f10513o += i36;
                int i37 = 0;
                while (true) {
                    i8 = this.f10513o;
                    i9 = i8 - 1;
                    if (i37 >= i9) {
                        break;
                    }
                    while (true) {
                        i10 = this.f10514p + 1;
                        int i38 = i10 * i35;
                        i11 = this.f10515q;
                        if (i38 <= i11 * i13) {
                            break;
                        }
                        this.f10510l = f(this.f10510l, this.f10511m, 1);
                        for (int i39 = 0; i39 < i14; i39++) {
                            short[] sArr6 = this.f10510l;
                            int i40 = this.f10511m * i14;
                            short[] sArr7 = this.f10512n;
                            int i41 = (i37 * i14) + i39;
                            short s4 = sArr7[i41];
                            short s5 = sArr7[i41 + i14];
                            int i42 = this.f10515q * i13;
                            int i43 = this.f10514p;
                            int i44 = i43 * i35;
                            int i45 = (i43 + 1) * i35;
                            int i46 = i45 - i42;
                            int i47 = i45 - i44;
                            sArr6[i40 + i39] = (short) ((((i47 - i46) * s5) + (s4 * i46)) / i47);
                        }
                        this.f10515q++;
                        this.f10511m++;
                    }
                    this.f10514p = i10;
                    if (i10 == i13) {
                        this.f10514p = 0;
                        Zf.X(i11 == i35);
                        this.f10515q = 0;
                    }
                    i37++;
                }
                if (i9 != 0) {
                    short[] sArr8 = this.f10512n;
                    System.arraycopy(sArr8, i9 * i14, sArr8, 0, (i8 - i9) * i14);
                    this.f10513o -= i9;
                    return;
                }
                return;
            }
        } else {
            b(this.f10508j, 0, this.f10509k);
            this.f10509k = 0;
        }
        f6 = f9;
        f4 = 1.0f;
        f7 = this.f10503e * f6;
        if (f7 != f4) {
        }
    }

    public final short[] f(short[] sArr, int i4, int i5) {
        int length = sArr.length;
        int i6 = this.f10502b;
        int i7 = length / i6;
        return i4 + i5 <= i7 ? sArr : Arrays.copyOf(sArr, (((i7 * 3) / 2) + i5) * i6);
    }
}
