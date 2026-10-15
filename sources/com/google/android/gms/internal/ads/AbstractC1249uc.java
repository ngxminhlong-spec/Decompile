package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1249uc {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f10788a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC1206tc("ClientDefault", 0));

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f10789b = Executors.newSingleThreadExecutor(new ThreadFactoryC1206tc("ClientSingle", 0));
}
