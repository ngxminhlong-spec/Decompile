package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c3.InterfaceFutureC0239a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1035pc {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9968a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Q1.K f9969b;
    public final C1163sc c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public Context f9970e;

    /* renamed from: f, reason: collision with root package name */
    public C0248Bc f9971f;

    /* renamed from: g, reason: collision with root package name */
    public String f9972g;

    /* renamed from: h, reason: collision with root package name */
    public C1151s6 f9973h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f9974i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f9975j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f9976k;

    /* renamed from: l, reason: collision with root package name */
    public final C0992oc f9977l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f9978m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceFutureC0239a f9979n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f9980o;

    public C1035pc() {
        Q1.K k3 = new Q1.K();
        this.f9969b = k3;
        this.c = new C1163sc(C0081p.f1374f.c, k3);
        this.d = false;
        this.f9973h = null;
        this.f9974i = null;
        this.f9975j = new AtomicInteger(0);
        this.f9976k = new AtomicInteger(0);
        this.f9977l = new C0992oc();
        this.f9978m = new Object();
        this.f9980o = new AtomicBoolean();
    }

    public final Resources a() {
        if (this.f9971f.f4087r) {
            return this.f9970e.getResources();
        }
        try {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.h9)).booleanValue()) {
                return AbstractC1230u.J(this.f9970e).f14326a.getResources();
            }
            AbstractC1230u.J(this.f9970e).f14326a.getResources();
            return null;
        } catch (C1464zc e4) {
            Y9.t("Cannot load resource from dynamite apk or local jar", e4);
            return null;
        }
    }

    public final C1151s6 b() {
        C1151s6 c1151s6;
        synchronized (this.f9968a) {
            c1151s6 = this.f9973h;
        }
        return c1151s6;
    }

    public final Q1.K c() {
        Q1.K k3;
        synchronized (this.f9968a) {
            k3 = this.f9969b;
        }
        return k3;
    }

    public final InterfaceFutureC0239a d() {
        if (this.f9970e != null) {
            if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10250l2)).booleanValue()) {
                synchronized (this.f9978m) {
                    try {
                        InterfaceFutureC0239a interfaceFutureC0239a = this.f9979n;
                        if (interfaceFutureC0239a != null) {
                            return interfaceFutureC0239a;
                        }
                        InterfaceFutureC0239a b4 = AbstractC0266Ec.f4897a.b(new CallableC0336Sb(1, this));
                        this.f9979n = b4;
                        return b4;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return Bs.h0(new ArrayList());
    }

    public final Boolean e() {
        Boolean bool;
        synchronized (this.f9968a) {
            bool = this.f9974i;
        }
        return bool;
    }

    public final void f(Context context, C0248Bc c0248Bc) {
        C1151s6 c1151s6;
        synchronized (this.f9968a) {
            try {
                if (!this.d) {
                    this.f9970e = context.getApplicationContext();
                    this.f9971f = c0248Bc;
                    N1.n.f1204A.f1208f.i(this.c);
                    this.f9969b.E(this.f9970e);
                    C0275Ga.k(this.f9970e, this.f9971f);
                    if (((Boolean) H6.f5412b.r()).booleanValue()) {
                        c1151s6 = new C1151s6();
                    } else {
                        Q1.I.w("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c1151s6 = null;
                    }
                    this.f9973h = c1151s6;
                    if (c1151s6 != null) {
                        AbstractC1230u.k(new P1.e(2, this).f(), "AppState.registerCsiReporter");
                    }
                    if (AbstractC1799b.f()) {
                        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r7)).booleanValue()) {
                            ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new L3(1, this));
                        }
                    }
                    this.d = true;
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        N1.n.f1204A.c.u(context, c0248Bc.f4084o);
    }

    public final void g(String str, Throwable th) {
        C0275Ga.k(this.f9970e, this.f9971f).h(th, str, ((Double) W6.f7346g.r()).floatValue());
    }

    public final void h(String str, Throwable th) {
        C0275Ga.k(this.f9970e, this.f9971f).g(str, th);
    }

    public final void i(Boolean bool) {
        synchronized (this.f9968a) {
            this.f9974i = bool;
        }
    }

    public final boolean j(Context context) {
        if (AbstractC1799b.f()) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r7)).booleanValue()) {
                return this.f9980o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
