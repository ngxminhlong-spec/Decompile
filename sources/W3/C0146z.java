package W3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146z implements G {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2126a;

    public C0146z(boolean z4) {
        this.f2126a = z4;
    }

    @Override // W3.G
    public final boolean a() {
        return this.f2126a;
    }

    @Override // W3.G
    public final X e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f2126a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
