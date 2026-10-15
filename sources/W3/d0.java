package W3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d0 implements L3.g, L3.h {

    /* renamed from: o, reason: collision with root package name */
    public static final d0 f2095o = new Object();

    @Override // L3.i
    public final L3.g b(L3.h hVar) {
        S3.e.e(hVar, "key");
        if (S3.e.a(this, hVar)) {
            return this;
        }
        return null;
    }

    @Override // L3.i
    public final Object d(Object obj, R3.o oVar) {
        return oVar.d(obj, this);
    }

    @Override // L3.i
    public final L3.i e(L3.i iVar) {
        return android.support.v4.media.session.a.p(this, iVar);
    }

    @Override // L3.i
    public final L3.i f(L3.h hVar) {
        return android.support.v4.media.session.a.n(this, hVar);
    }

    @Override // L3.g
    public final L3.h getKey() {
        return this;
    }
}
