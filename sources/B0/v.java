package B0;

import Q1.I;
import Q1.J;
import Q1.K;
import Q1.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.WebSettings;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.Al;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0272Fc;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C0356Wb;
import com.google.android.gms.internal.ads.C0370Za;
import com.google.android.gms.internal.ads.C0393ab;
import com.google.android.gms.internal.ads.C0436bb;
import com.google.android.gms.internal.ads.C0449bo;
import com.google.android.gms.internal.ads.C0478cb;
import com.google.android.gms.internal.ads.C0521db;
import com.google.android.gms.internal.ads.C0549e3;
import com.google.android.gms.internal.ads.C0573el;
import com.google.android.gms.internal.ads.C0820kc;
import com.google.android.gms.internal.ads.C0834kq;
import com.google.android.gms.internal.ads.C0977o3;
import com.google.android.gms.internal.ads.C1315vz;
import com.google.android.gms.internal.ads.C1473zl;
import com.google.android.gms.internal.ads.Ck;
import com.google.android.gms.internal.ads.D3;
import com.google.android.gms.internal.ads.E6;
import com.google.android.gms.internal.ads.Fl;
import com.google.android.gms.internal.ads.Fo;
import com.google.android.gms.internal.ads.Gl;
import com.google.android.gms.internal.ads.I3;
import com.google.android.gms.internal.ads.InterfaceC1328wB;
import com.google.android.gms.internal.ads.Jp;
import com.google.android.gms.internal.ads.M3;
import com.google.android.gms.internal.ads.Oz;
import com.google.android.gms.internal.ads.Pu;
import com.google.android.gms.internal.ads.U3;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.gms.internal.play_billing.T0;
import com.google.android.gms.internal.play_billing.V0;
import com.google.android.gms.internal.play_billing.W0;
import h2.y;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import x2.BinderC2074g0;
import x2.C2077i;
import x2.C2083l;
import x2.EnumC2075h;
import x2.X0;
import x2.d1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f123b;
    public final Object c;

    public /* synthetic */ v(int i4, Object obj, Object obj2) {
        this.f122a = i4;
        this.f123b = obj;
        this.c = obj2;
    }

    public /* synthetic */ v(b bVar, a aVar, V2.e eVar) {
        this.f122a = 0;
        this.f123b = bVar;
        this.c = aVar;
    }

    public /* synthetic */ v(Object obj, Object obj2, int i4, boolean z4) {
        this.f122a = i4;
        this.c = obj;
        this.f123b = obj2;
    }

    private final Object a() {
        C0272Fc c0272Fc;
        u0.g gVar = (u0.g) this.f123b;
        C0370Za c0370Za = (C0370Za) this.c;
        C0573el c0573el = (C0573el) gVar.f14985r;
        synchronized (c0573el.f8980p) {
            try {
                if (c0573el.f8981q) {
                    c0272Fc = c0573el.f8979o;
                } else {
                    c0573el.f8981q = true;
                    c0573el.f8983s = c0370Za;
                    c0573el.f8984t.n();
                    c0573el.f8979o.f5017o.a(new D3(29, c0573el), AbstractC0266Ec.f4900f);
                    c0272Fc = c0573el.f8979o;
                }
            } finally {
            }
        }
        return (InputStream) c0272Fc.f5017o.get(((Integer) O1.r.d.c.a(AbstractC1066q6.J4)).intValue(), TimeUnit.SECONDS);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences sharedPreferences;
        C0478cb a4;
        int i4 = 3;
        int i5 = 0;
        switch (this.f122a) {
            case 0:
                b bVar = (b) this.f123b;
                a aVar = (a) this.c;
                bVar.getClass();
                try {
                    V0 v02 = bVar.f50g;
                    String packageName = bVar.f48e.getPackageName();
                    String str = aVar.f45b;
                    String str2 = bVar.f47b;
                    Bundle bundle = new Bundle();
                    bundle.putString("playBillingLibraryVersion", str2);
                    T0 t02 = (T0) v02;
                    Parcel Q3 = t02.Q();
                    Q3.writeInt(9);
                    Q3.writeString(packageName);
                    Q3.writeString(str);
                    int i6 = W0.f12172a;
                    Q3.writeInt(1);
                    bundle.writeToParcel(Q3, 0);
                    Parcel a02 = t02.a0(Q3, 902);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle2 = (Bundle) W0.a(a02);
                    a02.recycle();
                    p.a(AbstractC1629o.c(bundle2, "BillingClient"), AbstractC1629o.a(bundle2, "BillingClient"));
                } catch (Exception e4) {
                    AbstractC1629o.f("BillingClient", "Error acknowledge purchase!", e4);
                    bVar.h(n.a(28, 3, p.f102k));
                }
                return null;
            case 1:
                Context context = (Context) this.f123b;
                Context context2 = (Context) this.c;
                if (context != null) {
                    I.w("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                } else {
                    I.w("Attempting to read user agent from local cache.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                    i5 = 1;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    I.w("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (i5 != 0) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        I.w("Persisting user agent.");
                    }
                }
                return string;
            case 2:
                J j4 = N.f1668k;
                String absolutePath = ((Context) this.c).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = (WebSettings) this.f123b;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10080A0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            case 3:
                return ((W1.a) this.f123b).getClickSignals((String) this.c);
            case 4:
                W1.b bVar2 = (W1.b) this.f123b;
                C0820kc c0820kc = (C0820kc) this.c;
                return bVar2.L3(bVar2.f1973q, c0820kc.f9291o, c0820kc.f9292p, c0820kc.f9293q, c0820kc.f9294r);
            case 5:
                Future future = ((U3) this.f123b).f7135k;
                if (future != null) {
                    future.get();
                }
                C0977o3 c0977o3 = ((U3) this.f123b).f7134j;
                if (c0977o3 != null) {
                    try {
                        synchronized (((C0549e3) this.c)) {
                            C0549e3 c0549e3 = (C0549e3) this.c;
                            byte[] e5 = c0977o3.e();
                            c0549e3.a(e5, e5.length, C1315vz.f11096b);
                        }
                    } catch (Oz | NullPointerException unused) {
                    }
                }
                return null;
            case 6:
                M3 m32 = (M3) this.c;
                WeakHashMap weakHashMap = (WeakHashMap) m32.f6208p;
                Context context3 = (Context) this.f123b;
                C0521db c0521db = (C0521db) weakHashMap.get(context3);
                if (c0521db != null) {
                    long longValue = c0521db.f8487a + ((Long) E6.f4850a.r()).longValue();
                    N1.n.f1204A.f1212j.getClass();
                    if (longValue >= System.currentTimeMillis()) {
                        a4 = new C0436bb(context3, c0521db.f8488b).a();
                        ((WeakHashMap) m32.f6208p).put(context3, new C0521db(a4));
                        return a4;
                    }
                }
                a4 = new C0436bb(context3).a();
                ((WeakHashMap) m32.f6208p).put(context3, new C0521db(a4));
                return a4;
            case 7:
                return (String) ((C0356Wb) this.f123b).m((Context) this.c, "getAppInstanceId");
            case 8:
                V2.j jVar = (V2.j) this.f123b;
                Bundle bundle3 = (Bundle) ((C0834kq) this.c).f9325q.get();
                String str3 = (String) ((InterfaceFutureC0239a) ((InterfaceC1328wB) jVar.f1896g).c()).get();
                boolean z4 = ((Boolean) O1.r.d.c.a(AbstractC1066q6.q6)).booleanValue() && ((K) jVar.f1899j).q();
                String str4 = (String) jVar.f1897h;
                PackageInfo packageInfo = (PackageInfo) jVar.f1895f;
                return new C0370Za(bundle3, (C0248Bc) jVar.f1893b, (ApplicationInfo) jVar.c, (String) jVar.d, (ArrayList) jVar.f1894e, packageInfo, str3, str4, null, null, z4, ((Jp) jVar.f1900k).b());
            case 9:
                Ck ck = (Ck) this.f123b;
                Aq aq = (Aq) this.c;
                ck.f4527e.b(Boolean.TRUE);
                aq.b(true);
                ck.f4538p.b(aq.l());
                return null;
            case 10:
                return a();
            case 11:
                return ((I3) this.f123b).f5531b.e((Context) this.c);
            case 12:
                return (InputStream) ((C0272Fc) ((C0573el) ((C0275Ga) this.f123b).f5186s).c((C0370Za) this.c)).f5017o.get(((Integer) O1.r.d.c.a(AbstractC1066q6.J4)).intValue(), TimeUnit.SECONDS);
            case 13:
                Fl fl = (Fl) ((C0834kq) this.f123b).f9325q.get();
                Object obj = ((Pu) this.c).f6610o;
                return new Al(fl, ((C1473zl) obj).f11650b, ((C1473zl) obj).f11649a);
            case 14:
                return new Gl((JSONObject) ((C0834kq) this.f123b).f9325q.get(), (C0393ab) ((C0834kq) this.c).f9325q.get());
            case 15:
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = (ArrayList) this.f123b;
                int size = arrayList.size();
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    InterfaceFutureC0239a interfaceFutureC0239a = (InterfaceFutureC0239a) obj2;
                    if (((JSONObject) interfaceFutureC0239a.get()) != null) {
                        jSONArray.put(interfaceFutureC0239a.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new C0449bo(i4, jSONArray.toString(), (Bundle) this.c);
            case 16:
                Iterator it = ((ArrayList) this.f123b).iterator();
                while (true) {
                    Object obj3 = this.c;
                    if (!it.hasNext()) {
                        return obj3;
                    }
                    Fo fo = (Fo) ((InterfaceFutureC0239a) it.next()).get();
                    if (fo != null) {
                        fo.a(obj3);
                    }
                }
            case 17:
                X0 x02 = ((BinderC2074g0) this.c).f15665o;
                x02.a();
                C2083l c2083l = x02.c;
                X0.I(c2083l);
                return c2083l.K((String) this.f123b);
            default:
                X0 x03 = (X0) this.c;
                d1 d1Var = (d1) this.f123b;
                String str5 = d1Var.f15603o;
                y.i(str5);
                C2077i L4 = x03.L(str5);
                EnumC2075h enumC2075h = EnumC2075h.f15669q;
                if (L4.f(enumC2075h) && C2077i.b(d1Var.f15600J).f(enumC2075h)) {
                    return x03.J(d1Var).G();
                }
                x03.c().f15402n.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }
}
