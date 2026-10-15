package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857lC extends AA {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f9381k0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final CopyOnWriteArraySet f9382A;

    /* renamed from: B, reason: collision with root package name */
    public final C1210tg f9383B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f9384C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f9385D;

    /* renamed from: E, reason: collision with root package name */
    public final VC f9386E;

    /* renamed from: F, reason: collision with root package name */
    public final Looper f9387F;

    /* renamed from: G, reason: collision with root package name */
    public final C1075qF f9388G;

    /* renamed from: H, reason: collision with root package name */
    public final C1475zn f9389H;

    /* renamed from: I, reason: collision with root package name */
    public final SurfaceHolderCallbackC0730iC f9390I;

    /* renamed from: J, reason: collision with root package name */
    public final C0771jC f9391J;

    /* renamed from: K, reason: collision with root package name */
    public final UB f9392K;

    /* renamed from: L, reason: collision with root package name */
    public final long f9393L;

    /* renamed from: M, reason: collision with root package name */
    public int f9394M;
    public int N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f9395O;

    /* renamed from: P, reason: collision with root package name */
    public int f9396P;

    /* renamed from: Q, reason: collision with root package name */
    public final LC f9397Q;

    /* renamed from: R, reason: collision with root package name */
    public C0299Ke f9398R;

    /* renamed from: S, reason: collision with root package name */
    public C0265Eb f9399S;

    /* renamed from: T, reason: collision with root package name */
    public AudioTrack f9400T;

    /* renamed from: U, reason: collision with root package name */
    public Object f9401U;

    /* renamed from: V, reason: collision with root package name */
    public Surface f9402V;

    /* renamed from: W, reason: collision with root package name */
    public final int f9403W;

    /* renamed from: X, reason: collision with root package name */
    public Cq f9404X;

    /* renamed from: Y, reason: collision with root package name */
    public final int f9405Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C0644gC f9406Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f9407a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f9408b0;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f9409c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f9410d0;

    /* renamed from: e0, reason: collision with root package name */
    public C0265Eb f9411e0;

    /* renamed from: f0, reason: collision with root package name */
    public FC f9412f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f9413g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f9414h0;

    /* renamed from: i0, reason: collision with root package name */
    public final C0388aC f9415i0;

    /* renamed from: j0, reason: collision with root package name */
    public NE f9416j0;

    /* renamed from: q, reason: collision with root package name */
    public final C0817kF f9417q;

    /* renamed from: r, reason: collision with root package name */
    public final C0299Ke f9418r;

    /* renamed from: s, reason: collision with root package name */
    public final Y f9419s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f9420t;

    /* renamed from: u, reason: collision with root package name */
    public final MC f9421u;

    /* renamed from: v, reason: collision with root package name */
    public final WD[] f9422v;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC0774jF f9423w;

    /* renamed from: x, reason: collision with root package name */
    public final C1135rr f9424x;
    public final C1029pC y;

    /* renamed from: z, reason: collision with root package name */
    public final C0.s0 f9425z;

    static {
        AbstractC0861la.a("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, com.google.android.gms.internal.ads.jC] */
    public C0857lC(C0431bC c0431bC, MC mc) {
        super(5);
        int i4;
        boolean equals;
        this.f9419s = new Y(3);
        try {
            Wj.k("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.0-beta01] [" + AbstractC0751is.f9073e + "]");
            this.f9420t = c0431bC.f8216a.getApplicationContext();
            this.f9386E = new VC(c0431bC.f8217b);
            this.f9406Z = c0431bC.f8222i;
            this.f9403W = c0431bC.f8223j;
            this.f9408b0 = false;
            this.f9393L = c0431bC.f8227n;
            SurfaceHolderCallbackC0730iC surfaceHolderCallbackC0730iC = new SurfaceHolderCallbackC0730iC(this);
            this.f9390I = surfaceHolderCallbackC0730iC;
            this.f9391J = new Object();
            Handler handler = new Handler(c0431bC.f8221h);
            this.f9422v = ((C0874ln) c0431bC.c.f7687p).h(handler, surfaceHolderCallbackC0730iC, surfaceHolderCallbackC0730iC);
            this.f9423w = (AbstractC0774jF) c0431bC.f8218e.b();
            Context context = c0431bC.d.f8516p;
            new C0831kn(4);
            context.getApplicationContext();
            HashMap hashMap = new HashMap();
            new HashSet();
            HashMap hashMap2 = new HashMap();
            hashMap.clear();
            hashMap2.clear();
            this.f9388G = C1075qF.a(c0431bC.f8220g.f8516p);
            this.f9385D = c0431bC.f8224k;
            this.f9397Q = c0431bC.f8225l;
            Looper looper = c0431bC.f8221h;
            this.f9387F = looper;
            C1475zn c1475zn = c0431bC.f8217b;
            this.f9389H = c1475zn;
            this.f9421u = mc;
            this.f9425z = new C0.s0(looper, c1475zn, new C0558eC(0));
            this.f9382A = new CopyOnWriteArraySet();
            this.f9384C = new ArrayList();
            this.f9416j0 = new NE();
            this.f9417q = new C0817kF(new KC[2], new InterfaceC0690hF[2], C0486cj.f8383b, null);
            this.f9383B = new C1210tg();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int i5 = 0;
            while (true) {
                i4 = 1;
                if (i5 >= 20) {
                    break;
                }
                int i6 = iArr[i5];
                Zf.X(!false);
                sparseBooleanArray.append(i6, true);
                i5++;
            }
            this.f9423w.getClass();
            Zf.X(!false);
            sparseBooleanArray.append(29, true);
            Zf.X(!false);
            Q0 q02 = new Q0(sparseBooleanArray);
            this.f9418r = new C0299Ke(q02);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i7 = 0; i7 < q02.f6628a.size(); i7++) {
                int a4 = q02.a(i7);
                Zf.X(!false);
                sparseBooleanArray2.append(a4, true);
            }
            Zf.X(!false);
            sparseBooleanArray2.append(4, true);
            Zf.X(!false);
            sparseBooleanArray2.append(10, true);
            Zf.X(!false);
            this.f9398R = new C0299Ke(new Q0(sparseBooleanArray2));
            this.f9424x = this.f9389H.d(this.f9387F, null);
            C0388aC c0388aC = new C0388aC(i4, this);
            this.f9415i0 = c0388aC;
            this.f9412f0 = FC.g(this.f9417q);
            this.f9386E.a(this.f9421u, this.f9387F);
            int i8 = AbstractC0751is.f9071a;
            this.y = new C1029pC(this.f9422v, this.f9423w, this.f9417q, (InterfaceC1072qC) c0431bC.f8219f.b(), this.f9388G, this.f9386E, this.f9397Q, c0431bC.f8230q, c0431bC.f8226m, this.f9387F, this.f9389H, c0388aC, i8 < 31 ? new C0474cD() : AbstractC0601fC.a(this.f9420t, this, c0431bC.f8228o));
            this.f9407a0 = 1.0f;
            C0265Eb c0265Eb = C0265Eb.y;
            this.f9399S = c0265Eb;
            this.f9411e0 = c0265Eb;
            int i9 = -1;
            this.f9413g0 = -1;
            if (i8 >= 21) {
                AudioManager audioManager = (AudioManager) this.f9420t.getSystemService("audio");
                if (audioManager != null) {
                    i9 = audioManager.generateAudioSessionId();
                }
                this.f9405Y = i9;
            } else {
                AudioTrack audioTrack = this.f9400T;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f9400T.release();
                    this.f9400T = null;
                }
                if (this.f9400T == null) {
                    this.f9400T = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f9405Y = this.f9400T.getAudioSessionId();
            }
            int i10 = Ul.f7175a;
            this.f9409c0 = true;
            VC vc = this.f9386E;
            C0.s0 s0Var = this.f9425z;
            if (vc == null) {
                throw null;
            }
            s0Var.d(vc);
            C1075qF c1075qF = this.f9388G;
            Handler handler2 = new Handler(this.f9387F);
            VC vc2 = this.f9386E;
            c1075qF.getClass();
            vc2.getClass();
            C0388aC c0388aC2 = c1075qF.f10343p;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c0388aC2.f8087p;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C0946nF c0946nF = (C0946nF) it.next();
                if (c0946nF.f9730b == vc2) {
                    c0946nF.c = true;
                    copyOnWriteArrayList.remove(c0946nF);
                }
            }
            ((CopyOnWriteArrayList) c0388aC2.f8087p).add(new C0946nF(handler2, vc2));
            this.f9382A.add(this.f9390I);
            c0431bC.f8216a.getApplicationContext();
            new SB(handler);
            this.f9392K = new UB(c0431bC.f8216a, handler, this.f9390I);
            C0914mk c0914mk = C0914mk.f9648e;
            this.f9404X = Cq.c;
            AbstractC0774jF abstractC0774jF = this.f9423w;
            C0644gC c0644gC = this.f9406Z;
            C0604fF c0604fF = (C0604fF) abstractC0774jF;
            synchronized (c0604fF.c) {
                equals = c0604fF.f8700h.equals(c0644gC);
                c0604fF.f8700h = c0644gC;
            }
            if (!equals) {
                c0604fF.g();
            }
            z1(1, 10, Integer.valueOf(this.f9405Y));
            z1(2, 10, Integer.valueOf(this.f9405Y));
            z1(1, 3, this.f9406Z);
            z1(2, 4, Integer.valueOf(this.f9403W));
            z1(2, 5, 0);
            z1(1, 9, Boolean.valueOf(this.f9408b0));
            z1(2, 7, this.f9391J);
            z1(6, 8, this.f9391J);
            this.f9419s.c();
        } catch (Throwable th) {
            this.f9419s.c();
            throw th;
        }
    }

    public static long v1(FC fc) {
        Rg rg = new Rg();
        C1210tg c1210tg = new C1210tg();
        fc.f4994a.n(fc.f4995b.f10688a, c1210tg);
        long j4 = fc.c;
        if (j4 != -9223372036854775807L) {
            return j4;
        }
        fc.f4994a.e(c1210tg.c, rg, 0L).getClass();
        return 0L;
    }

    public final void A1(Surface surface) {
        ArrayList arrayList = new ArrayList();
        WD[] wdArr = this.f9422v;
        int length = wdArr.length;
        boolean z4 = false;
        for (int i4 = 0; i4 < 2; i4++) {
            WD wd = wdArr[i4];
            if (wd.f7410p == 2) {
                s1(this.f9412f0);
                AbstractC0484ch abstractC0484ch = this.f9412f0.f4994a;
                C1029pC c1029pC = this.y;
                HC hc = new HC(c1029pC, wd, c1029pC.f9955x);
                Zf.X(!hc.f5420f);
                hc.c = 1;
                Zf.X(true ^ hc.f5420f);
                hc.d = surface;
                hc.a();
                arrayList.add(hc);
            }
        }
        Object obj = this.f9401U;
        if (obj != null && obj != surface) {
            try {
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    ((HC) obj2).c(this.f9393L);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z4 = true;
            }
            Object obj3 = this.f9401U;
            Surface surface2 = this.f9402V;
            if (obj3 == surface2) {
                surface2.release();
                this.f9402V = null;
            }
        }
        this.f9401U = surface;
        if (z4) {
            B1(new ZB(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    public final void B1(ZB zb) {
        FC fc = this.f9412f0;
        FC a4 = fc.a(fc.f4995b);
        a4.f5006o = a4.f5008q;
        a4.f5007p = 0L;
        FC e4 = a4.e(1);
        if (zb != null) {
            e4 = e4.d(zb);
        }
        FC fc2 = e4;
        this.f9394M++;
        Handler handler = this.y.f9953v.f10539a;
        C0835kr d = C1135rr.d();
        d.f9326a = handler.obtainMessage(6);
        d.a();
        D1(fc2, 0, 1, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void C1(int i4, int i5, boolean z4) {
        int i6 = 0;
        ?? r15 = (!z4 || i4 == -1) ? 0 : 1;
        if (r15 != 0 && i4 != 1) {
            i6 = 1;
        }
        FC fc = this.f9412f0;
        if (fc.f5003l == r15 && fc.f5004m == i6) {
            return;
        }
        this.f9394M++;
        FC c = fc.c(i6, r15);
        Handler handler = this.y.f9953v.f10539a;
        C0835kr d = C1135rr.d();
        d.f9326a = handler.obtainMessage(1, r15, i6);
        d.a();
        D1(c, 0, i5, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x054a A[LOOP:2: B:110:0x0542->B:112:0x054a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x055b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0567 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0573 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0595 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1(com.google.android.gms.internal.ads.FC r33, int r34, int r35, boolean r36, int r37, long r38, int r40) {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0857lC.D1(com.google.android.gms.internal.ads.FC, int, int, boolean, int, long, int):void");
    }

    public final void E1() {
        this.f9419s.a();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f9387F;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f9409c0) {
                throw new IllegalStateException(str);
            }
            Wj.n("ExoPlayerImpl", str, this.f9410d0 ? null : new IllegalStateException());
            this.f9410d0 = true;
        }
    }

    public final long F1() {
        E1();
        if (!p1()) {
            AbstractC0484ch k1 = k1();
            if (k1.o()) {
                return -9223372036854775807L;
            }
            return AbstractC0751is.w(k1.e(Y0(), (Rg) this.f3928o, 0L).f6824k);
        }
        FC fc = this.f9412f0;
        C1202tE c1202tE = fc.f4995b;
        AbstractC0484ch abstractC0484ch = fc.f4994a;
        Object obj = c1202tE.f10688a;
        C1210tg c1210tg = this.f9383B;
        abstractC0484ch.n(obj, c1210tg);
        return AbstractC0751is.w(c1210tg.a(c1202tE.f10689b, c1202tE.c));
    }

    public final void G1(boolean z4) {
        E1();
        d();
        this.f9392K.a();
        int i4 = 1;
        int i5 = z4 ? 1 : -1;
        if (z4 && i5 != 1) {
            i4 = 2;
        }
        C1(i5, i4, z4);
    }

    public final void H1(PC pc) {
        this.f9386E.f7253t.d(pc);
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void T0(int i4, long j4) {
        E1();
        Zf.O(i4 >= 0);
        VC vc = this.f9386E;
        if (!vc.f7256w) {
            OC b4 = vc.b();
            vc.f7256w = true;
            vc.e(b4, -1, new C0558eC(29));
        }
        AbstractC0484ch abstractC0484ch = this.f9412f0.f4994a;
        if (abstractC0484ch.o() || i4 < abstractC0484ch.c()) {
            this.f9394M++;
            if (p1()) {
                Wj.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                K1.c cVar = new K1.c(this.f9412f0);
                cVar.a(1);
                C0857lC c0857lC = (C0857lC) this.f9415i0.f8087p;
                c0857lC.f9424x.b(new Jn(12, c0857lC, cVar));
                return;
            }
            FC fc = this.f9412f0;
            int i5 = fc.f4996e;
            if (i5 == 3 || (i5 == 4 && !abstractC0484ch.o())) {
                fc = this.f9412f0.e(2);
            }
            int Y02 = Y0();
            FC x12 = x1(fc, abstractC0484ch, w1(abstractC0484ch, i4, j4));
            long t4 = AbstractC0751is.t(j4);
            C1029pC c1029pC = this.y;
            c1029pC.getClass();
            c1029pC.f9953v.a(3, new C0986oC(abstractC0484ch, i4, t4)).a();
            D1(x12, 0, 1, true, 1, u1(x12), Y02);
        }
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int V0() {
        E1();
        if (p1()) {
            return this.f9412f0.f4995b.f10689b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int X0() {
        E1();
        if (p1()) {
            return this.f9412f0.f4995b.c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int Y0() {
        E1();
        int s12 = s1(this.f9412f0);
        if (s12 == -1) {
            return 0;
        }
        return s12;
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void Z() {
        E1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int a1() {
        E1();
        if (this.f9412f0.f4994a.o()) {
            return 0;
        }
        FC fc = this.f9412f0;
        return fc.f4994a.a(fc.f4995b.f10688a);
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int d() {
        E1();
        return this.f9412f0.f4996e;
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void f() {
        E1();
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final long g1() {
        E1();
        return t1(this.f9412f0);
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final int h() {
        E1();
        return this.f9412f0.f5004m;
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final long h1() {
        E1();
        return AbstractC0751is.w(u1(this.f9412f0));
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final long j1() {
        E1();
        return AbstractC0751is.w(this.f9412f0.f5007p);
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final AbstractC0484ch k1() {
        E1();
        return this.f9412f0.f4994a;
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final C0486cj l1() {
        E1();
        return (C0486cj) this.f9412f0.f5000i.f9287r;
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final boolean o1() {
        E1();
        return this.f9412f0.f5003l;
    }

    public final void p() {
        String str;
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = AbstractC0751is.f9073e;
        HashSet hashSet = AbstractC0861la.f9432a;
        synchronized (AbstractC0861la.class) {
            str = AbstractC0861la.f9433b;
        }
        StringBuilder n4 = U.a.n("Release ", hexString, " [AndroidXMedia3/1.2.0-beta01] [", str2, "] [");
        n4.append(str);
        n4.append("]");
        Wj.k("ExoPlayerImpl", n4.toString());
        E1();
        if (AbstractC0751is.f9071a < 21 && (audioTrack = this.f9400T) != null) {
            audioTrack.release();
            this.f9400T = null;
        }
        UB ub = this.f9392K;
        ub.c = null;
        ub.a();
        if (!this.y.H()) {
            C0.s0 s0Var = this.f9425z;
            s0Var.f(10, Yv.f7915L);
            s0Var.e();
        }
        this.f9425z.g();
        this.f9424x.f10539a.removeCallbacksAndMessages(null);
        C1075qF c1075qF = this.f9388G;
        VC vc = this.f9386E;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c1075qF.f10343p.f8087p;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0946nF c0946nF = (C0946nF) it.next();
            if (c0946nF.f9730b == vc) {
                c0946nF.c = true;
                copyOnWriteArrayList.remove(c0946nF);
            }
        }
        this.f9412f0.getClass();
        FC e4 = this.f9412f0.e(1);
        this.f9412f0 = e4;
        FC a4 = e4.a(e4.f4995b);
        this.f9412f0 = a4;
        a4.f5006o = a4.f5008q;
        this.f9412f0.f5007p = 0L;
        VC vc2 = this.f9386E;
        C1135rr c1135rr = vc2.f7255v;
        Zf.C(c1135rr);
        c1135rr.b(new RunnableC0744il(18, vc2));
        this.f9423w.b();
        Surface surface = this.f9402V;
        if (surface != null) {
            surface.release();
            this.f9402V = null;
        }
        int i4 = Ul.f7175a;
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final boolean p1() {
        E1();
        return this.f9412f0.f4995b.b();
    }

    public final void r1(C0273Fd c0273Fd) {
        E1();
        C0.s0 s0Var = this.f9386E.f7253t;
        s0Var.h();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) s0Var.f390f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            Ho ho = (Ho) it.next();
            if (ho.f5509a.equals(c0273Fd)) {
                InterfaceC1390xo interfaceC1390xo = (InterfaceC1390xo) s0Var.f389e;
                ho.d = true;
                if (ho.c) {
                    ho.c = false;
                    interfaceC1390xo.d(ho.f5509a, ho.f5510b.g());
                }
                copyOnWriteArraySet.remove(ho);
            }
        }
    }

    public final void s() {
        E1();
        UB ub = this.f9392K;
        o1();
        ub.a();
        B1(null);
        Gt gt = Gt.f5344s;
        long j4 = this.f9412f0.f5008q;
        new Ul(gt);
    }

    public final int s1(FC fc) {
        return fc.f4994a.o() ? this.f9413g0 : fc.f4994a.n(fc.f4995b.f10688a, this.f9383B).c;
    }

    public final long t1(FC fc) {
        long w2 = AbstractC0751is.w(0L);
        C1202tE c1202tE = fc.f4995b;
        AbstractC0484ch abstractC0484ch = fc.f4994a;
        if (!c1202tE.b()) {
            return AbstractC0751is.w(u1(fc));
        }
        abstractC0484ch.n(fc.f4995b.f10688a, this.f9383B);
        long j4 = fc.c;
        if (j4 != -9223372036854775807L) {
            return w2 + AbstractC0751is.w(j4);
        }
        abstractC0484ch.e(s1(fc), (Rg) this.f3928o, 0L).getClass();
        return w2;
    }

    public final long u1(FC fc) {
        if (fc.f4994a.o()) {
            return AbstractC0751is.t(this.f9414h0);
        }
        long j4 = fc.f5008q;
        if (fc.f4995b.b()) {
            return j4;
        }
        fc.f4994a.n(fc.f4995b.f10688a, this.f9383B);
        return j4;
    }

    public final Pair w1(AbstractC0484ch abstractC0484ch, int i4, long j4) {
        if (abstractC0484ch.o()) {
            this.f9413g0 = i4;
            if (j4 == -9223372036854775807L) {
                j4 = 0;
            }
            this.f9414h0 = j4;
            return null;
        }
        if (i4 == -1 || i4 >= abstractC0484ch.c()) {
            i4 = abstractC0484ch.g(false);
            abstractC0484ch.e(i4, (Rg) this.f3928o, 0L).getClass();
            j4 = AbstractC0751is.w(0L);
        }
        return abstractC0484ch.l((Rg) this.f3928o, this.f9383B, i4, AbstractC0751is.t(j4));
    }

    public final FC x1(FC fc, AbstractC0484ch abstractC0484ch, Pair pair) {
        List list;
        Zf.O(abstractC0484ch.o() || pair != null);
        AbstractC0484ch abstractC0484ch2 = fc.f4994a;
        long t12 = t1(fc);
        FC f4 = fc.f(abstractC0484ch);
        if (abstractC0484ch.o()) {
            C1202tE c1202tE = FC.f4993s;
            long t4 = AbstractC0751is.t(this.f9414h0);
            FC a4 = f4.b(c1202tE, t4, t4, t4, 0L, RE.d, this.f9417q, Gt.f5344s).a(c1202tE);
            a4.f5006o = a4.f5008q;
            return a4;
        }
        Object obj = f4.f4995b.f10688a;
        int i4 = AbstractC0751is.f9071a;
        boolean equals = obj.equals(pair.first);
        C1202tE c1202tE2 = !equals ? new C1202tE(-1L, pair.first) : f4.f4995b;
        long longValue = ((Long) pair.second).longValue();
        long t5 = AbstractC0751is.t(t12);
        if (!abstractC0484ch2.o()) {
            abstractC0484ch2.n(obj, this.f9383B);
        }
        if (!equals || longValue < t5) {
            C1202tE c1202tE3 = c1202tE2;
            Zf.X(!c1202tE3.b());
            RE re = !equals ? RE.d : f4.f4999h;
            C0817kF c0817kF = !equals ? this.f9417q : f4.f5000i;
            if (equals) {
                list = f4.f5001j;
            } else {
                C1052pt c1052pt = AbstractC1137rt.f10543p;
                list = Gt.f5344s;
            }
            FC a5 = f4.b(c1202tE3, longValue, longValue, longValue, 0L, re, c0817kF, list).a(c1202tE3);
            a5.f5006o = longValue;
            return a5;
        }
        if (longValue != t5) {
            C1202tE c1202tE4 = c1202tE2;
            Zf.X(!c1202tE4.b());
            long max = Math.max(0L, f4.f5007p - (longValue - t5));
            long j4 = f4.f5006o;
            if (f4.f5002k.equals(f4.f4995b)) {
                j4 = longValue + max;
            }
            FC b4 = f4.b(c1202tE4, longValue, longValue, longValue, max, f4.f4999h, f4.f5000i, f4.f5001j);
            b4.f5006o = j4;
            return b4;
        }
        int a6 = abstractC0484ch.a(f4.f5002k.f10688a);
        if (a6 != -1 && abstractC0484ch.d(a6, this.f9383B, false).c == abstractC0484ch.n(c1202tE2.f10688a, this.f9383B).c) {
            return f4;
        }
        abstractC0484ch.n(c1202tE2.f10688a, this.f9383B);
        long a7 = c1202tE2.b() ? this.f9383B.a(c1202tE2.f10689b, c1202tE2.c) : this.f9383B.d;
        C1202tE c1202tE5 = c1202tE2;
        FC a8 = f4.b(c1202tE5, f4.f5008q, f4.f5008q, f4.d, a7 - f4.f5008q, f4.f4999h, f4.f5000i, f4.f5001j).a(c1202tE5);
        a8.f5006o = a7;
        return a8;
    }

    public final void y1(int i4, int i5) {
        Cq cq = this.f9404X;
        if (i4 == cq.f4553a && i5 == cq.f4554b) {
            return;
        }
        this.f9404X = new Cq(i4, i5);
        C0347Uc c0347Uc = new C0347Uc(i4, i5);
        C0.s0 s0Var = this.f9425z;
        s0Var.f(24, c0347Uc);
        s0Var.e();
        z1(2, 14, new Cq(i4, i5));
    }

    public final void z1(int i4, int i5, Object obj) {
        WD[] wdArr = this.f9422v;
        int length = wdArr.length;
        for (int i6 = 0; i6 < 2; i6++) {
            WD wd = wdArr[i6];
            if (wd.f7410p == i4) {
                s1(this.f9412f0);
                AbstractC0484ch abstractC0484ch = this.f9412f0.f4994a;
                C1029pC c1029pC = this.y;
                HC hc = new HC(c1029pC, wd, c1029pC.f9955x);
                Zf.X(!hc.f5420f);
                hc.c = i5;
                Zf.X(!hc.f5420f);
                hc.d = obj;
                hc.a();
            }
        }
    }
}
