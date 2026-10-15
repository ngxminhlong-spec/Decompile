package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Ot extends AbstractCollection implements Set {

    /* renamed from: o, reason: collision with root package name */
    public final Set f6536o;

    /* renamed from: p, reason: collision with root package name */
    public final Es f6537p;

    public Ot(Set set, Es es) {
        this.f6536o = set;
        this.f6537p = es;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f6537p.l(obj)) {
            return this.f6536o.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f6537p.l(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f6536o.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f6536o;
        boolean z4 = set instanceof RandomAccess;
        Es es = this.f6537p;
        if (!z4 || !(set instanceof List)) {
            Iterator it = set.iterator();
            es.getClass();
            while (it.hasNext()) {
                if (es.l(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        es.getClass();
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object obj = list.get(i5);
            if (!es.l(obj)) {
                if (i5 > i4) {
                    try {
                        list.set(i4, obj);
                    } catch (IllegalArgumentException unused) {
                        Bs.H(list, es, i4, i5);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        Bs.H(list, es, i4, i5);
                        return;
                    }
                }
                i4++;
            }
        }
        list.subList(i4, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z4;
        Set set = this.f6536o;
        set.getClass();
        try {
            z4 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z4 = false;
        }
        if (z4) {
            return this.f6537p.l(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return Bs.T(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return Bs.d(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f6536o.iterator();
        Es es = this.f6537p;
        Bs.S(es, "predicate");
        int i4 = 0;
        while (it.hasNext()) {
            if (es.l(it.next())) {
                return i4 == -1;
            }
            i4++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f6536o.iterator();
        it.getClass();
        Es es = this.f6537p;
        es.getClass();
        return new C1309vt(it, es);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f6536o.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f6536o.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f6537p.l(next) && collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f6536o.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f6537p.l(next) && !collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f6536o.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (this.f6537p.l(it.next())) {
                i4++;
            }
        }
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C1309vt c1309vt = (C1309vt) it;
        while (c1309vt.hasNext()) {
            arrayList.add(c1309vt.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C1309vt c1309vt = (C1309vt) it;
        while (c1309vt.hasNext()) {
            arrayList.add(c1309vt.next());
        }
        return arrayList.toArray(objArr);
    }
}
