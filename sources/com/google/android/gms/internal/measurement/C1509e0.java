package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C1748e;
import x2.AbstractC2080j0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1509e0 {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C1509e0 f11907g;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f11908a;

    /* renamed from: b, reason: collision with root package name */
    public final C1748e f11909b;
    public int c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11910e;

    /* renamed from: f, reason: collision with root package name */
    public volatile H f11911f;

    public C1509e0(Context context, String str, String str2, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Z());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11908a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f11909b = new C1748e(18, this);
        new ArrayList();
        try {
            AbstractC2080j0.i(context, AbstractC2080j0.b(context));
        } catch (IllegalStateException unused) {
        }
        this.f11910e = "fa";
        if (str == null || str2 == null) {
            if ((str2 == null) ^ (str == null)) {
                Log.w("FA", "Specified origin or custom app id is null. Both parameters will be ignored.");
            }
        } else {
            Log.v("FA", "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
        }
        b(new V(this, str, str2, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C1504d0(this));
        }
    }

    public static C1509e0 e(Context context, String str, String str2, Bundle bundle) {
        h2.y.i(context);
        if (f11907g == null) {
            synchronized (C1509e0.class) {
                try {
                    if (f11907g == null) {
                        f11907g = new C1509e0(context, str, str2, bundle);
                    }
                } finally {
                }
            }
        }
        return f11907g;
    }

    public final void a(Exception exc, boolean z4, boolean z5) {
        this.d |= z4;
        if (z4) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z5) {
            b(new U(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final void b(AbstractRunnableC1489a0 abstractRunnableC1489a0) {
        this.f11908a.execute(abstractRunnableC1489a0);
    }

    public final int c(String str) {
        D d = new D();
        b(new V(this, str, d));
        Integer num = (Integer) D.a0(d.Q(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long d() {
        D d = new D();
        b(new X(this, d, 2));
        Long l4 = (Long) D.a0(d.Q(500L), Long.class);
        if (l4 != null) {
            return l4.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i4 = this.c + 1;
        this.c = i4;
        return nextLong + i4;
    }

    public final List f(String str, String str2) {
        D d = new D();
        b(new S(this, str, str2, d, 1));
        List list = (List) D.a0(d.Q(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final Map g(String str, String str2, boolean z4) {
        D d = new D();
        b(new Y(this, str, str2, z4, d));
        Bundle Q3 = d.Q(5000L);
        if (Q3 == null || Q3.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(Q3.size());
        for (String str3 : Q3.keySet()) {
            Object obj = Q3.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }
}
