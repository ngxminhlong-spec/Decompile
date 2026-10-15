package Z0;

import c1.C0234c;
import c1.C0237f;
import c1.C0238g;
import e1.d;
import h1.AbstractC1698a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import o2.AbstractC1895f;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import p1.P;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final transient Y0.a f2294r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f2295s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2296t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[][] f2297u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[][] f2298v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2299w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2300x;

    public a(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2, boolean[][] zArr, boolean[][] zArr2, boolean z4, boolean z5) {
        this.f1942q = j4;
        this.f1940o = f4;
        this.f1941p = f5;
        this.f2297u = zArr;
        this.f2298v = zArr2;
        this.f2295s = arrayList;
        this.f2296t = arrayList2;
        this.f2299w = z4;
        this.f2300x = z5;
        this.f2294r = new Y0.a(-1L, 0.0f, 0.0f, true);
    }

    public static a c(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        boolean parseBoolean = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "isAndP"));
        boolean parseBoolean2 = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "isOrP"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 2;
        Class cls = Boolean.TYPE;
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) cls, 0, 0);
        boolean[][] zArr2 = (boolean[][]) Array.newInstance((Class<?>) cls, 0, 0);
        int eventType = xmlPullParser.getEventType();
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 = 1; eventType != i5; i5 = 1) {
            if (eventType != i4) {
                if (eventType == 3) {
                    if ("inputs".equals(xmlPullParser.getName())) {
                        z4 = false;
                    }
                    if ("outputs".equals(xmlPullParser.getName())) {
                        z5 = false;
                    }
                    if ("create_pla_strategy".equals(xmlPullParser.getName())) {
                        break;
                    }
                } else {
                    continue;
                }
            } else {
                if ("inputs".equals(xmlPullParser.getName())) {
                    xmlPullParser.next();
                    z4 = true;
                }
                if ("outputs".equals(xmlPullParser.getName())) {
                    xmlPullParser.next();
                    z5 = true;
                }
                if ("and_table".equals(xmlPullParser.getName())) {
                    xmlPullParser.next();
                    zArr = d(xmlPullParser);
                    if (zArr == null) {
                        throw new IOException("Array info error");
                    }
                }
                if ("or_table".equals(xmlPullParser.getName())) {
                    xmlPullParser.next();
                    zArr2 = d(xmlPullParser);
                    if (zArr2 == null) {
                        throw new IOException("Array info error");
                    }
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
            }
            eventType = xmlPullParser.next();
            i4 = 2;
        }
        if (arrayList.isEmpty() || arrayList2.isEmpty()) {
            throw new RuntimeException("PLA deserialization failed");
        }
        return new a(parseLong, parseFloat, parseFloat2, arrayList, arrayList2, zArr, zArr2, parseBoolean, parseBoolean2);
    }

    public static boolean[][] d(XmlPullParser xmlPullParser) {
        if (!"array".equals(xmlPullParser.getName())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 1) {
                break;
            }
            if (eventType != 2) {
                if (eventType == 3 && "array".equals(xmlPullParser.getName())) {
                    break;
                }
            } else if ("row".equals(xmlPullParser.getName())) {
                String[] split = xmlPullParser.nextText().split(" ");
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                for (String str : split) {
                    arrayList2.add(Boolean.valueOf(str));
                }
            }
            eventType = xmlPullParser.next();
        }
        boolean isEmpty = arrayList.isEmpty();
        Class cls = Boolean.TYPE;
        if (isEmpty) {
            return (boolean[][]) Array.newInstance((Class<?>) cls, 0, 0);
        }
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) cls, arrayList.size(), ((ArrayList) arrayList.get(0)).size());
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ArrayList arrayList3 = (ArrayList) obj;
            int size2 = arrayList3.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                zArr[i4][i6] = ((Boolean) obj2).booleanValue();
                i6++;
            }
            i4++;
        }
        return zArr;
    }

    public static void e(XmlSerializer xmlSerializer, boolean[][] zArr) {
        xmlSerializer.startTag(null, "array");
        for (boolean[] zArr2 : zArr) {
            xmlSerializer.startTag(null, "row");
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            while (true) {
                if (i4 < zArr2.length) {
                    sb.append(zArr2[i4] ? "true" : "false");
                    sb.append(" ");
                    i4++;
                }
            }
            xmlSerializer.text(sb.toString());
            xmlSerializer.endTag(null, "row");
        }
        xmlSerializer.endTag(null, "array");
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        ArrayList arrayList = this.f2295s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            arrayList2.add(((C0234c) obj).a());
        }
        ArrayList arrayList3 = this.f2296t;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList4.add(((C0234c) obj2).a());
        }
        return new a(j4, this.f1940o, this.f1941p, arrayList2, arrayList4, AbstractC1895f.i(this.f2297u), AbstractC1895f.i(this.f2298v), this.f2299w, this.f2300x);
    }

    @Override // W0.a
    public final AbstractC1698a b(d dVar) {
        Y0.a aVar;
        ArrayList arrayList = this.f2295s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            aVar = this.f2294r;
            if (i5 >= size) {
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            arrayList2.add(new C0237f(aVar.b(dVar), (C0234c) obj));
        }
        ArrayList arrayList3 = this.f2296t;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList4.add(new C0238g(aVar.b(dVar), (C0234c) obj2));
        }
        boolean[][] zArr = this.f2298v;
        boolean[][] zArr2 = this.f2297u;
        boolean z4 = this.f2299w;
        if ((!z4 || !this.f2300x) && z4) {
            return new P(this.f1942q, this.f1940o, this.f1941p, arrayList2, arrayList4, AbstractC1895f.i(zArr2), AbstractC1895f.i(zArr), dVar.f12683R);
        }
        return new P(this.f1942q, this.f1940o, this.f1941p, arrayList2, arrayList4, AbstractC1895f.i(zArr2), AbstractC1895f.i(zArr), dVar.f12683R);
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "create_pla_strategy");
        xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
        xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
        xmlSerializer.attribute(null, "isAndP", String.valueOf(this.f2299w));
        xmlSerializer.attribute(null, "isOrP", String.valueOf(this.f2300x));
        xmlSerializer.startTag(null, "inputs");
        ArrayList arrayList = this.f2295s;
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
        ArrayList arrayList2 = this.f2296t;
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            ((C0234c) obj2).g(xmlSerializer);
        }
        xmlSerializer.endTag(null, "outputs");
        xmlSerializer.startTag(null, "and_table");
        e(xmlSerializer, this.f2297u);
        xmlSerializer.endTag(null, "and_table");
        xmlSerializer.startTag(null, "or_table");
        e(xmlSerializer, this.f2298v);
        xmlSerializer.endTag(null, "or_table");
        xmlSerializer.endTag(null, "create_pla_strategy");
    }
}
