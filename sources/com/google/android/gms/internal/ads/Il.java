package com.google.android.gms.internal.ads;

import O1.C0101z0;
import O1.InterfaceC0051a;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Il implements InterfaceC1211th, InterfaceC0051a, Sg, Mg {

    /* renamed from: o, reason: collision with root package name */
    public final Context f5710o;

    /* renamed from: p, reason: collision with root package name */
    public final Np f5711p;

    /* renamed from: q, reason: collision with root package name */
    public final Ep f5712q;

    /* renamed from: r, reason: collision with root package name */
    public final C1434yp f5713r;

    /* renamed from: s, reason: collision with root package name */
    public final Xl f5714s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f5715t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f5716u = ((Boolean) O1.r.d.c.a(AbstractC1066q6.Z5)).booleanValue();

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1263uq f5717v;

    /* renamed from: w, reason: collision with root package name */
    public final String f5718w;

    public Il(Context context, Np np, Ep ep, C1434yp c1434yp, Xl xl, InterfaceC1263uq interfaceC1263uq, String str) {
        this.f5710o = context;
        this.f5711p = np;
        this.f5712q = ep;
        this.f5713r = c1434yp;
        this.f5714s = xl;
        this.f5717v = interfaceC1263uq;
        this.f5718w = str;
    }

    @Override // O1.InterfaceC0051a
    public final void D() {
        if (this.f5713r.f11515i0) {
            b(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.Mg
    public final void M0(C0528di c0528di) {
        if (this.f5716u) {
            C1220tq a4 = a("ifts");
            a4.a("reason", "exception");
            if (!TextUtils.isEmpty(c0528di.getMessage())) {
                a4.a("msg", c0528di.getMessage());
            }
            this.f5717v.b(a4);
        }
    }

    public final C1220tq a(String str) {
        C1220tq b4 = C1220tq.b(str);
        b4.f(this.f5712q, null);
        HashMap hashMap = b4.f10751a;
        C1434yp c1434yp = this.f5713r;
        hashMap.put("aai", c1434yp.f11540w);
        b4.a("request_id", this.f5718w);
        List list = c1434yp.f11536t;
        if (!list.isEmpty()) {
            b4.a("ancn", (String) list.get(0));
        }
        if (c1434yp.f11515i0) {
            N1.n nVar = N1.n.f1204A;
            b4.a("device_connectivity", true != nVar.f1209g.j(this.f5710o) ? "offline" : "online");
            nVar.f1212j.getClass();
            b4.a("event_timestamp", String.valueOf(System.currentTimeMillis()));
            b4.a("offline_ad", "1");
        }
        return b4;
    }

    public final void b(C1220tq c1220tq) {
        boolean z4 = this.f5713r.f11515i0;
        InterfaceC1263uq interfaceC1263uq = this.f5717v;
        if (!z4) {
            interfaceC1263uq.b(c1220tq);
            return;
        }
        String a4 = interfaceC1263uq.a(c1220tq);
        N1.n.f1204A.f1212j.getClass();
        this.f5714s.b(new N2(System.currentTimeMillis(), ((Ap) this.f5712q.f4943b.f6526q).f3998b, a4, 2));
    }

    @Override // com.google.android.gms.internal.ads.Mg
    public final void c() {
        if (this.f5716u) {
            C1220tq a4 = a("ifts");
            a4.a("reason", "blocked");
            this.f5717v.b(a4);
        }
    }

    public final boolean e() {
        String str;
        if (this.f5715t == null) {
            synchronized (this) {
                if (this.f5715t == null) {
                    String str2 = (String) O1.r.d.c.a(AbstractC1066q6.f10226g1);
                    Q1.N n4 = N1.n.f1204A.c;
                    try {
                        str = Q1.N.C(this.f5710o);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z4 = false;
                    if (str2 != null && str != null) {
                        try {
                            z4 = Pattern.matches(str2, str);
                        } catch (RuntimeException e4) {
                            N1.n.f1204A.f1209g.h("CsiActionsListener.isPatternMatched", e4);
                        }
                    }
                    this.f5715t = Boolean.valueOf(z4);
                }
            }
        }
        return this.f5715t.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1211th
    public final void g() {
        if (e()) {
            this.f5717v.b(a("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1211th
    public final void j() {
        if (e()) {
            this.f5717v.b(a("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.Sg
    public final void p() {
        if (e() || this.f5713r.f11515i0) {
            b(a("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.Mg
    public final void r(C0101z0 c0101z0) {
        C0101z0 c0101z02;
        if (this.f5716u) {
            int i4 = c0101z0.f1405o;
            String str = c0101z0.f1406p;
            if (c0101z0.f1407q.equals("com.google.android.gms.ads") && (c0101z02 = c0101z0.f1408r) != null && !c0101z02.f1407q.equals("com.google.android.gms.ads")) {
                C0101z0 c0101z03 = c0101z0.f1408r;
                i4 = c0101z03.f1405o;
                str = c0101z03.f1406p;
            }
            String a4 = this.f5711p.a(str);
            C1220tq a5 = a("ifts");
            a5.a("reason", "adapter");
            if (i4 >= 0) {
                a5.a("arec", String.valueOf(i4));
            }
            if (a4 != null) {
                a5.a("areec", a4);
            }
            this.f5717v.b(a5);
        }
    }
}
