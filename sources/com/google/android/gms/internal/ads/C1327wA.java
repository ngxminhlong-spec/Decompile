package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327wA extends AbstractList implements RandomAccess, Sz {

    /* renamed from: o, reason: collision with root package name */
    public final Rz f11117o;

    public C1327wA(Rz rz) {
        this.f11117o = rz;
    }

    @Override // com.google.android.gms.internal.ads.Sz
    public final Sz a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Sz
    public final Object d(int i4) {
        return this.f11117o.f6872p.get(i4);
    }

    @Override // com.google.android.gms.internal.ads.Sz
    public final List f() {
        return Collections.unmodifiableList(this.f11117o.f6872p);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        return this.f11117o.get(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1284vA(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new C1241uA(this, i4);
    }

    @Override // com.google.android.gms.internal.ads.Sz
    public final void m(AbstractC0886lz abstractC0886lz) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11117o.f6872p.size();
    }
}
