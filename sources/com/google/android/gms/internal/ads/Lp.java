package com.google.android.gms.internal.ads;

import O1.C0081p;
import c3.InterfaceFutureC0239a;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Lp {

    /* renamed from: a, reason: collision with root package name */
    public final C1434yp f6165a;

    /* renamed from: b, reason: collision with root package name */
    public final Ap f6166b;
    public final Xl c;
    public final Oq d;

    /* renamed from: e, reason: collision with root package name */
    public final Eq f6167e;

    /* renamed from: f, reason: collision with root package name */
    public final C0567ef f6168f;

    public Lp(Xl xl, Oq oq, C1434yp c1434yp, Ap ap, C0567ef c0567ef, Eq eq) {
        this.f6165a = c1434yp;
        this.f6166b = ap;
        this.c = xl;
        this.d = oq;
        this.f6168f = c0567ef;
        this.f6167e = eq;
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            b((String) obj, 2);
        }
    }

    public final void b(String str, int i4) {
        if (!this.f6165a.f11515i0) {
            this.d.a(str, this.f6167e);
            return;
        }
        N1.n.f1204A.f1212j.getClass();
        this.c.b(new N2(System.currentTimeMillis(), this.f6166b.f3998b, str, i4));
    }

    public final void c(int i4, ArrayList arrayList) {
        InterfaceFutureC0239a h02;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            String str = (String) obj;
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.G8)).booleanValue()) {
                h02 = this.f6168f.a(str, C0081p.f1374f.f1377e);
            } else {
                h02 = Bs.h0(str);
            }
            B0.r rVar = new B0.r(i4, this);
            h02.a(new Nu(0, h02, rVar), AbstractC0266Ec.f4897a);
        }
    }
}
