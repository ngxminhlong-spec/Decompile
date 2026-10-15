package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Wv extends AbstractC1483zv {
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.Bs, com.google.android.gms.internal.ads.Wv] */
    public static Wv r0(C0753iv c0753iv, Xj xj, Integer num) {
        String str = c0753iv.f9098p;
        Zy zy = (Zy) xj.f7687p;
        C0753iv c0753iv2 = C0753iv.f9084B;
        if (c0753iv != c0753iv2 && num == null) {
            throw new GeneralSecurityException(U.a.k("For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (c0753iv == c0753iv2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zy.f8067a.length != 32) {
            throw new GeneralSecurityException(U.a.i("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zy.f8067a.length));
        }
        if (c0753iv == c0753iv2) {
            Zy.a(new byte[0]);
        } else if (c0753iv == C0753iv.f9083A) {
            Zy.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (c0753iv != C0753iv.f9096z) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            Zy.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new Bs(20);
    }
}
