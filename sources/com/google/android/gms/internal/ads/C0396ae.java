package com.google.android.gms.internal.ads;

import O1.InterfaceC0051a;
import Q1.C0120t;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ae, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396ae extends WebViewClient implements InterfaceC0051a, Sh {

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ int f8122T = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f8123A;

    /* renamed from: B, reason: collision with root package name */
    public int f8124B;

    /* renamed from: C, reason: collision with root package name */
    public String f8125C;

    /* renamed from: D, reason: collision with root package name */
    public String f8126D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8127E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8128F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8129G;

    /* renamed from: H, reason: collision with root package name */
    public P1.l f8130H;

    /* renamed from: I, reason: collision with root package name */
    public C0775ja f8131I;

    /* renamed from: J, reason: collision with root package name */
    public N1.a f8132J;

    /* renamed from: K, reason: collision with root package name */
    public C0648ga f8133K;

    /* renamed from: L, reason: collision with root package name */
    public InterfaceC0301Lb f8134L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f8135M;
    public boolean N;

    /* renamed from: O, reason: collision with root package name */
    public int f8136O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f8137P;

    /* renamed from: Q, reason: collision with root package name */
    public final HashSet f8138Q;

    /* renamed from: R, reason: collision with root package name */
    public final BinderC0489cm f8139R;

    /* renamed from: S, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC0313Nd f8140S;

    /* renamed from: o, reason: collision with root package name */
    public final C0348Ud f8141o;

    /* renamed from: p, reason: collision with root package name */
    public final C0764j5 f8142p;

    /* renamed from: q, reason: collision with root package name */
    public final HashMap f8143q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f8144r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0051a f8145s;

    /* renamed from: t, reason: collision with root package name */
    public P1.g f8146t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0481ce f8147u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0524de f8148v;

    /* renamed from: w, reason: collision with root package name */
    public Y7 f8149w;

    /* renamed from: x, reason: collision with root package name */
    public Z7 f8150x;
    public Sh y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8151z;

    public C0396ae(C0348Ud c0348Ud, C0764j5 c0764j5, boolean z4, BinderC0489cm binderC0489cm) {
        C0775ja c0775ja = new C0775ja(c0348Ud, c0348Ud.g0(), new C0894m6(c0348Ud.getContext()));
        this.f8143q = new HashMap();
        this.f8144r = new Object();
        this.f8124B = 0;
        this.f8125C = "";
        this.f8126D = "";
        this.f8142p = c0764j5;
        this.f8141o = c0348Ud;
        this.f8127E = z4;
        this.f8131I = c0775ja;
        this.f8133K = null;
        this.f8138Q = new HashSet(Arrays.asList(((String) O1.r.d.c.a(AbstractC1066q6.Q4)).split(",")));
        this.f8139R = binderC0489cm;
    }

    public static final boolean B(boolean z4, C0348Ud c0348Ud) {
        return (!z4 || c0348Ud.f7165o.P().b() || c0348Ud.f7165o.e0().equals("interstitial_mb")) ? false : true;
    }

    public static WebResourceResponse o() {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10313z0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Override // O1.InterfaceC0051a
    public final void D() {
        InterfaceC0051a interfaceC0051a = this.f8145s;
        if (interfaceC0051a != null) {
            interfaceC0051a.D();
        }
    }

    public final void F() {
        synchronized (this.f8144r) {
        }
    }

    public final void F0(String str, InterfaceC0597f8 interfaceC0597f8) {
        synchronized (this.f8144r) {
            try {
                List list = (List) this.f8143q.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    this.f8143q.put(str, list);
                }
                list.add(interfaceC0597f8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void G0() {
        Sh sh = this.y;
        if (sh != null) {
            sh.G0();
        }
    }

    public final void J() {
        synchronized (this.f8144r) {
        }
    }

    public final WebResourceResponse M(String str, Map map) {
        C0424b5 j4;
        try {
            String I4 = AbstractC1230u.I(this.f8141o.getContext(), str, this.f8137P);
            if (!I4.equals(str)) {
                return r(I4, map);
            }
            C0509d5 h4 = C0509d5.h(Uri.parse(str));
            if (h4 != null && (j4 = N1.n.f1204A.f1211i.j(h4)) != null && j4.k()) {
                return new WebResourceResponse("", "", j4.i());
            }
            if (C1421yc.c() && ((Boolean) J6.f5786b.r()).booleanValue()) {
                return r(str, map);
            }
            return null;
        } catch (Exception e4) {
            e = e4;
            N1.n.f1204A.f1209g.h("AdWebViewClient.interceptRequest", e);
            return o();
        } catch (NoClassDefFoundError e5) {
            e = e5;
            N1.n.f1204A.f1209g.h("AdWebViewClient.interceptRequest", e);
            return o();
        }
    }

    public final void N() {
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd;
        C0783ji c0783ji;
        InterfaceC0481ce interfaceC0481ce = this.f8147u;
        C0348Ud c0348Ud = this.f8141o;
        if (interfaceC0481ce != null && ((this.f8135M && this.f8136O <= 0) || this.N || this.f8123A)) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue() && (c0783ji = (viewTreeObserverOnGlobalLayoutListenerC0358Wd = c0348Ud.f7165o).f7486a0) != null) {
                AbstractC1230u.l((C1323w6) c0783ji.f9212q, viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7484V, "awfllc");
            }
            InterfaceC0481ce interfaceC0481ce2 = this.f8147u;
            boolean z4 = false;
            if (!this.N && !this.f8123A) {
                z4 = true;
            }
            interfaceC0481ce2.F(this.f8125C, this.f8124B, this.f8126D, z4);
            this.f8147u = null;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd2 = c0348Ud.f7165o;
        C0783ji c0783ji2 = viewTreeObserverOnGlobalLayoutListenerC0358Wd2.f7486a0;
        if (viewTreeObserverOnGlobalLayoutListenerC0358Wd2.f7485W == null) {
            c0783ji2.getClass();
            C1237u6 d = C1323w6.d();
            viewTreeObserverOnGlobalLayoutListenerC0358Wd2.f7485W = d;
            ((HashMap) c0783ji2.f9211p).put("native:view_load", d);
        }
    }

    public final void O() {
        InterfaceC0301Lb interfaceC0301Lb = this.f8134L;
        if (interfaceC0301Lb != null) {
            ((C0291Jb) interfaceC0301Lb).b();
            this.f8134L = null;
        }
        ViewOnAttachStateChangeListenerC0313Nd viewOnAttachStateChangeListenerC0313Nd = this.f8140S;
        if (viewOnAttachStateChangeListenerC0313Nd != null) {
            this.f8141o.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0313Nd);
        }
        synchronized (this.f8144r) {
            try {
                this.f8143q.clear();
                this.f8145s = null;
                this.f8146t = null;
                this.f8147u = null;
                this.f8148v = null;
                this.f8149w = null;
                this.f8150x = null;
                this.f8151z = false;
                this.f8127E = false;
                this.f8128F = false;
                this.f8130H = null;
                this.f8132J = null;
                this.f8131I = null;
                C0648ga c0648ga = this.f8133K;
                if (c0648ga != null) {
                    c0648ga.K(true);
                    this.f8133K = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.f8143q.get(path);
        if (path == null || list == null) {
            Q1.I.w("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.U5)).booleanValue() || N1.n.f1204A.f1209g.b() == null) {
                return;
            }
            AbstractC0266Ec.f4897a.execute(new D3(15, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        C0937n6 c0937n6 = AbstractC1066q6.P4;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue() && this.f8138Q.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) rVar.c.a(AbstractC1066q6.R4)).intValue()) {
                Q1.I.w("Parsing gmsg query params on BG thread: ".concat(path));
                Q1.N n4 = N1.n.f1204A.c;
                n4.getClass();
                B0.l lVar = new B0.l(2, uri);
                ExecutorService executorService = n4.f1676j;
                RunnableFutureC0498cv runnableFutureC0498cv = new RunnableFutureC0498cv(lVar);
                executorService.execute(runnableFutureC0498cv);
                runnableFutureC0498cv.a(new Nu(0, runnableFutureC0498cv, new u0.g(this, list, path, uri, 7, false)), AbstractC0266Ec.f4899e);
                return;
            }
        }
        Q1.N n5 = N1.n.f1204A.c;
        v(Q1.N.k(uri), list, path);
    }

    public final void a(boolean z4) {
        synchronized (this.f8144r) {
            this.f8129G = z4;
        }
    }

    public final void a0(int i4, int i5) {
        C0775ja c0775ja = this.f8131I;
        if (c0775ja != null) {
            c0775ja.K(i4, i5);
        }
        C0648ga c0648ga = this.f8133K;
        if (c0648ga != null) {
            synchronized (c0648ga.f8803A) {
                c0648ga.f8815u = i4;
                c0648ga.f8816v = i5;
            }
        }
    }

    public final boolean b() {
        boolean z4;
        synchronized (this.f8144r) {
            z4 = this.f8129G;
        }
        return z4;
    }

    public final boolean c() {
        boolean z4;
        synchronized (this.f8144r) {
            z4 = this.f8127E;
        }
        return z4;
    }

    public final boolean e() {
        boolean z4;
        synchronized (this.f8144r) {
            z4 = this.f8128F;
        }
        return z4;
    }

    public final void j0() {
        InterfaceC0301Lb interfaceC0301Lb = this.f8134L;
        if (interfaceC0301Lb != null) {
            C0348Ud c0348Ud = this.f8141o;
            ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = c0348Ud.f7165o;
            WeakHashMap weakHashMap = H.A.f779a;
            if (viewTreeObserverOnGlobalLayoutListenerC0358Wd.isAttachedToWindow()) {
                y(viewTreeObserverOnGlobalLayoutListenerC0358Wd, interfaceC0301Lb, 10);
                return;
            }
            ViewOnAttachStateChangeListenerC0313Nd viewOnAttachStateChangeListenerC0313Nd = this.f8140S;
            if (viewOnAttachStateChangeListenerC0313Nd != null) {
                c0348Ud.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0313Nd);
            }
            ViewOnAttachStateChangeListenerC0313Nd viewOnAttachStateChangeListenerC0313Nd2 = new ViewOnAttachStateChangeListenerC0313Nd(this, interfaceC0301Lb);
            this.f8140S = viewOnAttachStateChangeListenerC0313Nd2;
            c0348Ud.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0313Nd2);
        }
    }

    public final void l(InterfaceC0051a interfaceC0051a, Y7 y7, P1.g gVar, Z7 z7, P1.l lVar, boolean z4, C0640g8 c0640g8, N1.a aVar, C1384xi c1384xi, InterfaceC0301Lb interfaceC0301Lb, Xl xl, Oq oq, C0658gk c0658gk, InterfaceC1263uq interfaceC1263uq, X7 x7, Sh sh, C0683h8 c0683h8, X7 x72, C0567ef c0567ef) {
        C1434yp c1434yp;
        C0348Ud c0348Ud = this.f8141o;
        N1.a aVar2 = aVar == null ? new N1.a(c0348Ud.getContext(), interfaceC0301Lb) : aVar;
        this.f8133K = new C0648ga(c0348Ud, c1384xi);
        this.f8134L = interfaceC0301Lb;
        C0937n6 c0937n6 = AbstractC1066q6.f10107G0;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue()) {
            F0("/adMetadata", new X7(0, y7));
        }
        if (z7 != null) {
            F0("/appEvent", new X7(1, z7));
        }
        F0("/backButton", AbstractC0554e8.f8563e);
        F0("/refresh", AbstractC0554e8.f8564f);
        F0("/canOpenApp", C0427b8.f8208q);
        F0("/canOpenURLs", C0427b8.f8207p);
        F0("/canOpenIntents", C0427b8.f8210s);
        F0("/close", AbstractC0554e8.f8561a);
        F0("/customClose", AbstractC0554e8.f8562b);
        F0("/instrument", AbstractC0554e8.f8567i);
        F0("/delayPageLoaded", AbstractC0554e8.f8569k);
        F0("/delayPageClosed", AbstractC0554e8.f8570l);
        F0("/getLocationInfo", AbstractC0554e8.f8571m);
        F0("/log", AbstractC0554e8.c);
        F0("/mraid", new C0726i8(aVar2, this.f8133K, c1384xi));
        C0775ja c0775ja = this.f8131I;
        if (c0775ja != null) {
            F0("/mraidLoaded", c0775ja);
        }
        N1.a aVar3 = aVar2;
        F0("/open", new C0853l8(aVar3, this.f8133K, xl, c0658gk, interfaceC1263uq, c0567ef));
        F0("/precache", new C0427b8(28));
        F0("/touch", C0427b8.f8209r);
        F0("/video", AbstractC0554e8.f8565g);
        F0("/videoMeta", AbstractC0554e8.f8566h);
        if (xl == null || oq == null) {
            F0("/click", new C0469c8(0, sh, c0567ef));
            F0("/httpTrack", C0427b8.f8211t);
        } else {
            F0("/click", new C1471zj(sh, c0567ef, oq, xl));
            F0("/httpTrack", new C0469c8(4, oq, xl));
        }
        if (N1.n.f1204A.f1225w.j(c0348Ud.getContext())) {
            F0("/logScionEvent", new C0683h8(c0348Ud.getContext(), 0));
        }
        if (c0640g8 != null) {
            F0("/setInterstitialProperties", new X7(2, c0640g8));
        }
        if (x7 != null && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.P7)).booleanValue()) {
            F0("/inspectorNetworkExtras", x7);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.i8)).booleanValue() && c0683h8 != null) {
            F0("/shareSheet", c0683h8);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.n8)).booleanValue() && x72 != null) {
            F0("/inspectorOutOfContextTest", x72);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.I9)).booleanValue()) {
            F0("/bindPlayStoreOverlay", AbstractC0554e8.f8574p);
            F0("/presentPlayStoreOverlay", AbstractC0554e8.f8575q);
            F0("/expandPlayStoreOverlay", AbstractC0554e8.f8576r);
            F0("/collapsePlayStoreOverlay", AbstractC0554e8.f8577s);
            F0("/closePlayStoreOverlay", AbstractC0554e8.f8578t);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10121J2)).booleanValue()) {
            F0("/setPAIDPersonalizationEnabled", AbstractC0554e8.f8580v);
            F0("/resetPAID", AbstractC0554e8.f8579u);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.aa)).booleanValue() && (c1434yp = c0348Ud.f7165o.f7506w) != null && c1434yp.f11531q0) {
            F0("/writeToLocalStorage", AbstractC0554e8.f8581w);
            F0("/clearLocalStorageKeys", AbstractC0554e8.f8582x);
        }
        this.f8145s = interfaceC0051a;
        this.f8146t = gVar;
        this.f8149w = y7;
        this.f8150x = z7;
        this.f8130H = lVar;
        this.f8132J = aVar3;
        this.y = sh;
        this.f8151z = z4;
    }

    public final void n0(P1.b bVar, boolean z4) {
        C0348Ud c0348Ud = this.f8141o;
        boolean U4 = c0348Ud.f7165o.U();
        boolean B4 = B(U4, c0348Ud);
        boolean z5 = true;
        if (!B4 && z4) {
            z5 = false;
        }
        t0(new AdOverlayInfoParcel(bVar, B4 ? null : this.f8145s, U4 ? null : this.f8146t, this.f8130H, c0348Ud.f7165o.f7501r, c0348Ud, z5 ? null : this.y));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Q1.I.w("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            X(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        TextView textView;
        synchronized (this.f8144r) {
            try {
                if (this.f8141o.f7165o.t()) {
                    Q1.I.w("Blank page loaded, 1...");
                    this.f8141o.y();
                    return;
                }
                this.f8135M = true;
                InterfaceC0524de interfaceC0524de = this.f8148v;
                if (interfaceC0524de != null) {
                    interfaceC0524de.mo7b();
                    this.f8148v = null;
                }
                N();
                if (this.f8141o.f7165o.v0() != null) {
                    if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.ba)).booleanValue() || (textView = this.f8141o.f7165o.v0().f1489I) == null) {
                        return;
                    }
                    textView.setText(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        this.f8123A = true;
        this.f8124B = i4;
        this.f8125C = str;
        this.f8126D = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        final boolean didCrash;
        final int rendererPriorityAtExit;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        C0348Ud c0348Ud = this.f8141o;
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = c0348Ud.f7165o;
        if (c0348Ud.f7167q.compareAndSet(false, true)) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10083B0)).booleanValue()) {
                return false;
            }
            if (viewTreeObserverOnGlobalLayoutListenerC0358Wd.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC0358Wd.getParent()).removeView(viewTreeObserverOnGlobalLayoutListenerC0358Wd);
            }
            viewTreeObserverOnGlobalLayoutListenerC0358Wd.destroy();
            InterfaceC0723i5 interfaceC0723i5 = new InterfaceC0723i5() { // from class: com.google.android.gms.internal.ads.Vd
                @Override // com.google.android.gms.internal.ads.InterfaceC0723i5
                public final void j(F5 f5) {
                    int i4 = ViewTreeObserverOnGlobalLayoutListenerC0358Wd.f7463m0;
                    C0765j6 v4 = C0808k6.v();
                    boolean y = ((C0808k6) v4.f4561p).y();
                    boolean z4 = didCrash;
                    if (y != z4) {
                        v4.d();
                        C0808k6.w((C0808k6) v4.f4561p, z4);
                    }
                    v4.d();
                    C0808k6.x((C0808k6) v4.f4561p, rendererPriorityAtExit);
                    C0808k6 c0808k6 = (C0808k6) v4.b();
                    f5.d();
                    G5.F((G5) f5.f4561p, c0808k6);
                }
            };
            C0764j5 c0764j5 = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7497l0;
            c0764j5.a(interfaceC0723i5);
            c0764j5.b(10003);
        }
        return true;
    }

    public final WebResourceResponse r(String str, Map map) {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        C0348Ud c0348Ud = this.f8141o;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i4 = 0;
            while (true) {
                i4++;
                if (i4 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                N1.n.f1204A.c.w(c0348Ud.getContext(), c0348Ud.f7165o.f7501r.f4084o, httpURLConnection, 60000);
                C1421yc c1421yc = new C1421yc();
                webResourceResponse = null;
                c1421yc.a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                c1421yc.b(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (!headerField.startsWith("tel:")) {
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        Y9.s("Protocol is null");
                        webResourceResponse = o();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        Y9.s("Unsupported scheme: " + protocol);
                        webResourceResponse = o();
                        break;
                    }
                    Y9.m("Redirecting to " + headerField);
                    httpURLConnection.disconnect();
                    url = url2;
                }
            }
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i5 = 1;
                    while (true) {
                        if (i5 >= split.length) {
                            break;
                        }
                        if (split[i5].trim().startsWith("charset")) {
                            String[] split2 = split[i5].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i5++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            Q1.O o4 = N1.n.f1204A.f1207e;
            int responseCode2 = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            InputStream inputStream = httpURLConnection.getInputStream();
            o4.getClass();
            webResourceResponse = new WebResourceResponse(trim, str3, responseCode2, responseMessage, hashMap, inputStream);
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        String uri = webResourceRequest.getUrl().toString();
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (!(webView instanceof InterfaceC0308Md)) {
            Y9.s("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) webView;
        InterfaceC0301Lb interfaceC0301Lb = this.f8134L;
        if (interfaceC0301Lb != null) {
            ((C0291Jb) interfaceC0301Lb).a(uri, requestHeaders, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(uri).getName())) {
            if (requestHeaders == null) {
                requestHeaders = Collections.EMPTY_MAP;
            }
            return M(uri, requestHeaders);
        }
        if (interfaceC0308Md.H() != null) {
            C0396ae H3 = interfaceC0308Md.H();
            synchronized (H3.f8144r) {
                H3.f8151z = false;
                H3.f8127E = true;
                AbstractC0266Ec.f4899e.execute(new D3(14, H3));
            }
        }
        if (interfaceC0308Md.P().b()) {
            str = (String) O1.r.d.c.a(AbstractC1066q6.f10114I);
        } else if (interfaceC0308Md.U()) {
            str = (String) O1.r.d.c.a(AbstractC1066q6.f10110H);
        } else {
            str = (String) O1.r.d.c.a(AbstractC1066q6.f10106G);
        }
        N1.n nVar = N1.n.f1204A;
        Q1.N n4 = nVar.c;
        Context context = interfaceC0308Md.getContext();
        String str2 = interfaceC0308Md.m().f4084o;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", nVar.c.u(context, str2));
            hashMap.put("Cache-Control", "max-stale=3600");
            new Q1.v(context);
            C0120t a4 = Q1.v.a(0, str, hashMap, null);
            String str3 = (String) a4.f5017o.get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e4) {
            Y9.t("Could not fetch MRAID JS.", e4);
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return M(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Q1.I.w("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            X(parse);
            return true;
        }
        boolean z4 = this.f8151z;
        C0348Ud c0348Ud = this.f8141o;
        if (z4 && webView == c0348Ud.f7165o) {
            String scheme = parse.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                InterfaceC0051a interfaceC0051a = this.f8145s;
                if (interfaceC0051a != null) {
                    interfaceC0051a.D();
                    InterfaceC0301Lb interfaceC0301Lb = this.f8134L;
                    if (interfaceC0301Lb != null) {
                        ((C0291Jb) interfaceC0301Lb).c(str);
                    }
                    this.f8145s = null;
                }
                Sh sh = this.y;
                if (sh != null) {
                    sh.G0();
                    this.y = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        if (c0348Ud.f7165o.willNotDraw()) {
            Y9.s("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            I3 i32 = c0348Ud.f7165o.f7499p;
            if (i32 != null && i32.b(parse)) {
                parse = i32.a(parse, c0348Ud.getContext(), c0348Ud, c0348Ud.g());
            }
        } catch (J3 unused) {
            Y9.s("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        N1.a aVar = this.f8132J;
        if (aVar == null || aVar.b()) {
            n0(new P1.b("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
        } else {
            aVar.a(str);
        }
        return true;
    }

    public final void t0(AdOverlayInfoParcel adOverlayInfoParcel) {
        P1.b bVar;
        C0648ga c0648ga = this.f8133K;
        if (c0648ga != null) {
            synchronized (c0648ga.f8803A) {
                r1 = c0648ga.f8810H != null;
            }
        }
        C2033d c2033d = N1.n.f1204A.f1206b;
        C2033d.m(this.f8141o.getContext(), adOverlayInfoParcel, !r1);
        InterfaceC0301Lb interfaceC0301Lb = this.f8134L;
        if (interfaceC0301Lb != null) {
            String str = adOverlayInfoParcel.f3876z;
            if (str == null && (bVar = adOverlayInfoParcel.f3866o) != null) {
                str = bVar.f1503p;
            }
            ((C0291Jb) interfaceC0301Lb).c(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void u() {
        Sh sh = this.y;
        if (sh != null) {
            sh.u();
        }
    }

    public final void v(Map map, List list, String str) {
        if (Q1.I.y()) {
            Q1.I.w("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                Q1.I.w("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0597f8) it.next()).h(this.f8141o, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(android.view.View r8, com.google.android.gms.internal.ads.InterfaceC0301Lb r9, int r10) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.Jb r9 = (com.google.android.gms.internal.ads.C0291Jb) r9
            com.google.android.gms.internal.ads.Kb r0 = r9.f5861g
            boolean r0 = r0.f6026q
            if (r0 == 0) goto Lb6
            boolean r1 = r9.f5864j
            if (r1 != 0) goto Lb6
            if (r10 <= 0) goto Lb6
            if (r0 != 0) goto L12
            goto La0
        L12:
            if (r1 != 0) goto La0
            N1.n r0 = N1.n.f1204A
            Q1.N r0 = r0.c
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L1d
            goto L78
        L1d:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2f
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2f
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2f
            if (r3 == 0) goto L31
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2f
            goto L32
        L2f:
            r2 = move-exception
            goto L38
        L31:
            r3 = r1
        L32:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L36
            goto L3e
        L36:
            r2 = move-exception
            goto L39
        L38:
            r3 = r1
        L39:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.Y9.q(r4, r2)
        L3e:
            if (r3 != 0) goto L77
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            if (r2 == 0) goto L6b
            if (r3 != 0) goto L4d
            goto L6b
        L4d:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L69
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L69
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L69
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L69
            r1 = r4
            goto L78
        L69:
            r2 = move-exception
            goto L71
        L6b:
            java.lang.String r2 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.Y9.s(r2)     // Catch: java.lang.RuntimeException -> L69
            goto L78
        L71:
            java.lang.String r3 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.Y9.q(r3, r2)
            goto L78
        L77:
            r1 = r3
        L78:
            if (r1 != 0) goto L80
            java.lang.String r0 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.AbstractC1230u.m(r0)
            goto La0
        L80:
            r9.f5864j = r0
            b0.p r0 = new b0.p
            r2 = 11
            r0.<init>(r2, r9, r1)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r1 == r2) goto L9b
            r0.run()
            goto La0
        L9b:
            com.google.android.gms.internal.ads.Dc r1 = com.google.android.gms.internal.ads.AbstractC0266Ec.f4897a
            r1.execute(r0)
        La0:
            com.google.android.gms.internal.ads.Kb r0 = r9.f5861g
            boolean r0 = r0.f6026q
            if (r0 == 0) goto Lb6
            boolean r0 = r9.f5864j
            if (r0 != 0) goto Lb6
            Q1.J r0 = Q1.N.f1668k
            com.google.android.gms.internal.ads.rd r1 = new com.google.android.gms.internal.ads.rd
            r1.<init>(r7, r8, r9, r10)
            r8 = 100
            r0.postDelayed(r1, r8)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0396ae.y(android.view.View, com.google.android.gms.internal.ads.Lb, int):void");
    }
}
