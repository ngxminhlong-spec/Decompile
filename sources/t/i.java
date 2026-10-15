package t;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f14834v;

    public i(j jVar) {
        this.f14834v = jVar;
    }

    @Override // t.g
    public final String h() {
        h hVar = (h) this.f14834v.f14835o.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f14832a + "]";
    }
}
