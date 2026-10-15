package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1605c implements ListIterator, Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final int f12182o;

    /* renamed from: p, reason: collision with root package name */
    public int f12183p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1609e f12184q;

    public C1605c(AbstractC1609e abstractC1609e, int i4) {
        int size = abstractC1609e.size();
        AbstractC1895f.H(i4, size);
        this.f12182o = size;
        this.f12183p = i4;
        this.f12184q = abstractC1609e;
    }

    public final Object a(int i4) {
        return this.f12184q.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12183p < this.f12182o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12183p > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f12183p;
        this.f12183p = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12183p;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f12183p - 1;
        this.f12183p = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12183p - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
