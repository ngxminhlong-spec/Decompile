package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635r0 extends AbstractList implements RandomAccess, P {

    /* renamed from: o, reason: collision with root package name */
    public final O f12242o;

    public C1635r0(O o4) {
        this.f12242o = o4;
    }

    @Override // com.google.android.gms.internal.play_billing.P
    public final P a() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.P
    public final Object d(int i4) {
        return this.f12242o.f12164p.get(i4);
    }

    @Override // com.google.android.gms.internal.play_billing.P
    public final List f() {
        return Collections.unmodifiableList(this.f12242o.f12164p);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        return this.f12242o.get(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1634q0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new C1632p0(this, i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12242o.f12164p.size();
    }
}
