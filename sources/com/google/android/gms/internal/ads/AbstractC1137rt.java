package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1137rt extends AbstractC0923mt implements List, RandomAccess {

    /* renamed from: p, reason: collision with root package name */
    public static final C1052pt f10543p = new C1052pt(Gt.f5344s, 0);

    public static Gt q(int i4, Object[] objArr) {
        return i4 == 0 ? Gt.f5344s : new Gt(i4, objArr);
    }

    public static AbstractC1137rt r(Collection collection) {
        if (!(collection instanceof AbstractC0923mt)) {
            Object[] array = collection.toArray();
            int length = array.length;
            Bs.D(length, array);
            return q(length, array);
        }
        AbstractC1137rt k3 = ((AbstractC0923mt) collection).k();
        if (!k3.n()) {
            return k3;
        }
        Object[] array2 = k3.toArray(AbstractC0923mt.f9662o);
        return q(array2.length, array2);
    }

    public static Gt s(Object[] objArr) {
        if (objArr.length == 0) {
            return Gt.f5344s;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        Bs.D(length, objArr2);
        return q(length, objArr2);
    }

    public static Gt t(Object obj) {
        Object[] objArr = {obj};
        Bs.D(1, objArr);
        return q(1, objArr);
    }

    public static Gt u(Long l4, Long l5, Long l6, Long l7, Long l8) {
        Object[] objArr = {l4, l5, l6, l7, l8};
        Bs.D(5, objArr);
        return q(5, objArr);
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i4 = 0; i4 < size; i4++) {
                        if (Bs.r(get(i4), list.get(i4))) {
                        }
                    }
                    return true;
                }
                C1052pt listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || !Bs.r(listIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public int h(int i4, Object[] objArr) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i4 + i5] = get(i5);
        }
        return i4 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = (i4 * 31) + get(i5).hashCode();
        }
        return i4;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (obj.equals(get(i4))) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final AbstractC1137rt k() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final Tt l() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC1137rt subList(int i4, int i5) {
        Bs.i0(i4, i5, size());
        int i6 = i5 - i4;
        return i6 == size() ? this : i6 == 0 ? Gt.f5344s : new C1095qt(this, i4, i6);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final C1052pt listIterator(int i4) {
        Bs.C(i4, size());
        return isEmpty() ? f10543p : new C1052pt(this, i4);
    }
}
