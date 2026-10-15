package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.uA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241uA implements ListIterator {

    /* renamed from: o, reason: collision with root package name */
    public final ListIterator f10782o;

    public C1241uA(C1327wA c1327wA, int i4) {
        this.f10782o = c1327wA.f11117o.listIterator(i4);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f10782o.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10782o.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f10782o.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10782o.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f10782o.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10782o.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
