package c1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236e implements I0.a {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0235d f3550o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0237f f3551p;

    public C0236e(C0237f c0237f, InterfaceC0235d interfaceC0235d) {
        this.f3551p = c0237f;
        this.f3550o = interfaceC0235d;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        this.f3551p.f3554s = null;
        return true;
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        this.f3551p.f3554s = this.f3550o;
        return true;
    }

    @Override // I0.a
    public final boolean c(e1.d dVar) {
        a(dVar);
        return true;
    }
}
