package com.google.android.gms.internal.ads;

import O1.InterfaceC0068i0;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import b0.RunnableC0203p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ok {

    /* renamed from: a, reason: collision with root package name */
    public final Qk f6494a;

    /* renamed from: b, reason: collision with root package name */
    public final Wk f6495b;
    public final Ek c;
    public final Kk d;

    /* renamed from: e, reason: collision with root package name */
    public final E0.a f6496e;

    /* renamed from: f, reason: collision with root package name */
    public final Vk f6497f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6498g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6499h;

    /* renamed from: m, reason: collision with root package name */
    public JSONObject f6504m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6507p;

    /* renamed from: q, reason: collision with root package name */
    public int f6508q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6509r;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f6500i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f6501j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f6502k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public String f6503l = "{}";

    /* renamed from: n, reason: collision with root package name */
    public long f6505n = Long.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public Lk f6506o = Lk.f6153o;

    /* renamed from: s, reason: collision with root package name */
    public Nk f6510s = Nk.f6372o;

    /* renamed from: t, reason: collision with root package name */
    public long f6511t = 0;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, E0.a] */
    public Ok(Qk qk, Wk wk, Ek ek, Context context, C0248Bc c0248Bc, Kk kk, Vk vk, String str) {
        this.f6494a = qk;
        this.f6495b = wk;
        this.c = ek;
        ?? obj = new Object();
        obj.f711s = "";
        obj.f709q = context;
        obj.f710r = context.getApplicationInfo();
        C0937n6 c0937n6 = AbstractC1066q6.c8;
        O1.r rVar = O1.r.d;
        obj.f707o = ((Integer) rVar.c.a(c0937n6)).intValue();
        obj.f708p = ((Integer) rVar.c.a(AbstractC1066q6.d8)).intValue();
        this.f6496e = obj;
        this.f6498g = c0248Bc.f4084o;
        this.f6499h = str;
        this.d = kk;
        this.f6497f = vk;
        N1.n.f1204A.f1215m.f1272g = this;
    }

    public final synchronized C0272Fc a(String str) {
        C0272Fc c0272Fc;
        try {
            c0272Fc = new C0272Fc();
            if (this.f6501j.containsKey(str)) {
                c0272Fc.b((Hk) this.f6501j.get(str));
            } else {
                if (!this.f6502k.containsKey(str)) {
                    this.f6502k.put(str, new ArrayList());
                }
                ((List) this.f6502k.get(str)).add(c0272Fc);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0272Fc;
    }

    public final synchronized void b(String str, Hk hk) {
        C0937n6 c0937n6 = AbstractC1066q6.P7;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue() && f()) {
            if (this.f6508q >= ((Integer) rVar.c.a(AbstractC1066q6.R7)).intValue()) {
                Y9.s("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f6500i.containsKey(str)) {
                this.f6500i.put(str, new ArrayList());
            }
            this.f6508q++;
            ((List) this.f6500i.get(str)).add(hk);
            if (((Boolean) rVar.c.a(AbstractC1066q6.n8)).booleanValue()) {
                String str2 = hk.f5495q;
                this.f6501j.put(str2, hk);
                if (this.f6502k.containsKey(str2)) {
                    List list = (List) this.f6502k.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C0272Fc) it.next()).b(hk);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void c() {
        C0937n6 c0937n6 = AbstractC1066q6.P7;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            if (((Boolean) rVar.c.a(AbstractC1066q6.e8)).booleanValue() && N1.n.f1204A.f1209g.c().p()) {
                i();
                return;
            }
            String C4 = N1.n.f1204A.f1209g.c().C();
            if (TextUtils.isEmpty(C4)) {
                return;
            }
            try {
                if (new JSONObject(C4).optBoolean("isTestMode", false)) {
                    i();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void d(InterfaceC0068i0 interfaceC0068i0, Nk nk) {
        if (!f()) {
            try {
                interfaceC0068i0.Z0(Zf.L(18, null, null));
                return;
            } catch (RemoteException unused) {
                Y9.s("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.P7)).booleanValue()) {
            this.f6510s = nk;
            this.f6494a.a(interfaceC0068i0, new X7(5, this), new X7(3, this.f6497f));
            return;
        } else {
            try {
                interfaceC0068i0.Z0(Zf.L(1, null, null));
                return;
            } catch (RemoteException unused2) {
                Y9.s("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final void e(boolean z4) {
        if (!this.f6509r && z4) {
            i();
        }
        l(z4, true);
    }

    public final synchronized boolean f() {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.e8)).booleanValue()) {
            return this.f6507p || N1.n.f1204A.f1215m.j();
        }
        return this.f6507p;
    }

    public final synchronized boolean g() {
        return this.f6507p;
    }

    public final synchronized JSONObject h() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f6500i.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (Hk hk : (List) entry.getValue()) {
                    if (hk.f5497s != Gk.f5325o) {
                        jSONArray.put(hk.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void i() {
        this.f6509r = true;
        Kk kk = this.d;
        kk.getClass();
        O1.C0 c02 = new O1.C0(1, kk);
        Ck ck = kk.f6047a;
        ck.getClass();
        ck.f4527e.f5017o.a(new RunnableC0203p(26, ck, c02), ck.f4532j);
        this.f6494a.f6682q = this;
        this.f6495b.f7560f = this;
        this.c.f4921i = this;
        this.f6497f.f7280t = this;
        String C4 = N1.n.f1204A.f1209g.c().C();
        synchronized (this) {
            if (TextUtils.isEmpty(C4)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(C4);
                l(jSONObject.optBoolean("isTestMode", false), false);
                k((Lk) Enum.valueOf(Lk.class, jSONObject.optString("gesture", "NONE")), false);
                this.f6503l = jSONObject.optString("networkExtras", "{}");
                this.f6505n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
            } catch (JSONException unused) {
            }
        }
    }

    public final void j() {
        String jSONObject;
        N1.n nVar = N1.n.f1204A;
        Q1.K c = nVar.f1209g.c();
        synchronized (this) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("isTestMode", this.f6507p);
                jSONObject2.put("gesture", this.f6506o);
                long j4 = this.f6505n;
                nVar.f1212j.getClass();
                if (j4 > System.currentTimeMillis() / 1000) {
                    jSONObject2.put("networkExtras", this.f6503l);
                    jSONObject2.put("networkExtrasExpirationSecs", this.f6505n);
                }
            } catch (JSONException unused) {
            }
            jSONObject = jSONObject2.toString();
        }
        c.g(jSONObject);
    }

    public final synchronized void k(Lk lk, boolean z4) {
        try {
            if (this.f6506o != lk) {
                if (f()) {
                    m();
                }
                this.f6506o = lk;
                if (f()) {
                    n();
                }
                if (z4) {
                    j();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void l(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f6507p     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f6507p = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.n6 r2 = com.google.android.gms.internal.ads.AbstractC1066q6.e8     // Catch: java.lang.Throwable -> L27
            O1.r r0 = O1.r.d     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.p6 r0 = r0.c     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            N1.n r2 = N1.n.f1204A     // Catch: java.lang.Throwable -> L27
            O1.D0 r2 = r2.f1215m     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.j()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.n()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.f()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.m()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.j()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ok.l(boolean, boolean):void");
    }

    public final synchronized void m() {
        int ordinal = this.f6506o.ordinal();
        if (ordinal == 1) {
            this.f6495b.a();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.c.a();
        }
    }

    public final synchronized void n() {
        int ordinal = this.f6506o.ordinal();
        if (ordinal == 1) {
            this.f6495b.b();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.c.b();
        }
    }
}
