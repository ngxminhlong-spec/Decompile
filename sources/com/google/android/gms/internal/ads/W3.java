package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class W3 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7341a = "0123456789abcdef".toCharArray();

    public static long a(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / displayMetrics.density);
    }

    public static byte[] b(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i4 = 0; i4 < length; i4 += 2) {
            bArr[i4 / 2] = (byte) (Character.digit(str.charAt(i4 + 1), 16) + (Character.digit(str.charAt(i4), 16) << 4));
        }
        return bArr;
    }
}
