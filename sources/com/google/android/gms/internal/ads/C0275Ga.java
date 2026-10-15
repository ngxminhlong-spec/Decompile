package com.google.android.gms.internal.ads;

import O1.C0101z0;
import O1.InterfaceC0060e0;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b0.RunnableC0203p;
import e2.C1664b;
import h2.InterfaceC1703b;
import h2.InterfaceC1704c;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275Ga implements InterfaceC0280Ha, N1.e, Mu, InterfaceC1703b, InterfaceC1704c {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f5179u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static InterfaceC0280Ha f5180v;

    /* renamed from: w, reason: collision with root package name */
    public static InterfaceC0280Ha f5181w;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5182o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f5183p;

    /* renamed from: q, reason: collision with root package name */
    public Object f5184q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f5185r;

    /* renamed from: s, reason: collision with root package name */
    public Object f5186s;

    /* renamed from: t, reason: collision with root package name */
    public Object f5187t;

    public C0275Ga(Context context, C0248Bc c0248Bc) {
        this.f5182o = 0;
        this.f5183p = new Object();
        this.f5185r = new WeakHashMap();
        this.f5186s = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f5184q = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5187t = c0248Bc;
    }

    public C0275Ga(Context context, String str, String str2) {
        this.f5182o = 9;
        this.f5184q = str;
        this.f5185r = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f5187t = handlerThread;
        handlerThread.start();
        Fr fr = new Fr(9200000, context, handlerThread.getLooper(), this, this);
        this.f5183p = fr;
        this.f5186s = new LinkedBlockingQueue();
        fr.n();
    }

    public C0275Ga(Context context, Executor executor, B0.c cVar, C1093qr c1093qr, C1350wr c1350wr, C1393xr c1393xr) {
        this.f5182o = 10;
        this.f5184q = context;
        this.f5183p = executor;
        this.f5185r = cVar;
    }

    public C0275Ga(T7 t7) {
        InterfaceC1109r7 interfaceC1109r7;
        this.f5182o = 1;
        this.f5184q = new ArrayList();
        this.f5186s = new C0258Da(6);
        this.f5187t = new ArrayList();
        this.f5183p = t7;
        C1152s7 c1152s7 = null;
        try {
            List s4 = t7.s();
            if (s4 != null) {
                for (Object obj : s4) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        interfaceC1109r7 = queryLocalInterface instanceof InterfaceC1109r7 ? (InterfaceC1109r7) queryLocalInterface : new C1067q7(iBinder);
                    } else {
                        interfaceC1109r7 = null;
                    }
                    if (interfaceC1109r7 != null) {
                        ((ArrayList) this.f5184q).add(new C1152s7(interfaceC1109r7));
                    }
                }
            }
        } catch (RemoteException e4) {
            Y9.q("", e4);
        }
        try {
            List t4 = ((T7) this.f5183p).t();
            if (t4 != null) {
                for (Object obj2 : t4) {
                    InterfaceC0060e0 K32 = obj2 instanceof IBinder ? O1.F0.K3((IBinder) obj2) : null;
                    if (K32 != null) {
                        ((ArrayList) this.f5187t).add(new B0.f(K32));
                    }
                }
            }
        } catch (RemoteException e5) {
            Y9.q("", e5);
        }
        try {
            InterfaceC1109r7 k3 = ((T7) this.f5183p).k();
            if (k3 != null) {
                c1152s7 = new C1152s7(k3);
            }
        } catch (RemoteException e6) {
            Y9.q("", e6);
        }
        this.f5185r = c1152s7;
        try {
            if (((T7) this.f5183p).g() != null) {
                new C0938n7(((T7) this.f5183p).g(), 0);
            }
        } catch (RemoteException e7) {
            Y9.q("", e7);
        }
    }

    public C0275Ga(C1064q4 c1064q4, File file, File file2, File file3) {
        this.f5182o = 11;
        this.f5183p = c1064q4;
        this.f5184q = file;
        this.f5185r = file3;
        this.f5186s = file2;
    }

    public /* synthetic */ C0275Ga(Class cls) {
        this.f5182o = 12;
        this.f5184q = new ConcurrentHashMap();
        this.f5185r = new ArrayList();
        this.f5183p = cls;
        this.f5187t = C1227tx.f10760b;
    }

    public /* synthetic */ C0275Ga(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.f5182o = i4;
        this.f5187t = obj;
        this.f5183p = obj2;
        this.f5184q = obj3;
        this.f5185r = obj4;
        this.f5186s = obj5;
    }

    public C0275Ga(ScheduledExecutorService scheduledExecutorService, Su su, Su su2, C0573el c0573el, InterfaceC1328wB interfaceC1328wB) {
        this.f5182o = 2;
        this.f5183p = scheduledExecutorService;
        this.f5184q = su;
        this.f5185r = su2;
        this.f5186s = c0573el;
        this.f5187t = interfaceC1328wB;
    }

    public static C0977o3 a() {
        C0549e3 V4 = C0977o3.V();
        V4.d();
        C0977o3.F0((C0977o3) V4.f4561p, 32768L);
        return (C0977o3) V4.b();
    }

    public static InterfaceC0280Ha b(Context context) {
        synchronized (f5179u) {
            try {
                if (f5180v == null) {
                    if (((Boolean) W6.f7344e.r()).booleanValue()) {
                        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.N6)).booleanValue()) {
                            f5180v = new C0275Ga(context, C0248Bc.h());
                        }
                    }
                    f5180v = new C1016p(21);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5180v;
    }

    private final void d(Throwable th) {
        Eq eq;
        C0250Be c0250Be = (C0250Be) ((Uo) this.f5187t).f7188e.i();
        C0101z0 u2 = c0250Be == null ? Zf.u(th, null) : Zf.u(th, c0250Be.c().f9178l);
        synchronized (((Uo) this.f5187t)) {
            try {
                Uo uo = (Uo) this.f5187t;
                uo.f7193j = null;
                if (c0250Be != null) {
                    ((Kg) c0250Be.f4124l.c()).J(u2);
                    if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f7)).booleanValue()) {
                        ((Uo) this.f5187t).f7187b.execute(new Jn(1, this, u2));
                    }
                } else {
                    uo.d.J(u2);
                    ((Uo) this.f5187t).b((So) this.f5186s).a().c().f9172f.f();
                }
                Zf.z(u2.f1405o, th, "AppOpenAdLoader.onFailure");
                ((Gn) this.f5183p).mo5b();
                if (!((Boolean) G6.c.r()).booleanValue() || (eq = (Eq) this.f5184q) == null) {
                    Fq fq = ((Uo) this.f5187t).f7191h;
                    Aq aq = (Aq) this.f5185r;
                    aq.r(u2);
                    aq.d(th);
                    aq.b(false);
                    fq.b(aq.l());
                } else {
                    eq.c(u2);
                    Aq aq2 = (Aq) this.f5185r;
                    aq2.d(th);
                    aq2.b(false);
                    eq.a(aq2);
                    eq.g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void i(Throwable th) {
        Eq eq;
        C0101z0 u2 = Zf.u(th, ((C0781jg) ((C0262De) this.f5186s).f4659P0.c()).f9178l);
        synchronized (((Zo) this.f5187t)) {
            try {
                ((Zo) this.f5187t).f8054l = null;
                ((Kg) ((C0262De) this.f5186s).J0.c()).J(u2);
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.e7)).booleanValue()) {
                    ((Zo) this.f5187t).f8046b.execute(new Jn(2, this, u2));
                }
                Zo zo = (Zo) this.f5187t;
                zo.f8050h.r1(zo.f8052j.a());
                Zf.z(u2.f1405o, th, "BannerAdLoader.onFailure");
                ((Gn) this.f5183p).mo5b();
                if (!((Boolean) G6.c.r()).booleanValue() || (eq = (Eq) this.f5184q) == null) {
                    Fq fq = ((Zo) this.f5187t).f8051i;
                    Aq aq = (Aq) this.f5185r;
                    aq.r(u2);
                    aq.d(th);
                    aq.b(false);
                    fq.b(aq.l());
                } else {
                    eq.c(u2);
                    Aq aq2 = (Aq) this.f5185r;
                    aq2.d(th);
                    aq2.b(false);
                    eq.a(aq2);
                    eq.g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void j(Throwable th) {
        Eq eq;
        final C0101z0 u2 = Zf.u(th, ((C0781jg) ((C0279Ge) this.f5186s).f5208K0.c()).f9178l);
        synchronized (((C1091qp) this.f5187t)) {
            try {
                ((C1091qp) this.f5187t).f10414i = null;
                ((Kg) ((C0279Ge) this.f5186s).f5201G0.c()).J(u2);
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.g7)).booleanValue()) {
                    final int i4 = 0;
                    ((C1091qp) this.f5187t).f10409b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.op

                        /* renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ C0275Ga f9857p;

                        {
                            this.f9857p = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    ((C1091qp) this.f9857p.f5187t).d.J(u2);
                                    return;
                                default:
                                    ((C1091qp) this.f9857p.f5187t).f10410e.J(u2);
                                    return;
                            }
                        }
                    });
                    final int i5 = 1;
                    ((C1091qp) this.f5187t).f10409b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.op

                        /* renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ C0275Ga f9857p;

                        {
                            this.f9857p = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    ((C1091qp) this.f9857p.f5187t).d.J(u2);
                                    return;
                                default:
                                    ((C1091qp) this.f9857p.f5187t).f10410e.J(u2);
                                    return;
                            }
                        }
                    });
                }
                Zf.z(u2.f1405o, th, "InterstitialAdLoader.onFailure");
                ((Gn) this.f5183p).mo5b();
                if (!((Boolean) G6.c.r()).booleanValue() || (eq = (Eq) this.f5184q) == null) {
                    Fq fq = ((C1091qp) this.f5187t).f10412g;
                    Aq aq = (Aq) this.f5185r;
                    aq.r(u2);
                    aq.d(th);
                    aq.b(false);
                    fq.b(aq.l());
                } else {
                    eq.c(u2);
                    Aq aq2 = (Aq) this.f5185r;
                    aq2.d(th);
                    aq2.b(false);
                    eq.a(aq2);
                    eq.g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static InterfaceC0280Ha k(Context context, C0248Bc c0248Bc) {
        synchronized (f5179u) {
            if (f5181w == null) {
                if (((Boolean) W6.f7344e.r()).booleanValue()) {
                    if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.N6)).booleanValue()) {
                        C0275Ga c0275Ga = new C0275Ga(context, c0248Bc);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (c0275Ga.f5183p) {
                                ((WeakHashMap) c0275Ga.f5185r).put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new C0270Fa(c0275Ga, thread.getUncaughtExceptionHandler(), 1));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new C0270Fa(c0275Ga, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f5181w = c0275Ga;
                    }
                }
                f5181w = new C1016p(21);
            }
        }
        return f5181w;
    }

    private final void l(Object obj) {
        Eq eq;
        Yf yf = (Yf) obj;
        synchronized (((C0381a5) this.f5187t)) {
            try {
                ((C1040ph) yf.f7862g.f10000o.f6208p).f10001p = (Bn) ((Op) ((C0381a5) this.f5187t).f8079r).f6526q;
                ((Xj) this.f5183p).B(yf);
                ((C1423ye) ((C0381a5) this.f5187t).f8078q).a().execute(new RunnableC0526dg(this, 1));
                if (!((Boolean) G6.c.r()).booleanValue() || (eq = (Eq) this.f5184q) == null) {
                    Fq fq = (Fq) ((C0381a5) this.f5187t).f8080s;
                    Aq aq = (Aq) this.f5185r;
                    aq.c(yf.f7858a.f4943b);
                    aq.F(yf.f7861f.f5059o);
                    aq.b(true);
                    fq.b(aq.l());
                } else {
                    eq.f(yf.f7858a.f4943b);
                    eq.e(yf.f7861f.f5059o);
                    Aq aq2 = (Aq) this.f5185r;
                    aq2.b(true);
                    eq.a(aq2);
                    eq.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void m(Object obj) {
        Eq eq;
        Yf yf = (Yf) obj;
        synchronized (((Uo) this.f5187t)) {
            try {
                ((Uo) this.f5187t).f7193j = null;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f7)).booleanValue()) {
                    ((C1040ph) yf.f7862g.f10000o.f6208p).f10003r = ((Uo) this.f5187t).d;
                }
                ((Gn) this.f5183p).B(yf);
                if (!((Boolean) G6.c.r()).booleanValue() || (eq = (Eq) this.f5184q) == null) {
                    Fq fq = ((Uo) this.f5187t).f7191h;
                    Aq aq = (Aq) this.f5185r;
                    aq.c(yf.f7858a.f4943b);
                    aq.F(yf.f7861f.f5059o);
                    aq.b(true);
                    fq.b(aq.l());
                } else {
                    eq.f(yf.f7858a.f4943b);
                    eq.e(yf.f7861f.f5059o);
                    Aq aq2 = (Aq) this.f5185r;
                    aq2.b(true);
                    eq.a(aq2);
                    eq.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void n(Object obj) {
        Eq eq;
        Ff ff = (Ff) obj;
        synchronized (((Zo) this.f5187t)) {
            try {
                Zo zo = (Zo) this.f5187t;
                zo.f8054l = null;
                zo.f8048f.removeAllViews();
                if (ff.c() != null) {
                    ViewParent parent = ff.c().getParent();
                    if (parent instanceof ViewGroup) {
                        Y9.s("Banner view provided from " + ff.f7861f.f5059o + " already has a parent view. Removing its old parent.");
                        ((ViewGroup) parent).removeView(ff.c());
                    }
                }
                C0937n6 c0937n6 = AbstractC1066q6.e7;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    M3 m32 = ff.f7862g.f10000o;
                    Zo zo2 = (Zo) this.f5187t;
                    Bn bn = zo2.d;
                    C1040ph c1040ph = (C1040ph) m32.f6208p;
                    c1040ph.f10001p = bn;
                    c1040ph.f10002q = zo2.f8047e;
                }
                ((Zo) this.f5187t).f8048f.addView(ff.c());
                ((Gn) this.f5183p).B(ff);
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    Zo zo3 = (Zo) this.f5187t;
                    Executor executor = zo3.f8046b;
                    Bn bn2 = zo3.d;
                    bn2.getClass();
                    executor.execute(new RunnableC0744il(8, bn2));
                }
                ((Zo) this.f5187t).f8050h.r1(ff.b());
                if (!((Boolean) G6.c.r()).booleanValue() || (eq = (Eq) this.f5184q) == null) {
                    Fq fq = ((Zo) this.f5187t).f8051i;
                    Aq aq = (Aq) this.f5185r;
                    aq.c(ff.f7858a.f4943b);
                    aq.F(ff.f7861f.f5059o);
                    aq.b(true);
                    fq.b(aq.l());
                } else {
                    eq.f(ff.f7858a.f4943b);
                    eq.e(ff.f7861f.f5059o);
                    Aq aq2 = (Aq) this.f5185r;
                    aq2.b(true);
                    eq.a(aq2);
                    eq.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void o(Object obj) {
        Eq eq;
        Xh xh = (Xh) obj;
        synchronized (((C1091qp) this.f5187t)) {
            try {
                ((C1091qp) this.f5187t).f10414i = null;
                C0937n6 c0937n6 = AbstractC1066q6.g7;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    M3 m32 = xh.f7862g.f10000o;
                    C1091qp c1091qp = (C1091qp) this.f5187t;
                    Bn bn = c1091qp.d;
                    C1040ph c1040ph = (C1040ph) m32.f6208p;
                    c1040ph.f10001p = bn;
                    c1040ph.f10004s = c1091qp.f10410e;
                }
                ((Gn) this.f5183p).B(xh);
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    final int i4 = 0;
                    ((C1091qp) this.f5187t).f10409b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.pp

                        /* renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ C0275Ga f10047p;

                        {
                            this.f10047p = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    ((C1091qp) this.f10047p.f5187t).d.M();
                                    return;
                                default:
                                    ((C1091qp) this.f10047p.f5187t).f10410e.M();
                                    return;
                            }
                        }
                    });
                    final int i5 = 1;
                    ((C1091qp) this.f5187t).f10409b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.pp

                        /* renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ C0275Ga f10047p;

                        {
                            this.f10047p = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    ((C1091qp) this.f10047p.f5187t).d.M();
                                    return;
                                default:
                                    ((C1091qp) this.f10047p.f5187t).f10410e.M();
                                    return;
                            }
                        }
                    });
                }
                if (!((Boolean) G6.c.r()).booleanValue() || (eq = (Eq) this.f5184q) == null) {
                    Fq fq = ((C1091qp) this.f5187t).f10412g;
                    Aq aq = (Aq) this.f5185r;
                    aq.c(xh.f7858a.f4943b);
                    aq.F(xh.f7861f.f5059o);
                    aq.b(true);
                    fq.b(aq.l());
                } else {
                    eq.f(xh.f7858a.f4943b);
                    eq.e(xh.f7861f.f5059o);
                    Aq aq2 = (Aq) this.f5185r;
                    aq2.b(true);
                    eq.a(aq2);
                    eq.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String p(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private final void q() {
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.google.android.gms.internal.ads.wr] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.google.android.gms.internal.ads.xr] */
    public static C0275Ga s(Context context, Executor executor, B0.c cVar, C1093qr c1093qr) {
        final C0275Ga c0275Ga = new C0275Ga(context, executor, cVar, c1093qr, (C1350wr) new Object(), (C1393xr) new Object());
        if (c1093qr.f10418b) {
            final int i4 = 0;
            A2.r f4 = AbstractC1895f.f(executor, new Callable(c0275Ga) { // from class: com.google.android.gms.internal.ads.ur

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0275Ga f10950b;

                {
                    this.f10950b = c0275Ga;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i4) {
                        case 0:
                            C0549e3 V4 = C0977o3.V();
                            L1.a a4 = L1.b.a((Context) this.f10950b.f5184q);
                            String str = a4.f1075a;
                            if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                                UUID fromString = UUID.fromString(str);
                                byte[] bArr = new byte[16];
                                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                                wrap.putLong(fromString.getMostSignificantBits());
                                wrap.putLong(fromString.getLeastSignificantBits());
                                str = Base64.encodeToString(bArr, 11);
                            }
                            if (str != null) {
                                V4.d();
                                C0977o3.b0((C0977o3) V4.f4561p, str);
                                boolean z4 = a4.f1076b;
                                V4.d();
                                C0977o3.c0((C0977o3) V4.f4561p, z4);
                                V4.d();
                                C0977o3.o0((C0977o3) V4.f4561p);
                            }
                            return (C0977o3) V4.b();
                        default:
                            Context context2 = (Context) this.f10950b.f5184q;
                            return Zf.e(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                    }
                }
            });
            f4.c(executor, new A2.e() { // from class: com.google.android.gms.internal.ads.vr
                @Override // A2.e
                public final void c(Exception exc) {
                    if (exc instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    ((B0.c) C0275Ga.this.f5185r).d(2025, -1L, exc);
                }
            });
            c0275Ga.f5186s = f4;
        } else {
            c0275Ga.f5186s = AbstractC1895f.l(C1350wr.f11215a);
        }
        final int i5 = 1;
        A2.r f5 = AbstractC1895f.f(executor, new Callable(c0275Ga) { // from class: com.google.android.gms.internal.ads.ur

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0275Ga f10950b;

            {
                this.f10950b = c0275Ga;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i5) {
                    case 0:
                        C0549e3 V4 = C0977o3.V();
                        L1.a a4 = L1.b.a((Context) this.f10950b.f5184q);
                        String str = a4.f1075a;
                        if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                            UUID fromString = UUID.fromString(str);
                            byte[] bArr = new byte[16];
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            wrap.putLong(fromString.getMostSignificantBits());
                            wrap.putLong(fromString.getLeastSignificantBits());
                            str = Base64.encodeToString(bArr, 11);
                        }
                        if (str != null) {
                            V4.d();
                            C0977o3.b0((C0977o3) V4.f4561p, str);
                            boolean z4 = a4.f1076b;
                            V4.d();
                            C0977o3.c0((C0977o3) V4.f4561p, z4);
                            V4.d();
                            C0977o3.o0((C0977o3) V4.f4561p);
                        }
                        return (C0977o3) V4.b();
                    default:
                        Context context2 = (Context) this.f10950b.f5184q;
                        return Zf.e(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                }
            }
        });
        f5.c(executor, new A2.e() { // from class: com.google.android.gms.internal.ads.vr
            @Override // A2.e
            public final void c(Exception exc) {
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ((B0.c) C0275Ga.this.f5185r).d(2025, -1L, exc);
            }
        });
        c0275Ga.f5187t = f5;
        return c0275Ga;
    }

    @Override // h2.InterfaceC1703b
    public void O(int i4) {
        try {
            ((LinkedBlockingQueue) this.f5186s).put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // h2.InterfaceC1703b
    public void Q() {
        Ir ir;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f5186s;
        HandlerThread handlerThread = (HandlerThread) this.f5187t;
        try {
            ir = (Ir) ((Fr) this.f5183p).t();
        } catch (DeadObjectException | IllegalStateException unused) {
            ir = null;
        }
        if (ir != null) {
            try {
                try {
                    Gr gr = new Gr(1, (String) this.f5184q, (String) this.f5185r);
                    Parcel Q3 = ir.Q();
                    AbstractC1192t4.c(Q3, gr);
                    Parcel q12 = ir.q1(Q3, 1);
                    Hr hr = (Hr) AbstractC1192t4.a(q12, Hr.CREATOR);
                    q12.recycle();
                    if (hr.f5513p == null) {
                        try {
                            hr.f5513p = C0977o3.q0(hr.f5514q, C1315vz.f11096b);
                            hr.f5514q = null;
                        } catch (Oz | NullPointerException e4) {
                            throw new IllegalStateException(e4);
                        }
                    }
                    hr.h();
                    linkedBlockingQueue.put(hr.f5513p);
                } catch (Throwable unused2) {
                    linkedBlockingQueue.put(a());
                }
            } catch (InterruptedException unused3) {
            } catch (Throwable th) {
                e();
                handlerThread.quit();
                throw th;
            }
            e();
            handlerThread.quit();
        }
    }

    @Override // h2.InterfaceC1704c
    public void a0(C1664b c1664b) {
        try {
            ((LinkedBlockingQueue) this.f5186s).put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // N1.e
    public void c() {
    }

    @Override // N1.e
    public void e() {
        switch (this.f5182o) {
            case 3:
                return;
            default:
                Fr fr = (Fr) this.f5183p;
                if (fr != null) {
                    if (fr.a() || fr.g()) {
                        fr.k();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // N1.e
    public void f(View view) {
        C0960nn c0960nn = (C0960nn) this.f5186s;
        C1384xi c1384xi = (C1384xi) ((Bm) this.f5187t).f4173e;
        Ep ep = (Ep) this.f5184q;
        C1434yp c1434yp = (C1434yp) this.f5185r;
        Ij ij = new Ij(C0782jh.f9198S, null, 1);
        C0274Fe a4 = ((C0279Ge) c1384xi.f11290p).a(new Op(ep, c1434yp, (String) null), ij);
        Xj xj = new Xj(9, a4);
        synchronized (c0960nn) {
            c0960nn.f9777o = xj;
        }
        ((C0272Fc) this.f5183p).b(a4.f0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0280Ha
    public void g(String str, Throwable th) {
        h(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0280Ha
    public void h(Throwable th, String str, float f4) {
        Throwable th2;
        boolean z4;
        String str2;
        C0248Bc c0248Bc = (C0248Bc) this.f5187t;
        Context context = (Context) this.f5184q;
        Ur ur = C1335wc.f11173b;
        int i4 = 1;
        if (((Boolean) W6.f7345f.r()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", i4));
                boolean z5 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) ? false : className.startsWith((String) W6.d.r())) {
                        arrayList.add(stackTraceElement);
                        z5 = true;
                    } else {
                        String className2 = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className2) && (className2.startsWith("android.") || className2.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z5) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
                i4 = 1;
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String p3 = p(th);
        String O4 = ((Boolean) O1.r.d.c.a(AbstractC1066q6.K7)).booleanValue() ? Bs.O(C1335wc.n(p(th), "SHA-256")) : "";
        double d = f4;
        double random = Math.random();
        int i5 = f4 > 0.0f ? (int) (1.0f / f4) : 1;
        if (random < d) {
            ArrayList arrayList2 = new ArrayList();
            try {
                z4 = m2.c.a(context).c();
            } catch (Throwable th5) {
                Y9.q("Error fetching instant app info", th5);
                z4 = false;
            }
            try {
                str2 = context.getPackageName();
            } catch (Throwable unused) {
                Y9.s("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z4)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = n0.a.i(str3, " ", str4);
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", c0248Bc.f4084o).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", p3).appendQueryParameter("eids", TextUtils.join(",", O1.r.d.f1379a.m())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "579009612").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i5)).appendQueryParameter("pb_tm", String.valueOf(W6.c.r()));
            e2.f.f12753b.getClass();
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(e2.f.a(context))).appendQueryParameter("lite", true != c0248Bc.f4088s ? "0" : "1");
            if (!TextUtils.isEmpty(O4)) {
                appendQueryParameter3.appendQueryParameter("hash", O4);
            }
            arrayList2.add(appendQueryParameter3.toString());
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                ((ExecutorService) this.f5186s).execute(new RunnableC0203p(10, new C0242Ac(null), (String) obj));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        Eq eq;
        switch (this.f5182o) {
            case 4:
                l(obj);
                return;
            case 5:
                m(obj);
                return;
            case 6:
                n(obj);
                return;
            case 7:
                o(obj);
                return;
            default:
                Hj hj = (Hj) obj;
                synchronized (((C1219tp) this.f5187t)) {
                    try {
                        ((C1040ph) hj.f7862g.f10000o.f6208p).f10004s = ((C1219tp) this.f5187t).d;
                        ((Gn) this.f5183p).B(hj);
                        C1219tp c1219tp = (C1219tp) this.f5187t;
                        Executor executor = c1219tp.f10745b;
                        C1133rp c1133rp = c1219tp.d;
                        c1133rp.getClass();
                        executor.execute(new RunnableC0744il(11, c1133rp));
                        ((C1219tp) this.f5187t).d.l();
                        if (!((Boolean) G6.c.r()).booleanValue() || (eq = (Eq) this.f5184q) == null) {
                            Fq fq = ((C1219tp) this.f5187t).f10748g;
                            Aq aq = (Aq) this.f5185r;
                            aq.c(hj.f7858a.f4943b);
                            aq.F(hj.f7861f.f5059o);
                            aq.b(true);
                            fq.b(aq.l());
                        } else {
                            eq.f(hj.f7858a.f4943b);
                            eq.e(hj.f7861f.f5059o);
                            Aq aq2 = (Aq) this.f5185r;
                            aq2.b(true);
                            eq.a(aq2);
                            eq.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public void t(Object obj, Object obj2, C1314vy c1314vy, boolean z4) {
        byte[] array;
        if (((ConcurrentHashMap) this.f5184q) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (c1314vy.D() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer valueOf = Integer.valueOf(c1314vy.v());
        if (c1314vy.y() == Jy.f5945s) {
            valueOf = null;
        }
        Bs a4 = Iw.f5771b.a(Tw.x(c1314vy.w().z(), c1314vy.w().y(), c1314vy.w().w(), c1314vy.y(), valueOf));
        int ordinal = c1314vy.y().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    array = Wj.f7529F;
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(c1314vy.v()).array();
        } else {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(c1314vy.v()).array();
        }
        C1097qv c1097qv = new C1097qv(obj, obj2, array, c1314vy.D(), c1314vy.y(), c1314vy.v(), c1314vy.w().z(), a4);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f5184q;
        ArrayList arrayList = (ArrayList) this.f5185r;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c1097qv);
        byte[] bArr = c1097qv.c;
        C1139rv c1139rv = new C1139rv(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(c1139rv, Collections.unmodifiableList(arrayList2));
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(list);
            arrayList3.add(c1097qv);
            concurrentHashMap.put(c1139rv, Collections.unmodifiableList(arrayList3));
        }
        arrayList.add(c1097qv);
        if (z4) {
            if (((C1097qv) this.f5186s) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f5186s = c1097qv;
        }
    }

    public void u(Throwable th) {
        if (th != null) {
            boolean z4 = false;
            boolean z5 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    String className = stackTraceElement.getClassName();
                    Ur ur = C1335wc.f11173b;
                    z4 |= TextUtils.isEmpty(className) ? false : className.startsWith((String) W6.d.r());
                    z5 |= C0275Ga.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z4 || z5) {
                return;
            }
            h(th, "", 1.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] v() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f5187t
            byte[] r0 = (byte[]) r0
            r1 = 0
            if (r0 != 0) goto L5a
            java.lang.Object r0 = r9.f5186s
            java.io.File r0 = (java.io.File) r0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L53
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L53
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            r3 = 256(0x100, float:3.59E-43)
        L17:
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            r5 = 0
            r6 = r5
        L1b:
            if (r6 >= r3) goto L2b
            int r7 = r3 - r6
            int r7 = r2.read(r4, r6, r7)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            r8 = -1
            if (r7 != r8) goto L27
            goto L2b
        L27:
            int r6 = r6 + r7
            goto L1b
        L29:
            r0 = move-exception
            goto L4c
        L2b:
            if (r6 != 0) goto L2f
            r4 = r1
            goto L33
        L2f:
            com.google.android.gms.internal.ads.jz r4 = com.google.android.gms.internal.ads.AbstractC0886lz.A(r4, r5, r6)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
        L33:
            if (r4 != 0) goto L41
            com.google.android.gms.internal.ads.lz r0 = com.google.android.gms.internal.ads.AbstractC0886lz.z(r0)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            byte[] r0 = r0.h()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            l2.AbstractC1799b.c(r2)
            goto L58
        L41:
            r0.add(r4)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            int r3 = r3 + r3
            r4 = 8192(0x2000, float:1.148E-41)
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            goto L17
        L4c:
            r1 = r2
            goto L4f
        L4e:
            r0 = move-exception
        L4f:
            l2.AbstractC1799b.c(r1)
            throw r0
        L53:
            r2 = r1
        L54:
            l2.AbstractC1799b.c(r2)
            r0 = r1
        L58:
            r9.f5187t = r0
        L5a:
            java.lang.Object r0 = r9.f5187t
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L61
            return r1
        L61:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0275Ga.v():byte[]");
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        Eq eq;
        Eq eq2;
        switch (this.f5182o) {
            case 4:
                Aq aq = (Aq) this.f5185r;
                C1251ue c1251ue = (C1251ue) this.f5186s;
                C0101z0 u2 = Zf.u(th, ((C0781jg) c1251ue.f10819O0.c()).f9178l);
                ((Kg) c1251ue.f10813K0.c()).J(u2);
                C0381a5 c0381a5 = (C0381a5) this.f5187t;
                ((C1423ye) c0381a5.f8078q).a().execute(new Jn(0, this, u2));
                Zf.z(u2.f1405o, th, "NativeAdLoader.onFailure");
                ((Xj) this.f5183p).mo5b();
                if (!((Boolean) G6.c.r()).booleanValue() || (eq = (Eq) this.f5184q) == null) {
                    Fq fq = (Fq) c0381a5.f8080s;
                    aq.r(u2);
                    aq.d(th);
                    aq.b(false);
                    fq.b(aq.l());
                    return;
                }
                eq.c(u2);
                aq.d(th);
                aq.b(false);
                eq.a(aq);
                eq.g();
                return;
            case 5:
                d(th);
                return;
            case 6:
                i(th);
                return;
            case 7:
                j(th);
                return;
            default:
                C0289Ie c0289Ie = (C0289Ie) ((C1219tp) this.f5187t).f10746e.i();
                C0101z0 u4 = c0289Ie == null ? Zf.u(th, null) : Zf.u(th, c0289Ie.c().f9178l);
                synchronized (((C1219tp) this.f5187t)) {
                    try {
                        if (c0289Ie != null) {
                            ((Kg) c0289Ie.J0.c()).J(u4);
                            ((C1219tp) this.f5187t).f10745b.execute(new Jn(4, this, u4));
                        } else {
                            ((C1219tp) this.f5187t).d.J(u4);
                            ((C1219tp) this.f5187t).b((C1176sp) this.f5186s).b().c().f9172f.f();
                        }
                        Zf.z(u4.f1405o, th, "RewardedAdLoader.onFailure");
                        ((Gn) this.f5183p).mo5b();
                        if (!((Boolean) G6.c.r()).booleanValue() || (eq2 = (Eq) this.f5184q) == null) {
                            Fq fq2 = ((C1219tp) this.f5187t).f10748g;
                            Aq aq2 = (Aq) this.f5185r;
                            aq2.r(u4);
                            aq2.d(th);
                            aq2.b(false);
                            fq2.b(aq2.l());
                        } else {
                            eq2.c(u4);
                            Aq aq3 = (Aq) this.f5185r;
                            aq3.d(th);
                            aq3.b(false);
                            eq2.a(aq3);
                            eq2.g();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
