package x2;

import java.lang.Thread;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f15505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2064b0 f15506b;

    public Y(C2064b0 c2064b0, String str) {
        this.f15506b = c2064b0;
        this.f15505a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        K k3 = ((C2066c0) this.f15506b.f1719a).f15568i;
        C2066c0.i(k3);
        k3.f15394f.b(th, this.f15505a);
    }
}
