package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4582o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f4583p;

    public /* synthetic */ D3(int i4, Object obj) {
        this.f4582o = i4;
        this.f4583p = obj;
    }

    public /* synthetic */ D3(C0825kh c0825kh) {
        this.f4582o = 24;
        this.f4583p = new WeakReference(c0825kh);
    }

    private final void a() {
        boolean z4;
        if (((F3) this.f4583p).f4975b != null) {
            return;
        }
        synchronized (F3.c) {
            if (((F3) this.f4583p).f4975b != null) {
                return;
            }
            boolean z5 = false;
            try {
                z4 = ((Boolean) AbstractC1066q6.f10205b2.r()).booleanValue();
            } catch (IllegalStateException unused) {
                z4 = false;
            }
            if (z4) {
                try {
                    F3.d = Or.a(((F3) this.f4583p).f4974a.f7127a, "ADSHIELD");
                } catch (Throwable unused2) {
                }
            }
            z5 = z4;
            ((F3) this.f4583p).f4975b = Boolean.valueOf(z5);
            F3.c.open();
        }
    }

    private final void b() {
        synchronized (((F4) this.f4583p).f4978q) {
            F4 f4 = (F4) this.f4583p;
            if (f4.f4979r && f4.f4980s) {
                f4.f4979r = false;
                Y9.m("App went background");
                ArrayList arrayList = ((F4) this.f4583p).f4981t;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    try {
                        ((G4) obj).v(false);
                    } catch (Exception e4) {
                        Y9.q("", e4);
                    }
                }
            } else {
                Y9.m("App is still foreground");
            }
        }
    }

    private final void c() {
        J2 j22 = (J2) this.f4583p;
        synchronized (j22) {
            try {
                A2.o oVar = (A2.o) j22.f5781r;
                if (oVar.f35p) {
                    InterfaceC1321w4 interfaceC1321w4 = (InterfaceC1321w4) oVar.f36q;
                    byte[] bArr = (byte[]) j22.f5780q;
                    C1235u4 c1235u4 = (C1235u4) interfaceC1321w4;
                    Parcel Q3 = c1235u4.Q();
                    Q3.writeByteArray(bArr);
                    c1235u4.G1(Q3, 5);
                    C1235u4 c1235u42 = (C1235u4) ((InterfaceC1321w4) ((A2.o) j22.f5781r).f36q);
                    Parcel Q4 = c1235u42.Q();
                    Q4.writeInt(0);
                    c1235u42.G1(Q4, 6);
                    InterfaceC1321w4 interfaceC1321w42 = (InterfaceC1321w4) ((A2.o) j22.f5781r).f36q;
                    int i4 = j22.f5779p;
                    C1235u4 c1235u43 = (C1235u4) interfaceC1321w42;
                    Parcel Q5 = c1235u43.Q();
                    Q5.writeInt(i4);
                    c1235u43.G1(Q5, 7);
                    C1235u4 c1235u44 = (C1235u4) ((InterfaceC1321w4) ((A2.o) j22.f5781r).f36q);
                    Parcel Q6 = c1235u44.Q();
                    Q6.writeIntArray(null);
                    c1235u44.G1(Q6, 4);
                    C1235u4 c1235u45 = (C1235u4) ((InterfaceC1321w4) ((A2.o) j22.f5781r).f36q);
                    c1235u45.G1(c1235u45.Q(), 3);
                }
            } catch (RemoteException e4) {
                Y9.o("Clearcut log failed", e4);
            }
        }
    }

    private final void d() {
        LinkedHashMap linkedHashMap;
        C1151s6 c1151s6 = (C1151s6) this.f4583p;
        while (true) {
            try {
                C1323w6 c1323w6 = (C1323w6) ((ArrayBlockingQueue) c1151s6.f10577a).take();
                C1280v6 a4 = c1323w6.a();
                if (!TextUtils.isEmpty(a4.f10994o)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) c1151s6.f10578b;
                    synchronized (c1323w6.c) {
                        N1.n.f1204A.f1209g.b();
                        linkedHashMap = c1323w6.f11112b;
                    }
                    c1151s6.d(c1151s6.b(linkedHashMap2, linkedHashMap), a4);
                }
            } catch (InterruptedException e4) {
                Y9.t("CsiReporter:reporter interrupted", e4);
                return;
            }
        }
    }

    private final void e() {
        O1.r rVar;
        long longValue;
        long intValue;
        boolean booleanValue;
        O1.r rVar2;
        long j4;
        long j5;
        long j6;
        long j7;
        C1422yd c1422yd = (C1422yd) this.f4583p;
        String u2 = C1422yd.u(c1422yd.f11361s);
        try {
            C0937n6 c0937n6 = AbstractC1066q6.f10276r;
            rVar = O1.r.d;
            longValue = ((Long) rVar.c.a(c0937n6)).longValue() * 1000;
            intValue = ((Integer) rVar.c.a(AbstractC1066q6.f10271q)).intValue();
            booleanValue = ((Boolean) rVar.c.a(AbstractC1066q6.f10094D1)).booleanValue();
        } catch (Exception e4) {
            Y9.s("Failed to preload url " + c1422yd.f11361s + " Exception: " + e4.getMessage());
            N1.n.f1204A.f1209g.g("VideoStreamExoPlayerCache.preload", e4);
            c1422yd.i();
            c1422yd.m(c1422yd.f11361s, u2, "error", C1422yd.v("error", e4));
        }
        synchronized (c1422yd) {
            N1.n.f1204A.f1212j.getClass();
            if (System.currentTimeMillis() - c1422yd.f11365w > longValue) {
                throw new IOException("Timeout reached. Limit: " + longValue + " ms");
            }
            if (c1422yd.f11362t) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!c1422yd.f11363u) {
                MC mc = c1422yd.f11360r.f5034u;
                if (!(mc != null)) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long s12 = mc.s1();
                if (s12 > 0) {
                    long r1 = c1422yd.f11360r.f5034u.r1();
                    if (r1 != c1422yd.f11366x) {
                        boolean z4 = r1 > 0;
                        String str = c1422yd.f11361s;
                        if (booleanValue) {
                            C0273Fd c0273Fd = c1422yd.f11360r;
                            j7 = (c0273Fd.f5026G == null || !c0273Fd.f5026G.f4448C) ? c0273Fd.y : 0L;
                        } else {
                            j7 = -1;
                        }
                        j4 = intValue;
                        j5 = s12;
                        long s4 = booleanValue ? c1422yd.f11360r.s() : -1L;
                        j6 = r1;
                        rVar2 = rVar;
                        C1335wc.f11173b.post(new RunnableC1036pd(c1422yd, str, u2, j6, j5, j7, s4, booleanValue ? c1422yd.f11360r.o() : -1L, z4, C0273Fd.f5018I.get(), C0273Fd.f5019J.get()));
                        c1422yd.f11366x = j6;
                    } else {
                        rVar2 = rVar;
                        j4 = intValue;
                        j5 = s12;
                        j6 = r1;
                    }
                    if (j6 >= j5) {
                        C1335wc.f11173b.post(new RunnableC1164sd(c1422yd, c1422yd.f11361s, u2, j5));
                    } else if (c1422yd.f11360r.y >= j4 && j6 > 0) {
                    }
                } else {
                    rVar2 = rVar;
                }
                Q1.N.f1668k.postDelayed(new D3(13, c1422yd), ((Long) rVar2.c.a(AbstractC1066q6.f10280s)).longValue());
                return;
            }
            N1.n.f1204A.y.f9741o.remove(c1422yd.f11364v);
        }
    }

    private final void f() {
        C1296vg c1296vg = (C1296vg) this.f4583p;
        synchronized (c1296vg) {
            try {
                if (c1296vg.f11042s.isDone()) {
                    return;
                }
                c1296vg.f11042s.f(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.di, java.lang.Exception] */
    private final void g() {
        Og og = (Og) this.f4583p;
        synchronized (og) {
            Y9.p("Timeout waiting for show call succeed to be called.");
            og.M0(new Exception("Timeout for show call succeed."));
            og.f6485s = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4582o) {
            case 0:
                synchronized (((E3) this.f4583p).f4820B) {
                    if (((E3) this.f4583p).f4821C) {
                        return;
                    }
                    ((E3) this.f4583p).f4821C = true;
                    try {
                        E3.k((E3) this.f4583p);
                    } catch (Exception e4) {
                        ((E3) this.f4583p).f4829t.d(2023, -1L, e4);
                    }
                    synchronized (((E3) this.f4583p).f4820B) {
                        ((E3) this.f4583p).f4821C = false;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((Y3) this.f4583p).c();
                return;
            case 3:
                C0849l4 c0849l4 = (C0849l4) this.f4583p;
                try {
                    U3 u32 = c0849l4.f9360a;
                    DexClassLoader dexClassLoader = u32.c;
                    byte[] bArr = u32.f7129e;
                    String str = c0849l4.f9361b;
                    u32.d.getClass();
                    Class<?> loadClass = dexClassLoader.loadClass(new String(BF.e(str, bArr), "UTF-8"));
                    if (loadClass != null) {
                        U3 u33 = c0849l4.f9360a;
                        byte[] bArr2 = u33.f7129e;
                        String str2 = c0849l4.c;
                        u33.d.getClass();
                        c0849l4.d = loadClass.getMethod(new String(BF.e(str2, bArr2), "UTF-8"), c0849l4.f9362e);
                    }
                } catch (N3 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
                } catch (Throwable th) {
                    c0849l4.f9363f.countDown();
                    throw th;
                }
                c0849l4.f9363f.countDown();
                return;
            case 4:
                ((A4) this.f4583p).c(3);
                return;
            case 5:
                b();
                return;
            case 6:
                C0381a5.v((C0381a5) this.f4583p);
                return;
            case 7:
                c();
                return;
            case 8:
                d();
                return;
            case 9:
                e2.i iVar = (e2.i) this.f4583p;
                if (((C0466c5) iVar.f12759p) == null) {
                    return;
                }
                ((C0466c5) iVar.f12759p).k();
                Binder.flushPendingCommands();
                return;
            case 10:
                ((AbstractC0322Pc) this.f4583p).y();
                return;
            case 11:
                C0337Sc c0337Sc = (C0337Sc) ((InterfaceC0317Oc) this.f4583p);
                AbstractC0322Pc abstractC0322Pc = c0337Sc.f6979u;
                ImageView imageView = c0337Sc.f6971E;
                if (c0337Sc.f6980v && imageView.getParent() != null) {
                    c0337Sc.f6974p.removeView(imageView);
                }
                if (abstractC0322Pc == null || c0337Sc.f6970D == null) {
                    return;
                }
                N1.n nVar = N1.n.f1204A;
                nVar.f1212j.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (abstractC0322Pc.getBitmap(c0337Sc.f6970D) != null) {
                    c0337Sc.f6972F = true;
                }
                nVar.f1212j.getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (Q1.I.y()) {
                    Q1.I.w("Spinner frame grab took " + elapsedRealtime2 + "ms");
                }
                if (elapsedRealtime2 > c0337Sc.f6978t) {
                    Y9.s("Spinner frame grab crossed jank threshold! Suspending spinner.");
                    c0337Sc.y = false;
                    c0337Sc.f6970D = null;
                    C1323w6 c1323w6 = c0337Sc.f6976r;
                    if (c1323w6 != null) {
                        c1323w6.b("spinner_jank", Long.toString(elapsedRealtime2));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                N1.n.f1204A.y.f9741o.remove((C0864ld) this.f4583p);
                return;
            case 13:
                e();
                return;
            case 14:
                C0348Ud c0348Ud = ((C0396ae) this.f4583p).f8141o;
                Q1.H h4 = c0348Ud.f7165o.f7490e0;
                h4.c = true;
                if (h4.f1634b) {
                    h4.c();
                }
                P1.a v02 = c0348Ud.f7165o.v0();
                if (v02 != null) {
                    v02.f1501z.removeView(v02.f1496t);
                    v02.N3(true);
                    return;
                }
                return;
            case 15:
                int i4 = C0396ae.f8122T;
                C1151s6 b4 = N1.n.f1204A.f1209g.b();
                String str3 = (String) this.f4583p;
                if (((HashSet) b4.f10581g).contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) b4.f10579e);
                linkedHashMap.put("ue", str3);
                b4.d(b4.b((LinkedHashMap) b4.f10578b, linkedHashMap), null);
                return;
            case 16:
                ViewTreeObserverOnGlobalLayoutListenerC0358Wd.F((ViewTreeObserverOnGlobalLayoutListenerC0358Wd) this.f4583p);
                return;
            case 17:
                ((C0995of) this.f4583p).f9841p.d.a();
                return;
            case 18:
                ((C0995of) this.f4583p).f9841p.d.b();
                return;
            case 19:
                Gf gf = (Gf) this.f4583p;
                K7 k7 = gf.f5308o.d;
                if (k7 == null) {
                    return;
                }
                try {
                    O1.J j4 = (O1.J) gf.f5310q.c();
                    BinderC1813b binderC1813b = new BinderC1813b(gf.f5303j);
                    Parcel Q3 = k7.Q();
                    AbstractC1192t4.e(Q3, j4);
                    AbstractC1192t4.e(Q3, binderC1813b);
                    k7.G1(Q3, 1);
                    return;
                } catch (RemoteException e5) {
                    Y9.q("RemoteException when notifyAdLoad is called", e5);
                    return;
                }
            case 20:
                Runnable runnable = (Runnable) ((AtomicReference) this.f4583p).getAndSet(null);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 21:
                ((C0611fg) this.f4583p).c = false;
                return;
            case 22:
                f();
                return;
            case 23:
                g();
                return;
            case 24:
                C0825kh c0825kh = (C0825kh) ((WeakReference) this.f4583p).get();
                if (c0825kh != null) {
                    c0825kh.n1(C0782jh.f9199p);
                    return;
                }
                return;
            case 25:
                ((Fi) this.f4583p).o();
                return;
            case 26:
                Ji ji = (Ji) this.f4583p;
                if (ji.f5884u == null) {
                    View view = new View(ji.f5881r.getContext());
                    ji.f5884u = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (ji.f5881r != ji.f5884u.getParent()) {
                    ji.f5881r.addView(ji.f5884u);
                    return;
                }
                return;
            case 27:
                ViewTreeObserverOnGlobalLayoutListenerC1042pj viewTreeObserverOnGlobalLayoutListenerC1042pj = (ViewTreeObserverOnGlobalLayoutListenerC1042pj) this.f4583p;
                try {
                    viewTreeObserverOnGlobalLayoutListenerC1042pj.getClass();
                    h2.y.d("#008 Must be called on the main UI thread.");
                    viewTreeObserverOnGlobalLayoutListenerC1042pj.M3();
                    C1427yi c1427yi = viewTreeObserverOnGlobalLayoutListenerC1042pj.f10031q;
                    if (c1427yi != null) {
                        c1427yi.x();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC1042pj.f10031q = null;
                    viewTreeObserverOnGlobalLayoutListenerC1042pj.f10029o = null;
                    viewTreeObserverOnGlobalLayoutListenerC1042pj.f10030p = null;
                    viewTreeObserverOnGlobalLayoutListenerC1042pj.f10032r = true;
                    return;
                } catch (RemoteException e6) {
                    Y9.u("#007 Could not call remote method.", e6);
                    return;
                }
            case 28:
                String str4 = N1.n.f1204A.f1209g.c().x().f9735e;
                boolean isEmpty = TextUtils.isEmpty(str4);
                C0272Fc c0272Fc = (C0272Fc) this.f4583p;
                if (isEmpty) {
                    c0272Fc.c(new Exception());
                    return;
                } else {
                    c0272Fc.b(str4);
                    return;
                }
            default:
                ((C0573el) this.f4583p).a();
                return;
        }
    }
}
