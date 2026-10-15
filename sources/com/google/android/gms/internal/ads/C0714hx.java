package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.hx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714hx extends AbstractC1441yw {
    public static final Ow d = new Ow(C0671gx.class, C0628fx.class, Yv.f7908E);

    /* renamed from: e, reason: collision with root package name */
    public static final Ow f9013e = new Ow(C0671gx.class, InterfaceC1011ov.class, Yv.f7909F);

    public C0714hx() {
        super(C0799jy.class, new Fv(InterfaceC1011ov.class, 10));
    }

    public static final void h(C0799jy c0799jy) {
        Yy.b(c0799jy.v());
        if (c0799jy.A().l() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        i(c0799jy.z());
    }

    public static void i(C0971ny c0971ny) {
        if (c0971ny.v() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int ordinal = c0971ny.w().ordinal();
        if (ordinal == 1) {
            if (c0971ny.v() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (ordinal == 2) {
            if (c0971ny.v() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (ordinal == 3) {
            if (c0971ny.v() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal == 4) {
            if (c0971ny.v() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (ordinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (c0971ny.v() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final Bs a() {
        return new Gv(9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final int b() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final AbstractC0417az c(AbstractC0886lz abstractC0886lz) {
        return C0799jy.y(abstractC0886lz, C1315vz.f11096b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final /* bridge */ /* synthetic */ void e(AbstractC0417az abstractC0417az) {
        h((C0799jy) abstractC0417az);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final int f() {
        return 2;
    }
}
