package M0;

import I0.d;
import android.graphics.Paint;
import org.xmlpull.v1.XmlSerializer;
import p1.e0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: o, reason: collision with root package name */
    public final int f1141o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1142p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1143q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1144r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1145s;

    /* renamed from: t, reason: collision with root package name */
    public final String f1146t;

    /* renamed from: u, reason: collision with root package name */
    public final long f1147u;

    public a(int i4, boolean z4, String str, int i5, boolean z5, String str2, long j4) {
        this.f1141o = i4;
        this.f1142p = z4;
        this.f1143q = str;
        this.f1144r = i5;
        this.f1145s = z5;
        this.f1146t = str2;
        this.f1147u = j4;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        e0 e0Var = (e0) dVar.h(this.f1147u);
        e0Var.N(this.f1141o);
        boolean z4 = this.f1142p;
        e0Var.f14519R = z4;
        e0Var.f14520S.setStyle(z4 ? Paint.Style.STROKE : Paint.Style.FILL_AND_STROKE);
        e0Var.L();
        e0Var.f14517P = this.f1143q;
        e0Var.L();
        return true;
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        e0 e0Var = (e0) dVar.h(this.f1147u);
        e0Var.N(this.f1144r);
        boolean z4 = this.f1145s;
        e0Var.f14519R = z4;
        e0Var.f14520S.setStyle(z4 ? Paint.Style.STROKE : Paint.Style.FILL_AND_STROKE);
        e0Var.L();
        e0Var.f14517P = this.f1146t;
        e0Var.L();
        return true;
    }

    @Override // I0.a
    public final boolean c(e1.d dVar) {
        a(dVar);
        return true;
    }

    @Override // I0.d
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "text_props_command");
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1147u));
        xmlSerializer.attribute(null, "new_text", String.valueOf(this.f1143q));
        xmlSerializer.attribute(null, "new_outline", String.valueOf(this.f1142p));
        xmlSerializer.attribute(null, "new_size", String.valueOf(this.f1141o));
        xmlSerializer.attribute(null, "old_text", String.valueOf(this.f1146t));
        xmlSerializer.attribute(null, "old_outline", String.valueOf(this.f1145s));
        xmlSerializer.attribute(null, "old_size", String.valueOf(this.f1144r));
        xmlSerializer.endTag(null, "text_props_command");
    }
}
