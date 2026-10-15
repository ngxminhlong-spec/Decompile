package X0;

import android.graphics.Paint;
import c1.C0234c;
import c1.C0237f;
import c1.C0238g;
import e1.d;
import h1.AbstractC1698a;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import k.o;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import p1.AbstractC1913K;
import q1.AbstractC1955j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2129r = 1;

    /* renamed from: s, reason: collision with root package name */
    public final transient Y0.a f2130s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2131t;

    /* renamed from: u, reason: collision with root package name */
    public final Serializable f2132u;

    public a(long j4, float f4, float f5, ArrayList arrayList, C0234c c0234c) {
        this.f1942q = j4;
        this.f1940o = f4;
        this.f1941p = f5;
        this.f2131t = arrayList;
        this.f2132u = c0234c;
        this.f2130s = new Y0.a(-1L, 0.0f, 0.0f, true);
    }

    public a(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2) {
        this.f1942q = j4;
        this.f1940o = f4;
        this.f1941p = f5;
        this.f2131t = arrayList;
        this.f2132u = arrayList2;
        this.f2130s = new Y0.a(-1L, 0.0f, 0.0f, true);
    }

    public static a c(XmlPullParser xmlPullParser) {
        float parseFloat = Float.parseFloat(xmlPullParser.getAttributeValue(null, "x"));
        float parseFloat2 = Float.parseFloat(xmlPullParser.getAttributeValue(null, "y"));
        long parseLong = Long.parseLong(xmlPullParser.getAttributeValue(null, "id"));
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
                if ("create_demux_strategy".equals(xmlPullParser.getName())) {
                    break;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (arrayList.isEmpty() || arrayList2.isEmpty()) {
            throw new RuntimeException("DEMUX deserialization failed");
        }
        return new a(parseLong, parseFloat, parseFloat2, arrayList, arrayList2);
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
                if ("create_mux_strategy".equals(xmlPullParser.getName())) {
                    break;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (arrayList.size() < 2 || c0234c == null) {
            throw new RuntimeException("MUX deserialization failed");
        }
        return new a(parseLong, parseFloat, parseFloat2, arrayList, c0234c);
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        switch (this.f2129r) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f2132u;
                ArrayList arrayList2 = this.f2131t;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList2.get(i5);
                    i5++;
                    arrayList3.add(((C0234c) obj).a());
                }
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                while (i4 < size2) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    arrayList4.add(((C0234c) obj2).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList3, arrayList4);
            default:
                ArrayList arrayList5 = this.f2131t;
                ArrayList arrayList6 = new ArrayList(arrayList5.size());
                int size3 = arrayList5.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList5.get(i6);
                    i6++;
                    arrayList6.add(((C0234c) obj3).a());
                }
                return new a(j4, this.f1940o, this.f1941p, arrayList6, ((C0234c) this.f2132u).a());
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [p1.o, java.lang.Object, h1.a, p1.K] */
    /* JADX WARN: Type inference failed for: r7v11, types: [p1.G, java.lang.Object, h1.a, p1.K] */
    @Override // W0.a
    public final AbstractC1698a b(d dVar) {
        switch (this.f2129r) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f2132u;
                ArrayList arrayList2 = this.f2131t;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Y0.a aVar = this.f2130s;
                    if (i5 >= size) {
                        ArrayList arrayList4 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj = arrayList.get(i6);
                            i6++;
                            arrayList4.add(new C0238g(aVar.b(dVar), (C0234c) obj));
                        }
                        ?? abstractC1913K = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                        abstractC1913K.f14568Q = new ArrayList();
                        abstractC1913K.f14570S = new ArrayList();
                        abstractC1913K.f14571T = true;
                        int size3 = arrayList3.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Object obj2 = arrayList3.get(i7);
                            i7++;
                            C0237f c0237f = (C0237f) obj2;
                            if (c0237f.f3553r.f3546o.startsWith("S")) {
                                abstractC1913K.f14568Q.add(c0237f);
                            } else {
                                abstractC1913K.f14567P = c0237f;
                            }
                        }
                        abstractC1913K.f14569R = arrayList4;
                        abstractC1913K.f14570S.addAll(arrayList3);
                        abstractC1913K.f14570S.addAll(arrayList4);
                        int size4 = arrayList3.size();
                        while (i4 < size4) {
                            Object obj3 = arrayList3.get(i4);
                            i4++;
                            ((C0237f) obj3).f3554s = new o(5, abstractC1913K);
                        }
                        abstractC1913K.H();
                        Paint paint = new Paint();
                        abstractC1913K.f14572U = paint;
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setColor(AbstractC1955j.f14678f);
                        paint.setStrokeWidth(AbstractC1955j.c);
                        Paint paint2 = new Paint();
                        abstractC1913K.f14573V = paint2;
                        paint2.setColor(AbstractC1955j.f14692t);
                        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                        return abstractC1913K;
                    }
                    Object obj4 = arrayList2.get(i5);
                    i5++;
                    arrayList3.add(new C0237f(aVar.b(dVar), (C0234c) obj4));
                }
            default:
                ArrayList arrayList5 = this.f2131t;
                ArrayList arrayList6 = new ArrayList(arrayList5.size());
                int size5 = arrayList5.size();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    Y0.a aVar2 = this.f2130s;
                    if (i9 >= size5) {
                        C0238g c0238g = new C0238g(aVar2.b(dVar), (C0234c) this.f2132u);
                        ?? abstractC1913K2 = new AbstractC1913K(this.f1942q, this.f1940o, this.f1941p, dVar.f12683R);
                        abstractC1913K2.f14406P = new ArrayList();
                        abstractC1913K2.f14407Q = new ArrayList();
                        abstractC1913K2.f14409S = new ArrayList();
                        abstractC1913K2.f14410T = true;
                        int size6 = arrayList6.size();
                        int i10 = 0;
                        while (i10 < size6) {
                            Object obj5 = arrayList6.get(i10);
                            i10++;
                            C0237f c0237f2 = (C0237f) obj5;
                            if (c0237f2.f3553r.f3546o.startsWith("S")) {
                                abstractC1913K2.f14407Q.add(c0237f2);
                            } else {
                                abstractC1913K2.f14406P.add(c0237f2);
                            }
                        }
                        abstractC1913K2.f14408R = c0238g;
                        abstractC1913K2.f14409S.addAll(arrayList6);
                        int size7 = arrayList6.size();
                        while (i8 < size7) {
                            Object obj6 = arrayList6.get(i8);
                            i8++;
                            ((C0237f) obj6).f3554s = new o(7, abstractC1913K2);
                        }
                        abstractC1913K2.H();
                        Paint paint3 = new Paint();
                        abstractC1913K2.f14411U = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                        paint3.setColor(AbstractC1955j.f14678f);
                        paint3.setStrokeWidth(AbstractC1955j.c);
                        Paint paint4 = new Paint();
                        abstractC1913K2.f14412V = paint4;
                        paint4.setColor(AbstractC1955j.f14692t);
                        paint4.setStyle(Paint.Style.FILL_AND_STROKE);
                        return abstractC1913K2;
                    }
                    Object obj7 = arrayList5.get(i9);
                    i9++;
                    arrayList6.add(new C0237f(aVar2.b(dVar), (C0234c) obj7));
                }
        }
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        switch (this.f2129r) {
            case 0:
                xmlSerializer.startTag(null, "create_demux_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList = this.f2131t;
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
                ArrayList arrayList2 = (ArrayList) this.f2132u;
                int size2 = arrayList2.size();
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    ((C0234c) obj2).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "outputs");
                xmlSerializer.endTag(null, "create_demux_strategy");
                return;
            default:
                xmlSerializer.startTag(null, "create_mux_strategy");
                xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
                xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
                xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
                xmlSerializer.startTag(null, "inputs");
                ArrayList arrayList3 = this.f2131t;
                int size3 = arrayList3.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList3.get(i6);
                    i6++;
                    ((C0234c) obj3).g(xmlSerializer);
                }
                xmlSerializer.endTag(null, "inputs");
                xmlSerializer.startTag(null, "output");
                ((C0234c) this.f2132u).g(xmlSerializer);
                xmlSerializer.endTag(null, "output");
                xmlSerializer.endTag(null, "create_mux_strategy");
                return;
        }
    }
}
