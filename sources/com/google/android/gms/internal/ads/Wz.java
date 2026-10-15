package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Wz extends AbstractC0459bz implements RandomAccess, Kz, InterfaceC0685hA {

    /* renamed from: r, reason: collision with root package name */
    public static final Wz f7580r = new Wz(new long[0], 0, false);

    /* renamed from: p, reason: collision with root package name */
    public long[] f7581p;

    /* renamed from: q, reason: collision with root package name */
    public int f7582q;

    public Wz(long[] jArr, int i4, boolean z4) {
        super(z4);
        this.f7581p = jArr;
        this.f7582q = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        long longValue = ((Long) obj).longValue();
        g();
        if (i4 < 0 || i4 > (i5 = this.f7582q)) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f7582q, "Index:", ", Size:"));
        }
        int i6 = i4 + 1;
        long[] jArr = this.f7581p;
        if (i5 < jArr.length) {
            System.arraycopy(jArr, i4, jArr, i6, i5 - i4);
        } else {
            long[] jArr2 = new long[((i5 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i4);
            System.arraycopy(this.f7581p, i4, jArr2, i6, this.f7582q - i4);
            this.f7581p = jArr2;
        }
        this.f7581p[i4] = longValue;
        this.f7582q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = Mz.f6292a;
        collection.getClass();
        if (!(collection instanceof Wz)) {
            return super.addAll(collection);
        }
        Wz wz = (Wz) collection;
        int i4 = wz.f7582q;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f7582q;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        long[] jArr = this.f7581p;
        if (i6 > jArr.length) {
            this.f7581p = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(wz.f7581p, 0, this.f7581p, this.f7582q, wz.f7582q);
        this.f7582q = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final Lz c(int i4) {
        if (i4 >= this.f7582q) {
            return new Wz(Arrays.copyOf(this.f7581p, i4), this.f7582q, true);
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
        if (!(obj instanceof Wz)) {
            return super.equals(obj);
        }
        Wz wz = (Wz) obj;
        if (this.f7582q != wz.f7582q) {
            return false;
        }
        long[] jArr = wz.f7581p;
        for (int i4 = 0; i4 < this.f7582q; i4++) {
            if (this.f7581p[i4] != jArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        i(i4);
        return Long.valueOf(this.f7581p[i4]);
    }

    public final void h(long j4) {
        g();
        int i4 = this.f7582q;
        long[] jArr = this.f7581p;
        if (i4 == jArr.length) {
            long[] jArr2 = new long[((i4 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i4);
            this.f7581p = jArr2;
        }
        long[] jArr3 = this.f7581p;
        int i5 = this.f7582q;
        this.f7582q = i5 + 1;
        jArr3[i5] = j4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f7582q; i5++) {
            long j4 = this.f7581p[i5];
            Charset charset = Mz.f6292a;
            i4 = (i4 * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }
        return i4;
    }

    public final void i(int i4) {
        if (i4 < 0 || i4 >= this.f7582q) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f7582q, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i4 = this.f7582q;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f7581p[i5] == longValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        g();
        i(i4);
        long[] jArr = this.f7581p;
        long j4 = jArr[i4];
        if (i4 < this.f7582q - 1) {
            System.arraycopy(jArr, i4 + 1, jArr, i4, (r3 - i4) - 1);
        }
        this.f7582q--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        g();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f7581p;
        System.arraycopy(jArr, i5, jArr, i4, this.f7582q - i5);
        this.f7582q -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        long longValue = ((Long) obj).longValue();
        g();
        i(i4);
        long[] jArr = this.f7581p;
        long j4 = jArr[i4];
        jArr[i4] = longValue;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7582q;
    }
}
