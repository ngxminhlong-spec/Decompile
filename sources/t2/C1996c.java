package t2;

import android.app.Application;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1996c implements F {

    /* renamed from: o, reason: collision with root package name */
    public final G f14888o;

    /* renamed from: p, reason: collision with root package name */
    public final E f14889p;

    public C1996c(G g4, E e4) {
        this.f14888o = g4;
        this.f14889p = e4;
    }

    @Override // t2.H
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q2.e c() {
        Application application = (Application) this.f14888o.f14862o;
        C1997d c1997d = (C1997d) this.f14889p.c();
        o3.i iVar = s.f14936b;
        r.c(iVar);
        return new q2.e(application, c1997d, iVar, 25);
    }
}
