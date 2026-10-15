package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class St implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final Iterator f7020o;

    public St(Iterator it) {
        it.getClass();
        this.f7020o = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7020o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f7020o.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7020o.remove();
    }
}
