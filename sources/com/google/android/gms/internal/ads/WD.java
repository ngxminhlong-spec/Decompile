package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class WD implements GC {

    /* renamed from: L0, reason: collision with root package name */
    public static final byte[] f7358L0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public long f7359A;

    /* renamed from: A0, reason: collision with root package name */
    public long f7360A0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f7361B;

    /* renamed from: B0, reason: collision with root package name */
    public long f7362B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f7363C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f7364C0;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC0484ch f7365D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f7366D0;

    /* renamed from: E, reason: collision with root package name */
    public final Yv f7367E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f7368E0;

    /* renamed from: F, reason: collision with root package name */
    public final float f7369F;

    /* renamed from: F0, reason: collision with root package name */
    public VB f7370F0;

    /* renamed from: G, reason: collision with root package name */
    public final RB f7371G;

    /* renamed from: G0, reason: collision with root package name */
    public VD f7372G0;

    /* renamed from: H, reason: collision with root package name */
    public final RB f7373H;

    /* renamed from: H0, reason: collision with root package name */
    public long f7374H0;

    /* renamed from: I, reason: collision with root package name */
    public final RB f7375I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f7376I0;

    /* renamed from: J, reason: collision with root package name */
    public final ND f7377J;
    public C0388aC J0;

    /* renamed from: K, reason: collision with root package name */
    public final MediaCodec.BufferInfo f7378K;

    /* renamed from: K0, reason: collision with root package name */
    public C0388aC f7379K0;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayDeque f7380L;

    /* renamed from: M, reason: collision with root package name */
    public final T0 f7381M;
    public C0976o2 N;

    /* renamed from: O, reason: collision with root package name */
    public C0976o2 f7382O;

    /* renamed from: P, reason: collision with root package name */
    public final long f7383P;

    /* renamed from: Q, reason: collision with root package name */
    public float f7384Q;

    /* renamed from: R, reason: collision with root package name */
    public float f7385R;

    /* renamed from: S, reason: collision with root package name */
    public PD f7386S;

    /* renamed from: T, reason: collision with root package name */
    public C0976o2 f7387T;

    /* renamed from: U, reason: collision with root package name */
    public MediaFormat f7388U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f7389V;

    /* renamed from: W, reason: collision with root package name */
    public float f7390W;

    /* renamed from: X, reason: collision with root package name */
    public ArrayDeque f7391X;

    /* renamed from: Y, reason: collision with root package name */
    public UD f7392Y;

    /* renamed from: Z, reason: collision with root package name */
    public SD f7393Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f7394a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f7395b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f7396c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f7397d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f7398e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f7399f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f7400g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f7401h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f7402i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f7403j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f7404k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f7405l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f7406m0;

    /* renamed from: n0, reason: collision with root package name */
    public ByteBuffer f7407n0;

    /* renamed from: o, reason: collision with root package name */
    public final Object f7408o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f7409o0;

    /* renamed from: p, reason: collision with root package name */
    public final int f7410p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f7411p0;

    /* renamed from: q, reason: collision with root package name */
    public final C0831kn f7412q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f7413q0;

    /* renamed from: r, reason: collision with root package name */
    public KC f7414r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f7415r0;

    /* renamed from: s, reason: collision with root package name */
    public int f7416s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f7417s0;

    /* renamed from: t, reason: collision with root package name */
    public C0474cD f7418t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f7419t0;

    /* renamed from: u, reason: collision with root package name */
    public C1475zn f7420u;

    /* renamed from: u0, reason: collision with root package name */
    public int f7421u0;

    /* renamed from: v, reason: collision with root package name */
    public int f7422v;

    /* renamed from: v0, reason: collision with root package name */
    public int f7423v0;

    /* renamed from: w, reason: collision with root package name */
    public LE f7424w;

    /* renamed from: w0, reason: collision with root package name */
    public int f7425w0;

    /* renamed from: x, reason: collision with root package name */
    public C0976o2[] f7426x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f7427x0;
    public long y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f7428y0;

    /* renamed from: z, reason: collision with root package name */
    public long f7429z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f7430z0;

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, com.google.android.gms.internal.ads.VB] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.ND, com.google.android.gms.internal.ads.RB] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, com.google.android.gms.internal.ads.T0] */
    public WD(int i4, float f4) {
        Yv yv = Yv.f7919Q;
        this.f7408o = new Object();
        this.f7410p = i4;
        this.f7412q = new C0831kn(5, false);
        this.f7359A = Long.MIN_VALUE;
        this.f7365D = AbstractC0484ch.f8374a;
        this.f7367E = yv;
        this.f7369F = f4;
        this.f7371G = new RB(0);
        this.f7373H = new RB(0);
        this.f7375I = new RB(2);
        ?? rb = new RB(2);
        rb.f6313l = 32;
        this.f7377J = rb;
        this.f7378K = new MediaCodec.BufferInfo();
        this.f7384Q = 1.0f;
        this.f7385R = 1.0f;
        this.f7383P = -9223372036854775807L;
        this.f7380L = new ArrayDeque();
        this.f7372G0 = VD.f7257e;
        rb.e(0);
        rb.f6791e.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.c = InterfaceC0403al.f8159a;
        obj.f7030b = 0;
        obj.f7029a = 2;
        this.f7381M = obj;
        this.f7390W = -1.0f;
        this.f7394a0 = 0;
        this.f7421u0 = 0;
        this.f7405l0 = -1;
        this.f7406m0 = -1;
        this.f7404k0 = -9223372036854775807L;
        this.f7360A0 = -9223372036854775807L;
        this.f7362B0 = -9223372036854775807L;
        this.f7374H0 = -9223372036854775807L;
        this.f7423v0 = 0;
        this.f7425w0 = 0;
        this.f7370F0 = new Object();
    }

    public final void A() {
        this.f7406m0 = -1;
        this.f7407n0 = null;
    }

    public final void B(VD vd) {
        this.f7372G0 = vd;
        if (vd.c != -9223372036854775807L) {
            this.f7376I0 = true;
        }
    }

    public final boolean C() {
        if (!this.f7427x0) {
            C0388aC c0388aC = this.f7379K0;
            c0388aC.getClass();
            this.J0 = c0388aC;
            this.f7423v0 = 0;
            this.f7425w0 = 0;
            return true;
        }
        this.f7423v0 = 1;
        if (this.f7396c0 || this.f7398e0) {
            this.f7425w0 = 3;
            return false;
        }
        this.f7425w0 = 2;
        return true;
    }

    public final boolean D() {
        PD pd = this.f7386S;
        if (pd != null && this.f7423v0 != 2 && !this.f7364C0) {
            int i4 = this.f7405l0;
            RB rb = this.f7373H;
            if (i4 < 0) {
                int b4 = pd.b();
                this.f7405l0 = b4;
                if (b4 >= 0) {
                    rb.f6791e = pd.d(b4);
                    rb.d();
                }
            }
            if (this.f7423v0 == 1) {
                if (!this.f7403j0) {
                    this.f7428y0 = true;
                    pd.i(this.f7405l0, 0, 4, 0L);
                    this.f7405l0 = -1;
                    rb.f6791e = null;
                }
                this.f7423v0 = 2;
                return false;
            }
            if (this.f7401h0) {
                this.f7401h0 = false;
                ByteBuffer byteBuffer = rb.f6791e;
                byteBuffer.getClass();
                byteBuffer.put(f7358L0);
                pd.i(this.f7405l0, 38, 0, 0L);
                this.f7405l0 = -1;
                rb.f6791e = null;
                this.f7427x0 = true;
                return true;
            }
            if (this.f7421u0 == 1) {
                int i5 = 0;
                while (true) {
                    C0976o2 c0976o2 = this.f7387T;
                    c0976o2.getClass();
                    if (i5 >= c0976o2.f9815m.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.f7387T.f9815m.get(i5);
                    ByteBuffer byteBuffer2 = rb.f6791e;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i5++;
                }
                this.f7421u0 = 2;
            }
            ByteBuffer byteBuffer3 = rb.f6791e;
            PB pb = rb.d;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            C0831kn c0831kn = this.f7412q;
            c0831kn.f9320q = null;
            c0831kn.f9319p = null;
            try {
                int b02 = b0(c0831kn, rb, 0);
                char c = 65533;
                if (b02 == -3) {
                    if (l()) {
                        this.f7362B0 = this.f7360A0;
                        return false;
                    }
                } else {
                    if (b02 == -5) {
                        if (this.f7421u0 == 2) {
                            rb.d();
                            this.f7421u0 = 1;
                        }
                        G(c0831kn);
                        return true;
                    }
                    if (!rb.a(4)) {
                        if (this.f7427x0 || rb.a(1)) {
                            boolean a4 = rb.a(1073741824);
                            if (a4) {
                                if (position == 0) {
                                    pb.getClass();
                                } else {
                                    if (pb.d == null) {
                                        int[] iArr = new int[1];
                                        pb.d = iArr;
                                        pb.f6578i.numBytesOfClearData = iArr;
                                    }
                                    int[] iArr2 = pb.d;
                                    iArr2[0] = iArr2[0] + position;
                                }
                            }
                            if (this.f7395b0 && !a4) {
                                ByteBuffer byteBuffer4 = rb.f6791e;
                                byteBuffer4.getClass();
                                int position2 = byteBuffer4.position();
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    int i8 = i6 + 1;
                                    if (i8 >= position2) {
                                        byteBuffer4.clear();
                                        break;
                                    }
                                    int i9 = byteBuffer4.get(i6) & 255;
                                    char c2 = c;
                                    if (i7 == 3) {
                                        if (i9 == 1) {
                                            if ((byteBuffer4.get(i8) & 31) == 7) {
                                                ByteBuffer duplicate = byteBuffer4.duplicate();
                                                duplicate.position(i6 - 3);
                                                duplicate.limit(position2);
                                                byteBuffer4.position(0);
                                                byteBuffer4.put(duplicate);
                                                break;
                                            }
                                            i9 = 1;
                                        }
                                    } else if (i9 == 0) {
                                        i7++;
                                    }
                                    if (i9 != 0) {
                                        i7 = 0;
                                    }
                                    i6 = i8;
                                    c = c2;
                                }
                                ByteBuffer byteBuffer5 = rb.f6791e;
                                byteBuffer5.getClass();
                                if (byteBuffer5.position() != 0) {
                                    this.f7395b0 = false;
                                }
                            }
                            long j4 = rb.f6793g;
                            if (this.f7368E0) {
                                ArrayDeque arrayDeque = this.f7380L;
                                if (arrayDeque.isEmpty()) {
                                    O2 o22 = this.f7372G0.d;
                                    C0976o2 c0976o22 = this.N;
                                    c0976o22.getClass();
                                    o22.d(j4, c0976o22);
                                } else {
                                    O2 o23 = ((VD) arrayDeque.peekLast()).d;
                                    C0976o2 c0976o23 = this.N;
                                    c0976o23.getClass();
                                    o23.d(j4, c0976o23);
                                }
                                this.f7368E0 = false;
                            }
                            long max = Math.max(this.f7360A0, j4);
                            this.f7360A0 = max;
                            if (l() || rb.a(536870912)) {
                                this.f7362B0 = max;
                            }
                            rb.f();
                            if (rb.a(268435456)) {
                                L(rb);
                            }
                            Y();
                            try {
                                if (a4) {
                                    pd.n(this.f7405l0, pb, j4);
                                } else {
                                    int i10 = this.f7405l0;
                                    ByteBuffer byteBuffer6 = rb.f6791e;
                                    if (byteBuffer6 == null) {
                                        throw null;
                                    }
                                    pd.i(i10, byteBuffer6.limit(), 0, j4);
                                }
                                this.f7405l0 = -1;
                                rb.f6791e = null;
                                this.f7427x0 = true;
                                this.f7421u0 = 0;
                                this.f7370F0.c++;
                                return true;
                            } catch (MediaCodec.CryptoException e4) {
                                throw d0(e4, this.N, false, AbstractC0751is.o(e4.getErrorCode()));
                            }
                        }
                        rb.d();
                        if (this.f7421u0 == 2) {
                            this.f7421u0 = 1;
                            return true;
                        }
                        return true;
                    }
                    this.f7362B0 = this.f7360A0;
                    if (this.f7421u0 == 2) {
                        rb.d();
                        this.f7421u0 = 1;
                    }
                    this.f7364C0 = true;
                    if (!this.f7427x0) {
                        z();
                        return false;
                    }
                    try {
                        if (!this.f7403j0) {
                            this.f7428y0 = true;
                            pd.i(this.f7405l0, 0, 4, 0L);
                            this.f7405l0 = -1;
                            rb.f6791e = null;
                            return false;
                        }
                    } catch (MediaCodec.CryptoException e5) {
                        throw d0(e5, this.N, false, AbstractC0751is.o(e5.getErrorCode()));
                    }
                }
            } catch (QB e6) {
                M(e6);
                E(0);
                Q();
                return true;
            }
        }
        return false;
    }

    public final boolean E(int i4) {
        C0831kn c0831kn = this.f7412q;
        c0831kn.f9320q = null;
        c0831kn.f9319p = null;
        RB rb = this.f7371G;
        rb.d();
        int b02 = b0(c0831kn, rb, i4 | 4);
        if (b02 == -5) {
            G(c0831kn);
            return true;
        }
        if (b02 != -4 || !rb.a(4)) {
            return false;
        }
        this.f7364C0 = true;
        z();
        return false;
    }

    public final boolean F(C0976o2 c0976o2) {
        if (AbstractC0751is.f9071a >= 23 && this.f7386S != null && this.f7425w0 != 3 && this.f7422v != 0) {
            float f4 = this.f7385R;
            c0976o2.getClass();
            C0976o2[] c0976o2Arr = this.f7426x;
            c0976o2Arr.getClass();
            float r4 = r(f4, c0976o2Arr);
            float f5 = this.f7390W;
            if (f5 != r4) {
                if (r4 == -1.0f) {
                    I();
                    return false;
                }
                if (f5 != -1.0f || r4 > this.f7369F) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", r4);
                    PD pd = this.f7386S;
                    pd.getClass();
                    pd.f(bundle);
                    this.f7390W = r4;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if (C() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009b, code lost:
    
        if (C() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ad, code lost:
    
        if (C() == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.WB G(com.google.android.gms.internal.ads.C0831kn r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WD.G(com.google.android.gms.internal.ads.kn):com.google.android.gms.internal.ads.WB");
    }

    public final void H() {
        this.f7417s0 = false;
        this.f7377J.d();
        this.f7375I.d();
        this.f7415r0 = false;
        this.f7413q0 = false;
        T0 t02 = this.f7381M;
        t02.getClass();
        t02.c = InterfaceC0403al.f8159a;
        t02.f7030b = 0;
        t02.f7029a = 2;
    }

    public final void I() {
        if (this.f7427x0) {
            this.f7423v0 = 1;
            this.f7425w0 = 3;
        } else {
            a0();
            W();
        }
    }

    public abstract OD J(SD sd, C0976o2 c0976o2, float f4);

    public abstract ArrayList K(Yv yv, C0976o2 c0976o2);

    public abstract void L(RB rb);

    public abstract void M(Exception exc);

    public abstract void N(long j4, long j5, String str);

    public abstract void O(String str);

    public abstract void P(C0976o2 c0976o2, MediaFormat mediaFormat);

    public final void Q() {
        try {
            PD pd = this.f7386S;
            Zf.C(pd);
            pd.g();
        } finally {
            u();
        }
    }

    public abstract void R();

    public void S() {
    }

    public abstract boolean T(long j4, long j5, PD pd, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z4, boolean z5, C0976o2 c0976o2);

    public boolean U(C0976o2 c0976o2) {
        return false;
    }

    public QD V(IllegalStateException illegalStateException, SD sd) {
        return new QD(illegalStateException, sd);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea A[Catch: UD -> 0x007f, TryCatch #3 {UD -> 0x007f, blocks: (B:27:0x0054, B:29:0x0059, B:81:0x005d, B:83:0x0073, B:84:0x0084, B:31:0x0090, B:33:0x0098, B:35:0x009c, B:36:0x00a3, B:38:0x00a7, B:40:0x00b0, B:55:0x00d0, B:57:0x00ea, B:58:0x0102, B:63:0x0109, B:64:0x010b, B:65:0x00ed, B:73:0x010c, B:75:0x010d, B:77:0x0110, B:78:0x0111, B:79:0x0119, B:88:0x0087, B:89:0x008f, B:90:0x011a, B:51:0x00bf, B:67:0x00cf, B:43:0x00b6), top: B:26:0x0054, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed A[Catch: UD -> 0x007f, TryCatch #3 {UD -> 0x007f, blocks: (B:27:0x0054, B:29:0x0059, B:81:0x005d, B:83:0x0073, B:84:0x0084, B:31:0x0090, B:33:0x0098, B:35:0x009c, B:36:0x00a3, B:38:0x00a7, B:40:0x00b0, B:55:0x00d0, B:57:0x00ea, B:58:0x0102, B:63:0x0109, B:64:0x010b, B:65:0x00ed, B:73:0x010c, B:75:0x010d, B:77:0x0110, B:78:0x0111, B:79:0x0119, B:88:0x0087, B:89:0x008f, B:90:0x011a, B:51:0x00bf, B:67:0x00cf, B:43:0x00b6), top: B:26:0x0054, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WD.W():void");
    }

    public void X(long j4) {
        this.f7374H0 = j4;
        while (true) {
            ArrayDeque arrayDeque = this.f7380L;
            if (arrayDeque.isEmpty() || j4 < ((VD) arrayDeque.peek()).f7258a) {
                return;
            }
            VD vd = (VD) arrayDeque.poll();
            vd.getClass();
            B(vd);
            R();
        }
    }

    public void Y() {
    }

    public void Z(C0976o2 c0976o2) {
    }

    public final void a0() {
        try {
            PD pd = this.f7386S;
            if (pd != null) {
                pd.l();
                this.f7370F0.f7239b++;
                SD sd = this.f7393Z;
                if (sd == null) {
                    throw null;
                }
                O(sd.f6957a);
            }
            this.f7386S = null;
            this.J0 = null;
            v();
        } catch (Throwable th) {
            this.f7386S = null;
            this.J0 = null;
            v();
            throw th;
        }
    }

    public final int b0(C0831kn c0831kn, RB rb, int i4) {
        LE le = this.f7424w;
        le.getClass();
        int c = le.c(c0831kn, rb, i4);
        if (c == -4) {
            if (rb.a(4)) {
                this.f7359A = Long.MIN_VALUE;
                return this.f7361B ? -4 : -3;
            }
            long j4 = rb.f6793g + this.y;
            rb.f6793g = j4;
            this.f7359A = Math.max(this.f7359A, j4);
            return c;
        }
        if (c == -5) {
            C0976o2 c0976o2 = (C0976o2) c0831kn.f9319p;
            c0976o2.getClass();
            long j5 = c0976o2.f9817o;
            if (j5 != Long.MAX_VALUE) {
                L1 l12 = new L1(c0976o2);
                l12.f6105n = j5 + this.y;
                c0831kn.f9319p = new C0976o2(l12);
                return -5;
            }
        }
        return c;
    }

    public final void c0() {
        this.f7420u.getClass();
    }

    public abstract void d();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.ZB d0(java.lang.Exception r11, com.google.android.gms.internal.ads.C0976o2 r12, boolean r13, int r14) {
        /*
            r10 = this;
            r0 = 4
            if (r12 == 0) goto L1a
            boolean r1 = r10.f7363C
            if (r1 != 0) goto L1a
            r1 = 1
            r10.f7363C = r1
            r1 = 0
            int r2 = r10.q(r12)     // Catch: java.lang.Throwable -> L14 com.google.android.gms.internal.ads.ZB -> L18
            r2 = r2 & 7
            r10.f7363C = r1
            goto L1b
        L14:
            r0 = move-exception
            r10.f7363C = r1
            throw r0
        L18:
            r10.f7363C = r1
        L1a:
            r2 = r0
        L1b:
            java.lang.String r5 = r10.m()
            int r6 = r10.f7416s
            com.google.android.gms.internal.ads.ZB r1 = new com.google.android.gms.internal.ads.ZB
            if (r12 != 0) goto L27
            r8 = r0
            goto L28
        L27:
            r8 = r2
        L28:
            r2 = 1
            r3 = r11
            r7 = r12
            r9 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WD.d0(java.lang.Exception, com.google.android.gms.internal.ads.o2, boolean, int):com.google.android.gms.internal.ads.ZB");
    }

    public InterfaceC1243uC e0() {
        return null;
    }

    public abstract void f();

    public final LE f0() {
        return this.f7424w;
    }

    public abstract void g();

    public final void g0() {
        synchronized (this.f7408o) {
        }
    }

    public final void h() {
        Zf.X(this.f7422v == 0);
        l0();
    }

    public void h0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r2 >= r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.google.android.gms.internal.ads.C0976o2[] r10, com.google.android.gms.internal.ads.LE r11, long r12, long r14) {
        /*
            r9 = this;
            boolean r0 = r9.f7361B
            r0 = r0 ^ 1
            com.google.android.gms.internal.ads.Zf.X(r0)
            r9.f7424w = r11
            long r0 = r9.f7359A
            r2 = -9223372036854775808
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L13
            r9.f7359A = r12
        L13:
            r9.f7426x = r10
            r9.y = r14
            com.google.android.gms.internal.ads.VD r10 = r9.f7372G0
            long r10 = r10.c
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 != 0) goto L34
            com.google.android.gms.internal.ads.VD r0 = new com.google.android.gms.internal.ads.VD
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r12
            r5 = r14
            r0.<init>(r1, r3, r5)
            r9.B(r0)
            return
        L34:
            java.util.ArrayDeque r10 = r9.f7380L
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L67
            long r0 = r9.f7360A0
            int r11 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r11 == 0) goto L4c
            long r2 = r9.f7374H0
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 < 0) goto L67
        L4c:
            com.google.android.gms.internal.ads.VD r0 = new com.google.android.gms.internal.ads.VD
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r12
            r5 = r14
            r0.<init>(r1, r3, r5)
            r9.B(r0)
            com.google.android.gms.internal.ads.VD r10 = r9.f7372G0
            long r10 = r10.c
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 == 0) goto L66
            r9.R()
        L66:
            return
        L67:
            com.google.android.gms.internal.ads.VD r0 = new com.google.android.gms.internal.ads.VD
            long r1 = r9.f7360A0
            r3 = r12
            r5 = r14
            r0.<init>(r1, r3, r5)
            r10.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WD.i(com.google.android.gms.internal.ads.o2[], com.google.android.gms.internal.ads.LE, long, long):void");
    }

    public void i0() {
        this.N = null;
        B(VD.f7257e);
        this.f7380L.clear();
        w();
    }

    public final void j() {
        Zf.X(this.f7422v == 0);
        C0831kn c0831kn = this.f7412q;
        c0831kn.f9320q = null;
        c0831kn.f9319p = null;
        d();
    }

    public abstract void j0(boolean z4, boolean z5);

    public void k(float f4, float f5) {
        this.f7384Q = f4;
        this.f7385R = f5;
        F(this.f7387T);
    }

    public void k0(boolean z4, long j4) {
        int i4;
        this.f7364C0 = false;
        this.f7366D0 = false;
        if (this.f7413q0) {
            this.f7377J.d();
            this.f7375I.d();
            this.f7415r0 = false;
            T0 t02 = this.f7381M;
            t02.getClass();
            t02.c = InterfaceC0403al.f8159a;
            t02.f7030b = 0;
            t02.f7029a = 2;
        } else if (w()) {
            W();
        }
        O2 o22 = this.f7372G0.d;
        synchronized (o22) {
            i4 = o22.f6432b;
        }
        if (i4 > 0) {
            this.f7368E0 = true;
        }
        o22.e();
        this.f7380L.clear();
    }

    public final boolean l() {
        return this.f7359A == Long.MIN_VALUE;
    }

    public abstract void l0();

    public abstract String m();

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0451, code lost:
    
        M(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0454, code lost:
    
        if (r3 < 21) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0466, code lost:
    
        if (r2 != false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0468, code lost:
    
        a0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0479, code lost:
    
        throw d0(V(r0, r23.f7393Z), r23.N, r2, 4003);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0464, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x009a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x009b, code lost:
    
        r23.f7366D0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0090, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x009e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0058, code lost:
    
        if (((r0 == "audio/opus" || (r0 != null && r0.equals("audio/opus"))) ? r2 : r3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0094, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0334, code lost:
    
        if (r23.f7382O != null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0370, code lost:
    
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0372, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x006f A[Catch: IllegalStateException -> 0x0089, TryCatch #9 {IllegalStateException -> 0x0089, blocks: (B:170:0x003a, B:184:0x005d, B:186:0x006f, B:188:0x007c, B:193:0x0094), top: B:169:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0093 A[EDGE_INSN: B:191:0x0093->B:192:0x0093 BREAK  A[LOOP:0: B:16:0x002c->B:130:0x002c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03c9 A[Catch: IllegalStateException -> 0x0381, TryCatch #2 {IllegalStateException -> 0x0381, blocks: (B:233:0x03c3, B:235:0x03c9, B:244:0x03e7, B:246:0x03ed, B:248:0x03f3, B:255:0x0407, B:351:0x03ad, B:354:0x03bf, B:357:0x0375, B:359:0x037c, B:367:0x0390, B:369:0x03a2, B:371:0x040c, B:375:0x040f, B:201:0x0410), top: B:199:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03de A[LOOP:2: B:207:0x0212->B:240:0x03de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ed A[Catch: IllegalStateException -> 0x0381, TryCatch #2 {IllegalStateException -> 0x0381, blocks: (B:233:0x03c3, B:235:0x03c9, B:244:0x03e7, B:246:0x03ed, B:248:0x03f3, B:255:0x0407, B:351:0x03ad, B:354:0x03bf, B:357:0x0375, B:359:0x037c, B:367:0x0390, B:369:0x03a2, B:371:0x040c, B:375:0x040f, B:201:0x0410), top: B:199:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0407 A[EDGE_INSN: B:254:0x0407->B:255:0x0407 BREAK  A[LOOP:3: B:244:0x03e7->B:256:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[LOOP:3: B:244:0x03e7->B:256:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d A[Catch: IllegalStateException -> 0x000c, TryCatch #11 {IllegalStateException -> 0x000c, blocks: (B:3:0x0004, B:5:0x0008, B:8:0x0011, B:10:0x0016, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:173:0x0042, B:175:0x0046, B:178:0x004e, B:103:0x01f2, B:28:0x00b1, B:29:0x00b9, B:31:0x00bd, B:34:0x00c5, B:37:0x00d6, B:38:0x00e7, B:93:0x01d3, B:95:0x01db, B:96:0x01de, B:98:0x01e6, B:100:0x01ea, B:42:0x00fb, B:143:0x0104, B:44:0x0108, B:46:0x010c, B:48:0x0110, B:51:0x011a, B:56:0x0126, B:58:0x0130, B:60:0x014d, B:62:0x015c, B:63:0x015d, B:66:0x0165, B:67:0x0166, B:69:0x016f, B:72:0x0177, B:77:0x0183, B:79:0x018d, B:80:0x0194, B:82:0x019c, B:84:0x01a2, B:86:0x01a3, B:89:0x01c4, B:92:0x01cc, B:132:0x01ac, B:135:0x01b7, B:147:0x01cf, B:198:0x01fd, B:214:0x0224, B:216:0x0228, B:223:0x024c, B:225:0x0252, B:227:0x025a, B:229:0x0264, B:231:0x026c, B:261:0x0276, B:263:0x027b, B:265:0x027c, B:268:0x0280, B:270:0x0284, B:272:0x0288, B:273:0x028c, B:275:0x0290, B:276:0x0296, B:278:0x029c, B:281:0x02a1, B:282:0x02a5, B:284:0x02af, B:285:0x02c2, B:287:0x02c6, B:289:0x02d0, B:291:0x02d5, B:293:0x02db, B:294:0x02df, B:297:0x02ec, B:302:0x02fb, B:304:0x0309, B:306:0x030d, B:308:0x0311, B:309:0x0315, B:313:0x031a, B:315:0x0322, B:317:0x0321, B:321:0x0328, B:323:0x032b, B:324:0x0336, B:326:0x033a, B:328:0x0344, B:329:0x032e, B:331:0x0332, B:336:0x0233, B:338:0x023a, B:339:0x0241, B:219:0x022c, B:311:0x0316, B:316:0x031d), top: B:2:0x0004, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183 A[Catch: IllegalStateException -> 0x000c, TryCatch #11 {IllegalStateException -> 0x000c, blocks: (B:3:0x0004, B:5:0x0008, B:8:0x0011, B:10:0x0016, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:173:0x0042, B:175:0x0046, B:178:0x004e, B:103:0x01f2, B:28:0x00b1, B:29:0x00b9, B:31:0x00bd, B:34:0x00c5, B:37:0x00d6, B:38:0x00e7, B:93:0x01d3, B:95:0x01db, B:96:0x01de, B:98:0x01e6, B:100:0x01ea, B:42:0x00fb, B:143:0x0104, B:44:0x0108, B:46:0x010c, B:48:0x0110, B:51:0x011a, B:56:0x0126, B:58:0x0130, B:60:0x014d, B:62:0x015c, B:63:0x015d, B:66:0x0165, B:67:0x0166, B:69:0x016f, B:72:0x0177, B:77:0x0183, B:79:0x018d, B:80:0x0194, B:82:0x019c, B:84:0x01a2, B:86:0x01a3, B:89:0x01c4, B:92:0x01cc, B:132:0x01ac, B:135:0x01b7, B:147:0x01cf, B:198:0x01fd, B:214:0x0224, B:216:0x0228, B:223:0x024c, B:225:0x0252, B:227:0x025a, B:229:0x0264, B:231:0x026c, B:261:0x0276, B:263:0x027b, B:265:0x027c, B:268:0x0280, B:270:0x0284, B:272:0x0288, B:273:0x028c, B:275:0x0290, B:276:0x0296, B:278:0x029c, B:281:0x02a1, B:282:0x02a5, B:284:0x02af, B:285:0x02c2, B:287:0x02c6, B:289:0x02d0, B:291:0x02d5, B:293:0x02db, B:294:0x02df, B:297:0x02ec, B:302:0x02fb, B:304:0x0309, B:306:0x030d, B:308:0x0311, B:309:0x0315, B:313:0x031a, B:315:0x0322, B:317:0x0321, B:321:0x0328, B:323:0x032b, B:324:0x0336, B:326:0x033a, B:328:0x0344, B:329:0x032e, B:331:0x0332, B:336:0x0233, B:338:0x023a, B:339:0x0241, B:219:0x022c, B:311:0x0316, B:316:0x031d), top: B:2:0x0004, inners: #4, #5 }] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Throwable, android.media.MediaFormat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.android.gms.internal.ads.WD] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WD.n(long, long):void");
    }

    public abstract boolean o();

    public boolean p() {
        boolean a4;
        if (this.N != null) {
            if (l()) {
                a4 = this.f7361B;
            } else {
                LE le = this.f7424w;
                le.getClass();
                a4 = le.a();
            }
            if (!a4) {
                if (!(this.f7406m0 >= 0)) {
                    if (this.f7404k0 != -9223372036854775807L) {
                        c0();
                        if (SystemClock.elapsedRealtime() >= this.f7404k0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int q(C0976o2 c0976o2) {
        try {
            return s(this.f7367E, c0976o2);
        } catch (C0390aE e4) {
            throw d0(e4, c0976o2, false, 4002);
        }
    }

    public abstract float r(float f4, C0976o2[] c0976o2Arr);

    public abstract int s(Yv yv, C0976o2 c0976o2);

    public abstract WB t(SD sd, C0976o2 c0976o2, C0976o2 c0976o22);

    public void u() {
        this.f7405l0 = -1;
        this.f7373H.f6791e = null;
        A();
        this.f7404k0 = -9223372036854775807L;
        this.f7428y0 = false;
        this.f7427x0 = false;
        this.f7401h0 = false;
        this.f7402i0 = false;
        this.f7409o0 = false;
        this.f7411p0 = false;
        this.f7360A0 = -9223372036854775807L;
        this.f7362B0 = -9223372036854775807L;
        this.f7374H0 = -9223372036854775807L;
        this.f7423v0 = 0;
        this.f7425w0 = 0;
        this.f7421u0 = this.f7419t0 ? 1 : 0;
    }

    public final void v() {
        u();
        this.f7391X = null;
        this.f7393Z = null;
        this.f7387T = null;
        this.f7388U = null;
        this.f7389V = false;
        this.f7430z0 = false;
        this.f7390W = -1.0f;
        this.f7394a0 = 0;
        this.f7395b0 = false;
        this.f7396c0 = false;
        this.f7397d0 = false;
        this.f7398e0 = false;
        this.f7399f0 = false;
        this.f7400g0 = false;
        this.f7403j0 = false;
        this.f7419t0 = false;
        this.f7421u0 = 0;
    }

    public final boolean w() {
        if (this.f7386S == null) {
            return false;
        }
        int i4 = this.f7425w0;
        if (i4 == 3 || this.f7396c0 || ((this.f7397d0 && !this.f7430z0) || (this.f7398e0 && this.f7428y0))) {
            a0();
            return true;
        }
        if (i4 == 2) {
            int i5 = AbstractC0751is.f9071a;
            Zf.X(i5 >= 23);
            if (i5 >= 23) {
                try {
                    C0388aC c0388aC = this.f7379K0;
                    c0388aC.getClass();
                    this.J0 = c0388aC;
                    this.f7423v0 = 0;
                    this.f7425w0 = 0;
                } catch (ZB e4) {
                    Wj.n("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e4);
                    a0();
                    return true;
                }
            }
        }
        Q();
        return false;
    }

    public boolean x(SD sd) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x03f8, code lost:
    
        if ("stvm8".equals(r5) == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x040b, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r6) == false) goto L204;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(com.google.android.gms.internal.ads.SD r31) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WD.y(com.google.android.gms.internal.ads.SD):void");
    }

    public final void z() {
        int i4 = this.f7425w0;
        if (i4 == 1) {
            Q();
            return;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                this.f7366D0 = true;
                S();
                return;
            } else {
                a0();
                W();
                return;
            }
        }
        Q();
        C0388aC c0388aC = this.f7379K0;
        c0388aC.getClass();
        this.J0 = c0388aC;
        this.f7423v0 = 0;
        this.f7425w0 = 0;
    }
}
