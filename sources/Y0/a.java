package Y0;

import I0.b;
import org.xmlpull.v1.XmlSerializer;
import p1.C1912J;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2147r;

    public a(long j4, float f4, float f5, boolean z4) {
        this.f1942q = j4;
        this.f1940o = f4;
        this.f1941p = f5;
        this.f2147r = z4;
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        return new a(j4, this.f1940o, this.f1941p, this.f2147r);
    }

    @Override // W0.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1912J b(b bVar) {
        return this.f2147r ? new C1912J(this.f1942q, this.f1940o, this.f1941p, bVar.k()) : new C1912J(this.f1942q, this.f1940o, this.f1941p, bVar.k());
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "create_node_strategy");
        xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
        xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
        xmlSerializer.attribute(null, "is_io", String.valueOf(this.f2147r));
        xmlSerializer.endTag(null, "create_node_strategy");
    }
}
