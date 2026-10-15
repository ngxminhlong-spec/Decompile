package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ht extends AbstractC1137rt {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ It f5516q;

    public Ht(It it) {
        this.f5516q = it;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        It it = this.f5516q;
        Bs.l(i4, it.f5746t);
        Object[] objArr = it.f5745s;
        int i5 = i4 + i4;
        Object obj = objArr[i5];
        obj.getClass();
        Object obj2 = objArr[i5 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5516q.f5746t;
    }
}
