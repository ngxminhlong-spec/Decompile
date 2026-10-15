package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1440yv {
    static {
        Fv[] fvArr = {new Fv(InterfaceC0583ev.class, 0)};
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
        Fv[] fvArr2 = {new Fv(InterfaceC0583ev.class, 3)};
        HashMap hashMap2 = new HashMap();
        for (int i5 = 0; i5 <= 0; i5++) {
            Fv fv2 = fvArr2[i5];
            Class cls3 = fv2.f5102a;
            if (hashMap2.containsKey(cls3)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls3.getCanonicalName())));
            }
            hashMap2.put(cls3, fv2);
        }
        Class cls4 = fvArr2[0].f5102a;
        Collections.unmodifiableMap(hashMap2);
        Fv[] fvArr3 = {new Fv(InterfaceC0583ev.class, 4)};
        HashMap hashMap3 = new HashMap();
        for (int i6 = 0; i6 <= 0; i6++) {
            Fv fv3 = fvArr3[i6];
            Class cls5 = fv3.f5102a;
            if (hashMap3.containsKey(cls5)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls5.getCanonicalName())));
            }
            hashMap3.put(cls5, fv3);
        }
        Class cls6 = fvArr3[0].f5102a;
        Collections.unmodifiableMap(hashMap3);
        Fv[] fvArr4 = {new Fv(InterfaceC0583ev.class, 2)};
        HashMap hashMap4 = new HashMap();
        for (int i7 = 0; i7 <= 0; i7++) {
            Fv fv4 = fvArr4[i7];
            Class cls7 = fv4.f5102a;
            if (hashMap4.containsKey(cls7)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls7.getCanonicalName())));
            }
            hashMap4.put(cls7, fv4);
        }
        Class cls8 = fvArr4[0].f5102a;
        Collections.unmodifiableMap(hashMap4);
        Fv[] fvArr5 = {new Fv(InterfaceC0583ev.class, 6)};
        HashMap hashMap5 = new HashMap();
        for (int i8 = 0; i8 <= 0; i8++) {
            Fv fv5 = fvArr5[i8];
            Class cls9 = fv5.f5102a;
            if (hashMap5.containsKey(cls9)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls9.getCanonicalName())));
            }
            hashMap5.put(cls9, fv5);
        }
        Class cls10 = fvArr5[0].f5102a;
        Collections.unmodifiableMap(hashMap5);
        Fv[] fvArr6 = {new Fv(InterfaceC0583ev.class, 7)};
        HashMap hashMap6 = new HashMap();
        for (int i9 = 0; i9 <= 0; i9++) {
            Fv fv6 = fvArr6[i9];
            Class cls11 = fv6.f5102a;
            if (hashMap6.containsKey(cls11)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls11.getCanonicalName())));
            }
            hashMap6.put(cls11, fv6);
        }
        Class cls12 = fvArr6[0].f5102a;
        Collections.unmodifiableMap(hashMap6);
        Fv[] fvArr7 = {new Fv(InterfaceC0583ev.class, 5)};
        HashMap hashMap7 = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            Fv fv7 = fvArr7[i10];
            Class cls13 = fv7.f5102a;
            if (hashMap7.containsKey(cls13)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls13.getCanonicalName())));
            }
            hashMap7.put(cls13, fv7);
        }
        Class cls14 = fvArr7[0].f5102a;
        Collections.unmodifiableMap(hashMap7);
        Fv[] fvArr8 = {new Fv(InterfaceC0583ev.class, 8)};
        HashMap hashMap8 = new HashMap();
        for (int i11 = 0; i11 <= 0; i11++) {
            Fv fv8 = fvArr8[i11];
            Class cls15 = fv8.f5102a;
            if (hashMap8.containsKey(cls15)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls15.getCanonicalName())));
            }
            hashMap8.put(cls15, fv8);
        }
        Class cls16 = fvArr8[0].f5102a;
        Collections.unmodifiableMap(hashMap8);
        int i12 = Ky.f6081a;
        try {
            a();
        } catch (GeneralSecurityException e4) {
            throw new ExceptionInInitializerError(e4);
        }
    }

    public static void a() {
        AbstractC1311vv.c(Cv.f4558b);
        AbstractC0884lx.a();
        AbstractC1311vv.b(new Hv(0));
        Lw lw = Kv.f6079a;
        Iw iw = Iw.f5771b;
        iw.f(Kv.f6079a);
        iw.e(Kv.f6080b);
        iw.d(Kv.c);
        iw.c(Kv.d);
        Gw gw = Gw.f5352b;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", AbstractC0713hw.f9011e);
        C0381a5 c0381a5 = new C0381a5(9);
        c0381a5.h(16);
        c0381a5.l(32);
        c0381a5.q(16);
        c0381a5.o(16);
        Iv iv = Iv.f5762s;
        c0381a5.f8076o = iv;
        C0753iv c0753iv = C0753iv.f9093v;
        c0381a5.f8081t = c0753iv;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", c0381a5.t());
        hashMap.put("AES256_CTR_HMAC_SHA256", AbstractC0713hw.f9012f);
        C0381a5 c0381a52 = new C0381a5(9);
        c0381a52.h(32);
        c0381a52.l(32);
        c0381a52.q(32);
        c0381a52.o(16);
        c0381a52.f8076o = iv;
        c0381a52.f8081t = c0753iv;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", c0381a52.t());
        gw.c(Collections.unmodifiableMap(hashMap));
        Dw dw = Dw.f4803b;
        dw.a(Ev.f4958a, Jv.class);
        AbstractC1311vv.b(new Hv(2));
        iw.f(Sv.f7021a);
        iw.e(Sv.f7022b);
        iw.d(Sv.c);
        iw.c(Sv.d);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", AbstractC0713hw.f9009a);
        u0.g gVar = new u0.g(16);
        gVar.b();
        gVar.u(16);
        gVar.x();
        C0753iv c0753iv2 = C0753iv.y;
        gVar.f14986s = c0753iv2;
        hashMap2.put("AES128_GCM_RAW", gVar.F());
        hashMap2.put("AES256_GCM", AbstractC0713hw.f9010b);
        u0.g gVar2 = new u0.g(16);
        gVar2.b();
        gVar2.u(32);
        gVar2.x();
        gVar2.f14986s = c0753iv2;
        hashMap2.put("AES256_GCM_RAW", gVar2.F());
        gw.c(Collections.unmodifiableMap(hashMap2));
        dw.a(Ev.f4959b, Rv.class);
        if (AbstractC1140rw.a()) {
            return;
        }
        AbstractC1311vv.b(new Hv(Ox.class, new Fv[]{new Fv(InterfaceC0583ev.class, 2)}, 1));
        iw.f(Pv.f6611a);
        iw.e(Pv.f6612b);
        iw.d(Pv.c);
        iw.c(Pv.d);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", AbstractC0713hw.c);
        C0326Qb c0326Qb = new C0326Qb(16);
        c0326Qb.D(16);
        c0326Qb.H(16);
        c0326Qb.L();
        Iv iv2 = Iv.f5767x;
        c0326Qb.f6662r = iv2;
        hashMap3.put("AES128_EAX_RAW", c0326Qb.R());
        hashMap3.put("AES256_EAX", AbstractC0713hw.d);
        C0326Qb c0326Qb2 = new C0326Qb(16);
        c0326Qb2.D(16);
        c0326Qb2.H(32);
        c0326Qb2.L();
        c0326Qb2.f6662r = iv2;
        hashMap3.put("AES256_EAX_RAW", c0326Qb2.R());
        gw.c(Collections.unmodifiableMap(hashMap3));
        Iv iv3 = Iv.f5749A;
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            AbstractC1311vv.b(new Hv(3));
            iw.f(Vv.f7309a);
            iw.e(Vv.f7310b);
            iw.d(Vv.c);
            iw.c(Vv.d);
            HashMap hashMap4 = new HashMap();
            Iv iv4 = Iv.y;
            hashMap4.put("AES128_GCM_SIV", new Uv(16, iv4));
            hashMap4.put("AES128_GCM_SIV_RAW", new Uv(16, iv3));
            hashMap4.put("AES256_GCM_SIV", new Uv(32, iv4));
            hashMap4.put("AES256_GCM_SIV_RAW", new Uv(32, iv3));
            gw.c(Collections.unmodifiableMap(hashMap4));
            dw.a(Ev.c, Uv.class);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        AbstractC1311vv.b(new Hv(C0586ey.class, new Fv[]{new Fv(InterfaceC0583ev.class, 5)}, 4));
        Lw lw2 = Zv.f8063a;
        Iw iw2 = Iw.f5771b;
        iw2.f(Zv.f8063a);
        iw2.e(Zv.f8064b);
        iw2.d(Zv.c);
        iw2.c(Zv.d);
        Gw gw2 = Gw.f5352b;
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new Xv(C0753iv.f9096z));
        hashMap5.put("CHACHA20_POLY1305_RAW", new Xv(C0753iv.f9084B));
        gw2.c(Collections.unmodifiableMap(hashMap5));
        AbstractC1311vv.b(new Hv(Cy.class, new Fv[]{new Fv(InterfaceC0583ev.class, 6)}, 5));
        iw2.f(AbstractC0541dw.f8525a);
        iw2.e(AbstractC0541dw.f8526b);
        iw2.d(AbstractC0541dw.c);
        iw2.c(AbstractC0541dw.d);
        AbstractC1311vv.b(new Hv(Gy.class, new Fv[]{new Fv(InterfaceC0583ev.class, 7)}, 6));
        iw2.f(AbstractC0670gw.f8882a);
        iw2.e(AbstractC0670gw.f8883b);
        iw2.d(AbstractC0670gw.c);
        iw2.c(AbstractC0670gw.d);
        AbstractC1311vv.b(new Hv(7));
        iw2.f(AbstractC0840kw.f9334a);
        iw2.e(AbstractC0840kw.f9335b);
        iw2.d(AbstractC0840kw.c);
        iw2.c(AbstractC0840kw.d);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new C0797jw(C0753iv.f9085C));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new C0797jw(C0753iv.f9087E));
        gw2.c(Collections.unmodifiableMap(hashMap6));
        Dw.f4803b.a(Ev.d, C0797jw.class);
    }
}
