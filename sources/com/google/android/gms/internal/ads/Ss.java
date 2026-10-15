package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ss extends Vs implements NavigableSet {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Ct f7019r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ss(Ct ct, NavigableMap navigableMap) {
        super(ct, navigableMap);
        this.f7019r = ct;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6706o)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((Qs) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new Ss(this.f7019r, ((NavigableMap) ((SortedMap) this.f6706o)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6706o)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.Vs
    public final /* synthetic */ SortedMap g() {
        return (NavigableMap) ((SortedMap) this.f6706o);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z4) {
        return new Ss(this.f7019r, ((NavigableMap) ((SortedMap) this.f6706o)).headMap(obj, z4));
    }

    @Override // com.google.android.gms.internal.ads.Vs, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6706o)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6706o)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        Os os = (Os) iterator();
        if (!os.hasNext()) {
            return null;
        }
        Object next = os.next();
        os.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z4, Object obj2, boolean z5) {
        return new Ss(this.f7019r, ((NavigableMap) ((SortedMap) this.f6706o)).subMap(obj, z4, obj2, z5));
    }

    @Override // com.google.android.gms.internal.ads.Vs, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z4) {
        return new Ss(this.f7019r, ((NavigableMap) ((SortedMap) this.f6706o)).tailMap(obj, z4));
    }

    @Override // com.google.android.gms.internal.ads.Vs, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
