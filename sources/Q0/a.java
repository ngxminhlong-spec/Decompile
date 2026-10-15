package Q0;

import c1.C0234c;
import c1.C0237f;
import c1.C0238g;
import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.ads.Qw;
import com.google.android.gms.internal.ads.Wl;
import e1.d;
import h1.AbstractC1698a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import k.C1748e;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import p1.AbstractC1913K;
import p1.C1926l;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1615r;

    /* renamed from: s, reason: collision with root package name */
    public final transient Y0.a f1616s;

    public a(long j4, float f4, float f5, int i4) {
        this.f1615r = i4;
        switch (i4) {
            case 1:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 2:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 3:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 4:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 5:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 6:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 7:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 8:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 9:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 10:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 11:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 12:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            case 13:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
            default:
                this.f1942q = j4;
                this.f1940o = f4;
                this.f1941p = f5;
                this.f1616s = new Y0.a(-1L, 0.0f, 0.0f, true);
                return;
        }
    }

    public static a c(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_constant_high_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 0);
    }

    public static a d(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_constant_low_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 1);
    }

    public static a e(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_speaker_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 10);
    }

    public static a f(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_vibration_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 12);
    }

    public static a h(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_zoomer_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 13);
    }

    public static a i(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_bcd7_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 2);
    }

    public static a j(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_button_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 3);
    }

    public static a k(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_color_light_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 4);
    }

    public static a l(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_color_matrix_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 5);
    }

    public static a m(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_flashlight_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 6);
    }

    public static a n(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_14_disp_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 7);
    }

    public static a o(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_light_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 8);
    }

    public static a p(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && (eventType != 3 || !"create_7_disp_strategy".equals(xmlPullParser.getName()))) {
            eventType = xmlPullParser.next();
        }
        return new a(parseLong, parseFloat, parseFloat2, 9);
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        switch (this.f1615r) {
            case 0:
                return new a(j4, this.f1940o, this.f1941p, 0);
            case 1:
                return new a(j4, this.f1940o, this.f1941p, 1);
            case 2:
                return new a(j4, this.f1940o, this.f1941p, 2);
            case 3:
                return new a(j4, this.f1940o, this.f1941p, 3);
            case 4:
                return new a(j4, this.f1940o, this.f1941p, 4);
            case 5:
                return new a(j4, this.f1940o, this.f1941p, 5);
            case 6:
                return new a(j4, this.f1940o, this.f1941p, 6);
            case 7:
                return new a(j4, this.f1940o, this.f1941p, 7);
            case 8:
                return new a(j4, this.f1940o, this.f1941p, 8);
            case 9:
                return new a(j4, this.f1940o, this.f1941p, 9);
            case 10:
                return new a(j4, this.f1940o, this.f1941p, 10);
            case 11:
                return new a(j4, this.f1940o, this.f1941p, 11);
            case 12:
                return new a(j4, this.f1940o, this.f1941p, 12);
            default:
                return new a(j4, this.f1940o, this.f1941p, 13);
        }
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, h1.a, p1.K, p1.a0] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, h1.a, p1.K, p1.Z] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, h1.a, p1.K, p1.i] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, h1.a, p1.K, p1.j] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, p1.u, h1.a, p1.K] */
    /* JADX WARN: Type inference failed for: r15v0, types: [p1.r, java.lang.Object, h1.a, p1.K] */
    /* JADX WARN: Type inference failed for: r5v21, types: [p1.g, h1.a, p1.K] */
    /* JADX WARN: Type inference failed for: r5v47, types: [p1.s, java.lang.Object, h1.a, p1.K] */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.Object, p1.E, h1.a, p1.K] */
    /* JADX WARN: Type inference failed for: r5v78, types: [p1.b0, h1.a, p1.K] */
    /* JADX WARN: Type inference failed for: r5v80, types: [p1.j0, java.lang.Object, h1.a, p1.K] */
    /* JADX WARN: Type inference failed for: r5v82, types: [p1.l0, java.lang.Object, h1.a, p1.K] */
    @Override // W0.a
    public final AbstractC1698a b(d dVar) {
        switch (this.f1615r) {
            case 0:
                C0238g c0238g = new C0238g(this.f1616s.b(dVar), new C0234c(4, 0, "out", false));
                C1926l c1926l = new C1926l(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R, 0);
                c1926l.f14560Q = c0238g;
                c0238g.f3557s = true;
                c1926l.H();
                return c1926l;
            case 1:
                C0238g c0238g2 = new C0238g(this.f1616s.b(dVar), new C0234c(4, 0, "out", false));
                C1926l c1926l2 = new C1926l(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R, 1);
                c1926l2.f14560Q = c0238g2;
                c1926l2.H();
                return c1926l2;
            case 2:
                ArrayList arrayList = new ArrayList();
                Y0.a aVar = this.f1616s;
                int i4 = 0;
                arrayList.add(new C0237f(aVar.b(dVar), new C0234c(2, 0, "A", true)));
                arrayList.add(new C0237f(aVar.b(dVar), new C0234c(2, 1, "B", true)));
                arrayList.add(new C0237f(aVar.b(dVar), new C0234c(2, 2, "C", true)));
                arrayList.add(new C0237f(aVar.b(dVar), new C0234c(2, 3, "D", true)));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C0238g(aVar.b(dVar), new C0234c(3, 0, "a", true)));
                arrayList2.add(new C0238g(aVar.b(dVar), new C0234c(3, 1, "b", true)));
                arrayList2.add(new C0238g(aVar.b(dVar), new C0234c(3, 2, "c", true)));
                arrayList2.add(new C0238g(aVar.b(dVar), new C0234c(3, 3, "d", true)));
                arrayList2.add(new C0238g(aVar.b(dVar), new C0234c(3, 4, "e", true)));
                arrayList2.add(new C0238g(aVar.b(dVar), new C0234c(3, 5, "f", true)));
                arrayList2.add(new C0238g(aVar.b(dVar), new C0234c(3, 6, "g", true)));
                ?? abstractC1913K = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                ArrayList arrayList3 = new ArrayList();
                abstractC1913K.f14579R = arrayList3;
                HashMap hashMap = new HashMap();
                abstractC1913K.f14580S = hashMap;
                abstractC1913K.f14581T = -1;
                abstractC1913K.f14582U = true;
                abstractC1913K.f14577P = arrayList;
                abstractC1913K.f14578Q = arrayList2;
                arrayList3.addAll(arrayList);
                arrayList3.addAll(arrayList2);
                HashSet hashSet = new HashSet();
                hashSet.add(0);
                hashSet.add(1);
                hashSet.add(2);
                hashSet.add(3);
                hashSet.add(4);
                hashSet.add(5);
                hashMap.put(0, hashSet);
                HashSet hashSet2 = new HashSet();
                hashSet2.add(1);
                hashSet2.add(2);
                hashMap.put(1, hashSet2);
                HashSet hashSet3 = new HashSet();
                hashSet3.add(0);
                hashSet3.add(1);
                hashSet3.add(3);
                hashSet3.add(4);
                hashSet3.add(6);
                hashMap.put(2, hashSet3);
                HashSet hashSet4 = new HashSet();
                hashSet4.add(0);
                hashSet4.add(1);
                hashSet4.add(2);
                hashSet4.add(3);
                hashSet4.add(6);
                hashMap.put(3, hashSet4);
                HashSet hashSet5 = new HashSet();
                hashSet5.add(1);
                hashSet5.add(2);
                hashSet5.add(5);
                hashSet5.add(6);
                hashMap.put(4, hashSet5);
                HashSet hashSet6 = new HashSet();
                hashSet6.add(0);
                hashSet6.add(2);
                hashSet6.add(3);
                hashSet6.add(5);
                hashSet6.add(6);
                hashMap.put(5, hashSet6);
                HashSet hashSet7 = new HashSet();
                hashSet7.add(0);
                hashSet7.add(2);
                hashSet7.add(3);
                hashSet7.add(4);
                hashSet7.add(5);
                hashSet7.add(6);
                hashMap.put(6, hashSet7);
                HashSet hashSet8 = new HashSet();
                hashSet8.add(0);
                hashSet8.add(1);
                hashSet8.add(2);
                hashMap.put(7, hashSet8);
                HashSet hashSet9 = new HashSet();
                hashSet9.add(0);
                hashSet9.add(1);
                hashSet9.add(2);
                hashSet9.add(3);
                hashSet9.add(4);
                hashSet9.add(5);
                hashSet9.add(6);
                hashMap.put(8, hashSet9);
                HashSet hashSet10 = new HashSet();
                hashSet10.add(0);
                hashSet10.add(1);
                hashSet10.add(2);
                hashSet10.add(3);
                hashSet10.add(5);
                hashSet10.add(6);
                hashMap.put(9, hashSet10);
                HashSet hashSet11 = new HashSet();
                hashSet11.add(0);
                hashSet11.add(1);
                hashSet11.add(2);
                hashSet11.add(4);
                hashSet11.add(5);
                hashSet11.add(6);
                hashMap.put(10, hashSet11);
                HashSet hashSet12 = new HashSet();
                hashSet12.add(2);
                hashSet12.add(3);
                hashSet12.add(4);
                hashSet12.add(5);
                hashSet12.add(6);
                hashMap.put(11, hashSet12);
                HashSet hashSet13 = new HashSet();
                hashSet13.add(0);
                hashSet13.add(3);
                hashSet13.add(4);
                hashSet13.add(5);
                hashMap.put(12, hashSet13);
                HashSet hashSet14 = new HashSet();
                hashSet14.add(1);
                hashSet14.add(2);
                hashSet14.add(3);
                hashSet14.add(4);
                hashSet14.add(6);
                hashMap.put(13, hashSet14);
                HashSet hashSet15 = new HashSet();
                hashSet15.add(0);
                hashSet15.add(3);
                hashSet15.add(4);
                hashSet15.add(5);
                hashSet15.add(6);
                hashMap.put(14, hashSet15);
                HashSet hashSet16 = new HashSet();
                hashSet16.add(0);
                hashSet16.add(4);
                hashSet16.add(5);
                hashSet16.add(6);
                hashMap.put(15, hashSet16);
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((C0237f) obj).f3554s = new C1748e(5, (Object) abstractC1913K);
                }
                abstractC1913K.H();
                return abstractC1913K;
            case 3:
                C0238g c0238g3 = new C0238g(this.f1616s.b(dVar), new C0234c(4, 0, "out", false));
                ?? abstractC1913K2 = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                abstractC1913K2.f14529P = c0238g3;
                abstractC1913K2.H();
                return abstractC1913K2;
            case 4:
                ArrayList arrayList4 = new ArrayList();
                Y0.a aVar2 = this.f1616s;
                int i5 = 0;
                arrayList4.add(new C0237f(aVar2.b(dVar), new C0234c(4, 0, "R", true)));
                arrayList4.add(new C0237f(aVar2.b(dVar), new C0234c(4, 1, "G", true)));
                arrayList4.add(new C0237f(aVar2.b(dVar), new C0234c(4, 2, "B", true)));
                ?? abstractC1913K3 = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                abstractC1913K3.f14535P = arrayList4;
                int size2 = arrayList4.size();
                while (i5 < size2) {
                    Object obj2 = arrayList4.get(i5);
                    i5++;
                    C0237f c0237f = (C0237f) obj2;
                    C0234c c0234c = c0237f.f3553r;
                    if (Objects.equals(c0234c.f3546o, "R")) {
                        abstractC1913K3.f14537R = c0237f;
                    } else if (Objects.equals(c0234c.f3546o, "G")) {
                        abstractC1913K3.f14538S = c0237f;
                    } else if (Objects.equals(c0234c.f3546o, "B")) {
                        abstractC1913K3.f14539T = c0237f;
                    }
                    c0237f.f3554s = new C1748e(4, (Object) abstractC1913K3);
                }
                abstractC1913K3.H();
                return abstractC1913K3;
            case 5:
                ArrayList arrayList5 = new ArrayList();
                Y0.a aVar3 = this.f1616s;
                int i6 = 0;
                arrayList5.add(new C0237f(aVar3.b(dVar), new C0234c(2, 0, "inA0", false)));
                arrayList5.add(new C0237f(aVar3.b(dVar), new C0234c(2, 1, "inA1", false)));
                arrayList5.add(new C0237f(aVar3.b(dVar), new C0234c(2, 2, "inA2", false)));
                arrayList5.add(new C0237f(aVar3.b(dVar), new C0234c(2, 3, "inA3", false)));
                arrayList5.add(new C0237f(aVar3.b(dVar), new C0234c(2, 4, "inA4", false)));
                arrayList5.add(new C0237f(aVar3.b(dVar), new C0234c(2, 5, "inA5", false)));
                arrayList5.add(new C0237f(aVar3.b(dVar), new C0234c(2, 6, "inA6", false)));
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(new C0237f(aVar3.b(dVar), new C0234c(1, 0, "inB0", false)));
                arrayList6.add(new C0237f(aVar3.b(dVar), new C0234c(1, 1, "inB1", false)));
                arrayList6.add(new C0237f(aVar3.b(dVar), new C0234c(1, 2, "inB2", false)));
                arrayList6.add(new C0237f(aVar3.b(dVar), new C0234c(1, 3, "inB3", false)));
                arrayList6.add(new C0237f(aVar3.b(dVar), new C0234c(1, 4, "inB4", false)));
                ?? abstractC1913K4 = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                abstractC1913K4.f14553S = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 7, 5);
                abstractC1913K4.f14550P = arrayList6;
                abstractC1913K4.f14551Q = arrayList5;
                ArrayList arrayList7 = new ArrayList();
                abstractC1913K4.f14552R = arrayList7;
                arrayList7.addAll(arrayList5);
                arrayList7.addAll(arrayList6);
                int size3 = arrayList6.size();
                int i7 = 0;
                while (i7 < size3) {
                    Object obj3 = arrayList6.get(i7);
                    i7++;
                    C0237f c0237f2 = (C0237f) obj3;
                    c0237f2.f3554s = new Qw(12, (Object) abstractC1913K4, c0237f2);
                }
                int size4 = arrayList5.size();
                while (i6 < size4) {
                    Object obj4 = arrayList5.get(i6);
                    i6++;
                    C0237f c0237f3 = (C0237f) obj4;
                    c0237f3.f3554s = new Wl(abstractC1913K4, c0237f3, 18, false);
                }
                abstractC1913K4.H();
                return abstractC1913K4;
            case 6:
                C0237f c0237f4 = new C0237f(this.f1616s.b(dVar), new C0234c(4, 0, "in", false));
                long j4 = this.f1942q;
                float f4 = this.f1940o;
                float f5 = this.f1941p;
                C1995b c1995b = dVar.f12683R;
                ?? abstractC1913K5 = new AbstractC1913K(j4, f4, f5, c1995b);
                abstractC1913K5.f14583P = c0237f4;
                c0237f4.f3554s = new C0831kn(abstractC1913K5, c1995b, 16, false);
                abstractC1913K5.H();
                return abstractC1913K5;
            case 7:
                ArrayList arrayList8 = new ArrayList();
                Y0.a aVar4 = this.f1616s;
                int i8 = 0;
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(2, 0, "A", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(2, 1, "B", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(2, 2, "C", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(2, 3, "D", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(2, 4, "E", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(2, 5, "F", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(2, 6, "G1", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(2, 7, "G2", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(4, 1, "H", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(4, 2, "I", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(4, 3, "J", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(4, 4, "K", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(4, 5, "L", true)));
                arrayList8.add(new C0237f(aVar4.b(dVar), new C0234c(4, 6, "M", true)));
                ?? abstractC1913K6 = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                abstractC1913K6.f14586Q = new boolean[14];
                abstractC1913K6.f14585P = arrayList8;
                int size5 = arrayList8.size();
                while (i8 < size5) {
                    Object obj5 = arrayList8.get(i8);
                    i8++;
                    C0237f c0237f5 = (C0237f) obj5;
                    c0237f5.f3554s = new Qw(13, (Object) abstractC1913K6, c0237f5);
                }
                abstractC1913K6.H();
                return abstractC1913K6;
            case 8:
                C0237f c0237f6 = new C0237f(this.f1616s.b(dVar), new C0234c(4, 0, "in", false));
                ?? abstractC1913K7 = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                abstractC1913K7.f14400P = c0237f6;
                c0237f6.f3554s = new C1748e(6, (Object) abstractC1913K7);
                abstractC1913K7.H();
                return abstractC1913K7;
            case 9:
                ArrayList arrayList9 = new ArrayList();
                Y0.a aVar5 = this.f1616s;
                int i9 = 0;
                arrayList9.add(new C0237f(aVar5.b(dVar), new C0234c(2, 0, "A", true)));
                arrayList9.add(new C0237f(aVar5.b(dVar), new C0234c(2, 1, "B", true)));
                arrayList9.add(new C0237f(aVar5.b(dVar), new C0234c(2, 2, "C", true)));
                arrayList9.add(new C0237f(aVar5.b(dVar), new C0234c(2, 3, "D", true)));
                arrayList9.add(new C0237f(aVar5.b(dVar), new C0234c(2, 4, "E", true)));
                arrayList9.add(new C0237f(aVar5.b(dVar), new C0234c(2, 5, "F", true)));
                arrayList9.add(new C0237f(aVar5.b(dVar), new C0234c(2, 6, "G", true)));
                ?? abstractC1913K8 = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                abstractC1913K8.f14491Q = new boolean[7];
                abstractC1913K8.f14490P = arrayList9;
                int size6 = arrayList9.size();
                while (i9 < size6) {
                    Object obj6 = arrayList9.get(i9);
                    i9++;
                    C0237f c0237f7 = (C0237f) obj6;
                    c0237f7.f3554s = new C0831kn(abstractC1913K8, c0237f7, 17, false);
                }
                abstractC1913K8.H();
                return abstractC1913K8;
            case 10:
                ArrayList arrayList10 = new ArrayList();
                int i10 = 0;
                arrayList10.add(new C0234c(1, 0, "60", true));
                arrayList10.add(new C0234c(1, 1, "120", true));
                arrayList10.add(new C0234c(1, 2, "200", true));
                arrayList10.add(new C0234c(1, 3, "400", true));
                arrayList10.add(new C0234c(1, 4, "600", true));
                arrayList10.add(new C0234c(4, 0, "1000", true));
                arrayList10.add(new C0234c(4, 1, "1600", true));
                arrayList10.add(new C0234c(4, 2, "2000", true));
                arrayList10.add(new C0234c(4, 3, "4000", true));
                arrayList10.add(new C0234c(4, 4, "8000", true));
                ArrayList arrayList11 = new ArrayList(arrayList10.size());
                int size7 = arrayList10.size();
                int i11 = 0;
                while (i11 < size7) {
                    Object obj7 = arrayList10.get(i11);
                    i11++;
                    arrayList11.add(new C0237f(this.f1616s.b(dVar), ((C0234c) obj7).a()));
                }
                ?? abstractC1913K9 = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                abstractC1913K9.f14498Q = new boolean[10];
                abstractC1913K9.f14497P = arrayList11;
                int size8 = arrayList11.size();
                while (i10 < size8) {
                    Object obj8 = arrayList11.get(i10);
                    i10++;
                    C0237f c0237f8 = (C0237f) obj8;
                    c0237f8.f3554s = new Qw(14, (Object) abstractC1913K9, c0237f8);
                }
                abstractC1913K9.H();
                return abstractC1913K9;
            case 11:
                C0238g c0238g4 = new C0238g(this.f1616s.b(dVar), new C0234c(4, 0, "out", false));
                ?? abstractC1913K10 = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                abstractC1913K10.f14502P = c0238g4;
                abstractC1913K10.H();
                return abstractC1913K10;
            case 12:
                C0237f c0237f9 = new C0237f(this.f1616s.b(dVar), new C0234c(4, 0, "in", false));
                long j5 = this.f1942q;
                float f6 = this.f1940o;
                float f7 = this.f1941p;
                C1995b c1995b2 = dVar.f12683R;
                ?? abstractC1913K11 = new AbstractC1913K(j5, f6, f7, c1995b2);
                abstractC1913K11.f14555P = c0237f9;
                c0237f9.f3554s = new Wl(abstractC1913K11, c1995b2, 20, false);
                abstractC1913K11.H();
                return abstractC1913K11;
            default:
                C0237f c0237f10 = new C0237f(this.f1616s.b(dVar), new C0234c(4, 0, "in", false));
                ?? abstractC1913K12 = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                abstractC1913K12.f14561P = c0237f10;
                c0237f10.f3554s = new C1748e(9, (Object) abstractC1913K12);
                abstractC1913K12.H();
                return abstractC1913K12;
        }
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        switch (this.f1615r) {
            case 0:
                xmlSerializer.startTag(null, "create_constant_high_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_constant_high_strategy");
                return;
            case 1:
                xmlSerializer.startTag(null, "create_constant_low_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_constant_low_strategy");
                return;
            case 2:
                xmlSerializer.startTag(null, "create_bcd7_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_bcd7_strategy");
                return;
            case 3:
                xmlSerializer.startTag(null, "create_button_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_button_strategy");
                return;
            case 4:
                xmlSerializer.startTag(null, "create_color_light_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_color_light_strategy");
                return;
            case 5:
                xmlSerializer.startTag(null, "create_color_matrix_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_color_matrix_strategy");
                return;
            case 6:
                xmlSerializer.startTag(null, "create_flashlight_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_flashlight_strategy");
                return;
            case 7:
                xmlSerializer.startTag(null, "create_14_disp_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_14_disp_strategy");
                return;
            case 8:
                xmlSerializer.startTag(null, "create_light_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_light_strategy");
                return;
            case 9:
                xmlSerializer.startTag(null, "create_7_disp_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_7_disp_strategy");
                return;
            case 10:
                xmlSerializer.startTag(null, "create_speaker_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_speaker_strategy");
                return;
            case 11:
                xmlSerializer.startTag(null, "create_switch_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_switch_strategy");
                return;
            case 12:
                xmlSerializer.startTag(null, "create_vibration_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_vibration_strategy");
                return;
            default:
                xmlSerializer.startTag(null, "create_zoomer_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.endTag(null, "create_zoomer_strategy");
                return;
        }
    }
}
