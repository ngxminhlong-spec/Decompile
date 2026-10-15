package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D1 extends C1 {

    /* renamed from: n, reason: collision with root package name */
    public C0817kF f4566n;

    /* renamed from: o, reason: collision with root package name */
    public int f4567o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4568p;

    /* renamed from: q, reason: collision with root package name */
    public M f4569q;

    /* renamed from: r, reason: collision with root package name */
    public M3 f4570r;

    @Override // com.google.android.gms.internal.ads.C1
    public final long a(C1134rq c1134rq) {
        byte b4 = c1134rq.f10536a[0];
        if ((b4 & 1) == 1) {
            return -1L;
        }
        C0817kF c0817kF = this.f4566n;
        Zf.C(c0817kF);
        M m4 = (M) c0817kF.f9285p;
        int i4 = !((Y[]) c0817kF.f9288s)[(b4 >> 1) & (255 >>> (8 - c0817kF.f9284o))].f7724p ? m4.f6187e : m4.f6188f;
        int i5 = this.f4568p ? (this.f4567o + i4) / 4 : 0;
        byte[] bArr = c1134rq.f10536a;
        int length = bArr.length;
        int i6 = c1134rq.c + 4;
        if (length < i6) {
            byte[] copyOf = Arrays.copyOf(bArr, i6);
            c1134rq.c(copyOf.length, copyOf);
        } else {
            c1134rq.d(i6);
        }
        long j4 = i5;
        byte[] bArr2 = c1134rq.f10536a;
        int i7 = c1134rq.c;
        bArr2[i7 - 4] = (byte) (j4 & 255);
        bArr2[i7 - 3] = (byte) ((j4 >>> 8) & 255);
        bArr2[i7 - 2] = (byte) ((j4 >>> 16) & 255);
        bArr2[i7 - 1] = (byte) ((j4 >>> 24) & 255);
        this.f4568p = true;
        this.f4567o = i4;
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final void b(boolean z4) {
        super.b(z4);
        if (z4) {
            this.f4566n = null;
            this.f4569q = null;
            this.f4570r = null;
        }
        this.f4567o = 0;
        this.f4568p = false;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.X, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v57, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.ads.M, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.C1
    public final boolean c(C1134rq c1134rq, long j4, C0783ji c0783ji) {
        C0817kF c0817kF;
        int i4;
        M m4;
        long j5;
        if (this.f4566n != null) {
            ((C0976o2) c0783ji.f9211p).getClass();
            return false;
        }
        M m5 = this.f4569q;
        int i5 = 4;
        if (m5 == null) {
            AbstractC1230u.T(1, c1134rq, false);
            c1134rq.j();
            int m6 = c1134rq.m();
            int j6 = c1134rq.j();
            int i6 = c1134rq.i();
            if (i6 <= 0) {
                i6 = -1;
            }
            int i7 = c1134rq.i();
            int i8 = i7 <= 0 ? -1 : i7;
            c1134rq.i();
            int m7 = c1134rq.m();
            int pow = (int) Math.pow(2.0d, m7 & 15);
            int pow2 = (int) Math.pow(2.0d, (m7 & 240) >> 4);
            c1134rq.m();
            ?? copyOf = Arrays.copyOf(c1134rq.f10536a, c1134rq.c);
            ?? obj = new Object();
            obj.f6185a = m6;
            obj.f6186b = j6;
            obj.c = i6;
            obj.d = i8;
            obj.f6187e = pow;
            obj.f6188f = pow2;
            obj.f6189g = copyOf;
            this.f4569q = obj;
        } else {
            M3 m32 = this.f4570r;
            if (m32 == null) {
                this.f4570r = AbstractC1230u.H(c1134rq, true, true);
            } else {
                int i9 = c1134rq.c;
                byte[] bArr = new byte[i9];
                System.arraycopy(c1134rq.f10536a, 0, bArr, 0, i9);
                int i10 = m5.f6185a;
                int i11 = 5;
                AbstractC1230u.T(5, c1134rq, false);
                int m8 = c1134rq.m() + 1;
                byte[] bArr2 = c1134rq.f10536a;
                ?? obj2 = new Object();
                obj2.f7583a = bArr2;
                obj2.f7584b = bArr2.length;
                int i12 = 8;
                obj2.e(c1134rq.f10537b * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 2;
                    int i15 = i12;
                    int i16 = 16;
                    if (i13 >= m8) {
                        M m9 = m5;
                        int i17 = 6;
                        int d = obj2.d(6) + 1;
                        for (int i18 = 0; i18 < d; i18++) {
                            if (obj2.d(16) != 0) {
                                throw C0907md.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i19 = 1;
                        int d4 = obj2.d(6) + 1;
                        int i20 = 0;
                        while (true) {
                            int i21 = 3;
                            if (i20 < d4) {
                                int d5 = obj2.d(i16);
                                if (d5 == 0) {
                                    int i22 = i15;
                                    obj2.e(i22);
                                    obj2.e(16);
                                    obj2.e(16);
                                    obj2.e(6);
                                    obj2.e(i22);
                                    int d6 = obj2.d(4) + 1;
                                    int i23 = 0;
                                    while (i23 < d6) {
                                        obj2.e(i22);
                                        i23++;
                                        i22 = 8;
                                    }
                                } else {
                                    if (d5 != i19) {
                                        throw C0907md.a("floor type greater than 1 not decodable: " + d5, null);
                                    }
                                    int d7 = obj2.d(5);
                                    int[] iArr = new int[d7];
                                    int i24 = -1;
                                    for (int i25 = 0; i25 < d7; i25++) {
                                        int d8 = obj2.d(4);
                                        iArr[i25] = d8;
                                        if (d8 > i24) {
                                            i24 = d8;
                                        }
                                    }
                                    int i26 = i24 + 1;
                                    int[] iArr2 = new int[i26];
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        iArr2[i27] = obj2.d(i21) + 1;
                                        int d9 = obj2.d(2);
                                        if (d9 > 0) {
                                            i4 = i15;
                                            obj2.e(i4);
                                        } else {
                                            i4 = i15;
                                        }
                                        int i28 = i26;
                                        int i29 = 0;
                                        for (int i30 = 1; i29 < (i30 << d9); i30 = 1) {
                                            obj2.e(i4);
                                            i29++;
                                            i4 = 8;
                                        }
                                        i27++;
                                        i26 = i28;
                                        i15 = 8;
                                        i21 = 3;
                                    }
                                    obj2.e(2);
                                    int d10 = obj2.d(4);
                                    int i31 = 0;
                                    int i32 = 0;
                                    for (int i33 = 0; i33 < d7; i33++) {
                                        i31 += iArr2[iArr[i33]];
                                        while (i32 < i31) {
                                            obj2.e(d10);
                                            i32++;
                                        }
                                    }
                                }
                                i20++;
                                i15 = 8;
                                i17 = 6;
                                i19 = 1;
                                i16 = 16;
                            } else {
                                int d11 = obj2.d(i17) + 1;
                                int i34 = 0;
                                while (i34 < d11) {
                                    if (obj2.d(16) > 2) {
                                        throw C0907md.a("residueType greater than 2 is not decodable", null);
                                    }
                                    obj2.e(24);
                                    obj2.e(24);
                                    obj2.e(24);
                                    int d12 = obj2.d(i17) + 1;
                                    int i35 = 8;
                                    obj2.e(8);
                                    int[] iArr3 = new int[d12];
                                    for (int i36 = 0; i36 < d12; i36++) {
                                        iArr3[i36] = ((obj2.h() ? obj2.d(5) : 0) * 8) + obj2.d(3);
                                    }
                                    int i37 = 0;
                                    while (i37 < d12) {
                                        int i38 = 0;
                                        while (i38 < i35) {
                                            if ((iArr3[i37] & (1 << i38)) != 0) {
                                                obj2.e(i35);
                                            }
                                            i38++;
                                            i35 = 8;
                                        }
                                        i37++;
                                        i35 = 8;
                                    }
                                    i34++;
                                    i17 = 6;
                                }
                                int d13 = obj2.d(i17) + 1;
                                for (int i39 = 0; i39 < d13; i39++) {
                                    int d14 = obj2.d(16);
                                    if (d14 != 0) {
                                        Wj.h("VorbisUtil", "mapping type other than 0 not supported: " + d14);
                                    } else {
                                        int d15 = obj2.h() ? obj2.d(4) + 1 : 1;
                                        if (obj2.h()) {
                                            int d16 = obj2.d(8) + 1;
                                            for (int i40 = 0; i40 < d16; i40++) {
                                                int i41 = i10 - 1;
                                                int i42 = i41;
                                                int i43 = 0;
                                                while (i42 > 0) {
                                                    i42 >>>= 1;
                                                    i43++;
                                                }
                                                obj2.e(i43);
                                                int i44 = 0;
                                                while (i41 > 0) {
                                                    i41 >>>= 1;
                                                    i44++;
                                                }
                                                obj2.e(i44);
                                            }
                                        }
                                        if (obj2.d(2) != 0) {
                                            throw C0907md.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (d15 > 1) {
                                            for (int i45 = 0; i45 < i10; i45++) {
                                                obj2.e(4);
                                            }
                                        }
                                        for (int i46 = 0; i46 < d15; i46++) {
                                            obj2.e(8);
                                            obj2.e(8);
                                            obj2.e(8);
                                        }
                                    }
                                }
                                int d17 = obj2.d(6);
                                int i47 = d17 + 1;
                                Y[] yArr = new Y[i47];
                                for (int i48 = 0; i48 < i47; i48++) {
                                    boolean h4 = obj2.h();
                                    obj2.d(16);
                                    obj2.d(16);
                                    obj2.d(8);
                                    yArr[i48] = new Y(0, h4);
                                }
                                if (!obj2.h()) {
                                    throw C0907md.a("framing bit after modes not set as expected", null);
                                }
                                int i49 = 0;
                                while (d17 > 0) {
                                    d17 >>>= 1;
                                    i49++;
                                }
                                c0817kF = new C0817kF(m9, m32, bArr, yArr, i49);
                            }
                        }
                    } else {
                        if (obj2.d(24) != 5653314) {
                            throw C0907md.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((obj2.c * 8) + obj2.d), null);
                        }
                        int d18 = obj2.d(16);
                        int d19 = obj2.d(24);
                        if (obj2.h()) {
                            obj2.e(i11);
                            int i50 = 0;
                            while (i50 < d19) {
                                int i51 = d19 - i50;
                                int i52 = 0;
                                while (i51 > 0) {
                                    i51 >>>= 1;
                                    i52++;
                                }
                                i50 += obj2.d(i52);
                            }
                        } else {
                            boolean h5 = obj2.h();
                            for (int i53 = 0; i53 < d19; i53++) {
                                if (!h5) {
                                    obj2.e(i11);
                                } else if (obj2.h()) {
                                    obj2.e(i11);
                                }
                            }
                        }
                        int d20 = obj2.d(i5);
                        if (d20 > 2) {
                            throw C0907md.a("lookup type greater than 2 not decodable: " + d20, null);
                        }
                        if (d20 == 1) {
                            i14 = d20;
                        } else if (d20 != 2) {
                            m4 = m5;
                            i13++;
                            i12 = i15;
                            m5 = m4;
                            i5 = 4;
                            i11 = 5;
                        }
                        obj2.e(32);
                        obj2.e(32);
                        int d21 = obj2.d(i5) + 1;
                        obj2.e(1);
                        if (i14 != 1) {
                            m4 = m5;
                            j5 = d19 * d18;
                        } else if (d18 != 0) {
                            m4 = m5;
                            j5 = (long) Math.floor(Math.pow(d19, 1.0d / d18));
                        } else {
                            m4 = m5;
                            j5 = 0;
                        }
                        obj2.e((int) (j5 * d21));
                        i13++;
                        i12 = i15;
                        m5 = m4;
                        i5 = 4;
                        i11 = 5;
                    }
                }
            }
        }
        c0817kF = null;
        this.f4566n = c0817kF;
        if (c0817kF == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        M m10 = (M) c0817kF.f9285p;
        arrayList.add((byte[]) m10.f6189g);
        arrayList.add((byte[]) c0817kF.f9287r);
        C1120rc w2 = AbstractC1230u.w(AbstractC1137rt.s((String[]) ((M3) c0817kF.f9286q).f6208p));
        L1 l12 = new L1();
        l12.f6101j = "audio/vorbis";
        l12.f6096e = m10.d;
        l12.f6097f = m10.c;
        l12.f6114w = m10.f6185a;
        l12.f6115x = m10.f6186b;
        l12.f6103l = arrayList;
        l12.f6099h = w2;
        c0783ji.f9211p = new C0976o2(l12);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final void d(long j4) {
        this.f4219g = j4;
        this.f4568p = j4 != 0;
        M m4 = this.f4569q;
        this.f4567o = m4 != null ? m4.f6187e : 0;
    }
}
