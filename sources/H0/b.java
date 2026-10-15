package H0;

import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements I0.d {

    /* renamed from: o, reason: collision with root package name */
    public final String f842o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f843p;

    /* renamed from: q, reason: collision with root package name */
    public final String f844q;

    /* renamed from: r, reason: collision with root package name */
    public final long f845r;

    public b(long j4, String str, String str2, boolean z4) {
        this.f842o = str;
        this.f843p = z4;
        this.f844q = str2;
        this.f845r = j4;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        dVar.h(this.f845r).f13132z = this.f844q;
        return true;
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        dVar.h(this.f845r).f13132z = this.f843p ? null : this.f842o;
        return true;
    }

    @Override // I0.a
    public final boolean c(e1.d dVar) {
        a(dVar);
        return true;
    }

    @Override // I0.d
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "rename_command");
        xmlSerializer.attribute(null, "id", String.valueOf(this.f845r));
        xmlSerializer.attribute(null, "new_name", this.f844q);
        String str = this.f842o;
        if (str == null) {
            str = "";
        }
        xmlSerializer.attribute(null, "old_name", str);
        xmlSerializer.attribute(null, "was_null", String.valueOf(this.f843p));
        xmlSerializer.endTag(null, "rename_command");
    }
}
