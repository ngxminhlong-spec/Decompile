package W3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0141u extends W implements L3.d, InterfaceC0136o {

    /* renamed from: q, reason: collision with root package name */
    public final L3.i f2122q;

    public C0141u(L3.i iVar, boolean z4) {
        super(z4);
        r((M) iVar.b(C0135n.f2110p));
        this.f2122q = iVar.e(this);
    }

    @Override // L3.d
    public final void c(Object obj) {
        Object z4;
        Throwable a4 = J3.e.a(obj);
        if (a4 != null) {
            obj = new C0130i(a4);
        }
        do {
            z4 = z(p(), obj);
            if (z4 == r.f2114b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0130i c0130i = obj instanceof C0130i ? (C0130i) obj : null;
                throw new IllegalStateException(str, c0130i != null ? c0130i.f2101a : null);
            }
        } while (z4 == r.d);
    }

    @Override // L3.d
    public final L3.i getContext() {
        return this.f2122q;
    }

    @Override // W3.W
    public final String i() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // W3.W
    public final void q(J3.b bVar) {
        r.e(this.f2122q, bVar);
    }

    @Override // W3.W
    public final void v(Object obj) {
        if (obj instanceof C0130i) {
            C0130i.f2100b.get((C0130i) obj);
        }
    }
}
