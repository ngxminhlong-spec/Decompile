package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ez extends AbstractC0459bz implements RandomAccess, Hz, InterfaceC0685hA {

    /* renamed from: r, reason: collision with root package name */
    public static final Ez f4961r = new Ez(new int[0], 0, false);

    /* renamed from: p, reason: collision with root package name */
    public int[] f4962p;

    /* renamed from: q, reason: collision with root package name */
    public int f4963q;

    public Ez(int[] iArr, int i4, boolean z4) {
        super(z4);
        this.f4962p = iArr;
        this.f4963q = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int intValue = ((Integer) obj).intValue();
        g();
        if (i4 < 0 || i4 > (i5 = this.f4963q)) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f4963q, "Index:", ", Size:"));
        }
        int i6 = i4 + 1;
        int[] iArr = this.f4962p;
        if (i5 < iArr.length) {
            System.arraycopy(iArr, i4, iArr, i6, i5 - i4);
        } else {
            int[] iArr2 = new int[((i5 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            System.arraycopy(this.f4962p, i4, iArr2, i6, this.f4963q - i4);
            this.f4962p = iArr2;
        }
        this.f4962p[i4] = intValue;
        this.f4963q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = Mz.f6292a;
        collection.getClass();
        if (!(collection instanceof Ez)) {
            return super.addAll(collection);
        }
        Ez ez = (Ez) collection;
        int i4 = ez.f4963q;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f4963q;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        int[] iArr = this.f4962p;
        if (i6 > iArr.length) {
            this.f4962p = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(ez.f4962p, 0, this.f4962p, this.f4963q, ez.f4963q);
        this.f4963q = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final Lz c(int i4) {
        if (i4 >= this.f4963q) {
            return new Ez(Arrays.copyOf(this.f4962p, i4), this.f4963q, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ez)) {
            return super.equals(obj);
        }
        Ez ez = (Ez) obj;
        if (this.f4963q != ez.f4963q) {
            return false;
        }
        int[] iArr = ez.f4962p;
        for (int i4 = 0; i4 < this.f4963q; i4++) {
            if (this.f4962p[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        i(i4);
        return Integer.valueOf(this.f4962p[i4]);
    }

    public final void h(int i4) {
        g();
        int i5 = this.f4963q;
        int[] iArr = this.f4962p;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[((i5 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.f4962p = iArr2;
        }
        int[] iArr3 = this.f4962p;
        int i6 = this.f4963q;
        this.f4963q = i6 + 1;
        iArr3[i6] = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f4963q; i5++) {
            i4 = (i4 * 31) + this.f4962p[i5];
        }
        return i4;
    }

    public final void i(int i4) {
        if (i4 < 0 || i4 >= this.f4963q) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f4963q, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i4 = this.f4963q;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f4962p[i5] == intValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        g();
        i(i4);
        int[] iArr = this.f4962p;
        int i5 = iArr[i4];
        if (i4 < this.f4963q - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.f4963q--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        g();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f4962p;
        System.arraycopy(iArr, i5, iArr, i4, this.f4963q - i5);
        this.f4963q -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int intValue = ((Integer) obj).intValue();
        g();
        i(i4);
        int[] iArr = this.f4962p;
        int i5 = iArr[i4];
        iArr[i4] = intValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4963q;
    }
}
