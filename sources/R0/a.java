package R0;

import c1.C0234c;
import c1.C0237f;
import c1.C0238g;
import e1.d;
import h1.AbstractC1698a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import p1.AbstractC1906D;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final transient Y0.a f1750r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f1751s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f1752t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1753u;

    public a(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2, int i4) {
        this.f1753u = i4;
        this.f1942q = j4;
        this.f1940o = f4;
        this.f1941p = f5;
        this.f1751s = arrayList;
        this.f1752t = arrayList2;
        this.f1750r = new Y0.a(-1L, 0.0f, 0.0f, true);
    }

    public static a c(XmlPullParser xmlPullParser) {
        U0.a d = d(xmlPullParser, "create_d_ff_strategy");
        return new a(d.f1807a, d.f1808b, d.c, d.d, d.f1809e, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [U0.a, java.lang.Object] */
    public static U0.a d(XmlPullParser xmlPullParser, String str) {
        ?? obj = new Object();
        obj.f1808b = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        obj.c = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        obj.f1807a = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        boolean z4 = false;
        boolean z5 = false;
        while (eventType != 1) {
            if (eventType == 2) {
                if ("inputs".equals(xmlPullParser.getName())) {
                    xmlPullParser.next();
                    z4 = true;
                }
                if ("outputs".equals(xmlPullParser.getName())) {
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
                    arrayList2.add(b5);
                } else {
                    continue;
                }
            } else if (eventType != 3) {
                continue;
            } else {
                if ("inputs".equals(xmlPullParser.getName())) {
                    z4 = false;
                }
                if ("outputs".equals(xmlPullParser.getName())) {
                    z5 = false;
                }
                if (str.equals(xmlPullParser.getName())) {
                    break;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (arrayList.isEmpty() || arrayList2.isEmpty()) {
            throw new RuntimeException("Latch deserialization failed");
        }
        obj.d = arrayList;
        obj.f1809e = arrayList2;
        return obj;
    }

    public static a e(XmlPullParser xmlPullParser) {
        U0.a d = d(xmlPullParser, "create_jk_ff_strategy");
        return new a(d.f1807a, d.f1808b, d.c, d.d, d.f1809e, 1);
    }

    public static a f(XmlPullParser xmlPullParser) {
        U0.a d = d(xmlPullParser, "create_sr_ff_strategy");
        return new a(d.f1807a, d.f1808b, d.c, d.d, d.f1809e, 2);
    }

    public static a h(XmlPullParser xmlPullParser) {
        U0.a d = d(xmlPullParser, "create_t_ff_strategy");
        return new a(d.f1807a, d.f1808b, d.c, d.d, d.f1809e, 3);
    }

    public static a i(XmlPullParser xmlPullParser) {
        U0.a d = d(xmlPullParser, "create_d_latch_strategy");
        return new a(d.f1807a, d.f1808b, d.c, d.d, d.f1809e, 4);
    }

    public static a j(XmlPullParser xmlPullParser) {
        U0.a d = d(xmlPullParser, "create_jk_latch_strategy");
        return new a(d.f1807a, d.f1808b, d.c, d.d, d.f1809e, 5);
    }

    public static a k(XmlPullParser xmlPullParser) {
        U0.a d = d(xmlPullParser, "create_sr_gated_latch_strategy");
        return new a(d.f1807a, d.f1808b, d.c, d.d, d.f1809e, 6);
    }

    public static a l(XmlPullParser xmlPullParser) {
        U0.a d = d(xmlPullParser, "create_t_latch_strategy");
        return new a(d.f1807a, d.f1808b, d.c, d.d, d.f1809e, 8);
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        ArrayList arrayList = this.f1751s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            arrayList2.add(((C0234c) obj).a());
        }
        ArrayList arrayList3 = this.f1752t;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList4.add(((C0234c) obj2).a());
        }
        float f4 = this.f1940o;
        float f5 = this.f1941p;
        switch (this.f1753u) {
            case 0:
                return new a(j4, f4, f5, arrayList2, arrayList4, 0);
            case 1:
                return new a(j4, f4, f5, arrayList2, arrayList4, 1);
            case 2:
                return new a(j4, f4, f5, arrayList2, arrayList4, 2);
            case 3:
                return new a(j4, f4, f5, arrayList2, arrayList4, 3);
            case 4:
                return new a(j4, f4, f5, arrayList2, arrayList4, 4);
            case 5:
                return new a(j4, f4, f5, arrayList2, arrayList4, 5);
            case 6:
                return new a(j4, f4, f5, arrayList2, arrayList4, 6);
            case 7:
                return new a(j4, f4, f5, arrayList2, arrayList4, 7);
            default:
                return new a(j4, f4, f5, arrayList2, arrayList4, 8);
        }
    }

    @Override // W0.a
    public final AbstractC1698a b(d dVar) {
        Y0.a aVar;
        ArrayList arrayList = this.f1751s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            aVar = this.f1750r;
            if (i5 >= size) {
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            arrayList2.add(new C0237f(aVar.b(dVar), (C0234c) obj));
        }
        ArrayList arrayList3 = this.f1752t;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList4.add(new C0238g(aVar.b(dVar), (C0234c) obj2));
        }
        long j4 = this.f1942q;
        float f4 = this.f1940o;
        float f5 = this.f1941p;
        C1995b c1995b = dVar.f12683R;
        switch (this.f1753u) {
            case 0:
                return new AbstractC1906D(j4, f4, f5, arrayList2, arrayList4, c1995b);
            case 1:
                return new AbstractC1906D(j4, f4, f5, arrayList2, arrayList4, c1995b);
            case 2:
                return new AbstractC1906D(j4, f4, f5, arrayList2, arrayList4, c1995b);
            case 3:
                return new AbstractC1906D(j4, f4, f5, arrayList2, arrayList4, c1995b);
            case 4:
                return new AbstractC1906D(j4, f4, f5, arrayList2, arrayList4, c1995b);
            case 5:
                return new AbstractC1906D(j4, f4, f5, arrayList2, arrayList4, c1995b);
            case 6:
                return new AbstractC1906D(j4, f4, f5, arrayList2, arrayList4, c1995b);
            case 7:
                return new AbstractC1906D(j4, f4, f5, arrayList2, arrayList4, c1995b);
            default:
                return new AbstractC1906D(j4, f4, f5, arrayList2, arrayList4, c1995b);
        }
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, m());
        xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
        xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
        xmlSerializer.startTag(null, "inputs");
        ArrayList arrayList = this.f1751s;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((C0234c) obj).g(xmlSerializer);
        }
        xmlSerializer.endTag(null, "inputs");
        xmlSerializer.startTag(null, "outputs");
        ArrayList arrayList2 = this.f1752t;
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            ((C0234c) obj2).g(xmlSerializer);
        }
        xmlSerializer.endTag(null, "outputs");
        xmlSerializer.endTag(null, m());
    }

    public final String m() {
        switch (this.f1753u) {
            case 0:
                return "create_d_ff_strategy";
            case 1:
                return "create_jk_ff_strategy";
            case 2:
                return "create_sr_ff_strategy";
            case 3:
                return "create_t_ff_strategy";
            case 4:
                return "create_d_latch_strategy";
            case 5:
                return "create_jk_latch_strategy";
            case 6:
                return "create_sr_gated_latch_strategy";
            case 7:
                return "create_sr_latch_strategy";
            default:
                return "create_t_latch_strategy";
        }
    }
}
