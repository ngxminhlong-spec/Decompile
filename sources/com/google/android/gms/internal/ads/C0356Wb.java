package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C1509e0;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o2.C1893d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356Wb {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f7447a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f7448b = new Object();
    public String c = null;
    public String d = null;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7449e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f7450f = new AtomicInteger(-1);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f7451g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f7452h = new AtomicReference(null);

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f7453i = new ConcurrentHashMap(9);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f7454j = new AtomicReference(null);

    /* renamed from: k, reason: collision with root package name */
    public final ArrayBlockingQueue f7455k = new ArrayBlockingQueue(20);

    /* renamed from: l, reason: collision with root package name */
    public final Object f7456l = new Object();

    public static final boolean k(Context context) {
        C0937n6 c0937n6 = AbstractC1066q6.f10203b0;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue() || C1893d.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10207c0)).intValue()) {
            return false;
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10210d0)).booleanValue()) {
            return true;
        }
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        }
    }

    public final void a(Context context, String str, String str2) {
        AtomicReference atomicReference = this.f7451g;
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.f7453i;
            Method method = (Method) concurrentHashMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, method);
                } catch (Exception unused) {
                    c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(atomicReference.get(), str);
                Q1.I.w("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                c(str2, false);
            }
        }
    }

    public final void b(Context context, String str, String str2, Bundle bundle) {
        if (j(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e4) {
                Y9.q("Invalid event ID: ".concat(String.valueOf(str2)), e4);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (k(context)) {
                d("logEventInternal", new C0783ji(19, str, bundle2));
                return;
            }
            AtomicReference atomicReference = this.f7451g;
            if (e(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.f7453i;
                Method method = (Method) concurrentHashMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    c("logEventInternal", true);
                }
            }
        }
    }

    public final void c(String str, boolean z4) {
        AtomicBoolean atomicBoolean = this.f7449e;
        if (atomicBoolean.get()) {
            return;
        }
        Y9.s("Invoke Firebase method " + str + " error.");
        if (z4) {
            Y9.s("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    public final void d(String str, InterfaceC0351Vb interfaceC0351Vb) {
        synchronized (this.f7454j) {
            try {
                FutureTask futureTask = new FutureTask(new RunnableC0801k(this, interfaceC0351Vb, str, 3), null);
                if (this.f7454j.get() != null) {
                    futureTask.run();
                } else {
                    this.f7455k.offer(futureTask);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(Context context, String str, AtomicReference atomicReference, boolean z4) {
        if (atomicReference.get() == null) {
            try {
                Object invoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                while (!atomicReference.compareAndSet(null, invoke) && (atomicReference.get() == null || atomicReference.get() == null)) {
                }
            } catch (Exception unused) {
                c("getInstance", z4);
                return false;
            }
        }
        return true;
    }

    public final String f(Context context) {
        Long valueOf;
        if (j(context)) {
            if (k(context)) {
                synchronized (this.f7454j) {
                    try {
                        if (((InterfaceC0609fe) this.f7454j.get()) != null) {
                            try {
                                valueOf = Long.valueOf(((C1509e0) ((BinderC0854l9) ((InterfaceC0609fe) this.f7454j.get())).f9378o.f13386p).d());
                            } catch (Exception unused) {
                                c("getAdEventId", false);
                            }
                        }
                        valueOf = null;
                    } finally {
                    }
                }
                if (valueOf != null) {
                    return Long.toString(valueOf.longValue());
                }
            } else {
                Object m4 = m(context, "generateEventId");
                if (m4 != null) {
                    return m4.toString();
                }
            }
        }
        return null;
    }

    public final String g(Context context) {
        if (!j(context)) {
            return null;
        }
        long longValue = ((Long) O1.r.d.c.a(AbstractC1066q6.f10193Z)).longValue();
        try {
            if (!k(context)) {
                if (longValue < 0) {
                    return (String) m(context, "getAppInstanceId");
                }
                return (String) o().submit(new B0.v(7, this, context)).get(longValue, TimeUnit.MILLISECONDS);
            }
            if (longValue >= 0) {
                return (String) o().submit(new CallableC0336Sb(0, this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            synchronized (this.f7454j) {
                try {
                    if (((InterfaceC0609fe) this.f7454j.get()) != null) {
                        try {
                            C1509e0 c1509e0 = (C1509e0) ((BinderC0854l9) ((InterfaceC0609fe) this.f7454j.get())).f9378o.f13386p;
                            com.google.android.gms.internal.measurement.D d = new com.google.android.gms.internal.measurement.D();
                            c1509e0.b(new com.google.android.gms.internal.measurement.X(c1509e0, d, 1));
                            return (String) com.google.android.gms.internal.measurement.D.a0(d.Q(50L), String.class);
                        } catch (Exception unused) {
                            c("getAppInstanceId", false);
                        }
                    }
                    return null;
                } finally {
                }
            }
        } catch (TimeoutException unused2) {
            return "TIME_OUT";
        } catch (Exception unused3) {
            return null;
        }
    }

    public final String h(Context context) {
        if (!j(context)) {
            return null;
        }
        synchronized (this.f7448b) {
            try {
                String str = this.c;
                if (str != null) {
                    return str;
                }
                if (k(context)) {
                    this.c = (String) l("getGmpAppId", this.c, BF.f4052A);
                } else {
                    this.c = (String) m(context, "getGmpAppId");
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(Context context, String str, String str2, String str3, int i4) {
        if (j(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i4);
            b(context, "_ar", str, bundle);
            Q1.I.w("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i4);
        }
    }

    public final boolean j(Context context) {
        int c;
        C0937n6 c0937n6 = AbstractC1066q6.f10169U;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue() && !this.f7449e.get()) {
            if (!((Boolean) rVar.c.a(AbstractC1066q6.f10215e0)).booleanValue()) {
                AtomicInteger atomicInteger = this.f7450f;
                if (atomicInteger.get() == -1) {
                    C1335wc c1335wc = C0081p.f1374f.f1375a;
                    e2.f fVar = e2.f.f12753b;
                    if (fVar.c(context, 12451000) != 0 && ((c = fVar.c(context, 12451000)) == 0 || c == 2)) {
                        Y9.s("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object l(String str, Object obj, InterfaceC0346Ub interfaceC0346Ub) {
        synchronized (this.f7454j) {
            try {
                if (((InterfaceC0609fe) this.f7454j.get()) != null) {
                    try {
                        return interfaceC0346Ub.a((InterfaceC0609fe) this.f7454j.get());
                    } catch (Exception unused) {
                        c(str, false);
                    }
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object m(Context context, String str) {
        AtomicReference atomicReference = this.f7451g;
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return n(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            c(str, true);
            return null;
        }
    }

    public final Method n(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.f7453i;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            c(str, false);
            return null;
        }
    }

    public final ExecutorService o() {
        AtomicReference atomicReference = this.f7447a;
        if (atomicReference.get() == null) {
            C0937n6 c0937n6 = AbstractC1066q6.f10198a0;
            O1.r rVar = O1.r.d;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) rVar.c.a(c0937n6)).intValue(), ((Integer) rVar.c.a(c0937n6)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC0341Tb(0));
            while (!atomicReference.compareAndSet(null, threadPoolExecutor) && (atomicReference.get() == null || atomicReference.get() == null)) {
            }
        }
        return (ExecutorService) atomicReference.get();
    }
}
