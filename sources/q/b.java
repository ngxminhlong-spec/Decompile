package q;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f14616a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f4, float f5, boolean z4) {
        if (!z4) {
            return f4;
        }
        return (float) (((1.0d - f14616a) * f5) + f4);
    }

    public static float b(float f4, float f5, boolean z4) {
        if (!z4) {
            return f4 * 1.5f;
        }
        return (float) (((1.0d - f14616a) * f5) + (f4 * 1.5f));
    }
}
