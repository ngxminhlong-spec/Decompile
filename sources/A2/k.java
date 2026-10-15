package A2;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k implements f, e, c {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f29a = new CountDownLatch(1);

    @Override // A2.c
    public final void a() {
        this.f29a.countDown();
    }

    @Override // A2.f
    public final void b(Object obj) {
        this.f29a.countDown();
    }

    @Override // A2.e
    public final void c(Exception exc) {
        this.f29a.countDown();
    }
}
