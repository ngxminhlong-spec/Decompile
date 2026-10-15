package t3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h implements q3.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14964a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14965b = false;
    public q3.c c;
    public final e d;

    public h(e eVar) {
        this.d = eVar;
    }

    @Override // q3.g
    public final q3.g b(String str) {
        if (this.f14964a) {
            throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f14964a = true;
        this.d.c(this.c, str, this.f14965b);
        return this;
    }

    @Override // q3.g
    public final q3.g c(boolean z4) {
        if (this.f14964a) {
            throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f14964a = true;
        this.d.b(this.c, z4 ? 1 : 0, this.f14965b);
        return this;
    }
}
