package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rs extends Us implements NavigableMap {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ct f6862u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rs(Ct ct, NavigableMap navigableMap) {
        super(ct, navigableMap);
        this.f6862u = ct;
    }

    @Override // com.google.android.gms.internal.ads.Us
    public final /* synthetic */ SortedMap b() {
        return (NavigableMap) ((SortedMap) this.f6606q);
    }

    @Override // com.google.android.gms.internal.ads.Us
    public final SortedSet c() {
        return new Ss(this.f6862u, (NavigableMap) ((SortedMap) this.f6606q));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f6606q)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6606q)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.Us
    /* renamed from: d */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new Rs(this.f6862u, ((NavigableMap) ((SortedMap) this.f6606q)).descendingMap());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection] */
    public final C0966nt e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ?? b4 = this.f6862u.b();
        ((ArrayList) b4).addAll((Collection) entry.getValue());
        it.remove();
        return new C0966nt(entry.getKey(), Collections.unmodifiableList(b4));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f6606q)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f6606q)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6606q)).floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z4) {
        return new Rs(this.f6862u, ((NavigableMap) ((SortedMap) this.f6606q)).headMap(obj, z4));
    }

    @Override // com.google.android.gms.internal.ads.Us, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f6606q)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6606q)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.Us, com.google.android.gms.internal.ads.Ps, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f6606q)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f6606q)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6606q)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return e(((Ns) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return e(((Ns) ((Ps) descendingMap()).entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z4, Object obj2, boolean z5) {
        return new Rs(this.f6862u, ((NavigableMap) ((SortedMap) this.f6606q)).subMap(obj, z4, obj2, z5));
    }

    @Override // com.google.android.gms.internal.ads.Us, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z4) {
        return new Rs(this.f6862u, ((NavigableMap) ((SortedMap) this.f6606q)).tailMap(obj, z4));
    }

    @Override // com.google.android.gms.internal.ads.Us, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
