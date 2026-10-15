package H0;

import org.xmlpull.v1.XmlSerializer;
import p1.C1937x;
import p1.C1939z;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements I0.d {

    /* renamed from: o, reason: collision with root package name */
    public final float f851o;

    /* renamed from: p, reason: collision with root package name */
    public final float f852p;

    /* renamed from: q, reason: collision with root package name */
    public final long f853q;

    public e(long j4, float f4, float f5) {
        this.f853q = j4;
        this.f851o = f4;
        this.f852p = f5;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        C1939z c1939z = (C1939z) dVar.h(this.f853q);
        c1939z.N(false, dVar);
        c1939z.f14600R = this.f852p;
        c1939z.f14601S = new C1937x(c1939z);
        c1939z.f14602T = C1939z.O(c1939z.f14600R);
        c1939z.N(true, dVar);
        return true;
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        C1939z c1939z = (C1939z) dVar.h(this.f853q);
        c1939z.N(false, dVar);
        c1939z.f14600R = this.f851o;
        c1939z.f14601S = new C1937x(c1939z);
        c1939z.f14602T = C1939z.O(c1939z.f14600R);
        c1939z.N(true, dVar);
        return true;
    }

    @Override // I0.a
    public final boolean c(e1.d dVar) {
        a(dVar);
        return true;
    }

    @Override // I0.d
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "generator_props_command");
        xmlSerializer.attribute(null, "id", String.valueOf(this.f853q));
        xmlSerializer.attribute(null, "old_freq", String.valueOf(this.f851o));
        xmlSerializer.attribute(null, "new_freq", String.valueOf(this.f852p));
        xmlSerializer.endTag(null, "generator_props_command");
    }
}
