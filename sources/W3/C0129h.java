package W3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2098a;

    /* renamed from: b, reason: collision with root package name */
    public final R3.k f2099b;
    public final Object c;
    public final Throwable d;

    public C0129h(Object obj, R3.k kVar, Object obj2, Throwable th) {
        this.f2098a = obj;
        this.f2099b = kVar;
        this.c = obj2;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0129h)) {
            return false;
        }
        C0129h c0129h = (C0129h) obj;
        return S3.e.a(this.f2098a, c0129h.f2098a) && S3.e.a(this.f2099b, c0129h.f2099b) && S3.e.a(this.c, c0129h.c) && S3.e.a(this.d, c0129h.d);
    }

    public final int hashCode() {
        Object obj = this.f2098a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 961;
        R3.k kVar = this.f2099b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Object obj2 = this.c;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2098a + ", cancelHandler=null, onCancellation=" + this.f2099b + ", idempotentResume=" + this.c + ", cancelCause=" + this.d + ')';
    }
}
