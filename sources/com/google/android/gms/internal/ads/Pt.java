package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Pt extends Ot implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f6536o).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f6536o.iterator();
        it.getClass();
        Es es = this.f6537p;
        es.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (es.l(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Ot, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new Ot(((SortedSet) this.f6536o).headSet(obj), this.f6537p);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f6536o;
        while (true) {
            Object last = sortedSet.last();
            if (this.f6537p.l(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Ot, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new Ot(((SortedSet) this.f6536o).subSet(obj, obj2), this.f6537p);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Ot, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new Ot(((SortedSet) this.f6536o).tailSet(obj), this.f6537p);
    }
}
