package t2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class z extends D {

    /* renamed from: o, reason: collision with root package name */
    public boolean f14947o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f14948p;

    public z(Object obj) {
        this.f14948p = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14947o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14947o) {
            throw new NoSuchElementException();
        }
        this.f14947o = true;
        return this.f14948p;
    }
}
