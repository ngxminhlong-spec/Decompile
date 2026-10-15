package H0;

import h1.AbstractC1698a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements I0.d {

    /* renamed from: o, reason: collision with root package name */
    public final int f849o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f850p;

    public d(int i4, ArrayList arrayList) {
        this.f850p = arrayList;
        this.f849o = i4;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        ArrayList arrayList = this.f850p;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            AbstractC1698a h4 = dVar.h(((Long) obj).longValue());
            h4.z((h4.f13121E + this.f849o) % 360);
        }
        return true;
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        ArrayList arrayList = this.f850p;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            AbstractC1698a h4 = dVar.h(((Long) obj).longValue());
            int i5 = h4.f13121E - this.f849o;
            if (i5 < 0) {
                i5 += 360;
            }
            h4.z(i5);
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
        xmlSerializer.startTag(null, "rotate_command");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f850p;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sb.append((Long) obj);
            sb.append(" ");
        }
        xmlSerializer.attribute(null, "element_ids", sb.toString());
        xmlSerializer.attribute(null, "rotate_degrees", String.valueOf(this.f849o));
        xmlSerializer.endTag(null, "rotate_command");
    }
}
