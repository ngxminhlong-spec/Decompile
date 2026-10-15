package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Gt extends AbstractC1137rt {

    /* renamed from: s, reason: collision with root package name */
    public static final Gt f5344s = new Gt(0, new Object[0]);

    /* renamed from: q, reason: collision with root package name */
    public final transient Object[] f5345q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f5346r;

    public Gt(int i4, Object[] objArr) {
        this.f5345q = objArr;
        this.f5346r = i4;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Bs.l(i4, this.f5346r);
        Object obj = this.f5345q[i4];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1137rt, com.google.android.gms.internal.ads.AbstractC0923mt
    public final int h(int i4, Object[] objArr) {
        Object[] objArr2 = this.f5345q;
        int i5 = this.f5346r;
        System.arraycopy(objArr2, 0, objArr, i4, i5);
        return i4 + i5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final int i() {
        return this.f5346r;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final Object[] o() {
        return this.f5345q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5346r;
    }
}
