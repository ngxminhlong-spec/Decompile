package B0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f83b;
    public final AtomicInteger c;

    public j(int i4) {
        this.f82a = i4;
        switch (i4) {
            case 1:
                this.f83b = Executors.defaultThreadFactory();
                this.c = new AtomicInteger(1);
                return;
            default:
                this.f83b = Executors.defaultThreadFactory();
                this.c = new AtomicInteger(1);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f82a) {
            case 0:
                Thread newThread = this.f83b.newThread(runnable);
                newThread.setName("PlayBillingLibrary-" + this.c.getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = this.f83b.newThread(runnable);
                newThread2.setName("gads-" + this.c.getAndIncrement());
                return newThread2;
        }
    }
}
