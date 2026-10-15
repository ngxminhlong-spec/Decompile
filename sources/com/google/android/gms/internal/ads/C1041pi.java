package com.google.android.gms.internal.ads;

import O1.C0056c0;
import O1.C0081p;
import O1.InterfaceC0060e0;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l2.AbstractC1799b;
import l2.C1798a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041pi implements Fi {

    /* renamed from: A, reason: collision with root package name */
    public C0056c0 f10005A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10006a;

    /* renamed from: b, reason: collision with root package name */
    public final Gi f10007b;
    public final JSONObject c;
    public final Aj d;

    /* renamed from: e, reason: collision with root package name */
    public final Ci f10008e;

    /* renamed from: f, reason: collision with root package name */
    public final I3 f10009f;

    /* renamed from: g, reason: collision with root package name */
    public final Qg f10010g;

    /* renamed from: h, reason: collision with root package name */
    public final Gg f10011h;

    /* renamed from: i, reason: collision with root package name */
    public final Rh f10012i;

    /* renamed from: j, reason: collision with root package name */
    public final C1434yp f10013j;

    /* renamed from: k, reason: collision with root package name */
    public final C0248Bc f10014k;

    /* renamed from: l, reason: collision with root package name */
    public final Jp f10015l;

    /* renamed from: m, reason: collision with root package name */
    public final C1209tf f10016m;

    /* renamed from: n, reason: collision with root package name */
    public final Mi f10017n;

    /* renamed from: o, reason: collision with root package name */
    public final C1798a f10018o;

    /* renamed from: p, reason: collision with root package name */
    public final Qh f10019p;

    /* renamed from: q, reason: collision with root package name */
    public final Oq f10020q;

    /* renamed from: r, reason: collision with root package name */
    public final Eq f10021r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10023t;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10022s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10024u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10025v = false;

    /* renamed from: w, reason: collision with root package name */
    public Point f10026w = new Point();

    /* renamed from: x, reason: collision with root package name */
    public Point f10027x = new Point();
    public long y = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f10028z = 0;

    public C1041pi(Context context, Gi gi, JSONObject jSONObject, Aj aj, Ci ci, I3 i32, Qg qg, Gg gg, Rh rh, C1434yp c1434yp, C0248Bc c0248Bc, Jp jp, C1209tf c1209tf, Mi mi, C1798a c1798a, Qh qh, Oq oq, Eq eq) {
        this.f10006a = context;
        this.f10007b = gi;
        this.c = jSONObject;
        this.d = aj;
        this.f10008e = ci;
        this.f10009f = i32;
        this.f10010g = qg;
        this.f10011h = gg;
        this.f10012i = rh;
        this.f10013j = c1434yp;
        this.f10014k = c0248Bc;
        this.f10015l = jp;
        this.f10016m = c1209tf;
        this.f10017n = mi;
        this.f10018o = c1798a;
        this.f10019p = qh;
        this.f10020q = oq;
        this.f10021r = eq;
    }

    public final void A(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z4, boolean z5) {
        List list;
        String str2;
        C1798a c1798a = this.f10018o;
        Gi gi = this.f10007b;
        JSONObject jSONObject7 = this.c;
        Ci ci = this.f10008e;
        h2.y.d("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            jSONObject8.put("has_custom_click_handler", ((G7) gi.f5320g.get(ci.a())) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", ci.D());
            jSONObject9.put("view_aware_api_used", z4);
            C0766j7 c0766j7 = this.f10015l.f5914i;
            jSONObject9.put("custom_mute_requested", c0766j7 != null && c0766j7.f9131u);
            synchronized (ci) {
                list = ci.f4505f;
            }
            jSONObject9.put("custom_mute_enabled", (list.isEmpty() || ci.K() == null) ? false : true);
            if (this.f10017n.f6260q != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            c1798a.getClass();
            jSONObject9.put("timestamp", System.currentTimeMillis());
            if (this.f10025v && this.c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z5) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ((G7) gi.f5320g.get(ci.a())) != null);
            try {
                JSONObject optJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f10009f.f5531b.g(this.f10006a, optJSONObject.optString("click_string"), view);
            } catch (Exception e4) {
                Y9.q("Exception obtaining click signals", e4);
                str2 = null;
            }
            jSONObject9.put("click_signals", str2);
            C0937n6 c0937n6 = AbstractC1066q6.f10173U3;
            O1.r rVar = O1.r.d;
            if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                jSONObject9.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) rVar.c.a(AbstractC1066q6.z7)).booleanValue() && AbstractC1799b.g()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) rVar.c.a(AbstractC1066q6.A7)).booleanValue() && AbstractC1799b.g()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            c1798a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", currentTimeMillis - this.y);
            jSONObject10.put("time_from_last_touch", currentTimeMillis - this.f10028z);
            jSONObject8.put("touch_signal", jSONObject10);
            AbstractC1230u.k(this.d.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick");
        } catch (JSONException e5) {
            Y9.q("Unable to create click JSON.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void C() {
        x(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final boolean G() {
        if (b() == 0) {
            return true;
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.J9)).booleanValue()) {
            return this.f10015l.f5914i.f9134x;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void N(String str) {
        A(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void a(Bundle bundle) {
        if (bundle == null) {
            Y9.m("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!w("touch_reporting")) {
            Y9.p("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f10009f.f5531b.f((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final int b() {
        Jp jp = this.f10015l;
        if (jp.f5914i == null) {
            return 0;
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.J9)).booleanValue()) {
            return jp.f5914i.f9133w;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void c(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.f10026w = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.f10018o.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.f10028z = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.y = currentTimeMillis;
            this.f10027x = this.f10026w;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f10026w;
        obtain.setLocation(point.x, point.y);
        this.f10009f.f5531b.a(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void d(C0056c0 c0056c0) {
        this.f10005A = c0056c0;
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final JSONObject e(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f10006a;
        JSONObject b02 = com.google.android.gms.internal.play_billing.B.b0(context, map, map2, view, scaleType);
        JSONObject e02 = com.google.android.gms.internal.play_billing.B.e0(context, view);
        JSONObject d02 = com.google.android.gms.internal.play_billing.B.d0(view);
        JSONObject c02 = com.google.android.gms.internal.play_billing.B.c0(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", b02);
            jSONObject.put("ad_view_signal", e02);
            jSONObject.put("scroll_view_signal", d02);
            jSONObject.put("lock_screen_signal", c02);
            return jSONObject;
        } catch (JSONException e4) {
            Y9.q("Unable to create native ad view signals JSON.", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void f() {
        View view;
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            Mi mi = this.f10017n;
            if (mi.f6260q == null || mi.f6263t == null) {
                return;
            }
            mi.f6262s = null;
            mi.f6263t = null;
            WeakReference weakReference = mi.f6264u;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                mi.f6264u = null;
            }
            try {
                R7 r7 = mi.f6260q;
                r7.G1(r7.Q(), 2);
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void g() {
        Aj aj = this.d;
        synchronized (aj) {
            C1310vu c1310vu = aj.f3983m;
            if (c1310vu == null) {
                return;
            }
            C0347Uc c0347Uc = new C0347Uc(5, (byte) 0);
            c1310vu.a(new Nu(0, c1310vu, c0347Uc), aj.f3976f);
            aj.f3983m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // com.google.android.gms.internal.ads.Fi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.view.View r17, android.view.View r18, java.util.Map r19, java.util.Map r20, boolean r21, android.widget.ImageView.ScaleType r22, int r23) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1041pi.h(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean, android.widget.ImageView$ScaleType, int):void");
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void i(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f10006a;
        x(com.google.android.gms.internal.play_billing.B.e0(context, view), com.google.android.gms.internal.play_billing.B.b0(context, map, map2, view, scaleType), com.google.android.gms.internal.play_billing.B.d0(view), com.google.android.gms.internal.play_billing.B.c0(context, view), u(view), null, com.google.android.gms.internal.play_billing.B.f0(context, this.f10013j));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    @Override // com.google.android.gms.internal.ads.Fi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.os.Bundle r11) {
        /*
            r10 = this;
            java.lang.String r0 = "impression_reporting"
            boolean r0 = r10.w(r0)
            if (r0 != 0) goto Lf
            java.lang.String r11 = "The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events."
            com.google.android.gms.internal.ads.Y9.p(r11)
            r11 = 0
            return r11
        Lf:
            O1.p r0 = O1.C0081p.f1374f
            com.google.android.gms.internal.ads.wc r0 = r0.f1375a
            r0.getClass()
            r1 = 0
            if (r11 == 0) goto L26
            org.json.JSONObject r11 = r0.f(r11)     // Catch: org.json.JSONException -> L1f
            r8 = r11
            goto L27
        L1f:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = "Error converting Bundle to JSON"
            com.google.android.gms.internal.ads.Y9.q(r0, r11)
        L26:
            r8 = r1
        L27:
            com.google.android.gms.internal.ads.n6 r11 = com.google.android.gms.internal.ads.AbstractC1066q6.F9
            O1.r r0 = O1.r.d
            com.google.android.gms.internal.ads.p6 r0 = r0.c
            java.lang.Object r11 = r0.a(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L3d
            java.lang.String r1 = r10.u(r1)
        L3d:
            r7 = r1
            r6 = 0
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r10
            boolean r11 = r2.x(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1041pi.j(android.os.Bundle):boolean");
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void k(View view) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            Y9.s("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            Mi mi = this.f10017n;
            view.setOnClickListener(mi);
            view.setClickable(true);
            mi.f6264u = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void l(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f10026w = new Point();
        this.f10027x = new Point();
        if (!this.f10023t) {
            this.f10019p.r1(view);
            this.f10023t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        C1209tf c1209tf = this.f10016m;
        c1209tf.getClass();
        c1209tf.f10710x = new WeakReference(this);
        boolean g02 = com.google.android.gms.internal.play_billing.B.g0(this.f10014k.f4086q);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (g02) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (g02) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void m(View view) {
        this.f10026w = new Point();
        this.f10027x = new Point();
        if (view != null) {
            Qh qh = this.f10019p;
            synchronized (qh) {
                if (qh.f6672q.containsKey(view)) {
                    ((A4) qh.f6672q.get(view)).f3924z.remove(qh);
                    qh.f6672q.remove(view);
                }
            }
        }
        this.f10023t = false;
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void n(InterfaceC0060e0 interfaceC0060e0) {
        O1.F0 f02;
        Eq eq = this.f10021r;
        Oq oq = this.f10020q;
        try {
            if (this.f10024u) {
                return;
            }
            if (interfaceC0060e0 == null) {
                Ci ci = this.f10008e;
                synchronized (ci) {
                    f02 = ci.f4506g;
                }
                if (f02 != null) {
                    this.f10024u = true;
                    oq.a(ci.K().f1274p, eq);
                    y();
                    return;
                }
            }
            this.f10024u = true;
            oq.a(interfaceC0060e0.d(), eq);
            y();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void o() {
        h2.y.d("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            AbstractC1230u.k(this.d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e4) {
            Y9.q("", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void p(R7 r7) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            Y9.s("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        Mi mi = this.f10017n;
        Aj aj = mi.f6258o;
        mi.f6260q = r7;
        C0469c8 c0469c8 = mi.f6261r;
        if (c0469c8 != null) {
            aj.d("/unconfirmedClick", c0469c8);
        }
        C0469c8 c0469c82 = new C0469c8(2, mi, r7);
        mi.f6261r = c0469c82;
        aj.c("/unconfirmedClick", c0469c82);
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final JSONObject q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject e4 = e(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f10025v && this.c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (e4 != null) {
                jSONObject.put("nas", e4);
            }
            return jSONObject;
        } catch (JSONException e5) {
            Y9.q("Unable to create native click meta data JSON.", e5);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void r(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType) {
        Context context = this.f10006a;
        JSONObject b02 = com.google.android.gms.internal.play_billing.B.b0(context, map, map2, view2, scaleType);
        JSONObject e02 = com.google.android.gms.internal.play_billing.B.e0(context, view2);
        JSONObject d02 = com.google.android.gms.internal.play_billing.B.d0(view2);
        JSONObject c02 = com.google.android.gms.internal.play_billing.B.c0(context, view2);
        String v4 = v(view, map);
        A(true == ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10209c3)).booleanValue() ? view2 : view, e02, b02, d02, c02, v4, com.google.android.gms.internal.play_billing.B.a0(v4, context, this.f10027x, this.f10026w), null, z4, false);
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void s(Bundle bundle) {
        if (bundle == null) {
            Y9.m("Click data is null. No click is reported.");
            return;
        }
        if (!w("click_reporting")) {
            Y9.p("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObject = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        C1335wc c1335wc = C0081p.f1374f.f1375a;
        c1335wc.getClass();
        try {
            jSONObject = c1335wc.f(bundle);
        } catch (JSONException e4) {
            Y9.q("Error converting Bundle to JSON", e4);
        }
        A(null, null, null, null, null, string, null, jSONObject, false, false);
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void t() {
        this.f10025v = true;
    }

    public final String u(View view) {
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10177V2)).booleanValue()) {
            return null;
        }
        try {
            return this.f10009f.f5531b.d(this.f10006a, view, null);
        } catch (Exception unused) {
            Y9.p("Exception getting data.");
            return null;
        }
    }

    public final String v(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int D4 = this.f10008e.D();
        if (D4 == 1) {
            return "1099";
        }
        if (D4 == 2) {
            return "2099";
        }
        if (D4 != 6) {
            return null;
        }
        return "3099";
    }

    public final boolean w(String str) {
        JSONObject optJSONObject = this.c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    public final boolean x(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z4) {
        Context context = this.f10006a;
        h2.y.d("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10177V2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z4);
            JSONObject jSONObject7 = new JSONObject();
            Q1.N n4 = N1.n.f1204A.c;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            try {
                int i4 = displayMetrics.widthPixels;
                C0081p c0081p = C0081p.f1374f;
                jSONObject7.put("width", c0081p.f1375a.d(context, i4));
                jSONObject7.put("height", c0081p.f1375a.d(context, displayMetrics.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            boolean booleanValue = ((Boolean) O1.r.d.c.a(AbstractC1066q6.v7)).booleanValue();
            Aj aj = this.d;
            if (booleanValue) {
                aj.c("/clickRecorded", new C0998oi(this, 1));
            } else {
                aj.c("/logScionEvent", new C0998oi(this, 0));
            }
            aj.c("/nativeImpression", new C0998oi(this, 2));
            AbstractC1230u.k(aj.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f10022s) {
                return true;
            }
            this.f10022s = N1.n.f1204A.f1215m.l(context, this.f10014k.f4084o, this.f10013j.f11477C.toString(), this.f10015l.f5911f);
            return true;
        } catch (JSONException e4) {
            Y9.q("Unable to create impression JSON.", e4);
            return false;
        }
    }

    public final void y() {
        try {
            C0056c0 c0056c0 = this.f10005A;
            if (c0056c0 != null) {
                c0056c0.G1(c0056c0.Q(), 1);
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final boolean z() {
        return this.c.optBoolean("allow_custom_click_gesture", false);
    }
}
