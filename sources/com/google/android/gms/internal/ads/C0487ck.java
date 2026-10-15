package com.google.android.gms.internal.ads;

import O1.C0101z0;
import O1.InterfaceC0051a;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487ck implements InterfaceC1211th, InterfaceC0051a, Sg, Mg {

    /* renamed from: o, reason: collision with root package name */
    public final Context f8385o;

    /* renamed from: p, reason: collision with root package name */
    public final Np f8386p;

    /* renamed from: q, reason: collision with root package name */
    public final C0658gk f8387q;

    /* renamed from: r, reason: collision with root package name */
    public final Ep f8388r;

    /* renamed from: s, reason: collision with root package name */
    public final C1434yp f8389s;

    /* renamed from: t, reason: collision with root package name */
    public final Xl f8390t;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f8391u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f8392v = ((Boolean) O1.r.d.c.a(AbstractC1066q6.Z5)).booleanValue();

    public C0487ck(Context context, Np np, C0658gk c0658gk, Ep ep, C1434yp c1434yp, Xl xl) {
        this.f8385o = context;
        this.f8386p = np;
        this.f8387q = c0658gk;
        this.f8388r = ep;
        this.f8389s = c1434yp;
        this.f8390t = xl;
    }

    @Override // O1.InterfaceC0051a
    public final void D() {
        if (this.f8389s.f11515i0) {
            b(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.Mg
    public final void M0(C0528di c0528di) {
        if (this.f8392v) {
            C1510e1 a4 = a("ifts");
            a4.A("reason", "exception");
            if (!TextUtils.isEmpty(c0528di.getMessage())) {
                a4.A("msg", c0528di.getMessage());
            }
            a4.E();
        }
    }

    public final C1510e1 a(String str) {
        C1510e1 a4 = this.f8387q.a();
        Ep ep = this.f8388r;
        C1384xi c1384xi = ep.f4942a;
        Ap ap = (Ap) ep.f4943b.f6526q;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) a4.f11914p;
        concurrentHashMap.put("gqi", ap.f3998b);
        C1434yp c1434yp = this.f8389s;
        a4.C(c1434yp);
        a4.A("action", str);
        List list = c1434yp.f11536t;
        if (!list.isEmpty()) {
            a4.A("ancn", (String) list.get(0));
        }
        if (c1434yp.f11515i0) {
            N1.n nVar = N1.n.f1204A;
            a4.A("device_connectivity", true != nVar.f1209g.j(this.f8385o) ? "offline" : "online");
            nVar.f1212j.getClass();
            a4.A("event_timestamp", String.valueOf(System.currentTimeMillis()));
            a4.A("offline_ad", "1");
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.i6)).booleanValue()) {
            boolean z4 = AbstractC1895f.K((Jp) c1384xi.f11290p) != 1;
            a4.A("scar", String.valueOf(z4));
            if (z4) {
                O1.U0 u02 = ((Jp) c1384xi.f11290p).d;
                String str2 = u02.f1296D;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap.put("ragent", str2);
                }
                String D4 = AbstractC1895f.D(AbstractC1895f.G(u02));
                if (!TextUtils.isEmpty(D4)) {
                    concurrentHashMap.put("rtype", D4);
                }
            }
        }
        return a4;
    }

    public final void b(C1510e1 c1510e1) {
        if (!this.f8389s.f11515i0) {
            c1510e1.E();
            return;
        }
        C0828kk c0828kk = ((C0658gk) c1510e1.f11915q).f8857a;
        String c = c0828kk.f9311f.c((ConcurrentHashMap) c1510e1.f11914p);
        N1.n.f1204A.f1212j.getClass();
        this.f8390t.b(new N2(System.currentTimeMillis(), ((Ap) this.f8388r.f4943b.f6526q).f3998b, c, 2));
    }

    @Override // com.google.android.gms.internal.ads.Mg
    public final void c() {
        if (this.f8392v) {
            C1510e1 a4 = a("ifts");
            a4.A("reason", "blocked");
            a4.E();
        }
    }

    public final boolean e() {
        String str;
        if (this.f8391u == null) {
            synchronized (this) {
                if (this.f8391u == null) {
                    String str2 = (String) O1.r.d.c.a(AbstractC1066q6.f10226g1);
                    Q1.N n4 = N1.n.f1204A.c;
                    try {
                        str = Q1.N.C(this.f8385o);
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
                    this.f8391u = Boolean.valueOf(z4);
                }
            }
        }
        return this.f8391u.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1211th
    public final void g() {
        if (e()) {
            a("adapter_shown").E();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1211th
    public final void j() {
        if (e()) {
            a("adapter_impression").E();
        }
    }

    @Override // com.google.android.gms.internal.ads.Sg
    public final void p() {
        if (e() || this.f8389s.f11515i0) {
            b(a("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.Mg
    public final void r(C0101z0 c0101z0) {
        C0101z0 c0101z02;
        if (this.f8392v) {
            C1510e1 a4 = a("ifts");
            a4.A("reason", "adapter");
            int i4 = c0101z0.f1405o;
            String str = c0101z0.f1406p;
            if (c0101z0.f1407q.equals("com.google.android.gms.ads") && (c0101z02 = c0101z0.f1408r) != null && !c0101z02.f1407q.equals("com.google.android.gms.ads")) {
                C0101z0 c0101z03 = c0101z0.f1408r;
                i4 = c0101z03.f1405o;
                str = c0101z03.f1406p;
            }
            if (i4 >= 0) {
                a4.A("arec", String.valueOf(i4));
            }
            String a5 = this.f8386p.a(str);
            if (a5 != null) {
                a4.A("areec", a5);
            }
            a4.E();
        }
    }
}
