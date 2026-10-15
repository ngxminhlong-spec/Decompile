package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1568r2 extends AbstractList implements RandomAccess, T1 {

    /* renamed from: o, reason: collision with root package name */
    public final S1 f12011o;

    public C1568r2(S1 s12) {
        this.f12011o = s12;
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final T1 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final Object d(int i4) {
        return this.f12011o.f11822p.get(i4);
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final void e(C1591x1 c1591x1) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final List f() {
        return Collections.unmodifiableList(this.f12011o.f11822p);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        return this.f12011o.get(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1528i(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new C1565q2(this, i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12011o.size();
    }
}
