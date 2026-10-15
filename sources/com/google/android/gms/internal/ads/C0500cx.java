package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500cx extends AbstractC1441yw {
    public static final Ow d = new Ow(C0458bx.class, C0628fx.class, Yv.f7931z);

    /* renamed from: e, reason: collision with root package name */
    public static final Ow f8430e = new Ow(C0458bx.class, InterfaceC1011ov.class, Yv.f7904A);

    public static void h(Cx cx) {
        if (cx.v() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (cx.v() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final Bs a() {
        return new Gv(8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final int b() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final AbstractC0417az c(AbstractC0886lz abstractC0886lz) {
        return C1442yx.x(abstractC0886lz, C1315vz.f11096b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final void e(AbstractC0417az abstractC0417az) {
        C1442yx c1442yx = (C1442yx) abstractC0417az;
        Yy.b(c1442yx.v());
        if (c1442yx.z().l() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        h(c1442yx.y());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final int f() {
        return 1;
    }
}
