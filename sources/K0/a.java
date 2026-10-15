package K0;

import I0.d;
import o2.AbstractC1895f;
import org.xmlpull.v1.XmlSerializer;
import p1.C1920f;
import p1.P;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: o, reason: collision with root package name */
    public final boolean[][] f1046o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[][] f1047p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[][] f1048q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[][] f1049r;

    /* renamed from: s, reason: collision with root package name */
    public final long f1050s;

    public a(boolean[][] zArr, boolean[][] zArr2, boolean[][] zArr3, boolean[][] zArr4, long j4) {
        this.f1046o = zArr;
        this.f1047p = zArr2;
        this.f1048q = zArr3;
        this.f1049r = zArr4;
        this.f1050s = j4;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        P p3 = (P) dVar.h(this.f1050s);
        boolean[][] i4 = AbstractC1895f.i(this.f1048q);
        boolean[][] i5 = AbstractC1895f.i(this.f1049r);
        p3.f14439T = i4;
        p3.f14440U = i5;
        if (!p3.f14438S) {
            return true;
        }
        p3.f14438S = false;
        p3.f13118B.n(new C1920f(p3, 6));
        return true;
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        P p3 = (P) dVar.h(this.f1050s);
        boolean[][] i4 = AbstractC1895f.i(this.f1046o);
        boolean[][] i5 = AbstractC1895f.i(this.f1047p);
        p3.f14439T = i4;
        p3.f14440U = i5;
        if (!p3.f14438S) {
            return true;
        }
        p3.f14438S = false;
        p3.f13118B.n(new C1920f(p3, 6));
        return true;
    }

    @Override // I0.a
    public final boolean c(e1.d dVar) {
        a(dVar);
        return true;
    }

    @Override // I0.d
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "update_pla_matrix_command");
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1050s));
        xmlSerializer.startTag(null, "new_and_table");
        Z0.a.e(xmlSerializer, this.f1048q);
        xmlSerializer.endTag(null, "new_and_table");
        xmlSerializer.startTag(null, "new_or_table");
        Z0.a.e(xmlSerializer, this.f1049r);
        xmlSerializer.endTag(null, "new_or_table");
        xmlSerializer.startTag(null, "old_and_table");
        Z0.a.e(xmlSerializer, this.f1046o);
        xmlSerializer.endTag(null, "old_and_table");
        xmlSerializer.startTag(null, "old_or_table");
        Z0.a.e(xmlSerializer, this.f1047p);
        xmlSerializer.endTag(null, "old_or_table");
        xmlSerializer.endTag(null, "update_pla_matrix_command");
    }
}
