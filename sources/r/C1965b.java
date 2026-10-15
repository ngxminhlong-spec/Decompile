package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1965b implements Set {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f14721o;

    public C1965b(e eVar) {
        this.f14721o = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f14721o.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14721o.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f14721o.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        e eVar = this.f14721o;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (eVar.f14741q == set.size()) {
                return eVar.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        e eVar = this.f14721o;
        int i4 = 0;
        for (int i5 = eVar.f14741q - 1; i5 >= 0; i5--) {
            Object f4 = eVar.f(i5);
            i4 += f4 == null ? 0 : f4.hashCode();
        }
        return i4;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f14721o.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1964a(this.f14721o, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f14721o;
        int d = eVar.d(obj);
        if (d < 0) {
            return false;
        }
        eVar.g(d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f14721o.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f14721o.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f14721o.f14741q;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f14721o;
        int i4 = eVar.f14741q;
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = eVar.f(i5);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f14721o;
        int i4 = eVar.f14741q;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = eVar.f(i5);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
