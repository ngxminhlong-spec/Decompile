package W3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Q extends S3.a implements R3.k, S3.d, T3.a {

    /* renamed from: u, reason: collision with root package name */
    public final int f2074u;

    public Q(S s4) {
        super(s4, J.class, "invoke", "invoke(Ljava/lang/Throwable;)V", false);
        this.f2074u = 0;
    }

    @Override // S3.d
    public final int a() {
        return 1;
    }

    @Override // R3.k
    public final Object b(Object obj) {
        ((J) this.f1780p).d((Throwable) obj);
        return J3.f.f1032a;
    }

    public final T3.a d() {
        S3.i.f1791a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q) {
            Q q4 = (Q) obj;
            return this.f1782r.equals(q4.f1782r) && this.f1783s.equals(q4.f1783s) && this.f2074u == q4.f2074u && this.f1780p.equals(q4.f1780p) && c().equals(q4.c());
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        T3.a aVar = this.f1779o;
        if (aVar == null) {
            d();
            this.f1779o = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        c();
        return this.f1783s.hashCode() + ((this.f1782r.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        T3.a aVar = this.f1779o;
        if (aVar == null) {
            d();
            this.f1779o = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f1782r;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : U.a.k("function ", str, " (Kotlin reflection is not available)");
    }
}
