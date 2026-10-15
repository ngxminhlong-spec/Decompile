package androidx.lifecycle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements h {

    /* renamed from: o, reason: collision with root package name */
    public boolean f2965o;

    @Override // androidx.lifecycle.h
    public final void a(i iVar, f fVar) {
        if (fVar == f.ON_DESTROY) {
            this.f2965o = false;
            iVar.f().f(this);
        }
    }
}
