package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class It extends AbstractC1266ut {

    /* renamed from: r, reason: collision with root package name */
    public final transient Lt f5744r;

    /* renamed from: s, reason: collision with root package name */
    public final transient Object[] f5745s;

    /* renamed from: t, reason: collision with root package name */
    public final transient int f5746t;

    public It(Lt lt, Object[] objArr, int i4) {
        this.f5744r = lt;
        this.f5745s = objArr;
        this.f5746t = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5744r.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final int h(int i4, Object[] objArr) {
        return k().h(i4, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final Tt l() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1266ut
    public final AbstractC1137rt q() {
        return new Ht(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5746t;
    }
}
