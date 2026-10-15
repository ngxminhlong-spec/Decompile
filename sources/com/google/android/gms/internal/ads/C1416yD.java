package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416yD extends WD implements InterfaceC1243uC {

    /* renamed from: M0, reason: collision with root package name */
    public final Context f11342M0;
    public final C0831kn N0;

    /* renamed from: O0, reason: collision with root package name */
    public final C1330wD f11343O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f11344P0;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f11345Q0;

    /* renamed from: R0, reason: collision with root package name */
    public C0976o2 f11346R0;

    /* renamed from: S0, reason: collision with root package name */
    public C0976o2 f11347S0;

    /* renamed from: T0, reason: collision with root package name */
    public long f11348T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f11349U0;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f11350V0;

    /* renamed from: W0, reason: collision with root package name */
    public C0900mC f11351W0;

    public C1416yD(Context context, Handler handler, SurfaceHolderCallbackC0730iC surfaceHolderCallbackC0730iC, C1330wD c1330wD) {
        super(1, 44100.0f);
        this.f11342M0 = context.getApplicationContext();
        this.f11343O0 = c1330wD;
        this.N0 = new C0831kn(7, handler, surfaceHolderCallbackC0730iC);
        c1330wD.f11156l = new RC(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.lt, com.google.android.gms.internal.ads.ot] */
    public static Gt n0(C0976o2 c0976o2, C1330wD c1330wD) {
        Iterable d;
        if (c0976o2.f9813k == null) {
            C1052pt c1052pt = AbstractC1137rt.f10543p;
            return Gt.f5344s;
        }
        if (c1330wD.j(c0976o2) != 0) {
            List d4 = AbstractC0518dE.d("audio/raw", false, false);
            SD sd = d4.isEmpty() ? null : (SD) d4.get(0);
            if (sd != null) {
                return AbstractC1137rt.t(sd);
            }
        }
        Pattern pattern = AbstractC0518dE.f8479a;
        List d5 = AbstractC0518dE.d(c0976o2.f9813k, false, false);
        String c = AbstractC0518dE.c(c0976o2);
        if (c == null) {
            C1052pt c1052pt2 = AbstractC1137rt.f10543p;
            d = Gt.f5344s;
        } else {
            d = AbstractC0518dE.d(c, false, false);
        }
        ?? abstractC0880lt = new AbstractC0880lt(4);
        abstractC0880lt.c(d5);
        abstractC0880lt.c(d);
        return abstractC0880lt.f();
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final WB G(C0831kn c0831kn) {
        C0976o2 c0976o2 = (C0976o2) c0831kn.f9319p;
        c0976o2.getClass();
        this.f11346R0 = c0976o2;
        WB G3 = super.G(c0831kn);
        C0831kn c0831kn2 = this.N0;
        Handler handler = (Handler) c0831kn2.f9319p;
        if (handler != null) {
            handler.post(new RunnableC0801k(c0831kn2, c0976o2, G3, 10));
        }
        return G3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if ("AXON 7 mini".equals(r0) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    @Override // com.google.android.gms.internal.ads.WD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.OD J(com.google.android.gms.internal.ads.SD r11, com.google.android.gms.internal.ads.C0976o2 r12, float r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1416yD.J(com.google.android.gms.internal.ads.SD, com.google.android.gms.internal.ads.o2, float):com.google.android.gms.internal.ads.OD");
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final ArrayList K(Yv yv, C0976o2 c0976o2) {
        Gt n02 = n0(c0976o2, this.f11343O0);
        Pattern pattern = AbstractC0518dE.f8479a;
        ArrayList arrayList = new ArrayList(n02);
        Collections.sort(arrayList, new XD(new TC(c0976o2)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void L(RB rb) {
        C0976o2 c0976o2;
        if (AbstractC0751is.f9071a < 29 || (c0976o2 = rb.c) == null) {
            return;
        }
        String str = c0976o2.f9813k;
        if ((str == "audio/opus" || (str != null && str.equals("audio/opus"))) && this.f7413q0) {
            ByteBuffer byteBuffer = rb.f6794h;
            byteBuffer.getClass();
            rb.c.getClass();
            if (byteBuffer.remaining() == 8) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
                AudioTrack audioTrack = this.f11343O0.f11160p;
                if (audioTrack != null) {
                    C1330wD.i(audioTrack);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void M(Exception exc) {
        Wj.i("MediaCodecAudioRenderer", "Audio codec error", exc);
        C0831kn c0831kn = this.N0;
        Handler handler = (Handler) c0831kn.f9319p;
        if (handler != null) {
            handler.post(new RunnableC0645gD(c0831kn, exc, 5));
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void N(long j4, long j5, String str) {
        C0831kn c0831kn = this.N0;
        Handler handler = (Handler) c0831kn.f9319p;
        if (handler != null) {
            handler.post(new RunnableC0645gD(c0831kn, str, j4, j5));
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void O(String str) {
        C0831kn c0831kn = this.N0;
        Handler handler = (Handler) c0831kn.f9319p;
        if (handler != null) {
            handler.post(new RunnableC0645gD(c0831kn, str, 8));
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void P(C0976o2 c0976o2, MediaFormat mediaFormat) {
        C0976o2 c0976o22 = this.f11347S0;
        int[] iArr = null;
        if (c0976o22 != null) {
            c0976o2 = c0976o22;
        } else if (this.f7386S != null) {
            mediaFormat.getClass();
            String str = c0976o2.f9813k;
            int i4 = c0976o2.f9826x;
            int q4 = "audio/raw".equals(str) ? c0976o2.f9827z : (AbstractC0751is.f9071a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? AbstractC0751is.q(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            L1 l12 = new L1();
            l12.f6101j = "audio/raw";
            l12.y = q4;
            l12.f6116z = c0976o2.f9798A;
            l12.f6089A = c0976o2.f9799B;
            l12.f6099h = c0976o2.f9811i;
            l12.f6094a = c0976o2.f9805a;
            l12.f6095b = c0976o2.f9806b;
            l12.c = c0976o2.c;
            l12.d = c0976o2.d;
            l12.f6114w = mediaFormat.getInteger("channel-count");
            l12.f6115x = mediaFormat.getInteger("sample-rate");
            c0976o2 = new C0976o2(l12);
            if (this.f11345Q0 && c0976o2.f9826x == 6 && i4 < 6) {
                iArr = new int[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    iArr[i5] = i5;
                }
            }
        }
        try {
            int i6 = AbstractC0751is.f9071a;
            if (i6 >= 29) {
                if (this.f7413q0) {
                    this.f7414r.getClass();
                }
                Zf.X(i6 >= 29);
            }
            this.f11343O0.k(c0976o2, iArr);
        } catch (C0688hD e4) {
            throw d0(e4, e4.f8934o, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void R() {
        this.f11343O0.f11128B = true;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void S() {
        try {
            C1330wD c1330wD = this.f11343O0;
            if (!c1330wD.f11137K && c1330wD.h() && c1330wD.g()) {
                c1330wD.d();
                c1330wD.f11137K = true;
            }
        } catch (C0772jD e4) {
            throw d0(e4, e4.f9143q, e4.f9142p, true != this.f7413q0 ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final boolean T(long j4, long j5, PD pd, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z4, boolean z5, C0976o2 c0976o2) {
        byteBuffer.getClass();
        if (this.f11347S0 != null && (i5 & 2) != 0) {
            pd.getClass();
            pd.c(i4, false);
            return true;
        }
        C1330wD c1330wD = this.f11343O0;
        if (z4) {
            if (pd != null) {
                pd.c(i4, false);
            }
            this.f7370F0.f7241f += i6;
            c1330wD.f11128B = true;
            return true;
        }
        try {
            if (!c1330wD.o(byteBuffer, j6, i6)) {
                return false;
            }
            if (pd != null) {
                pd.c(i4, false);
            }
            this.f7370F0.f7240e += i6;
            return true;
        } catch (C0731iD e4) {
            throw d0(e4, this.f11346R0, e4.f9037p, 5001);
        } catch (C0772jD e5) {
            if (this.f7413q0) {
                this.f7414r.getClass();
            }
            throw d0(e5, c0976o2, e5.f9142p, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final boolean U(C0976o2 c0976o2) {
        this.f7414r.getClass();
        return this.f11343O0.j(c0976o2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.GC
    public final void a(int i4, Object obj) {
        C1330wD c1330wD = this.f11343O0;
        if (i4 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (c1330wD.f11131E != floatValue) {
                c1330wD.f11131E = floatValue;
                if (c1330wD.h()) {
                    if (AbstractC0751is.f9071a >= 21) {
                        c1330wD.f11160p.setVolume(c1330wD.f11131E);
                        return;
                    }
                    AudioTrack audioTrack = c1330wD.f11160p;
                    float f4 = c1330wD.f11131E;
                    audioTrack.setStereoVolume(f4, f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i4 == 3) {
            C0644gC c0644gC = (C0644gC) obj;
            c0644gC.getClass();
            if (c1330wD.f11162r.equals(c0644gC)) {
                return;
            }
            c1330wD.f11162r = c0644gC;
            c1330wD.l();
            return;
        }
        if (i4 == 6) {
            C1157sC c1157sC = (C1157sC) obj;
            c1157sC.getClass();
            if (c1330wD.f11141P.equals(c1157sC)) {
                return;
            }
            if (c1330wD.f11160p != null) {
                c1330wD.f11141P.getClass();
            }
            c1330wD.f11141P = c1157sC;
            return;
        }
        switch (i4) {
            case 9:
                obj.getClass();
                c1330wD.f11166v = ((Boolean) obj).booleanValue();
                C1244uD c1244uD = new C1244uD(c1330wD.f11165u, -9223372036854775807L, -9223372036854775807L);
                if (c1330wD.h()) {
                    c1330wD.f11163s = c1244uD;
                    return;
                } else {
                    c1330wD.f11164t = c1244uD;
                    return;
                }
            case 10:
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                if (c1330wD.f11140O != intValue) {
                    c1330wD.f11140O = intValue;
                    c1330wD.N = intValue != 0;
                    c1330wD.l();
                    return;
                }
                return;
            case 11:
                this.f11351W0 = (C0900mC) obj;
                return;
            case 12:
                if (AbstractC0751is.f9071a >= 23) {
                    AbstractC1373xD.a(c1330wD, obj);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243uC
    public final long b() {
        if (this.f7422v == 2) {
            o0();
        }
        return this.f11348T0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243uC
    public final void c(C0951ne c0951ne) {
        C1330wD c1330wD = this.f11343O0;
        c1330wD.getClass();
        c1330wD.f11165u = new C0951ne(Math.max(0.1f, Math.min(c0951ne.f9742a, 8.0f)), Math.max(0.1f, Math.min(c0951ne.f9743b, 8.0f)));
        C1244uD c1244uD = new C1244uD(c0951ne, -9223372036854775807L, -9223372036854775807L);
        if (c1330wD.h()) {
            c1330wD.f11163s = c1244uD;
        } else {
            c1330wD.f11164t = c1244uD;
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void d() {
        C1330wD c1330wD = this.f11343O0;
        try {
            try {
                H();
                a0();
                if (this.f11350V0) {
                    this.f11350V0 = false;
                    c1330wD.n();
                }
            } finally {
                this.f7379K0 = null;
            }
        } catch (Throwable th) {
            if (this.f11350V0) {
                this.f11350V0 = false;
                c1330wD.n();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243uC
    public final C0951ne e() {
        return this.f11343O0.f11165u;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final InterfaceC1243uC e0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void f() {
        this.f11343O0.m();
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void g() {
        o0();
        C1330wD c1330wD = this.f11343O0;
        c1330wD.f11139M = false;
        if (c1330wD.h()) {
            C0901mD c0901mD = c1330wD.f11150f;
            c0901mD.f9591l = 0L;
            c0901mD.f9603x = 0;
            c0901mD.f9602w = 0;
            c0901mD.f9592m = 0L;
            c0901mD.f9578D = 0L;
            c0901mD.f9581G = 0L;
            c0901mD.f9590k = false;
            if (c0901mD.y == -9223372036854775807L) {
                C0858lD c0858lD = c0901mD.f9585f;
                c0858lD.getClass();
                c0858lD.a(0);
            } else {
                c0901mD.f9575A = c0901mD.d();
                if (!C1330wD.i(c1330wD.f11160p)) {
                    return;
                }
            }
            c1330wD.f11160p.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void i0() {
        C0831kn c0831kn = this.N0;
        this.f11350V0 = true;
        this.f11346R0 = null;
        try {
            try {
                this.f11343O0.l();
                super.i0();
                VB vb = this.f7370F0;
                c0831kn.getClass();
                synchronized (vb) {
                }
                Handler handler = (Handler) c0831kn.f9319p;
                if (handler != null) {
                    handler.post(new Jn(13, c0831kn, vb));
                }
            } catch (Throwable th) {
                super.i0();
                c0831kn.G(this.f7370F0);
                throw th;
            }
        } catch (Throwable th2) {
            c0831kn.G(this.f7370F0);
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.google.android.gms.internal.ads.VB] */
    @Override // com.google.android.gms.internal.ads.WD
    public final void j0(boolean z4, boolean z5) {
        ?? obj = new Object();
        this.f7370F0 = obj;
        C0831kn c0831kn = this.N0;
        Handler handler = (Handler) c0831kn.f9319p;
        if (handler != null) {
            handler.post(new RunnableC0645gD(c0831kn, obj, 0));
        }
        this.f7414r.getClass();
        C0474cD c0474cD = this.f7418t;
        c0474cD.getClass();
        C1330wD c1330wD = this.f11343O0;
        c1330wD.f11155k = c0474cD;
        this.f7420u.getClass();
        c1330wD.f11150f.getClass();
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void k0(boolean z4, long j4) {
        super.k0(z4, j4);
        this.f11343O0.l();
        this.f11348T0 = j4;
        this.f11349U0 = true;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void l0() {
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final String m() {
        return "MediaCodecAudioRenderer";
    }

    public final int m0(SD sd, C0976o2 c0976o2) {
        int i4;
        if (!"OMX.google.raw.decoder".equals(sd.f6957a) || (i4 = AbstractC0751is.f9071a) >= 24 || (i4 == 23 && AbstractC0751is.e(this.f11342M0))) {
            return c0976o2.f9814l;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final boolean o() {
        if (!this.f7366D0) {
            return false;
        }
        C1330wD c1330wD = this.f11343O0;
        if (c1330wD.h()) {
            return c1330wD.f11137K && !c1330wD.p();
        }
        return true;
    }

    public final void o0() {
        long j4;
        long s4;
        long j5;
        boolean o4 = o();
        C1330wD c1330wD = this.f11343O0;
        C0882lv c0882lv = c1330wD.f11145T;
        ArrayDeque arrayDeque = c1330wD.f11151g;
        if (!c1330wD.h() || c1330wD.f11129C) {
            j4 = Long.MIN_VALUE;
        } else {
            long min = Math.min(c1330wD.f11150f.a(o4), AbstractC0751is.u(c1330wD.f11158n.f10683e, c1330wD.b()));
            while (!arrayDeque.isEmpty() && min >= ((C1244uD) arrayDeque.getFirst()).c) {
                c1330wD.f11164t = (C1244uD) arrayDeque.remove();
            }
            C1244uD c1244uD = c1330wD.f11164t;
            long j6 = min - c1244uD.c;
            if (c1244uD.f10786a.equals(C0951ne.d)) {
                s4 = c1330wD.f11164t.f10787b + j6;
            } else if (arrayDeque.isEmpty()) {
                C1215tl c1215tl = (C1215tl) c0882lv.f9506p;
                long j7 = c1215tl.f10734o;
                if (j7 >= 1024) {
                    long j8 = c1215tl.f10733n;
                    C1129rl c1129rl = c1215tl.f10729j;
                    c1129rl.getClass();
                    int i4 = c1129rl.f10509k * c1129rl.f10502b;
                    long j9 = j8 - (i4 + i4);
                    int i5 = c1215tl.f10727h.f5071a;
                    int i6 = c1215tl.f10726g.f5071a;
                    j5 = i5 == i6 ? AbstractC0751is.v(j6, j9, j7, RoundingMode.FLOOR) : AbstractC0751is.v(j6, j9 * i5, j7 * i6, RoundingMode.FLOOR);
                } else {
                    j5 = (long) (c1215tl.c * j6);
                }
                s4 = j5 + c1330wD.f11164t.f10787b;
            } else {
                C1244uD c1244uD2 = (C1244uD) arrayDeque.getFirst();
                s4 = c1244uD2.f10787b - AbstractC0751is.s(c1244uD2.c - min, c1330wD.f11164t.f10786a.f9742a);
            }
            j4 = AbstractC0751is.u(c1330wD.f11158n.f10683e, ((C1459zD) c0882lv.f9508r).f11584q) + s4;
        }
        if (j4 != Long.MIN_VALUE) {
            if (!this.f11349U0) {
                j4 = Math.max(this.f11348T0, j4);
            }
            this.f11348T0 = j4;
            this.f11349U0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final boolean p() {
        return this.f11343O0.p() || super.p();
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final float r(float f4, C0976o2[] c0976o2Arr) {
        int i4 = -1;
        for (C0976o2 c0976o2 : c0976o2Arr) {
            int i5 = c0976o2.y;
            if (i5 != -1) {
                i4 = Math.max(i4, i5);
            }
        }
        if (i4 == -1) {
            return -1.0f;
        }
        return i4 * f4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if ((r6.isEmpty() ? null : (com.google.android.gms.internal.ads.SD) r6.get(0)) != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    @Override // com.google.android.gms.internal.ads.WD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(com.google.android.gms.internal.ads.Yv r14, com.google.android.gms.internal.ads.C0976o2 r15) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1416yD.s(com.google.android.gms.internal.ads.Yv, com.google.android.gms.internal.ads.o2):int");
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final WB t(SD sd, C0976o2 c0976o2, C0976o2 c0976o22) {
        int i4;
        int i5;
        WB a4 = sd.a(c0976o2, c0976o22);
        int i6 = a4.f7352e;
        if (this.f7379K0 == null && U(c0976o22)) {
            i6 |= 32768;
        }
        if (m0(sd, c0976o22) > this.f11344P0) {
            i6 |= 64;
        }
        String str = sd.f6957a;
        if (i6 != 0) {
            i5 = 0;
            i4 = i6;
        } else {
            i4 = 0;
            i5 = a4.d;
        }
        return new WB(str, c0976o2, c0976o22, i5, i4);
    }
}
