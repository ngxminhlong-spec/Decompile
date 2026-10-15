package G;

import B0.r;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: q, reason: collision with root package name */
    public final Object f758q;

    public b() {
        super(12, 2);
        this.f758q = new Object();
    }

    @Override // B0.r
    public final Object h() {
        Object h4;
        synchronized (this.f758q) {
            h4 = super.h();
        }
        return h4;
    }

    @Override // B0.r
    public final boolean j(Object obj) {
        boolean j4;
        synchronized (this.f758q) {
            j4 = super.j(obj);
        }
        return j4;
    }
}
