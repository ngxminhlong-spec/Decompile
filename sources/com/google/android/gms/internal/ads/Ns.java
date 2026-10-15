package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ns extends Qt {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ps f6406o;

    public Ns(Ps ps) {
        this.f6406o = ps;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f6406o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f6406o.f6606q.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f6406o.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new Os(this.f6406o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        Object key = entry.getKey();
        Ct ct = this.f6406o.f6607r;
        try {
            obj2 = ct.f4555r.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        ct.f4556s -= size;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Qt, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return Bs.X(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                z4 |= remove(it.next());
            }
            return z4;
        }
    }

    @Override // com.google.android.gms.internal.ads.Qt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                Bs.n("expectedSize", size);
                ceil = size + 1;
            } else {
                ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(ceil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.f6406o.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6406o.f6606q.size();
    }
}
