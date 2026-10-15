package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Wj {

    /* renamed from: D, reason: collision with root package name */
    public static final Hp f7527D;

    /* renamed from: a, reason: collision with root package name */
    public static final Hi f7534a;

    /* renamed from: v, reason: collision with root package name */
    public static A2.h f7553v;

    /* renamed from: w, reason: collision with root package name */
    public static Qw f7554w;

    /* renamed from: b, reason: collision with root package name */
    public static final Hi f7535b = new Hi(10);
    public static final Hi c = new Hi(11);
    public static final Hi d = new Hi(12);

    /* renamed from: e, reason: collision with root package name */
    public static final Hi f7536e = new Hi(13);

    /* renamed from: f, reason: collision with root package name */
    public static final Hi f7537f = new Hi(14);

    /* renamed from: g, reason: collision with root package name */
    public static final Hi f7538g = new Hi(15);

    /* renamed from: h, reason: collision with root package name */
    public static final Hi f7539h = new Hi(16);

    /* renamed from: i, reason: collision with root package name */
    public static final Hi f7540i = new Hi(17);

    /* renamed from: j, reason: collision with root package name */
    public static final Hi f7541j = new Hi(18);

    /* renamed from: k, reason: collision with root package name */
    public static final Hi f7542k = new Hi(19);

    /* renamed from: l, reason: collision with root package name */
    public static final Hi f7543l = new Hi(20);

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f7544m = {0, 0, 0, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f7545n = {"", "A", "B", "C"};

    /* renamed from: o, reason: collision with root package name */
    public static final Hi f7546o = new Hi(22);

    /* renamed from: p, reason: collision with root package name */
    public static final Hi f7547p = new Hi(23);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f7548q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Hi f7549r = new Hi(29);

    /* renamed from: s, reason: collision with root package name */
    public static final Hp f7550s = new Hp(0);

    /* renamed from: t, reason: collision with root package name */
    public static final Hp f7551t = new Hp(1);

    /* renamed from: u, reason: collision with root package name */
    public static final Hp f7552u = new Hp(2);

    /* renamed from: x, reason: collision with root package name */
    public static final Object f7555x = new Object();
    public static final Hp y = new Hp(4);

    /* renamed from: z, reason: collision with root package name */
    public static final Hp f7556z = new Hp(5);

    /* renamed from: A, reason: collision with root package name */
    public static final Hp f7524A = new Hp(6);

    /* renamed from: B, reason: collision with root package name */
    public static final Hp f7525B = new Hp(7);

    /* renamed from: C, reason: collision with root package name */
    public static final Hp f7526C = new Hp(8);

    /* renamed from: E, reason: collision with root package name */
    public static final Y f7528E = new Y(4);

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f7529F = new byte[0];

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f7530G = {0, 0, 0, 1};

    /* renamed from: H, reason: collision with root package name */
    public static final float[] f7531H = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: I, reason: collision with root package name */
    public static final Object f7532I = new Object();

    /* renamed from: J, reason: collision with root package name */
    public static int[] f7533J = new int[10];

    static {
        int i4 = 9;
        f7534a = new Hi(i4);
        f7527D = new Hp(i4);
    }

    public static int a(byte[] bArr, int i4, int i5, boolean[] zArr) {
        int i6 = i5 - i4;
        Zf.X(i6 >= 0);
        if (i6 == 0) {
            return i5;
        }
        if (zArr[0]) {
            m(zArr);
            return i4 - 3;
        }
        if (i6 > 1 && zArr[1] && bArr[i4] == 1) {
            m(zArr);
            return i4 - 2;
        }
        if (i6 > 2 && zArr[2] && bArr[i4] == 0 && bArr[i4 + 1] == 1) {
            m(zArr);
            return i4 - 1;
        }
        int i7 = i5 - 1;
        int i8 = i4 + 2;
        while (i8 < i7) {
            byte b4 = bArr[i8];
            if ((b4 & 254) == 0) {
                int i9 = i8 - 2;
                if (bArr[i9] == 0 && bArr[i8 - 1] == 0 && b4 == 1) {
                    m(zArr);
                    return i9;
                }
                i8 = i9;
            }
            i8 += 3;
        }
        zArr[0] = i6 <= 2 ? !(i6 != 2 ? !(zArr[1] && bArr[i7] == 1) : !(zArr[2] && bArr[i5 + (-2)] == 0 && bArr[i7] == 1)) : bArr[i5 + (-3)] == 0 && bArr[i5 + (-2)] == 0 && bArr[i7] == 1;
        zArr[1] = i6 <= 1 ? zArr[2] && bArr[i7] == 0 : bArr[i5 + (-2)] == 0 && bArr[i7] == 0;
        zArr[2] = bArr[i7] == 0;
        return i5;
    }

    public static String b(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (f7548q) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        return str + "\n  " + replace.replace("\n", "\n  ") + "\n";
    }

    public static int c(int i4, byte[] bArr) {
        int i5;
        synchronized (f7532I) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4) {
                while (true) {
                    try {
                        if (i6 >= i4 - 2) {
                            i6 = i4;
                            break;
                        }
                        int i8 = i6 + 1;
                        if (bArr[i6] == 0 && bArr[i8] == 0 && bArr[i6 + 2] == 3) {
                            break;
                        }
                        i6 = i8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i6 < i4) {
                    int[] iArr = f7533J;
                    int length = iArr.length;
                    if (length <= i7) {
                        f7533J = Arrays.copyOf(iArr, length + length);
                    }
                    f7533J[i7] = i6;
                    i6 += 3;
                    i7++;
                }
            }
            i5 = i4 - i7;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = f7533J[i11] - i9;
                System.arraycopy(bArr, i9, bArr, i10, i12);
                int i13 = i10 + i12;
                int i14 = i13 + 1;
                bArr[i13] = 0;
                i10 = i13 + 2;
                bArr[i14] = 0;
                i9 += i12 + 3;
            }
            System.arraycopy(bArr, i9, bArr, i10, i5 - i10);
        }
        return i5;
    }

    public static String d(int i4, boolean z4, int i5, int i6, int[] iArr, int i7) {
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", f7545n[i4], Integer.valueOf(i5), Integer.valueOf(i6), Character.valueOf(true != z4 ? 'L' : 'H'), Integer.valueOf(i7)));
        int i8 = 6;
        while (i8 > 0) {
            int i9 = i8 - 1;
            if (iArr[i9] != 0) {
                break;
            }
            i8 = i9;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i10])));
        }
        return sb.toString();
    }

    public static void e(Context context, boolean z4) {
        synchronized (f7555x) {
            try {
                if (f7554w == null) {
                    f7554w = new Qw(context, 15);
                }
                A2.h hVar = f7553v;
                if (hVar == null || ((hVar.i() && !f7553v.j()) || (z4 && f7553v.i()))) {
                    Qw qw = f7554w;
                    h2.y.j(qw, "the appSetIdClient shouldn't be null");
                    f7553v = qw.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f7548q) {
            Log.d(str, b(str2, null));
        }
    }

    public static C0925mv g(byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        X x4 = new X(bArr, i4, i5);
        int i15 = 4;
        x4.j(4);
        int b4 = x4.b(3);
        x4.g();
        int b5 = x4.b(2);
        boolean k3 = x4.k();
        int b6 = x4.b(5);
        int i16 = 0;
        for (int i17 = 0; i17 < 32; i17++) {
            if (x4.k()) {
                i16 |= 1 << i17;
            }
        }
        int i18 = 6;
        int[] iArr2 = new int[6];
        for (int i19 = 0; i19 < 6; i19++) {
            iArr2[i19] = x4.b(8);
        }
        int b7 = x4.b(8);
        int i20 = 0;
        for (int i21 = 0; i21 < b4; i21++) {
            if (x4.k()) {
                i20 += 89;
            }
            if (x4.k()) {
                i20 += 8;
            }
        }
        x4.j(i20);
        if (b4 > 0) {
            int i22 = 8 - b4;
            x4.j(i22 + i22);
        }
        x4.l();
        int l4 = x4.l();
        if (l4 == 3) {
            x4.g();
            l4 = 3;
        }
        int l5 = x4.l();
        int l6 = x4.l();
        if (x4.k()) {
            int l7 = x4.l();
            int l8 = x4.l();
            int l9 = x4.l();
            int l10 = x4.l();
            if (l4 == 1) {
                i14 = 2;
            } else if (l4 == 2) {
                l4 = 2;
                i14 = 2;
            } else {
                i14 = 1;
            }
            l5 -= (l7 + l8) * i14;
            l6 -= (l9 + l10) * (l4 == 1 ? 2 : 1);
        }
        int l11 = x4.l();
        int i23 = l5;
        int i24 = i16;
        int l12 = x4.l();
        int l13 = x4.l();
        for (int i25 = true != x4.k() ? b4 : 0; i25 <= b4; i25++) {
            x4.l();
            x4.l();
            x4.l();
        }
        x4.l();
        x4.l();
        x4.l();
        x4.l();
        x4.l();
        x4.l();
        if (x4.k() && x4.k()) {
            int i26 = 0;
            while (i26 < i15) {
                int i27 = 0;
                while (i27 < i18) {
                    if (x4.k()) {
                        int min = Math.min(64, 1 << ((i26 + i26) + 4));
                        if (i26 > 1) {
                            x4.c();
                        }
                        for (int i28 = 0; i28 < min; i28++) {
                            x4.c();
                        }
                    } else {
                        x4.l();
                    }
                    i27 += i26 == 3 ? 3 : 1;
                    i18 = 6;
                }
                i26++;
                i15 = 4;
                i18 = 6;
            }
        }
        x4.j(2);
        if (x4.k()) {
            x4.j(8);
            x4.l();
            x4.l();
            x4.g();
        }
        int l14 = x4.l();
        int i29 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i30 = -1;
        int i31 = -1;
        int i32 = -1;
        while (i29 < l14) {
            if (i29 == 0 || !x4.k()) {
                i10 = l14;
                i11 = i29;
                i12 = l11;
                int l15 = x4.l();
                i31 = x4.l();
                iArr = new int[l15];
                int i33 = 0;
                while (i33 < l15) {
                    iArr[i33] = (i33 > 0 ? iArr[i33 - 1] : 0) - (x4.l() + 1);
                    x4.g();
                    i33++;
                }
                int[] iArr5 = new int[i31];
                int i34 = 0;
                while (i34 < i31) {
                    iArr5[i34] = x4.l() + 1 + (i34 > 0 ? iArr5[i34 - 1] : 0);
                    x4.g();
                    i34++;
                }
                i32 = l15;
                iArr4 = iArr5;
            } else {
                int i35 = i32 + i31;
                boolean k4 = x4.k();
                int l16 = x4.l() + 1;
                int i36 = 1 - ((k4 ? 1 : 0) + (k4 ? 1 : 0));
                i10 = l14;
                int i37 = i35 + 1;
                i11 = i29;
                boolean[] zArr = new boolean[i37];
                for (int i38 = 0; i38 <= i35; i38++) {
                    if (x4.k()) {
                        zArr[i38] = true;
                    } else {
                        zArr[i38] = x4.k();
                    }
                }
                int i39 = i31 - 1;
                int[] iArr6 = new int[i37];
                int[] iArr7 = new int[i37];
                int i40 = 0;
                while (true) {
                    i13 = i36 * l16;
                    if (i39 < 0) {
                        break;
                    }
                    int i41 = iArr4[i39] + i13;
                    if (i41 < 0 && zArr[i32 + i39]) {
                        iArr6[i40] = i41;
                        i40++;
                    }
                    i39--;
                }
                if (i13 < 0 && zArr[i35]) {
                    iArr6[i40] = i13;
                    i40++;
                }
                i12 = l11;
                int i42 = i40;
                for (int i43 = 0; i43 < i32; i43++) {
                    int i44 = iArr3[i43] + i13;
                    if (i44 < 0 && zArr[i43]) {
                        iArr6[i42] = i44;
                        i42++;
                    }
                }
                iArr = Arrays.copyOf(iArr6, i42);
                int i45 = 0;
                for (int i46 = i32 - 1; i46 >= 0; i46--) {
                    int i47 = iArr3[i46] + i13;
                    if (i47 > 0 && zArr[i46]) {
                        iArr7[i45] = i47;
                        i45++;
                    }
                }
                if (i13 > 0 && zArr[i35]) {
                    iArr7[i45] = i13;
                    i45++;
                }
                int i48 = i45;
                for (int i49 = 0; i49 < i31; i49++) {
                    int i50 = iArr4[i49] + i13;
                    if (i50 > 0 && zArr[i32 + i49]) {
                        iArr7[i48] = i50;
                        i48++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr7, i48);
                i32 = i42;
                i31 = i48;
            }
            iArr3 = iArr;
            i29 = i11 + 1;
            l11 = i12;
            l14 = i10;
        }
        int i51 = l11;
        if (x4.k()) {
            int l17 = x4.l();
            for (int i52 = 0; i52 < l17; i52++) {
                x4.j(l13 + 5);
            }
        }
        x4.j(2);
        float f4 = 1.0f;
        if (x4.k()) {
            if (x4.k()) {
                int b8 = x4.b(8);
                if (b8 == 255) {
                    int b9 = x4.b(16);
                    int b10 = x4.b(16);
                    if (b9 != 0 && b10 != 0) {
                        f4 = b9 / b10;
                    }
                } else if (b8 < 17) {
                    f4 = f7531H[b8];
                } else {
                    U.a.p(b8, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (x4.k()) {
                x4.g();
            }
            if (x4.k()) {
                x4.j(3);
                int i53 = true != x4.k() ? 2 : 1;
                if (x4.k()) {
                    int b11 = x4.b(8);
                    int b12 = x4.b(8);
                    x4.j(8);
                    int a4 = ID.a(b11);
                    i7 = ID.b(b12);
                    i9 = a4;
                } else {
                    i9 = -1;
                    i7 = -1;
                }
                i30 = i53;
            } else {
                i9 = -1;
                i7 = -1;
            }
            if (x4.k()) {
                x4.l();
                x4.l();
            }
            x4.g();
            if (x4.k()) {
                l6 += l6;
            }
            i6 = l6;
            i8 = i30;
            i30 = i9;
        } else {
            i6 = l6;
            i7 = -1;
            i8 = -1;
        }
        return new C0925mv(b5, k3, b6, i24, i51, l12, iArr2, b7, i23, i6, f4, i30, i8, i7);
    }

    public static void h(String str, String str2) {
        synchronized (f7548q) {
            Log.e(str, b(str2, null));
        }
    }

    public static void i(String str, String str2, Throwable th) {
        synchronized (f7548q) {
            Log.e(str, b(str2, th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.Nv j(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Wj.j(byte[], int, int):com.google.android.gms.internal.ads.Nv");
    }

    public static void k(String str, String str2) {
        synchronized (f7548q) {
            Log.i(str, b(str2, null));
        }
    }

    public static void l(String str, String str2) {
        synchronized (f7548q) {
            Log.w(str, b(str2, null));
        }
    }

    public static void m(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void n(String str, String str2, Exception exc) {
        synchronized (f7548q) {
            Log.w(str, b(str2, exc));
        }
    }
}
