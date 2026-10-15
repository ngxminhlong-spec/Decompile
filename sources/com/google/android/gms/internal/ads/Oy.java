package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Oy implements Vy {
    public static final R2 d = new R2(4);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f6542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6543b;
    public final int c;

    public Oy(int i4, byte[] bArr) {
        if (!Bs.q(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        Yy.a(bArr.length);
        this.f6542a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) d.get()).getBlockSize();
        this.c = blockSize;
        if (i4 < 12 || i4 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f6543b = i4;
    }
}
