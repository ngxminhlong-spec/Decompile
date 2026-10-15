package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Jt extends AbstractC1266ut {

    /* renamed from: r, reason: collision with root package name */
    public final transient Lt f5934r;

    /* renamed from: s, reason: collision with root package name */
    public final transient Kt f5935s;

    public Jt(Lt lt, Kt kt) {
        this.f5934r = lt;
        this.f5935s = kt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5934r.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final int h(int i4, Object[] objArr) {
        return this.f5935s.h(i4, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f5935s.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1266ut, com.google.android.gms.internal.ads.AbstractC0923mt
    public final AbstractC1137rt k() {
        return this.f5935s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final Tt l() {
        return this.f5935s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5934r.f6181t;
    }
}
