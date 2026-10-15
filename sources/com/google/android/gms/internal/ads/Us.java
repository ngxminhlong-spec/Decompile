package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Us extends Ps implements SortedMap {

    /* renamed from: s, reason: collision with root package name */
    public SortedSet f7203s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ct f7204t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Us(Ct ct, SortedMap sortedMap) {
        super(ct, sortedMap);
        this.f7204t = ct;
    }

    public SortedMap b() {
        return (SortedMap) this.f6606q;
    }

    public SortedSet c() {
        return new Vs(this.f7204t, b());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // com.google.android.gms.internal.ads.Ps, java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f7203s;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet c = c();
        this.f7203s = c;
        return c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return b().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new Us(this.f7204t, b().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return b().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new Us(this.f7204t, b().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new Us(this.f7204t, b().tailMap(obj));
    }
}
