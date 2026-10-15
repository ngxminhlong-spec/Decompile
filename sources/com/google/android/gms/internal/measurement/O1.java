package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class O1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f11796a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f11797b;

    static {
        Charset.forName("US-ASCII");
        f11796a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f11797b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static I1 b(Object obj, Object obj2) {
        I1 i12 = (I1) ((AbstractC1571s1) obj);
        H1 h12 = (H1) i12.k(5);
        h12.b(i12);
        AbstractC1571s1 abstractC1571s1 = (AbstractC1571s1) obj2;
        if (!h12.f11738o.getClass().isInstance(abstractC1571s1)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        h12.b((I1) abstractC1571s1);
        return h12.e();
    }
}
