package E;

import C0.M;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.android.billingclient.api.SkuDetails;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.google.android.gms.internal.measurement.C1493b;
import com.google.android.gms.internal.measurement.C1498c;
import com.google.android.gms.internal.measurement.C1582v0;
import com.google.android.gms.internal.measurement.D0;
import com.google.android.gms.internal.measurement.E;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.G0;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.W;
import h2.y;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import k.C1748e;
import k.o;
import org.json.JSONException;
import org.json.JSONObject;
import t2.I;
import x2.AbstractC2080j0;
import x2.BinderC2074g0;
import x2.C2064b0;
import x2.C2065c;
import x2.C2066c0;
import x2.C2083l;
import x2.C2096s;
import x2.C2103v0;
import x2.C2109y0;
import x2.D;
import x2.EnumC2075h;
import x2.J0;
import x2.K;
import x2.M0;
import x2.O;
import x2.RunnableC2107x0;
import x2.T;
import x2.X;
import x2.X0;
import x2.Y0;
import x2.b1;
import x2.d1;
import x2.r;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f703o;

    /* renamed from: p, reason: collision with root package name */
    public Object f704p;

    /* renamed from: q, reason: collision with root package name */
    public Object f705q;

    /* renamed from: r, reason: collision with root package name */
    public Object f706r;

    public /* synthetic */ n(int i4) {
        this.f703o = i4;
    }

    public n(SkuDetails skuDetails, MainActivity mainActivity, M m4, A0.a aVar) {
        this.f703o = 8;
        this.f704p = skuDetails;
        this.f705q = mainActivity;
        this.f706r = aVar;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i4) {
        this.f703o = i4;
        this.f704p = obj;
        this.f705q = obj2;
        this.f706r = obj3;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i4, boolean z4) {
        this.f703o = i4;
        this.f706r = obj;
        this.f704p = obj2;
        this.f705q = obj3;
    }

    public n(C2109y0 c2109y0, String str, URL url, C1748e c1748e) {
        this.f703o = 18;
        this.f705q = c2109y0;
        y.e(str);
        this.f704p = url;
        this.f706r = c1748e;
    }

    private final void a() {
        JSONObject jSONObject;
        String str = (String) this.f704p;
        String str2 = (String) this.f705q;
        I[] iArr = (I[]) this.f706r;
        if (TextUtils.isEmpty(str)) {
            Log.d("UserMessagingPlatform", "Error on action: empty action name");
            return;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str2);
                return;
            }
        }
        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
        for (I i4 : iArr) {
            FutureTask futureTask = new FutureTask(new B0.k(i4, lowerCase, jSONObject));
            i4.b().execute(futureTask);
            try {
            } catch (InterruptedException e4) {
                Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e4);
            } catch (ExecutionException e5) {
                Log.d("UserMessagingPlatform", U.a.k("Failed to run Action[", lowerCase, "]: "), e5.getCause());
            }
            if (((Boolean) futureTask.get()).booleanValue()) {
                return;
            }
        }
    }

    private final void b() {
        w0.i h4 = ((WorkDatabase) this.f704p).n().h((String) this.f705q);
        if (h4 == null || !h4.b()) {
            return;
        }
        synchronized (((v0.b) this.f706r).f15016q) {
            ((v0.b) this.f706r).f15019t.put((String) this.f705q, h4);
            ((v0.b) this.f706r).f15020u.add(h4);
            v0.b bVar = (v0.b) this.f706r;
            bVar.f15021v.c(bVar.f15020u);
        }
    }

    private final void c() {
        r rVar;
        BinderC2074g0 binderC2074g0 = (BinderC2074g0) this.f704p;
        String str = (String) this.f705q;
        Bundle bundle = (Bundle) this.f706r;
        C2083l c2083l = binderC2074g0.f15665o.c;
        X0.I(c2083l);
        c2083l.g();
        c2083l.h();
        C2066c0 c2066c0 = (C2066c0) c2083l.f1719a;
        y.e(str);
        y.e("dep");
        TextUtils.isEmpty("");
        if (bundle == null || bundle.isEmpty()) {
            rVar = new r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    K k3 = c2066c0.f15568i;
                    C2066c0.i(k3);
                    k3.f15394f.a("Param name can't be null");
                    it.remove();
                } else {
                    b1 b1Var = c2066c0.f15571l;
                    C2066c0.g(b1Var);
                    Object k4 = b1Var.k(bundle2.get(next), next);
                    if (k4 == null) {
                        K k5 = c2066c0.f15568i;
                        C2066c0.i(k5);
                        k5.f15397i.b(c2066c0.f15572m.e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        b1 b1Var2 = c2066c0.f15571l;
                        C2066c0.g(b1Var2);
                        b1Var2.y(bundle2, next, k4);
                    }
                }
            }
            rVar = new r(bundle2);
        }
        O o4 = c2083l.f15438b.f15486g;
        X0.I(o4);
        D0 p3 = E0.p();
        if (p3.f11740q) {
            p3.f();
            p3.f11740q = false;
        }
        E0.A(0L, (E0) p3.f11739p);
        Bundle bundle3 = rVar.f15773o;
        for (String str2 : bundle3.keySet()) {
            G0 p4 = H0.p();
            p4.h(str2);
            Object obj = bundle3.get(str2);
            y.i(obj);
            o4.L(p4, obj);
            p3.i(p4);
        }
        byte[] b4 = ((E0) p3.d()).b();
        K k6 = c2066c0.f15568i;
        C2066c0.i(k6);
        k6.f15402n.c(c2066c0.f15572m.d(str), Integer.valueOf(b4.length), "Saving default event parameters, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", b4);
        try {
            if (c2083l.A().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                C2066c0.i(k6);
                k6.f15394f.b(K.n(str), "Failed to insert default event parameters (got -1). appId");
            }
        } catch (SQLiteException e4) {
            C2066c0.i(k6);
            k6.f15394f.c(K.n(str), e4, "Error storing default event parameters. appId");
        }
    }

    private final void d() {
        d1 d1Var = (d1) this.f705q;
        X0 x02 = ((BinderC2074g0) this.f706r).f15665o;
        x02.a();
        C2065c c2065c = (C2065c) this.f704p;
        if (c2065c.f15546q.h() == null) {
            x02.m(c2065c, d1Var);
        } else {
            x02.p(c2065c, d1Var);
        }
    }

    private final void e() {
        C1582v0 c1582v0;
        BinderC2074g0 binderC2074g0 = (BinderC2074g0) this.f706r;
        X0 x02 = binderC2074g0.f15665o;
        C2096s c2096s = (C2096s) this.f704p;
        String str = c2096s.f15781o;
        r rVar = c2096s.f15782p;
        if ("_cmp".equals(str) && rVar != null) {
            Bundle bundle = rVar.f15773o;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                    x02.c().f15400l.b(c2096s.toString(), "Event has been filtered ");
                    c2096s = new C2096s("_cmpx", c2096s.f15782p, c2096s.f15783q, c2096s.f15784r);
                }
            }
        }
        String str2 = c2096s.f15781o;
        d1 d1Var = (d1) this.f705q;
        X x4 = x02.f15482a;
        O o4 = x02.f15486g;
        X0.I(x4);
        String str3 = d1Var.f15603o;
        if (TextUtils.isEmpty(str3) || (c1582v0 = (C1582v0) x4.f15469h.get(str3)) == null || c1582v0.l() == 0) {
            binderC2074g0.Q(c2096s, d1Var);
            return;
        }
        x02.c().f15402n.b(str3, "EES config found for");
        X x5 = x02.f15482a;
        X0.I(x5);
        E e4 = TextUtils.isEmpty(str3) ? null : (E) x5.f15471j.g(str3);
        if (e4 == null) {
            x02.c().f15402n.b(str3, "EES not loaded for");
            binderC2074g0.Q(c2096s, d1Var);
            return;
        }
        try {
            C1498c c1498c = e4.c;
            X0.I(o4);
            HashMap K2 = O.K(c2096s.f15782p.h(), true);
            String f4 = AbstractC2080j0.f(str2, AbstractC2080j0.c, AbstractC2080j0.f15679a);
            if (f4 == null) {
                f4 = str2;
            }
            if (e4.b(new C1493b(f4, c2096s.f15784r, K2))) {
                if (c1498c.f11890b.equals(c1498c.f11889a)) {
                    binderC2074g0.Q(c2096s, d1Var);
                } else {
                    x02.c().f15402n.b(str2, "EES edited event");
                    X0.I(o4);
                    binderC2074g0.Q(O.D(c1498c.f11890b), d1Var);
                }
                if (c1498c.c.isEmpty()) {
                    return;
                }
                ArrayList arrayList = c1498c.c;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    C1493b c1493b = (C1493b) obj;
                    x02.c().f15402n.b(c1493b.f11880a, "EES logging created event");
                    X0.I(o4);
                    binderC2074g0.Q(O.D(c1493b), d1Var);
                }
                return;
            }
        } catch (W unused) {
            x02.c().f15394f.c(d1Var.f15604p, str2, "EES error. appId, eventName");
        }
        x02.c().f15402n.b(str2, "EES was not applied to event");
        binderC2074g0.Q(c2096s, d1Var);
    }

    private final void f() {
        d1 d1Var = (d1) this.f705q;
        X0 x02 = ((BinderC2074g0) this.f706r).f15665o;
        x02.a();
        Y0 y02 = (Y0) this.f704p;
        if (y02.h() == null) {
            x02.n(y02, d1Var);
        } else {
            x02.r(y02, d1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [E.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f705q
            x2.y0 r0 = (x2.C2109y0) r0
            java.lang.Object r1 = r0.f1719a
            x2.c0 r1 = (x2.C2066c0) r1
            java.lang.Object r0 = r0.f1719a
            x2.c0 r0 = (x2.C2066c0) r0
            x2.b0 r1 = r1.f15569j
            x2.C2066c0.i(r1)
            r1.k()
            r1 = 0
            r2 = 0
            java.lang.Object r3 = r9.f704p     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            java.net.URL r3 = (java.net.URL) r3     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            if (r4 == 0) goto L8f
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r3.setDefaultUseCaches(r1)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r0.getClass()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r0.getClass()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r0 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r3.setInstanceFollowRedirects(r1)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r0 = 1
            r3.setDoInput(r0)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            int r0 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L86
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L73
            r5.<init>()     // Catch: java.lang.Throwable -> L73
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L73
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L5f
        L55:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L5f
            if (r8 <= 0) goto L61
            r5.write(r7, r1, r8)     // Catch: java.lang.Throwable -> L5f
            goto L55
        L5f:
            r1 = move-exception
            goto L75
        L61:
            byte[] r1 = r5.toByteArray()     // Catch: java.lang.Throwable -> L5f
            r6.close()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r3.disconnect()
            r9.l(r0, r2, r1, r4)
            return
        L6f:
            r1 = move-exception
            goto L9c
        L71:
            r1 = move-exception
            goto Laa
        L73:
            r1 = move-exception
            r6 = r2
        L75:
            if (r6 == 0) goto L7a
            r6.close()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
        L7a:
            throw r1     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
        L7b:
            r1 = move-exception
        L7c:
            r4 = r2
            goto L9c
        L7e:
            r1 = move-exception
        L7f:
            r4 = r2
            goto Laa
        L81:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L7c
        L86:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L7f
        L8b:
            r0 = move-exception
            goto L97
        L8d:
            r0 = move-exception
            goto La5
        L8f:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
        L97:
            r3 = r1
            r1 = r0
            r0 = r3
            r3 = r2
            r4 = r3
        L9c:
            if (r3 == 0) goto La1
            r3.disconnect()
        La1:
            r9.l(r0, r2, r2, r4)
            throw r1
        La5:
            r3 = r1
            r1 = r0
            r0 = r3
            r3 = r2
            r4 = r3
        Laa:
            if (r3 == 0) goto Laf
            r3.disconnect()
        Laf:
            r9.l(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E.n.g():void");
    }

    private final void h() {
        AtomicReference atomicReference;
        T t4;
        AtomicReference atomicReference2;
        synchronized (((AtomicReference) this.f704p)) {
            try {
                try {
                    t4 = ((C2066c0) ((J0) this.f706r).f1719a).f15567h;
                    C2066c0.g(t4);
                } catch (RemoteException e4) {
                    K k3 = ((C2066c0) ((J0) this.f706r).f1719a).f15568i;
                    C2066c0.i(k3);
                    k3.f15394f.b(e4, "Failed to get app instance id");
                    atomicReference = (AtomicReference) this.f704p;
                }
                if (t4.l().f(EnumC2075h.f15669q)) {
                    J0 j02 = (J0) this.f706r;
                    D d = j02.d;
                    if (d != null) {
                        ((AtomicReference) this.f704p).set(d.U1((d1) this.f705q));
                        String str = (String) ((AtomicReference) this.f704p).get();
                        if (str != null) {
                            C2103v0 c2103v0 = ((C2066c0) ((J0) this.f706r).f1719a).f15575p;
                            C2066c0.h(c2103v0);
                            c2103v0.f15829g.set(str);
                            T t5 = ((C2066c0) ((J0) this.f706r).f1719a).f15567h;
                            C2066c0.g(t5);
                            t5.f15441f.c(str);
                        }
                        ((J0) this.f706r).q();
                        atomicReference = (AtomicReference) this.f704p;
                        atomicReference.notify();
                        return;
                    }
                    K k4 = ((C2066c0) j02.f1719a).f15568i;
                    C2066c0.i(k4);
                    k4.f15394f.a("Failed to get app instance id");
                    atomicReference2 = (AtomicReference) this.f704p;
                } else {
                    K k5 = ((C2066c0) ((J0) this.f706r).f1719a).f15568i;
                    C2066c0.i(k5);
                    k5.f15399k.a("Analytics storage consent denied; will not get app instance id");
                    C2103v0 c2103v02 = ((C2066c0) ((J0) this.f706r).f1719a).f15575p;
                    C2066c0.h(c2103v02);
                    c2103v02.f15829g.set(null);
                    T t6 = ((C2066c0) ((J0) this.f706r).f1719a).f15567h;
                    C2066c0.g(t6);
                    t6.f15441f.c(null);
                    ((AtomicReference) this.f704p).set(null);
                    atomicReference2 = (AtomicReference) this.f704p;
                }
                atomicReference2.notify();
            } catch (Throwable th) {
                ((AtomicReference) this.f704p).notify();
                throw th;
            }
        }
    }

    private final void i() {
        d1 d1Var = (d1) this.f704p;
        J j4 = (J) this.f705q;
        J0 j02 = (J0) this.f706r;
        C2066c0 c2066c0 = (C2066c0) j02.f1719a;
        String str = null;
        try {
            try {
                T t4 = c2066c0.f15567h;
                C2066c0.g(t4);
                if (t4.l().f(EnumC2075h.f15669q)) {
                    D d = j02.d;
                    if (d == null) {
                        K k3 = c2066c0.f15568i;
                        C2066c0.i(k3);
                        k3.f15394f.a("Failed to get app instance id");
                    } else {
                        str = d.U1(d1Var);
                        if (str != null) {
                            C2103v0 c2103v0 = c2066c0.f15575p;
                            C2066c0.h(c2103v0);
                            c2103v0.f15829g.set(str);
                            T t5 = c2066c0.f15567h;
                            C2066c0.g(t5);
                            t5.f15441f.c(str);
                        }
                        j02.q();
                    }
                } else {
                    K k4 = c2066c0.f15568i;
                    C2066c0.i(k4);
                    k4.f15399k.a("Analytics storage consent denied; will not get app instance id");
                    C2103v0 c2103v02 = c2066c0.f15575p;
                    C2066c0.h(c2103v02);
                    c2103v02.f15829g.set(null);
                    T t6 = c2066c0.f15567h;
                    C2066c0.g(t6);
                    t6.f15441f.c(null);
                }
            } catch (RemoteException e4) {
                K k5 = c2066c0.f15568i;
                C2066c0.i(k5);
                k5.f15394f.b(e4, "Failed to get app instance id");
            }
        } finally {
            b1 b1Var = c2066c0.f15571l;
            C2066c0.g(b1Var);
            b1Var.F(null, j4);
        }
    }

    private final void j() {
        d1 d1Var = (d1) this.f704p;
        J0 j02 = (J0) this.f706r;
        D d = j02.d;
        C2066c0 c2066c0 = (C2066c0) j02.f1719a;
        if (d == null) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.a("Failed to send default event parameters to service");
        } else {
            try {
                d.a3((Bundle) this.f705q, d1Var);
            } catch (RemoteException e4) {
                K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                k4.f15394f.b(e4, "Failed to send default event parameters to service");
            }
        }
    }

    private final void k() {
        o oVar = (o) this.f704p;
        K k3 = (K) this.f705q;
        JobParameters jobParameters = (JobParameters) this.f706r;
        k3.f15402n.a("AppMeasurementJobService processed last upload request.");
        ((M0) ((Service) oVar.f13452p)).c(jobParameters);
    }

    public void l(int i4, IOException iOException, byte[] bArr, Map map) {
        C2064b0 c2064b0 = ((C2066c0) ((C2109y0) this.f705q).f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new RunnableC2107x0(this, i4, iOException, bArr, map));
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0597  */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, B0.c] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E.n.run():void");
    }
}
