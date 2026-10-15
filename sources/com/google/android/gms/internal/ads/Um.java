package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import c3.InterfaceFutureC0239a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Um {

    /* renamed from: a, reason: collision with root package name */
    public final C1798a f7176a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.g f7177b;
    public final Oq c;
    public final LinkedHashMap d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7178e = ((Boolean) O1.r.d.c.a(AbstractC1066q6.a6)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    public final C0959nm f7179f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7180g;

    /* renamed from: h, reason: collision with root package name */
    public long f7181h;

    /* renamed from: i, reason: collision with root package name */
    public long f7182i;

    public Um(C1798a c1798a, u0.g gVar, C0959nm c0959nm, Oq oq) {
        this.f7176a = c1798a;
        this.f7177b = gVar;
        this.f7179f = c0959nm;
        this.c = oq;
    }

    public static boolean h(Um um, C1434yp c1434yp) {
        synchronized (um) {
            Tm tm = (Tm) um.d.get(c1434yp);
            if (tm == null) {
                return false;
            }
            return tm.c == 8;
        }
    }

    public final synchronized long a() {
        return this.f7181h;
    }

    public final synchronized void b(Ep ep, C1434yp c1434yp, InterfaceFutureC0239a interfaceFutureC0239a, Nq nq) {
        Ap ap = (Ap) ep.f4943b.f6526q;
        this.f7176a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = c1434yp.f11540w;
        if (str != null) {
            this.d.put(c1434yp, new Tm(str, c1434yp.f11509f0, 7, 0L, null));
            Sm sm = new Sm(this, elapsedRealtime, ap, c1434yp, str, nq, ep);
            interfaceFutureC0239a.a(new Nu(0, interfaceFutureC0239a, sm), AbstractC0266Ec.f4900f);
        }
    }

    public final synchronized String c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Tm tm = (Tm) ((Map.Entry) it.next()).getValue();
                if (tm.c != Integer.MAX_VALUE) {
                    arrayList.add(tm.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void d(C1434yp c1434yp) {
        try {
            this.f7176a.getClass();
            this.f7181h = SystemClock.elapsedRealtime() - this.f7182i;
            if (c1434yp != null) {
                this.f7179f.a(c1434yp);
            }
            this.f7180g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(List list) {
        this.f7176a.getClass();
        this.f7182i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1434yp c1434yp = (C1434yp) it.next();
            if (!TextUtils.isEmpty(c1434yp.f11540w)) {
                this.d.put(c1434yp, new Tm(c1434yp.f11540w, c1434yp.f11509f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void f() {
        this.f7176a.getClass();
        this.f7182i = SystemClock.elapsedRealtime();
    }

    public final synchronized void g(C1434yp c1434yp) {
        Tm tm = (Tm) this.d.get(c1434yp);
        if (tm == null || this.f7180g) {
            return;
        }
        tm.c = 8;
    }
}
