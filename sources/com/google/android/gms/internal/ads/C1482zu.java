package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1482zu extends Bs {

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f11696p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f11697q;

    public C1482zu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(17);
        this.f11696p = atomicReferenceFieldUpdater;
        this.f11697q = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final void E(AbstractC1439yu abstractC1439yu, Set set) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f11696p;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1439yu, null, set)) {
                return;
            }
            if (atomicReferenceFieldUpdater.get(abstractC1439yu) != null && atomicReferenceFieldUpdater.get(abstractC1439yu) != null) {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final int c(AbstractC1439yu abstractC1439yu) {
        return this.f11697q.decrementAndGet(abstractC1439yu);
    }
}
