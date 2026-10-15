package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Vs extends Qs implements SortedSet {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Ct f7306q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vs(Ct ct, SortedMap sortedMap) {
        super(ct, sortedMap);
        this.f7306q = ct;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return g().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return g().firstKey();
    }

    public SortedMap g() {
        return (SortedMap) this.f6706o;
    }

    public SortedSet headSet(Object obj) {
        return new Vs(this.f7306q, g().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return g().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new Vs(this.f7306q, g().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new Vs(this.f7306q, g().tailMap(obj));
    }
}
