package androidx.lifecycle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements h {
    @Override // androidx.lifecycle.h
    public final void a(i iVar, f fVar) {
        if (fVar == f.ON_CREATE) {
            iVar.f().f(this);
            throw null;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + fVar).toString());
    }
}
