package L3;

import R3.o;
import java.io.Serializable;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final i f1098o;

    /* renamed from: p, reason: collision with root package name */
    public final g f1099p;

    public c(g gVar, i iVar) {
        S3.e.e(iVar, "left");
        this.f1098o = iVar;
        this.f1099p = gVar;
    }

    @Override // L3.i
    public final g b(h hVar) {
        S3.e.e(hVar, "key");
        c cVar = this;
        while (true) {
            g b4 = cVar.f1099p.b(hVar);
            if (b4 != null) {
                return b4;
            }
            i iVar = cVar.f1098o;
            if (!(iVar instanceof c)) {
                return iVar.b(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // L3.i
    public final Object d(Object obj, o oVar) {
        return oVar.d(this.f1098o.d(obj, oVar), this.f1099p);
    }

    @Override // L3.i
    public final i e(i iVar) {
        return AbstractC1895f.u(this, iVar);
    }

    public final boolean equals(Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i4 = 2;
            c cVar2 = cVar;
            int i5 = 2;
            while (true) {
                i iVar = cVar2.f1098o;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i5++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f1098o;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i4++;
            }
            if (i5 == i4) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.f1099p;
                    if (!S3.e.a(cVar.b(gVar.getKey()), gVar)) {
                        z4 = false;
                        break;
                    }
                    i iVar3 = cVar4.f1098o;
                    if (!(iVar3 instanceof c)) {
                        S3.e.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        z4 = S3.e.a(cVar.b(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                }
                if (z4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // L3.i
    public final i f(h hVar) {
        S3.e.e(hVar, "key");
        g gVar = this.f1099p;
        g b4 = gVar.b(hVar);
        i iVar = this.f1098o;
        if (b4 != null) {
            return iVar;
        }
        i f4 = iVar.f(hVar);
        return f4 == iVar ? this : f4 == j.f1101o ? gVar : new c(gVar, f4);
    }

    public final int hashCode() {
        return this.f1099p.hashCode() + this.f1098o.hashCode();
    }

    public final String toString() {
        return "[" + ((String) d("", b.f1095q)) + ']';
    }
}
