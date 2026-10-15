package T0;

import c1.C0234c;
import c1.C0238g;
import e1.d;
import h1.AbstractC1698a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import p1.Y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final transient Y0.a f1795r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f1796s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1797t;

    public b(long j4, float f4, float f5, ArrayList arrayList, int i4) {
        this.f1942q = j4;
        this.f1940o = f4;
        this.f1941p = f5;
        this.f1797t = i4;
        this.f1796s = arrayList;
        this.f1795r = new Y0.a(-1L, 0.0f, 0.0f, true);
    }

    public static b c(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "sensor_type"));
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        boolean z4 = false;
        while (eventType != 1) {
            if (eventType == 2) {
                if ("outputs".equals(xmlPullParser.getName())) {
                    xmlPullParser.next();
                    z4 = true;
                }
                if (z4) {
                    C0234c b4 = C0234c.b(xmlPullParser);
                    if (b4 == null) {
                        throw new IOException("Node info error");
                    }
                    arrayList.add(b4);
                } else {
                    continue;
                }
            } else if (eventType != 3) {
                continue;
            } else {
                if ("outputs".equals(xmlPullParser.getName())) {
                    z4 = false;
                }
                if ("create_sensor_strategy".equals(xmlPullParser.getName())) {
                    break;
                }
            }
            eventType = xmlPullParser.next();
        }
        return new b(parseLong, parseFloat, parseFloat2, arrayList, parseInt);
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        ArrayList arrayList = this.f1796s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            arrayList2.add(((C0234c) obj).a());
        }
        return new b(j4, this.f1940o, this.f1941p, arrayList2, this.f1797t);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [p1.f0, h1.a, p1.Y] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p1.F, h1.a, p1.Y] */
    /* JADX WARN: Type inference failed for: r0v4, types: [p1.h, h1.a, p1.Y] */
    /* JADX WARN: Type inference failed for: r0v5, types: [p1.H, h1.a, p1.Y] */
    /* JADX WARN: Type inference failed for: r0v7, types: [p1.b, h1.a, p1.Y] */
    /* JADX WARN: Type inference failed for: r0v9, types: [p1.S, h1.a, p1.Y] */
    @Override // W0.a
    public final AbstractC1698a b(d dVar) {
        ArrayList arrayList = this.f1796s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            arrayList2.add(new C0238g(this.f1795r.b(dVar), ((C0234c) obj).a()));
        }
        switch (this.f1797t) {
            case 1:
                ?? y = new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
                y.f14403U = -1;
                y.f14405W = 500;
                return y;
            case 2:
                return new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
            case 3:
                ?? y4 = new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
                y4.f14531T = new float[4];
                y4.f14532U = new float[4];
                return y4;
            case 4:
                ?? y5 = new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
                y5.f14416U = -1;
                y5.f14417V = 200;
                return y5;
            case 5:
                return new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
            case 6:
                ?? y6 = new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
                y6.f14499T = new boolean[4];
                y6.f14500U = new boolean[4];
                y6.f14501V = r11;
                float[] fArr = {50.0f, 50.0f};
                return y6;
            case 7:
                return new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
            case 8:
                ?? y7 = new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
                y7.f14476U = -1;
                y7.f14477V = 650;
                y7.f14478W = 450;
                return y7;
            case 9:
                ?? y8 = new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
                y8.f14527T = new boolean[4];
                y8.f14528U = new boolean[4];
                return y8;
            case 10:
                return new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
            default:
                return new Y(this.f1942q, this.f1940o, this.f1941p, arrayList2, dVar.f12683R);
        }
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "create_sensor_strategy");
        xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
        xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
        xmlSerializer.attribute(null, "sensor_type", String.valueOf(this.f1797t));
        xmlSerializer.startTag(null, "outputs");
        ArrayList arrayList = this.f1796s;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((C0234c) obj).g(xmlSerializer);
        }
        xmlSerializer.endTag(null, "outputs");
        xmlSerializer.endTag(null, "create_sensor_strategy");
    }
}
