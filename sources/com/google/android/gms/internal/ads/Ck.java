package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import b0.RunnableC0203p;
import c3.InterfaceFutureC0239a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ck {
    public final long d;

    /* renamed from: f, reason: collision with root package name */
    public final Context f4528f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f4529g;

    /* renamed from: h, reason: collision with root package name */
    public final Tj f4530h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f4531i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f4532j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f4533k;

    /* renamed from: l, reason: collision with root package name */
    public final C0871lk f4534l;

    /* renamed from: m, reason: collision with root package name */
    public final C0248Bc f4535m;

    /* renamed from: o, reason: collision with root package name */
    public final Hh f4537o;

    /* renamed from: p, reason: collision with root package name */
    public final Fq f4538p;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4525a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4526b = false;
    public boolean c = false;

    /* renamed from: e, reason: collision with root package name */
    public final C0272Fc f4527e = new C0272Fc();

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f4536n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f4539q = true;

    public Ck(Executor executor, Context context, WeakReference weakReference, C0260Dc c0260Dc, Tj tj, ScheduledExecutorService scheduledExecutorService, C0871lk c0871lk, C0248Bc c0248Bc, Hh hh, Fq fq) {
        this.f4530h = tj;
        this.f4528f = context;
        this.f4529g = weakReference;
        this.f4531i = c0260Dc;
        this.f4533k = scheduledExecutorService;
        this.f4532j = executor;
        this.f4534l = c0871lk;
        this.f4535m = c0248Bc;
        this.f4537o = hh;
        this.f4538p = fq;
        N1.n.f1204A.f1212j.getClass();
        this.d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f4536n;
        for (String str : concurrentHashMap.keySet()) {
            C1325w8 c1325w8 = (C1325w8) concurrentHashMap.get(str);
            arrayList.add(new C1325w8(str, c1325w8.f11115q, c1325w8.f11116r, c1325w8.f11114p));
        }
        return arrayList;
    }

    public final void b() {
        if (!((Boolean) T6.f7045a.r()).booleanValue()) {
            int i4 = this.f4535m.f4086q;
            C0937n6 c0937n6 = AbstractC1066q6.A1;
            O1.r rVar = O1.r.d;
            if (i4 >= ((Integer) rVar.c.a(c0937n6)).intValue() && this.f4539q) {
                if (this.f4525a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f4525a) {
                            return;
                        }
                        this.f4534l.d();
                        this.f4537o.d();
                        C0272Fc c0272Fc = this.f4527e;
                        final int i5 = 1;
                        c0272Fc.f5017o.a(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zk

                            /* renamed from: p, reason: collision with root package name */
                            public final /* synthetic */ Ck f11648p;

                            {
                                this.f11648p = this;
                            }

                            private final void a() {
                                Ck ck = this.f11648p;
                                synchronized (ck) {
                                    try {
                                        if (ck.c) {
                                            return;
                                        }
                                        N1.n.f1204A.f1212j.getClass();
                                        ck.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - ck.d), "Timeout.", false);
                                        ck.f4534l.a("com.google.android.gms.ads.MobileAds", "timeout");
                                        ck.f4537o.v("com.google.android.gms.ads.MobileAds", "timeout");
                                        ck.f4527e.c(new Exception());
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        a();
                                        return;
                                    default:
                                        Ck ck = this.f11648p;
                                        C0871lk c0871lk = ck.f4534l;
                                        synchronized (c0871lk) {
                                            try {
                                                C0937n6 c0937n62 = AbstractC1066q6.f10134M1;
                                                O1.r rVar2 = O1.r.d;
                                                if (((Boolean) rVar2.c.a(c0937n62)).booleanValue()) {
                                                    if (!((Boolean) rVar2.c.a(AbstractC1066q6.B7)).booleanValue() && !c0871lk.d) {
                                                        HashMap e4 = c0871lk.e();
                                                        e4.put("action", "init_finished");
                                                        c0871lk.f9457b.add(e4);
                                                        ArrayList arrayList = c0871lk.f9457b;
                                                        int size = arrayList.size();
                                                        int i6 = 0;
                                                        while (i6 < size) {
                                                            Object obj = arrayList.get(i6);
                                                            i6++;
                                                            c0871lk.f9459f.a((Map) obj, false);
                                                        }
                                                        c0871lk.d = true;
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        ck.f4537o.a();
                                        ck.f4526b = true;
                                        return;
                                }
                            }
                        }, this.f4531i);
                        this.f4525a = true;
                        InterfaceFutureC0239a c = c();
                        final int i6 = 0;
                        this.f4533k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zk

                            /* renamed from: p, reason: collision with root package name */
                            public final /* synthetic */ Ck f11648p;

                            {
                                this.f11648p = this;
                            }

                            private final void a() {
                                Ck ck = this.f11648p;
                                synchronized (ck) {
                                    try {
                                        if (ck.c) {
                                            return;
                                        }
                                        N1.n.f1204A.f1212j.getClass();
                                        ck.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - ck.d), "Timeout.", false);
                                        ck.f4534l.a("com.google.android.gms.ads.MobileAds", "timeout");
                                        ck.f4537o.v("com.google.android.gms.ads.MobileAds", "timeout");
                                        ck.f4527e.c(new Exception());
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        a();
                                        return;
                                    default:
                                        Ck ck = this.f11648p;
                                        C0871lk c0871lk = ck.f4534l;
                                        synchronized (c0871lk) {
                                            try {
                                                C0937n6 c0937n62 = AbstractC1066q6.f10134M1;
                                                O1.r rVar2 = O1.r.d;
                                                if (((Boolean) rVar2.c.a(c0937n62)).booleanValue()) {
                                                    if (!((Boolean) rVar2.c.a(AbstractC1066q6.B7)).booleanValue() && !c0871lk.d) {
                                                        HashMap e4 = c0871lk.e();
                                                        e4.put("action", "init_finished");
                                                        c0871lk.f9457b.add(e4);
                                                        ArrayList arrayList = c0871lk.f9457b;
                                                        int size = arrayList.size();
                                                        int i62 = 0;
                                                        while (i62 < size) {
                                                            Object obj = arrayList.get(i62);
                                                            i62++;
                                                            c0871lk.f9459f.a((Map) obj, false);
                                                        }
                                                        c0871lk.d = true;
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        ck.f4537o.a();
                                        ck.f4526b = true;
                                        return;
                                }
                            }
                        }, ((Long) rVar.c.a(AbstractC1066q6.f10089C1)).longValue(), TimeUnit.SECONDS);
                        Xj xj = new Xj(1, this);
                        c.a(new Nu(0, c, xj), this.f4531i);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f4525a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.f4527e.b(Boolean.FALSE);
        this.f4525a = true;
        this.f4526b = true;
    }

    public final synchronized InterfaceFutureC0239a c() {
        N1.n nVar = N1.n.f1204A;
        String str = nVar.f1209g.c().x().f9735e;
        if (!TextUtils.isEmpty(str)) {
            return Bs.h0(str);
        }
        C0272Fc c0272Fc = new C0272Fc();
        Q1.K c = nVar.f1209g.c();
        c.c.add(new RunnableC0203p(25, this, c0272Fc));
        return c0272Fc;
    }

    public final void d(String str, int i4, String str2, boolean z4) {
        this.f4536n.put(str, new C1325w8(str, i4, str2, z4));
    }
}
