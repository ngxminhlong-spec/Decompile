package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1528i implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11944o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final Iterator f11945p;

    public C1528i(C1568r2 c1568r2) {
        this.f11945p = c1568r2.f12011o.iterator();
    }

    public C1528i(Iterator it) {
        this.f11945p = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11944o) {
            case 0:
                return this.f11945p.hasNext();
            default:
                return this.f11945p.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f11944o) {
            case 0:
                return new C1562q((String) this.f11945p.next());
            default:
                return (String) this.f11945p.next();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
