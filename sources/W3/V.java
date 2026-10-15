package W3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V extends Y3.b {

    /* renamed from: b, reason: collision with root package name */
    public final S f2081b;
    public X c;
    public final /* synthetic */ W d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G f2082e;

    public V(S s4, W w2, G g4) {
        this.d = w2;
        this.f2082e = g4;
        this.f2081b = s4;
    }

    @Override // Y3.b
    public final void b(Object obj, Object obj2) {
        Y3.j jVar = (Y3.j) obj;
        boolean z4 = obj2 == null;
        S s4 = this.f2081b;
        Object obj3 = z4 ? s4 : this.c;
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y3.j.f2239a;
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(jVar) != this) {
                    return;
                }
            }
            if (z4) {
                X x4 = this.c;
                S3.e.b(x4);
                s4.g(x4);
            }
        }
    }

    @Override // Y3.b
    public final B0.a c(Object obj) {
        if (this.d.p() == this.f2082e) {
            return null;
        }
        return Y3.a.d;
    }
}
