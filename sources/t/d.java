package t;

import com.google.android.gms.internal.play_billing.B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends B {

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14818h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14819i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14820j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14821k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14822l;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f14818h = atomicReferenceFieldUpdater;
        this.f14819i = atomicReferenceFieldUpdater2;
        this.f14820j = atomicReferenceFieldUpdater3;
        this.f14821k = atomicReferenceFieldUpdater4;
        this.f14822l = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final void F(f fVar, f fVar2) {
        this.f14819i.lazySet(fVar, fVar2);
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final void G(f fVar, Thread thread) {
        this.f14818h.lazySet(fVar, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final boolean c(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14821k;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final boolean d(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14822l;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final boolean e(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14820j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
