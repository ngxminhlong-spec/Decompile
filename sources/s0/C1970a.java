package s0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1970a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14759a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14760b;
    public boolean c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1970a)) {
            return false;
        }
        C1970a c1970a = (C1970a) obj;
        return this.f14759a == c1970a.f14759a && this.f14760b == c1970a.f14760b && this.c == c1970a.c && this.d == c1970a.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r02 = this.f14759a;
        int i4 = r02;
        if (this.f14760b) {
            i4 = r02 + 16;
        }
        int i5 = i4;
        if (this.c) {
            i5 = i4 + 256;
        }
        return this.d ? i5 + 4096 : i5;
    }

    public final String toString() {
        return "[ Connected=" + this.f14759a + " Validated=" + this.f14760b + " Metered=" + this.c + " NotRoaming=" + this.d + " ]";
    }
}
