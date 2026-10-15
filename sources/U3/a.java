package U3;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1820a;

    public a(e eVar) {
        this.f1820a = new AtomicReference(eVar);
    }

    @Override // U3.b
    public final Iterator iterator() {
        b bVar = (b) this.f1820a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
