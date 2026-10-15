package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Xs extends AbstractCollection implements List {

    /* renamed from: o, reason: collision with root package name */
    public final Object f7709o;

    /* renamed from: p, reason: collision with root package name */
    public Collection f7710p;

    /* renamed from: q, reason: collision with root package name */
    public final Xs f7711q;

    /* renamed from: r, reason: collision with root package name */
    public final Collection f7712r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Ct f7713s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ct f7714t;

    public Xs(Ct ct, Object obj, List list, Xs xs) {
        this.f7714t = ct;
        this.f7713s = ct;
        this.f7709o = obj;
        this.f7710p = list;
        this.f7711q = xs;
        this.f7712r = xs == null ? null : xs.f7710p;
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        h();
        boolean isEmpty = this.f7710p.isEmpty();
        ((List) this.f7710p).add(i4, obj);
        this.f7714t.f4556s++;
        if (isEmpty) {
            g();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        boolean isEmpty = this.f7710p.isEmpty();
        boolean add = this.f7710p.add(obj);
        if (add) {
            this.f7713s.f4556s++;
            if (isEmpty) {
                g();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f7710p).addAll(i4, collection);
        if (!addAll) {
            return addAll;
        }
        this.f7714t.f4556s += this.f7710p.size() - size;
        if (size != 0) {
            return addAll;
        }
        g();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f7710p.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        this.f7713s.f4556s += this.f7710p.size() - size;
        if (size != 0) {
            return addAll;
        }
        g();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f7710p.clear();
        this.f7713s.f4556s -= size;
        i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        h();
        return this.f7710p.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        h();
        return this.f7710p.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        h();
        return this.f7710p.equals(obj);
    }

    public final void g() {
        Xs xs = this.f7711q;
        if (xs != null) {
            xs.g();
            return;
        }
        this.f7713s.f4555r.put(this.f7709o, this.f7710p);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        h();
        return ((List) this.f7710p).get(i4);
    }

    public final void h() {
        Xs xs = this.f7711q;
        if (xs != null) {
            xs.h();
            if (xs.f7710p != this.f7712r) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f7710p.isEmpty()) {
            Collection collection = (Collection) this.f7713s.f4555r.get(this.f7709o);
            if (collection != null) {
                this.f7710p = collection;
            }
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return this.f7710p.hashCode();
    }

    public final void i() {
        Xs xs = this.f7711q;
        if (xs != null) {
            xs.i();
        } else if (this.f7710p.isEmpty()) {
            this.f7713s.f4555r.remove(this.f7709o);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        h();
        return ((List) this.f7710p).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        h();
        return new Os(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        return ((List) this.f7710p).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        h();
        return new Ws(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        h();
        return new Ws(this, i4);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        h();
        Object remove = ((List) this.f7710p).remove(i4);
        Ct ct = this.f7714t;
        ct.f4556s--;
        i();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        boolean remove = this.f7710p.remove(obj);
        if (remove) {
            Ct ct = this.f7713s;
            ct.f4556s--;
            i();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f7710p.removeAll(collection);
        if (removeAll) {
            this.f7713s.f4556s += this.f7710p.size() - size;
            i();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f7710p.retainAll(collection);
        if (retainAll) {
            this.f7713s.f4556s += this.f7710p.size() - size;
            i();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        h();
        return ((List) this.f7710p).set(i4, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        h();
        return this.f7710p.size();
    }

    @Override // java.util.List
    public final List subList(int i4, int i5) {
        h();
        List subList = ((List) this.f7710p).subList(i4, i5);
        Xs xs = this.f7711q;
        if (xs == null) {
            xs = this;
        }
        boolean z4 = subList instanceof RandomAccess;
        Object obj = this.f7709o;
        Ct ct = this.f7714t;
        return z4 ? new Xs(ct, obj, subList, xs) : new Xs(ct, obj, subList, xs);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return this.f7710p.toString();
    }
}
