package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769jA extends AbstractC0459bz implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final C0769jA f9138r = new C0769jA(new Object[0], 0, false);

    /* renamed from: p, reason: collision with root package name */
    public Object[] f9139p;

    /* renamed from: q, reason: collision with root package name */
    public int f9140q;

    public C0769jA(Object[] objArr, int i4, boolean z4) {
        super(z4);
        this.f9139p = objArr;
        this.f9140q = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        g();
        if (i4 < 0 || i4 > (i5 = this.f9140q)) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f9140q, "Index:", ", Size:"));
        }
        int i6 = i4 + 1;
        Object[] objArr = this.f9139p;
        if (i5 < objArr.length) {
            System.arraycopy(objArr, i4, objArr, i6, i5 - i4);
        } else {
            Object[] objArr2 = new Object[((i5 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i4);
            System.arraycopy(this.f9139p, i4, objArr2, i6, this.f9140q - i4);
            this.f9139p = objArr2;
        }
        this.f9139p[i4] = obj;
        this.f9140q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i4 = this.f9140q;
        Object[] objArr = this.f9139p;
        if (i4 == objArr.length) {
            this.f9139p = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9139p;
        int i5 = this.f9140q;
        this.f9140q = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final /* bridge */ /* synthetic */ Lz c(int i4) {
        if (i4 >= this.f9140q) {
            return new C0769jA(Arrays.copyOf(this.f9139p, i4), this.f9140q, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        h(i4);
        return this.f9139p[i4];
    }

    public final void h(int i4) {
        if (i4 < 0 || i4 >= this.f9140q) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f9140q, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        g();
        h(i4);
        Object[] objArr = this.f9139p;
        Object obj = objArr[i4];
        if (i4 < this.f9140q - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f9140q--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        g();
        h(i4);
        Object[] objArr = this.f9139p;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9140q;
    }
}
