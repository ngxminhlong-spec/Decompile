package y0;

import d3.AbstractC1654b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends AbstractC1654b {
    @Override // d3.AbstractC1654b
    public final void N(g gVar, g gVar2) {
        gVar.f15898b = gVar2;
    }

    @Override // d3.AbstractC1654b
    public final void O(g gVar, Thread thread) {
        gVar.f15897a = thread;
    }

    @Override // d3.AbstractC1654b
    public final boolean c(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f15904p != cVar) {
                    return false;
                }
                hVar.f15904p = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d3.AbstractC1654b
    public final boolean d(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f15903o != obj) {
                    return false;
                }
                hVar.f15903o = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d3.AbstractC1654b
    public final boolean e(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f15905q != gVar) {
                    return false;
                }
                hVar.f15905q = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
