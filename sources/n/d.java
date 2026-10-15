package n;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public c f14064o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14065p = true;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f14066q;

    public d(f fVar) {
        this.f14066q = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f14064o;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f14063r;
            this.f14064o = cVar3;
            this.f14065p = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14065p) {
            return this.f14066q.f14067o != null;
        }
        c cVar = this.f14064o;
        return (cVar == null || cVar.f14062q == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14065p) {
            this.f14065p = false;
            this.f14064o = this.f14066q.f14067o;
        } else {
            c cVar = this.f14064o;
            this.f14064o = cVar != null ? cVar.f14062q : null;
        }
        return this.f14064o;
    }
}
