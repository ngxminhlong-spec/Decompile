package A;

import android.graphics.Color;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a {
    static {
        new ThreadLocal();
    }

    public static int a(double d, double d4, double d5) {
        double d6 = (((-0.4986d) * d5) + (((-1.5372d) * d4) + (3.2406d * d))) / 100.0d;
        double d7 = ((0.0415d * d5) + ((1.8758d * d4) + ((-0.9689d) * d))) / 100.0d;
        double d8 = ((1.057d * d5) + (((-0.204d) * d4) + (0.0557d * d))) / 100.0d;
        double pow = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        double pow2 = d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d;
        double pow3 = d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static int b(int i4, int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i4);
        int i6 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i6, c(Color.red(i4), alpha2, Color.red(i5), alpha, i6), c(Color.green(i4), alpha2, Color.green(i5), alpha, i6), c(Color.blue(i4), alpha2, Color.blue(i5), alpha, i6));
    }

    public static int c(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((255 - i5) * (i6 * i7)) + ((i4 * 255) * i5)) / (i8 * 255);
    }

    public static int d(int i4, int i5) {
        if (i5 < 0 || i5 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i4 & 16777215) | (i5 << 24);
    }
}
