package Y3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    public final transient L3.i f2227o;

    public f(L3.i iVar) {
        this.f2227o = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f2227o.toString();
    }
}
