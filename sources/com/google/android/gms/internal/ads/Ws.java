package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ws extends Os implements ListIterator {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Xs f7576s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ws(Xs xs) {
        super(xs);
        this.f7576s = xs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ws(Xs xs, int i4) {
        super(xs, ((List) xs.f7710p).listIterator(i4));
        this.f7576s = xs;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        Xs xs = this.f7576s;
        boolean isEmpty = xs.isEmpty();
        a();
        ((ListIterator) this.f6533p).add(obj);
        xs.f7714t.f4556s++;
        if (isEmpty) {
            xs.g();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f6533p).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f6533p).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f6533p).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f6533p).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f6533p).set(obj);
    }
}
