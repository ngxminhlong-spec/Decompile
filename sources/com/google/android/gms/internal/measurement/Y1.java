package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y1 extends AbstractC1575t1 implements RandomAccess, M1, InterfaceC1531i2 {

    /* renamed from: r, reason: collision with root package name */
    public static final Y1 f11853r;

    /* renamed from: p, reason: collision with root package name */
    public long[] f11854p;

    /* renamed from: q, reason: collision with root package name */
    public int f11855q;

    static {
        Y1 y12 = new Y1(new long[0], 0);
        f11853r = y12;
        y12.f12028o = false;
    }

    public Y1(long[] jArr, int i4) {
        this.f11854p = jArr;
        this.f11855q = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        long longValue = ((Long) obj).longValue();
        g();
        if (i4 < 0 || i4 > (i5 = this.f11855q)) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f11855q, "Index:", ", Size:"));
        }
        long[] jArr = this.f11854p;
        if (i5 < jArr.length) {
            System.arraycopy(jArr, i4, jArr, i4 + 1, i5 - i4);
        } else {
            long[] jArr2 = new long[((i5 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i4);
            System.arraycopy(this.f11854p, i4, jArr2, i4 + 1, this.f11855q - i4);
            this.f11854p = jArr2;
        }
        this.f11854p[i4] = longValue;
        this.f11855q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = O1.f11796a;
        collection.getClass();
        if (!(collection instanceof Y1)) {
            return super.addAll(collection);
        }
        Y1 y12 = (Y1) collection;
        int i4 = y12.f11855q;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f11855q;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        long[] jArr = this.f11854p;
        if (i6 > jArr.length) {
            this.f11854p = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(y12.f11854p, 0, this.f11854p, this.f11855q, y12.f11855q);
        this.f11855q = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.N1
    public final N1 c(int i4) {
        if (i4 >= this.f11855q) {
            return new Y1(Arrays.copyOf(this.f11854p, i4), this.f11855q);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y1)) {
            return super.equals(obj);
        }
        Y1 y12 = (Y1) obj;
        if (this.f11855q != y12.f11855q) {
            return false;
        }
        long[] jArr = y12.f11854p;
        for (int i4 = 0; i4 < this.f11855q; i4++) {
            if (this.f11854p[i4] != jArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        i(i4);
        return Long.valueOf(this.f11854p[i4]);
    }

    public final void h(long j4) {
        g();
        int i4 = this.f11855q;
        long[] jArr = this.f11854p;
        if (i4 == jArr.length) {
            long[] jArr2 = new long[((i4 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i4);
            this.f11854p = jArr2;
        }
        long[] jArr3 = this.f11854p;
        int i5 = this.f11855q;
        this.f11855q = i5 + 1;
        jArr3[i5] = j4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f11855q; i5++) {
            i4 = (i4 * 31) + O1.a(this.f11854p[i5]);
        }
        return i4;
    }

    public final void i(int i4) {
        if (i4 < 0 || i4 >= this.f11855q) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f11855q, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i4 = this.f11855q;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f11854p[i5] == longValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1575t1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        g();
        i(i4);
        long[] jArr = this.f11854p;
        long j4 = jArr[i4];
        if (i4 < this.f11855q - 1) {
            System.arraycopy(jArr, i4 + 1, jArr, i4, (r3 - i4) - 1);
        }
        this.f11855q--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        g();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f11854p;
        System.arraycopy(jArr, i5, jArr, i4, this.f11855q - i5);
        this.f11855q -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        long longValue = ((Long) obj).longValue();
        g();
        i(i4);
        long[] jArr = this.f11854p;
        long j4 = jArr[i4];
        jArr[i4] = longValue;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11855q;
    }
}
