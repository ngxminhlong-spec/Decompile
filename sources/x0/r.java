package x0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f15242a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("WorkManager-WorkTimer-thread-" + this.f15242a);
        this.f15242a = this.f15242a + 1;
        return newThread;
    }
}
