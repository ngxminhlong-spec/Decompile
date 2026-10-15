package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0719i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9022a;

    static {
        int i4 = AbstractC0751is.f9071a;
        f9022a = "OpusHead".getBytes(AbstractC1480zs.c);
    }

    public static C0456bv a(C1134rq c1134rq) {
        long t4;
        long t5;
        c1134rq.e(8);
        if (AbstractC0505d1.b(c1134rq.h()) == 0) {
            t4 = c1134rq.u();
            t5 = c1134rq.u();
        } else {
            t4 = c1134rq.t();
            t5 = c1134rq.t();
        }
        return new C0456bv(t4, t5, c1134rq.u());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r12 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        r12 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0c3c, code lost:
    
        if (r3 <= 2) goto L585;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0fb1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0fdb  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0e53  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0f88  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0f8c  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0fea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:712:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(com.google.android.gms.internal.ads.C0420b1 r77, com.google.android.gms.internal.ads.J r78, long r79, com.google.android.gms.internal.ads.N r81, boolean r82, com.google.android.gms.internal.ads.As r83) {
        /*
            Method dump skipped, instructions count: 4084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0719i1.b(com.google.android.gms.internal.ads.b1, com.google.android.gms.internal.ads.J, long, com.google.android.gms.internal.ads.N, boolean, com.google.android.gms.internal.ads.As):java.util.ArrayList");
    }

    public static int c(C1134rq c1134rq) {
        int m4 = c1134rq.m();
        int i4 = m4 & 127;
        while ((m4 & 128) == 128) {
            m4 = c1134rq.m();
            i4 = (i4 << 7) | (m4 & 127);
        }
        return i4;
    }

    public static Pair d(C1134rq c1134rq, int i4, int i5) {
        Integer num;
        C1103r1 c1103r1;
        Pair create;
        int i6;
        int i7;
        Integer num2;
        boolean z4;
        int i8 = c1134rq.f10537b;
        while (i8 - i4 < i5) {
            c1134rq.e(i8);
            int h4 = c1134rq.h();
            AbstractC1230u.C("childAtomSize must be positive", h4 > 0);
            if (c1134rq.h() == 1936289382) {
                int i9 = i8 + 8;
                int i10 = 0;
                int i11 = -1;
                Integer num3 = null;
                String str = null;
                while (i9 - i8 < h4) {
                    c1134rq.e(i9);
                    int h5 = c1134rq.h();
                    int h6 = c1134rq.h();
                    if (h6 == 1718775137) {
                        num3 = Integer.valueOf(c1134rq.h());
                    } else if (h6 == 1935894637) {
                        c1134rq.f(4);
                        str = c1134rq.z(4, AbstractC1480zs.c);
                    } else if (h6 == 1935894633) {
                        i11 = i9;
                        i10 = h5;
                    }
                    i9 += h5;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    AbstractC1230u.C("frma atom is mandatory", num3 != null);
                    AbstractC1230u.C("schi atom is mandatory", i11 != -1);
                    int i12 = i11 + 8;
                    while (true) {
                        if (i12 - i11 >= i10) {
                            num = num3;
                            c1103r1 = null;
                            break;
                        }
                        c1134rq.e(i12);
                        int h7 = c1134rq.h();
                        if (c1134rq.h() == 1952804451) {
                            int b4 = AbstractC0505d1.b(c1134rq.h());
                            c1134rq.f(1);
                            if (b4 == 0) {
                                c1134rq.f(1);
                                i7 = 0;
                                i6 = 0;
                            } else {
                                int m4 = c1134rq.m();
                                i6 = m4 & 15;
                                i7 = (m4 & 240) >> 4;
                            }
                            if (c1134rq.m() == 1) {
                                num2 = num3;
                                z4 = true;
                            } else {
                                num2 = num3;
                                z4 = false;
                            }
                            int m5 = c1134rq.m();
                            byte[] bArr2 = new byte[16];
                            c1134rq.a(bArr2, 0, 16);
                            if (z4 && m5 == 0) {
                                int m6 = c1134rq.m();
                                byte[] bArr3 = new byte[m6];
                                c1134rq.a(bArr3, 0, m6);
                                bArr = bArr3;
                            }
                            num = num2;
                            c1103r1 = new C1103r1(z4, str, m5, bArr2, i7, i6, bArr);
                        } else {
                            i12 += h7;
                        }
                    }
                    AbstractC1230u.C("tenc atom is mandatory", c1103r1 != null);
                    int i13 = AbstractC0751is.f9071a;
                    create = Pair.create(num, c1103r1);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i8 += h4;
        }
        return null;
    }

    public static C0590f1 e(int i4, C1134rq c1134rq) {
        c1134rq.e(i4 + 12);
        c1134rq.f(1);
        c(c1134rq);
        c1134rq.f(2);
        int m4 = c1134rq.m();
        if ((m4 & 128) != 0) {
            c1134rq.f(2);
        }
        if ((m4 & 64) != 0) {
            c1134rq.f(c1134rq.m());
        }
        if ((m4 & 32) != 0) {
            c1134rq.f(2);
        }
        c1134rq.f(1);
        c(c1134rq);
        String d = AbstractC0438bd.d(c1134rq.m());
        if ("audio/mpeg".equals(d) || "audio/vnd.dts".equals(d) || "audio/vnd.dts.hd".equals(d)) {
            return new C0590f1(d, null, -1L, -1L);
        }
        c1134rq.f(4);
        long u2 = c1134rq.u();
        long u4 = c1134rq.u();
        c1134rq.f(1);
        int c = c(c1134rq);
        long j4 = u4;
        byte[] bArr = new byte[c];
        c1134rq.a(bArr, 0, c);
        if (j4 <= 0) {
            j4 = -1;
        }
        return new C0590f1(d, bArr, j4, u2 > 0 ? u2 : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03cb  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, com.google.android.gms.internal.ads.T0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.C1189t1 f(com.google.android.gms.internal.ads.C1061q1 r49, com.google.android.gms.internal.ads.C0420b1 r50, com.google.android.gms.internal.ads.J r51) {
        /*
            Method dump skipped, instructions count: 1589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0719i1.f(com.google.android.gms.internal.ads.q1, com.google.android.gms.internal.ads.b1, com.google.android.gms.internal.ads.J):com.google.android.gms.internal.ads.t1");
    }
}
