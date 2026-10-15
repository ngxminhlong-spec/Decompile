package V2;

import com.google.android.gms.internal.play_billing.B;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i extends B {
    @Override // com.google.android.gms.internal.play_billing.B
    public final void w(t tVar, float f4, float f5) {
        tVar.d(f5 * f4, 180.0f, 90.0f);
        float f6 = f5 * 2.0f * f4;
        p pVar = new p(0.0f, 0.0f, f6, f6);
        pVar.f1929f = 180.0f;
        pVar.f1930g = 90.0f;
        tVar.f1937f.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f1938g.add(nVar);
        tVar.d = 270.0f;
        float f7 = (0.0f + f6) * 0.5f;
        float f8 = (f6 - 0.0f) / 2.0f;
        double d = 270.0f;
        tVar.f1935b = (((float) Math.cos(Math.toRadians(d))) * f8) + f7;
        tVar.c = (f8 * ((float) Math.sin(Math.toRadians(d)))) + f7;
    }
}
