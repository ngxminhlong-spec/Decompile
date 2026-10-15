package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0266Ec {

    /* renamed from: a, reason: collision with root package name */
    public static final C0260Dc f4897a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0260Dc f4898b;
    public static final C0260Dc c;
    public static final C0254Cc d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0260Dc f4899e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0260Dc f4900f;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.Cc, java.util.concurrent.ScheduledThreadPoolExecutor] */
    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f4897a = new C0260Dc((Executor) new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, timeUnit, new SynchronousQueue(), new ThreadFactoryC1206tc("Default", 1)));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC1206tc("Loader", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4898b = new C0260Dc((Executor) threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC1206tc("Activeview", 1));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        c = new C0260Dc((Executor) threadPoolExecutor2);
        d = new ScheduledThreadPoolExecutor(3, new ThreadFactoryC1206tc("Schedule", 1));
        f4899e = new C0260Dc(new ExecutorC1319w2());
        f4900f = new C0260Dc(Iu.f5747o);
    }
}
