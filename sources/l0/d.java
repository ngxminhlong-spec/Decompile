package l0;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public static final d f13883a = new Object();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f4, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f5 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f6 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float g4 = n0.a.g(f6, f5, f4, f5);
        float g5 = n0.a.g(pow4, pow, f4, pow);
        float g6 = n0.a.g(pow5, pow2, f4, pow2);
        float g7 = n0.a.g(pow6, pow3, f4, pow3);
        float pow7 = ((float) Math.pow(g5, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(g6, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(g7, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(g4 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
