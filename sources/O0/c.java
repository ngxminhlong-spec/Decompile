package O0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class c implements a {

    /* renamed from: o, reason: collision with root package name */
    public a f1251o;

    /* renamed from: p, reason: collision with root package name */
    public Object f1252p;

    @Override // O0.a
    public final void a(a aVar) {
        if (aVar == this.f1251o) {
            this.f1251o = null;
        }
    }

    @Override // O0.a
    public final void c(a aVar) {
        this.f1251o = aVar;
    }

    @Override // O0.a
    public boolean e(Boolean bool) {
        this.f1252p = bool;
        return true;
    }

    @Override // O0.a
    public final boolean g(a aVar) {
        return aVar == this.f1251o;
    }
}
