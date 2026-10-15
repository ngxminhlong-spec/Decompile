package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Mt extends AbstractC1266ut {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f6280w;

    /* renamed from: x, reason: collision with root package name */
    public static final Mt f6281x;

    /* renamed from: r, reason: collision with root package name */
    public final transient Object[] f6282r;

    /* renamed from: s, reason: collision with root package name */
    public final transient int f6283s;

    /* renamed from: t, reason: collision with root package name */
    public final transient Object[] f6284t;

    /* renamed from: u, reason: collision with root package name */
    public final transient int f6285u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f6286v;

    static {
        Object[] objArr = new Object[0];
        f6280w = objArr;
        f6281x = new Mt(0, 0, 0, objArr, objArr);
    }

    public Mt(int i4, int i5, int i6, Object[] objArr, Object[] objArr2) {
        this.f6282r = objArr;
        this.f6283s = i4;
        this.f6284t = objArr2;
        this.f6285u = i5;
        this.f6286v = i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f6284t;
            if (objArr.length != 0) {
                int v4 = Bs.v(obj);
                while (true) {
                    int i4 = v4 & this.f6285u;
                    Object obj2 = objArr[i4];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    v4 = i4 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final int h(int i4, Object[] objArr) {
        Object[] objArr2 = this.f6282r;
        int i5 = this.f6286v;
        System.arraycopy(objArr2, 0, objArr, i4, i5);
        return i4 + i5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1266ut, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f6283s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final int i() {
        return this.f6286v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final Tt l() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final Object[] o() {
        return this.f6282r;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1266ut
    public final AbstractC1137rt q() {
        return AbstractC1137rt.q(this.f6286v, this.f6282r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6286v;
    }
}
