package N1;

import C0.ViewOnTouchListenerC0007g;
import O1.I;
import O1.InterfaceC0074l0;
import O1.InterfaceC0084q0;
import O1.InterfaceC0089t0;
import O1.InterfaceC0090u;
import O1.InterfaceC0096x;
import O1.InterfaceC0100z;
import O1.O;
import O1.R0;
import O1.S;
import O1.U;
import O1.U0;
import O1.X0;
import O1.a1;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import c3.InterfaceFutureC0239a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0735ib;
import com.google.android.gms.internal.ads.C1409y6;
import com.google.android.gms.internal.ads.C6;
import com.google.android.gms.internal.ads.I3;
import com.google.android.gms.internal.ads.U4;
import h2.y;
import java.util.TreeMap;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m extends I {

    /* renamed from: o, reason: collision with root package name */
    public final C0248Bc f1195o;

    /* renamed from: p, reason: collision with root package name */
    public final X0 f1196p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceFutureC0239a f1197q = AbstractC0266Ec.f4897a.b(new B0.l(1, this));

    /* renamed from: r, reason: collision with root package name */
    public final Context f1198r;

    /* renamed from: s, reason: collision with root package name */
    public final l f1199s;

    /* renamed from: t, reason: collision with root package name */
    public WebView f1200t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0096x f1201u;

    /* renamed from: v, reason: collision with root package name */
    public I3 f1202v;

    /* renamed from: w, reason: collision with root package name */
    public AsyncTask f1203w;

    public m(Context context, X0 x02, String str, C0248Bc c0248Bc) {
        this.f1198r = context;
        this.f1195o = c0248Bc;
        this.f1196p = x02;
        this.f1200t = new WebView(context);
        this.f1199s = new l(context, str);
        K3(0);
        this.f1200t.setVerticalScrollBarEnabled(false);
        this.f1200t.getSettings().setJavaScriptEnabled(true);
        this.f1200t.setWebViewClient(new j(0, this));
        this.f1200t.setOnTouchListener(new ViewOnTouchListenerC0007g(1, this));
    }

    @Override // O1.J
    public final void B3(boolean z4) {
    }

    @Override // O1.J
    public final String C() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // O1.J
    public final String D() {
        return null;
    }

    @Override // O1.J
    public final void E() {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void E3(U4 u4) {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void G() {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final boolean H2() {
        return false;
    }

    @Override // O1.J
    public final void H3(U u2) {
    }

    public final void K3(int i4) {
        if (this.f1200t == null) {
            return;
        }
        this.f1200t.setLayoutParams(new ViewGroup.LayoutParams(-1, i4));
    }

    @Override // O1.J
    public final void O2(X0 x02) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // O1.J
    public final void R() {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void S() {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void U0(C0735ib c0735ib) {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void W0(InterfaceC1812a interfaceC1812a) {
    }

    @Override // O1.J
    public final void W1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void Z1(C1409y6 c1409y6) {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void b0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void f3(InterfaceC0074l0 interfaceC0074l0) {
    }

    @Override // O1.J
    public final InterfaceC0096x g() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // O1.J
    public final void g0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void g2(boolean z4) {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final X0 h() {
        return this.f1196p;
    }

    @Override // O1.J
    public final void h0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final boolean h2(U0 u02) {
        y.j(this.f1200t, "This Search Ad has already been torn down");
        l lVar = this.f1199s;
        TreeMap treeMap = (TreeMap) lVar.f1194u;
        lVar.f1191r = u02.f1315x.f1286o;
        Bundle bundle = u02.f1293A;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) C6.c.r();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    lVar.f1192s = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            treeMap.put("SDKVersion", this.f1195o.f4084o);
            if (((Boolean) C6.f4401a.r()).booleanValue()) {
                Bundle F2 = AbstractC1895f.F((Context) lVar.f1189p, (String) C6.f4402b.r());
                for (String str3 : F2.keySet()) {
                    treeMap.put(str3, F2.get(str3).toString());
                }
            }
        }
        this.f1203w = new k(this).execute(new Void[0]);
        return true;
    }

    @Override // O1.J
    public final Bundle i() {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final O j() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // O1.J
    public final InterfaceC0084q0 k() {
        return null;
    }

    @Override // O1.J
    public final InterfaceC0089t0 l() {
        return null;
    }

    @Override // O1.J
    public final InterfaceC1812a m() {
        y.d("getAdFrame must be called on the main UI thread.");
        return new BinderC1813b(this.f1200t);
    }

    @Override // O1.J
    public final void n1() {
        y.d("pause must be called on the main UI thread.");
    }

    @Override // O1.J
    public final void n2(a1 a1Var) {
        throw new IllegalStateException("Unused method");
    }

    public final String p() {
        String str = (String) this.f1199s.f1192s;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return U.a.k("https://", str, (String) C6.d.r());
    }

    @Override // O1.J
    public final boolean p3() {
        return false;
    }

    @Override // O1.J
    public final void q3(InterfaceC0090u interfaceC0090u) {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void r1(O o4) {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void t0(U0 u02, InterfaceC0100z interfaceC0100z) {
    }

    @Override // O1.J
    public final void t3(R0 r02) {
        throw new IllegalStateException("Unused method");
    }

    @Override // O1.J
    public final void w() {
        y.d("destroy must be called on the main UI thread.");
        this.f1203w.cancel(true);
        this.f1197q.cancel(true);
        this.f1200t.destroy();
        this.f1200t = null;
    }

    @Override // O1.J
    public final void w3(InterfaceC0096x interfaceC0096x) {
        this.f1201u = interfaceC0096x;
    }

    @Override // O1.J
    public final String x() {
        return null;
    }

    @Override // O1.J
    public final void z() {
        y.d("resume must be called on the main UI thread.");
    }

    @Override // O1.J
    public final void z2(S s4) {
        throw new IllegalStateException("Unused method");
    }
}
