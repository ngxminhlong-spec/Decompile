package x2;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2093q implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final Iterator f15769o;

    public C2093q(r rVar) {
        this.f15769o = rVar.f15773o.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15769o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f15769o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
