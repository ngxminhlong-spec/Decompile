package W3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I implements J {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2068a;

    public I(R3.k kVar) {
        this.f2068a = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R3.k, java.lang.Object] */
    @Override // W3.J
    public final void d(Throwable th) {
        this.f2068a.b(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f2068a.getClass().getSimpleName() + '@' + r.d(this) + ']';
    }
}
