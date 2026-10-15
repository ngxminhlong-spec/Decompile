package T0;

import c1.C0234c;
import c1.C0238g;
import e1.d;
import h1.AbstractC1698a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import p1.C1939z;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final transient Y0.a f1793r;

    /* renamed from: s, reason: collision with root package name */
    public final float f1794s;

    public a(long j4, float f4, float f5, float f6) {
        this.f1942q = j4;
        this.f1940o = f4;
        this.f1941p = f5;
        this.f1794s = f6;
        this.f1793r = new Y0.a(-1L, 0.0f, 0.0f, true);
    }

    public static a c(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        float parseFloat3 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "freq"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_generator_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, parseFloat3);
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        return new a(j4, this.f1940o, this.f1941p, this.f1794s);
    }

    @Override // W0.a
    public final AbstractC1698a b(d dVar) {
        return new C1939z(this.f1942q, new C0238g(this.f1793r.b(dVar), new C0234c(3, 0, "out", false)), this.f1940o, this.f1941p, this.f1794s, dVar.f12683R);
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "create_generator_strategy");
        xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
        xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
        xmlSerializer.attribute(null, "freq", String.valueOf(this.f1794s));
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
        xmlSerializer.endTag(null, "create_generator_strategy");
    }
}
