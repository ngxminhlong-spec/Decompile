package n;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public c f14057o;

    /* renamed from: p, reason: collision with root package name */
    public c f14058p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14059q;

    public b(c cVar, c cVar2, int i4) {
        this.f14059q = i4;
        this.f14057o = cVar2;
        this.f14058p = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f14057o == cVar && cVar == this.f14058p) {
            this.f14058p = null;
            this.f14057o = null;
        }
        c cVar4 = this.f14057o;
        if (cVar4 == cVar) {
            switch (this.f14059q) {
                case 0:
                    cVar2 = cVar4.f14063r;
                    break;
                default:
                    cVar2 = cVar4.f14062q;
                    break;
            }
            this.f14057o = cVar2;
        }
        c cVar5 = this.f14058p;
        if (cVar5 == cVar) {
            c cVar6 = this.f14057o;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f14058p = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f14059q) {
            case 0:
                return cVar.f14062q;
            default:
                return cVar.f14063r;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14058p != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f14058p;
        c cVar2 = this.f14057o;
        this.f14058p = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
