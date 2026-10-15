package W3;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128g extends O implements InterfaceC0127f {

    /* renamed from: e, reason: collision with root package name */
    public final W f2097e;

    public C0128g(W w2) {
        this.f2097e = w2;
    }

    @Override // W3.InterfaceC0127f
    public final boolean c(Throwable th) {
        W k3 = k();
        if (th instanceof CancellationException) {
            return true;
        }
        return k3.h(th) && k3.n();
    }

    @Override // W3.J
    public final void d(Throwable th) {
        this.f2097e.h(k());
    }
}
