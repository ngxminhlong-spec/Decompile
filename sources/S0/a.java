package S0;

import c1.C0234c;
import c1.C0237f;
import c1.C0238g;
import e1.d;
import h1.AbstractC1698a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import p1.AbstractC1935v;
import p1.C1919e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1757r;

    /* renamed from: s, reason: collision with root package name */
    public final transient Y0.a f1758s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f1759t;

    /* renamed from: u, reason: collision with root package name */
    public final C0234c f1760u;

    public a(long j4, float f4, float f5) {
        this.f1940o = f4;
        this.f1941p = f5;
        this.f1942q = j4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(long j4, float f4, float f5, ArrayList arrayList, C0234c c0234c, int i4) {
        this(j4, f4, f5);
        this.f1757r = i4;
        switch (i4) {
            case 1:
                this(j4, f4, f5);
                this.f1759t = arrayList;
                this.f1760u = c0234c;
                this.f1758s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 2:
                this(j4, f4, f5);
                this.f1759t = arrayList;
                this.f1760u = c0234c;
                this.f1758s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 3:
                this(j4, f4, f5);
                this.f1759t = arrayList;
                this.f1760u = c0234c;
                this.f1758s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 4:
                this(j4, f4, f5);
                this.f1759t = arrayList;
                this.f1760u = c0234c;
                this.f1758s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 5:
                this(j4, f4, f5);
                this.f1759t = arrayList;
                this.f1760u = c0234c;
                this.f1758s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 6:
                this(j4, f4, f5);
                this.f1759t = arrayList;
                this.f1760u = c0234c;
                this.f1758s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 7:
                this(j4, f4, f5);
                this.f1759t = arrayList;
                this.f1760u = c0234c;
                this.f1758s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 8:
                this(j4, f4, f5);
                this.f1759t = arrayList;
                this.f1760u = c0234c;
                this.f1758s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            default:
                this.f1759t = arrayList;
                this.f1760u = c0234c;
                this.f1758s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
        }
    }

    public static a c(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
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
                if (z5 && (c0234c = C0234c.b(xmlPullParser)) == null) {
                    throw new IOException("Node info error");
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
                if ("create_buff_strategy".equals(xmlPullParser.getName())) {
                    break;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (arrayList.size() != 1 || c0234c == null) {
            throw new RuntimeException("Buff deserialization failed");
        }
        return new a(parseLong, parseFloat, parseFloat2, arrayList, c0234c, 1);
    }

    public static a d(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
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
                if (z5 && (c0234c = C0234c.b(xmlPullParser)) == null) {
                    throw new IOException("Node info error");
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
                if ("create_not_strategy".equals(xmlPullParser.getName())) {
                    break;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (arrayList.size() != 1 || c0234c == null) {
            throw new RuntimeException("Not deserialization failed");
        }
        return new a(parseLong, parseFloat, parseFloat2, arrayList, c0234c, 4);
    }

    public static a e(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
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
                if (z5 && (c0234c = C0234c.b(xmlPullParser)) == null) {
                    throw new IOException("Node info error");
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
                if ("create_tristatebuff_strategy".equals(xmlPullParser.getName())) {
                    break;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (arrayList.size() < 2 || c0234c == null) {
            throw new RuntimeException("TriStateBuffer deserialization failed");
        }
        return new a(parseLong, parseFloat, parseFloat2, arrayList, c0234c, 6);
    }

    public static a f(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
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
                if (z5 && (c0234c = C0234c.b(xmlPullParser)) == null) {
                    throw new IOException("Node info error");
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
                if ("create_xnor_strategy".equals(xmlPullParser.getName())) {
                    break;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (arrayList.size() < 2 || c0234c == null) {
            throw new RuntimeException("Xnor deserialization failed");
        }
        return new a(parseLong, parseFloat, parseFloat2, arrayList, c0234c, 7);
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        switch (this.f1757r) {
            case 0:
                ArrayList arrayList = this.f1759t;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    arrayList2.add(((C0234c) obj).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList2, this.f1760u.a(), 0);
            case 1:
                ArrayList arrayList3 = this.f1759t;
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList3.get(i5);
                    i5++;
                    arrayList4.add(((C0234c) obj2).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList4, this.f1760u.a(), 1);
            case 2:
                ArrayList arrayList5 = this.f1759t;
                ArrayList arrayList6 = new ArrayList(arrayList5.size());
                int size3 = arrayList5.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList5.get(i6);
                    i6++;
                    arrayList6.add(((C0234c) obj3).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList6, this.f1760u.a(), 2);
            case 3:
                ArrayList arrayList7 = this.f1759t;
                ArrayList arrayList8 = new ArrayList(arrayList7.size());
                int size4 = arrayList7.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj4 = arrayList7.get(i7);
                    i7++;
                    arrayList8.add(((C0234c) obj4).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList8, this.f1760u.a(), 3);
            case 4:
                ArrayList arrayList9 = this.f1759t;
                ArrayList arrayList10 = new ArrayList(arrayList9.size());
                int size5 = arrayList9.size();
                int i8 = 0;
                while (i8 < size5) {
                    Object obj5 = arrayList9.get(i8);
                    i8++;
                    arrayList10.add(((C0234c) obj5).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList10, this.f1760u.a(), 4);
            case 5:
                ArrayList arrayList11 = this.f1759t;
                ArrayList arrayList12 = new ArrayList(arrayList11.size());
                int size6 = arrayList11.size();
                int i9 = 0;
                while (i9 < size6) {
                    Object obj6 = arrayList11.get(i9);
                    i9++;
                    arrayList12.add(((C0234c) obj6).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList12, this.f1760u.a(), 5);
            case 6:
                ArrayList arrayList13 = this.f1759t;
                ArrayList arrayList14 = new ArrayList(arrayList13.size());
                int size7 = arrayList13.size();
                int i10 = 0;
                while (i10 < size7) {
                    Object obj7 = arrayList13.get(i10);
                    i10++;
                    arrayList14.add(((C0234c) obj7).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList14, this.f1760u.a(), 6);
            case 7:
                ArrayList arrayList15 = this.f1759t;
                ArrayList arrayList16 = new ArrayList(arrayList15.size());
                int size8 = arrayList15.size();
                int i11 = 0;
                while (i11 < size8) {
                    Object obj8 = arrayList15.get(i11);
                    i11++;
                    arrayList16.add(((C0234c) obj8).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList16, this.f1760u.a(), 7);
            default:
                ArrayList arrayList17 = this.f1759t;
                ArrayList arrayList18 = new ArrayList(arrayList17.size());
                int size9 = arrayList17.size();
                int i12 = 0;
                while (i12 < size9) {
                    Object obj9 = arrayList17.get(i12);
                    i12++;
                    arrayList18.add(((C0234c) obj9).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList18, this.f1760u.a(), 8);
        }
    }

    @Override // W0.a
    public final AbstractC1698a b(d dVar) {
        switch (this.f1757r) {
            case 0:
                ArrayList arrayList = this.f1759t;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    Y0.a aVar = this.f1758s;
                    if (i4 >= size) {
                        return new AbstractC1935v(this.f1942q, this.f1940o, this.f1941p, arrayList2, new C0238g(aVar.b(dVar), this.f1760u), dVar.f12683R);
                    }
                    Object obj = arrayList.get(i4);
                    i4++;
                    arrayList2.add(new C0237f(aVar.b(dVar), (C0234c) obj));
                }
            case 1:
                ArrayList arrayList3 = this.f1759t;
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    Y0.a aVar2 = this.f1758s;
                    if (i5 >= size2) {
                        return new C1919e(this.f1942q, this.f1940o, this.f1941p, arrayList4, new C0238g(aVar2.b(dVar), this.f1760u), dVar.f12683R, 0);
                    }
                    Object obj2 = arrayList3.get(i5);
                    i5++;
                    arrayList4.add(new C0237f(aVar2.b(dVar), (C0234c) obj2));
                }
            case 2:
                ArrayList arrayList5 = this.f1759t;
                ArrayList arrayList6 = new ArrayList(arrayList5.size());
                int size3 = arrayList5.size();
                int i6 = 0;
                while (true) {
                    Y0.a aVar3 = this.f1758s;
                    if (i6 >= size3) {
                        return new AbstractC1935v(this.f1942q, this.f1940o, this.f1941p, arrayList6, new C0238g(aVar3.b(dVar), this.f1760u), dVar.f12683R);
                    }
                    Object obj3 = arrayList5.get(i6);
                    i6++;
                    arrayList6.add(new C0237f(aVar3.b(dVar), (C0234c) obj3));
                }
            case 3:
                ArrayList arrayList7 = this.f1759t;
                ArrayList arrayList8 = new ArrayList(arrayList7.size());
                int size4 = arrayList7.size();
                int i7 = 0;
                while (true) {
                    Y0.a aVar4 = this.f1758s;
                    if (i7 >= size4) {
                        return new AbstractC1935v(this.f1942q, this.f1940o, this.f1941p, arrayList8, new C0238g(aVar4.b(dVar), this.f1760u), dVar.f12683R);
                    }
                    Object obj4 = arrayList7.get(i7);
                    i7++;
                    arrayList8.add(new C0237f(aVar4.b(dVar), (C0234c) obj4));
                }
            case 4:
                ArrayList arrayList9 = this.f1759t;
                ArrayList arrayList10 = new ArrayList(arrayList9.size());
                int size5 = arrayList9.size();
                int i8 = 0;
                while (true) {
                    Y0.a aVar5 = this.f1758s;
                    if (i8 >= size5) {
                        return new C1919e(this.f1942q, this.f1940o, this.f1941p, arrayList10, new C0238g(aVar5.b(dVar), this.f1760u), dVar.f12683R, 1);
                    }
                    Object obj5 = arrayList9.get(i8);
                    i8++;
                    arrayList10.add(new C0237f(aVar5.b(dVar), (C0234c) obj5));
                }
            case 5:
                ArrayList arrayList11 = this.f1759t;
                ArrayList arrayList12 = new ArrayList(arrayList11.size());
                int size6 = arrayList11.size();
                int i9 = 0;
                while (true) {
                    Y0.a aVar6 = this.f1758s;
                    if (i9 >= size6) {
                        return new AbstractC1935v(this.f1942q, this.f1940o, this.f1941p, arrayList12, new C0238g(aVar6.b(dVar), this.f1760u), dVar.f12683R);
                    }
                    Object obj6 = arrayList11.get(i9);
                    i9++;
                    arrayList12.add(new C0237f(aVar6.b(dVar), (C0234c) obj6));
                }
            case 6:
                ArrayList arrayList13 = this.f1759t;
                ArrayList arrayList14 = new ArrayList(arrayList13.size());
                int size7 = arrayList13.size();
                int i10 = 0;
                while (true) {
                    Y0.a aVar7 = this.f1758s;
                    if (i10 >= size7) {
                        return new C1919e(this.f1942q, this.f1940o, this.f1941p, arrayList14, new C0238g(aVar7.b(dVar), this.f1760u), dVar.f12683R, 2);
                    }
                    Object obj7 = arrayList13.get(i10);
                    i10++;
                    arrayList14.add(new C0237f(aVar7.b(dVar), (C0234c) obj7));
                }
            case 7:
                ArrayList arrayList15 = this.f1759t;
                ArrayList arrayList16 = new ArrayList(arrayList15.size());
                int size8 = arrayList15.size();
                int i11 = 0;
                while (true) {
                    Y0.a aVar8 = this.f1758s;
                    if (i11 >= size8) {
                        return new C1919e(this.f1942q, this.f1940o, this.f1941p, arrayList16, new C0238g(aVar8.b(dVar), this.f1760u), dVar.f12683R, 3);
                    }
                    Object obj8 = arrayList15.get(i11);
                    i11++;
                    arrayList16.add(new C0237f(aVar8.b(dVar), (C0234c) obj8));
                }
            default:
                ArrayList arrayList17 = this.f1759t;
                ArrayList arrayList18 = new ArrayList(arrayList17.size());
                int size9 = arrayList17.size();
                int i12 = 0;
                while (true) {
                    Y0.a aVar9 = this.f1758s;
                    if (i12 >= size9) {
                        return new C1919e(this.f1942q, this.f1940o, this.f1941p, arrayList18, new C0238g(aVar9.b(dVar), this.f1760u), dVar.f12683R, 4);
                    }
                    Object obj9 = arrayList17.get(i12);
                    i12++;
                    arrayList18.add(new C0237f(aVar9.b(dVar), (C0234c) obj9));
                }
        }
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        switch (this.f1757r) {
            case 0:
                xmlSerializer.startTag(null, "create_and_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList = this.f1759t;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((C0234c) obj).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "inputs");
                xmlSerializer.startTag(null, "output");
                this.f1760u.g(xmlSerializer);
                xmlSerializer.endTag(null, "output");
                xmlSerializer.endTag(null, "create_and_strategy");
                return;
            case 1:
                xmlSerializer.startTag(null, "create_buff_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList2 = this.f1759t;
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    ((C0234c) obj2).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "inputs");
                xmlSerializer.startTag(null, "output");
                this.f1760u.g(xmlSerializer);
                xmlSerializer.endTag(null, "output");
                xmlSerializer.endTag(null, "create_buff_strategy");
                return;
            case 2:
                xmlSerializer.startTag(null, "create_nand_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList3 = this.f1759t;
                int size3 = arrayList3.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList3.get(i6);
                    i6++;
                    ((C0234c) obj3).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "inputs");
                xmlSerializer.startTag(null, "output");
                this.f1760u.g(xmlSerializer);
                xmlSerializer.endTag(null, "output");
                xmlSerializer.endTag(null, "create_nand_strategy");
                return;
            case 3:
                xmlSerializer.startTag(null, "create_nor_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList4 = this.f1759t;
                int size4 = arrayList4.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj4 = arrayList4.get(i7);
                    i7++;
                    ((C0234c) obj4).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "inputs");
                xmlSerializer.startTag(null, "output");
                this.f1760u.g(xmlSerializer);
                xmlSerializer.endTag(null, "output");
                xmlSerializer.endTag(null, "create_nor_strategy");
                return;
            case 4:
                xmlSerializer.startTag(null, "create_not_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList5 = this.f1759t;
                int size5 = arrayList5.size();
                int i8 = 0;
                while (i8 < size5) {
                    Object obj5 = arrayList5.get(i8);
                    i8++;
                    ((C0234c) obj5).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "inputs");
                xmlSerializer.startTag(null, "output");
                this.f1760u.g(xmlSerializer);
                xmlSerializer.endTag(null, "output");
                xmlSerializer.endTag(null, "create_not_strategy");
                return;
            case 5:
                xmlSerializer.startTag(null, "create_or_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList6 = this.f1759t;
                int size6 = arrayList6.size();
                int i9 = 0;
                while (i9 < size6) {
                    Object obj6 = arrayList6.get(i9);
                    i9++;
                    ((C0234c) obj6).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "inputs");
                xmlSerializer.startTag(null, "output");
                this.f1760u.g(xmlSerializer);
                xmlSerializer.endTag(null, "output");
                xmlSerializer.endTag(null, "create_or_strategy");
                return;
            case 6:
                xmlSerializer.startTag(null, "create_tristatebuff_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList7 = this.f1759t;
                int size7 = arrayList7.size();
                int i10 = 0;
                while (i10 < size7) {
                    Object obj7 = arrayList7.get(i10);
                    i10++;
                    ((C0234c) obj7).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "inputs");
                xmlSerializer.startTag(null, "output");
                this.f1760u.g(xmlSerializer);
                xmlSerializer.endTag(null, "output");
                xmlSerializer.endTag(null, "create_tristatebuff_strategy");
                return;
            case 7:
                xmlSerializer.startTag(null, "create_xnor_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList8 = this.f1759t;
                int size8 = arrayList8.size();
                int i11 = 0;
                while (i11 < size8) {
                    Object obj8 = arrayList8.get(i11);
                    i11++;
                    ((C0234c) obj8).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "inputs");
                xmlSerializer.startTag(null, "output");
                this.f1760u.g(xmlSerializer);
                xmlSerializer.endTag(null, "output");
                xmlSerializer.endTag(null, "create_xnor_strategy");
                return;
            default:
                xmlSerializer.startTag(null, "create_xor_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList9 = this.f1759t;
                int size9 = arrayList9.size();
                int i12 = 0;
                while (i12 < size9) {
                    Object obj9 = arrayList9.get(i12);
                    i12++;
                    ((C0234c) obj9).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "inputs");
                xmlSerializer.startTag(null, "output");
                this.f1760u.g(xmlSerializer);
                xmlSerializer.endTag(null, "output");
                xmlSerializer.endTag(null, "create_xor_strategy");
                return;
        }
    }
}
