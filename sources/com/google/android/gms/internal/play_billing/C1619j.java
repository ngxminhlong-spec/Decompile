package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1619j extends AbstractC1613g {

    /* renamed from: q, reason: collision with root package name */
    public final transient C1625m f12214q;

    /* renamed from: r, reason: collision with root package name */
    public final transient Object[] f12215r;

    /* renamed from: s, reason: collision with root package name */
    public final transient int f12216s;

    public C1619j(C1625m c1625m, Object[] objArr, int i4) {
        this.f12214q = c1625m;
        this.f12215r = objArr;
        this.f12216s = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f12214q.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1603b
    public final int h(Object[] objArr) {
        AbstractC1609e abstractC1609e = this.f12204p;
        if (abstractC1609e == null) {
            abstractC1609e = l();
            this.f12204p = abstractC1609e;
        }
        return abstractC1609e.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC1609e abstractC1609e = this.f12204p;
        if (abstractC1609e == null) {
            abstractC1609e = l();
            this.f12204p = abstractC1609e;
        }
        return abstractC1609e.listIterator(0);
    }

    public final AbstractC1609e l() {
        return new C1617i(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12216s;
    }
}
