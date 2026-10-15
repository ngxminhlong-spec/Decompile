package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.RemoteException;
import android.view.WindowManager;
import android.widget.FrameLayout;
import c3.InterfaceFutureC0239a;
import h2.InterfaceC1703b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ln, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0874ln implements InterfaceC0503d, r, InterfaceC0933n2, InterfaceC1405y2, InterfaceC1703b, InterfaceC0524de, S1.c, Mu, Bh {

    /* renamed from: q, reason: collision with root package name */
    public static final Bz f9464q = new Bz(1);

    /* renamed from: r, reason: collision with root package name */
    public static C0874ln f9465r;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9466o;

    /* renamed from: p, reason: collision with root package name */
    public Object f9467p;

    public C0874ln(int i4) {
        InterfaceC0429bA interfaceC0429bA;
        this.f9466o = i4;
        switch (i4) {
            case 3:
                this.f9467p = new C1134rq(10);
                return;
            case 7:
                this.f9467p = new J2(0, (byte) 0);
                return;
            case 8:
                this.f9467p = Collections.EMPTY_LIST;
                return;
            case 12:
                this.f9467p = new AtomicBoolean(false);
                return;
            default:
                try {
                    interfaceC0429bA = (InterfaceC0429bA) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC0429bA = f9464q;
                }
                Xz xz = new Xz(Bz.f4210b, interfaceC0429bA);
                Charset charset = Mz.f6292a;
                this.f9467p = xz;
                return;
        }
    }

    public /* synthetic */ C0874ln(int i4, Object obj) {
        this.f9466o = i4;
        this.f9467p = obj;
    }

    public C0874ln(C7 c7) {
        Context context;
        this.f9466o = 10;
        this.f9467p = c7;
        try {
            context = (Context) BinderC1813b.C2(c7.f());
        } catch (RemoteException | NullPointerException e4) {
            Y9.q("", e4);
            context = null;
        }
        if (context != null) {
            try {
                ((C7) this.f9467p).X(new BinderC1813b(new FrameLayout(context)));
            } catch (RemoteException e5) {
                Y9.q("", e5);
            }
        }
    }

    public C0874ln(InterfaceC1109r7 interfaceC1109r7) {
        this.f9466o = 16;
        this.f9467p = interfaceC1109r7;
        try {
            InterfaceC1812a d = interfaceC1109r7.d();
            if (d != null) {
            }
        } catch (RemoteException e4) {
            Y9.q("", e4);
        }
        try {
            ((InterfaceC1109r7) this.f9467p).a();
        } catch (RemoteException e5) {
            Y9.q("", e5);
        }
        try {
            ((InterfaceC1109r7) this.f9467p).c();
        } catch (RemoteException e6) {
            Y9.q("", e6);
        }
        try {
            ((InterfaceC1109r7) this.f9467p).i();
        } catch (RemoteException e7) {
            Y9.q("", e7);
        }
        try {
            ((InterfaceC1109r7) this.f9467p).e();
        } catch (RemoteException e8) {
            Y9.q("", e8);
        }
    }

    public /* synthetic */ C0874ln(C1423ye c1423ye, Context context, String str, O1.X0 x02) {
        this.f9466o = 19;
        AB a4 = AB.a(context);
        AB a5 = AB.a(x02);
        AB a6 = AB.a(str);
        C1414yB b4 = C1414yB.b(new C1000ok(c1423ye.f11401f, 18));
        C1414yB b5 = C1414yB.b(new Eo(c1423ye.f11400e0, 4));
        this.f9467p = C1414yB.b(new C1124rg(a4, a5, a6, C1414yB.b(new C1252uf(a4, c1423ye.f11403g, c1423ye.y, b4, b5)), b4, b5, c1423ye.d, c1423ye.f11424z, c1423ye.f11370C));
    }

    public C0874ln(ByteBuffer byteBuffer) {
        this.f9466o = 6;
        this.f9467p = byteBuffer.slice();
    }

    private final void i() {
    }

    private final void j(Throwable th) {
    }

    private final void k(Throwable th) {
    }

    @Override // h2.InterfaceC1703b
    public void O(int i4) {
        synchronized (((C0381a5) this.f9467p).f8079r) {
            C0381a5 c0381a5 = (C0381a5) this.f9467p;
            c0381a5.f8081t = null;
            c0381a5.f8079r.notifyAll();
        }
    }

    @Override // h2.InterfaceC1703b
    public void Q() {
        synchronized (((C0381a5) this.f9467p).f8079r) {
            try {
                C0381a5 c0381a5 = (C0381a5) this.f9467p;
                C0466c5 c0466c5 = (C0466c5) c0381a5.f8080s;
                if (c0466c5 != null) {
                    c0381a5.f8081t = (C0551e5) c0466c5.t();
                }
            } catch (DeadObjectException e4) {
                Y9.q("Unable to obtain a cache service instance.", e4);
                C0381a5.v((C0381a5) this.f9467p);
            }
            ((C0381a5) this.f9467p).f8079r.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503d
    public void a(M3 m32) {
        C0631g.a((C0631g) m32.f6208p, ((WindowManager) this.f9467p).getDefaultDisplay());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503d
    public long b() {
        return ((ByteBuffer) this.f9467p).capacity();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503d
    public void b() {
        switch (this.f9466o) {
            case 2:
                return;
            default:
                N1.n.f1204A.f1212j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                Q8 q8 = (Q8) this.f9467p;
                long j4 = q8.f6647a;
                ArrayList arrayList = (ArrayList) q8.c;
                arrayList.add(Long.valueOf(currentTimeMillis - j4));
                Q1.I.w("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                Q1.N.f1668k.postDelayed(new O8((Z8) q8.f6648b, (Y8) q8.d, (M8) q8.f6649e, arrayList, j4, 0), (long) ((Integer) O1.r.d.c.a(AbstractC1066q6.f10202b)).intValue());
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0220, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03e9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0306 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03c7 A[LOOP:0: B:2:0x0012->B:72:0x03c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03e9 A[EDGE_INSN: B:73:0x03e9->B:74:0x03e9 BREAK  A[LOOP:0: B:2:0x0012->B:72:0x03c7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.B2 c(com.google.android.gms.internal.ads.D2 r25) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0874ln.c(com.google.android.gms.internal.ads.D2):com.google.android.gms.internal.ads.B2");
    }

    @Override // com.google.android.gms.internal.ads.r
    public long d(long j4) {
        H h4 = (H) this.f9467p;
        return Math.max(0L, Math.min((j4 * h4.f5356e) / 1000000, h4.f5361j - 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0933n2
    public void e(MessageDigest[] messageDigestArr, long j4, int i4) {
        ByteBuffer slice;
        synchronized (((ByteBuffer) this.f9467p)) {
            int i5 = (int) j4;
            ((ByteBuffer) this.f9467p).position(i5);
            ((ByteBuffer) this.f9467p).limit(i5 + i4);
            slice = ((ByteBuffer) this.f9467p).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // S1.c
    public void f(H1.a aVar) {
        switch (this.f9466o) {
            case 13:
                try {
                    ((N9) this.f9467p).r(aVar.a());
                    return;
                } catch (RemoteException e4) {
                    Y9.q("", e4);
                    return;
                }
            case 14:
                try {
                    ((R9) this.f9467p).r(aVar.a());
                    return;
                } catch (RemoteException e5) {
                    Y9.q("", e5);
                    return;
                }
            default:
                try {
                    ((T9) this.f9467p).r(aVar.a());
                    return;
                } catch (RemoteException e6) {
                    Y9.q("", e6);
                    return;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.C1120rc g(com.google.android.gms.internal.ads.C r18, com.google.android.gms.internal.ads.BF r19) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0874ln.g(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.BF):com.google.android.gms.internal.ads.rc");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, B0.c] */
    public WD[] h(Handler handler, SurfaceHolderCallbackC0730iC surfaceHolderCallbackC0730iC, SurfaceHolderCallbackC0730iC surfaceHolderCallbackC0730iC2) {
        Context context = ((C0273Fd) this.f9467p).f5028o;
        C0559eD c0559eD = C0559eD.f8591b;
        InterfaceC0403al[] interfaceC0403alArr = new InterfaceC0403al[0];
        ?? obj = new Object();
        obj.f68p = C0559eD.f8591b;
        if (c0559eD == null && c0559eD == null) {
            throw new NullPointerException("Both parameters are null");
        }
        obj.f68p = c0559eD;
        obj.f69q = new C0882lv(interfaceC0403alArr);
        Zf.X(!obj.f67o);
        obj.f67o = true;
        if (((C0882lv) obj.f69q) == null) {
            obj.f69q = new C0882lv(new InterfaceC0403al[0]);
        }
        if (((RC) obj.f70r) == null) {
            obj.f70r = new Object();
        }
        return new WD[]{new C1416yD(context, handler, surfaceHolderCallbackC0730iC2, new C1330wD(obj)), new CF(context, handler, surfaceHolderCallbackC0730iC)};
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        switch (this.f9466o) {
            case 23:
                ((Mg) obj).r((C0101z0) this.f9467p);
                return;
            case 24:
                ((Pg) obj).r(Zf.L(12, ((C0528di) this.f9467p).getMessage(), null));
                return;
            case 25:
                ((InterfaceC0740ih) obj).o(((C0698hh) this.f9467p).f8956q.f11507e0);
                return;
            case 26:
                ((InterfaceC0954nh) obj).N((C0370Za) this.f9467p);
                return;
            default:
                ((InterfaceC0982o8) obj).L0((C0948nb) this.f9467p);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo4r(Object obj) {
        switch (this.f9466o) {
            case 17:
                C0291Jb.f5856l.remove((InterfaceFutureC0239a) this.f9467p);
                return;
            case 21:
                ((C0781jg) this.f9467p).f9172f.n0(true);
                return;
            case 22:
                ((C1296vg) this.f9467p).f11038o.b();
                return;
            default:
                ((InterfaceC0308Md) obj).b("sendMessageToNativeJs", (Map) this.f9467p);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        switch (this.f9466o) {
            case 17:
                C0291Jb.f5856l.remove((InterfaceFutureC0239a) this.f9467p);
                return;
            case 21:
                ((C0781jg) this.f9467p).f9172f.n0(false);
                return;
            case 22:
            default:
                return;
        }
    }
}
