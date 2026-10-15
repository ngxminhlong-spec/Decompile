package com.google.android.gms.internal.ads;

import O1.C0081p;
import O1.InterfaceC0051a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.measurement.C1510e1;
import d3.AbstractC1654b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Wd */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0358Wd extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC0308Md {

    /* renamed from: m0 */
    public static final /* synthetic */ int f7463m0 = 0;

    /* renamed from: A */
    public C0396ae f7464A;

    /* renamed from: B */
    public P1.a f7465B;

    /* renamed from: C */
    public Pq f7466C;

    /* renamed from: D */
    public C0887m f7467D;

    /* renamed from: E */
    public final String f7468E;

    /* renamed from: F */
    public boolean f7469F;

    /* renamed from: G */
    public boolean f7470G;

    /* renamed from: H */
    public boolean f7471H;

    /* renamed from: I */
    public boolean f7472I;

    /* renamed from: J */
    public Boolean f7473J;

    /* renamed from: K */
    public boolean f7474K;

    /* renamed from: L */
    public final String f7475L;

    /* renamed from: M */
    public BinderC0368Yd f7476M;
    public boolean N;

    /* renamed from: O */
    public boolean f7477O;

    /* renamed from: P */
    public InterfaceC0725i7 f7478P;

    /* renamed from: Q */
    public ViewTreeObserverOnGlobalLayoutListenerC1042pj f7479Q;

    /* renamed from: R */
    public N4 f7480R;

    /* renamed from: S */
    public int f7481S;

    /* renamed from: T */
    public int f7482T;

    /* renamed from: U */
    public C1237u6 f7483U;

    /* renamed from: V */
    public final C1237u6 f7484V;

    /* renamed from: W */
    public C1237u6 f7485W;

    /* renamed from: a0 */
    public final C0783ji f7486a0;

    /* renamed from: b0 */
    public int f7487b0;

    /* renamed from: c0 */
    public P1.a f7488c0;

    /* renamed from: d0 */
    public boolean f7489d0;

    /* renamed from: e0 */
    public final Q1.H f7490e0;

    /* renamed from: f0 */
    public int f7491f0;

    /* renamed from: g0 */
    public int f7492g0;

    /* renamed from: h0 */
    public int f7493h0;

    /* renamed from: i0 */
    public int f7494i0;

    /* renamed from: j0 */
    public HashMap f7495j0;

    /* renamed from: k0 */
    public final WindowManager f7496k0;

    /* renamed from: l0 */
    public final C0764j5 f7497l0;

    /* renamed from: o */
    public final C0566ee f7498o;

    /* renamed from: p */
    public final I3 f7499p;

    /* renamed from: q */
    public final A6 f7500q;

    /* renamed from: r */
    public final C0248Bc f7501r;

    /* renamed from: s */
    public N1.i f7502s;

    /* renamed from: t */
    public final C1510e1 f7503t;

    /* renamed from: u */
    public final DisplayMetrics f7504u;

    /* renamed from: v */
    public final float f7505v;

    /* renamed from: w */
    public C1434yp f7506w;

    /* renamed from: x */
    public Ap f7507x;
    public boolean y;

    /* renamed from: z */
    public boolean f7508z;

    public ViewTreeObserverOnGlobalLayoutListenerC0358Wd(C0566ee c0566ee, C0887m c0887m, String str, boolean z4, I3 i32, A6 a6, C0248Bc c0248Bc, N1.i iVar, C1510e1 c1510e1, C0764j5 c0764j5, C1434yp c1434yp, Ap ap) {
        super(c0566ee);
        Ap ap2;
        String str2;
        this.y = false;
        this.f7508z = false;
        this.f7474K = true;
        this.f7475L = "";
        this.f7491f0 = -1;
        this.f7492g0 = -1;
        this.f7493h0 = -1;
        this.f7494i0 = -1;
        this.f7498o = c0566ee;
        this.f7467D = c0887m;
        this.f7468E = str;
        this.f7471H = z4;
        this.f7499p = i32;
        this.f7500q = a6;
        this.f7501r = c0248Bc;
        this.f7502s = iVar;
        this.f7503t = c1510e1;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f7496k0 = windowManager;
        Q1.N n4 = N1.n.f1204A.c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f7504u = displayMetrics;
        this.f7505v = displayMetrics.density;
        this.f7497l0 = c0764j5;
        this.f7506w = c1434yp;
        this.f7507x = ap;
        this.f7490e0 = new Q1.H(c0566ee.f8621a, this, this);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e4) {
            Y9.q("Unable to enable Javascript.", e4);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        C0937n6 c0937n6 = AbstractC1066q6.O9;
        O1.r rVar = O1.r.d;
        int i4 = 2;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        N1.n nVar = N1.n.f1204A;
        settings.setUserAgentString(nVar.c.u(c0566ee, c0248Bc.f4084o));
        Context context = getContext();
        AbstractC1654b.c0(context, new B0.v(i4, settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        a0();
        addJavascriptInterface(new C0373Zd(this, new M3(22, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        C0783ji c0783ji = this.f7486a0;
        if (c0783ji != null) {
            C1323w6 c1323w6 = (C1323w6) c0783ji.f9212q;
            C1151s6 b4 = nVar.f1209g.b();
            if (b4 != null) {
                ((ArrayBlockingQueue) b4.f10577a).offer(c1323w6);
            }
        }
        C1323w6 c1323w62 = new C1323w6(this.f7468E);
        C0783ji c0783ji2 = new C0783ji(c1323w62);
        this.f7486a0 = c0783ji2;
        synchronized (c1323w62.c) {
        }
        if (((Boolean) rVar.c.a(AbstractC1066q6.f10094D1)).booleanValue() && (ap2 = this.f7507x) != null && (str2 = ap2.f3998b) != null) {
            c1323w62.b("gqi", str2);
        }
        C1237u6 d = C1323w6.d();
        this.f7484V = d;
        ((HashMap) c0783ji2.f9211p).put("native:view_create", d);
        Context context2 = null;
        this.f7485W = null;
        this.f7483U = null;
        if (B0.f.f73q == null) {
            B0.f.f73q = new B0.f(2);
        }
        B0.f fVar = B0.f.f73q;
        fVar.getClass();
        Q1.I.w("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(c0566ee);
        if (!defaultUserAgent.equals(fVar.f75p)) {
            AtomicBoolean atomicBoolean = e2.h.f12754a;
            try {
                context2 = c0566ee.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (context2 == null) {
                c0566ee.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(c0566ee)).apply();
            }
            fVar.f75p = defaultUserAgent;
        }
        Q1.I.w("User agent is updated.");
        nVar.f1209g.f9975j.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void A(Context context) {
        C0566ee c0566ee = this.f7498o;
        c0566ee.setBaseContext(context);
        this.f7490e0.f1636f = c0566ee.f8621a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void A0(String str, InterfaceC0597f8 interfaceC0597f8) {
        C0396ae c0396ae = this.f7464A;
        if (c0396ae != null) {
            c0396ae.F0(str, interfaceC0597f8);
        }
    }

    public final synchronized Boolean B() {
        return this.f7473J;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void B0(int i4, boolean z4, boolean z5) {
        boolean z6;
        BinderC0489cm binderC0489cm;
        InterfaceC0051a interfaceC0051a;
        Sh sh;
        int i5;
        boolean z7;
        C0396ae c0396ae = this.f7464A;
        C0348Ud c0348Ud = c0396ae.f8141o;
        boolean B4 = C0396ae.B(c0348Ud.f7165o.U(), c0348Ud);
        boolean z8 = true;
        if (B4 || !z5) {
            z6 = B4;
        } else {
            z6 = B4;
            z8 = false;
        }
        InterfaceC0051a interfaceC0051a2 = z6 ? null : c0396ae.f8145s;
        boolean z9 = z8;
        P1.g gVar = c0396ae.f8146t;
        P1.l lVar = c0396ae.f8130H;
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = c0348Ud.f7165o;
        C0248Bc c0248Bc = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7501r;
        Sh sh2 = z9 ? null : c0396ae.y;
        C1434yp c1434yp = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7506w;
        if (c1434yp != null ? c1434yp.f11515i0 : false) {
            binderC0489cm = c0396ae.f8139R;
            i5 = i4;
            sh = sh2;
            z7 = z4;
            interfaceC0051a = interfaceC0051a2;
        } else {
            binderC0489cm = null;
            interfaceC0051a = interfaceC0051a2;
            sh = sh2;
            i5 = i4;
            z7 = z4;
        }
        c0396ae.t0(new AdOverlayInfoParcel(interfaceC0051a, gVar, lVar, c0348Ud, z7, i5, c0248Bc, sh, binderC0489cm));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void C(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void C0(N4 n4) {
        this.f7480R = n4;
    }

    @Override // O1.InterfaceC0051a
    public final void D() {
        C0396ae c0396ae = this.f7464A;
        if (c0396ae != null) {
            c0396ae.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void D0(String str, InterfaceC0597f8 interfaceC0597f8) {
        C0396ae c0396ae = this.f7464A;
        if (c0396ae != null) {
            synchronized (c0396ae.f8144r) {
                try {
                    List list = (List) c0396ae.f8143q.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(interfaceC0597f8);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized P1.a E() {
        return this.f7488c0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void E0(int i4) {
        this.f7487b0 = i4;
    }

    public final void F0(boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z4 ? "0" : "1");
        b("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized N4 G() {
        return this.f7480R;
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void G0() {
        C0396ae c0396ae = this.f7464A;
        if (c0396ae != null) {
            c0396ae.G0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final /* synthetic */ C0396ae H() {
        return this.f7464A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void H0(P1.a aVar) {
        this.f7465B = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void I(int i4) {
        P1.a aVar = this.f7465B;
        if (aVar != null) {
            aVar.K3(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized String I0() {
        return this.f7475L;
    }

    public final synchronized void J(String str) {
        if (t()) {
            Y9.s("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final synchronized void J0() {
        try {
            if (this.f7472I) {
                setLayerType(0, null);
            }
            this.f7472I = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void K(BinderC0368Yd binderC0368Yd) {
        if (this.f7476M != null) {
            Y9.p("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f7476M = binderC0368Yd;
        }
    }

    public final synchronized void K0() {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            N1.n.f1204A.f1209g.h("AdWebViewImpl.loadUrlUnsafe", th);
            Y9.t("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final View L() {
        return this;
    }

    public final synchronized void L0() {
        try {
            HashMap hashMap = this.f7495j0;
            if (hashMap != null) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC1250ud) it.next()).i();
                }
            }
            this.f7495j0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void M(String str) {
        if (B() == null) {
            synchronized (this) {
                Boolean e4 = N1.n.f1204A.f1209g.e();
                this.f7473J = e4;
                if (e4 == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        O(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        O(Boolean.FALSE);
                    }
                }
            }
        }
        if (B().booleanValue()) {
            J(str);
        } else {
            N("javascript:".concat(str));
        }
    }

    public final synchronized void M0(String str, String str2) {
        Throwable th;
        String str3;
        try {
            try {
                if (t()) {
                    Y9.s("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) O1.r.d.c.a(AbstractC1066q6.f10119J);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e4) {
                    Y9.t("Unable to build MRAID_ENV", e4);
                    str3 = null;
                }
                super.loadDataWithBaseURL(str, AbstractC0439be.a(str2, str3), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void N(String str) {
        if (t()) {
            Y9.s("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void N0(boolean z4, long j4) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z4 ? "0" : "1");
        hashMap.put("duration", Long.toString(j4));
        b("onCacheAccessComplete", hashMap);
    }

    public final void O(Boolean bool) {
        synchronized (this) {
            this.f7473J = bool;
        }
        N1.n.f1204A.f1209g.i(bool);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void O0(int i4) {
        C1237u6 c1237u6 = this.f7484V;
        C0783ji c0783ji = this.f7486a0;
        if (i4 == 0) {
            AbstractC1230u.l((C1323w6) c0783ji.f9212q, c1237u6, "aebb2");
        }
        AbstractC1230u.l((C1323w6) c0783ji.f9212q, c1237u6, "aeh2");
        c0783ji.getClass();
        ((C1323w6) c0783ji.f9212q).b("close_type", String.valueOf(i4));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i4));
        hashMap.put("version", this.f7501r.f4084o);
        b("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized C0887m P() {
        return this.f7467D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void P0(boolean z4) {
        P1.a aVar;
        int i4 = this.f7481S + (true != z4 ? -1 : 1);
        this.f7481S = i4;
        if (i4 > 0 || (aVar = this.f7465B) == null) {
            return;
        }
        aVar.p1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void Q(boolean z4) {
        P1.a aVar = this.f7465B;
        if (aVar != null) {
            aVar.O3(this.f7464A.c(), z4);
        } else {
            this.f7469F = z4;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void Q0(P1.a aVar) {
        this.f7488c0 = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized InterfaceC0725i7 R() {
        return this.f7478P;
    }

    public final void R0(String str, String str2) {
        M(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void S() {
        if (this.f7483U == null) {
            C0783ji c0783ji = this.f7486a0;
            AbstractC1230u.l((C1323w6) c0783ji.f9212q, this.f7484V, "aes2");
            C1237u6 d = C1323w6.d();
            this.f7483U = d;
            ((HashMap) c0783ji.f9211p).put("native:view_show", d);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f7501r.f4084o);
        b("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void T(Pq pq) {
        this.f7466C = pq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized boolean U() {
        return this.f7471H;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void V(InterfaceC0725i7 interfaceC0725i7) {
        this.f7478P = interfaceC0725i7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final Ap W() {
        return this.f7507x;
    }

    public final boolean X() {
        int i4;
        int i5;
        if (this.f7464A.c() || this.f7464A.e()) {
            C1335wc c1335wc = C0081p.f1374f.f1375a;
            DisplayMetrics displayMetrics = this.f7504u;
            int round = Math.round(displayMetrics.widthPixels / displayMetrics.density);
            int round2 = Math.round(displayMetrics.heightPixels / displayMetrics.density);
            Activity activity = this.f7498o.f8621a;
            if (activity == null || activity.getWindow() == null) {
                i4 = round;
                i5 = round2;
            } else {
                Q1.N n4 = N1.n.f1204A.c;
                int[] l4 = Q1.N.l(activity);
                i4 = Math.round(l4[0] / displayMetrics.density);
                i5 = Math.round(l4[1] / displayMetrics.density);
            }
            int i6 = this.f7492g0;
            if (i6 != round || this.f7491f0 != round2 || this.f7493h0 != i4 || this.f7494i0 != i5) {
                boolean z4 = (i6 == round && this.f7491f0 == round2) ? false : true;
                this.f7492g0 = round;
                this.f7491f0 = round2;
                this.f7493h0 = i4;
                this.f7494i0 = i5;
                new C1510e1((Object) this, (Object) "", 19, false).H(round, round2, i4, i5, displayMetrics.density, this.f7496k0.getDefaultDisplay().getRotation());
                return z4;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized boolean Y() {
        return this.f7481S > 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void Z() {
        ViewTreeObserverOnGlobalLayoutListenerC1042pj viewTreeObserverOnGlobalLayoutListenerC1042pj = this.f7479Q;
        if (viewTreeObserverOnGlobalLayoutListenerC1042pj != null) {
            Q1.N.f1668k.post(new D3(27, viewTreeObserverOnGlobalLayoutListenerC1042pj));
        }
    }

    @Override // N1.i
    public final synchronized void a() {
        N1.i iVar = this.f7502s;
        if (iVar != null) {
            iVar.a();
        }
    }

    public final synchronized void a0() {
        C1434yp c1434yp = this.f7506w;
        if (c1434yp != null && c1434yp.f11523m0) {
            Y9.m("Disabling hardware acceleration on an overlay.");
            t0();
            return;
        }
        if (!this.f7471H && !this.f7467D.b()) {
            Y9.m("Enabling hardware acceleration on an AdView.");
            J0();
            return;
        }
        Y9.m("Enabling hardware acceleration on an overlay.");
        J0();
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final void b(String str, Map map) {
        try {
            c(str, C0081p.f1374f.f1375a.g(map));
        } catch (JSONException unused) {
            Y9.s("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized Pq b0() {
        return this.f7466C;
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final void c(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder n4 = U.a.n("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        Y9.m("Dispatching AFMA event: ".concat(n4.toString()));
        M(n4.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void c0(String str, AbstractC1250ud abstractC1250ud) {
        try {
            if (this.f7495j0 == null) {
                this.f7495j0 = new HashMap();
            }
            this.f7495j0.put(str, abstractC1250ud);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized int d() {
        return this.f7487b0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final I3 d0() {
        return this.f7499p;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0045 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0001, B:6:0x001b, B:9:0x004a, B:11:0x004e, B:12:0x005b, B:17:0x0072, B:19:0x0091, B:22:0x00a0, B:25:0x0028, B:27:0x002c, B:32:0x0045, B:33:0x0048, B:34:0x0037, B:36:0x003d, B:37:0x0006, B:39:0x0014), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0308Md
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void destroy() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.ji r0 = r5.f7486a0     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L6
            goto L1b
        L6:
            java.lang.Object r0 = r0.f9212q     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.w6 r0 = (com.google.android.gms.internal.ads.C1323w6) r0     // Catch: java.lang.Throwable -> L59
            N1.n r1 = N1.n.f1204A     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.pc r1 = r1.f1209g     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.s6 r1 = r1.b()     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r1.f10577a     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.ArrayBlockingQueue r1 = (java.util.concurrent.ArrayBlockingQueue) r1     // Catch: java.lang.Throwable -> L59
            r1.offer(r0)     // Catch: java.lang.Throwable -> L59
        L1b:
            Q1.H r0 = r5.f7490e0     // Catch: java.lang.Throwable -> L59
            r1 = 0
            r0.c = r1     // Catch: java.lang.Throwable -> L59
            java.lang.Object r2 = r0.f1636f     // Catch: java.lang.Throwable -> L59
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L59
            r3 = 0
            if (r2 != 0) goto L28
            goto L4a
        L28:
            boolean r4 = r0.f1633a     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r0.f1635e     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.Wd r4 = (com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0358Wd) r4     // Catch: java.lang.Throwable -> L59
            android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto L37
            goto L42
        L37:
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L42
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> L59
            goto L43
        L42:
            r2 = r3
        L43:
            if (r2 == 0) goto L48
            r2.removeOnGlobalLayoutListener(r4)     // Catch: java.lang.Throwable -> L59
        L48:
            r0.f1633a = r1     // Catch: java.lang.Throwable -> L59
        L4a:
            P1.a r0 = r5.f7465B     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L5b
            r0.c()     // Catch: java.lang.Throwable -> L59
            P1.a r0 = r5.f7465B     // Catch: java.lang.Throwable -> L59
            r0.q()     // Catch: java.lang.Throwable -> L59
            r5.f7465B = r3     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r0 = move-exception
            goto Laa
        L5b:
            r5.f7466C = r3     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.ae r0 = r5.f7464A     // Catch: java.lang.Throwable -> L59
            r0.O()     // Catch: java.lang.Throwable -> L59
            r5.f7480R = r3     // Catch: java.lang.Throwable -> L59
            r5.f7502s = r3     // Catch: java.lang.Throwable -> L59
            r5.setOnClickListener(r3)     // Catch: java.lang.Throwable -> L59
            r5.setOnTouchListener(r3)     // Catch: java.lang.Throwable -> L59
            boolean r0 = r5.f7470G     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L72
            monitor-exit(r5)
            return
        L72:
            N1.n r0 = N1.n.f1204A     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.nd r0 = r0.y     // Catch: java.lang.Throwable -> L59
            r0.g(r5)     // Catch: java.lang.Throwable -> L59
            r5.L0()     // Catch: java.lang.Throwable -> L59
            r0 = 1
            r5.f7470G = r0     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.n6 r0 = com.google.android.gms.internal.ads.AbstractC1066q6.g9     // Catch: java.lang.Throwable -> L59
            O1.r r1 = O1.r.d     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.p6 r1 = r1.c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto La0
            java.lang.String r0 = "Initiating WebView self destruct sequence in 3..."
            Q1.I.w(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = "Loading blank page in WebView, 2..."
            Q1.I.w(r0)     // Catch: java.lang.Throwable -> L59
            r5.K0()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)
            return
        La0:
            java.lang.String r0 = "Destroying the WebView immediately..."
            Q1.I.w(r0)     // Catch: java.lang.Throwable -> L59
            r5.y()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)
            return
        Laa:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0358Wd.destroy():void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized String e0() {
        return this.f7468E;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!t()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        Y9.u("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final int f() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void f0(boolean z4) {
        if (z4) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        P1.a aVar = this.f7465B;
        if (aVar != null) {
            if (z4) {
                aVar.f1501z.setBackgroundColor(0);
            } else {
                aVar.f1501z.setBackgroundColor(-16777216);
            }
        }
    }

    public final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.f7470G) {
                        this.f7464A.O();
                        N1.n.f1204A.y.g(this);
                        L0();
                        n0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final Activity g() {
        return this.f7498o.f8621a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final Context g0() {
        return this.f7498o.c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final int h() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final InterfaceFutureC0239a h0() {
        A6 a6 = this.f7500q;
        return a6 == null ? Pu.f6608p : (Ku) Bs.o0(Ku.q(Pu.f6608p), ((Long) M6.c.r()).longValue(), TimeUnit.MILLISECONDS, a6.c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized AbstractC1250ud i(String str) {
        HashMap hashMap = this.f7495j0;
        if (hashMap == null) {
            return null;
        }
        return (AbstractC1250ud) hashMap.get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void i0(boolean z4) {
        this.f7474K = z4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C1510e1 j() {
        return this.f7503t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1450z4
    public final void j0(C1407y4 c1407y4) {
        boolean z4;
        synchronized (this) {
            z4 = c1407y4.f11338j;
            this.N = z4;
        }
        F0(z4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C1237u6 k() {
        return this.f7484V;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void k0() {
        AbstractC1230u.l((C1323w6) this.f7486a0.f9212q, this.f7484V, "aeh2");
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f7501r.f4084o);
        b("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void l(String str, JSONObject jSONObject) {
        R0(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final boolean l0() {
        return false;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void loadData(String str, String str2, String str3) {
        if (t()) {
            Y9.s("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            try {
                if (t()) {
                    Y9.s("#004 The webview is destroyed. Ignoring action.");
                } else {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void loadUrl(String str) {
        if (t()) {
            Y9.s("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            N1.n.f1204A.f1209g.h("AdWebViewImpl.loadUrl", th);
            Y9.t("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C0248Bc m() {
        return this.f7501r;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final WebView m0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C0326Qb n() {
        return null;
    }

    public final synchronized void n0() {
        if (this.f7489d0) {
            return;
        }
        this.f7489d0 = true;
        N1.n.f1204A.f1209g.f9975j.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void o(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void o0(boolean z4, int i4, String str, String str2, boolean z5) {
        boolean z6;
        BinderC0489cm binderC0489cm;
        boolean z7;
        int i5;
        String str3;
        String str4;
        C0396ae c0396ae = this.f7464A;
        C0348Ud c0348Ud = c0396ae.f8141o;
        boolean U4 = c0348Ud.f7165o.U();
        boolean B4 = C0396ae.B(U4, c0348Ud);
        boolean z8 = true;
        if (B4 || !z5) {
            z6 = U4;
        } else {
            z6 = U4;
            z8 = false;
        }
        InterfaceC0051a interfaceC0051a = B4 ? null : c0396ae.f8145s;
        C0323Pd c0323Pd = z6 ? null : new C0323Pd(c0348Ud, c0396ae.f8146t);
        boolean z9 = z8;
        Y7 y7 = c0396ae.f8149w;
        boolean z10 = false;
        C0323Pd c0323Pd2 = c0323Pd;
        Z7 z72 = c0396ae.f8150x;
        P1.l lVar = c0396ae.f8130H;
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = c0348Ud.f7165o;
        C0248Bc c0248Bc = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7501r;
        Sh sh = z9 ? null : c0396ae.y;
        C1434yp c1434yp = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7506w;
        if (c1434yp != null) {
            z10 = c1434yp.f11515i0;
        }
        if (z10) {
            binderC0489cm = c0396ae.f8139R;
            i5 = i4;
            str4 = str;
            str3 = str2;
            z7 = z4;
        } else {
            binderC0489cm = null;
            z7 = z4;
            i5 = i4;
            str3 = str2;
            str4 = str;
        }
        c0396ae.t0(new AdOverlayInfoParcel(interfaceC0051a, c0323Pd2, y7, z72, lVar, c0348Ud, z7, i5, str4, str3, c0248Bc, sh, binderC0489cm));
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z4 = true;
            if (!t()) {
                Q1.H h4 = this.f7490e0;
                h4.f1634b = true;
                if (h4.c) {
                    h4.c();
                }
            }
            boolean z5 = this.N;
            C0396ae c0396ae = this.f7464A;
            if (c0396ae == null || !c0396ae.e()) {
                z4 = z5;
            } else {
                if (!this.f7477O) {
                    this.f7464A.F();
                    this.f7464A.J();
                    this.f7477O = true;
                }
                X();
            }
            F0(z4);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0013, B:10:0x0017, B:15:0x0030, B:16:0x0033, B:17:0x0022, B:19:0x0028, B:20:0x0038, B:22:0x003f, B:24:0x0043, B:26:0x0049, B:28:0x004f, B:30:0x0059, B:31:0x0065), top: B:2:0x0001 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.t()     // Catch: java.lang.Throwable -> L36
            r1 = 0
            if (r0 != 0) goto L38
            Q1.H r0 = r4.f7490e0     // Catch: java.lang.Throwable -> L36
            r0.f1634b = r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r0.f1636f     // Catch: java.lang.Throwable -> L36
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L13
            goto L38
        L13:
            boolean r3 = r0.f1633a     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.f1635e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.Wd r3 = (com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0358Wd) r3     // Catch: java.lang.Throwable -> L36
            android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L22
            goto L2d
        L22:
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L2d
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> L36
            goto L2e
        L2d:
            r2 = 0
        L2e:
            if (r2 == 0) goto L33
            r2.removeOnGlobalLayoutListener(r3)     // Catch: java.lang.Throwable -> L36
        L33:
            r0.f1633a = r1     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r0 = move-exception
            goto L6a
        L38:
            super.onDetachedFromWindow()     // Catch: java.lang.Throwable -> L36
            boolean r0 = r4.f7477O     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L65
            com.google.android.gms.internal.ads.ae r0 = r4.f7464A     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L65
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L65
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L65
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L65
            com.google.android.gms.internal.ads.ae r0 = r4.f7464A     // Catch: java.lang.Throwable -> L36
            r0.F()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.ae r0 = r4.f7464A     // Catch: java.lang.Throwable -> L36
            r0.J()     // Catch: java.lang.Throwable -> L36
            r4.f7477O = r1     // Catch: java.lang.Throwable -> L36
        L65:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            r4.F0(r1)
            return
        L6a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0358Wd.onDetachedFromWindow():void");
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.q9)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            Q1.N n4 = N1.n.f1204A.c;
            Q1.N.o(getContext(), intent);
        } catch (ActivityNotFoundException e4) {
            Y9.m("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            N1.n.f1204A.f1209g.h("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (t()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean X4 = X();
        P1.a v02 = v0();
        if (v02 != null && X4 && v02.f1481A) {
            v02.f1481A = false;
            v02.f1494r.S();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8 A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c9, B:62:0x00d1, B:65:0x00cd, B:66:0x00d6, B:68:0x00dc, B:71:0x00e7, B:78:0x010b, B:80:0x0112, B:83:0x0119, B:85:0x012b, B:87:0x0139, B:90:0x0146, B:94:0x014b, B:96:0x0191, B:97:0x0194, B:99:0x019b, B:104:0x01a8, B:106:0x01ae, B:107:0x01b1, B:109:0x01b5, B:110:0x01be, B:116:0x01c9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c9, B:62:0x00d1, B:65:0x00cd, B:66:0x00d6, B:68:0x00dc, B:71:0x00e7, B:78:0x010b, B:80:0x0112, B:83:0x0119, B:85:0x012b, B:87:0x0139, B:90:0x0146, B:94:0x014b, B:96:0x0191, B:97:0x0194, B:99:0x019b, B:104:0x01a8, B:106:0x01ae, B:107:0x01b1, B:109:0x01b5, B:110:0x01be, B:116:0x01c9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014b A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c9, B:62:0x00d1, B:65:0x00cd, B:66:0x00d6, B:68:0x00dc, B:71:0x00e7, B:78:0x010b, B:80:0x0112, B:83:0x0119, B:85:0x012b, B:87:0x0139, B:90:0x0146, B:94:0x014b, B:96:0x0191, B:97:0x0194, B:99:0x019b, B:104:0x01a8, B:106:0x01ae, B:107:0x01b1, B:109:0x01b5, B:110:0x01be, B:116:0x01c9), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0358Wd.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void onPause() {
        if (t()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e4) {
            Y9.q("Could not pause webview.", e4);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void onResume() {
        if (t()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e4) {
            Y9.q("Could not resume webview.", e4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f7464A.e() || this.f7464A.b()) {
            I3 i32 = this.f7499p;
            if (i32 != null) {
                i32.f5531b.a(motionEvent);
            }
            A6 a6 = this.f7500q;
            if (a6 != null) {
                if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > a6.f3925a.getEventTime()) {
                    a6.f3925a = MotionEvent.obtain(motionEvent);
                } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > a6.f3926b.getEventTime()) {
                    a6.f3926b = MotionEvent.obtain(motionEvent);
                }
            }
        } else {
            synchronized (this) {
                try {
                    InterfaceC0725i7 interfaceC0725i7 = this.f7478P;
                    if (interfaceC0725i7 != null) {
                        interfaceC0725i7.D(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (t()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized BinderC0368Yd p() {
        return this.f7476M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void p0(C0887m c0887m) {
        this.f7467D = c0887m;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C0783ji q() {
        return this.f7486a0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void q0(String str, String str2) {
        C0396ae c0396ae = this.f7464A;
        BinderC0489cm binderC0489cm = c0396ae.f8139R;
        C0348Ud c0348Ud = c0396ae.f8141o;
        c0396ae.t0(new AdOverlayInfoParcel(c0348Ud, c0348Ud.f7165o.f7501r, str, str2, binderC0489cm));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void r0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void s() {
        P1.a v02 = v0();
        if (v02 != null) {
            v02.f1501z.f1513p = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void s0(ViewTreeObserverOnGlobalLayoutListenerC1042pj viewTreeObserverOnGlobalLayoutListenerC1042pj) {
        this.f7479Q = viewTreeObserverOnGlobalLayoutListenerC1042pj;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C0396ae) {
            this.f7464A = (C0396ae) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (t()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e4) {
            Y9.q("Could not stop loading webview.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized boolean t() {
        return this.f7470G;
    }

    public final synchronized void t0() {
        try {
            if (!this.f7472I) {
                setLayerType(1, null);
            }
            this.f7472I = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void u() {
        C0396ae c0396ae = this.f7464A;
        if (c0396ae != null) {
            c0396ae.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized String u0() {
        Ap ap = this.f7507x;
        if (ap == null) {
            return null;
        }
        return ap.f3998b;
    }

    @Override // N1.i
    public final synchronized void v() {
        N1.i iVar = this.f7502s;
        if (iVar != null) {
            iVar.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized P1.a v0() {
        return this.f7465B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized boolean w() {
        return this.f7469F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void w0(boolean z4, int i4, String str, boolean z5, boolean z6) {
        boolean z7;
        BinderC0489cm binderC0489cm;
        int i5;
        boolean z8;
        C0248Bc c0248Bc;
        String str2;
        C0396ae c0396ae = this.f7464A;
        C0348Ud c0348Ud = c0396ae.f8141o;
        boolean U4 = c0348Ud.f7165o.U();
        boolean B4 = C0396ae.B(U4, c0348Ud);
        boolean z9 = true;
        if (B4 || !z5) {
            z7 = U4;
        } else {
            z7 = U4;
            z9 = false;
        }
        InterfaceC0051a interfaceC0051a = B4 ? null : c0396ae.f8145s;
        C0323Pd c0323Pd = z7 ? null : new C0323Pd(c0348Ud, c0396ae.f8146t);
        boolean z10 = z9;
        Y7 y7 = c0396ae.f8149w;
        boolean z11 = false;
        C0323Pd c0323Pd2 = c0323Pd;
        Z7 z72 = c0396ae.f8150x;
        P1.l lVar = c0396ae.f8130H;
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = c0348Ud.f7165o;
        C0248Bc c0248Bc2 = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7501r;
        Sh sh = z10 ? null : c0396ae.y;
        C1434yp c1434yp = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7506w;
        if (c1434yp != null) {
            z11 = c1434yp.f11515i0;
        }
        if (z11) {
            binderC0489cm = c0396ae.f8139R;
            str2 = str;
            z8 = z6;
            c0248Bc = c0248Bc2;
            i5 = i4;
        } else {
            binderC0489cm = null;
            i5 = i4;
            z8 = z6;
            c0248Bc = c0248Bc2;
            str2 = str;
        }
        c0396ae.t0(new AdOverlayInfoParcel(interfaceC0051a, c0323Pd2, y7, z72, lVar, c0348Ud, z4, i5, str2, c0248Bc, sh, binderC0489cm, z8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C1434yp x() {
        return this.f7506w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void x0(C1434yp c1434yp, Ap ap) {
        this.f7506w = c1434yp;
        this.f7507x = ap;
    }

    public final synchronized void y() {
        Q1.I.w("Destroying WebView!");
        n0();
        Q1.N.f1668k.post(new D3(16, this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized void y0(boolean z4) {
        try {
            boolean z5 = this.f7471H;
            this.f7471H = z4;
            a0();
            if (z4 != z5) {
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10123K)).booleanValue()) {
                    if (!this.f7467D.b()) {
                    }
                }
                try {
                    c("onStateChanged", new JSONObject().put("state", true != z4 ? "default" : "expanded"));
                } catch (JSONException e4) {
                    Y9.q("Error occurred while dispatching state change.", e4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void z(P1.b bVar, boolean z4) {
        this.f7464A.n0(bVar, z4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final synchronized boolean z0() {
        return this.f7474K;
    }
}
