package V2;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public float f1934a;

    /* renamed from: b, reason: collision with root package name */
    public float f1935b;
    public float c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f1936e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1937f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1938g = new ArrayList();

    public t() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f4) {
        float f5 = this.d;
        if (f5 == f4) {
            return;
        }
        float f6 = ((f4 - f5) + 360.0f) % 360.0f;
        if (f6 > 180.0f) {
            return;
        }
        float f7 = this.f1935b;
        float f8 = this.c;
        p pVar = new p(f7, f8, f7, f8);
        pVar.f1929f = this.d;
        pVar.f1930g = f6;
        this.f1938g.add(new n(pVar));
        this.d = f4;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1937f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r) arrayList.get(i4)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [V2.r, V2.q, java.lang.Object] */
    public final void c(float f4, float f5) {
        ?? rVar = new r();
        rVar.f1931b = f4;
        rVar.c = f5;
        this.f1937f.add(rVar);
        o oVar = new o(rVar, this.f1935b, this.c);
        float b4 = oVar.b() + 270.0f;
        float b5 = oVar.b() + 270.0f;
        a(b4);
        this.f1938g.add(oVar);
        this.d = b5;
        this.f1935b = f4;
        this.c = f5;
    }

    public final void d(float f4, float f5, float f6) {
        this.f1934a = f4;
        this.f1935b = 0.0f;
        this.c = f4;
        this.d = f5;
        this.f1936e = (f5 + f6) % 360.0f;
        this.f1937f.clear();
        this.f1938g.clear();
    }
}
