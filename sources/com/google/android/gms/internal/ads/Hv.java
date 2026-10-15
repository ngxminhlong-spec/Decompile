package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hv extends AbstractC1441yw {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hv(int i4) {
        super(Ex.class, new Fv(InterfaceC0583ev.class, 0));
        this.d = i4;
        switch (i4) {
            case 2:
                super(Vx.class, new Fv(InterfaceC0583ev.class, 3));
                return;
            case 3:
                super(Zx.class, new Fv(InterfaceC0583ev.class, 4));
                return;
            case 7:
                super(My.class, new Fv(InterfaceC0583ev.class, 8));
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hv(Class cls, Fv[] fvArr, int i4) {
        super(cls, fvArr);
        this.d = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final Bs a() {
        switch (this.d) {
            case 0:
                return new Gv(0);
            case 1:
                return new Gv(1);
            case 2:
                return new Gv(2);
            case 3:
                return new Gv(3);
            case 4:
                return new Gv(4);
            case 5:
                return new Gv(5);
            case 6:
                return new Gv(6);
            default:
                return new Gv(7);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final int b() {
        switch (this.d) {
            case 0:
                return 2;
            case 1:
                return 2;
            case 2:
                return 2;
            case 3:
                return 2;
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 5;
            default:
                return 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final AbstractC0417az c(AbstractC0886lz abstractC0886lz) {
        switch (this.d) {
            case 0:
                return Ex.x(abstractC0886lz, C1315vz.f11096b);
            case 1:
                return Ox.x(abstractC0886lz, C1315vz.f11096b);
            case 2:
                return Vx.x(abstractC0886lz, C1315vz.f11096b);
            case 3:
                return Zx.x(abstractC0886lz, C1315vz.f11096b);
            case 4:
                return C0586ey.x(abstractC0886lz, C1315vz.f11096b);
            case 5:
                return Cy.x(abstractC0886lz, C1315vz.f11096b);
            case 6:
                return Gy.x(abstractC0886lz, C1315vz.f11096b);
            default:
                return My.x(abstractC0886lz, C1315vz.f11096b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final String d() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 5:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            default:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final void e(AbstractC0417az abstractC0417az) {
        switch (this.d) {
            case 0:
                Ex ex = (Ex) abstractC0417az;
                Yy.b(ex.v());
                Fv[] fvArr = {new Fv(Vy.class, 1)};
                HashMap hashMap = new HashMap();
                for (int i4 = 0; i4 <= 0; i4++) {
                    Fv fv = fvArr[i4];
                    Class cls = fv.f5102a;
                    if (hashMap.containsKey(cls)) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls.getCanonicalName())));
                    }
                    hashMap.put(cls, fv);
                }
                Class cls2 = fvArr[0].f5102a;
                Collections.unmodifiableMap(hashMap);
                Ix y = ex.y();
                Yy.b(y.v());
                Yy.a(y.z().l());
                Mx y4 = y.y();
                if (y4.v() < 12 || y4.v() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                new C0714hx();
                C0714hx.h(ex.z());
                return;
            case 1:
                Ox ox = (Ox) abstractC0417az;
                Yy.b(ox.v());
                Yy.a(ox.z().l());
                if (ox.y().v() != 12 && ox.y().v() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                Vx vx = (Vx) abstractC0417az;
                Yy.b(vx.v());
                Yy.a(vx.y().l());
                return;
            case 3:
                Zx zx = (Zx) abstractC0417az;
                Yy.b(zx.v());
                Yy.a(zx.y().l());
                return;
            case 4:
                C0586ey c0586ey = (C0586ey) abstractC0417az;
                Yy.b(c0586ey.v());
                if (c0586ey.y().l() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 5:
                Yy.b(((Cy) abstractC0417az).v());
                return;
            case 6:
                Gy gy = (Gy) abstractC0417az;
                Yy.b(gy.v());
                if (!AbstractC0414aw.f8179a.contains(gy.y().v().A())) {
                    throw new GeneralSecurityException(U.a.k("Unsupported DEK key type: ", gy.y().v().A(), ". Only Tink AEAD key types are supported."));
                }
                return;
            default:
                My my = (My) abstractC0417az;
                Yy.b(my.v());
                if (my.y().l() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441yw
    public final int f() {
        switch (this.d) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                return 1;
            case 6:
                return 1;
            default:
                return 1;
        }
    }
}
