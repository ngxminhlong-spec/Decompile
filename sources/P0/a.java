package P0;

import android.text.TextUtils;
import c1.C0234c;
import e1.d;
import j1.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m1.c;
import org.xmlpull.v1.XmlSerializer;
import p1.C1912J;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f1473r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f1474s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f1475t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1476u;

    /* renamed from: v, reason: collision with root package name */
    public final transient Y0.a f1477v;

    /* renamed from: w, reason: collision with root package name */
    public transient boolean f1478w;

    /* renamed from: x, reason: collision with root package name */
    public String f1479x;
    public final ArrayList y;

    public a(long j4, float f4, float f5, String str, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap, int i4, ArrayList arrayList3) {
        this.f1942q = j4;
        this.f1940o = f4;
        this.f1941p = f5;
        this.f1473r = arrayList;
        this.f1474s = arrayList2;
        this.f1475t = hashMap;
        this.f1477v = new Y0.a(-1L, 0.0f, 0.0f, true);
        this.f1476u = i4;
        this.f1479x = str;
        this.y = arrayList3;
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        ArrayList arrayList = this.f1474s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            arrayList2.add(((C0234c) obj).a());
        }
        for (Map.Entry entry : this.f1475t.entrySet()) {
            hashMap.put((String) entry.getKey(), ((b) entry.getValue()).b(((b) entry.getValue()).f13328p, ((b) entry.getValue()).f13327o));
        }
        ArrayList arrayList3 = new ArrayList(this.f1473r);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = this.y;
        int size2 = arrayList5.size();
        while (i4 < size2) {
            Object obj2 = arrayList5.get(i4);
            i4++;
            arrayList4.add(((m1.b) obj2).a());
        }
        return new a(j4, this.f1940o, this.f1941p, this.f1479x, arrayList3, arrayList2, hashMap, this.f1476u, arrayList4);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, c1.a] */
    @Override // W0.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final d b(I0.b bVar) {
        ArrayList arrayList = this.f1474s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            C1912J b4 = this.f1477v.b(bVar);
            ?? obj2 = new Object();
            obj2.f3544o = b4;
            obj2.f3545p = (C0234c) obj;
            arrayList2.add(obj2);
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f1475t.entrySet()) {
            hashMap.put((String) entry.getKey(), ((b) entry.getValue()).b(((b) entry.getValue()).f13328p, ((b) entry.getValue()).f13327o));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.y;
        int size2 = arrayList4.size();
        while (i4 < size2) {
            Object obj3 = arrayList4.get(i4);
            i4++;
            arrayList3.add(((m1.b) obj3).a());
        }
        return new d(this.f1942q, this.f1940o, this.f1941p, this.f1479x, this.f1473r, bVar.k(), arrayList2, hashMap, this.f1478w, this.f1476u, arrayList3);
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        String str = null;
        xmlSerializer.startTag(null, "create_circuit_strategy");
        xmlSerializer.attribute(null, "x", String.valueOf(this.f1940o));
        xmlSerializer.attribute(null, "y", String.valueOf(this.f1941p));
        String str2 = "id";
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
        if (!TextUtils.isEmpty(this.f1479x)) {
            xmlSerializer.attribute(null, "circuit_name", this.f1479x);
        }
        xmlSerializer.attribute(null, "undo_ops_count", String.valueOf(this.f1476u));
        xmlSerializer.startTag(null, "commands");
        ArrayList arrayList = this.f1473r;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((I0.d) obj).g(xmlSerializer);
        }
        xmlSerializer.endTag(null, "commands");
        xmlSerializer.startTag(null, "node_infos");
        ArrayList arrayList2 = this.f1474s;
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            ((C0234c) obj2).g(xmlSerializer);
        }
        xmlSerializer.endTag(null, "node_infos");
        xmlSerializer.startTag(null, "inner_links");
        for (Map.Entry entry : this.f1475t.entrySet()) {
            xmlSerializer.startTag(null, "key");
            xmlSerializer.text((String) entry.getKey());
            xmlSerializer.endTag(null, "key");
            xmlSerializer.startTag(null, "value");
            ((b) entry.getValue()).g(xmlSerializer);
            xmlSerializer.endTag(null, "value");
        }
        xmlSerializer.endTag(null, "inner_links");
        xmlSerializer.startTag(null, "time_diagrams");
        ArrayList arrayList3 = this.y;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList3.get(i6);
            i6++;
            m1.b bVar = (m1.b) obj3;
            bVar.getClass();
            xmlSerializer.startTag(str, "time_diagram");
            xmlSerializer.attribute(str, str2, String.valueOf(bVar.f13984a));
            xmlSerializer.attribute(str, "name", bVar.f13985b);
            xmlSerializer.attribute(str, "slice_time", String.valueOf(bVar.c));
            xmlSerializer.attribute(str, "step_count", String.valueOf(bVar.f13987f));
            xmlSerializer.attribute(str, "show_pins", String.valueOf(bVar.f13986e));
            xmlSerializer.startTag(str, "entries");
            ArrayList arrayList4 = bVar.d;
            int size4 = arrayList4.size();
            int i7 = 0;
            while (i7 < size4) {
                Object obj4 = arrayList4.get(i7);
                i7++;
                c cVar = (c) obj4;
                cVar.getClass();
                xmlSerializer.startTag(str, "time_entry");
                ArrayList arrayList5 = arrayList3;
                xmlSerializer.attribute(str, str2, String.valueOf(cVar.f13988a));
                xmlSerializer.attribute(str, "name", cVar.f13989b);
                String str3 = str2;
                xmlSerializer.attribute(str, "color", String.valueOf(cVar.c));
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList6 = cVar.f13990e;
                int i8 = size3;
                int i9 = 0;
                for (int size5 = arrayList6.size(); i9 < size5; size5 = size5) {
                    Object obj5 = arrayList6.get(i9);
                    i9++;
                    sb.append((Integer) obj5);
                    sb.append(" ");
                }
                xmlSerializer.attribute(null, "frames", sb.toString());
                xmlSerializer.startTag(null, "io_selection");
                cVar.d.g(xmlSerializer);
                xmlSerializer.endTag(null, "io_selection");
                xmlSerializer.endTag(null, "time_entry");
                str = null;
                arrayList3 = arrayList5;
                str2 = str3;
                size3 = i8;
            }
            ArrayList arrayList7 = arrayList3;
            String str4 = str;
            xmlSerializer.endTag(str4, "entries");
            xmlSerializer.endTag(str4, "time_diagram");
            arrayList3 = arrayList7;
        }
        String str5 = str;
        xmlSerializer.endTag(str5, "time_diagrams");
        xmlSerializer.endTag(str5, "create_circuit_strategy");
    }
}
