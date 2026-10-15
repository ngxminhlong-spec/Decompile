package n0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f14071a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14072b;

    public b(boolean z4) {
        this.f14072b = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.f14072b ? "WM.task-" : "androidx.work-") + this.f14071a.incrementAndGet());
    }
}
