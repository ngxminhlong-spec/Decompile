package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1298vi implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11047o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1427yi f11048p;

    public /* synthetic */ RunnableC1298vi(C1427yi c1427yi, int i4) {
        this.f11047o = i4;
        this.f11048p = c1427yi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11047o) {
            case 0:
                C1427yi c1427yi = this.f11048p;
                try {
                    Ci ci = c1427yi.f11435k;
                    Gi gi = c1427yi.f11439o;
                    E7 e7 = gi.f5316a;
                    D7 d7 = gi.f5317b;
                    r.i iVar = gi.f5319f;
                    M7 m7 = gi.c;
                    int D4 = ci.D();
                    if (D4 == 1) {
                        if (e7 != null) {
                            c1427yi.t();
                            A7 a7 = (A7) c1427yi.f11440p.c();
                            Parcel Q3 = e7.Q();
                            AbstractC1192t4.e(Q3, a7);
                            e7.G1(Q3, 1);
                            return;
                        }
                        return;
                    }
                    if (D4 == 2) {
                        if (d7 != null) {
                            c1427yi.t();
                            InterfaceC1453z7 interfaceC1453z7 = (InterfaceC1453z7) c1427yi.f11441q.c();
                            Parcel Q4 = d7.Q();
                            AbstractC1192t4.e(Q4, interfaceC1453z7);
                            d7.G1(Q4, 1);
                            return;
                        }
                        return;
                    }
                    if (D4 == 3) {
                        if (((I7) iVar.get(ci.a())) != null) {
                            if (ci.Q() != null) {
                                c1427yi.y("Google", true);
                            }
                            ((I7) iVar.get(ci.a())).q0((C7) c1427yi.f11444t.c());
                            return;
                        }
                        return;
                    }
                    if (D4 == 6) {
                        if (m7 != null) {
                            c1427yi.t();
                            m7.v0((T7) c1427yi.f11442r.c());
                            return;
                        }
                        return;
                    }
                    if (D4 != 7) {
                        Y9.p("Wrong native template id!");
                        return;
                    }
                    G8 g8 = gi.f5318e;
                    if (g8 != null) {
                        D8 d8 = (D8) c1427yi.f11443s.c();
                        Parcel Q5 = g8.Q();
                        AbstractC1192t4.e(Q5, d8);
                        g8.G1(Q5, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e4) {
                    Y9.q("RemoteException when notifyAdLoad is called", e4);
                    return;
                }
            default:
                C1427yi c1427yi2 = this.f11048p;
                c1427yi2.f11436l.g();
                Ci ci2 = c1427yi2.f11435k;
                synchronized (ci2) {
                    try {
                        InterfaceC0308Md interfaceC0308Md = ci2.f4508i;
                        if (interfaceC0308Md != null) {
                            interfaceC0308Md.destroy();
                            ci2.f4508i = null;
                        }
                        InterfaceC0308Md interfaceC0308Md2 = ci2.f4509j;
                        if (interfaceC0308Md2 != null) {
                            interfaceC0308Md2.destroy();
                            ci2.f4509j = null;
                        }
                        InterfaceC0308Md interfaceC0308Md3 = ci2.f4510k;
                        if (interfaceC0308Md3 != null) {
                            interfaceC0308Md3.destroy();
                            ci2.f4510k = null;
                        }
                        InterfaceFutureC0239a interfaceFutureC0239a = ci2.f4512m;
                        if (interfaceFutureC0239a != null) {
                            interfaceFutureC0239a.cancel(false);
                            ci2.f4512m = null;
                        }
                        C0272Fc c0272Fc = ci2.f4513n;
                        if (c0272Fc != null) {
                            c0272Fc.cancel(false);
                            ci2.f4513n = null;
                        }
                        ci2.f4511l = null;
                        ci2.f4521v.clear();
                        ci2.f4522w.clear();
                        ci2.f4503b = null;
                        ci2.c = null;
                        ci2.d = null;
                        ci2.f4504e = null;
                        ci2.f4507h = null;
                        ci2.f4514o = null;
                        ci2.f4515p = null;
                        ci2.f4516q = null;
                        ci2.f4518s = null;
                        ci2.f4519t = null;
                        ci2.f4520u = null;
                    } finally {
                    }
                }
                return;
        }
    }
}
