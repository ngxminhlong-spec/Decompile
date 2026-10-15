package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f12151a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12152b;

    static {
        Charset.forName("US-ASCII");
        f12151a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f12152b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
