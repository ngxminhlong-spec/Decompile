package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1618i0 extends AbstractC1631p implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final C1618i0 f12211r = new C1618i0(new Object[0], 0, false);

    /* renamed from: p, reason: collision with root package name */
    public Object[] f12212p;

    /* renamed from: q, reason: collision with root package name */
    public int f12213q;

    public C1618i0(Object[] objArr, int i4, boolean z4) {
        super(z4);
        this.f12212p = objArr;
        this.f12213q = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        g();
        if (i4 < 0 || i4 > (i5 = this.f12213q)) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f12213q, "Index:", ", Size:"));
        }
        int i6 = i4 + 1;
        Object[] objArr = this.f12212p;
        if (i5 < objArr.length) {
            System.arraycopy(objArr, i4, objArr, i6, i5 - i4);
        } else {
            Object[] objArr2 = new Object[((i5 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i4);
            System.arraycopy(this.f12212p, i4, objArr2, i6, this.f12213q - i4);
            this.f12212p = objArr2;
        }
        this.f12212p[i4] = obj;
        this.f12213q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i4 = this.f12213q;
        Object[] objArr = this.f12212p;
        if (i4 == objArr.length) {
            this.f12212p = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f12212p;
        int i5 = this.f12213q;
        this.f12213q = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.J
    public final /* bridge */ /* synthetic */ J c(int i4) {
        if (i4 >= this.f12213q) {
            return new C1618i0(Arrays.copyOf(this.f12212p, i4), this.f12213q, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        h(i4);
        return this.f12212p[i4];
    }

    public final void h(int i4) {
        if (i4 < 0 || i4 >= this.f12213q) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f12213q, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        g();
        h(i4);
        Object[] objArr = this.f12212p;
        Object obj = objArr[i4];
        if (i4 < this.f12213q - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f12213q--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        g();
        h(i4);
        Object[] objArr = this.f12212p;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12213q;
    }
}
