package W3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K extends O {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2069f = AtomicIntegerFieldUpdater.newUpdater(K.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final J f2070e;

    public K(J j4) {
        this.f2070e = j4;
    }

    @Override // W3.J
    public final void d(Throwable th) {
        if (f2069f.compareAndSet(this, 0, 1)) {
            this.f2070e.d(th);
        }
    }
}
