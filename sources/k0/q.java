package k0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r.e f13549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f13550b;

    public q(r rVar, r.e eVar) {
        this.f13550b = rVar;
        this.f13549a = eVar;
    }

    @Override // k0.n
    public final void e(o oVar) {
        ((ArrayList) this.f13549a.get(this.f13550b.f13552p)).remove(oVar);
        oVar.v(this);
    }
}
