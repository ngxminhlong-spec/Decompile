package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zs extends AbstractCollection {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8058o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f8059p;

    public /* synthetic */ Zs(int i4, Serializable serializable) {
        this.f8058o = i4;
        this.f8059p = serializable;
    }

    public Zs(Ps ps) {
        this.f8058o = 2;
        this.f8059p = ps;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f8058o) {
            case 0:
                ((Ct) this.f8059p).c();
                return;
            case 1:
                ((C0624ft) this.f8059p).clear();
                return;
            default:
                ((Ps) this.f8059p).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f8058o) {
            case 0:
                Iterator it = ((Ps) ((Ct) this.f8059p).a()).values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((Ps) this.f8059p).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f8058o) {
            case 2:
                return ((Ps) this.f8059p).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8058o) {
            case 0:
                return new Ms((Ct) this.f8059p);
            case 1:
                C0624ft c0624ft = (C0624ft) this.f8059p;
                Map a4 = c0624ft.a();
                return a4 != null ? a4.values().iterator() : new C0454bt(c0624ft, 2);
            default:
                return new St(((Ps) this.f8059p).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f8058o) {
            case 2:
                Ps ps = (Ps) this.f8059p;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : ps.entrySet()) {
                        if (Bs.r(obj, entry.getValue())) {
                            ps.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f8058o) {
            case 2:
                Ps ps = (Ps) this.f8059p;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : ps.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ps.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f8058o) {
            case 2:
                Ps ps = (Ps) this.f8059p;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : ps.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ps.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f8058o) {
            case 0:
                return ((Ct) this.f8059p).f4556s;
            case 1:
                return ((C0624ft) this.f8059p).size();
            default:
                return ((Ps) this.f8059p).f6606q.size();
        }
    }
}
