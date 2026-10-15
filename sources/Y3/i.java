package Y3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class i extends S3.a implements T3.c {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2238u;

    public i(j jVar) {
        super(jVar, W3.r.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f2238u = false;
    }

    public final T3.a d() {
        if (this.f2238u) {
            return this;
        }
        T3.a aVar = this.f1779o;
        if (aVar != null) {
            return aVar;
        }
        S3.i.f1791a.getClass();
        this.f1779o = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return c().equals(iVar.c()) && this.f1782r.equals(iVar.f1782r) && this.f1783s.equals(iVar.f1783s) && this.f1780p.equals(iVar.f1780p);
        }
        if (obj instanceof T3.c) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1783s.hashCode() + ((this.f1782r.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        T3.a d = d();
        return d != this ? d.toString() : n0.a.j(new StringBuilder("property "), this.f1782r, " (Kotlin reflection is not available)");
    }
}
