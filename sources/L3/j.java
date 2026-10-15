package L3;

import R3.o;
import java.io.Serializable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final j f1101o = new Object();

    @Override // L3.i
    public final g b(h hVar) {
        S3.e.e(hVar, "key");
        return null;
    }

    @Override // L3.i
    public final Object d(Object obj, o oVar) {
        return obj;
    }

    @Override // L3.i
    public final i e(i iVar) {
        S3.e.e(iVar, "context");
        return iVar;
    }

    @Override // L3.i
    public final i f(h hVar) {
        S3.e.e(hVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
