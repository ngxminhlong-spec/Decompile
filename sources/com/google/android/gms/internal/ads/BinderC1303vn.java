package com.google.android.gms.internal.ads;

import O1.InterfaceC0074l0;
import O1.InterfaceC0084q0;
import O1.InterfaceC0089t0;
import O1.InterfaceC0090u;
import O1.InterfaceC0096x;
import O1.InterfaceC0100z;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1303vn extends O1.I {

    /* renamed from: o, reason: collision with root package name */
    public final Context f11058o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0096x f11059p;

    /* renamed from: q, reason: collision with root package name */
    public final Jp f11060q;

    /* renamed from: r, reason: collision with root package name */
    public final Gf f11061r;

    /* renamed from: s, reason: collision with root package name */
    public final FrameLayout f11062s;

    /* renamed from: t, reason: collision with root package name */
    public final C0658gk f11063t;

    public BinderC1303vn(Context context, InterfaceC0096x interfaceC0096x, Jp jp, Gf gf, C0658gk c0658gk) {
        this.f11058o = context;
        this.f11059p = interfaceC0096x;
        this.f11060q = jp;
        this.f11061r = gf;
        this.f11063t = c0658gk;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = gf.f5304k;
        Q1.N n4 = N1.n.f1204A.c;
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(h().f1324q);
        frameLayout.setMinimumWidth(h().f1327t);
        this.f11062s = frameLayout;
    }

    @Override // O1.J
    public final void B3(boolean z4) {
        Y9.r("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // O1.J
    public final String C() {
        return this.f11060q.f5911f;
    }

    @Override // O1.J
    public final String D() {
        return this.f11061r.f7861f.f5059o;
    }

    @Override // O1.J
    public final void E() {
    }

    @Override // O1.J
    public final void E3(U4 u4) {
    }

    @Override // O1.J
    public final void G() {
        this.f11061r.g();
    }

    @Override // O1.J
    public final boolean H2() {
        return false;
    }

    @Override // O1.J
    public final void H3(O1.U u2) {
    }

    @Override // O1.J
    public final void O2(O1.X0 x02) {
        h2.y.d("setAdSize must be called on the main UI thread.");
        Gf gf = this.f11061r;
        if (gf != null) {
            gf.h(this.f11062s, x02);
        }
    }

    @Override // O1.J
    public final void R() {
    }

    @Override // O1.J
    public final void S() {
    }

    @Override // O1.J
    public final void U0(C0735ib c0735ib) {
    }

    @Override // O1.J
    public final void W0(InterfaceC1812a interfaceC1812a) {
    }

    @Override // O1.J
    public final void W1() {
    }

    @Override // O1.J
    public final void Z1(C1409y6 c1409y6) {
        Y9.r("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // O1.J
    public final void b0() {
    }

    @Override // O1.J
    public final void f3(InterfaceC0074l0 interfaceC0074l0) {
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.N9)).booleanValue()) {
            Y9.r("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        Bn bn = this.f11060q.c;
        if (bn != null) {
            try {
                if (!interfaceC0074l0.d()) {
                    this.f11063t.b();
                }
            } catch (RemoteException e4) {
                Y9.o("Error in making CSI ping for reporting paid event callback", e4);
            }
            bn.f4176q.set(interfaceC0074l0);
        }
    }

    @Override // O1.J
    public final InterfaceC0096x g() {
        return this.f11059p;
    }

    @Override // O1.J
    public final void g0() {
        Y9.r("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // O1.J
    public final void g2(boolean z4) {
    }

    @Override // O1.J
    public final O1.X0 h() {
        h2.y.d("getAdSize must be called on the main UI thread.");
        return Zf.c(this.f11058o, Collections.singletonList(this.f11061r.e()));
    }

    @Override // O1.J
    public final void h0() {
    }

    @Override // O1.J
    public final boolean h2(O1.U0 u02) {
        Y9.r("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // O1.J
    public final Bundle i() {
        Y9.r("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // O1.J
    public final O1.O j() {
        return this.f11060q.f5919n;
    }

    @Override // O1.J
    public final InterfaceC0084q0 k() {
        return this.f11061r.f7861f;
    }

    @Override // O1.J
    public final InterfaceC0089t0 l() {
        return this.f11061r.d();
    }

    @Override // O1.J
    public final InterfaceC1812a m() {
        return new BinderC1813b(this.f11062s);
    }

    @Override // O1.J
    public final void n1() {
        h2.y.d("destroy must be called on the main UI thread.");
        Ug ug = this.f11061r.c;
        ug.getClass();
        ug.n1(new C0894m6(null, 2));
    }

    @Override // O1.J
    public final void n2(O1.a1 a1Var) {
    }

    @Override // O1.J
    public final boolean p3() {
        return false;
    }

    @Override // O1.J
    public final void q3(InterfaceC0090u interfaceC0090u) {
        Y9.r("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // O1.J
    public final void r1(O1.O o4) {
        Bn bn = this.f11060q.c;
        if (bn != null) {
            bn.v(o4);
        }
    }

    @Override // O1.J
    public final void t0(O1.U0 u02, InterfaceC0100z interfaceC0100z) {
    }

    @Override // O1.J
    public final void t3(O1.R0 r02) {
        Y9.r("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // O1.J
    public final void w() {
        h2.y.d("destroy must be called on the main UI thread.");
        Ug ug = this.f11061r.c;
        ug.getClass();
        ug.n1(new C0894m6(null, 3));
    }

    @Override // O1.J
    public final void w3(InterfaceC0096x interfaceC0096x) {
        Y9.r("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // O1.J
    public final String x() {
        return this.f11061r.f7861f.f5059o;
    }

    @Override // O1.J
    public final void z() {
        h2.y.d("destroy must be called on the main UI thread.");
        Ug ug = this.f11061r.c;
        ug.getClass();
        ug.n1(new C0536dr(null, 2));
    }

    @Override // O1.J
    public final void z2(O1.S s4) {
        Y9.r("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }
}
