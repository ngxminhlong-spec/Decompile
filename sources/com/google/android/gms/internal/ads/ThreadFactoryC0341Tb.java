package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0341Tb implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7057a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f7058b;

    public ThreadFactoryC0341Tb(int i4) {
        this.f7057a = i4;
        switch (i4) {
            case 1:
                this.f7058b = new AtomicInteger(1);
                return;
            default:
                this.f7058b = new AtomicInteger(1);
                return;
        }
    }

    public /* synthetic */ ThreadFactoryC0341Tb(String str) {
        this.f7057a = 2;
        this.f7058b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f7057a) {
            case 0:
                return new Thread(runnable, U.a.i("AdWorker(SCION_TASK_EXECUTOR) #", ((AtomicInteger) this.f7058b).getAndIncrement()));
            case 1:
                return new Thread(runnable, U.a.i("AdWorker(NG) #", ((AtomicInteger) this.f7058b).getAndIncrement()));
            default:
                return new Thread(runnable, (String) this.f7058b);
        }
    }
}
