package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Ps extends AbstractMap {

    /* renamed from: o, reason: collision with root package name */
    public transient Ns f6604o;

    /* renamed from: p, reason: collision with root package name */
    public transient Zs f6605p;

    /* renamed from: q, reason: collision with root package name */
    public final transient Map f6606q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Ct f6607r;

    public Ps(Ct ct, Map map) {
        this.f6607r = ct;
        this.f6606q = map;
    }

    public final C0966nt a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        Ct ct = this.f6607r;
        ct.getClass();
        List list = (List) collection;
        return new C0966nt(key, list instanceof RandomAccess ? new Xs(ct, key, list, null) : new Xs(ct, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f6606q;
        Ct ct = this.f6607r;
        if (map == ct.f4555r) {
            ct.c();
            return;
        }
        Os os = new Os(this);
        while (os.hasNext()) {
            os.next();
            os.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f6606q;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Ns ns = this.f6604o;
        if (ns != null) {
            return ns;
        }
        Ns ns2 = new Ns(this);
        this.f6604o = ns2;
        return ns2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f6606q.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f6606q;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        Ct ct = this.f6607r;
        ct.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new Xs(ct, obj, list, null) : new Xs(ct, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f6606q.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Ct ct = this.f6607r;
        Qs qs = ct.f8172o;
        if (qs != null) {
            return qs;
        }
        Map map = ct.f4555r;
        Qs ss = map instanceof NavigableMap ? new Ss(ct, (NavigableMap) map) : map instanceof SortedMap ? new Vs(ct, (SortedMap) map) : new Qs(ct, map);
        ct.f8172o = ss;
        return ss;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f6606q.remove(obj);
        if (collection == null) {
            return null;
        }
        Ct ct = this.f6607r;
        Collection b4 = ct.b();
        ((ArrayList) b4).addAll(collection);
        ct.f4556s -= collection.size();
        collection.clear();
        return b4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6606q.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f6606q.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Zs zs = this.f6605p;
        if (zs != null) {
            return zs;
        }
        Zs zs2 = new Zs(this);
        this.f6605p = zs2;
        return zs2;
    }
}
