package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E3 implements G3 {

    /* renamed from: F, reason: collision with root package name */
    public static E3 f4818F;

    /* renamed from: C, reason: collision with root package name */
    public volatile boolean f4821C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f4822D;

    /* renamed from: E, reason: collision with root package name */
    public final int f4823E;

    /* renamed from: o, reason: collision with root package name */
    public final Context f4824o;

    /* renamed from: p, reason: collision with root package name */
    public final C0621fq f4825p;

    /* renamed from: q, reason: collision with root package name */
    public final Lr f4826q;

    /* renamed from: r, reason: collision with root package name */
    public final Nr f4827r;

    /* renamed from: s, reason: collision with root package name */
    public final C1995b f4828s;

    /* renamed from: t, reason: collision with root package name */
    public final B0.c f4829t;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f4830u;

    /* renamed from: v, reason: collision with root package name */
    public final C1016p f4831v;

    /* renamed from: x, reason: collision with root package name */
    public final C0380a4 f4833x;
    public final C1059q y;

    /* renamed from: z, reason: collision with root package name */
    public final C0874ln f4834z;

    /* renamed from: A, reason: collision with root package name */
    public volatile long f4819A = 0;

    /* renamed from: B, reason: collision with root package name */
    public final Object f4820B = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final CountDownLatch f4832w = new CountDownLatch(1);

    public E3(Context context, B0.c cVar, C0621fq c0621fq, Lr lr, Nr nr, C1995b c1995b, Executor executor, C1475zn c1475zn, int i4, C0380a4 c0380a4, C1059q c1059q, C0874ln c0874ln) {
        this.f4822D = false;
        this.f4824o = context;
        this.f4829t = cVar;
        this.f4825p = c0621fq;
        this.f4826q = lr;
        this.f4827r = nr;
        this.f4828s = c1995b;
        this.f4830u = executor;
        this.f4823E = i4;
        this.f4833x = c0380a4;
        this.y = c1059q;
        this.f4834z = c0874ln;
        this.f4822D = false;
        this.f4831v = new C1016p(4, c1475zn);
    }

    public static synchronized E3 i(Context context, String str, boolean z4, boolean z5) {
        E3 j4;
        synchronized (E3.class) {
            j4 = j(str, context, Executors.newCachedThreadPool(), z4, z5);
        }
        return j4;
    }

    public static synchronized E3 j(String str, Context context, ExecutorService executorService, boolean z4, boolean z5) {
        E3 e32;
        synchronized (E3.class) {
            try {
                if (f4818F == null) {
                    byte b4 = (byte) (((byte) (0 | 1)) | 2);
                    if (str == null) {
                        throw new NullPointerException("Null clientVersion");
                    }
                    byte b5 = (byte) (b4 | 1);
                    if (b5 != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b5 & 1) == 0) {
                            sb.append(" shouldGetAdvertisingId");
                        }
                        if ((b5 & 2) == 0) {
                            sb.append(" isGooglePlayServicesAvailable");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    C1093qr c1093qr = new C1093qr(str, z4, true);
                    B0.c a4 = B0.c.a(context, executorService, z5);
                    C0937n6 c0937n6 = AbstractC1066q6.f10143O2;
                    O1.r rVar = O1.r.d;
                    M3 i4 = ((Boolean) rVar.c.a(c0937n6)).booleanValue() ? M3.i(context) : null;
                    C0380a4 a5 = ((Boolean) rVar.c.a(AbstractC1066q6.f10148P2)).booleanValue() ? C0380a4.a(context, executorService) : null;
                    C1059q c1059q = ((Boolean) rVar.c.a(AbstractC1066q6.f10237i2)).booleanValue() ? new C1059q() : null;
                    C0874ln c0874ln = ((Boolean) rVar.c.a(AbstractC1066q6.f10242j2)).booleanValue() ? new C0874ln(8) : null;
                    C0275Ga s4 = C0275Ga.s(context, executorService, a4, c1093qr);
                    R3 r32 = new R3(context);
                    C1059q c1059q2 = c1059q;
                    C1995b c1995b = new C1995b(c1093qr, s4, new Y3(context, r32), r32, i4, a5, c1059q2, c0874ln);
                    int t4 = Zf.t(context, a4);
                    C1475zn c1475zn = new C1475zn(12);
                    E3 e33 = new E3(context, a4, new C0621fq(context, t4), new Lr(context, t4, new M3(7, a4), ((Boolean) rVar.c.a(AbstractC1066q6.f10161S1)).booleanValue()), new Nr(context, c1995b, a4, c1475zn), c1995b, executorService, c1475zn, t4, a5, c1059q2, c0874ln);
                    f4818F = e33;
                    e33.l();
                    f4818F.m();
                }
                e32 = f4818F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e32;
    }

    public static void k(E3 e32) {
        String str;
        String str2;
        int length;
        boolean b4;
        long currentTimeMillis = System.currentTimeMillis();
        C0275Ga n4 = e32.n();
        if (n4 != null) {
            str = ((C1064q4) n4.f5183p).D();
            str2 = ((C1064q4) n4.f5183p).C();
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Kr g4 = Zf.g(e32.f4824o, e32.f4823E, str, str2, e32.f4829t);
                byte[] bArr = g4.f6074p;
                if (bArr == null || (length = bArr.length) == 0) {
                    e32.f4829t.e(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        C0978o4 v4 = C0978o4.v(AbstractC0886lz.A(bArr, 0, length), C1315vz.f11096b);
                        if (!v4.w().D().isEmpty() && !v4.w().C().isEmpty() && v4.x().h().length != 0) {
                            C0275Ga n5 = e32.n();
                            if (n5 != null) {
                                C1064q4 c1064q4 = (C1064q4) n5.f5183p;
                                if (v4.w().D().equals(c1064q4.D())) {
                                    if (!v4.w().C().equals(c1064q4.C())) {
                                    }
                                }
                            }
                            C1016p c1016p = e32.f4831v;
                            int i4 = g4.f6075q;
                            if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10152Q1)).booleanValue()) {
                                b4 = e32.f4825p.b(v4, c1016p);
                            } else if (i4 == 3) {
                                b4 = e32.f4826q.a(v4);
                            } else {
                                if (i4 == 4) {
                                    b4 = e32.f4826q.b(v4, c1016p);
                                }
                                e32.f4829t.e(4009, System.currentTimeMillis() - currentTimeMillis);
                            }
                            if (b4) {
                                C0275Ga n6 = e32.n();
                                if (n6 != null) {
                                    if (e32.f4827r.c(n6)) {
                                        e32.f4822D = true;
                                    }
                                    e32.f4819A = System.currentTimeMillis() / 1000;
                                }
                            }
                            e32.f4829t.e(4009, System.currentTimeMillis() - currentTimeMillis);
                        }
                        e32.f4829t.e(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        e32.f4829t.e(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (Oz e4) {
                e32.f4829t.d(4002, System.currentTimeMillis() - currentTimeMillis, e4);
            }
            e32.f4832w.countDown();
        } catch (Throwable th) {
            e32.f4832w.countDown();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void a(MotionEvent motionEvent) {
        C0326Qb a4 = this.f4827r.a();
        if (a4 != null) {
            try {
                a4.O(motionEvent);
            } catch (Mr e4) {
                this.f4829t.d(e4.f6274o, -1L, e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void b(View view) {
        ((Y3) this.f4828s.f14882q).a(view);
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void c(StackTraceElement[] stackTraceElementArr) {
        C0874ln c0874ln = this.f4834z;
        if (c0874ln != null) {
            c0874ln.f9467p = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String d(Context context, View view, Activity activity) {
        String W4;
        C0380a4 c0380a4 = this.f4833x;
        if (c0380a4 != null && c0380a4.d) {
            c0380a4.f8075b = System.currentTimeMillis();
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10237i2)).booleanValue()) {
            this.y.b(context, view);
        }
        m();
        C0326Qb a4 = this.f4827r.a();
        if (a4 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (a4) {
            C1995b c1995b = (C1995b) a4.f6661q;
            C0874ln c0874ln = (C0874ln) c1995b.f14887v;
            HashMap y = c1995b.y();
            if (c0874ln != null) {
                List list = (List) c0874ln.f9467p;
                c0874ln.f9467p = Collections.EMPTY_LIST;
                y.put("vst", list);
            }
            y.put("f", "v");
            y.put("ctx", context);
            y.put("aid", null);
            y.put("view", view);
            y.put("act", activity);
            W4 = C0326Qb.W(a4.X(y));
        }
        this.f4829t.g(5002, System.currentTimeMillis() - currentTimeMillis, null, W4, null);
        return W4;
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String e(Context context) {
        String W4;
        C0380a4 c0380a4 = this.f4833x;
        if (c0380a4 != null && c0380a4.d) {
            c0380a4.f8075b = System.currentTimeMillis();
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10237i2)).booleanValue()) {
            C1059q c1059q = this.y;
            c1059q.f10063b = c1059q.f10062a;
            c1059q.f10062a = SystemClock.uptimeMillis();
        }
        m();
        C0326Qb a4 = this.f4827r.a();
        if (a4 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (a4) {
            HashMap t4 = ((C1995b) a4.f6661q).t();
            t4.put("f", "q");
            t4.put("ctx", context);
            t4.put("aid", null);
            W4 = C0326Qb.W(a4.X(t4));
        }
        this.f4829t.g(5001, System.currentTimeMillis() - currentTimeMillis, null, W4, null);
        return W4;
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void f(int i4, int i5, int i6) {
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String h(Context context, String str, View view, Activity activity) {
        String W4;
        C0380a4 c0380a4 = this.f4833x;
        if (c0380a4 != null && c0380a4.d) {
            c0380a4.f8075b = System.currentTimeMillis();
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10237i2)).booleanValue()) {
            C1059q c1059q = this.y;
            c1059q.f10067h = c1059q.f10066g;
            c1059q.f10066g = SystemClock.uptimeMillis();
        }
        m();
        C0326Qb a4 = this.f4827r.a();
        if (a4 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (a4) {
            C1995b c1995b = (C1995b) a4.f6661q;
            Y3 y32 = (Y3) c1995b.f14882q;
            HashMap y = c1995b.y();
            if (y32.f7741z <= -2) {
                WeakReference weakReference = y32.f7738v;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    y32.f7741z = -3L;
                }
            }
            y.put("lts", Long.valueOf(y32.f7741z));
            y.put("f", "c");
            y.put("ctx", context);
            y.put("cs", str);
            y.put("aid", null);
            y.put("view", view);
            y.put("act", activity);
            W4 = C0326Qb.W(a4.X(y));
        }
        this.f4829t.g(5000, System.currentTimeMillis() - currentTimeMillis, null, W4, null);
        return W4;
    }

    public final synchronized void l() {
        long currentTimeMillis = System.currentTimeMillis();
        C0275Ga n4 = n();
        if (n4 == null) {
            this.f4829t.e(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f4827r.c(n4)) {
            this.f4822D = true;
            this.f4832w.countDown();
        }
    }

    public final void m() {
        if (this.f4821C) {
            return;
        }
        synchronized (this.f4820B) {
            try {
                if (!this.f4821C) {
                    if ((System.currentTimeMillis() / 1000) - this.f4819A < 3600) {
                        return;
                    }
                    C0275Ga b4 = this.f4827r.b();
                    if (b4 == null || ((C1064q4) b4.f5183p).w() - (System.currentTimeMillis() / 1000) < 3600) {
                        int i4 = this.f4823E - 1;
                        if (i4 == 2 || i4 == 4 || i4 == 5 || i4 == 6) {
                            this.f4830u.execute(new D3(0, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final C0275Ga n() {
        int i4 = this.f4823E - 1;
        if (i4 != 2 && i4 != 4 && i4 != 5 && i4 != 6) {
            return null;
        }
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10152Q1)).booleanValue()) {
            C0621fq c0621fq = this.f4825p;
            C1064q4 c = c0621fq.c(1);
            if (c == null) {
                return null;
            }
            String D4 = c.D();
            File w2 = Zf.w(D4, "pcam.jar", c0621fq.f());
            if (!w2.exists()) {
                w2 = Zf.w(D4, "pcam", c0621fq.f());
            }
            return new C0275Ga(c, w2, Zf.w(D4, "pcbc", c0621fq.f()), Zf.w(D4, "pcopt", c0621fq.f()));
        }
        Lr lr = this.f4826q;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (Lr.f6169t) {
            try {
                C1064q4 f4 = lr.f(1);
                if (f4 == null) {
                    lr.e(4022, currentTimeMillis);
                    return null;
                }
                File c2 = lr.c(f4.D());
                File file = new File(c2, "pcam.jar");
                if (!file.exists()) {
                    file = new File(c2, "pcam");
                }
                File file2 = new File(c2, "pcbc");
                File file3 = new File(c2, "pcopt");
                lr.e(5016, currentTimeMillis);
                return new C0275Ga(f4, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
