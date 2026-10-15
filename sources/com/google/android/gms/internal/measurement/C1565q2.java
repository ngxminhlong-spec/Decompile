package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1565q2 implements ListIterator {

    /* renamed from: o, reason: collision with root package name */
    public final ListIterator f12007o;

    public C1565q2(C1568r2 c1568r2, int i4) {
        this.f12007o = c1568r2.f12011o.listIterator(i4);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12007o.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12007o.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f12007o.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12007o.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f12007o.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12007o.previousIndex();
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
