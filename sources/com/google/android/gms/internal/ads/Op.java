package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import b0.RunnableC0203p;
import c3.InterfaceFutureC0239a;
import h2.InterfaceC1703b;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l2.AbstractC1799b;
import l2.C1798a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Op implements InterfaceC0378a2, InterfaceC1703b, S1.h, S1.j, S1.l, Mu, Bh, InterfaceC0481ce, InterfaceC0749iq, InterfaceC0876lp {

    /* renamed from: s, reason: collision with root package name */
    public static Op f6521s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0847l2 f6522t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0847l2 f6523u;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6524o;

    /* renamed from: p, reason: collision with root package name */
    public Object f6525p;

    /* renamed from: q, reason: collision with root package name */
    public Object f6526q;

    /* renamed from: r, reason: collision with root package name */
    public Object f6527r;

    static {
        long j4 = -9223372036854775807L;
        f6522t = new C0847l2(2, j4);
        f6523u = new C0847l2(3, j4);
    }

    public Op(int i4) {
        this.f6524o = i4;
        switch (i4) {
            case 4:
                this.f6525p = new ArrayList();
                this.f6526q = new ArrayList();
                this.f6527r = new ArrayList();
                return;
            case 28:
                this.f6526q = new ArrayDeque();
                this.f6527r = null;
                this.f6525p = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                return;
            default:
                int i5 = AbstractC0751is.f9071a;
                this.f6525p = Executors.newSingleThreadExecutor(new ThreadFactoryC0341Tb("ExoPlayer:Loader:ProgressiveMediaPeriod"));
                return;
        }
    }

    public /* synthetic */ Op(int i4, Object obj, Object obj2) {
        this.f6524o = i4;
        this.f6525p = obj;
        this.f6526q = obj2;
    }

    public Op(Context context, O1.X x4) {
        this.f6524o = 0;
        this.f6527r = new AtomicReference();
        this.f6525p = context;
        this.f6526q = x4;
    }

    public Op(Context context, C0248Bc c0248Bc) {
        this.f6524o = 27;
        this.f6525p = context;
        this.f6526q = context.getPackageName();
        this.f6527r = c0248Bc.f4084o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public Op(JsonReader jsonReader) {
        this.f6524o = 23;
        ?? r02 = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        Ap ap = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        r02 = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            r02.add(new C1434yp(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        ap = new Ap(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = android.support.v4.media.session.a.E(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new Dp(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f6527r = arrayList;
        this.f6525p = r02;
        this.f6526q = ap == null ? new Ap(new JsonReader(new StringReader("{}"))) : ap;
    }

    public Op(Ep ep, C1434yp c1434yp, String str) {
        this.f6524o = 9;
        this.f6525p = ep;
        this.f6526q = c1434yp;
        this.f6527r = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public Op(Gi gi, InterfaceC1263uq interfaceC1263uq) {
        this.f6524o = 21;
        this.f6525p = gi;
        Bn bn = new Bn(interfaceC1263uq);
        this.f6526q = bn;
        this.f6527r = new Fn(bn, gi.f5318e);
    }

    public Op(Op op, C0260Dc c0260Dc) {
        this.f6524o = 22;
        this.f6527r = new C0347Uc(10, (byte) 0);
        this.f6525p = op;
        this.f6526q = c0260Dc;
    }

    public Op(Xp xp) {
        this.f6524o = 24;
        this.f6525p = new ConcurrentHashMap(xp.f7697s);
        this.f6526q = xp;
        this.f6527r = new Vp();
    }

    public Op(InterfaceC1283v9 interfaceC1283v9) {
        this.f6524o = 6;
        this.f6525p = interfaceC1283v9;
    }

    public /* synthetic */ Op(Object obj, Object obj2, Object obj3, int i4) {
        this.f6524o = i4;
        this.f6527r = obj;
        this.f6525p = obj2;
        this.f6526q = obj3;
    }

    public /* synthetic */ Op(Object obj, Object obj2, Object obj3, int i4, byte b4) {
        this.f6524o = i4;
        this.f6525p = obj;
        this.f6526q = obj2;
        this.f6527r = obj3;
    }

    public /* synthetic */ Op(Object obj, Object obj2, Object obj3, int i4, boolean z4) {
        this.f6524o = i4;
        this.f6525p = obj3;
        this.f6526q = obj;
        this.f6527r = obj2;
    }

    public Op(String str, int i4) {
        this.f6524o = i4;
        switch (i4) {
            case 29:
                Wl wl = new Wl(5, (byte) 0);
                this.f6526q = wl;
                this.f6527r = wl;
                this.f6525p = str;
                return;
            default:
                L1 l12 = new L1();
                l12.f6101j = str;
                this.f6525p = new C0976o2(l12);
                return;
        }
    }

    public Op(C1798a c1798a) {
        this.f6524o = 26;
        this.f6525p = c1798a;
        this.f6526q = new HashMap();
        this.f6527r = new HashMap();
    }

    public static Op j(Reader reader) {
        try {
            try {
                return new Op(new JsonReader(reader));
            } finally {
                AbstractC1799b.c(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e4) {
            throw new Xk("unable to parse ServerResponse", e4);
        }
    }

    public static String s(int i4) {
        int i5 = i4 - 1;
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public static Op u(Context context) {
        synchronized (Op.class) {
            try {
                Op op = f6521s;
                if (op != null) {
                    return op;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) P6.f6568b.r()).longValue();
                O1.X x4 = null;
                if (longValue > 0 && longValue <= 234310600) {
                    try {
                        x4 = O1.W.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e4) {
                        Y9.q("Failed to retrieve lite SDK info.", e4);
                    }
                }
                Op op2 = new Op(applicationContext, x4);
                f6521s = op2;
                return op2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean A(Zp zp) {
        Tp tp = (Tp) ((ConcurrentHashMap) this.f6525p).get(zp);
        if (tp == null) {
            return true;
        }
        Xp xp = (Xp) this.f6526q;
        tp.a();
        return tp.f7088a.size() < xp.f7697s;
    }

    public void B() {
        Xp xp = (Xp) this.f6526q;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.A5)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(xp.f7695q);
            sb.append(" PoolCollection");
            Vp vp = (Vp) this.f6527r;
            sb.append("\n\tPool does not exist: " + vp.d + "\n\tNew pools created: " + vp.f7293b + "\n\tPools removed: " + vp.c + "\n\tEntries added: " + vp.f7295f + "\n\tNo entries retrieved: " + vp.f7294e + "\n");
            int i4 = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f6525p).entrySet()) {
                i4++;
                sb.append(i4);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((Zp) entry.getKey()).hashCode());
                sb.append("    ");
                int i5 = 0;
                while (true) {
                    Tp tp = (Tp) entry.getValue();
                    tp.a();
                    if (i5 >= tp.f7088a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i5++;
                }
                Tp tp2 = (Tp) entry.getValue();
                tp2.a();
                for (int size = tp2.f7088a.size(); size < xp.f7697s; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                C0707hq c0707hq = ((Tp) entry.getValue()).d;
                sb.append("Created: " + c0707hq.f8996a + " Last accessed: " + c0707hq.c + " Accesses: " + c0707hq.d + "\nEntries retrieved: Valid: " + c0707hq.f8998e + " Stale: " + c0707hq.f8999f);
                sb.append("\n");
            }
            while (i4 < xp.f7696r) {
                i4++;
                sb.append(i4);
                sb.append(".\n");
            }
            Y9.m(sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(com.google.android.gms.internal.ads.InterfaceC1069q9 r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6527r
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            com.google.android.gms.internal.ads.J2 r1 = com.google.android.gms.internal.ads.P6.f6567a
            java.lang.Object r1 = r1.r()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L37
            java.lang.Object r1 = r3.f6526q
            O1.X r1 = (O1.X) r1
            if (r1 != 0) goto L1b
        L19:
            r1 = r2
            goto L1f
        L1b:
            com.google.android.gms.internal.ads.q9 r1 = r1.getAdapterCreator()     // Catch: android.os.RemoteException -> L19
        L1f:
            if (r1 == 0) goto L22
            goto L23
        L22:
            r1 = r4
        L23:
            boolean r4 = r0.compareAndSet(r2, r1)
            if (r4 == 0) goto L2a
            goto L4a
        L2a:
            java.lang.Object r4 = r0.get()
            if (r4 == 0) goto L23
            java.lang.Object r4 = r0.get()
            if (r4 == 0) goto L23
            goto L4a
        L37:
            boolean r1 = r0.compareAndSet(r2, r4)
            if (r1 == 0) goto L3e
            goto L4a
        L3e:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L37
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Op.C(com.google.android.gms.internal.ads.q9):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0481ce
    public void F(String str, int i4, String str2, boolean z4) {
        switch (this.f6524o) {
            case 14:
                C0956nj c0956nj = (C0956nj) this.f6525p;
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f6526q;
                C0594f5 c0594f5 = (C0594f5) this.f6527r;
                O1.R0 r02 = c0956nj.f9765a.f5908a;
                if (r02 != null && interfaceC0308Md.p() != null) {
                    interfaceC0308Md.p().M3(r02);
                }
                c0594f5.d();
                return;
            default:
                C0956nj c0956nj2 = (C0956nj) this.f6525p;
                ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = ((C0348Ud) this.f6526q).f7165o;
                C0594f5 c0594f52 = (C0594f5) this.f6527r;
                O1.R0 r03 = c0956nj2.f9765a.f5908a;
                if (z4) {
                    if (r03 != null && viewTreeObserverOnGlobalLayoutListenerC0358Wd.p() != null) {
                        viewTreeObserverOnGlobalLayoutListenerC0358Wd.p().M3(r03);
                    }
                    c0594f52.d();
                    return;
                }
                c0594f52.c(new Xk("Html video Web View failed to load. Error code: " + i4 + ", Description: " + str + ", Failing URL: " + str2, 1));
                return;
        }
    }

    @Override // h2.InterfaceC1703b
    public void O(int i4) {
    }

    @Override // h2.InterfaceC1703b
    public void Q() {
        synchronized (((A2.o) this.f6527r).f36q) {
            try {
                try {
                    A2.o oVar = (A2.o) this.f6527r;
                    if (oVar.f35p) {
                        return;
                    }
                    oVar.f35p = true;
                    C0466c5 c0466c5 = (C0466c5) oVar.f37r;
                    if (c0466c5 == null) {
                        return;
                    }
                    InterfaceFutureC0239a a4 = AbstractC0266Ec.f4897a.a(new J1.a(this, c0466c5, (C0509d5) this.f6525p, (C0594f5) this.f6526q, 7));
                    C0594f5 c0594f5 = (C0594f5) this.f6526q;
                    c0594f5.f5017o.a(new RunnableC0203p(5, c0594f5, a4), AbstractC0266Ec.f4900f);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0876lp
    public /* bridge */ /* synthetic */ InterfaceFutureC0239a a(Wl wl, InterfaceC0833kp interfaceC0833kp) {
        return o(wl, interfaceC0833kp, null);
    }

    public void b() {
        h2.y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdFailedToLoad with error 0.");
        try {
            ((InterfaceC1283v9) this.f6525p).v(0);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    public void c(H1.a aVar) {
        h2.y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.f855p + ". ErrorMessage: " + ((String) aVar.f856q) + ". ErrorDomain: " + ((String) aVar.f857r));
        try {
            ((InterfaceC1283v9) this.f6525p).H1(aVar.a());
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0378a2
    public void d(Sr sr, D d, C0591f2 c0591f2) {
        this.f6526q = sr;
        c0591f2.a();
        c0591f2.b();
        V z4 = d.z(c0591f2.d, 5);
        this.f6527r = z4;
        z4.a((C0976o2) this.f6525p);
    }

    public void e(H1.a aVar) {
        h2.y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.f855p + ". ErrorMessage: " + ((String) aVar.f856q) + ". ErrorDomain: " + ((String) aVar.f857r));
        try {
            ((InterfaceC1283v9) this.f6525p).H1(aVar.a());
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0378a2
    public void f(C1134rq c1134rq) {
        long c;
        Zf.C((Sr) this.f6526q);
        int i4 = AbstractC0751is.f9071a;
        Sr sr = (Sr) this.f6526q;
        synchronized (sr) {
            try {
                long j4 = sr.c;
                c = j4 != -9223372036854775807L ? j4 + sr.f7018b : sr.c();
            } finally {
            }
        }
        long d = ((Sr) this.f6526q).d();
        if (c == -9223372036854775807L || d == -9223372036854775807L) {
            return;
        }
        C0976o2 c0976o2 = (C0976o2) this.f6525p;
        if (d != c0976o2.f9817o) {
            L1 l12 = new L1(c0976o2);
            l12.f6105n = d;
            C0976o2 c0976o22 = new C0976o2(l12);
            this.f6525p = c0976o22;
            ((V) this.f6527r).a(c0976o22);
        }
        int g4 = c1134rq.g();
        ((V) this.f6527r).f(g4, c1134rq);
        ((V) this.f6527r).d(c, 1, g4, 0, null);
    }

    public void g(H1.a aVar) {
        h2.y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.f855p + ". ErrorMessage: " + ((String) aVar.f856q) + ". ErrorDomain: " + ((String) aVar.f857r));
        try {
            ((InterfaceC1283v9) this.f6525p).H1(aVar.a());
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.Hu, com.google.android.gms.internal.ads.yu, c3.a] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.ads.Hu, com.google.android.gms.internal.ads.yu, c3.a] */
    public C0381a5 h(Callable callable) {
        List list = (List) this.f6526q;
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        list.getClass();
        AbstractC1137rt r4 = AbstractC1137rt.r(list);
        CallableC0851l6 callableC0851l6 = CallableC0851l6.f9367g;
        C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
        ?? abstractC1439yu = new AbstractC1439yu(r4, true, false);
        abstractC1439yu.f5517D = new Gu(abstractC1439yu, callableC0851l6, c0260Dc);
        abstractC1439yu.v();
        C1006oq c1006oq = (C1006oq) this.f6527r;
        Su su = c1006oq.f9859a;
        ?? abstractC1439yu2 = new AbstractC1439yu(r4, true, false);
        abstractC1439yu2.f5517D = new Gu(abstractC1439yu2, callable, su);
        abstractC1439yu2.v();
        return new C0381a5(c1006oq, (EnumC0877lq) this.f6525p, null, abstractC1439yu, (List) this.f6526q, abstractC1439yu2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0876lp
    public /* bridge */ /* synthetic */ Object i() {
        return null;
    }

    public synchronized String k() {
        Fg fg;
        try {
            fg = (Fg) this.f6527r;
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
            return null;
        }
        return fg != null ? fg.f5059o : null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        Xl xl = (Xl) this.f6525p;
        C0242Ac c0242Ac = (C0242Ac) this.f6526q;
        String str = (String) this.f6527r;
        xl.getClass();
        xl.f7690p.execute(new RunnableC0801k((SQLiteDatabase) obj, str, c0242Ac, 5));
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l, reason: collision with other method in class */
    public void mo3l(Object obj) {
        ((Ig) obj).y((BinderC0606fb) this.f6525p, (String) this.f6526q, (String) this.f6527r);
    }

    public ArrayList m() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f6526q;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            String str = (String) O1.r.d.c.a((C0937n6) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        AbstractC1230u.K(arrayList3, J2.j("gad:dynamite_module:experiment_id", ""));
        AbstractC1230u.K(arrayList3, K6.f5972a);
        AbstractC1230u.K(arrayList3, K6.f5973b);
        AbstractC1230u.K(arrayList3, K6.c);
        AbstractC1230u.K(arrayList3, K6.d);
        AbstractC1230u.K(arrayList3, K6.f5974e);
        AbstractC1230u.K(arrayList3, K6.f5990u);
        AbstractC1230u.K(arrayList3, K6.f5975f);
        AbstractC1230u.K(arrayList3, K6.f5982m);
        AbstractC1230u.K(arrayList3, K6.f5983n);
        AbstractC1230u.K(arrayList3, K6.f5984o);
        AbstractC1230u.K(arrayList3, K6.f5985p);
        AbstractC1230u.K(arrayList3, K6.f5986q);
        AbstractC1230u.K(arrayList3, K6.f5987r);
        AbstractC1230u.K(arrayList3, K6.f5988s);
        AbstractC1230u.K(arrayList3, K6.f5989t);
        AbstractC1230u.K(arrayList3, K6.f5976g);
        AbstractC1230u.K(arrayList3, K6.f5977h);
        AbstractC1230u.K(arrayList3, K6.f5978i);
        AbstractC1230u.K(arrayList3, K6.f5979j);
        AbstractC1230u.K(arrayList3, K6.f5980k);
        AbstractC1230u.K(arrayList3, K6.f5981l);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public void n(HashMap hashMap) {
        hashMap.put("s", "gmob_sdk");
        hashMap.put("v", "3");
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_v", Build.VERSION.SDK);
        N1.n nVar = N1.n.f1204A;
        Q1.N n4 = nVar.c;
        C1035pc c1035pc = nVar.f1209g;
        hashMap.put("device", Q1.N.E());
        hashMap.put("app", (String) this.f6526q);
        Context context = (Context) this.f6525p;
        hashMap.put("is_lite_sdk", true != Q1.N.c(context) ? "0" : "1");
        C0937n6 c0937n6 = AbstractC1066q6.f10197a;
        O1.r rVar = O1.r.d;
        Op op = rVar.f1379a;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        ArrayList t4 = op.t();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.c6)).booleanValue()) {
            t4.addAll(c1035pc.c().x().f9739i);
        }
        hashMap.put("e", TextUtils.join(",", t4));
        hashMap.put("sdkVersion", (String) this.f6527r);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.B9)).booleanValue()) {
            hashMap.put("is_bstar", true != Q1.N.a(context) ? "0" : "1");
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.p8)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10147P1)).booleanValue()) {
            hashMap.put("plugin", Bs.O(c1035pc.f9972g));
        }
    }

    public InterfaceFutureC0239a o(Wl wl, InterfaceC0833kp interfaceC0833kp, InterfaceC1425yg interfaceC1425yg) {
        InterfaceFutureC0239a h02;
        InterfaceFutureC0239a Z4;
        Op op = (Op) this.f6525p;
        Executor executor = (Executor) this.f6526q;
        u0.g gVar = new u0.g(op, interfaceC1425yg, executor);
        C0706hp c0706hp = (C0706hp) gVar.f14986s;
        if (c0706hp == null) {
            if (((Boolean) U6.f7142a.r()).booleanValue()) {
                C0781jg c = interfaceC1425yg.c();
                Xp xp = (Xp) op.f6526q;
                V2.j jVar = c.f9175i;
                C0834kq d = c.c.b(jVar.b(), EnumC0877lq.f9479K).r(new N1.c(4, c, xp)).d();
                C0874ln c0874ln = new C0874ln(21, c);
                d.a(new Nu(0, d, c0874ln), c.f9176j);
                Z4 = Bs.Z(Bs.m0(Ku.q(d), new C0663gp(gVar, 1), executor), C1001ol.class, new C0663gp(gVar, 0), executor);
            } else {
                C0706hp c0706hp2 = new C0706hp(null, gVar.D());
                gVar.f14986s = c0706hp2;
                Z4 = Bs.h0(c0706hp2);
            }
            h02 = Bs.m0(Z4, C0932n1.f9709s, executor);
        } else {
            h02 = Bs.h0(c0706hp);
        }
        return Bs.Z(Bs.n0(Ku.q(h02), new N1.c(13, this, interfaceC1425yg), executor), Exception.class, new C0932n1(21), executor);
    }

    public Ap p() {
        return (Ap) ((Ep) this.f6525p).f4943b.f6526q;
    }

    public synchronized String q() {
        Fg fg;
        try {
            fg = (Fg) this.f6527r;
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
            return null;
        }
        return fg != null ? fg.f5059o : null;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo4r(Object obj) {
        ((C0260Dc) ((C0567ef) this.f6527r).f8625e).a(new RunnableC0525df((Oq) this.f6525p, (String) obj, 0));
    }

    public ArrayList t() {
        ArrayList m4 = m();
        ArrayList arrayList = (ArrayList) this.f6527r;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str = (String) O1.r.d.c.a((C0937n6) obj);
            if (!TextUtils.isEmpty(str)) {
                m4.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        AbstractC1230u.K(arrayList2, Y6.f7748a);
        m4.addAll(arrayList2);
        return m4;
    }

    public String toString() {
        switch (this.f6524o) {
            case 29:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f6525p);
                sb.append('{');
                Wl wl = (Wl) ((Wl) this.f6526q).f7564q;
                String str = "";
                while (wl != null) {
                    Object obj = wl.f7563p;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    wl = (Wl) wl.f7564q;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public synchronized void v(O1.U0 u02, int i4) {
        this.f6527r = null;
        Hn hn = new Hn(i4);
        Xj xj = new Xj(11, this);
        ((C0381a5) this.f6525p).k(u02, (String) this.f6526q, hn, xj);
    }

    public synchronized void w(Zp zp, Yp yp) {
        try {
            Tp tp = (Tp) ((ConcurrentHashMap) this.f6525p).get(zp);
            N1.n.f1204A.f1212j.getClass();
            yp.d = System.currentTimeMillis();
            if (tp == null) {
                Xp xp = (Xp) this.f6526q;
                Tp tp2 = new Tp(xp.f7697s, xp.f7698t * 1000);
                if (((ConcurrentHashMap) this.f6525p).size() == ((Xp) this.f6526q).f7696r) {
                    int i4 = ((Xp) this.f6526q).f7702x;
                    int i5 = i4 - 1;
                    Zp zp2 = null;
                    if (i4 == 0) {
                        throw null;
                    }
                    long j4 = Long.MAX_VALUE;
                    if (i5 == 0) {
                        for (Map.Entry entry : ((ConcurrentHashMap) this.f6525p).entrySet()) {
                            if (((Tp) entry.getValue()).d.f8996a < j4) {
                                j4 = ((Tp) entry.getValue()).d.f8996a;
                                zp2 = (Zp) entry.getKey();
                            }
                        }
                        if (zp2 != null) {
                            ((ConcurrentHashMap) this.f6525p).remove(zp2);
                        }
                    } else if (i5 == 1) {
                        for (Map.Entry entry2 : ((ConcurrentHashMap) this.f6525p).entrySet()) {
                            if (((Tp) entry2.getValue()).d.c < j4) {
                                j4 = ((Tp) entry2.getValue()).d.c;
                                zp2 = (Zp) entry2.getKey();
                            }
                        }
                        if (zp2 != null) {
                            ((ConcurrentHashMap) this.f6525p).remove(zp2);
                        }
                    } else if (i5 == 2) {
                        int i6 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : ((ConcurrentHashMap) this.f6525p).entrySet()) {
                            if (((Tp) entry3.getValue()).d.d < i6) {
                                i6 = ((Tp) entry3.getValue()).d.d;
                                zp2 = (Zp) entry3.getKey();
                            }
                        }
                        if (zp2 != null) {
                            ((ConcurrentHashMap) this.f6525p).remove(zp2);
                        }
                    }
                    Vp vp = (Vp) this.f6527r;
                    vp.c++;
                    vp.f7292a.f7195p = true;
                }
                ((ConcurrentHashMap) this.f6525p).put(zp, tp2);
                Vp vp2 = (Vp) this.f6527r;
                vp2.f7293b++;
                vp2.f7292a.f7194o = true;
                tp = tp2;
            }
            C0707hq c0707hq = tp.d;
            c0707hq.getClass();
            N1.n.f1204A.f1212j.getClass();
            c0707hq.c = System.currentTimeMillis();
            c0707hq.d++;
            tp.a();
            LinkedList linkedList = tp.f7088a;
            if (linkedList.size() != tp.f7089b) {
                linkedList.add(yp);
            }
            Vp vp3 = (Vp) this.f6527r;
            vp3.f7295f++;
            Up up = vp3.f7292a;
            Up clone = up.clone();
            up.f7194o = false;
            up.f7195p = false;
            C0664gq c0664gq = tp.d.f8997b;
            C0664gq clone2 = c0664gq.clone();
            c0664gq.f8871o = false;
            c0664gq.f8872p = 0;
            C1022p5 v4 = C1236u5.v();
            C0936n5 v5 = C0979o5.v();
            v5.d();
            C0979o5.y((C0979o5) v5.f4561p);
            C1150s5 v6 = C1193t5.v();
            boolean z4 = clone.f7194o;
            v6.d();
            C1193t5.w((C1193t5) v6.f4561p, z4);
            boolean z5 = clone.f7195p;
            v6.d();
            C1193t5.x((C1193t5) v6.f4561p, z5);
            int i7 = clone2.f8872p;
            v6.d();
            C1193t5.y((C1193t5) v6.f4561p, i7);
            v5.d();
            C0979o5.x((C0979o5) v5.f4561p, (C1193t5) v6.b());
            v4.d();
            C1236u5.w((C1236u5) v4.f4561p, (C0979o5) v5.b());
            yp.f7898a.c().f9172f.t0((C1236u5) v4.b());
            B();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void x(String str, String str2) {
        HashMap hashMap = (HashMap) this.f6526q;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new ArrayList());
        }
        ((List) hashMap.get(str)).add(str2);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        ((C0260Dc) ((C0567ef) this.f6527r).f8625e).a(new J1.a(this, th, (Oq) this.f6525p, (String) this.f6526q));
    }

    public synchronized boolean z() {
        boolean z4;
        C0611fg c0611fg = (C0611fg) ((C0381a5) this.f6525p).f8081t;
        if (c0611fg != null) {
            z4 = c0611fg.c;
        }
        return z4;
    }
}
