package com.google.android.gms.internal.ads;

import O1.InterfaceC0089t0;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import c3.InterfaceFutureC0239a;
import java.util.Collections;
import java.util.List;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ci {

    /* renamed from: a, reason: collision with root package name */
    public int f4502a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0089t0 f4503b;
    public InterfaceC0895m7 c;
    public View d;

    /* renamed from: e, reason: collision with root package name */
    public List f4504e;

    /* renamed from: g, reason: collision with root package name */
    public O1.F0 f4506g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f4507h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0308Md f4508i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0308Md f4509j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0308Md f4510k;

    /* renamed from: l, reason: collision with root package name */
    public Pq f4511l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceFutureC0239a f4512m;

    /* renamed from: n, reason: collision with root package name */
    public C0272Fc f4513n;

    /* renamed from: o, reason: collision with root package name */
    public View f4514o;

    /* renamed from: p, reason: collision with root package name */
    public View f4515p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1812a f4516q;

    /* renamed from: r, reason: collision with root package name */
    public double f4517r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1109r7 f4518s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1109r7 f4519t;

    /* renamed from: u, reason: collision with root package name */
    public String f4520u;

    /* renamed from: x, reason: collision with root package name */
    public float f4523x;
    public String y;

    /* renamed from: v, reason: collision with root package name */
    public final r.i f4521v = new r.i(0);

    /* renamed from: w, reason: collision with root package name */
    public final r.i f4522w = new r.i(0);

    /* renamed from: f, reason: collision with root package name */
    public List f4505f = Collections.EMPTY_LIST;

    public static Ci A(Bi bi, InterfaceC0895m7 interfaceC0895m7, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, InterfaceC1812a interfaceC1812a, String str4, String str5, double d, InterfaceC1109r7 interfaceC1109r7, String str6, float f4) {
        Ci ci = new Ci();
        ci.f4502a = 6;
        ci.f4503b = bi;
        ci.c = interfaceC0895m7;
        ci.d = view;
        ci.u("headline", str);
        ci.f4504e = list;
        ci.u("body", str2);
        ci.f4507h = bundle;
        ci.u("call_to_action", str3);
        ci.f4514o = view2;
        ci.f4516q = interfaceC1812a;
        ci.u("store", str4);
        ci.u("price", str5);
        ci.f4517r = d;
        ci.f4518s = interfaceC1109r7;
        ci.u("advertiser", str6);
        synchronized (ci) {
            ci.f4523x = f4;
        }
        return ci;
    }

    public static Object B(InterfaceC1812a interfaceC1812a) {
        if (interfaceC1812a == null) {
            return null;
        }
        return BinderC1813b.C2(interfaceC1812a);
    }

    public static Ci R(B9 b9) {
        Bi bi;
        B9 b92;
        try {
            InterfaceC0089t0 j4 = b9.j();
            if (j4 == null) {
                b92 = b9;
                bi = null;
            } else {
                b92 = b9;
                bi = new Bi(j4, b92);
            }
            return A(bi, b92.k(), (View) B(b92.q()), b92.D(), b92.t(), b92.p(), b92.g(), b92.C(), (View) B(b92.m()), b92.n(), b92.s(), b92.x(), b92.a(), b92.l(), b92.o(), b92.d());
        } catch (RemoteException e4) {
            Y9.t("Failed to get native ad assets from unified ad mapper", e4);
            return null;
        }
    }

    public final synchronized float C() {
        return this.f4523x;
    }

    public final synchronized int D() {
        return this.f4502a;
    }

    public final synchronized Bundle E() {
        try {
            if (this.f4507h == null) {
                this.f4507h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4507h;
    }

    public final synchronized View F() {
        return this.d;
    }

    public final synchronized View G() {
        return this.f4514o;
    }

    public final synchronized r.i H() {
        return this.f4521v;
    }

    public final synchronized r.i I() {
        return this.f4522w;
    }

    public final synchronized InterfaceC0089t0 J() {
        return this.f4503b;
    }

    public final synchronized O1.F0 K() {
        return this.f4506g;
    }

    public final synchronized InterfaceC0895m7 L() {
        return this.c;
    }

    public final synchronized InterfaceC1109r7 M() {
        return this.f4518s;
    }

    public final synchronized C0272Fc N() {
        return this.f4513n;
    }

    public final synchronized InterfaceC0308Md O() {
        return this.f4509j;
    }

    public final synchronized InterfaceC0308Md P() {
        return this.f4510k;
    }

    public final synchronized InterfaceC0308Md Q() {
        return this.f4508i;
    }

    public final synchronized Pq S() {
        return this.f4511l;
    }

    public final synchronized InterfaceC1812a T() {
        return this.f4516q;
    }

    public final synchronized InterfaceFutureC0239a U() {
        return this.f4512m;
    }

    public final synchronized String V() {
        return e("advertiser");
    }

    public final synchronized String W() {
        return e("body");
    }

    public final synchronized String X() {
        return e("call_to_action");
    }

    public final synchronized String a() {
        return this.f4520u;
    }

    public final synchronized String b() {
        return e("headline");
    }

    public final synchronized String c() {
        return e("price");
    }

    public final synchronized String d() {
        return e("store");
    }

    public final synchronized String e(String str) {
        return (String) this.f4522w.get(str);
    }

    public final synchronized List f() {
        return this.f4504e;
    }

    public final synchronized List g() {
        return this.f4505f;
    }

    public final synchronized void h(InterfaceC0895m7 interfaceC0895m7) {
        this.c = interfaceC0895m7;
    }

    public final synchronized void i(String str) {
        this.f4520u = str;
    }

    public final synchronized void j(O1.F0 f02) {
        this.f4506g = f02;
    }

    public final synchronized void k(InterfaceC1109r7 interfaceC1109r7) {
        this.f4518s = interfaceC1109r7;
    }

    public final synchronized void l(String str, BinderC0682h7 binderC0682h7) {
        if (binderC0682h7 == null) {
            this.f4521v.remove(str);
        } else {
            this.f4521v.put(str, binderC0682h7);
        }
    }

    public final synchronized void m(InterfaceC0308Md interfaceC0308Md) {
        this.f4509j = interfaceC0308Md;
    }

    public final synchronized void n(InterfaceC1109r7 interfaceC1109r7) {
        this.f4519t = interfaceC1109r7;
    }

    public final synchronized void o(AbstractC1137rt abstractC1137rt) {
        this.f4505f = abstractC1137rt;
    }

    public final synchronized void p(InterfaceC0308Md interfaceC0308Md) {
        this.f4510k = interfaceC0308Md;
    }

    public final synchronized void q(InterfaceFutureC0239a interfaceFutureC0239a) {
        this.f4512m = interfaceFutureC0239a;
    }

    public final synchronized void r(String str) {
        this.y = str;
    }

    public final synchronized void s(C0272Fc c0272Fc) {
        this.f4513n = c0272Fc;
    }

    public final synchronized void t(double d) {
        this.f4517r = d;
    }

    public final synchronized void u(String str, String str2) {
        if (str2 == null) {
            this.f4522w.remove(str);
        } else {
            this.f4522w.put(str, str2);
        }
    }

    public final synchronized double v() {
        return this.f4517r;
    }

    public final synchronized void w(BinderC0368Yd binderC0368Yd) {
        this.f4503b = binderC0368Yd;
    }

    public final synchronized void x(View view) {
        this.f4514o = view;
    }

    public final synchronized void y(InterfaceC0308Md interfaceC0308Md) {
        this.f4508i = interfaceC0308Md;
    }

    public final synchronized void z(View view) {
        this.f4515p = view;
    }
}
