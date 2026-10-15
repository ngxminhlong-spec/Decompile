package Z3;

import W3.AbstractC0134m;
import W3.D;
import Y3.r;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends D implements Executor {

    /* renamed from: q, reason: collision with root package name */
    public static final d f2328q = new AbstractC0134m();

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC0134m f2329r;

    /* JADX WARN: Type inference failed for: r0v0, types: [W3.m, Z3.d] */
    static {
        AbstractC0134m abstractC0134m = l.f2342q;
        int i4 = r.f2250a;
        if (64 >= i4) {
            i4 = 64;
        }
        int e4 = Y3.a.e(i4, 12, "kotlinx.coroutines.io.parallelism");
        abstractC0134m.getClass();
        if (e4 < 1) {
            throw new IllegalArgumentException(U.a.i("Expected positive parallelism level, but got ", e4).toString());
        }
        if (e4 < k.d) {
            if (e4 < 1) {
                throw new IllegalArgumentException(U.a.i("Expected positive parallelism level, but got ", e4).toString());
            }
            abstractC0134m = new Y3.h(abstractC0134m, e4);
        }
        f2329r = abstractC0134m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(L3.j.f1101o, runnable);
    }

    @Override // W3.AbstractC0134m
    public final void g(L3.i iVar, Runnable runnable) {
        f2329r.g(iVar, runnable);
    }

    @Override // W3.AbstractC0134m
    public final String toString() {
        return "Dispatchers.IO";
    }
}
