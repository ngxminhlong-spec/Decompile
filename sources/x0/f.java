package x0;

import C0.C;
import C0.ViewOnClickListenerC0022w;
import C0.c0;
import C0.l0;
import C0.p0;
import C0.s0;
import C0.u0;
import C0.v0;
import C0.z0;
import H.A;
import H.AbstractC0049y;
import H.InterfaceC0035j;
import H.W;
import H.a0;
import O1.C0077n;
import O1.C0095w0;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.C0158g;
import androidx.work.impl.WorkDatabase;
import b0.AbstractC0178L;
import b0.C0179M;
import b0.n0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.NavigationViewFit;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TutorialView2;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0272Fc;
import com.google.android.gms.internal.ads.C0572ek;
import com.google.android.gms.internal.ads.C0580es;
import com.google.android.gms.internal.ads.C0828kk;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.E2;
import com.google.android.gms.internal.ads.F2;
import com.google.android.gms.internal.ads.Mu;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.measurement.C1509e0;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.material.internal.NavigationMenuView;
import d3.AbstractC1654b;
import h2.y;
import i1.InterfaceC1715a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import m2.AbstractC1806a;
import n1.AbstractC1810c;
import n1.InterfaceC1811d;
import o1.InterfaceC1833I;
import o1.InterfaceC1862g;
import o1.InterfaceC1870k;
import o1.InterfaceC1875m0;
import o2.AbstractC1895f;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class f implements androidx.activity.result.b, InterfaceC1870k, InterfaceC1875m0, InterfaceC1862g, InterfaceC1833I, InterfaceC1715a, InterfaceC1811d, y1.b, E.b, Cr, InterfaceC0035j, E2, Mu, n0 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15211o;

    /* renamed from: p, reason: collision with root package name */
    public Object f15212p;

    public f(int i4) {
        this.f15211o = i4;
        switch (i4) {
            case 14:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15212p = new I.h(this);
                    return;
                } else {
                    this.f15212p = new I.h(this);
                    return;
                }
            default:
                C0095w0 c0095w0 = new C0095w0();
                this.f15212p = c0095w0;
                c0095w0.d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                return;
        }
    }

    public /* synthetic */ f(int i4, Object obj) {
        this.f15211o = i4;
        this.f15212p = obj;
    }

    public /* synthetic */ f(int i4, boolean z4) {
        this.f15211o = i4;
    }

    public f(Context context, Uri uri) {
        this.f15211o = 11;
        this.f15212p = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public f(JSONObject jSONObject, com.google.firebase.storage.e eVar) {
        this.f15211o = 27;
        N1.l lVar = new N1.l(1);
        lVar.f1189p = B0.q.c("");
        lVar.f1190q = B0.q.c("");
        lVar.f1191r = B0.q.c("");
        lVar.f1192s = B0.q.c("");
        lVar.f1193t = B0.q.c("");
        lVar.f1194u = B0.q.c(Collections.EMPTY_MAP);
        this.f15212p = lVar;
        jSONObject.optString("generation");
        jSONObject.optString("name");
        jSONObject.optString("bucket");
        jSONObject.optString("metageneration");
        jSONObject.optString("timeCreated");
        jSONObject.optString("updated");
        jSONObject.optLong("size");
        jSONObject.optString("md5Hash");
        if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject2.getString(next);
                if (!((B0.q) lVar.f1194u).f110o) {
                    lVar.f1194u = B0.q.d(new HashMap());
                }
                ((Map) ((B0.q) lVar.f1194u).f111p).put(next, string);
            }
        }
        String u2 = u("contentType", jSONObject);
        if (u2 != null) {
            lVar.f1189p = B0.q.d(u2);
        }
        String u4 = u("cacheControl", jSONObject);
        if (u4 != null) {
            lVar.f1190q = B0.q.d(u4);
        }
        String u5 = u("contentDisposition", jSONObject);
        if (u5 != null) {
            lVar.f1191r = B0.q.d(u5);
        }
        String u6 = u("contentEncoding", jSONObject);
        if (u6 != null) {
            lVar.f1192s = B0.q.d(u6);
        }
        String u7 = u("contentLanguage", jSONObject);
        if (u7 != null) {
            lVar.f1193t = B0.q.d(u7);
        }
        ((N1.l) this.f15212p).getClass();
    }

    public static String u(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public void A(C0580es c0580es) {
        B0.u uVar = (B0.u) this.f15212p;
        String str = c0580es.f8652b;
        int i4 = c0580es.f8651a;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.H9)).booleanValue()) {
                uVar.f117p = str;
            }
        }
        switch (i4) {
            case 8152:
                uVar.c("onLMDOverlayOpened", new HashMap());
                return;
            case 8153:
                uVar.c("onLMDOverlayClicked", new HashMap());
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                uVar.c("onLMDOverlayClose", new HashMap());
                return;
            case 8157:
                uVar.f117p = null;
                uVar.f118q = null;
                uVar.f116o = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(i4));
                uVar.c("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    @Override // E.b
    public Cursor a(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15212p;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e4) {
            Log.w("FontsProvider", "Unable to query the content provider", e4);
            return null;
        }
    }

    public void b(Bundle bundle) {
        C0095w0 c0095w0 = (C0095w0) this.f15212p;
        c0095w0.f1384b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            c0095w0.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
    }

    @Override // o1.InterfaceC1862g
    public void c() {
        c0 c0Var = (c0) this.f15212p;
        v0 v0Var = (v0) c0Var.f291h;
        if (v0Var.h() == null) {
            return;
        }
        String name = c0Var.f287b.getName();
        SharedPreferences.Editor edit = v0Var.h().getPreferences(0).edit();
        edit.putString("username", name);
        edit.apply();
        AbstractC1806a.f14015Y = name;
        if (c0Var.d != null) {
            AbstractC1806a.N(v0Var.h(), c0Var.d);
        }
        c0.b(c0Var);
        C0077n.c(v0Var.f431m0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15212p;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                com.google.android.material.datepicker.t.n((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public void d(int i4, long j4) {
        ((N1.g) this.f15212p).f1172v.e(i4, System.currentTimeMillis() - j4);
    }

    @Override // o1.InterfaceC1862g
    public void e() {
        v0 v0Var = (v0) ((c0) this.f15212p).f291h;
        try {
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.addFlags(1);
            v0Var.J(intent, 0);
        } catch (Throwable unused) {
            Context l4 = v0Var.l();
            if (l4 == null) {
                return;
            }
            Toast.makeText(l4, R.string.no_application_for_this_action, 1).show();
        }
    }

    @Override // com.google.android.gms.internal.ads.E2
    public void f(F2 f22) {
        ((C0272Fc) this.f15212p).c(f22);
    }

    @Override // androidx.activity.result.b
    public void g(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f15212p;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f2430p;
        int i4 = AbstractC1629o.b(intent, "ProxyBillingActivityV2").f72b;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f3564z;
        if (resultReceiver != null) {
            resultReceiver.send(i4, intent == null ? null : intent.getExtras());
        }
        int i5 = aVar.f2429o;
        if (i5 != -1 || i4 != 0) {
            AbstractC1629o.e("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i5 + " and billing's responseCode: " + i4);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // I3.a
    public Object get() {
        return new D1.j(Integer.valueOf(D1.j.f663r).intValue(), (Context) ((I3.a) this.f15212p).get(), "com.google.android.datatransport.events");
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public void h(int i4, long j4, String str) {
        ((N1.g) this.f15212p).f1172v.g(i4, System.currentTimeMillis() - j4, null, null, str);
    }

    @Override // b0.n0
    public int i() {
        AbstractC0178L abstractC0178L = (AbstractC0178L) this.f15212p;
        return abstractC0178L.f3195n - abstractC0178L.F();
    }

    @Override // b0.n0
    public int j(View view) {
        return AbstractC0178L.A(view) - ((ViewGroup.MarginLayoutParams) ((C0179M) view.getLayoutParams())).leftMargin;
    }

    @Override // i1.InterfaceC1715a
    public void k(Throwable th) {
        p0 p0Var = (p0) ((ViewOnClickListenerC0022w) this.f15212p).f446p;
        if (!p0Var.f363q) {
            int i4 = p0Var.f362p.f13943b;
            if (AbstractC1654b.f12606e != null) {
                Bundle bundle = new Bundle();
                bundle.putString("DOWNLOAD", String.valueOf(i4));
                C1509e0 c1509e0 = AbstractC1654b.f12606e.f12544a;
                c1509e0.getClass();
                c1509e0.b(new Y(c1509e0, null, "LAUNCH_308", bundle, false, 1));
            }
        }
        l1.f.f13951e.f13956b.add(Integer.valueOf(p0Var.f362p.f13943b));
        p0Var.f365s.e(p0Var.f364r);
        l0.b(((v0) ((s0) p0Var.f365s.f370f).f393i).f427i0, true);
    }

    public N1.l l() {
        N1.l lVar = (N1.l) this.f15212p;
        N1.l lVar2 = new N1.l(1);
        lVar2.f1189p = B0.q.c("");
        lVar2.f1190q = B0.q.c("");
        lVar2.f1191r = B0.q.c("");
        lVar2.f1192s = B0.q.c("");
        lVar2.f1193t = B0.q.c("");
        lVar2.f1194u = B0.q.c(Collections.EMPTY_MAP);
        y.i(lVar);
        lVar2.f1189p = (B0.q) lVar.f1189p;
        lVar2.f1190q = (B0.q) lVar.f1190q;
        lVar2.f1191r = (B0.q) lVar.f1191r;
        lVar2.f1192s = (B0.q) lVar.f1192s;
        lVar2.f1193t = (B0.q) lVar.f1193t;
        lVar2.f1194u = (B0.q) lVar.f1194u;
        return lVar2;
    }

    @Override // H.InterfaceC0035j
    public a0 m(View view, a0 a0Var) {
        W w2 = a0Var.f811a;
        NavigationViewFit navigationViewFit = (NavigationViewFit) this.f15212p;
        if (navigationViewFit.f1601p == null) {
            navigationViewFit.f1601p = new Rect();
        }
        navigationViewFit.f1601p.set(w2.j().f1a, a0Var.b(), w2.j().c, a0Var.a());
        P2.p pVar = navigationViewFit.f1745u;
        pVar.getClass();
        int b4 = a0Var.b();
        if (pVar.f1585F != b4) {
            pVar.f1585F = b4;
            int i4 = (pVar.f1590p.getChildCount() == 0 && pVar.f1583D) ? pVar.f1585F : 0;
            NavigationMenuView navigationMenuView = pVar.f1589o;
            navigationMenuView.setPadding(0, i4, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = pVar.f1589o;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, a0Var.a());
        LinearLayout linearLayout = pVar.f1590p;
        WeakHashMap weakHashMap = A.f779a;
        int i5 = Build.VERSION.SDK_INT;
        WindowInsets c = a0Var.c();
        if (c != null) {
            WindowInsets a4 = i5 >= 30 ? AbstractC0049y.a(linearLayout, c) : H.r.a(linearLayout, c);
            if (!a4.equals(c)) {
                a0.d(a4, linearLayout);
            }
        }
        navigationViewFit.setWillNotDraw(w2.j().equals(A.d.f0e) || navigationViewFit.f1600o == null);
        navigationViewFit.postInvalidateOnAnimation();
        return w2.c();
    }

    public I.g n(int i4) {
        return null;
    }

    @Override // b0.n0
    public View o(int i4) {
        return ((AbstractC0178L) this.f15212p).u(i4);
    }

    @Override // o1.InterfaceC1862g
    public void onCancel() {
        c0 c0Var = (c0) this.f15212p;
        c0Var.c();
        c0.b(c0Var);
    }

    @Override // b0.n0
    public int p() {
        return ((AbstractC0178L) this.f15212p).E();
    }

    @Override // b0.n0
    public int q(View view) {
        return AbstractC0178L.B(view) + ((ViewGroup.MarginLayoutParams) ((C0179M) view.getLayoutParams())).rightMargin;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        W1.b bVar = (W1.b) this.f15212p;
        Y9.m("Initialized webview successfully for SDKCore.");
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.y8)).booleanValue()) {
            AbstractC1895f.I(bVar.f1954B, bVar.f1976t, "sgs", new Pair("sgi_rn", Integer.toString(bVar.f1971T.get())));
            bVar.f1970S.set(true);
        }
    }

    @Override // o1.InterfaceC1833I
    public void s(int i4) {
        switch (this.f15211o) {
            case 5:
                ((l0) this.f15212p).f340b.post(new A0.a(this, i4, 17));
                return;
            default:
                ((u0) this.f15212p).f409b.post(new C(i4, 2, this));
                return;
        }
    }

    @Override // n1.InterfaceC1811d
    public void t(int i4) {
        switch (this.f15211o) {
            case 8:
                u0 u0Var = (u0) this.f15212p;
                ViewGroup viewGroup = u0Var.c;
                if (!u0Var.f412g) {
                    D0.p.Q((D0.p) u0Var.f413h, i4, true);
                    return;
                }
                viewGroup.removeAllViews();
                TutorialView2 tutorialView2 = (TutorialView2) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tutorial_view_layout2, viewGroup, false);
                tutorialView2.a(AbstractC1810c.a(i4), z0.Q(i4));
                viewGroup.addView(tutorialView2);
                return;
            default:
                ((D0.r) this.f15212p).P(i4);
                return;
        }
    }

    public I.g v(int i4) {
        return null;
    }

    public int w(int i4) {
        WorkDatabase workDatabase;
        int i5;
        synchronized (f.class) {
            try {
                workDatabase = (WorkDatabase) this.f15212p;
                workDatabase.c();
                Long p3 = workDatabase.j().p("next_job_scheduler_id");
                int intValue = p3 != null ? p3.intValue() : 0;
                workDatabase.j().s(new w0.c("next_job_scheduler_id", intValue == Integer.MAX_VALUE ? 0 : intValue + 1));
                workDatabase.h();
                workDatabase.f();
                i5 = (intValue >= 0 && intValue <= i4) ? intValue : 0;
                ((WorkDatabase) this.f15212p).j().s(new w0.c("next_job_scheduler_id", 1));
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            } finally {
            }
        }
        return i5;
    }

    public void x() {
        ((C0158g) this.f15212p).f2863s.Z();
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        N1.n.f1204A.f1209g.h("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        W1.b bVar = (W1.b) this.f15212p;
        C0828kk c0828kk = bVar.f1954B;
        C0572ek c0572ek = bVar.f1976t;
        Pair pair = new Pair("sgf_reason", th.getMessage());
        AtomicInteger atomicInteger = bVar.f1971T;
        AbstractC1895f.I(c0828kk, c0572ek, "sgf", pair, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        Y9.q("Failed to initialize webview for loading SDKCore. ", th);
        C0937n6 c0937n6 = AbstractC1066q6.y8;
        O1.r rVar = O1.r.d;
        if (!((Boolean) rVar.c.a(c0937n6)).booleanValue() || bVar.f1970S.get() || atomicInteger.getAndIncrement() >= ((Integer) rVar.c.a(AbstractC1066q6.z8)).intValue()) {
            return;
        }
        bVar.N3();
    }

    public boolean z(int i4, int i5, Bundle bundle) {
        return false;
    }
}
