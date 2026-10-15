package W1;

import B0.v;
import O1.U0;
import O1.r;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.AbstractBinderC0607fc;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1137rt;
import com.google.android.gms.internal.ads.Aj;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.Bs;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0260Dc;
import com.google.android.gms.internal.ads.C0264Ea;
import com.google.android.gms.internal.ads.C0294Je;
import com.google.android.gms.internal.ads.C0539du;
import com.google.android.gms.internal.ads.C0572ek;
import com.google.android.gms.internal.ads.C0820kc;
import com.google.android.gms.internal.ads.C0828kk;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.C1267uu;
import com.google.android.gms.internal.ads.C1423ye;
import com.google.android.gms.internal.ads.C1462za;
import com.google.android.gms.internal.ads.Ds;
import com.google.android.gms.internal.ads.Du;
import com.google.android.gms.internal.ads.Eq;
import com.google.android.gms.internal.ads.Eu;
import com.google.android.gms.internal.ads.Fq;
import com.google.android.gms.internal.ads.G6;
import com.google.android.gms.internal.ads.I3;
import com.google.android.gms.internal.ads.InterfaceC0246Ba;
import com.google.android.gms.internal.ads.InterfaceC0522dc;
import com.google.android.gms.internal.ads.Ku;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.Oq;
import com.google.android.gms.internal.ads.Ou;
import com.google.android.gms.internal.ads.Pu;
import com.google.android.gms.internal.ads.Qp;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1023p6;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.ads.Zf;
import com.google.android.gms.internal.play_billing.B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import o2.AbstractC1895f;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends AbstractBinderC0607fc {

    /* renamed from: U, reason: collision with root package name */
    public static final ArrayList f1949U = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: V, reason: collision with root package name */
    public static final ArrayList f1950V = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: W, reason: collision with root package name */
    public static final ArrayList f1951W = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: X, reason: collision with root package name */
    public static final ArrayList f1952X = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: A, reason: collision with root package name */
    public final h f1953A;

    /* renamed from: B, reason: collision with root package name */
    public final C0828kk f1954B;

    /* renamed from: C, reason: collision with root package name */
    public final Oq f1955C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f1956D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f1957E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f1958F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f1959G;

    /* renamed from: H, reason: collision with root package name */
    public final String f1960H;

    /* renamed from: I, reason: collision with root package name */
    public final String f1961I;

    /* renamed from: J, reason: collision with root package name */
    public final AtomicInteger f1962J;

    /* renamed from: K, reason: collision with root package name */
    public final C0248Bc f1963K;

    /* renamed from: L, reason: collision with root package name */
    public String f1964L;

    /* renamed from: M, reason: collision with root package name */
    public final String f1965M;
    public final ArrayList N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f1966O;

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f1967P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1968Q;

    /* renamed from: R, reason: collision with root package name */
    public final AtomicBoolean f1969R;

    /* renamed from: S, reason: collision with root package name */
    public final AtomicBoolean f1970S;

    /* renamed from: T, reason: collision with root package name */
    public final AtomicInteger f1971T;

    /* renamed from: p, reason: collision with root package name */
    public final C1423ye f1972p;

    /* renamed from: q, reason: collision with root package name */
    public Context f1973q;

    /* renamed from: r, reason: collision with root package name */
    public final I3 f1974r;

    /* renamed from: s, reason: collision with root package name */
    public final Qp f1975s;

    /* renamed from: t, reason: collision with root package name */
    public C0572ek f1976t;

    /* renamed from: u, reason: collision with root package name */
    public final Su f1977u;

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f1978v;

    /* renamed from: w, reason: collision with root package name */
    public C0264Ea f1979w;

    /* renamed from: x, reason: collision with root package name */
    public Point f1980x;
    public Point y;

    /* renamed from: z, reason: collision with root package name */
    public final Set f1981z;

    public b(C1423ye c1423ye, Context context, I3 i32, Qp qp, Su su, ScheduledExecutorService scheduledExecutorService, C0828kk c0828kk, Oq oq, C0248Bc c0248Bc) {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        ArrayList arrayList;
        this.f1976t = null;
        this.f1980x = new Point();
        this.y = new Point();
        this.f1981z = Collections.newSetFromMap(new WeakHashMap());
        this.f1962J = new AtomicInteger(0);
        this.f1969R = new AtomicBoolean(false);
        this.f1970S = new AtomicBoolean(false);
        this.f1971T = new AtomicInteger(0);
        this.f1972p = c1423ye;
        this.f1973q = context;
        this.f1974r = i32;
        this.f1975s = qp;
        this.f1977u = su;
        this.f1978v = scheduledExecutorService;
        this.f1953A = (h) c1423ye.f11374G.c();
        this.f1954B = c0828kk;
        this.f1955C = oq;
        this.f1963K = c0248Bc;
        C0937n6 c0937n6 = AbstractC1066q6.t6;
        r rVar = r.d;
        this.f1956D = ((Boolean) rVar.c.a(c0937n6)).booleanValue();
        C0937n6 c0937n62 = AbstractC1066q6.s6;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        this.f1957E = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n62)).booleanValue();
        this.f1958F = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.v6)).booleanValue();
        this.f1959G = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.x6)).booleanValue();
        this.f1960H = (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.w6);
        this.f1961I = (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.y6);
        this.f1965M = (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.z6);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.A6)).booleanValue()) {
            this.N = T3((String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.B6));
            this.f1966O = T3((String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.C6));
            this.f1967P = T3((String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.D6));
            arrayList = T3((String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.E6));
        } else {
            this.N = f1949U;
            this.f1966O = f1950V;
            this.f1967P = f1951W;
            arrayList = f1952X;
        }
        this.f1968Q = arrayList;
    }

    public static void K3(b bVar, String str, String str2, C0572ek c0572ek) {
        C0937n6 c0937n6 = AbstractC1066q6.f6;
        r rVar = r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            if (((Boolean) rVar.c.a(AbstractC1066q6.l6)).booleanValue()) {
                AbstractC0266Ec.f4897a.execute(new J1.a(bVar, str, str2, c0572ek, 4));
            } else {
                bVar.f1953A.a(str, str2, c0572ek);
            }
        }
    }

    public static boolean R3(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri S3(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i4 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i4) + str + "=" + str2 + "&" + uri2.substring(i4));
    }

    public static final ArrayList T3(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!Ds.a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static Eq U3(InterfaceFutureC0239a interfaceFutureC0239a, C0820kc c0820kc) {
        if (Fq.a() && ((Boolean) G6.f5135e.r()).booleanValue()) {
            try {
                Eq eq = (Eq) ((C0294Je) Bs.p0(interfaceFutureC0239a)).f5870b.c();
                eq.d(new ArrayList(Collections.singletonList(c0820kc.f9292p)));
                U0 u02 = c0820kc.f9294r;
                eq.b(u02 == null ? "" : u02.f1296D);
                return eq;
            } catch (ExecutionException e4) {
                N1.n.f1204A.f1209g.h("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e4);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0650gc
    public final void E0(InterfaceC1812a interfaceC1812a, C0820kc c0820kc, InterfaceC0522dc interfaceC0522dc) {
        InterfaceFutureC0239a interfaceFutureC0239a;
        InterfaceFutureC0239a interfaceFutureC0239a2;
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        this.f1973q = context;
        Aq f4 = Zf.f(context, 22);
        f4.f();
        if ("UNKNOWN".equals(c0820kc.f9292p)) {
            List arrayList = new ArrayList();
            C0937n6 c0937n6 = AbstractC1066q6.K6;
            r rVar = r.d;
            if (!((String) rVar.c.a(c0937n6)).isEmpty()) {
                arrayList = Arrays.asList(((String) rVar.c.a(c0937n6)).split(","));
            }
            if (arrayList.contains(AbstractC1895f.G(c0820kc.f9294r))) {
                Ou f02 = Bs.f0(new IllegalArgumentException("Unknown format is no longer supported."));
                interfaceFutureC0239a = Bs.f0(new IllegalArgumentException("Unknown format is no longer supported."));
                interfaceFutureC0239a2 = f02;
                N1.n.f1204A.f1212j.getClass();
                o oVar = new o(this, interfaceFutureC0239a2, c0820kc, interfaceC0522dc, f4, System.currentTimeMillis());
                interfaceFutureC0239a.a(new Nu(0, interfaceFutureC0239a, oVar), this.f1972p.a());
            }
        }
        if (((Boolean) r.d.c.a(AbstractC1066q6.s9)).booleanValue()) {
            C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
            interfaceFutureC0239a2 = c0260Dc.b(new v(4, this, c0820kc));
            interfaceFutureC0239a = Bs.n0(interfaceFutureC0239a2, m.f2010a, c0260Dc);
        } else {
            C0294Je L32 = L3(this.f1973q, c0820kc.f9291o, c0820kc.f9292p, c0820kc.f9293q, c0820kc.f9294r);
            Pu h02 = Bs.h0(L32);
            interfaceFutureC0239a = (InterfaceFutureC0239a) L32.c.c();
            interfaceFutureC0239a2 = h02;
        }
        N1.n.f1204A.f1212j.getClass();
        o oVar2 = new o(this, interfaceFutureC0239a2, c0820kc, interfaceC0522dc, f4, System.currentTimeMillis());
        interfaceFutureC0239a.a(new Nu(0, interfaceFutureC0239a, oVar2), this.f1972p.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        if (r39.equals("REWARDED_INTERSTITIAL") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        r1 = new O1.X0("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r39.equals("REWARDED") != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, com.google.android.gms.internal.ads.zg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.C0294Je L3(android.content.Context r37, java.lang.String r38, java.lang.String r39, O1.X0 r40, O1.U0 r41) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.b.L3(android.content.Context, java.lang.String, java.lang.String, O1.X0, O1.U0):com.google.android.gms.internal.ads.Je");
    }

    public final C0539du M3(final String str) {
        final Aj[] ajArr = new Aj[1];
        InterfaceFutureC0239a a4 = this.f1975s.a();
        Du du = new Du() { // from class: W1.j
            @Override // com.google.android.gms.internal.ads.Du
            public final InterfaceFutureC0239a l(Object obj) {
                Aj aj = (Aj) obj;
                b bVar = b.this;
                bVar.getClass();
                ajArr[0] = aj;
                Context context = bVar.f1973q;
                C0264Ea c0264Ea = bVar.f1979w;
                Map map = c0264Ea.f4874p;
                JSONObject b02 = B.b0(context, map, map, c0264Ea.f4873o, null);
                JSONObject e02 = B.e0(bVar.f1973q, bVar.f1979w.f4873o);
                JSONObject d02 = B.d0(bVar.f1979w.f4873o);
                JSONObject c02 = B.c0(bVar.f1973q, bVar.f1979w.f4873o);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", b02);
                jSONObject.put("ad_view_signal", e02);
                jSONObject.put("scroll_view_signal", d02);
                jSONObject.put("lock_screen_signal", c02);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", B.a0(null, bVar.f1973q, bVar.y, bVar.f1980x));
                }
                return aj.a(str2, jSONObject);
            }
        };
        Su su = this.f1977u;
        C1267uu n02 = Bs.n0(a4, du, su);
        n02.a(new Nu(27, this, ajArr), su);
        return Bs.Z(Bs.m0((Ku) Bs.o0(Ku.q(n02), ((Integer) r.d.c.a(AbstractC1066q6.M6)).intValue(), TimeUnit.MILLISECONDS, this.f1978v), n.f2011b, su), Exception.class, n.c, su);
    }

    public final void N3() {
        b bVar;
        InterfaceFutureC0239a interfaceFutureC0239a;
        if (((Boolean) r.d.c.a(AbstractC1066q6.s9)).booleanValue()) {
            interfaceFutureC0239a = Bs.k0(new D3.d(21, this), AbstractC0266Ec.f4897a);
            bVar = this;
        } else {
            bVar = this;
            interfaceFutureC0239a = (InterfaceFutureC0239a) bVar.L3(this.f1973q, null, "BANNER", null, null).c.c();
        }
        x0.f fVar = new x0.f(23, this);
        interfaceFutureC0239a.a(new Nu(0, interfaceFutureC0239a, fVar), bVar.f1972p.a());
    }

    public final void O3() {
        C0937n6 c0937n6 = AbstractC1066q6.r8;
        r rVar = r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue() || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.u8)).booleanValue()) {
            return;
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.y8)).booleanValue() && this.f1969R.getAndSet(true)) {
            return;
        }
        N3();
    }

    public final void P3(ArrayList arrayList, InterfaceC1812a interfaceC1812a, InterfaceC0246Ba interfaceC0246Ba, boolean z4) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        InterfaceFutureC0239a interfaceFutureC0239a;
        Map map;
        if (!((Boolean) r.d.c.a(AbstractC1066q6.L6)).booleanValue()) {
            Y9.s("The updating URL feature is not enabled.");
            try {
                C1462za c1462za = (C1462za) interfaceC0246Ba;
                Parcel Q3 = c1462za.Q();
                Q3.writeString("The updating URL feature is not enabled.");
                c1462za.G1(Q3, 2);
                return;
            } catch (RemoteException e4) {
                Y9.q("", e4);
                return;
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList2 = this.f1966O;
            arrayList3 = this.N;
            if (i6 >= size) {
                break;
            }
            Object obj = arrayList.get(i6);
            i6++;
            if (R3((Uri) obj, arrayList3, arrayList2)) {
                i5++;
            }
        }
        if (i5 > 1) {
            Y9.s("Multiple google urls found: ".concat(String.valueOf(arrayList)));
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            Uri uri = (Uri) obj2;
            if (R3(uri, arrayList3, arrayList2)) {
                B0.k kVar = new B0.k(this, uri, interfaceC1812a, 2);
                Su su = this.f1977u;
                InterfaceFutureC0239a b4 = ((C0260Dc) su).b(kVar);
                C0264Ea c0264Ea = this.f1979w;
                if (c0264Ea == null || (map = c0264Ea.f4874p) == null || map.isEmpty()) {
                    Y9.r("Asset view map is empty.");
                    interfaceFutureC0239a = b4;
                } else {
                    interfaceFutureC0239a = Bs.n0(b4, new k(0, this), su);
                }
            } else {
                Y9.s("Not a Google URL: ".concat(String.valueOf(uri)));
                interfaceFutureC0239a = Bs.h0(uri);
            }
            arrayList4.add(interfaceFutureC0239a);
        }
        Eu eu = new Eu(AbstractC1137rt.r(arrayList4), true);
        eu.a(new Nu(0, eu, new p(this, interfaceC0246Ba, z4, 1)), this.f1972p.a());
    }

    public final void Q3(ArrayList arrayList, InterfaceC1812a interfaceC1812a, InterfaceC0246Ba interfaceC0246Ba, boolean z4) {
        Map map;
        if (!((Boolean) r.d.c.a(AbstractC1066q6.L6)).booleanValue()) {
            try {
                C1462za c1462za = (C1462za) interfaceC0246Ba;
                Parcel Q3 = c1462za.Q();
                Q3.writeString("The updating URL feature is not enabled.");
                c1462za.G1(Q3, 2);
                return;
            } catch (RemoteException e4) {
                Y9.q("", e4);
                return;
            }
        }
        B0.k kVar = new B0.k(this, arrayList, interfaceC1812a, 3);
        Su su = this.f1977u;
        InterfaceFutureC0239a b4 = ((C0260Dc) su).b(kVar);
        C0264Ea c0264Ea = this.f1979w;
        if (c0264Ea == null || (map = c0264Ea.f4874p) == null || map.isEmpty()) {
            Y9.r("Asset view map is empty.");
        } else {
            b4 = Bs.n0(b4, new k(1, this), su);
        }
        b4.a(new Nu(0, b4, new p(this, interfaceC0246Ba, z4, 0)), this.f1972p.a());
    }
}
