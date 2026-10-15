package com.google.android.gms.internal.ads;

import O1.C0097x0;
import W3.AbstractC0134m;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.RemoteException;
import android.security.NetworkSecurityPolicy;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c3.InterfaceFutureC0239a;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.GoPremiumLayout;
import com.google.android.gms.internal.play_billing.AbstractC1609e;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.gms.internal.play_billing.C1605c;
import com.google.android.gms.internal.play_billing.C1615h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import m2.AbstractC1806a;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import org.json.JSONException;
import org.json.JSONObject;
import z.AbstractC2123b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Nu implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6408o;

    /* renamed from: p, reason: collision with root package name */
    public Object f6409p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f6410q;

    public /* synthetic */ Nu(int i4, Object obj, Object obj2) {
        this.f6408o = i4;
        this.f6409p = obj;
        this.f6410q = obj2;
    }

    public /* synthetic */ Nu(C0.H h4, int i4) {
        this.f6408o = i4;
        this.f6410q = h4;
    }

    public /* synthetic */ Nu(Object obj, Object obj2, int i4, boolean z4) {
        this.f6408o = i4;
        this.f6410q = obj;
        this.f6409p = obj2;
    }

    private final void a() {
        synchronized (((A2.l) this.f6410q).c) {
            try {
                A2.d dVar = (A2.d) ((A2.l) this.f6410q).d;
                if (dVar != null) {
                    dVar.a((A2.h) this.f6409p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((A2.l) this.f6410q).c) {
            A2.e eVar = (A2.e) ((A2.l) this.f6410q).d;
            Exception f4 = ((A2.h) this.f6409p).f();
            h2.y.i(f4);
            eVar.c(f4);
        }
    }

    private final void c() {
        synchronized (((A2.l) this.f6410q).c) {
            ((A2.f) ((A2.l) this.f6410q).d).b(((A2.h) this.f6409p).g());
        }
    }

    private final void d() {
        Q1.K k3 = (Q1.K) this.f6409p;
        Context context = (Context) this.f6410q;
        k3.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (k3.f1642a) {
            k3.f1645f = sharedPreferences;
            k3.f1646g = edit;
            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            k3.f1647h = k3.f1645f.getBoolean("use_https", k3.f1647h);
            k3.f1662w = k3.f1645f.getBoolean("content_url_opted_out", k3.f1662w);
            k3.f1648i = k3.f1645f.getString("content_url_hashes", k3.f1648i);
            k3.f1650k = k3.f1645f.getBoolean("gad_idless", k3.f1650k);
            k3.f1663x = k3.f1645f.getBoolean("content_vertical_opted_out", k3.f1663x);
            k3.f1649j = k3.f1645f.getString("content_vertical_hashes", k3.f1649j);
            k3.f1659t = k3.f1645f.getInt("version_code", k3.f1659t);
            k3.f1655p = new C0949nc(k3.f1645f.getString("app_settings_json", k3.f1655p.f9735e), k3.f1645f.getLong("app_settings_last_update_ms", k3.f1655p.f9736f));
            k3.f1656q = k3.f1645f.getLong("app_last_background_time_ms", k3.f1656q);
            k3.f1658s = k3.f1645f.getInt("request_in_session_count", k3.f1658s);
            k3.f1657r = k3.f1645f.getLong("first_ad_req_time_ms", k3.f1657r);
            k3.f1660u = k3.f1645f.getStringSet("never_pool_slots", k3.f1660u);
            k3.y = k3.f1645f.getString("display_cutout", k3.y);
            k3.f1639C = k3.f1645f.getInt("app_measurement_npa", k3.f1639C);
            k3.f1640D = k3.f1645f.getInt("sd_app_measure_npa", k3.f1640D);
            k3.f1641E = k3.f1645f.getLong("sd_app_measure_npa_ts", k3.f1641E);
            k3.f1664z = k3.f1645f.getString("inspector_info", k3.f1664z);
            k3.f1637A = k3.f1645f.getBoolean("linked_device", k3.f1637A);
            k3.f1638B = k3.f1645f.getString("linked_ad_unit", k3.f1638B);
            k3.f1651l = k3.f1645f.getString("IABTCF_gdprApplies", k3.f1651l);
            k3.f1653n = k3.f1645f.getString("IABTCF_PurposeConsents", k3.f1653n);
            k3.f1652m = k3.f1645f.getString("IABTCF_TCString", k3.f1652m);
            k3.f1654o = k3.f1645f.getInt("gad_has_consent_for_cookies", k3.f1654o);
            try {
                k3.f1661v = new JSONObject(k3.f1645f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e4) {
                Y9.t("Could not convert native advanced settings to json object", e4);
            }
            k3.s();
        }
    }

    private final void e() {
        W1.b bVar = (W1.b) this.f6409p;
        Aj aj = ((Aj[]) this.f6410q)[0];
        if (aj != null) {
            Qp qp = bVar.f1975s;
            Pu h02 = Bs.h0(aj);
            synchronized (qp) {
                qp.f6700a.addFirst(h02);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable b4;
        int i4 = 0;
        switch (this.f6408o) {
            case 0:
                Mu mu = (Mu) this.f6410q;
                Future future = (Future) this.f6409p;
                if ((future instanceof AbstractC0540dv) && (b4 = ((AbstractC0540dv) future).b()) != null) {
                    mu.y(b4);
                    return;
                }
                try {
                    mu.mo4r(Bs.p0(future));
                    return;
                } catch (Error e4) {
                    e = e4;
                    mu.y(e);
                    return;
                } catch (RuntimeException e5) {
                    e = e5;
                    mu.y(e);
                    return;
                } catch (ExecutionException e6) {
                    mu.y(e6.getCause());
                    return;
                }
            case 1:
                synchronized (((ConstraintTrackingWorker) this.f6410q).f3161u) {
                    if (((ConstraintTrackingWorker) this.f6410q).f3162v) {
                        ((ConstraintTrackingWorker) this.f6410q).f3163w.i(new Object());
                    } else {
                        ((ConstraintTrackingWorker) this.f6410q).f3163w.k((InterfaceFutureC0239a) this.f6409p);
                    }
                }
                return;
            case 2:
                A2.l lVar = (A2.l) this.f6410q;
                A2.r rVar = (A2.r) lVar.d;
                A2.h hVar = (A2.h) this.f6409p;
                if (hVar.h()) {
                    rVar.m();
                    return;
                }
                try {
                    rVar.l(((A2.a) lVar.c).e(hVar));
                    return;
                } catch (A2.g e7) {
                    if (e7.getCause() instanceof Exception) {
                        rVar.k((Exception) e7.getCause());
                        return;
                    } else {
                        rVar.k(e7);
                        return;
                    }
                } catch (Exception e8) {
                    rVar.k(e8);
                    return;
                }
            case 3:
                A2.m mVar = (A2.m) this.f6410q;
                A2.r rVar2 = mVar.c;
                try {
                    A2.h hVar2 = (A2.h) mVar.f33b.e((A2.h) this.f6409p);
                    if (hVar2 == null) {
                        mVar.c(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    A2.p pVar = A2.j.f28b;
                    hVar2.d(pVar, mVar);
                    hVar2.c(pVar, mVar);
                    hVar2.a(pVar, mVar);
                    return;
                } catch (A2.g e9) {
                    if (e9.getCause() instanceof Exception) {
                        rVar2.k((Exception) e9.getCause());
                        return;
                    } else {
                        rVar2.k(e9);
                        return;
                    }
                } catch (Exception e10) {
                    rVar2.k(e10);
                    return;
                }
            case 4:
                a();
                return;
            case 5:
                b();
                return;
            case 6:
                c();
                return;
            case 7:
                A2.r rVar3 = (A2.r) this.f6409p;
                try {
                    rVar3.l(((Callable) this.f6410q).call());
                    return;
                } catch (Exception e11) {
                    rVar3.k(e11);
                    return;
                } catch (Throwable th) {
                    rVar3.k(new RuntimeException(th));
                    return;
                }
            case 8:
                B0.b bVar = (B0.b) this.f6409p;
                B0.g gVar = (B0.g) this.f6410q;
                bVar.getClass();
                B0.d dVar = B0.p.f103l;
                bVar.h(B0.n.a(24, 8, dVar));
                gVar.b(dVar, null);
                return;
            case 9:
                B0.b bVar2 = (B0.b) this.f6409p;
                B0.e eVar = (B0.e) this.f6410q;
                bVar2.getClass();
                B0.d dVar2 = B0.p.f103l;
                bVar2.h(B0.n.a(24, 9, dVar2));
                C1605c c1605c = AbstractC1609e.f12200p;
                eVar.a(dVar2, C1615h.f12205s);
                return;
            case 10:
                B0.b bVar3 = (B0.b) this.f6409p;
                B0.d dVar3 = (B0.d) this.f6410q;
                if (((androidx.activity.result.c) bVar3.d.f118q) != null) {
                    ((androidx.activity.result.c) bVar3.d.f118q).e(dVar3, null);
                    return;
                } else {
                    AbstractC1629o.e("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 11:
                B0.b bVar4 = (B0.b) this.f6409p;
                V2.e eVar2 = (V2.e) this.f6410q;
                bVar4.getClass();
                bVar4.h(B0.n.a(24, 3, B0.p.f103l));
                eVar2.getClass();
                return;
            case 12:
                Future future2 = (Future) this.f6409p;
                if (future2.isDone() || future2.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f6410q;
                future2.cancel(true);
                AbstractC1629o.e("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                ((C0.D) this.f6410q).f209m0.c(8388613);
                Runnable runnable2 = (Runnable) this.f6409p;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                MainActivity mainActivity = (MainActivity) this.f6410q;
                int i5 = MainActivity.f3569O;
                HashMap hashMap = AbstractC1806a.f14005O;
                if (hashMap == null) {
                    return;
                }
                GoPremiumLayout goPremiumLayout = mainActivity.f3571H;
                ArrayList p3 = AbstractC1806a.p(hashMap);
                C0.q0 q0Var = goPremiumLayout.f3611o;
                q0Var.d = 0;
                q0Var.f369e = p3;
                q0Var.d();
                goPremiumLayout.f3614r.setVisibility(8);
                mainActivity.f3571H.setHighSkus(AbstractC1806a.p(hashMap));
                GoPremiumLayout goPremiumLayout2 = mainActivity.f3571H;
                AbstractC1806a.p(hashMap);
                goPremiumLayout2.getClass();
                C0.H h4 = (C0.H) mainActivity.o().N(R.id.fragment_container);
                if (h4 != null) {
                    h4.M();
                }
                Runnable runnable3 = (Runnable) this.f6409p;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 15:
                ((C0.v0) this.f6410q).f426h0.c(8388611);
                Runnable runnable4 = (Runnable) this.f6409p;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 16:
                D0.g.Q((D0.g) this.f6410q, (View) this.f6409p);
                return;
            case 17:
                ((D0.g) this.f6410q).f569k0.c(8388613);
                Runnable runnable5 = (Runnable) this.f6409p;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 18:
                ((D0.p) this.f6410q).f618g0.c(8388611);
                Runnable runnable6 = (Runnable) this.f6409p;
                if (runnable6 != null) {
                    runnable6.run();
                    return;
                }
                return;
            case 19:
                D3.d dVar4 = (D3.d) this.f6409p;
                Typeface typeface = (Typeface) this.f6410q;
                AbstractC2123b abstractC2123b = (AbstractC2123b) dVar4.f677p;
                if (abstractC2123b != null) {
                    abstractC2123b.i(typeface);
                    return;
                }
                return;
            case 20:
                ((E.g) this.f6409p).a(this.f6410q);
                return;
            case 21:
                H1.d dVar5 = (H1.d) this.f6409p;
                try {
                    dVar5.f862b.B0(O1.W0.a(dVar5.f861a, (C0097x0) this.f6410q));
                    return;
                } catch (RemoteException e12) {
                    Y9.q("Failed to load ad.", e12);
                    return;
                }
            case 22:
                H1.i iVar = (H1.i) this.f6409p;
                try {
                    iVar.f874o.e(((H1.e) this.f6410q).f863a);
                    return;
                } catch (IllegalStateException e13) {
                    C0275Ga.b(iVar.getContext()).g("BaseAdView.loadAd", e13);
                    return;
                }
            case 23:
                ((H1.i) ((O1.A0) this.f6409p).f1261k).addView((View) BinderC1813b.C2((InterfaceC1812a) this.f6410q));
                return;
            case 24:
                ((P1.a) ((P1.e) this.f6409p).c).f1492p.getWindow().setBackgroundDrawable((BitmapDrawable) this.f6410q);
                return;
            case 25:
                d();
                return;
            case 26:
                W1.a aVar = (W1.a) this.f6409p;
                String str = (String) this.f6410q;
                aVar.getClass();
                Uri parse = Uri.parse(str);
                try {
                    parse = aVar.c.a(parse, aVar.f1943a, aVar.f1944b, null);
                } catch (J3 e14) {
                    Y9.o("Failed to append the click signal to URL: ", e14);
                    N1.n.f1204A.f1209g.h("TaggingLibraryJsInterface.recordClick", e14);
                }
                aVar.f1948h.a(parse.toString(), null);
                return;
            case 27:
                e();
                return;
            case 28:
                boolean isPopupShowing = ((AutoCompleteTextView) this.f6409p).isPopupShowing();
                Y2.a aVar2 = (Y2.a) this.f6410q;
                ((Y2.m) aVar2.f2149p).g(isPopupShowing);
                ((Y2.m) aVar2.f2149p).f2176i = isPopupShowing;
                return;
            default:
                Y3.h hVar3 = (Y3.h) this.f6410q;
                AbstractC0134m abstractC0134m = hVar3.f2234q;
                while (true) {
                    try {
                        ((Runnable) this.f6409p).run();
                    } catch (Throwable th2) {
                        W3.r.e(L3.j.f1101o, th2);
                    }
                    Runnable i6 = hVar3.i();
                    if (i6 == null) {
                        return;
                    }
                    this.f6409p = i6;
                    i4++;
                    if (i4 >= 16 && abstractC0134m.h()) {
                        abstractC0134m.g(hVar3, this);
                        return;
                    }
                }
                break;
        }
    }

    public String toString() {
        switch (this.f6408o) {
            case 0:
                Op op = new Op(Nu.class.getSimpleName(), 29);
                Mu mu = (Mu) this.f6410q;
                Wl wl = new Wl(5, (byte) 0);
                ((Wl) op.f6527r).f7564q = wl;
                op.f6527r = wl;
                wl.f7563p = mu;
                return op.toString();
            default:
                return super.toString();
        }
    }
}
