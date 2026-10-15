package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1284vA implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final Iterator f10997o;

    public C1284vA(C1327wA c1327wA) {
        this.f10997o = c1327wA.f11117o.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10997o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f10997o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
