package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import c3.InterfaceFutureC0239a;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ud, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348Ud extends FrameLayout implements InterfaceC0308Md {

    /* renamed from: o, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0358Wd f7165o;

    /* renamed from: p, reason: collision with root package name */
    public final C0326Qb f7166p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f7167q;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.Qb, java.lang.Object] */
    public C0348Ud(ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd) {
        super(viewTreeObserverOnGlobalLayoutListenerC0358Wd.getContext());
        this.f7167q = new AtomicBoolean();
        this.f7165o = viewTreeObserverOnGlobalLayoutListenerC0358Wd;
        Context context = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7498o.c;
        ?? obj = new Object();
        obj.f6659o = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        obj.f6661q = this;
        obj.f6660p = this;
        obj.f6662r = null;
        this.f7166p = obj;
        addView(viewTreeObserverOnGlobalLayoutListenerC0358Wd);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void A(Context context) {
        this.f7165o.A(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void A0(String str, InterfaceC0597f8 interfaceC0597f8) {
        this.f7165o.A0(str, interfaceC0597f8);
    }

    public final void B() {
        float f4;
        HashMap hashMap = new HashMap(3);
        N1.n nVar = N1.n.f1204A;
        hashMap.put("app_muted", String.valueOf(nVar.f1210h.d()));
        hashMap.put("app_volume", String.valueOf(nVar.f1210h.a()));
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = this.f7165o;
        AudioManager audioManager = (AudioManager) viewTreeObserverOnGlobalLayoutListenerC0358Wd.getContext().getSystemService("audio");
        if (audioManager != null) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume != 0) {
                f4 = streamVolume / streamMaxVolume;
                hashMap.put("device_volume", String.valueOf(f4));
                viewTreeObserverOnGlobalLayoutListenerC0358Wd.b("volume", hashMap);
            }
        }
        f4 = 0.0f;
        hashMap.put("device_volume", String.valueOf(f4));
        viewTreeObserverOnGlobalLayoutListenerC0358Wd.b("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void B0(int i4, boolean z4, boolean z5) {
        this.f7165o.B0(i4, z4, z5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void C(int i4) {
        C0337Sc c0337Sc = (C0337Sc) this.f7166p.f6662r;
        if (c0337Sc != null) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10312z)).booleanValue()) {
                c0337Sc.f6974p.setBackgroundColor(i4);
                c0337Sc.f6975q.setBackgroundColor(i4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void C0(N4 n4) {
        this.f7165o.C0(n4);
    }

    @Override // O1.InterfaceC0051a
    public final void D() {
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = this.f7165o;
        if (viewTreeObserverOnGlobalLayoutListenerC0358Wd != null) {
            viewTreeObserverOnGlobalLayoutListenerC0358Wd.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void D0(String str, InterfaceC0597f8 interfaceC0597f8) {
        this.f7165o.D0(str, interfaceC0597f8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final P1.a E() {
        return this.f7165o.E();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void E0(int i4) {
        this.f7165o.E0(i4);
    }

    public final void F(boolean z4) {
        this.f7165o.f7464A.f8137P = z4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final N4 G() {
        return this.f7165o.G();
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void G0() {
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = this.f7165o;
        if (viewTreeObserverOnGlobalLayoutListenerC0358Wd != null) {
            viewTreeObserverOnGlobalLayoutListenerC0358Wd.G0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C0396ae H() {
        return this.f7165o.f7464A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void H0(P1.a aVar) {
        this.f7165o.H0(aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void I(int i4) {
        this.f7165o.I(i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final String I0() {
        return this.f7165o.I0();
    }

    public final void J(String str, String str2) {
        this.f7165o.M0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void K(BinderC0368Yd binderC0368Yd) {
        this.f7165o.K(binderC0368Yd);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final View L() {
        return this;
    }

    public final void M() {
        TextView textView = new TextView(getContext());
        N1.n nVar = N1.n.f1204A;
        Q1.N n4 = nVar.c;
        Resources a4 = nVar.f1209g.a();
        textView.setText(a4 != null ? a4.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void N0(boolean z4, long j4) {
        this.f7165o.N0(z4, j4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void O0(int i4) {
        this.f7165o.O0(i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C0887m P() {
        return this.f7165o.P();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void P0(boolean z4) {
        this.f7165o.P0(z4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void Q(boolean z4) {
        this.f7165o.Q(z4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void Q0(P1.a aVar) {
        this.f7165o.Q0(aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final InterfaceC0725i7 R() {
        return this.f7165o.R();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void S() {
        this.f7165o.S();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void T(Pq pq) {
        this.f7165o.T(pq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final boolean U() {
        return this.f7165o.U();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void V(InterfaceC0725i7 interfaceC0725i7) {
        this.f7165o.V(interfaceC0725i7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final Ap W() {
        return this.f7165o.f7507x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final boolean Y() {
        return this.f7165o.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void Z() {
        this.f7165o.Z();
    }

    @Override // N1.i
    public final void a() {
        this.f7165o.a();
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final void b(String str, Map map) {
        this.f7165o.b(str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final Pq b0() {
        return this.f7165o.b0();
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final void c(String str, JSONObject jSONObject) {
        this.f7165o.c(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void c0(String str, AbstractC1250ud abstractC1250ud) {
        this.f7165o.c0(str, abstractC1250ud);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final boolean canGoBack() {
        return this.f7165o.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final int d() {
        return this.f7165o.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final I3 d0() {
        return this.f7165o.f7499p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void destroy() {
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = this.f7165o;
        Pq b02 = viewTreeObserverOnGlobalLayoutListenerC0358Wd.b0();
        if (b02 == null) {
            viewTreeObserverOnGlobalLayoutListenerC0358Wd.destroy();
            return;
        }
        Q1.J j4 = Q1.N.f1668k;
        j4.post(new RunnableC0338Sd(b02, 0));
        j4.postDelayed(new RunnableC0343Td(viewTreeObserverOnGlobalLayoutListenerC0358Wd, 0), ((Integer) O1.r.d.c.a(AbstractC1066q6.s4)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final String e0() {
        return this.f7165o.e0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final int f() {
        return ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10266o3)).booleanValue() ? this.f7165o.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void f0(boolean z4) {
        this.f7165o.f0(z4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final Activity g() {
        return this.f7165o.f7498o.f8621a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final Context g0() {
        return this.f7165o.f7498o.c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void goBack() {
        this.f7165o.goBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final int h() {
        return ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10266o3)).booleanValue() ? this.f7165o.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final InterfaceFutureC0239a h0() {
        return this.f7165o.h0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final AbstractC1250ud i(String str) {
        return this.f7165o.i(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void i0(boolean z4) {
        this.f7165o.i0(z4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C1510e1 j() {
        return this.f7165o.f7503t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1450z4
    public final void j0(C1407y4 c1407y4) {
        this.f7165o.j0(c1407y4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C1237u6 k() {
        return this.f7165o.f7484V;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void k0() {
        this.f7165o.k0();
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void l(String str, JSONObject jSONObject) {
        this.f7165o.R0(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final boolean l0() {
        return this.f7167q.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void loadData(String str, String str2, String str3) {
        this.f7165o.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f7165o.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void loadUrl(String str) {
        this.f7165o.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C0248Bc m() {
        return this.f7165o.f7501r;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final WebView m0() {
        return this.f7165o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C0326Qb n() {
        return this.f7166p;
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void o(String str) {
        this.f7165o.M(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void o0(boolean z4, int i4, String str, String str2, boolean z5) {
        this.f7165o.o0(z4, i4, str, str2, z5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void onPause() {
        AbstractC0322Pc abstractC0322Pc;
        C0326Qb c0326Qb = this.f7166p;
        c0326Qb.getClass();
        h2.y.d("onPause must be called from the UI thread.");
        C0337Sc c0337Sc = (C0337Sc) c0326Qb.f6662r;
        if (c0337Sc != null && (abstractC0322Pc = c0337Sc.f6979u) != null) {
            abstractC0322Pc.t();
        }
        this.f7165o.onPause();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void onResume() {
        this.f7165o.onResume();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final BinderC0368Yd p() {
        return this.f7165o.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void p0(C0887m c0887m) {
        this.f7165o.p0(c0887m);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C0783ji q() {
        return this.f7165o.f7486a0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void q0(String str, String str2) {
        this.f7165o.q0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void r0() {
        setBackgroundColor(0);
        this.f7165o.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void s() {
        this.f7165o.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void s0(ViewTreeObserverOnGlobalLayoutListenerC1042pj viewTreeObserverOnGlobalLayoutListenerC1042pj) {
        this.f7165o.s0(viewTreeObserverOnGlobalLayoutListenerC1042pj);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7165o.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f7165o.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f7165o.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f7165o.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final boolean t() {
        return this.f7165o.t();
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void u() {
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = this.f7165o;
        if (viewTreeObserverOnGlobalLayoutListenerC0358Wd != null) {
            viewTreeObserverOnGlobalLayoutListenerC0358Wd.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final String u0() {
        return this.f7165o.u0();
    }

    @Override // N1.i
    public final void v() {
        this.f7165o.v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final P1.a v0() {
        return this.f7165o.v0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final boolean w() {
        return this.f7165o.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void w0(boolean z4, int i4, String str, boolean z5, boolean z6) {
        this.f7165o.w0(z4, i4, str, z5, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final C1434yp x() {
        return this.f7165o.f7506w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void x0(C1434yp c1434yp, Ap ap) {
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = this.f7165o;
        viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7506w = c1434yp;
        viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7507x = ap;
    }

    public final void y() {
        C0326Qb c0326Qb = this.f7166p;
        c0326Qb.getClass();
        h2.y.d("onDestroy must be called from the UI thread.");
        C0337Sc c0337Sc = (C0337Sc) c0326Qb.f6662r;
        if (c0337Sc != null) {
            c0337Sc.f6977s.a();
            AbstractC0322Pc abstractC0322Pc = c0337Sc.f6979u;
            if (abstractC0322Pc != null) {
                abstractC0322Pc.y();
            }
            c0337Sc.b();
            ((C0348Ud) c0326Qb.f6661q).removeView((C0337Sc) c0326Qb.f6662r);
            c0326Qb.f6662r = null;
        }
        this.f7165o.y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void y0(boolean z4) {
        this.f7165o.y0(z4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final void z(P1.b bVar, boolean z4) {
        this.f7165o.z(bVar, z4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0308Md
    public final boolean z0() {
        return this.f7165o.z0();
    }
}
