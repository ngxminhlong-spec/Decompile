package H0;

import h1.AbstractC1698a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements I0.d {

    /* renamed from: o, reason: collision with root package name */
    public final float f839o;

    /* renamed from: p, reason: collision with root package name */
    public final float f840p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f841q;

    public a(ArrayList arrayList, float f4, float f5) {
        this.f841q = arrayList;
        this.f839o = f4;
        this.f840p = f5;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        ArrayList arrayList = this.f841q;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            AbstractC1698a h4 = dVar.h(((Long) obj).longValue());
            h4.y(h4.f13122o + this.f839o, h4.f13123p + this.f840p);
        }
        return true;
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        ArrayList arrayList = this.f841q;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            AbstractC1698a h4 = dVar.h(((Long) obj).longValue());
            h4.y(h4.f13122o - this.f839o, h4.f13123p - this.f840p);
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
        xmlSerializer.startTag(null, "move_command");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f841q;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sb.append((Long) obj);
            sb.append(" ");
        }
        xmlSerializer.attribute(null, "element_ids", sb.toString());
        xmlSerializer.attribute(null, "offset_X", String.valueOf(this.f839o));
        xmlSerializer.attribute(null, "offset_Y", String.valueOf(this.f840p));
        xmlSerializer.endTag(null, "move_command");
    }
}
