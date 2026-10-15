package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class KE implements V {

    /* renamed from: A, reason: collision with root package name */
    public C0388aC f5999A;

    /* renamed from: a, reason: collision with root package name */
    public final W1.o f6000a;
    public final Yv d;

    /* renamed from: e, reason: collision with root package name */
    public GE f6002e;

    /* renamed from: f, reason: collision with root package name */
    public C0976o2 f6003f;

    /* renamed from: n, reason: collision with root package name */
    public int f6011n;

    /* renamed from: o, reason: collision with root package name */
    public int f6012o;

    /* renamed from: p, reason: collision with root package name */
    public int f6013p;

    /* renamed from: q, reason: collision with root package name */
    public int f6014q;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6018u;

    /* renamed from: x, reason: collision with root package name */
    public C0976o2 f6021x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6022z;

    /* renamed from: b, reason: collision with root package name */
    public final QC f6001b = new Object();

    /* renamed from: g, reason: collision with root package name */
    public int f6004g = 1000;

    /* renamed from: h, reason: collision with root package name */
    public long[] f6005h = new long[1000];

    /* renamed from: i, reason: collision with root package name */
    public long[] f6006i = new long[1000];

    /* renamed from: l, reason: collision with root package name */
    public long[] f6009l = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public int[] f6008k = new int[1000];

    /* renamed from: j, reason: collision with root package name */
    public int[] f6007j = new int[1000];

    /* renamed from: m, reason: collision with root package name */
    public U[] f6010m = new U[1000];
    public final B0.r c = new B0.r(13, (byte) 0);

    /* renamed from: r, reason: collision with root package name */
    public long f6015r = Long.MIN_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public long f6016s = Long.MIN_VALUE;

    /* renamed from: t, reason: collision with root package name */
    public long f6017t = Long.MIN_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6020w = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6019v = true;
    public boolean y = true;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.QC, java.lang.Object] */
    public KE(C1058pz c1058pz, Yv yv) {
        this.d = yv;
        this.f6000a = new W1.o(c1058pz);
    }

    @Override // com.google.android.gms.internal.ads.V
    public final void a(C0976o2 c0976o2) {
        boolean z4;
        synchronized (this) {
            z4 = false;
            try {
                this.f6020w = false;
                if (!AbstractC0751is.c(c0976o2, this.f6021x)) {
                    if (!(((SparseArray) this.c.f113p).size() == 0)) {
                        if (((JE) ((SparseArray) this.c.f113p).valueAt(r1.size() - 1)).f5799a.equals(c0976o2)) {
                            this.f6021x = ((JE) ((SparseArray) this.c.f113p).valueAt(r5.size() - 1)).f5799a;
                            boolean z5 = this.y;
                            C0976o2 c0976o22 = this.f6021x;
                            this.y = z5 & AbstractC0438bd.e(c0976o22.f9813k, c0976o22.f9810h);
                            this.f6022z = false;
                            z4 = true;
                        }
                    }
                    this.f6021x = c0976o2;
                    boolean z52 = this.y;
                    C0976o2 c0976o222 = this.f6021x;
                    this.y = z52 & AbstractC0438bd.e(c0976o222.f9813k, c0976o222.f9810h);
                    this.f6022z = false;
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        GE ge = this.f6002e;
        if (ge == null || !z4) {
            return;
        }
        ge.f5178z.post(ge.f5177x);
    }

    @Override // com.google.android.gms.internal.ads.V
    public final int b(C c, int i4, boolean z4) {
        return e(c, i4, z4);
    }

    @Override // com.google.android.gms.internal.ads.V
    public final void c(int i4, C1134rq c1134rq) {
        while (true) {
            W1.o oVar = this.f6000a;
            if (i4 <= 0) {
                oVar.getClass();
                return;
            }
            int b4 = oVar.b(i4);
            C0590f1 c0590f1 = (C0590f1) oVar.f2017s;
            C0860lF c0860lF = (C0860lF) c0590f1.f8671q;
            byte[] bArr = c0860lF.f9431a;
            long j4 = oVar.f2013o - c0590f1.f8669o;
            c0860lF.getClass();
            c1134rq.a(bArr, (int) j4, b4);
            i4 -= b4;
            long j5 = oVar.f2013o + b4;
            oVar.f2013o = j5;
            C0590f1 c0590f12 = (C0590f1) oVar.f2017s;
            if (j5 == c0590f12.f8670p) {
                oVar.f2017s = (C0590f1) c0590f12.f8672r;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
    
        if (((com.google.android.gms.internal.ads.JE) ((android.util.SparseArray) r9.c.f113p).valueAt(r10.size() - 1)).f5799a.equals(r9.f6021x) == false) goto L41;
     */
    @Override // com.google.android.gms.internal.ads.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r10, int r12, int r13, int r14, com.google.android.gms.internal.ads.U r15) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.KE.d(long, int, int, int, com.google.android.gms.internal.ads.U):void");
    }

    @Override // com.google.android.gms.internal.ads.V
    public final int e(ZD zd, int i4, boolean z4) {
        W1.o oVar = this.f6000a;
        int b4 = oVar.b(i4);
        C0590f1 c0590f1 = (C0590f1) oVar.f2017s;
        C0860lF c0860lF = (C0860lF) c0590f1.f8671q;
        byte[] bArr = c0860lF.f9431a;
        long j4 = oVar.f2013o - c0590f1.f8669o;
        c0860lF.getClass();
        int r4 = zd.r(bArr, (int) j4, b4);
        if (r4 == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        long j5 = oVar.f2013o + r4;
        oVar.f2013o = j5;
        C0590f1 c0590f12 = (C0590f1) oVar.f2017s;
        if (j5 == c0590f12.f8670p) {
            oVar.f2017s = (C0590f1) c0590f12.f8672r;
        }
        return r4;
    }

    @Override // com.google.android.gms.internal.ads.V
    public final void f(int i4, C1134rq c1134rq) {
        c(i4, c1134rq);
    }

    public final synchronized boolean g(boolean z4, long j4) {
        Throwable th;
        KE ke;
        long j5;
        int h4;
        try {
            try {
                l();
                int i4 = this.f6014q;
                int i5 = i(i4);
                int i6 = this.f6014q;
                int i7 = this.f6011n;
                if ((i6 != i7) && j4 >= this.f6009l[i5]) {
                    if (j4 > this.f6017t) {
                        if (z4) {
                            z4 = true;
                        }
                    }
                    if (this.y) {
                        h4 = i7 - i4;
                        int i8 = 0;
                        while (true) {
                            if (i8 < h4) {
                                try {
                                    if (this.f6009l[i5] >= j4) {
                                        ke = this;
                                        j5 = j4;
                                        h4 = i8;
                                        break;
                                    }
                                    i5++;
                                    if (i5 == this.f6004g) {
                                        i5 = 0;
                                    }
                                    i8++;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                ke = this;
                                j5 = j4;
                                if (!z4) {
                                    h4 = -1;
                                }
                            }
                        }
                    } else {
                        ke = this;
                        j5 = j4;
                        h4 = ke.h(i5, i7 - i4, j5, true);
                    }
                    if (h4 == -1) {
                        return false;
                    }
                    ke.f6015r = j5;
                    ke.f6014q += h4;
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final int h(int i4, int i5, long j4, boolean z4) {
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            long j5 = this.f6009l[i4];
            if (j5 > j4) {
                break;
            }
            if (!z4 || (this.f6008k[i4] & 1) != 0) {
                if (j5 == j4) {
                    return i7;
                }
                i6 = i7;
            }
            i4++;
            if (i4 == this.f6004g) {
                i4 = 0;
            }
        }
        return i6;
    }

    public final int i(int i4) {
        int i5 = this.f6013p + i4;
        int i6 = this.f6004g;
        return i5 < i6 ? i5 : i5 - i6;
    }

    public final long j(int i4) {
        long j4 = this.f6016s;
        long j5 = Long.MIN_VALUE;
        int i5 = 0;
        if (i4 != 0) {
            int i6 = i(i4 - 1);
            for (int i7 = 0; i7 < i4; i7++) {
                j5 = Math.max(j5, this.f6009l[i6]);
                if ((this.f6008k[i6] & 1) != 0) {
                    break;
                }
                i6--;
                if (i6 == -1) {
                    i6 = this.f6004g - 1;
                }
            }
        }
        this.f6016s = Math.max(j4, j5);
        this.f6011n -= i4;
        int i8 = this.f6012o + i4;
        this.f6012o = i8;
        int i9 = this.f6013p + i4;
        this.f6013p = i9;
        int i10 = this.f6004g;
        if (i9 >= i10) {
            this.f6013p = i9 - i10;
        }
        int i11 = this.f6014q - i4;
        this.f6014q = i11;
        if (i11 < 0) {
            this.f6014q = 0;
        }
        B0.r rVar = this.c;
        SparseArray sparseArray = (SparseArray) rVar.f113p;
        while (i5 < sparseArray.size() - 1) {
            int i12 = i5 + 1;
            if (i8 < sparseArray.keyAt(i12)) {
                break;
            }
            ((JE) sparseArray.valueAt(i5)).getClass();
            sparseArray.removeAt(i5);
            int i13 = rVar.f112o;
            if (i13 > 0) {
                rVar.f112o = i13 - 1;
            }
            i5 = i12;
        }
        if (this.f6011n != 0) {
            return this.f6006i[this.f6013p];
        }
        int i14 = this.f6013p;
        if (i14 == 0) {
            i14 = this.f6004g;
        }
        return this.f6006i[i14 - 1] + this.f6007j[r12];
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.GD, java.lang.Exception] */
    public final void k(C0976o2 c0976o2, C0831kn c0831kn) {
        C0976o2 c0976o22 = this.f6003f;
        N n4 = c0976o22 == null ? null : c0976o22.f9816n;
        this.f6003f = c0976o2;
        N n5 = c0976o2.f9816n;
        this.d.getClass();
        int i4 = n5 != null ? 1 : 0;
        L1 l12 = new L1(c0976o2);
        l12.f6093E = i4;
        c0831kn.f9319p = new C0976o2(l12);
        c0831kn.f9320q = this.f5999A;
        if (c0976o22 == null || !AbstractC0751is.c(n4, n5)) {
            C0388aC c0388aC = n5 != null ? new C0388aC(6, new CD(new Exception())) : null;
            this.f5999A = c0388aC;
            c0831kn.f9320q = c0388aC;
        }
    }

    public final synchronized void l() {
        this.f6014q = 0;
        W1.o oVar = this.f6000a;
        oVar.f2016r = (C0590f1) oVar.f2015q;
    }

    public final synchronized long m() {
        return this.f6017t;
    }

    public final synchronized C0976o2 n() {
        if (this.f6020w) {
            return null;
        }
        return this.f6021x;
    }

    public final void o() {
        long j4;
        W1.o oVar = this.f6000a;
        synchronized (this) {
            int i4 = this.f6011n;
            j4 = i4 == 0 ? -1L : j(i4);
        }
        oVar.a(j4);
    }

    public final void p(boolean z4) {
        W1.o oVar = this.f6000a;
        C0590f1 c0590f1 = (C0590f1) oVar.f2015q;
        if (((C0860lF) c0590f1.f8671q) != null) {
            C1058pz c1058pz = (C1058pz) oVar.f2018t;
            synchronized (c1058pz) {
                C0590f1 c0590f12 = c0590f1;
                while (c0590f12 != null) {
                    try {
                        C0860lF[] c0860lFArr = (C0860lF[]) c1058pz.d;
                        int i4 = c1058pz.c;
                        c1058pz.c = i4 + 1;
                        C0860lF c0860lF = (C0860lF) c0590f12.f8671q;
                        c0860lF.getClass();
                        c0860lFArr[i4] = c0860lF;
                        c1058pz.f10061b--;
                        c0590f12 = (C0590f1) c0590f12.f8672r;
                        if (c0590f12 == null || ((C0860lF) c0590f12.f8671q) == null) {
                            c0590f12 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c1058pz.notifyAll();
            }
            c0590f1.f8671q = null;
            c0590f1.f8672r = null;
        }
        C0590f1 c0590f13 = (C0590f1) oVar.f2015q;
        Zf.X(((C0860lF) c0590f13.f8671q) == null);
        c0590f13.f8669o = 0L;
        c0590f13.f8670p = 65536L;
        C0590f1 c0590f14 = (C0590f1) oVar.f2015q;
        oVar.f2016r = c0590f14;
        oVar.f2017s = c0590f14;
        oVar.f2013o = 0L;
        ((C1058pz) oVar.f2018t).v();
        this.f6011n = 0;
        this.f6012o = 0;
        this.f6013p = 0;
        this.f6014q = 0;
        this.f6019v = true;
        this.f6015r = Long.MIN_VALUE;
        this.f6016s = Long.MIN_VALUE;
        this.f6017t = Long.MIN_VALUE;
        this.f6018u = false;
        B0.r rVar = this.c;
        SparseArray sparseArray = (SparseArray) rVar.f113p;
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            ((JE) sparseArray.valueAt(i5)).getClass();
        }
        rVar.f112o = -1;
        sparseArray.clear();
        if (z4) {
            this.f6021x = null;
            this.f6020w = true;
            this.y = true;
        }
    }

    public final synchronized void q(int i4) {
        boolean z4 = false;
        if (i4 >= 0) {
            try {
                if (this.f6014q + i4 <= this.f6011n) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Zf.O(z4);
        this.f6014q += i4;
    }

    public final synchronized boolean r(boolean z4) {
        int i4 = this.f6014q;
        boolean z5 = false;
        if (i4 != this.f6011n) {
            if (((JE) this.c.l(this.f6012o + i4)).f5799a != this.f6003f) {
                return true;
            }
            int i5 = i(this.f6014q);
            if (this.f5999A != null) {
                int i6 = this.f6008k[i5];
            } else {
                z5 = true;
            }
            return z5;
        }
        if (!z4 && !this.f6018u) {
            C0976o2 c0976o2 = this.f6021x;
            if (c0976o2 != null) {
                if (c0976o2 == this.f6003f) {
                    return false;
                }
            }
            return z5;
        }
        z5 = true;
        return z5;
    }
}
