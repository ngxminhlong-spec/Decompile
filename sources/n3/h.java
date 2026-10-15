package n3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final q f14130a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14131b;

    public h(q qVar, boolean z4) {
        this.f14130a = qVar;
        this.f14131b = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f14130a.equals(this.f14130a) && hVar.f14131b == this.f14131b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14130a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f14131b).hashCode();
    }
}
