package L3;

import R3.o;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: o, reason: collision with root package name */
    public final h f1094o;

    public a(h hVar) {
        this.f1094o = hVar;
    }

    @Override // L3.i
    public g b(h hVar) {
        S3.e.e(hVar, "key");
        if (S3.e.a(getKey(), hVar)) {
            return this;
        }
        return null;
    }

    @Override // L3.i
    public final Object d(Object obj, o oVar) {
        return oVar.d(obj, this);
    }

    @Override // L3.i
    public final i e(i iVar) {
        return android.support.v4.media.session.a.p(this, iVar);
    }

    @Override // L3.i
    public i f(h hVar) {
        return android.support.v4.media.session.a.n(this, hVar);
    }

    @Override // L3.g
    public final h getKey() {
        return this.f1094o;
    }
}
