package t2;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C extends y {

    /* renamed from: q, reason: collision with root package name */
    public final transient Object f14858q;

    public C(Object obj) {
        this.f14858q = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14858q.equals(obj);
    }

    @Override // t2.u
    public final int h(Object[] objArr) {
        objArr[0] = this.f14858q;
        return 1;
    }

    @Override // t2.y, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14858q.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new z(this.f14858q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return U.a.k("[", this.f14858q.toString(), "]");
    }
}
