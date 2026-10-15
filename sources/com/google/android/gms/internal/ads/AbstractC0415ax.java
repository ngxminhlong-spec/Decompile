package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ax, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0415ax {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8180a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final Zy a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (charAt < '!' || charAt > '~') {
                throw new RuntimeException("Not a printable ASCII character: " + charAt);
            }
            bArr[i4] = (byte) charAt;
        }
        return Zy.a(bArr);
    }
}
