package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Mz {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f6292a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f6293b;
    public static final ByteBuffer c;

    static {
        Charset.forName("US-ASCII");
        f6292a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6293b = bArr;
        c = ByteBuffer.wrap(bArr);
        int i4 = (0 - 0) + 0;
        try {
            if (i4 < 0) {
                throw Oz.e();
            }
            if (i4 > Integer.MAX_VALUE) {
                throw Oz.f();
            }
        } catch (Oz e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
