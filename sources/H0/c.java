package H0;

import org.xmlpull.v1.XmlSerializer;
import p1.Q;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements I0.d {

    /* renamed from: o, reason: collision with root package name */
    public final float[] f846o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f847p;

    /* renamed from: q, reason: collision with root package name */
    public final long f848q;

    public c(long j4, float[] fArr, float[] fArr2) {
        this.f848q = j4;
        this.f847p = fArr;
        this.f846o = fArr2;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        Q q4 = (Q) dVar.h(this.f848q);
        float[] fArr = q4.f14468f0;
        int length = fArr.length;
        float[] fArr2 = this.f846o;
        int min = Math.min(length, fArr2.length);
        for (int i4 = 0; i4 < min; i4++) {
            float[] fArr3 = q4.f14469g0;
            float f4 = fArr2[i4];
            fArr3[i4] = f4;
            fArr[i4] = f4;
        }
        return true;
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        Q q4 = (Q) dVar.h(this.f848q);
        float[] fArr = q4.f14468f0;
        int length = fArr.length;
        float[] fArr2 = this.f847p;
        int min = Math.min(length, fArr2.length);
        for (int i4 = 0; i4 < min; i4++) {
            float[] fArr3 = q4.f14469g0;
            float f4 = fArr2[i4];
            fArr3[i4] = f4;
            fArr[i4] = f4;
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
        xmlSerializer.startTag(null, "resize_path_command");
        xmlSerializer.attribute(null, "id", String.valueOf(this.f848q));
        StringBuilder sb = new StringBuilder();
        for (float f4 : this.f847p) {
            sb.append(Float.valueOf(f4));
            sb.append(" ");
        }
        xmlSerializer.attribute(null, "offsets_old", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        for (float f5 : this.f846o) {
            sb2.append(Float.valueOf(f5));
            sb2.append(" ");
        }
        xmlSerializer.attribute(null, "offsets_new", sb2.toString());
        xmlSerializer.endTag(null, "resize_path_command");
    }
}
