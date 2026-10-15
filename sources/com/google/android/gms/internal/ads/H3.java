package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H3 implements G3 {

    /* renamed from: M, reason: collision with root package name */
    public static volatile U3 f5380M;
    public static final Object N = new Object();

    /* renamed from: O, reason: collision with root package name */
    public static boolean f5381O;

    /* renamed from: P, reason: collision with root package name */
    public static long f5382P;

    /* renamed from: Q, reason: collision with root package name */
    public static M3 f5383Q;

    /* renamed from: R, reason: collision with root package name */
    public static C0380a4 f5384R;

    /* renamed from: S, reason: collision with root package name */
    public static C1059q f5385S;

    /* renamed from: A, reason: collision with root package name */
    public float f5386A;

    /* renamed from: B, reason: collision with root package name */
    public float f5387B;

    /* renamed from: C, reason: collision with root package name */
    public float f5388C;

    /* renamed from: D, reason: collision with root package name */
    public float f5389D;

    /* renamed from: G, reason: collision with root package name */
    public final DisplayMetrics f5392G;

    /* renamed from: H, reason: collision with root package name */
    public final C0874ln f5393H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f5394I;

    /* renamed from: J, reason: collision with root package name */
    public final String f5395J;

    /* renamed from: K, reason: collision with root package name */
    public Y3 f5396K;

    /* renamed from: L, reason: collision with root package name */
    public final HashMap f5397L;

    /* renamed from: o, reason: collision with root package name */
    public MotionEvent f5398o;

    /* renamed from: x, reason: collision with root package name */
    public double f5407x;
    public double y;

    /* renamed from: z, reason: collision with root package name */
    public double f5408z;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedList f5399p = new LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public long f5400q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f5401r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f5402s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f5403t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f5404u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f5405v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f5406w = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5390E = false;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5391F = false;

    public H3(Context context, String str, boolean z4) {
        try {
            AbstractC1406y3.b();
            this.f5392G = context.getResources().getDisplayMetrics();
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10242j2)).booleanValue()) {
                this.f5393H = new C0874ln(8);
            }
        } catch (Throwable unused) {
        }
        this.f5394I = false;
        this.f5397L = new HashMap();
        this.f5395J = str;
        this.f5394I = z4;
    }

    public static U3 n(Context context, boolean z4) {
        if (f5380M == null) {
            synchronized (N) {
                try {
                    if (f5380M == null) {
                        U3 b4 = U3.b(context, z4);
                        if (b4.f7140p) {
                            try {
                                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.K2)).booleanValue()) {
                                    b4.d("zahwJ4oRFMB+Gn9BGkfZDZ8TzDEfKTB8Y6I4bT4vlwkVFXvqlnkWd7htbiUzWQyR", "ZVHCdOeJUA1S4bCrFb9VMsUCP8Sf65wDnbBE+q4M36k=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            b4.d("9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", Context.class);
                            b4.d("gL88T2vBvJS+jBemUvhPpVS5IeaU7cU4wFVgyT6PJl7pFldWXOd3mZxVZlQUSll5", "bObXLZFRWAdU6+me08AeNX2ciqxi45ddv3QSqAplzos=", Context.class);
                            b4.d("y3yRmC/kyT5sblAh6MVmMMe529YDQrbaaQxNMdjlDdcJ+gZ0vSS7aY/hNYvCePEW", "Y0trGqGVEUAa7A3LYgSQFKe4N9h1BuTC7OKFYCHfLSg=", Context.class);
                            b4.d("ZHFOx+FjaOsul7gEkIcfA8auDnyRWXmT0qbiHVEO6U1RLulNSOFK3tPEgm+pvQxr", "RSyr2AK130nKbepDTsaNV0Uv17TWUb4O6ebIiV3GgVs=", Context.class);
                            b4.d("jjg2LREBZ6Uexk1F+/xvygfAXYATBvQHfsOfWOGMPQM53g793pJFEG1AwAYG3/Of", "aC7c3pDenGsdb0eFildzKOBrhobw8fKkmd52rTlBEKM=", Context.class);
                            Class cls = Boolean.TYPE;
                            b4.d("zmLnsak1Fo/LHy30EeWswBCxcOoFKuH08l3DkSTUgzb476o6nI+C8ZUC+d8tLJwZ", "sK9i540XcONymgaiZVMKYXr1VbNcwMhjwo2LFhhSCFg=", Context.class, cls);
                            b4.d("1OxyLDHu2cwu0U7XKtDO3q+DghLeQ8xcTgpGCDWDuEeCcfs+HPxSt8kldIfiq1K0", "Ee4p/yPQz67p3LoSNbpt1G8K9rDuoWxBYT8E4CbWyr8=", Context.class);
                            b4.d("Q+fOnDUQnIPH75lusFutOgWOI4DeJ6z7X13oo1pZ5m19Kfyi56UOJglWSBqO3AzA", "Hu+f/NX/SE2ncwqgjWboivCw8sh0xmVI9uGBmdlJpc4=", Context.class);
                            b4.d("DtIPi5sE8OGAkX2vdWCDjXNrgqzO0lFe3Ja6SZSAwi/aT592ne6/tQc6OV2axJNE", "A3EfeXObjqx38Tdc4wdTZSQNpfpw6YVck+944M4A/m0=", MotionEvent.class, DisplayMetrics.class);
                            b4.d("s1ejGoWFNJedDDJqGqL3B22F5ZMvy0oaymBcWJepS9Hv4/6KtsHBpmbtFfwgqqen", "r6m9xWOlfK6iHuNH3QiJQf71aQCKDM6NhABQId+yaKg=", MotionEvent.class, DisplayMetrics.class);
                            b4.d("MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", new Class[0]);
                            b4.d("pfTqFlR1an7kDUBzP8CmJZynZFAzKap0OWhefexY5E+9LoDEPq/g9ouqCw4/+GOX", "y+BEEb1lYOUGwTehZ9VIg/2gibmtEOjDZzKXHhs5BV0=", new Class[0]);
                            b4.d("hMVcCX1S6+m7rVEDNdCHhVgXRFILMOQ9RgLSmTdPHeNgAU8CbmBsymKBuqLQcQaU", "3PwoDnm3HnsskB+3ZnJHoZ7BzV0InxUqaAwJBlSwKFs=", new Class[0]);
                            b4.d("ttuIHg/yfWDxJlotLoMLf9WBnVTbWFFKY03C8KHR8FAhIQHccw4LaDLJatYkpo23", "xLOAO7msIR4UFUyldUn5stL2wwbLdISu2CSlTLg4f6Q=", new Class[0]);
                            b4.d("1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", new Class[0]);
                            b4.d("4/SMeJXpDEQUjIN8ctjvaq+191KHQFpFbvfik3xx/Qb+eWbRMHKpllc1rI0p7EXQ", "Jz2tk/JKeGJKcc4wwXH5Pf6ZM64fYgV4wWxByPOgNQE=", new Class[0]);
                            b4.d("p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", Context.class, cls, String.class);
                            b4.d("fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=", StackTraceElement[].class);
                            b4.d("0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", View.class, DisplayMetrics.class, cls, cls);
                            b4.d("geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", Context.class, cls);
                            b4.d("XCj6cS5OVeEeObzd394PGDbjTuQh+vSye2UT6221ugsKtO2/oznWOSes2cnebrVR", "/UZ99NhZDGBVc8wZVXmC2wC/MG54XdFcRWhDAwHbwWE=", View.class, Activity.class, cls);
                            b4.d("nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", Long.TYPE);
                            b4.d("iibTgWRTbrwM2W7HZGJP5cjM0DLiCyA9TVVy1genRaa4nvgE3+CiRN/Fx87DVDsO", "iU9T/JU0akui7k4x/WtKPjyPVCtA+9ztaziSj2SwIy0=", new Class[0]);
                            try {
                                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10138N2)).booleanValue()) {
                                    b4.d("gcg2RhRsG0R6zuf6iT0eSF6U6iabmBM/me4U4ELIi5QicHmCf/u4OJEW9LFUXGGL", "I5l5b06e/m6OPcJVryww5aceHDWuWNMRDm4mYVrBvJQ=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            b4.d("gzR6fJL0MpYPfJ/UkFL9UHjS7jlytQ+eyVRsQJTsxzK4yqDaskM4UtldyBDUp+Z9", "BkxOKZDOMH8NUFJEmpCq1X+PtIP0kLI1Ua0ujwsrkUE=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10143O2)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        b4.d("KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10242j2)).booleanValue()) {
                                    b4.d("tfuuP59pzWN+H8zv1geT3jADiBKBGMQRjmCPoIvL5f45Lvl5qgJ0PgBqZF4WPnQj", "MIrDuKB7N0O22daoYjLtFOJg5TtVRHK1+0ktwmGNtdU=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            try {
                                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10237i2)).booleanValue()) {
                                    Class cls3 = Long.TYPE;
                                    b4.d("8UC+BMIoCN+KAKrN9TZmuJsGMmo3RUHS+FjVMSp9QfgjxjGZ10kqO/oSdOn5Rw29", "L3kn/AgbpZo67rOPPyFD0YaeqBdfOWuRWDM5lgBYp0M=", cls3, cls3, cls3, cls3);
                                }
                            } catch (IllegalStateException unused5) {
                            }
                            try {
                                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10232h2)).booleanValue()) {
                                    b4.d("7qOZVP58PfP3kLkbSBo98onihlohkIEpZC40FvE5nnCJ8ryn0NERK9JAnlww55zq", "SMfJnKfhfLLyTw7dzHC+3CXVRNFLWK4N2mQHKB3gm/o=", long[].class, Context.class, View.class);
                                }
                            } catch (IllegalStateException unused6) {
                            }
                        }
                        f5380M = b4;
                    }
                } finally {
                }
            }
        }
        return f5380M;
    }

    public static V3 p(U3 u32, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method c = u32.c("DtIPi5sE8OGAkX2vdWCDjXNrgqzO0lFe3Ja6SZSAwi/aT592ne6/tQc6OV2axJNE", "A3EfeXObjqx38Tdc4wdTZSQNpfpw6YVck+944M4A/m0=");
        if (c == null || motionEvent == null) {
            throw new Exception();
        }
        try {
        } catch (IllegalAccessException | InvocationTargetException e4) {
            e = e4;
        }
        try {
            return new V3((String) c.invoke(null, motionEvent, displayMetrics));
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new Exception(e);
        }
    }

    public static ArrayList r(U3 u32, Context context, C0549e3 c0549e3) {
        long j4;
        int a4 = u32.a();
        ArrayList arrayList = new ArrayList();
        if (!u32.f7140p) {
            c0549e3.d();
            C0977o3.F0((C0977o3) c0549e3.f4561p, 16384L);
            return arrayList;
        }
        arrayList.add(new C0508d4(u32, c0549e3, a4, context));
        C0549e3 c0549e32 = c0549e3;
        arrayList.add(new C0593f4(u32, c0549e3, f5382P, a4));
        arrayList.add(new C0550e4(u32, c0549e32, a4, 2));
        arrayList.add(new C0423b4(u32, c0549e32, a4, context));
        arrayList.add(new C0550e4(u32, "pfTqFlR1an7kDUBzP8CmJZynZFAzKap0OWhefexY5E+9LoDEPq/g9ouqCw4/+GOX", "y+BEEb1lYOUGwTehZ9VIg/2gibmtEOjDZzKXHhs5BV0=", c0549e32, a4, 33, 3));
        arrayList.add(new C0465c4(u32, c0549e32, a4, context));
        arrayList.add(new C0550e4(u32, c0549e32, a4, 6));
        arrayList.add(new C0550e4(u32, c0549e32, a4, 9));
        arrayList.add(new C0550e4(u32, c0549e32, a4, 10));
        arrayList.add(new C0550e4(u32, c0549e32, a4, 0));
        arrayList.add(new C0550e4(u32, c0549e32, a4, 1));
        arrayList.add(new C0550e4(u32, c0549e32, a4, 13));
        arrayList.add(new C0550e4(u32, c0549e32, a4, 5));
        arrayList.add(new C0550e4(u32, c0549e32, a4, 12));
        arrayList.add(new C0763j4(u32, c0549e32, a4));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10143O2)).booleanValue()) {
                C0380a4 c0380a4 = f5384R;
                long j5 = -1;
                if (c0380a4 != null) {
                    long j6 = c0380a4.d ? c0380a4.f8075b - c0380a4.f8074a : -1L;
                    long j7 = c0380a4.c;
                    c0380a4.c = -1L;
                    j5 = j6;
                    j4 = j7;
                } else {
                    j4 = -1;
                }
                C0722i4 c0722i4 = new C0722i4(u32, c0549e32, a4, f5383Q, j5, j4);
                c0549e32 = c0549e32;
                a4 = a4;
                arrayList.add(c0722i4);
            }
        }
        C0937n6 c0937n6 = AbstractC1066q6.f10138N2;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            arrayList.add(new C0550e4(u32, "gcg2RhRsG0R6zuf6iT0eSF6U6iabmBM/me4U4ELIi5QicHmCf/u4OJEW9LFUXGGL", "I5l5b06e/m6OPcJVryww5aceHDWuWNMRDm4mYVrBvJQ=", c0549e32, a4, 73, 11));
        }
        arrayList.add(new C0550e4(u32, "gzR6fJL0MpYPfJ/UkFL9UHjS7jlytQ+eyVRsQJTsxzK4yqDaskM4UtldyBDUp+Z9", "BkxOKZDOMH8NUFJEmpCq1X+PtIP0kLI1Ua0ujwsrkUE=", c0549e32, a4, 76, 8));
        if (((Boolean) rVar.c.a(AbstractC1066q6.f10157R2)).booleanValue()) {
            arrayList.add(new C0550e4(u32, c0549e32, a4, 4));
        }
        return arrayList;
    }

    public static synchronized void t(Context context, boolean z4) {
        synchronized (H3.class) {
            try {
                if (f5381O) {
                    return;
                }
                f5382P = System.currentTimeMillis() / 1000;
                f5380M = n(context, z4);
                C0937n6 c0937n6 = AbstractC1066q6.f10143O2;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    f5383Q = M3.i(context);
                }
                ExecutorService executorService = f5380M.f7128b;
                if (((Boolean) rVar.c.a(AbstractC1066q6.f10148P2)).booleanValue() && executorService != null) {
                    f5384R = C0380a4.a(context, executorService);
                }
                if (((Boolean) rVar.c.a(AbstractC1066q6.f10237i2)).booleanValue()) {
                    f5385S = new C1059q();
                }
                f5381O = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void u(List list) {
        ExecutorService executorService;
        if (f5380M == null || (executorService = f5380M.f7128b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) O1.r.d.c.a(AbstractC1066q6.f10212d2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            StringWriter stringWriter = new StringWriter();
            e4.printStackTrace(new PrintWriter(stringWriter));
            Log.d("H3", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final synchronized void a(MotionEvent motionEvent) {
        Long l4;
        try {
            if (this.f5390E) {
                o();
                this.f5390E = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f5407x = 0.0d;
                this.y = motionEvent.getRawX();
                this.f5408z = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.y;
                double d4 = rawY - this.f5408z;
                this.f5407x += Math.sqrt((d4 * d4) + (d * d));
                this.y = rawX;
                this.f5408z = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.f5398o = obtain;
                        this.f5399p.add(obtain);
                        if (this.f5399p.size() > 6) {
                            ((MotionEvent) this.f5399p.remove()).recycle();
                        }
                        this.f5402s++;
                        this.f5404u = i(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f5401r += motionEvent.getHistorySize() + 1;
                        V3 m4 = m(motionEvent);
                        Long l5 = m4.f7226e;
                        if (l5 != null && m4.f7229h != null) {
                            this.f5405v = l5.longValue() + m4.f7229h.longValue() + this.f5405v;
                        }
                        if (this.f5392G != null && (l4 = m4.f7227f) != null && m4.f7230i != null) {
                            this.f5406w = l4.longValue() + m4.f7230i.longValue() + this.f5406w;
                        }
                    } else if (action2 == 3) {
                        this.f5403t++;
                    }
                } catch (Q3 unused) {
                }
            } else {
                this.f5386A = motionEvent.getX();
                this.f5387B = motionEvent.getY();
                this.f5388C = motionEvent.getRawX();
                this.f5389D = motionEvent.getRawY();
                this.f5400q++;
            }
            this.f5391F = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void b(View view) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10227g2)).booleanValue()) {
            if (this.f5396K == null) {
                U3 u32 = f5380M;
                this.f5396K = new Y3(u32.f7127a, u32.f7141q);
            }
            this.f5396K.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void c(StackTraceElement[] stackTraceElementArr) {
        C0874ln c0874ln;
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10242j2)).booleanValue() || (c0874ln = this.f5393H) == null) {
            return;
        }
        c0874ln.f9467p = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String d(Context context, View view, Activity activity) {
        return q(context, null, 2, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String e(Context context) {
        char[] cArr = W3.f7341a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return q(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final synchronized void f(int i4, int i5, int i6) {
        try {
            if (this.f5398o != null) {
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10200a2)).booleanValue()) {
                    o();
                } else {
                    this.f5398o.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f5392G;
            if (displayMetrics != null) {
                float f4 = displayMetrics.density;
                this.f5398o = MotionEvent.obtain(0L, i6, 1, i4 * f4, i5 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f5398o = null;
            }
            this.f5391F = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String g(Context context, String str, View view) {
        return q(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String h(Context context, String str, View view, Activity activity) {
        return q(context, str, 3, view, activity);
    }

    public final long i(StackTraceElement[] stackTraceElementArr) {
        Method c = f5380M.c("fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=");
        if (c == null || stackTraceElementArr == null) {
            throw new Exception();
        }
        try {
            return new K3((String) c.invoke(null, stackTraceElementArr)).c.longValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new Exception(e4);
        }
    }

    public final C0549e3 j(Context context, View view, Activity activity) {
        C0380a4 c0380a4 = f5384R;
        if (c0380a4 != null && c0380a4.d) {
            c0380a4.f8075b = System.currentTimeMillis();
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10237i2)).booleanValue()) {
            C1059q c1059q = f5385S;
            c1059q.f10067h = c1059q.f10066g;
            c1059q.f10066g = SystemClock.uptimeMillis();
        }
        C0549e3 V4 = C0977o3.V();
        String str = this.f5395J;
        if (!TextUtils.isEmpty(str)) {
            V4.d();
            C0977o3.v0((C0977o3) V4.f4561p, str);
        }
        s(n(context, this.f5394I), V4, view, activity, true, context);
        return V4;
    }

    public final C0549e3 k(Context context) {
        ArrayList arrayList;
        C0380a4 c0380a4 = f5384R;
        if (c0380a4 != null && c0380a4.d) {
            c0380a4.f8075b = System.currentTimeMillis();
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10237i2)).booleanValue()) {
            C1059q c1059q = f5385S;
            c1059q.f10063b = c1059q.f10062a;
            c1059q.f10062a = SystemClock.uptimeMillis();
        }
        C0549e3 V4 = C0977o3.V();
        String str = this.f5395J;
        if (!TextUtils.isEmpty(str)) {
            V4.d();
            C0977o3.v0((C0977o3) V4.f4561p, str);
        }
        boolean z4 = this.f5394I;
        U3 n4 = n(context, z4);
        if (n4.f7128b != null) {
            if (z4) {
                int a4 = n4.a();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r(n4, context, V4));
                arrayList2.add(new C0550e4(n4, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", V4, a4, 24, 7));
                arrayList = arrayList2;
            } else {
                arrayList = r(n4, context, V4);
            }
            u(arrayList);
        }
        return V4;
    }

    public final C0549e3 l(Context context, View view, Activity activity) {
        C0380a4 c0380a4 = f5384R;
        if (c0380a4 != null && c0380a4.d) {
            c0380a4.f8075b = System.currentTimeMillis();
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10237i2)).booleanValue()) {
            f5385S.b(context, view);
        }
        C0549e3 V4 = C0977o3.V();
        V4.d();
        C0977o3.v0((C0977o3) V4.f4561p, this.f5395J);
        s(n(context, this.f5394I), V4, view, activity, false, context);
        return V4;
    }

    public final V3 m(MotionEvent motionEvent) {
        Method c = f5380M.c("s1ejGoWFNJedDDJqGqL3B22F5ZMvy0oaymBcWJepS9Hv4/6KtsHBpmbtFfwgqqen", "r6m9xWOlfK6iHuNH3QiJQf71aQCKDM6NhABQId+yaKg=");
        if (c == null || motionEvent == null) {
            throw new Exception();
        }
        try {
            return new V3((String) c.invoke(null, motionEvent, this.f5392G));
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new Exception(e4);
        }
    }

    public final void o() {
        this.f5404u = 0L;
        this.f5400q = 0L;
        this.f5401r = 0L;
        this.f5402s = 0L;
        this.f5403t = 0L;
        this.f5405v = 0L;
        this.f5406w = 0L;
        LinkedList linkedList = this.f5399p;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f5398o;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f5398o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String q(android.content.Context r19, java.lang.String r20, int r21, android.view.View r22, android.app.Activity r23) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H3.q(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0284 A[Catch: all -> 0x0044, TryCatch #4 {all -> 0x0044, blocks: (B:9:0x0029, B:11:0x0035, B:12:0x0047, B:14:0x004b, B:15:0x0059, B:17:0x005d, B:18:0x006b, B:20:0x006f, B:22:0x0073, B:23:0x0081, B:25:0x0085, B:27:0x0093, B:29:0x00a0, B:31:0x00a6, B:35:0x00b1, B:37:0x0117, B:39:0x011b, B:41:0x0137, B:42:0x0141, B:44:0x015f, B:48:0x016a, B:50:0x0174, B:51:0x0182, B:53:0x0186, B:54:0x0194, B:56:0x01a8, B:58:0x01ac, B:59:0x01ba, B:61:0x01be, B:62:0x01cc, B:64:0x01d0, B:67:0x01db, B:69:0x01e5, B:71:0x01eb, B:73:0x01f1, B:80:0x01fd, B:82:0x020f, B:83:0x0228, B:84:0x023f, B:86:0x0243, B:87:0x0251, B:89:0x0255, B:90:0x0263, B:92:0x0267, B:95:0x0272, B:152:0x021e, B:98:0x027e, B:100:0x0284, B:101:0x028e, B:103:0x02a4, B:104:0x02ae, B:106:0x02b4, B:107:0x02be, B:109:0x02c4, B:110:0x02ce, B:112:0x02d4, B:114:0x02de, B:116:0x02e8, B:118:0x02f5, B:150:0x033e), top: B:8:0x0029, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a4 A[Catch: all -> 0x0044, TryCatch #4 {all -> 0x0044, blocks: (B:9:0x0029, B:11:0x0035, B:12:0x0047, B:14:0x004b, B:15:0x0059, B:17:0x005d, B:18:0x006b, B:20:0x006f, B:22:0x0073, B:23:0x0081, B:25:0x0085, B:27:0x0093, B:29:0x00a0, B:31:0x00a6, B:35:0x00b1, B:37:0x0117, B:39:0x011b, B:41:0x0137, B:42:0x0141, B:44:0x015f, B:48:0x016a, B:50:0x0174, B:51:0x0182, B:53:0x0186, B:54:0x0194, B:56:0x01a8, B:58:0x01ac, B:59:0x01ba, B:61:0x01be, B:62:0x01cc, B:64:0x01d0, B:67:0x01db, B:69:0x01e5, B:71:0x01eb, B:73:0x01f1, B:80:0x01fd, B:82:0x020f, B:83:0x0228, B:84:0x023f, B:86:0x0243, B:87:0x0251, B:89:0x0255, B:90:0x0263, B:92:0x0267, B:95:0x0272, B:152:0x021e, B:98:0x027e, B:100:0x0284, B:101:0x028e, B:103:0x02a4, B:104:0x02ae, B:106:0x02b4, B:107:0x02be, B:109:0x02c4, B:110:0x02ce, B:112:0x02d4, B:114:0x02de, B:116:0x02e8, B:118:0x02f5, B:150:0x033e), top: B:8:0x0029, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b4 A[Catch: all -> 0x0044, TryCatch #4 {all -> 0x0044, blocks: (B:9:0x0029, B:11:0x0035, B:12:0x0047, B:14:0x004b, B:15:0x0059, B:17:0x005d, B:18:0x006b, B:20:0x006f, B:22:0x0073, B:23:0x0081, B:25:0x0085, B:27:0x0093, B:29:0x00a0, B:31:0x00a6, B:35:0x00b1, B:37:0x0117, B:39:0x011b, B:41:0x0137, B:42:0x0141, B:44:0x015f, B:48:0x016a, B:50:0x0174, B:51:0x0182, B:53:0x0186, B:54:0x0194, B:56:0x01a8, B:58:0x01ac, B:59:0x01ba, B:61:0x01be, B:62:0x01cc, B:64:0x01d0, B:67:0x01db, B:69:0x01e5, B:71:0x01eb, B:73:0x01f1, B:80:0x01fd, B:82:0x020f, B:83:0x0228, B:84:0x023f, B:86:0x0243, B:87:0x0251, B:89:0x0255, B:90:0x0263, B:92:0x0267, B:95:0x0272, B:152:0x021e, B:98:0x027e, B:100:0x0284, B:101:0x028e, B:103:0x02a4, B:104:0x02ae, B:106:0x02b4, B:107:0x02be, B:109:0x02c4, B:110:0x02ce, B:112:0x02d4, B:114:0x02de, B:116:0x02e8, B:118:0x02f5, B:150:0x033e), top: B:8:0x0029, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c4 A[Catch: all -> 0x0044, TryCatch #4 {all -> 0x0044, blocks: (B:9:0x0029, B:11:0x0035, B:12:0x0047, B:14:0x004b, B:15:0x0059, B:17:0x005d, B:18:0x006b, B:20:0x006f, B:22:0x0073, B:23:0x0081, B:25:0x0085, B:27:0x0093, B:29:0x00a0, B:31:0x00a6, B:35:0x00b1, B:37:0x0117, B:39:0x011b, B:41:0x0137, B:42:0x0141, B:44:0x015f, B:48:0x016a, B:50:0x0174, B:51:0x0182, B:53:0x0186, B:54:0x0194, B:56:0x01a8, B:58:0x01ac, B:59:0x01ba, B:61:0x01be, B:62:0x01cc, B:64:0x01d0, B:67:0x01db, B:69:0x01e5, B:71:0x01eb, B:73:0x01f1, B:80:0x01fd, B:82:0x020f, B:83:0x0228, B:84:0x023f, B:86:0x0243, B:87:0x0251, B:89:0x0255, B:90:0x0263, B:92:0x0267, B:95:0x0272, B:152:0x021e, B:98:0x027e, B:100:0x0284, B:101:0x028e, B:103:0x02a4, B:104:0x02ae, B:106:0x02b4, B:107:0x02be, B:109:0x02c4, B:110:0x02ce, B:112:0x02d4, B:114:0x02de, B:116:0x02e8, B:118:0x02f5, B:150:0x033e), top: B:8:0x0029, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d4 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #4 {all -> 0x0044, blocks: (B:9:0x0029, B:11:0x0035, B:12:0x0047, B:14:0x004b, B:15:0x0059, B:17:0x005d, B:18:0x006b, B:20:0x006f, B:22:0x0073, B:23:0x0081, B:25:0x0085, B:27:0x0093, B:29:0x00a0, B:31:0x00a6, B:35:0x00b1, B:37:0x0117, B:39:0x011b, B:41:0x0137, B:42:0x0141, B:44:0x015f, B:48:0x016a, B:50:0x0174, B:51:0x0182, B:53:0x0186, B:54:0x0194, B:56:0x01a8, B:58:0x01ac, B:59:0x01ba, B:61:0x01be, B:62:0x01cc, B:64:0x01d0, B:67:0x01db, B:69:0x01e5, B:71:0x01eb, B:73:0x01f1, B:80:0x01fd, B:82:0x020f, B:83:0x0228, B:84:0x023f, B:86:0x0243, B:87:0x0251, B:89:0x0255, B:90:0x0263, B:92:0x0267, B:95:0x0272, B:152:0x021e, B:98:0x027e, B:100:0x0284, B:101:0x028e, B:103:0x02a4, B:104:0x02ae, B:106:0x02b4, B:107:0x02be, B:109:0x02c4, B:110:0x02ce, B:112:0x02d4, B:114:0x02de, B:116:0x02e8, B:118:0x02f5, B:150:0x033e), top: B:8:0x0029, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e8 A[Catch: all -> 0x0044, Q3 -> 0x033e, TryCatch #0 {Q3 -> 0x033e, blocks: (B:114:0x02de, B:116:0x02e8, B:118:0x02f5), top: B:113:0x02de, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021e A[Catch: all -> 0x0044, Q3 -> 0x027e, TryCatch #1 {Q3 -> 0x027e, blocks: (B:80:0x01fd, B:82:0x020f, B:83:0x0228, B:84:0x023f, B:86:0x0243, B:87:0x0251, B:89:0x0255, B:90:0x0263, B:92:0x0267, B:95:0x0272, B:152:0x021e), top: B:79:0x01fd }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020f A[Catch: all -> 0x0044, Q3 -> 0x027e, TryCatch #1 {Q3 -> 0x027e, blocks: (B:80:0x01fd, B:82:0x020f, B:83:0x0228, B:84:0x023f, B:86:0x0243, B:87:0x0251, B:89:0x0255, B:90:0x0263, B:92:0x0267, B:95:0x0272, B:152:0x021e), top: B:79:0x01fd }] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.google.android.gms.internal.ads.U3 r18, com.google.android.gms.internal.ads.C0549e3 r19, android.view.View r20, android.app.Activity r21, boolean r22, android.content.Context r23) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H3.s(com.google.android.gms.internal.ads.U3, com.google.android.gms.internal.ads.e3, android.view.View, android.app.Activity, boolean, android.content.Context):void");
    }
}
