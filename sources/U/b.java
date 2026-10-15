package U;

import R3.k;
import S3.f;
import W3.C0130i;
import W3.C0141u;
import W3.G;
import W3.H;
import java.util.concurrent.CancellationException;
import t.h;
import t.j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends f implements k {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f1805p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0141u f1806q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, C0141u c0141u) {
        super(1);
        this.f1805p = hVar;
        this.f1806q = c0141u;
    }

    @Override // R3.k
    public final Object b(Object obj) {
        G g4;
        Throwable th = (Throwable) obj;
        h hVar = this.f1805p;
        if (th == null) {
            Object p3 = this.f1806q.p();
            if (p3 instanceof G) {
                throw new IllegalStateException("This job has not completed yet");
            }
            if (p3 instanceof C0130i) {
                throw ((C0130i) p3).f2101a;
            }
            H h4 = p3 instanceof H ? (H) p3 : null;
            if (h4 != null && (g4 = h4.f2067a) != null) {
                p3 = g4;
            }
            hVar.d = true;
            j jVar = hVar.f14833b;
            if (jVar != null && jVar.f14836p.j(p3)) {
                hVar.f14832a = null;
                hVar.f14833b = null;
                hVar.c = null;
            }
        } else if (th instanceof CancellationException) {
            hVar.d = true;
            j jVar2 = hVar.f14833b;
            if (jVar2 != null && jVar2.f14836p.cancel(true)) {
                hVar.f14832a = null;
                hVar.f14833b = null;
                hVar.c = null;
            }
        } else {
            hVar.d = true;
            j jVar3 = hVar.f14833b;
            if (jVar3 != null && jVar3.f14836p.k(th)) {
                hVar.f14832a = null;
                hVar.f14833b = null;
                hVar.c = null;
            }
        }
        return J3.f.f1032a;
    }
}
