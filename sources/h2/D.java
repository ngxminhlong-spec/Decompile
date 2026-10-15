package h2;

import e2.C1664b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D extends s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC1706e f13139g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(AbstractC1706e abstractC1706e, int i4) {
        super(abstractC1706e, i4, null);
        this.f13139g = abstractC1706e;
    }

    @Override // h2.s
    public final void a(C1664b c1664b) {
        this.f13139g.f13183x.a(c1664b);
        System.currentTimeMillis();
    }

    @Override // h2.s
    public final boolean b() {
        this.f13139g.f13183x.a(C1664b.f12741s);
        return true;
    }
}
