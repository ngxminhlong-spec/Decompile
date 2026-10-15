package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Os implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6532o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final Iterator f6533p;

    /* renamed from: q, reason: collision with root package name */
    public Object f6534q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6535r;

    public Os(Ps ps) {
        this.f6535r = ps;
        this.f6533p = ps.f6606q.entrySet().iterator();
    }

    public Os(Qs qs, Iterator it) {
        this.f6535r = qs;
        this.f6533p = it;
    }

    public Os(Xs xs) {
        this.f6535r = xs;
        Collection collection = xs.f7710p;
        this.f6534q = collection;
        this.f6533p = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public Os(Xs xs, ListIterator listIterator) {
        this.f6535r = xs;
        this.f6534q = xs.f7710p;
        this.f6533p = listIterator;
    }

    public void a() {
        Xs xs = (Xs) this.f6535r;
        xs.h();
        if (xs.f7710p != ((Collection) this.f6534q)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6532o) {
            case 0:
                return this.f6533p.hasNext();
            case 1:
                return this.f6533p.hasNext();
            default:
                a();
                return this.f6533p.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6532o) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f6533p.next();
                this.f6534q = (Collection) entry.getValue();
                return ((Ps) this.f6535r).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f6533p.next();
                this.f6534q = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f6533p.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6532o) {
            case 0:
                Bs.j0("no calls to next() since the last call to remove()", ((Collection) this.f6534q) != null);
                this.f6533p.remove();
                ((Ps) this.f6535r).f6607r.f4556s -= ((Collection) this.f6534q).size();
                ((Collection) this.f6534q).clear();
                this.f6534q = null;
                return;
            case 1:
                Bs.j0("no calls to next() since the last call to remove()", ((Map.Entry) this.f6534q) != null);
                Collection collection = (Collection) ((Map.Entry) this.f6534q).getValue();
                this.f6533p.remove();
                ((Qs) this.f6535r).f6707p.f4556s -= collection.size();
                collection.clear();
                this.f6534q = null;
                return;
            default:
                this.f6533p.remove();
                Xs xs = (Xs) this.f6535r;
                Ct ct = xs.f7713s;
                ct.f4556s--;
                xs.i();
                return;
        }
    }
}
