package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rt extends AbstractC1266ut {

    /* renamed from: r, reason: collision with root package name */
    public final transient Object f6863r;

    public Rt(Object obj) {
        this.f6863r = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f6863r.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final int h(int i4, Object[] objArr) {
        objArr[i4] = this.f6863r;
        return i4 + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1266ut, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f6863r.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C1352wt(this.f6863r);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1266ut, com.google.android.gms.internal.ads.AbstractC0923mt
    public final AbstractC1137rt k() {
        return AbstractC1137rt.t(this.f6863r);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final Tt l() {
        return new C1352wt(this.f6863r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return U.a.k("[", this.f6863r.toString(), "]");
    }
}
