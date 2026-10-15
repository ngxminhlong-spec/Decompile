package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1052pt extends Tt implements ListIterator {

    /* renamed from: p, reason: collision with root package name */
    public final int f10049p;

    /* renamed from: q, reason: collision with root package name */
    public int f10050q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC1137rt f10051r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052pt(AbstractC1137rt abstractC1137rt, int i4) {
        super(0);
        int size = abstractC1137rt.size();
        Bs.C(i4, size);
        this.f10049p = size;
        this.f10050q = i4;
        this.f10051r = abstractC1137rt;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object b(int i4) {
        return this.f10051r.get(i4);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f10050q < this.f10049p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10050q > 0;
    }

    @Override // com.google.android.gms.internal.ads.Tt, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f10050q;
        this.f10050q = i4 + 1;
        return b(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10050q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f10050q - 1;
        this.f10050q = i4;
        return b(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10050q - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
