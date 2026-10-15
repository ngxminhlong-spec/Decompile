package m;

import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o3.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1802b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13970a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13971b;

    public ThreadFactoryC1802b(int i4) {
        this.f13970a = i4;
        switch (i4) {
            case 1:
                this.f13971b = new AtomicInteger(1);
                return;
            default:
                this.f13971b = new AtomicInteger(0);
                return;
        }
    }

    public /* synthetic */ ThreadFactoryC1802b(i iVar) {
        this.f13970a = 2;
        this.f13971b = iVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i4 = this.f13970a;
        Object obj = this.f13971b;
        switch (i4) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            case 1:
                return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(((AtomicInteger) obj).getAndIncrement())));
            default:
                i iVar = (i) obj;
                iVar.getClass();
                Thread thread2 = new Thread(runnable, U.a.i("Google consent worker #", ((AtomicInteger) iVar.f14359p).getAndIncrement()));
                iVar.f14361r = new WeakReference(thread2);
                return thread2;
        }
    }
}
