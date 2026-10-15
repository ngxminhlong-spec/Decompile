package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import b0.RunnableC0203p;
import c3.InterfaceFutureC0239a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1427yi extends Yf {

    /* renamed from: G, reason: collision with root package name */
    public static final Gt f11427G;

    /* renamed from: A, reason: collision with root package name */
    public final C0248Bc f11428A;

    /* renamed from: B, reason: collision with root package name */
    public final Context f11429B;

    /* renamed from: C, reason: collision with root package name */
    public final Ai f11430C;

    /* renamed from: D, reason: collision with root package name */
    public final Cn f11431D;

    /* renamed from: E, reason: collision with root package name */
    public final HashMap f11432E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f11433F;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f11434j;

    /* renamed from: k, reason: collision with root package name */
    public final Ci f11435k;

    /* renamed from: l, reason: collision with root package name */
    public final Fi f11436l;

    /* renamed from: m, reason: collision with root package name */
    public final Ki f11437m;

    /* renamed from: n, reason: collision with root package name */
    public final Ei f11438n;

    /* renamed from: o, reason: collision with root package name */
    public final Gi f11439o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1328wB f11440p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1328wB f11441q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC1328wB f11442r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1328wB f11443s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC1328wB f11444t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractBinderC1149s4 f11445u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11446v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11447w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11448x;
    public final C0331Rb y;

    /* renamed from: z, reason: collision with root package name */
    public final I3 f11449z;

    static {
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        Bs.D(6, objArr);
        f11427G = AbstractC1137rt.q(6, objArr);
    }

    public C1427yi(C1151s6 c1151s6, Executor executor, Ci ci, Fi fi, Ki ki, Ei ei, Gi gi, InterfaceC1328wB interfaceC1328wB, InterfaceC1328wB interfaceC1328wB2, InterfaceC1328wB interfaceC1328wB3, InterfaceC1328wB interfaceC1328wB4, InterfaceC1328wB interfaceC1328wB5, C0331Rb c0331Rb, I3 i32, C0248Bc c0248Bc, Context context, Ai ai, Cn cn) {
        super(c1151s6);
        this.f11434j = executor;
        this.f11435k = ci;
        this.f11436l = fi;
        this.f11437m = ki;
        this.f11438n = ei;
        this.f11439o = gi;
        this.f11440p = interfaceC1328wB;
        this.f11441q = interfaceC1328wB2;
        this.f11442r = interfaceC1328wB3;
        this.f11443s = interfaceC1328wB4;
        this.f11444t = interfaceC1328wB5;
        this.y = c0331Rb;
        this.f11449z = i32;
        this.f11428A = c0248Bc;
        this.f11429B = context;
        this.f11430C = ai;
        this.f11431D = cn;
        this.f11432E = new HashMap();
        this.f11433F = new ArrayList();
    }

    public static boolean n(View view) {
        C0937n6 c0937n6 = AbstractC1066q6.X8;
        O1.r rVar = O1.r.d;
        if (!((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        Q1.N n4 = N1.n.f1204A.c;
        long G3 = Q1.N.G(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            return G3 >= ((long) ((Integer) rVar.c.a(AbstractC1066q6.Y8)).intValue());
        }
        return false;
    }

    public final synchronized JSONObject A(View view, Map map, Map map2) {
        return this.f11436l.q(view, map, map2, r());
    }

    public final synchronized void B() {
        this.f11436l.f();
    }

    @Override // com.google.android.gms.internal.ads.Yf
    public final void a() {
        RunnableC1298vi runnableC1298vi = new RunnableC1298vi(this, 0);
        Executor executor = this.f11434j;
        executor.execute(runnableC1298vi);
        if (this.f11435k.D() != 7) {
            Fi fi = this.f11436l;
            fi.getClass();
            executor.execute(new D3(25, fi));
        }
        super.a();
    }

    public final synchronized void b(View view, Map map, Map map2, boolean z4) {
        try {
            if (!this.f11447w) {
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10305x1)).booleanValue() && this.f7859b.f11519k0) {
                    Iterator it = this.f11432E.keySet().iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) this.f11432E.get((String) it.next())).booleanValue()) {
                            break;
                        }
                    }
                }
                if (z4) {
                    View q4 = q(map);
                    if (q4 == null) {
                        u(view, map, map2);
                        return;
                    }
                    C0937n6 c0937n6 = AbstractC1066q6.f10275q3;
                    O1.r rVar = O1.r.d;
                    if (!((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                        if (!((Boolean) rVar.c.a(AbstractC1066q6.f10279r3)).booleanValue()) {
                            u(view, map, map2);
                            return;
                        }
                        Rect rect = new Rect();
                        if (q4.getGlobalVisibleRect(rect, null) && q4.getHeight() == rect.height() && q4.getWidth() == rect.width()) {
                            u(view, map, map2);
                        }
                    } else if (n(q4)) {
                        u(view, map, map2);
                    }
                } else {
                    if (((Boolean) O1.r.d.c.a(AbstractC1066q6.p3)).booleanValue() && map != null) {
                        Iterator it2 = map.entrySet().iterator();
                        while (it2.hasNext()) {
                            View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                            if (view2 != null && n(view2)) {
                                u(view, map, map2);
                                return;
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map, r.i] */
    public final synchronized void c(View view, View view2, Map map, Map map2, boolean z4) {
        Ki ki = this.f11437m;
        ?? r1 = this.f11445u;
        Pi pi = ki.f6040e;
        if (r1 != 0 && pi != null && r1.f() != null && ki.c.f()) {
            try {
                r1.f().addView(pi.a());
            } catch (C0333Rd e4) {
                Q1.I.x("web view can not be obtained", e4);
            }
        }
        this.f11436l.r(view, view2, map, map2, z4, r());
        if (this.f11448x) {
            Ci ci = this.f11435k;
            if (ci.Q() != null) {
                ci.Q().b("onSdkAdUserInteractionClick", new r.i(0));
            }
        }
    }

    public final synchronized void d(View view, int i4) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.J9)).booleanValue()) {
            AbstractBinderC1149s4 abstractBinderC1149s4 = this.f11445u;
            if (abstractBinderC1149s4 == null) {
                Y9.m("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                this.f11434j.execute(new G2.f(this, view, abstractBinderC1149s4 instanceof Ii, i4));
            }
        }
    }

    public final synchronized void e(String str) {
        this.f11436l.N(str);
    }

    public final synchronized void f(Bundle bundle) {
        this.f11436l.s(bundle);
    }

    public final void g(View view) {
        C0272Fc c0272Fc;
        Ci ci = this.f11435k;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.w4)).booleanValue()) {
            synchronized (ci) {
                c0272Fc = ci.f4513n;
            }
            if (c0272Fc == null) {
                return;
            }
            C0258Da c0258Da = new C0258Da(this, view, 20, false);
            c0272Fc.a(new Nu(0, c0272Fc, c0258Da), this.f11434j);
            return;
        }
        Pq S4 = ci.S();
        InterfaceC0308Md P4 = this.f11435k.P();
        if (!this.f11438n.c() || S4 == null || P4 == null || view == null) {
            return;
        }
        N1.n.f1204A.f1224v.getClass();
        C0347Uc.s(new RunnableC0532dm(S4, view, 1));
    }

    public final synchronized void h(View view, MotionEvent motionEvent, View view2) {
        this.f11436l.c(view2, motionEvent);
    }

    public final synchronized void i(Bundle bundle) {
        this.f11436l.a(bundle);
    }

    public final synchronized void j(View view) {
        this.f11436l.k(view);
    }

    public final synchronized void k(Ui ui) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10296v1)).booleanValue()) {
            Q1.N.f1668k.post(new RunnableC1255ui(this, ui, 0));
        } else {
            v(ui);
        }
    }

    public final synchronized void l(Ui ui) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10296v1)).booleanValue()) {
            Q1.N.f1668k.post(new RunnableC1255ui(this, ui, 1));
        } else {
            w(ui);
        }
    }

    public final synchronized boolean m() {
        return this.f11436l.G();
    }

    public final synchronized boolean o(Bundle bundle) {
        if (this.f11447w) {
            return true;
        }
        boolean j4 = this.f11436l.j(bundle);
        this.f11447w = j4;
        return j4;
    }

    public final synchronized View q(Map map) {
        if (map != null) {
            Gt gt = f11427G;
            int i4 = gt.f5346r;
            int i5 = 0;
            while (i5 < i4) {
                WeakReference weakReference = (WeakReference) map.get((String) gt.get(i5));
                i5++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    public final synchronized ImageView.ScaleType r() {
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.V6)).booleanValue()) {
            return null;
        }
        ?? r02 = this.f11445u;
        if (r02 == 0) {
            Y9.m("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        InterfaceC1812a j4 = r02.j();
        if (j4 != null) {
            return (ImageView.ScaleType) BinderC1813b.C2(j4);
        }
        return Ki.f6037k;
    }

    public final synchronized int s() {
        return this.f11436l.b();
    }

    public final void t() {
        InterfaceFutureC0239a interfaceFutureC0239a;
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.w4)).booleanValue()) {
            y("Google", true);
            return;
        }
        Ci ci = this.f11435k;
        synchronized (ci) {
            interfaceFutureC0239a = ci.f4512m;
        }
        if (interfaceFutureC0239a == null) {
            return;
        }
        C1384xi c1384xi = new C1384xi(0, this);
        interfaceFutureC0239a.a(new Nu(0, interfaceFutureC0239a, c1384xi), this.f11434j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    public final synchronized void u(View view, Map map, Map map2) {
        this.f11437m.a(this.f11445u);
        this.f11436l.i(view, map, map2, r());
        this.f11447w = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    public final synchronized void v(Ui ui) {
        Iterator<String> keys;
        View view;
        try {
            if (!this.f11446v) {
                this.f11445u = (AbstractBinderC1149s4) ui;
                Ki ki = this.f11437m;
                ki.f6042g.execute(new RunnableC0203p(ki, ui));
                this.f11436l.l(ui.d(), ui.q(), ui.m(), ui, ui);
                C0937n6 c0937n6 = AbstractC1066q6.f10227g2;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    this.f11449z.f5531b.b(ui.d());
                }
                if (((Boolean) rVar.c.a(AbstractC1066q6.f10305x1)).booleanValue()) {
                    C1434yp c1434yp = this.f7859b;
                    if (c1434yp.f11519k0 && (keys = c1434yp.f11517j0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = (WeakReference) this.f11445u.l().get(next);
                            this.f11432E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                A4 a4 = new A4(this.f11429B, view);
                                this.f11433F.add(a4);
                                a4.f3924z.add(new C1341wi(this, next));
                                a4.c(3);
                            }
                        }
                    }
                }
                if (ui.g() != null) {
                    A4 g4 = ui.g();
                    g4.f3924z.add(this.y);
                    g4.c(3);
                }
            }
        } finally {
        }
    }

    public final void w(Ui ui) {
        View d = ui.d();
        ui.l();
        this.f11436l.m(d);
        if (ui.f() != null) {
            ui.f().setClickable(false);
            ui.f().removeAllViews();
        }
        if (ui.g() != null) {
            A4 g4 = ui.g();
            g4.f3924z.remove(this.y);
        }
        this.f11445u = null;
    }

    public final synchronized void x() {
        this.f11446v = true;
        this.f11434j.execute(new RunnableC1298vi(this, 1));
        Ug ug = this.c;
        ug.getClass();
        ug.n1(new C0894m6(null, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, r.i] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.ads.em, java.lang.Object] */
    public final Pq y(String str, boolean z4) {
        String str2;
        InterfaceC0308Md interfaceC0308Md;
        Pq pq;
        Object obj;
        if (!this.f11438n.c() || TextUtils.isEmpty(str)) {
            return null;
        }
        Ci ci = this.f11435k;
        InterfaceC0308Md P4 = ci.P();
        InterfaceC0308Md Q3 = ci.Q();
        if (P4 == null && Q3 == null) {
            Y9.s("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z5 = P4 != null;
        boolean z6 = Q3 != null;
        C0937n6 c0937n6 = AbstractC1066q6.u4;
        O1.r rVar = O1.r.d;
        int i4 = 2;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            this.f11438n.a();
            int q4 = this.f11438n.a().q();
            int i5 = q4 - 1;
            if (i5 != 0) {
                if (i5 != 1) {
                    Y9.s("Unknown omid media type: " + (q4 != 1 ? q4 != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return null;
                }
                if (P4 == null) {
                    Y9.s("Omid media type was display but there was no display webview.");
                    return null;
                }
                z6 = false;
                z5 = true;
            } else {
                if (Q3 == null) {
                    Y9.s("Omid media type was video but there was no video webview.");
                    return null;
                }
                z5 = false;
                z6 = true;
            }
        }
        if (z5) {
            str2 = null;
            interfaceC0308Md = P4;
        } else {
            str2 = "javascript";
            interfaceC0308Md = Q3;
        }
        interfaceC0308Md.m0();
        Context context = this.f11429B;
        N1.n nVar = N1.n.f1204A;
        nVar.f1224v.getClass();
        if (!C0347Uc.n(context)) {
            Y9.s("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        C0248Bc c0248Bc = this.f11428A;
        String str3 = c0248Bc.f4085p + "." + c0248Bc.f4086q;
        if (!z6) {
            r12 = 2;
            i4 = this.f11435k.D() == 3 ? 4 : 3;
        }
        C0347Uc c0347Uc = nVar.f1224v;
        WebView m02 = interfaceC0308Md.m0();
        String str4 = this.f7859b.f11521l0;
        c0347Uc.getClass();
        if (((Boolean) rVar.c.a(AbstractC1066q6.r4)).booleanValue() && Wj.f7528E.f7724p) {
            ?? obj2 = new Object();
            obj2.f8636a = str;
            obj2.d = str3;
            obj2.f8638e = str2;
            obj2.f8637b = r12;
            obj2.f8640g = m02;
            obj2.f8639f = str4;
            obj2.c = i4;
            try {
                obj = obj2.d();
            } catch (RuntimeException e4) {
                N1.n.f1204A.f1209g.g("omid exception", e4);
                obj = null;
            }
            pq = (Pq) obj;
        } else {
            pq = null;
        }
        if (pq == null) {
            Y9.s("Failed to create omid session in InternalNativeAd");
            return null;
        }
        Ci ci2 = this.f11435k;
        synchronized (ci2) {
            ci2.f4511l = pq;
        }
        interfaceC0308Md.T(pq);
        if (z6) {
            View L4 = Q3.L();
            nVar.f1224v.getClass();
            C0347Uc.s(new RunnableC0532dm(pq, L4, 1));
            this.f11448x = true;
        }
        if (z4) {
            nVar.f1224v.getClass();
            C0347Uc.m(pq);
            interfaceC0308Md.b("onSdkLoaded", new r.i(0));
        }
        return pq;
    }

    public final synchronized JSONObject z(View view, Map map, Map map2) {
        return this.f11436l.e(view, map, map2, r());
    }
}
