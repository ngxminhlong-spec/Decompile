package G0;

import I0.d;
import org.xmlpull.v1.XmlSerializer;
import p1.InterfaceC1925k;
import p1.i0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f759o;

    /* renamed from: p, reason: collision with root package name */
    public final int f760p;

    /* renamed from: q, reason: collision with root package name */
    public final int f761q;

    /* renamed from: r, reason: collision with root package name */
    public final long f762r;

    public /* synthetic */ a(int i4, int i5, int i6, long j4) {
        this.f759o = i6;
        this.f762r = j4;
        this.f760p = i4;
        this.f761q = i5;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        switch (this.f759o) {
            case 0:
                Object h4 = dVar.h(this.f762r);
                if (!(h4 instanceof InterfaceC1925k)) {
                    return true;
                }
                ((InterfaceC1925k) h4).b(this.f761q);
                return true;
            default:
                ((i0) dVar.h(this.f762r)).R(this.f761q);
                return true;
        }
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        switch (this.f759o) {
            case 0:
                Object h4 = dVar.h(this.f762r);
                if (!(h4 instanceof InterfaceC1925k)) {
                    return true;
                }
                ((InterfaceC1925k) h4).b(this.f760p);
                return true;
            default:
                ((i0) dVar.h(this.f762r)).R(this.f760p);
                return true;
        }
    }

    @Override // I0.a
    public final boolean c(e1.d dVar) {
        switch (this.f759o) {
            case 0:
            default:
                a(dVar);
                return true;
        }
    }

    @Override // I0.d
    public final void g(XmlSerializer xmlSerializer) {
        switch (this.f759o) {
            case 0:
                xmlSerializer.startTag(null, "disp_color_props_command");
                xmlSerializer.attribute(null, "id", String.valueOf(this.f762r));
                xmlSerializer.attribute(null, "old_color", String.valueOf(this.f760p));
                xmlSerializer.attribute(null, "new_color", String.valueOf(this.f761q));
                xmlSerializer.endTag(null, "disp_color_props_command");
                return;
            default:
                xmlSerializer.startTag(null, "timer_props_command");
                xmlSerializer.attribute(null, "id", String.valueOf(this.f762r));
                xmlSerializer.attribute(null, "old_delay", String.valueOf(this.f760p));
                xmlSerializer.attribute(null, "new_delay", String.valueOf(this.f761q));
                xmlSerializer.endTag(null, "timer_props_command");
                return;
        }
    }
}
