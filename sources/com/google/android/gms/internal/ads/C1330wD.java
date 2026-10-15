package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330wD implements InterfaceC0815kD {

    /* renamed from: V, reason: collision with root package name */
    public static final Object f11124V = new Object();

    /* renamed from: W, reason: collision with root package name */
    public static ExecutorService f11125W;

    /* renamed from: X, reason: collision with root package name */
    public static int f11126X;

    /* renamed from: A, reason: collision with root package name */
    public int f11127A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f11128B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f11129C;

    /* renamed from: D, reason: collision with root package name */
    public long f11130D;

    /* renamed from: E, reason: collision with root package name */
    public float f11131E;

    /* renamed from: F, reason: collision with root package name */
    public ByteBuffer f11132F;

    /* renamed from: G, reason: collision with root package name */
    public int f11133G;

    /* renamed from: H, reason: collision with root package name */
    public ByteBuffer f11134H;

    /* renamed from: I, reason: collision with root package name */
    public byte[] f11135I;

    /* renamed from: J, reason: collision with root package name */
    public int f11136J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f11137K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f11138L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f11139M;
    public boolean N;

    /* renamed from: O, reason: collision with root package name */
    public int f11140O;

    /* renamed from: P, reason: collision with root package name */
    public C1157sC f11141P;

    /* renamed from: Q, reason: collision with root package name */
    public C1158sD f11142Q;

    /* renamed from: R, reason: collision with root package name */
    public long f11143R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f11144S;

    /* renamed from: T, reason: collision with root package name */
    public final C0882lv f11145T;

    /* renamed from: U, reason: collision with root package name */
    public final RC f11146U;

    /* renamed from: a, reason: collision with root package name */
    public final C0944nD f11147a;

    /* renamed from: b, reason: collision with root package name */
    public final BD f11148b;
    public final Gt c;
    public final Gt d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f11149e;

    /* renamed from: f, reason: collision with root package name */
    public final C0901mD f11150f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f11151g;

    /* renamed from: h, reason: collision with root package name */
    public C0882lv f11152h;

    /* renamed from: i, reason: collision with root package name */
    public final N1.d f11153i;

    /* renamed from: j, reason: collision with root package name */
    public final N1.d f11154j;

    /* renamed from: k, reason: collision with root package name */
    public C0474cD f11155k;

    /* renamed from: l, reason: collision with root package name */
    public RC f11156l;

    /* renamed from: m, reason: collision with root package name */
    public C1201tD f11157m;

    /* renamed from: n, reason: collision with root package name */
    public C1201tD f11158n;

    /* renamed from: o, reason: collision with root package name */
    public C1214tk f11159o;

    /* renamed from: p, reason: collision with root package name */
    public AudioTrack f11160p;

    /* renamed from: q, reason: collision with root package name */
    public C0559eD f11161q;

    /* renamed from: r, reason: collision with root package name */
    public C0644gC f11162r;

    /* renamed from: s, reason: collision with root package name */
    public C1244uD f11163s;

    /* renamed from: t, reason: collision with root package name */
    public C1244uD f11164t;

    /* renamed from: u, reason: collision with root package name */
    public C0951ne f11165u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11166v;

    /* renamed from: w, reason: collision with root package name */
    public long f11167w;

    /* renamed from: x, reason: collision with root package name */
    public long f11168x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public long f11169z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [com.google.android.gms.internal.ads.sC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.google.android.gms.internal.ads.gl, com.google.android.gms.internal.ads.nD] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.gl, com.google.android.gms.internal.ads.BD] */
    public C1330wD(B0.c cVar) {
        this.f11161q = (C0559eD) cVar.f68p;
        this.f11145T = (C0882lv) cVar.f69q;
        int i4 = AbstractC0751is.f9071a;
        RC rc = (RC) cVar.f70r;
        rc.getClass();
        this.f11146U = rc;
        Y y = new Y(3);
        this.f11149e = y;
        y.c();
        this.f11150f = new C0901mD(new C0388aC(5, this));
        ?? abstractC0659gl = new AbstractC0659gl();
        this.f11147a = abstractC0659gl;
        ?? abstractC0659gl2 = new AbstractC0659gl();
        abstractC0659gl2.f4047m = AbstractC0751is.f9074f;
        this.f11148b = abstractC0659gl2;
        AbstractC0659gl abstractC0659gl3 = new AbstractC0659gl();
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        Object[] objArr = {abstractC0659gl3, abstractC0659gl, abstractC0659gl2};
        Bs.D(3, objArr);
        this.c = AbstractC1137rt.q(3, objArr);
        this.d = AbstractC1137rt.t(new AbstractC0659gl());
        this.f11131E = 1.0f;
        this.f11162r = C0644gC.f8792b;
        this.f11140O = 0;
        this.f11141P = new Object();
        C0951ne c0951ne = C0951ne.d;
        this.f11164t = new C1244uD(c0951ne, 0L, 0L);
        this.f11165u = c0951ne;
        this.f11166v = false;
        this.f11151g = new ArrayDeque();
        this.f11153i = new N1.d(8, false);
        this.f11154j = new N1.d(8, false);
    }

    public static boolean i(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (AbstractC0751is.f9071a < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    public final long a() {
        return this.f11158n.c == 0 ? this.f11167w / r0.f10682b : this.f11168x;
    }

    public final long b() {
        C1201tD c1201tD = this.f11158n;
        if (c1201tD.c != 0) {
            return this.f11169z;
        }
        long j4 = this.y;
        long j5 = c1201tD.d;
        int i4 = AbstractC0751is.f9071a;
        return ((j4 + j5) - 1) / j5;
    }

    public final void c(long j4) {
        C0951ne c0951ne;
        boolean z4;
        C1201tD c1201tD = this.f11158n;
        int i4 = c1201tD.c;
        C0882lv c0882lv = this.f11145T;
        if (i4 == 0) {
            int i5 = c1201tD.f10681a.f9827z;
            c0951ne = this.f11165u;
            C1215tl c1215tl = (C1215tl) c0882lv.f9506p;
            float f4 = c0951ne.f9742a;
            if (c1215tl.c != f4) {
                c1215tl.c = f4;
                c1215tl.f10728i = true;
            }
            float f5 = c0951ne.f9743b;
            if (c1215tl.d != f5) {
                c1215tl.d = f5;
                c1215tl.f10728i = true;
            }
        } else {
            c0951ne = C0951ne.d;
        }
        C0951ne c0951ne2 = c0951ne;
        this.f11165u = c0951ne2;
        if (i4 == 0) {
            int i6 = c1201tD.f10681a.f9827z;
            z4 = this.f11166v;
            ((C1459zD) c0882lv.f9508r).f11577j = z4;
        } else {
            z4 = false;
        }
        this.f11166v = z4;
        long max = Math.max(0L, j4);
        C1201tD c1201tD2 = this.f11158n;
        this.f11151g.add(new C1244uD(c0951ne2, max, AbstractC0751is.u(c1201tD2.f10683e, b())));
        C1214tk c1214tk = this.f11158n.f10687i;
        this.f11159o = c1214tk;
        c1214tk.a();
        RC rc = this.f11156l;
        if (rc != null) {
            boolean z5 = this.f11166v;
            C0831kn c0831kn = ((C1416yD) rc.f6796o).N0;
            Handler handler = (Handler) c0831kn.f9319p;
            if (handler != null) {
                handler.post(new N1.f(c0831kn, z5, 2));
            }
        }
    }

    public final void d() {
        if (this.f11138L) {
            return;
        }
        this.f11138L = true;
        long b4 = b();
        C0901mD c0901mD = this.f11150f;
        c0901mD.f9575A = c0901mD.d();
        c0901mD.y = AbstractC0751is.t(SystemClock.elapsedRealtime());
        c0901mD.f9576B = b4;
        this.f11160p.stop();
    }

    public final void e() {
        ByteBuffer byteBuffer;
        if (!this.f11159o.c()) {
            ByteBuffer byteBuffer2 = this.f11132F;
            if (byteBuffer2 == null) {
                byteBuffer2 = InterfaceC0403al.f8159a;
            }
            f(byteBuffer2);
            return;
        }
        while (!this.f11159o.b()) {
            do {
                C1214tk c1214tk = this.f11159o;
                if (c1214tk.c()) {
                    ByteBuffer byteBuffer3 = c1214tk.c[c1214tk.d()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c1214tk.e(InterfaceC0403al.f8159a);
                        byteBuffer = c1214tk.c[c1214tk.d()];
                    }
                } else {
                    byteBuffer = InterfaceC0403al.f8159a;
                }
                if (byteBuffer.hasRemaining()) {
                    f(byteBuffer);
                } else {
                    ByteBuffer byteBuffer4 = this.f11132F;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C1214tk c1214tk2 = this.f11159o;
                    ByteBuffer byteBuffer5 = this.f11132F;
                    if (c1214tk2.c() && !c1214tk2.d) {
                        c1214tk2.e(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1330wD.f(java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0048 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.tk r0 = r4.f11159o
            boolean r0 = r0.c()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L17
            java.nio.ByteBuffer r0 = r4.f11134H
            if (r0 != 0) goto Lf
            goto L47
        Lf:
            r4.f(r0)
            java.nio.ByteBuffer r0 = r4.f11134H
            if (r0 != 0) goto L48
            goto L47
        L17:
            com.google.android.gms.internal.ads.tk r0 = r4.f11159o
            boolean r3 = r0.c()
            if (r3 == 0) goto L31
            boolean r3 = r0.d
            if (r3 == 0) goto L24
            goto L31
        L24:
            r0.d = r2
            java.util.ArrayList r0 = r0.f10722b
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.al r0 = (com.google.android.gms.internal.ads.InterfaceC0403al) r0
            r0.i()
        L31:
            r4.e()
            com.google.android.gms.internal.ads.tk r0 = r4.f11159o
            boolean r0 = r0.b()
            if (r0 == 0) goto L48
            java.nio.ByteBuffer r0 = r4.f11134H
            if (r0 == 0) goto L47
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L47
            goto L48
        L47:
            return r2
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1330wD.g():boolean");
    }

    public final boolean h() {
        return this.f11160p != null;
    }

    public final int j(C0976o2 c0976o2) {
        String str = c0976o2.f9813k;
        int i4 = c0976o2.f9827z;
        if (!"audio/raw".equals(str)) {
            return this.f11161q.a(c0976o2) != null ? 2 : 0;
        }
        if (AbstractC0751is.d(i4)) {
            return i4 != 2 ? 1 : 2;
        }
        U.a.p(i4, "Invalid PCM encoding: ", "DefaultAudioSink");
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017b, code lost:
    
        if (r7 > 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017e, code lost:
    
        if (r15 > 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0181, code lost:
    
        if (r15 < 0) goto L72;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x015f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192  */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.android.gms.internal.ads.lt, com.google.android.gms.internal.ads.ot] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.google.android.gms.internal.ads.C0976o2 r27, int[] r28) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1330wD.k(com.google.android.gms.internal.ads.o2, int[]):void");
    }

    public final void l() {
        if (h()) {
            this.f11167w = 0L;
            this.f11168x = 0L;
            this.y = 0L;
            this.f11169z = 0L;
            this.f11127A = 0;
            this.f11164t = new C1244uD(this.f11165u, 0L, 0L);
            this.f11130D = 0L;
            this.f11163s = null;
            this.f11151g.clear();
            this.f11132F = null;
            this.f11133G = 0;
            this.f11134H = null;
            this.f11138L = false;
            this.f11137K = false;
            this.f11148b.f4049o = 0L;
            C1214tk c1214tk = this.f11158n.f10687i;
            this.f11159o = c1214tk;
            c1214tk.a();
            AudioTrack audioTrack = this.f11150f.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f11160p.pause();
            }
            if (i(this.f11160p)) {
                C0882lv c0882lv = this.f11152h;
                c0882lv.getClass();
                this.f11160p.unregisterStreamEventCallback((C1287vD) c0882lv.f9508r);
                ((Handler) c0882lv.f9507q).removeCallbacksAndMessages(null);
            }
            if (AbstractC0751is.f9071a < 21 && !this.N) {
                this.f11140O = 0;
            }
            this.f11158n.getClass();
            UC uc = new UC(7);
            C1201tD c1201tD = this.f11157m;
            if (c1201tD != null) {
                this.f11158n = c1201tD;
                this.f11157m = null;
            }
            C0901mD c0901mD = this.f11150f;
            c0901mD.f9591l = 0L;
            c0901mD.f9603x = 0;
            c0901mD.f9602w = 0;
            c0901mD.f9592m = 0L;
            c0901mD.f9578D = 0L;
            c0901mD.f9581G = 0L;
            c0901mD.f9590k = false;
            c0901mD.c = null;
            c0901mD.f9585f = null;
            AudioTrack audioTrack2 = this.f11160p;
            Y y = this.f11149e;
            RC rc = this.f11156l;
            y.b();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f11124V) {
                try {
                    if (f11125W == null) {
                        f11125W = Executors.newSingleThreadExecutor(new ThreadFactoryC0341Tb("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f11126X++;
                    f11125W.execute(new RunnableC1207td(audioTrack2, rc, handler, uc, y));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f11160p = null;
        }
        this.f11154j.f1158q = null;
        this.f11153i.f1158q = null;
    }

    public final void m() {
        this.f11139M = true;
        if (h()) {
            C0901mD c0901mD = this.f11150f;
            if (c0901mD.y != -9223372036854775807L) {
                c0901mD.y = AbstractC0751is.t(SystemClock.elapsedRealtime());
            }
            C0858lD c0858lD = c0901mD.f9585f;
            c0858lD.getClass();
            c0858lD.a(0);
            this.f11160p.play();
        }
    }

    public final void n() {
        l();
        Gt gt = this.c;
        int i4 = gt.f5346r;
        for (int i5 = 0; i5 < i4; i5++) {
            ((InterfaceC0403al) gt.get(i5)).d();
        }
        Gt gt2 = this.d;
        int i6 = gt2.f5346r;
        for (int i7 = 0; i7 < i6; i7++) {
            ((InterfaceC0403al) gt2.get(i7)).d();
        }
        C1214tk c1214tk = this.f11159o;
        if (c1214tk != null) {
            AbstractC1137rt abstractC1137rt = c1214tk.f10721a;
            for (int i8 = 0; i8 < abstractC1137rt.size(); i8++) {
                InterfaceC0403al interfaceC0403al = (InterfaceC0403al) abstractC1137rt.get(i8);
                interfaceC0403al.e();
                interfaceC0403al.d();
            }
            c1214tk.c = new ByteBuffer[0];
            Fk fk = Fk.f5070e;
            c1214tk.d = false;
        }
        this.f11139M = false;
        this.f11144S = false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x0259. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00ef A[Catch: iD -> 0x00fd, TryCatch #1 {iD -> 0x00fd, blocks: (B:214:0x0078, B:215:0x007a, B:218:0x007d, B:231:0x00e7, B:233:0x00ef, B:235:0x00f5, B:236:0x0100, B:237:0x0118, B:239:0x011e, B:241:0x0122, B:242:0x0127, B:245:0x013d, B:248:0x0160, B:252:0x016d, B:253:0x0172, B:255:0x0179, B:257:0x0190, B:261:0x0151, B:262:0x0159, B:276:0x00a9, B:278:0x00b2, B:296:0x058e, B:298:0x0595, B:299:0x0597, B:307:0x059a, B:217:0x007b), top: B:213:0x0078, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0179 A[Catch: iD -> 0x00fd, TryCatch #1 {iD -> 0x00fd, blocks: (B:214:0x0078, B:215:0x007a, B:218:0x007d, B:231:0x00e7, B:233:0x00ef, B:235:0x00f5, B:236:0x0100, B:237:0x0118, B:239:0x011e, B:241:0x0122, B:242:0x0127, B:245:0x013d, B:248:0x0160, B:252:0x016d, B:253:0x0172, B:255:0x0179, B:257:0x0190, B:261:0x0151, B:262:0x0159, B:276:0x00a9, B:278:0x00b2, B:296:0x058e, B:298:0x0595, B:299:0x0597, B:307:0x059a, B:217:0x007b), top: B:213:0x0078, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0595 A[Catch: iD -> 0x00fd, TryCatch #1 {iD -> 0x00fd, blocks: (B:214:0x0078, B:215:0x007a, B:218:0x007d, B:231:0x00e7, B:233:0x00ef, B:235:0x00f5, B:236:0x0100, B:237:0x0118, B:239:0x011e, B:241:0x0122, B:242:0x0127, B:245:0x013d, B:248:0x0160, B:252:0x016d, B:253:0x0172, B:255:0x0179, B:257:0x0190, B:261:0x0151, B:262:0x0159, B:276:0x00a9, B:278:0x00b2, B:296:0x058e, B:298:0x0595, B:299:0x0597, B:307:0x059a, B:217:0x007b), top: B:213:0x0078, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[Catch: iD -> 0x00fd, SYNTHETIC, TRY_LEAVE, TryCatch #1 {iD -> 0x00fd, blocks: (B:214:0x0078, B:215:0x007a, B:218:0x007d, B:231:0x00e7, B:233:0x00ef, B:235:0x00f5, B:236:0x0100, B:237:0x0118, B:239:0x011e, B:241:0x0122, B:242:0x0127, B:245:0x013d, B:248:0x0160, B:252:0x016d, B:253:0x0172, B:255:0x0179, B:257:0x0190, B:261:0x0151, B:262:0x0159, B:276:0x00a9, B:278:0x00b2, B:296:0x058e, B:298:0x0595, B:299:0x0597, B:307:0x059a, B:217:0x007b), top: B:213:0x0078, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(java.nio.ByteBuffer r32, long r33, int r35) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1330wD.o(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean p() {
        return h() && this.f11150f.c(b());
    }
}
