package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ju, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795ju extends Bs {

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9225p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9226q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9227r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9228s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9229t;

    public C0795ju(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(15);
        this.f9225p = atomicReferenceFieldUpdater;
        this.f9226q = atomicReferenceFieldUpdater2;
        this.f9227r = atomicReferenceFieldUpdater3;
        this.f9228s = atomicReferenceFieldUpdater4;
        this.f9229t = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final void Q(C1096qu c1096qu, C1096qu c1096qu2) {
        this.f9226q.lazySet(c1096qu, c1096qu2);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final void V(C1096qu c1096qu, Thread thread) {
        this.f9225p.lazySet(c1096qu, thread);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final boolean b0(AbstractC1138ru abstractC1138ru, C0752iu c0752iu, C0752iu c0752iu2) {
        return Bs.s(this.f9228s, abstractC1138ru, c0752iu, c0752iu2);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final boolean e0(AbstractC1138ru abstractC1138ru, Object obj, Object obj2) {
        return Bs.s(this.f9229t, abstractC1138ru, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final C0752iu f(AbstractC1138ru abstractC1138ru) {
        return (C0752iu) this.f9228s.getAndSet(abstractC1138ru, C0752iu.d);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final boolean g0(AbstractC1138ru abstractC1138ru, C1096qu c1096qu, C1096qu c1096qu2) {
        return Bs.s(this.f9227r, abstractC1138ru, c1096qu, c1096qu2);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final C1096qu z(AbstractC1138ru abstractC1138ru) {
        return (C1096qu) this.f9227r.getAndSet(abstractC1138ru, C1096qu.c);
    }
}
