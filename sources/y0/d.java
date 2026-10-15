package y0;

import d3.AbstractC1654b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends AbstractC1654b {

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15890h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15891i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15892j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15893k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15894l;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f15890h = atomicReferenceFieldUpdater;
        this.f15891i = atomicReferenceFieldUpdater2;
        this.f15892j = atomicReferenceFieldUpdater3;
        this.f15893k = atomicReferenceFieldUpdater4;
        this.f15894l = atomicReferenceFieldUpdater5;
    }

    @Override // d3.AbstractC1654b
    public final void N(g gVar, g gVar2) {
        this.f15891i.lazySet(gVar, gVar2);
    }

    @Override // d3.AbstractC1654b
    public final void O(g gVar, Thread thread) {
        this.f15890h.lazySet(gVar, thread);
    }

    @Override // d3.AbstractC1654b
    public final boolean c(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15893k;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // d3.AbstractC1654b
    public final boolean d(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15894l;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // d3.AbstractC1654b
    public final boolean e(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15892j;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
