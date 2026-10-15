package t2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class v extends D implements ListIterator {

    /* renamed from: o, reason: collision with root package name */
    public final int f14939o;

    /* renamed from: p, reason: collision with root package name */
    public int f14940p;

    /* renamed from: q, reason: collision with root package name */
    public final x f14941q;

    public v(x xVar, int i4) {
        int size = xVar.size();
        if (i4 < 0 || i4 > size) {
            throw new IndexOutOfBoundsException(r.f(i4, size, "index"));
        }
        this.f14939o = size;
        this.f14940p = i4;
        this.f14941q = xVar;
    }

    public final Object a(int i4) {
        return this.f14941q.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f14940p < this.f14939o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14940p > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f14940p;
        this.f14940p = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14940p;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f14940p - 1;
        this.f14940p = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14940p - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
