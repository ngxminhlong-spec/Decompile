package T0;

import c1.C0234c;
import c1.C0237f;
import c1.C0238g;
import e1.d;
import h1.AbstractC1698a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import p1.i0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final transient Y0.a f1798r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f1799s;

    /* renamed from: t, reason: collision with root package name */
    public final C0234c f1800t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1801u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1802v;

    public c(long j4, float f4, float f5, boolean z4, int i4, ArrayList arrayList, C0234c c0234c) {
        this.f1942q = j4;
        this.f1940o = f4;
        this.f1941p = f5;
        this.f1801u = z4;
        this.f1802v = i4;
        this.f1799s = arrayList;
        this.f1800t = c0234c;
        this.f1798r = new Y0.a(-1L, 0.0f, 0.0f, true);
    }

    public static c c(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        boolean parseBoolean = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "is_on_timer"));
        int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "delay"));
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        C0234c c0234c = null;
        boolean z4 = false;
        boolean z5 = false;
        while (eventType != 1) {
            if (eventType == 2) {
                if ("inputs".equals(xmlPullParser.getName())) {
                    xmlPullParser.next();
                    z4 = true;
                }
                if ("output".equals(xmlPullParser.getName())) {
                    xmlPullParser.next();
                    z5 = true;
                }
                if (z4) {
                    C0234c b4 = C0234c.b(xmlPullParser);
                    if (b4 == null) {
                        throw new IOException("Node info error");
                    }
                    arrayList.add(b4);
                }
                if (z5) {
                    C0234c b5 = C0234c.b(xmlPullParser);
                    if (b5 == null) {
                        throw new IOException("Node info error");
                    }
                    c0234c = b5;
                } else {
                    continue;
                }
            } else if (eventType != 3) {
                continue;
            } else {
                if ("inputs".equals(xmlPullParser.getName())) {
                    z4 = false;
                }
                if ("output".equals(xmlPullParser.getName())) {
                    z5 = false;
                }
                if ("create_timer_strategy".equals(xmlPullParser.getName())) {
                    break;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (arrayList.size() < 2 || c0234c == null) {
            throw new RuntimeException("Timer deserialization failed");
        }
        return new c(parseLong, parseFloat, parseFloat2, parseBoolean, parseInt, arrayList, c0234c);
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        ArrayList arrayList = this.f1799s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            arrayList2.add(((C0234c) obj).a());
        }
        return new c(j4, this.f1940o, this.f1941p, this.f1801u, this.f1802v, arrayList2, this.f1800t.a());
    }

    @Override // W0.a
    public final AbstractC1698a b(d dVar) {
        Y0.a aVar;
        ArrayList arrayList = this.f1799s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            aVar = this.f1798r;
            if (i4 >= size) {
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            arrayList2.add(new C0237f(aVar.b(dVar), (C0234c) obj));
        }
        C0238g c0238g = new C0238g(aVar.b(dVar), this.f1800t);
        boolean z4 = this.f1801u;
        return z4 ? new i0(this.f1942q, this.f1940o, this.f1941p, z4, this.f1802v, arrayList2, c0238g, dVar.f12683R) : new i0(this.f1942q, this.f1940o, this.f1941p, z4, this.f1802v, arrayList2, c0238g, dVar.f12683R);
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "create_timer_strategy");
        xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
        xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
        xmlSerializer.attribute(null, "is_on_timer", String.valueOf(this.f1801u));
        xmlSerializer.attribute(null, "delay", String.valueOf(this.f1802v));
        xmlSerializer.startTag(null, "inputs");
        ArrayList arrayList = this.f1799s;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((C0234c) obj).g(xmlSerializer);
        }
        xmlSerializer.endTag(null, "inputs");
        xmlSerializer.startTag(null, "output");
        this.f1800t.g(xmlSerializer);
        xmlSerializer.endTag(null, "output");
        xmlSerializer.endTag(null, "create_timer_strategy");
    }
}
