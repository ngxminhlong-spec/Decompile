package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Eq implements Runnable {

    /* renamed from: p, reason: collision with root package name */
    public final Fq f4945p;

    /* renamed from: q, reason: collision with root package name */
    public String f4946q;

    /* renamed from: r, reason: collision with root package name */
    public String f4947r;

    /* renamed from: s, reason: collision with root package name */
    public Op f4948s;

    /* renamed from: t, reason: collision with root package name */
    public C0101z0 f4949t;

    /* renamed from: u, reason: collision with root package name */
    public ScheduledFuture f4950u;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f4944o = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public int f4951v = 2;

    public Eq(Fq fq) {
        this.f4945p = fq;
    }

    public final synchronized void a(Aq aq) {
        try {
            if (((Boolean) G6.c.r()).booleanValue()) {
                ArrayList arrayList = this.f4944o;
                aq.g();
                arrayList.add(aq);
                ScheduledFuture scheduledFuture = this.f4950u;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f4950u = AbstractC0266Ec.d.schedule(this, ((Integer) O1.r.d.c.a(AbstractC1066q6.I7)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str) {
        boolean matches;
        if (((Boolean) G6.c.r()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) O1.r.d.c.a(AbstractC1066q6.J7), str);
            }
            if (matches) {
                this.f4946q = str;
            }
        }
    }

    public final synchronized void c(C0101z0 c0101z0) {
        if (((Boolean) G6.c.r()).booleanValue()) {
            this.f4949t = c0101z0;
        }
    }

    public final synchronized void d(ArrayList arrayList) {
        try {
            if (((Boolean) G6.c.r()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains("BANNER")) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains("INTERSTITIAL")) {
                        if (!arrayList.contains("native") && !arrayList.contains("NATIVE")) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains("REWARDED")) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.f4951v = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                                    this.f4951v = 6;
                                }
                            }
                            this.f4951v = 5;
                        }
                        this.f4951v = 8;
                    }
                    this.f4951v = 4;
                }
                this.f4951v = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(String str) {
        if (((Boolean) G6.c.r()).booleanValue()) {
            this.f4947r = str;
        }
    }

    public final synchronized void f(Op op) {
        if (((Boolean) G6.c.r()).booleanValue()) {
            this.f4948s = op;
        }
    }

    public final synchronized void g() {
        try {
            if (((Boolean) G6.c.r()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f4950u;
                int i4 = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f4944o;
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    Aq aq = (Aq) obj;
                    int i5 = this.f4951v;
                    if (i5 != 2) {
                        aq.a(i5);
                    }
                    if (!TextUtils.isEmpty(this.f4946q)) {
                        aq.Y(this.f4946q);
                    }
                    if (!TextUtils.isEmpty(this.f4947r) && !aq.k()) {
                        aq.F(this.f4947r);
                    }
                    Op op = this.f4948s;
                    if (op != null) {
                        aq.c(op);
                    } else {
                        C0101z0 c0101z0 = this.f4949t;
                        if (c0101z0 != null) {
                            aq.r(c0101z0);
                        }
                    }
                    this.f4945p.b(aq.l());
                }
                this.f4944o.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(int i4) {
        if (((Boolean) G6.c.r()).booleanValue()) {
            this.f4951v = i4;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        g();
    }
}
