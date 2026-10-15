package j1;

import h1.AbstractC1698a;
import java.io.Serializable;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements c, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final long f13327o;

    /* renamed from: p, reason: collision with root package name */
    public final String f13328p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f13329q;

    public b(int i4, long j4, String str) {
        this.f13329q = i4;
        this.f13327o = j4;
        this.f13328p = str;
    }

    @Override // j1.c
    public final long a() {
        return this.f13327o;
    }

    public final b b(String str, long j4) {
        switch (this.f13329q) {
            case 0:
                return new b(0, j4, str);
            default:
                return new b(1, j4, str);
        }
    }

    public final O0.a c(I0.b bVar) {
        switch (this.f13329q) {
            case 0:
                AbstractC1698a h4 = bVar.h(this.f13327o);
                if (h4 == null) {
                    return null;
                }
                return h4.m(this.f13328p);
            default:
                AbstractC1698a h5 = bVar.h(this.f13327o);
                if (h5 == null) {
                    return null;
                }
                return h5.o(this.f13328p);
        }
    }

    public final void g(XmlSerializer xmlSerializer) {
        switch (this.f13329q) {
            case 0:
                xmlSerializer.startTag(null, "input_selection");
                xmlSerializer.attribute(null, "element_id", String.valueOf(this.f13327o));
                xmlSerializer.attribute(null, "io_id", String.valueOf(this.f13328p));
                xmlSerializer.endTag(null, "input_selection");
                return;
            default:
                xmlSerializer.startTag(null, "output_selection");
                xmlSerializer.attribute(null, "element_id", String.valueOf(this.f13327o));
                xmlSerializer.attribute(null, "io_id", String.valueOf(this.f13328p));
                xmlSerializer.endTag(null, "output_selection");
                return;
        }
    }
}
