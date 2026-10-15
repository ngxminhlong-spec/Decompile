package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class S1 extends AbstractC1575t1 implements RandomAccess, T1 {

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f11822p;

    static {
        new S1(10).f12028o = false;
    }

    public S1(int i4) {
        this.f11822p = new ArrayList(i4);
    }

    public S1(ArrayList arrayList) {
        this.f11822p = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final T1 a() {
        return this.f12028o ? new C1568r2(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i4, Object obj) {
        g();
        this.f11822p.add(i4, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        g();
        if (collection instanceof T1) {
            collection = ((T1) collection).f();
        }
        boolean addAll = this.f11822p.addAll(i4, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f11822p.size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.N1
    public final N1 c(int i4) {
        ArrayList arrayList = this.f11822p;
        if (i4 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i4);
        arrayList2.addAll(arrayList);
        return new S1(arrayList2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        this.f11822p.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final Object d(int i4) {
        return this.f11822p.get(i4);
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final void e(C1591x1 c1591x1) {
        g();
        this.f11822p.add(c1591x1);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final List f() {
        return Collections.unmodifiableList(this.f11822p);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String get(int i4) {
        ArrayList arrayList = this.f11822p;
        Object obj = arrayList.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C1591x1) {
            C1591x1 c1591x1 = (C1591x1) obj;
            String str = c1591x1.j() == 0 ? "" : new String(c1591x1.f12115p, 0, c1591x1.j(), O1.f11796a);
            byte[] bArr = c1591x1.f12115p;
            int j4 = c1591x1.j();
            AbstractC1600z2.f12125a.getClass();
            if (C1592x2.a(bArr, 0, j4)) {
                arrayList.set(i4, str);
            }
            return str;
        }
        byte[] bArr2 = (byte[]) obj;
        String str2 = new String(bArr2, O1.f11796a);
        C1592x2 c1592x2 = AbstractC1600z2.f12125a;
        int length = bArr2.length;
        c1592x2.getClass();
        if (C1592x2.a(bArr2, 0, length)) {
            arrayList.set(i4, str2);
        }
        return str2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        g();
        Object remove = this.f11822p.remove(i4);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof C1591x1)) {
            return new String((byte[]) remove, O1.f11796a);
        }
        C1591x1 c1591x1 = (C1591x1) remove;
        return c1591x1.j() == 0 ? "" : new String(c1591x1.f12115p, 0, c1591x1.j(), O1.f11796a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        g();
        Object obj2 = this.f11822p.set(i4, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C1591x1)) {
            return new String((byte[]) obj2, O1.f11796a);
        }
        C1591x1 c1591x1 = (C1591x1) obj2;
        return c1591x1.j() == 0 ? "" : new String(c1591x1.f12115p, 0, c1591x1.j(), O1.f11796a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11822p.size();
    }
}
