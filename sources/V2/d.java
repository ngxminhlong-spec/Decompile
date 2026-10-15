package V2;

import com.google.android.gms.internal.play_billing.B;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends B {
    @Override // com.google.android.gms.internal.play_billing.B
    public final void w(t tVar, float f4, float f5) {
        tVar.d(f5 * f4, 180.0f, 90.0f);
        double d = f5;
        double d4 = f4;
        tVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d * d4), (float) (Math.sin(Math.toRadians(0.0f)) * d * d4));
    }
}
