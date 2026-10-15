package Z3;

import W3.AbstractC0134m;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: r, reason: collision with root package name */
    public static final e f2330r;

    /* JADX WARN: Type inference failed for: r0v0, types: [W3.m, Z3.e, Z3.h] */
    static {
        int i4 = k.c;
        int i5 = k.d;
        long j4 = k.f2338e;
        String str = k.f2336a;
        ?? abstractC0134m = new AbstractC0134m();
        abstractC0134m.f2332q = new c(i4, i5, j4, str);
        f2330r = abstractC0134m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // W3.AbstractC0134m
    public final String toString() {
        return "Dispatchers.Default";
    }
}
