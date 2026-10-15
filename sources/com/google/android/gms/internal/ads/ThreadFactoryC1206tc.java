package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1206tc implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10691a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f10692b;
    public final /* synthetic */ String c;

    public ThreadFactoryC1206tc(String str, int i4) {
        this.f10691a = i4;
        switch (i4) {
            case 1:
                this.c = str;
                this.f10692b = new AtomicInteger(1);
                return;
            default:
                this.c = str;
                this.f10692b = new AtomicInteger(1);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f10691a) {
            case 0:
                return new Thread(runnable, "AdWorker(" + this.c + ") #" + this.f10692b.getAndIncrement());
            default:
                return new Thread(runnable, "AdWorker(" + this.c + ") #" + this.f10692b.getAndIncrement());
        }
    }
}
