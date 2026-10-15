package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import b0.RunnableC0203p;
import c3.InterfaceFutureC0239a;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.C1798a;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1209tf implements InterfaceC1450z4, Tg, P1.g, Sg {

    /* renamed from: o, reason: collision with root package name */
    public final C1038pf f10701o;

    /* renamed from: p, reason: collision with root package name */
    public final C1081qf f10702p;

    /* renamed from: r, reason: collision with root package name */
    public final C0811k9 f10704r;

    /* renamed from: s, reason: collision with root package name */
    public final Executor f10705s;

    /* renamed from: t, reason: collision with root package name */
    public final C1798a f10706t;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f10703q = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f10707u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final C1166sf f10708v = new C1166sf();

    /* renamed from: w, reason: collision with root package name */
    public boolean f10709w = false;

    /* renamed from: x, reason: collision with root package name */
    public WeakReference f10710x = new WeakReference(this);

    public C1209tf(C0768j9 c0768j9, C1081qf c1081qf, Executor executor, C1038pf c1038pf, C1798a c1798a) {
        this.f10701o = c1038pf;
        Charset charset = AbstractC0598f9.f8689a;
        c0768j9.a();
        this.f10704r = new C0811k9(c0768j9.f9137b, 0);
        this.f10702p = c1081qf;
        this.f10705s = executor;
        this.f10706t = c1798a;
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final synchronized void F(Context context) {
        this.f10708v.d = "u";
        a();
        c();
        this.f10709w = true;
    }

    @Override // P1.g
    public final void L2(int i4) {
    }

    @Override // P1.g
    public final synchronized void O() {
        this.f10708v.f10614b = false;
        a();
    }

    @Override // P1.g
    public final void W2() {
    }

    public final synchronized void a() {
        try {
            if (this.f10710x.get() == null) {
                b();
                return;
            }
            if (this.f10709w || !this.f10707u.get()) {
                return;
            }
            try {
                C1166sf c1166sf = this.f10708v;
                this.f10706t.getClass();
                c1166sf.c = SystemClock.elapsedRealtime();
                JSONObject r4 = this.f10702p.r(this.f10708v);
                Iterator it = this.f10703q.iterator();
                while (it.hasNext()) {
                    this.f10705s.execute(new RunnableC0203p(18, (InterfaceC0308Md) it.next(), r4));
                }
                C0811k9 c0811k9 = this.f10704r;
                c0811k9.getClass();
                C0512d8 c0512d8 = new C0512d8(c0811k9, r4);
                InterfaceFutureC0239a interfaceFutureC0239a = c0811k9.f9278b;
                C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
                C1267uu n02 = Bs.n0(interfaceFutureC0239a, c0512d8, c0260Dc);
                n02.a(new Nu(0, n02, new C1016p(26)), c0260Dc);
            } catch (Exception e4) {
                Q1.I.x("Failed to call ActiveViewJS", e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // P1.g
    public final void a0() {
    }

    public final synchronized void b() {
        c();
        this.f10709w = true;
    }

    public final void c() {
        Iterator it = this.f10703q.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            C1038pf c1038pf = this.f10701o;
            if (!hasNext) {
                C0768j9 c0768j9 = c1038pf.f9994b;
                C0995of c0995of = c1038pf.f9995e;
                InterfaceFutureC0239a interfaceFutureC0239a = c0768j9.f9137b;
                W1.i iVar = new W1.i(1, str2, c0995of);
                C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
                C1310vu m02 = Bs.m0(interfaceFutureC0239a, iVar, c0260Dc);
                c0768j9.f9137b = m02;
                c0768j9.f9137b = Bs.m0(m02, new W1.i(1, str, c1038pf.f9996f), c0260Dc);
                return;
            }
            InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) it.next();
            interfaceC0308Md.D0("/updateActiveView", c1038pf.f9995e);
            interfaceC0308Md.D0("/untrackActiveViewUnit", c1038pf.f9996f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1450z4
    public final synchronized void j0(C1407y4 c1407y4) {
        C1166sf c1166sf = this.f10708v;
        c1166sf.f10613a = c1407y4.f11338j;
        c1166sf.f10615e = c1407y4;
        a();
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final synchronized void l(Context context) {
        this.f10708v.f10614b = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final synchronized void o(Context context) {
        this.f10708v.f10614b = true;
        a();
    }

    @Override // com.google.android.gms.internal.ads.Sg
    public final synchronized void p() {
        if (this.f10707u.compareAndSet(false, true)) {
            C1038pf c1038pf = this.f10701o;
            C0768j9 c0768j9 = c1038pf.f9994b;
            C0995of c0995of = c1038pf.f9995e;
            c0768j9.a();
            InterfaceFutureC0239a interfaceFutureC0239a = c0768j9.f9137b;
            N1.c cVar = new N1.c(2, "/updateActiveView", c0995of);
            C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
            c0768j9.f9137b = Bs.n0(interfaceFutureC0239a, cVar, c0260Dc);
            C0995of c0995of2 = c1038pf.f9996f;
            c0768j9.a();
            c0768j9.f9137b = Bs.n0(c0768j9.f9137b, new N1.c(2, "/untrackActiveViewUnit", c0995of2), c0260Dc);
            c1038pf.d = this;
            a();
        }
    }

    @Override // P1.g
    public final synchronized void q1() {
        this.f10708v.f10614b = true;
        a();
    }

    @Override // P1.g
    public final void y3() {
    }
}
