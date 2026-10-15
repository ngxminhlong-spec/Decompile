package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F extends AbstractC1631p implements RandomAccess, H, InterfaceC1614g0 {

    /* renamed from: r, reason: collision with root package name */
    public static final F f12142r = new F(new int[0], 0, false);

    /* renamed from: p, reason: collision with root package name */
    public int[] f12143p;

    /* renamed from: q, reason: collision with root package name */
    public int f12144q;

    public F(int[] iArr, int i4, boolean z4) {
        super(z4);
        this.f12143p = iArr;
        this.f12144q = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int intValue = ((Integer) obj).intValue();
        g();
        if (i4 < 0 || i4 > (i5 = this.f12144q)) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f12144q, "Index:", ", Size:"));
        }
        int i6 = i4 + 1;
        int[] iArr = this.f12143p;
        if (i5 < iArr.length) {
            System.arraycopy(iArr, i4, iArr, i6, i5 - i4);
        } else {
            int[] iArr2 = new int[((i5 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            System.arraycopy(this.f12143p, i4, iArr2, i6, this.f12144q - i4);
            this.f12143p = iArr2;
        }
        this.f12143p[i4] = intValue;
        this.f12144q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = K.f12151a;
        collection.getClass();
        if (!(collection instanceof F)) {
            return super.addAll(collection);
        }
        F f4 = (F) collection;
        int i4 = f4.f12144q;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f12144q;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        int[] iArr = this.f12143p;
        if (i6 > iArr.length) {
            this.f12143p = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(f4.f12143p, 0, this.f12143p, this.f12144q, f4.f12144q);
        this.f12144q = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.J
    public final /* bridge */ /* synthetic */ J c(int i4) {
        if (i4 >= this.f12144q) {
            return new F(Arrays.copyOf(this.f12143p, i4), this.f12144q, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return super.equals(obj);
        }
        F f4 = (F) obj;
        if (this.f12144q != f4.f12144q) {
            return false;
        }
        int[] iArr = f4.f12143p;
        for (int i4 = 0; i4 < this.f12144q; i4++) {
            if (this.f12143p[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        j(i4);
        return Integer.valueOf(this.f12143p[i4]);
    }

    public final int h(int i4) {
        j(i4);
        return this.f12143p[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f12144q; i5++) {
            i4 = (i4 * 31) + this.f12143p[i5];
        }
        return i4;
    }

    public final void i(int i4) {
        g();
        int i5 = this.f12144q;
        int[] iArr = this.f12143p;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[((i5 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.f12143p = iArr2;
        }
        int[] iArr3 = this.f12143p;
        int i6 = this.f12144q;
        this.f12144q = i6 + 1;
        iArr3[i6] = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i4 = this.f12144q;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f12143p[i5] == intValue) {
                return i5;
            }
        }
        return -1;
    }

    public final void j(int i4) {
        if (i4 < 0 || i4 >= this.f12144q) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f12144q, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        g();
        j(i4);
        int[] iArr = this.f12143p;
        int i5 = iArr[i4];
        if (i4 < this.f12144q - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.f12144q--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        g();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f12143p;
        System.arraycopy(iArr, i5, iArr, i4, this.f12144q - i5);
        this.f12144q -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int intValue = ((Integer) obj).intValue();
        g();
        j(i4);
        int[] iArr = this.f12143p;
        int i5 = iArr[i4];
        iArr[i4] = intValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12144q;
    }
}
