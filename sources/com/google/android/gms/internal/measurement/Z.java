package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f11858a = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f11858a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
