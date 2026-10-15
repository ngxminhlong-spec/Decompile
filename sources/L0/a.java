package L0;

import I0.d;
import java.io.Serializable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1072o;

    /* renamed from: p, reason: collision with root package name */
    public transient ArrayList f1073p;

    /* renamed from: q, reason: collision with root package name */
    public final Serializable f1074q;

    public /* synthetic */ a(int i4, Serializable serializable) {
        this.f1072o = i4;
        this.f1074q = serializable;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        switch (this.f1072o) {
            case 0:
                this.f1073p = new ArrayList();
                ((W0.a) this.f1074q).b(dVar).t(this.f1073p);
                ArrayList arrayList = this.f1073p;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((I0.a) obj).a(dVar);
                }
                return true;
            default:
                this.f1073p = new ArrayList();
                ArrayList arrayList2 = (ArrayList) this.f1074q;
                int size2 = arrayList2.size();
                int i5 = 0;
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    dVar.h(((Long) obj2).longValue()).u(this.f1073p);
                }
                ArrayList arrayList3 = this.f1073p;
                int size3 = arrayList3.size();
                while (i5 < size3) {
                    Object obj3 = arrayList3.get(i5);
                    i5++;
                    ((I0.a) obj3).a(dVar);
                }
                return true;
        }
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        switch (this.f1072o) {
            case 0:
                for (int size = this.f1073p.size() - 1; size >= 0; size--) {
                    ((I0.a) this.f1073p.get(size)).b(dVar);
                }
                return true;
            default:
                for (int size2 = this.f1073p.size() - 1; size2 >= 0; size2--) {
                    ((I0.a) this.f1073p.get(size2)).b(dVar);
                }
                return true;
        }
    }

    @Override // I0.a
    public final boolean c(e1.d dVar) {
        switch (this.f1072o) {
            case 0:
            default:
                a(dVar);
                return true;
        }
    }

    @Override // I0.d
    public final void g(XmlSerializer xmlSerializer) {
        switch (this.f1072o) {
            case 0:
                xmlSerializer.startTag(null, "create_element_command");
                ((W0.a) this.f1074q).g(xmlSerializer);
                xmlSerializer.endTag(null, "create_element_command");
                return;
            default:
                xmlSerializer.startTag(null, "remove_command");
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f1074q;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    sb.append((Long) obj);
                    sb.append(" ");
                }
                xmlSerializer.attribute(null, "element_ids", sb.toString());
                xmlSerializer.endTag(null, "remove_command");
                return;
        }
    }
}
