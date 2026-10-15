package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1634q0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final Iterator f12241o;

    public C1634q0(C1635r0 c1635r0) {
        this.f12241o = c1635r0.f12242o.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12241o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f12241o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
