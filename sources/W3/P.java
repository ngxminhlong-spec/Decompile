package W3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P extends W {

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2073q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P() {
        super(true);
        boolean z4 = true;
        r(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W.f2084p;
        InterfaceC0127f interfaceC0127f = (InterfaceC0127f) atomicReferenceFieldUpdater.get(this);
        C0128g c0128g = interfaceC0127f instanceof C0128g ? (C0128g) interfaceC0127f : null;
        if (c0128g != null) {
            W k3 = c0128g.k();
            while (!k3.n()) {
                InterfaceC0127f interfaceC0127f2 = (InterfaceC0127f) atomicReferenceFieldUpdater.get(k3);
                C0128g c0128g2 = interfaceC0127f2 instanceof C0128g ? (C0128g) interfaceC0127f2 : null;
                if (c0128g2 != null) {
                    k3 = c0128g2.k();
                }
            }
            this.f2073q = z4;
        }
        z4 = false;
        this.f2073q = z4;
    }

    @Override // W3.W
    public final boolean n() {
        return this.f2073q;
    }
}
