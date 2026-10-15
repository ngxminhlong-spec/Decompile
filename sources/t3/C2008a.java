package t3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2008a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f14949a;

    public C2008a(int i4) {
        this.f14949a = i4;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        if (this.f14949a != ((C2008a) ((d) obj)).f14949a) {
            return false;
        }
        Object obj2 = EnumC2010c.f14951o;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f14949a) + (EnumC2010c.f14951o.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f14949a + "intEncoding=" + EnumC2010c.f14951o + ')';
    }
}
