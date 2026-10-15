package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Kt extends AbstractC1137rt {

    /* renamed from: q, reason: collision with root package name */
    public final transient Object[] f6076q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f6077r;

    /* renamed from: s, reason: collision with root package name */
    public final transient int f6078s;

    public Kt(Object[] objArr, int i4, int i5) {
        this.f6076q = objArr;
        this.f6077r = i4;
        this.f6078s = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Bs.l(i4, this.f6078s);
        Object obj = this.f6076q[i4 + i4 + this.f6077r];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6078s;
    }
}
