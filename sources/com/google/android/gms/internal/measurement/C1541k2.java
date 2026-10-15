package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1541k2 extends AbstractC1575t1 implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final C1541k2 f11959r;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f11960p;

    /* renamed from: q, reason: collision with root package name */
    public int f11961q;

    static {
        C1541k2 c1541k2 = new C1541k2(0, new Object[0]);
        f11959r = c1541k2;
        c1541k2.f12028o = false;
    }

    public C1541k2(int i4, Object[] objArr) {
        this.f11960p = objArr;
        this.f11961q = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        g();
        if (i4 < 0 || i4 > (i5 = this.f11961q)) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f11961q, "Index:", ", Size:"));
        }
        Object[] objArr = this.f11960p;
        if (i5 < objArr.length) {
            System.arraycopy(objArr, i4, objArr, i4 + 1, i5 - i4);
        } else {
            Object[] objArr2 = new Object[((i5 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i4);
            System.arraycopy(this.f11960p, i4, objArr2, i4 + 1, this.f11961q - i4);
            this.f11960p = objArr2;
        }
        this.f11960p[i4] = obj;
        this.f11961q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i4 = this.f11961q;
        Object[] objArr = this.f11960p;
        if (i4 == objArr.length) {
            this.f11960p = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f11960p;
        int i5 = this.f11961q;
        this.f11961q = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.N1
    public final /* bridge */ /* synthetic */ N1 c(int i4) {
        if (i4 < this.f11961q) {
            throw new IllegalArgumentException();
        }
        return new C1541k2(this.f11961q, Arrays.copyOf(this.f11960p, i4));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        h(i4);
        return this.f11960p[i4];
    }

    public final void h(int i4) {
        if (i4 < 0 || i4 >= this.f11961q) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f11961q, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        g();
        h(i4);
        Object[] objArr = this.f11960p;
        Object obj = objArr[i4];
        if (i4 < this.f11961q - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f11961q--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        g();
        h(i4);
        Object[] objArr = this.f11960p;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11961q;
    }
}
