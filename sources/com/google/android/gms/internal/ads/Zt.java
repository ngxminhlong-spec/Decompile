package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Zt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8060a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (Math.getExponent(d) > 1023) {
            return false;
        }
        if (d != 0.0d) {
            Bs.d0("not a normal value", Math.getExponent(d) <= 1023);
            int exponent = Math.getExponent(d);
            long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
            if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L) > Math.getExponent(d)) {
                return false;
            }
        }
        return true;
    }
}
