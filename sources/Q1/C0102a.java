package Q1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1678a;

    /* renamed from: b, reason: collision with root package name */
    public float f1679b;

    public final synchronized float a() {
        if (!e()) {
            return 1.0f;
        }
        return this.f1679b;
    }

    public final synchronized void b(boolean z4) {
        this.f1678a = z4;
    }

    public final synchronized void c(float f4) {
        this.f1679b = f4;
    }

    public final synchronized boolean d() {
        return this.f1678a;
    }

    public final synchronized boolean e() {
        return this.f1679b >= 0.0f;
    }
}
