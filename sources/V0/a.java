package V0;

import android.graphics.Paint;
import android.graphics.PointF;
import e1.d;
import h1.AbstractC1698a;
import j1.b;
import o2.AbstractC1895f;
import org.xmlpull.v1.XmlSerializer;
import p1.C1912J;
import q1.AbstractC1955j;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends W0.a {

    /* renamed from: r, reason: collision with root package name */
    public final b f1833r;

    /* renamed from: s, reason: collision with root package name */
    public final b f1834s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f1835t;

    public a(long j4, b bVar, b bVar2, float[] fArr) {
        this.f1833r = bVar;
        this.f1834s = bVar2;
        this.f1942q = j4;
        this.f1835t = fArr;
    }

    @Override // W0.a
    public final W0.a a(long j4) {
        b bVar = this.f1833r;
        b b4 = bVar.b(bVar.f13328p, bVar.f13327o);
        b bVar2 = this.f1834s;
        return new a(j4, b4, bVar2.b(bVar2.f13328p, bVar2.f13327o), AbstractC1895f.h(this.f1835t));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p1.Q, h1.a] */
    @Override // W0.a
    public final AbstractC1698a b(d dVar) {
        b bVar = this.f1833r;
        C1912J c1912j = (C1912J) bVar.c(dVar);
        b bVar2 = this.f1834s;
        C1912J c1912j2 = (C1912J) bVar2.c(dVar);
        long j4 = this.f1942q;
        C1995b c1995b = dVar.f12683R;
        float[] h4 = AbstractC1895f.h(this.f1835t);
        float f4 = 0;
        ?? abstractC1698a = new AbstractC1698a(j4, f4, f4, c1995b);
        abstractC1698a.f14443F = bVar;
        abstractC1698a.f14444G = bVar2;
        abstractC1698a.f14447J = new Object();
        Paint paint = new Paint();
        abstractC1698a.f14448K = paint;
        abstractC1698a.f14465c0 = new PointF();
        abstractC1698a.f14466d0 = new PointF();
        abstractC1698a.f14467e0 = new PointF();
        abstractC1698a.f14468f0 = new float[66];
        abstractC1698a.f14469g0 = new float[66];
        abstractC1698a.f14474l0 = new double[1];
        abstractC1698a.f14445H = c1912j;
        abstractC1698a.f14446I = c1912j2;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(AbstractC1955j.c);
        paint.setStrokeCap(Paint.Cap.ROUND);
        abstractC1698a.f14470h0 = AbstractC1955j.d * 5;
        int min = Math.min(66, h4.length);
        for (int i4 = 0; i4 < min; i4++) {
            float[] fArr = abstractC1698a.f14468f0;
            float[] fArr2 = abstractC1698a.f14469g0;
            float f5 = h4[i4];
            fArr2[i4] = f5;
            fArr[i4] = f5;
        }
        return abstractC1698a;
    }

    @Override // W0.a
    public final void g(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(null, "create_path_strategy");
        xmlSerializer.attribute(null, "id", String.valueOf(this.f1942q));
        StringBuilder sb = new StringBuilder();
        for (float f4 : this.f1835t) {
            sb.append(Float.valueOf(f4));
            sb.append(" ");
        }
        xmlSerializer.attribute(null, "offsets", sb.toString());
        xmlSerializer.startTag(null, "selectionA");
        this.f1833r.g(xmlSerializer);
        xmlSerializer.endTag(null, "selectionA");
        xmlSerializer.startTag(null, "selectionB");
        this.f1834s.g(xmlSerializer);
        xmlSerializer.endTag(null, "selectionB");
        xmlSerializer.endTag(null, "create_path_strategy");
    }
}
