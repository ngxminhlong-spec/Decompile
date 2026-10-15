package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Vw {

    /* renamed from: a, reason: collision with root package name */
    public static final R2 f7311a = new R2(3);

    public static byte[] a(int i4) {
        byte[] bArr = new byte[i4];
        ((SecureRandom) f7311a.get()).nextBytes(bArr);
        return bArr;
    }
}
