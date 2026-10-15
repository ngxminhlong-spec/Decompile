package W3;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class N extends CancellationException {

    /* renamed from: o, reason: collision with root package name */
    public final transient W f2072o;

    public N(String str, Throwable th, W w2) {
        super(str);
        this.f2072o = w2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n4 = (N) obj;
        return S3.e.a(n4.getMessage(), getMessage()) && S3.e.a(n4.f2072o, this.f2072o) && S3.e.a(n4.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        S3.e.b(message);
        int hashCode = (this.f2072o.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f2072o;
    }
}
