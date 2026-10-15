package p1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1937x implements e1.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f14593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1939z f14594b;

    public C1937x(C1939z c1939z) {
        this.f14594b = c1939z;
        this.f14593a = (1000000.0f / c1939z.f14600R) / 2.0f;
    }

    @Override // e1.e
    public final float a() {
        return this.f14594b.f14600R * 2.0f;
    }

    @Override // e1.e
    public final void b(long j4) {
        if (((int) (j4 % this.f14593a)) != 0) {
            return;
        }
        C1939z c1939z = this.f14594b;
        c1939z.f13118B.n(new C1936w(c1939z, !c1939z.f14599Q));
    }
}
