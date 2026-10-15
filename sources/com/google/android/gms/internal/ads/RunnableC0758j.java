package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1510e1;
import x2.C2066c0;
import x2.C2103v0;
import x2.C2111z0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0758j implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9108o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f9109p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f9110q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f9111r;

    public /* synthetic */ RunnableC0758j(int i4, long j4, Object obj, Object obj2, boolean z4) {
        this.f9108o = i4;
        this.f9111r = obj;
        this.f9110q = obj2;
        this.f9109p = j4;
    }

    public /* synthetic */ RunnableC0758j(Io io, long j4, Go go) {
        this.f9108o = 2;
        this.f9110q = io;
        this.f9109p = j4;
        this.f9111r = go;
    }

    public /* synthetic */ RunnableC0758j(Object obj, Object obj2, long j4, int i4) {
        this.f9108o = i4;
        this.f9110q = obj;
        this.f9111r = obj2;
        this.f9109p = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = false;
        switch (this.f9108o) {
            case 0:
                C0258Da c0258Da = (C0258Da) this.f9110q;
                Object obj = this.f9111r;
                long j4 = this.f9109p;
                int i4 = AbstractC0751is.f9071a;
                C0857lC c0857lC = ((SurfaceHolderCallbackC0730iC) c0258Da.f4619q).f9035o;
                VC vc = c0857lC.f9386E;
                OC j5 = vc.j();
                vc.e(j5, 26, new C0388aC(j5, obj, j4));
                if (c0857lC.f9401U == obj) {
                    C0.s0 s0Var = c0857lC.f9425z;
                    s0Var.f(26, Yv.f7916M);
                    s0Var.e();
                    return;
                }
                return;
            case 1:
                D2 d22 = (D2) this.f9111r;
                d22.f4571o.a((String) this.f9110q, this.f9109p);
                d22.f4571o.b(d22.toString());
                return;
            case 2:
                Io io = (Io) this.f9110q;
                long j6 = this.f9109p;
                Go go = (Go) this.f9111r;
                N1.n nVar = N1.n.f1204A;
                nVar.f1212j.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() - j6;
                if (((Boolean) Q6.f6646a.r()).booleanValue()) {
                    Q1.I.w("Signal runtime (ms) : " + Bs.O(go.getClass().getCanonicalName()) + " = " + elapsedRealtime);
                }
                C0937n6 c0937n6 = AbstractC1066q6.f10137N1;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    C1510e1 a4 = io.f5724e.a();
                    a4.A("action", "lat_ms");
                    a4.A("lat_grp", "sig_lat_grp");
                    a4.A("lat_id", String.valueOf(go.b()));
                    a4.A("clat_ms", String.valueOf(elapsedRealtime));
                    int i5 = 1;
                    if (((Boolean) rVar.c.a(AbstractC1066q6.f10142O1)).booleanValue()) {
                        synchronized (io) {
                            io.f5726g++;
                        }
                        a4.A("seq_num", nVar.f1209g.c.c.n());
                        synchronized (io) {
                            try {
                                if (io.f5726g == io.f5723b.size() && io.f5725f != 0) {
                                    io.f5726g = 0;
                                    nVar.f1212j.getClass();
                                    String valueOf = String.valueOf(SystemClock.elapsedRealtime() - io.f5725f);
                                    if (go.b() <= 39 || go.b() >= 52) {
                                        a4.A("lat_clsg", valueOf);
                                    } else {
                                        a4.A("lat_gmssg", valueOf);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    ((C0658gk) a4.f11915q).f8858b.execute(new RunnableC0615fk(a4, i5));
                    return;
                }
                return;
            case 3:
                C2103v0 c2103v0 = (C2103v0) this.f9110q;
                Bundle bundle = (Bundle) this.f9111r;
                long j7 = this.f9109p;
                if (TextUtils.isEmpty(((C2066c0) c2103v0.f1719a).m().k())) {
                    c2103v0.r(bundle, 0, j7);
                    return;
                }
                x2.K k3 = ((C2066c0) c2103v0.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15399k.a("Using developer consent only; google app id found");
                return;
            default:
                x2.C0 c02 = (x2.C0) this.f9111r;
                c02.k((C2111z0) this.f9110q, false, this.f9109p);
                c02.f15338e = null;
                x2.J0 q4 = ((C2066c0) c02.f1719a).q();
                q4.g();
                q4.e();
                q4.r(new x0.j(q4, null, 7, z4));
                return;
        }
    }
}
