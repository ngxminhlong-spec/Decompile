package F0;

import I0.d;
import h1.AbstractC1698a;
import j1.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o2.AbstractC1895f;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f739o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f740p;

    /* renamed from: q, reason: collision with root package name */
    public transient ArrayList f741q;

    public a(HashMap hashMap, HashMap hashMap2) {
        this.f739o = hashMap;
        this.f740p = hashMap2;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        this.f741q = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f739o;
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (!(entry.getValue() instanceof V0.a)) {
                AbstractC1698a b4 = ((W0.a) entry.getValue()).b(dVar);
                b4.t(this.f741q);
                hashMap.put((Long) entry.getKey(), b4);
            }
        }
        for (Map.Entry entry2 : this.f740p.entrySet()) {
            AbstractC1698a abstractC1698a = (AbstractC1698a) hashMap.get(entry2.getKey());
            if (abstractC1698a != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(abstractC1698a.f13117A));
                this.f741q.add(new H0.d(((Integer) entry2.getValue()).intValue(), arrayList));
            }
        }
        ArrayList arrayList2 = this.f741q;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ((I0.a) obj).a(dVar);
        }
        int size2 = this.f741q.size();
        for (Map.Entry entry3 : hashMap2.entrySet()) {
            if (entry3.getValue() instanceof V0.a) {
                V0.a aVar = (V0.a) entry3.getValue();
                b bVar = aVar.f1833r;
                b bVar2 = aVar.f1834s;
                AbstractC1698a abstractC1698a2 = (AbstractC1698a) hashMap.get(Long.valueOf(bVar.f13327o));
                if (abstractC1698a2 != null) {
                    b b5 = bVar.b(bVar.f13328p, abstractC1698a2.f13117A);
                    AbstractC1698a abstractC1698a3 = (AbstractC1698a) hashMap.get(Long.valueOf(bVar2.f13327o));
                    if (abstractC1698a3 != null) {
                        b b6 = bVar2.b(bVar2.f13328p, abstractC1698a3.f13117A);
                        new V0.a(aVar.f1942q, b5.b(b5.f13328p, b5.f13327o), b6.b(b6.f13328p, b6.f13327o), AbstractC1895f.h(aVar.f1835t)).b(dVar).t(this.f741q);
                    }
                }
            }
        }
        ArrayList arrayList3 = this.f741q;
        int size3 = arrayList3.size();
        while (i4 < size3) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            I0.a aVar2 = (I0.a) obj2;
            int i6 = size2 - 1;
            if (size2 <= 0) {
                aVar2.a(dVar);
            }
            size2 = i6;
        }
        return true;
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        for (int size = this.f741q.size() - 1; size >= 0; size--) {
            ((I0.a) this.f741q.get(size)).b(dVar);
        }
        return true;
    }

    @Override // I0.a
    public final boolean c(e1.d dVar) {
        a(dVar);
        return true;
    }

    @Override // I0.d
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "paste_command");
        xmlSerializer.startTag(null, "strategies");
        for (Map.Entry entry : this.f739o.entrySet()) {
            xmlSerializer.startTag(null, "key");
            xmlSerializer.text(String.valueOf(entry.getKey()));
            xmlSerializer.endTag(null, "key");
            xmlSerializer.startTag(null, "value");
            ((W0.a) entry.getValue()).g(xmlSerializer);
            xmlSerializer.endTag(null, "value");
        }
        xmlSerializer.endTag(null, "strategies");
        xmlSerializer.startTag(null, "rotations");
        for (Map.Entry entry2 : this.f740p.entrySet()) {
            xmlSerializer.startTag(null, "key");
            xmlSerializer.text(String.valueOf(entry2.getKey()));
            xmlSerializer.endTag(null, "key");
            xmlSerializer.startTag(null, "value");
            xmlSerializer.text(String.valueOf(entry2.getValue()));
            xmlSerializer.endTag(null, "value");
        }
        xmlSerializer.endTag(null, "rotations");
        xmlSerializer.endTag(null, "paste_command");
    }
}
