package f2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k extends UnsupportedOperationException {

    /* renamed from: o, reason: collision with root package name */
    public final e2.d f12973o;

    public k(e2.d dVar) {
        this.f12973o = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f12973o));
    }
}
