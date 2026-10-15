package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import b0.RunnableC0203p;
import com.google.android.gms.internal.measurement.C1509e0;
import com.google.android.gms.internal.measurement.C1510e1;
import e2.C1664b;
import h2.InterfaceC1704c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class M3 implements M2, Cr, InterfaceC1704c, Mu, InterfaceC0282Hc, InterfaceC0277Gc, S1.c, InterfaceC0351Vb, InterfaceC1399xx, Bh {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6207o;

    /* renamed from: p, reason: collision with root package name */
    public Object f6208p;

    public M3(int i4) {
        this.f6207o = i4;
        switch (i4) {
            case 8:
                this.f6208p = new HashMap();
                return;
            case 17:
                this.f6208p = new WeakHashMap();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ M3(int i4, Object obj) {
        this.f6207o = i4;
        this.f6208p = obj;
    }

    public M3(Handler handler) {
        this.f6207o = 5;
        this.f6208p = new ExecutorC1319w2(handler, 0);
    }

    private final void e(Throwable th) {
    }

    public static M3 i(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        M3 m32 = new M3(0);
        if (connectivityManager != null && Build.VERSION.SDK_INT >= 24) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new L3(0, m32));
                return m32;
            } catch (RuntimeException unused) {
                synchronized (M3.class) {
                    m32.f6208p = null;
                }
            }
        }
        return m32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0351Vb
    public void a(InterfaceC0609fe interfaceC0609fe) {
        Bundle bundle = (Bundle) this.f6208p;
        C1509e0 c1509e0 = (C1509e0) ((BinderC0854l9) interfaceC0609fe).f9378o.f13386p;
        c1509e0.b(new com.google.android.gms.internal.measurement.Q(c1509e0, bundle, 1));
    }

    @Override // h2.InterfaceC1704c
    public void a0(C1664b c1664b) {
        synchronized (((C0381a5) this.f6208p).f8079r) {
            try {
                C0381a5 c0381a5 = (C0381a5) this.f6208p;
                c0381a5.f8081t = null;
                if (((C0466c5) c0381a5.f8080s) != null) {
                    c0381a5.f8080s = null;
                }
                c0381a5.f8079r.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399xx
    public Px b() {
        return new Mw((byte[]) this.f6208p);
    }

    @Override // com.google.android.gms.internal.ads.M2
    /* renamed from: b, reason: collision with other method in class */
    public File mo2b() {
        return (File) this.f6208p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0277Gc
    /* renamed from: b */
    public void mo1b() {
        ((C0272Fc) this.f6208p).c(new Exception("Cannot get Javascript Engine"));
    }

    public AtomicReference c(String str) {
        synchronized (this) {
            try {
                if (!((HashMap) this.f6208p).containsKey(str)) {
                    ((HashMap) this.f6208p).put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) ((HashMap) this.f6208p).get(str);
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public void d(int i4, long j4) {
        ((B0.c) this.f6208p).e(i4, System.currentTimeMillis() - j4);
    }

    @Override // S1.c
    public void f(H1.a aVar) {
        switch (this.f6207o) {
            case 14:
                try {
                    ((N9) this.f6208p).r(aVar.a());
                    return;
                } catch (RemoteException e4) {
                    Y9.q("", e4);
                    return;
                }
            case 15:
                try {
                    ((P9) this.f6208p).r(aVar.a());
                    return;
                } catch (RemoteException e5) {
                    Y9.q("", e5);
                    return;
                }
            default:
                try {
                    ((L9) this.f6208p).r(aVar.a());
                    return;
                } catch (RemoteException e6) {
                    Y9.q("", e6);
                    return;
                }
        }
    }

    public void g(D2 d22, B0.c cVar, RunnableC0203p runnableC0203p) {
        synchronized (d22.f4575s) {
            d22.f4579w = true;
        }
        d22.d("post-response");
        ((ExecutorC1319w2) this.f6208p).f11109p.post(new RunnableC0801k(d22, cVar, runnableC0203p, 1));
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public void h(int i4, long j4, String str) {
        ((B0.c) this.f6208p).g(i4, System.currentTimeMillis() - j4, null, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    public List j(C1510e1 c1510e1) {
        String str;
        int i4;
        C1134rq c1134rq = new C1134rq((byte[]) c1510e1.f11915q);
        ArrayList arrayList = (List) this.f6208p;
        while (c1134rq.g() > 0) {
            int m4 = c1134rq.m();
            int m5 = c1134rq.f10537b + c1134rq.m();
            if (m4 == 134) {
                arrayList = new ArrayList();
                int m6 = c1134rq.m() & 31;
                for (int i5 = 0; i5 < m6; i5++) {
                    String z4 = c1134rq.z(3, AbstractC1480zs.c);
                    int m7 = c1134rq.m();
                    boolean z5 = (m7 & 128) != 0;
                    if (z5) {
                        i4 = m7 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i4 = 1;
                    }
                    byte m8 = (byte) c1134rq.m();
                    c1134rq.f(1);
                    List singletonList = z5 ? Collections.singletonList((m8 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    L1 l12 = new L1();
                    l12.f6101j = str;
                    l12.c = z4;
                    l12.f6090B = i4;
                    l12.f6103l = singletonList;
                    arrayList.add(new C0976o2(l12));
                }
            }
            c1134rq.e(m5);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0282Hc, com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        switch (this.f6207o) {
            case 12:
                Z8 z8 = (Z8) this.f6208p;
                z8.getClass();
                if (((M8) obj).f6219o.f7165o.t()) {
                    z8.f7965b = 1;
                    return;
                }
                return;
            case 24:
                ((Mg) obj).M0((C0528di) this.f6208p);
                return;
            case 25:
                ((InterfaceC0399ah) obj).J0((Yf) this.f6208p);
                return;
            case 26:
                ((InterfaceC0954nh) obj).K0((Ep) this.f6208p);
                return;
            case 28:
                ((InterfaceC1426yh) obj).t0((C1236u5) this.f6208p);
                return;
            default:
                ((InterfaceC1450z4) obj).j0((C1407y4) this.f6208p);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        switch (this.f6207o) {
            case 10:
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f6208p;
                new Q1.y(interfaceC0308Md.getContext(), interfaceC0308Md.m().f4084o, (String) obj).f();
                return;
            case 19:
                ((AtomicInteger) ((AbstractC0287Ic) this.f6208p).f5575b).set(1);
                return;
            default:
                C0952nf c0952nf = (C0952nf) this.f6208p;
                String str = (String) obj;
                Lp lp = c0952nf.f9754v;
                Nq nq = c0952nf.f9753u;
                Ep ep = c0952nf.f9751s;
                C1434yp c1434yp = c0952nf.f9752t;
                lp.c(true == N1.n.f1204A.f1209g.j(c0952nf.f9747o) ? 2 : 1, nq.b(ep, c1434yp, false, "", str, c1434yp.c));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        switch (this.f6207o) {
            case 10:
                N1.n.f1204A.f1209g.h("DefaultGmsgHandlers.attributionReportingManager", th);
                return;
            case 19:
                ((AtomicInteger) ((AbstractC0287Ic) this.f6208p).f5575b).set(-1);
                return;
            default:
                return;
        }
    }
}
