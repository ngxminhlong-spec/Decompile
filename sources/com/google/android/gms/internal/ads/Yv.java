package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Yv implements InterfaceC1312vw, Nw, Kw, Pw, Ls, InterfaceC1132ro, InterfaceC1390xo, InterfaceC0475cE {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7932o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ Yv f7922p = new Yv(0);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ Yv f7923q = new Yv(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ Yv f7924r = new Yv(2);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ Yv f7925s = new Yv(3);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ Yv f7926t = new Yv(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Yv f7927u = new Yv(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ Yv f7928v = new Yv(6);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ Yv f7929w = new Yv(7);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ Yv f7930x = new Yv(8);
    public static final /* synthetic */ Yv y = new Yv(9);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ Yv f7931z = new Yv(10);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ Yv f7904A = new Yv(11);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ Yv f7905B = new Yv(12);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ Yv f7906C = new Yv(13);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ Yv f7907D = new Yv(14);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ Yv f7908E = new Yv(15);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ Yv f7909F = new Yv(16);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ Yv f7910G = new Yv(17);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ Yv f7911H = new Yv(18);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ Yv f7912I = new Yv(19);

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ Yv f7913J = new Yv(20);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ Yv f7914K = new Yv(21);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ Yv f7915L = new Yv(22);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ Yv f7916M = new Yv(23);
    public static final /* synthetic */ Yv N = new Yv(24);

    /* renamed from: O, reason: collision with root package name */
    public static final Yv f7917O = new Yv(25);

    /* renamed from: P, reason: collision with root package name */
    public static final Yv f7918P = new Yv(26);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ Yv f7919Q = new Yv(27);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ Yv f7920R = new Yv(28);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ Yv f7921S = new Yv(29);

    public /* synthetic */ Yv(int i4) {
        this.f7932o = i4;
    }

    public static int e(int i4) {
        switch (i4) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    @Override // com.google.android.gms.internal.ads.Pw
    public Object a(Bs bs) {
        byte[] array;
        switch (this.f7932o) {
            case 10:
                Object obj = new Object();
                if (Bs.q(1)) {
                    return obj;
                }
                throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
            case 11:
                return new Xy((C0458bx) bs);
            case 12:
            case 13:
            case 14:
            default:
                Tw tw = ((Aw) bs).f4011p;
                int[] iArr = AbstractC1484zw.f11699b;
                int i4 = tw.f7098a;
                Integer num = (Integer) tw.f7101f;
                int i5 = iArr[Z.e.b(i4)];
                C1014oy v4 = C1057py.v();
                String str = (String) tw.f7099b;
                v4.d();
                C1057py.A((C1057py) v4.f4561p, str);
                AbstractC0886lz abstractC0886lz = (AbstractC0886lz) tw.d;
                v4.d();
                C1057py.B((C1057py) v4.f4561p, abstractC0886lz);
                int i6 = tw.f7098a;
                v4.d();
                C1057py.C((C1057py) v4.f4561p, i6);
                C1057py c1057py = (C1057py) v4.b();
                AtomicReference atomicReference = AbstractC1311vv.f11094a;
                InterfaceC1011ov interfaceC1011ov = (InterfaceC1011ov) AbstractC1311vv.a(c1057py.z(), c1057py.y(), InterfaceC1011ov.class);
                Jy jy = (Jy) tw.f7100e;
                int ordinal = jy.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            array = new byte[0];
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    }
                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array();
                } else {
                    array = ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array();
                }
                return new C1184sx(interfaceC1011ov, jy, array);
            case 15:
                Object obj2 = new Object();
                if (Bs.q(2)) {
                    return obj2;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 16:
                return new Xy((C0671gx) bs);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public Object b() {
        return new YB();
    }

    @Override // com.google.android.gms.internal.ads.Kw
    public AbstractC1054pv c(Uw uw) {
        switch (this.f7932o) {
            case 2:
                Lw lw = AbstractC0541dw.f8525a;
                C1142ry c1142ry = uw.f7210b;
                if (!c1142ry.A().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c1142ry.A())));
                }
                try {
                    Ey x4 = Ey.x(c1142ry.z(), C1315vz.f11096b);
                    if (c1142ry.y() == Jy.f5945s) {
                        return new C0499cw(x4.y());
                    }
                    throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + String.valueOf(c1142ry.y()) + " with format " + String.valueOf(x4));
                } catch (Oz e4) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e4);
                }
            case 5:
                Lw lw2 = AbstractC0670gw.f8882a;
                C1142ry c1142ry2 = uw.f7210b;
                if (!c1142ry2.A().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c1142ry2.A())));
                }
                try {
                    return AbstractC0670gw.a(Iy.y(c1142ry2.z(), C1315vz.f11096b));
                } catch (Oz e5) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e5);
                }
            case 8:
                Lw lw3 = AbstractC0840kw.f9334a;
                C1142ry c1142ry3 = uw.f7210b;
                if (!c1142ry3.A().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c1142ry3.A())));
                }
                try {
                    if (Ny.x(c1142ry3.z(), C1315vz.f11096b).v() == 0) {
                        return new C0797jw(AbstractC0840kw.a(c1142ry3.y()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (Oz e6) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e6);
                }
            case 13:
                Lw lw4 = AbstractC0585ex.f8659a;
                C1142ry c1142ry4 = uw.f7210b;
                if (!c1142ry4.A().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(c1142ry4.A())));
                }
                try {
                    Ax x5 = Ax.x(c1142ry4.z(), C1315vz.f11096b);
                    C0882lv c0882lv = new C0882lv();
                    c0882lv.o(x5.v());
                    c0882lv.p(x5.y().v());
                    c0882lv.f9506p = AbstractC0585ex.a(c1142ry4.y());
                    return c0882lv.w();
                } catch (Oz e7) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e7);
                }
            default:
                C0339Se c0339Se = AbstractC1141rx.f10554a;
                C1142ry c1142ry5 = uw.f7210b;
                if (!c1142ry5.A().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(c1142ry5.A())));
                }
                try {
                    C0885ly z4 = C0885ly.z(c1142ry5.z(), C1315vz.f11096b);
                    if (z4.w() != 0) {
                        throw new GeneralSecurityException(U.a.i("Parsing HmacParameters failed: unknown Version ", z4.w()));
                    }
                    u0.g gVar = new u0.g(17);
                    gVar.u(z4.v());
                    gVar.z(z4.A().v());
                    gVar.f14985r = (C0755ix) AbstractC1141rx.f10555b.a(z4.A().w());
                    gVar.f14986s = (C0798jx) AbstractC1141rx.f10554a.a(c1142ry5.y());
                    return gVar.G();
                } catch (Oz e8) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e8);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1390xo
    public void d(Object obj, Q0 q02) {
    }

    @Override // com.google.android.gms.internal.ads.Nw
    public Uw f(AbstractC1054pv abstractC1054pv) {
        int i4 = this.f7932o;
        Jy jy = Jy.f5946t;
        Jy jy2 = Jy.f5943q;
        Jy jy3 = Jy.f5945s;
        switch (i4) {
            case 1:
                Lw lw = AbstractC0541dw.f8525a;
                C1100qy v4 = C1142ry.v();
                v4.f("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                Dy v5 = Ey.v();
                String str = ((C0499cw) abstractC1054pv).f8429a;
                v5.d();
                Ey.z((Ey) v5.f4561p, str);
                v4.g(((Ey) v5.b()).c());
                v4.e(jy3);
                return Uw.a((C1142ry) v4.b());
            case 4:
                C0627fw c0627fw = (C0627fw) abstractC1054pv;
                Lw lw2 = AbstractC0670gw.f8882a;
                C1100qy v6 = C1142ry.v();
                v6.f("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                try {
                    C1142ry x4 = C1142ry.x(((Uw) Iw.f5771b.b(c0627fw.c)).f7210b.e(), C1315vz.f11096b);
                    Hy w2 = Iy.w();
                    String str2 = c0627fw.f8764a;
                    w2.d();
                    Iy.A((Iy) w2.f4561p, str2);
                    w2.d();
                    Iy.B((Iy) w2.f4561p, x4);
                    v6.g(((Iy) w2.b()).c());
                    v6.e(jy3);
                    return Uw.a((C1142ry) v6.b());
                } catch (Oz e4) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e4);
                }
            case 7:
                Lw lw3 = AbstractC0840kw.f9334a;
                C1100qy v7 = C1142ry.v();
                v7.f("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                v7.g(Ny.w().c());
                C0753iv c0753iv = ((C0797jw) abstractC1054pv).f9232a;
                if (C0753iv.f9085C.equals(c0753iv)) {
                    jy = jy2;
                } else if (!C0753iv.f9086D.equals(c0753iv)) {
                    if (!C0753iv.f9087E.equals(c0753iv)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c0753iv.f9098p));
                    }
                    jy = jy3;
                }
                v7.e(jy);
                return Uw.a((C1142ry) v7.b());
            case 12:
                C0542dx c0542dx = (C0542dx) abstractC1054pv;
                Lw lw4 = AbstractC0585ex.f8659a;
                C1100qy v8 = C1142ry.v();
                v8.f("type.googleapis.com/google.crypto.tink.AesCmacKey");
                C1485zx w4 = Ax.w();
                Bx w5 = Cx.w();
                int i5 = c0542dx.f8528b;
                w5.d();
                Cx.y((Cx) w5.f4561p, i5);
                Cx cx = (Cx) w5.b();
                w4.d();
                Ax.A((Ax) w4.f4561p, cx);
                int i6 = c0542dx.f8527a;
                w4.d();
                Ax.z((Ax) w4.f4561p, i6);
                v8.g(((Ax) w4.b()).c());
                Iv iv = c0542dx.c;
                if (Iv.f5756H.equals(iv)) {
                    jy = jy2;
                } else if (!Iv.f5757I.equals(iv)) {
                    if (Iv.f5759K.equals(iv)) {
                        jy = jy3;
                    } else {
                        if (!Iv.f5758J.equals(iv)) {
                            throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(iv)));
                        }
                        jy = Jy.f5944r;
                    }
                }
                v8.e(jy);
                return Uw.a((C1142ry) v8.b());
            default:
                C0841kx c0841kx = (C0841kx) abstractC1054pv;
                C0339Se c0339Se = AbstractC1141rx.f10554a;
                C1100qy v9 = C1142ry.v();
                v9.f("type.googleapis.com/google.crypto.tink.HmacKey");
                C0842ky x5 = C0885ly.x();
                C0928my x6 = C0971ny.x();
                int i7 = c0841kx.f9337b;
                x6.d();
                C0971ny.A((C0971ny) x6.f4561p, i7);
                C0339Se c0339Se2 = AbstractC1141rx.f10555b;
                C0755ix c0755ix = c0841kx.d;
                Enum r32 = (Enum) c0339Se2.f6987b.get(c0755ix);
                if (r32 == null) {
                    throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(c0755ix)));
                }
                x6.d();
                C0971ny.z((C0971ny) x6.f4561p, (EnumC0672gy) r32);
                C0971ny c0971ny = (C0971ny) x6.b();
                x5.d();
                C0885ly.B((C0885ly) x5.f4561p, c0971ny);
                int i8 = c0841kx.f9336a;
                x5.d();
                C0885ly.C((C0885ly) x5.f4561p, i8);
                v9.g(((C0885ly) x5.b()).c());
                C0339Se c0339Se3 = AbstractC1141rx.f10554a;
                C0798jx c0798jx = c0841kx.c;
                Enum r1 = (Enum) c0339Se3.f6987b.get(c0798jx);
                if (r1 == null) {
                    throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(c0798jx)));
                }
                v9.e((Jy) r1);
                return Uw.a((C1142ry) v9.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1312vw
    public Bs g(Tw tw) {
        int i4 = this.f7932o;
        int i5 = 20;
        Jy jy = Jy.f5945s;
        switch (i4) {
            case 0:
                Lw lw = Zv.f8063a;
                if (!((String) tw.f7099b).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    C0586ey x4 = C0586ey.x((AbstractC0886lz) tw.d, C1315vz.f11096b);
                    if (x4.v() == 0) {
                        return Wv.r0(Zv.a((Jy) tw.f7100e), Xj.t(x4.y().h()), (Integer) tw.f7101f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (Oz unused) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 3:
                Jy jy2 = (Jy) tw.f7100e;
                Lw lw2 = AbstractC0541dw.f8525a;
                if (!((String) tw.f7099b).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                if (jy2 != jy) {
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got ".concat(String.valueOf(jy2)));
                }
                try {
                    Cy x5 = Cy.x((AbstractC0886lz) tw.d, C1315vz.f11096b);
                    if (x5.v() != 0) {
                        throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(x5)));
                    }
                    x5.y().getClass();
                    return new Bs(i5);
                } catch (Oz e4) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e4);
                }
            case 6:
                Lw lw3 = AbstractC0670gw.f8882a;
                if (!((String) tw.f7099b).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    Gy x6 = Gy.x((AbstractC0886lz) tw.d, C1315vz.f11096b);
                    if (((Jy) tw.f7100e) != jy) {
                        throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with OutputPrefixType RAW, got ".concat(String.valueOf(x6)));
                    }
                    if (x6.v() != 0) {
                        throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(x6)));
                    }
                    AbstractC0670gw.a(x6.y());
                    return new Bs(i5);
                } catch (Oz e5) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e5);
                }
            case 9:
                Lw lw4 = AbstractC0840kw.f9334a;
                if (!((String) tw.f7099b).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    My x7 = My.x((AbstractC0886lz) tw.d, C1315vz.f11096b);
                    if (x7.v() == 0) {
                        return C0754iw.r0(AbstractC0840kw.a((Jy) tw.f7100e), Xj.t(x7.y().h()), (Integer) tw.f7101f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (Oz unused2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 14:
                Lw lw5 = AbstractC0585ex.f8659a;
                if (!((String) tw.f7099b).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    C1442yx x8 = C1442yx.x((AbstractC0886lz) tw.d, C1315vz.f11096b);
                    if (x8.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C0882lv c0882lv = new C0882lv();
                    c0882lv.o(x8.z().l());
                    c0882lv.p(x8.y().v());
                    c0882lv.f9506p = AbstractC0585ex.a((Jy) tw.f7100e);
                    C0542dx w2 = c0882lv.w();
                    C0882lv c0882lv2 = new C0882lv(5);
                    c0882lv2.f9508r = null;
                    c0882lv2.f9506p = null;
                    c0882lv2.f9507q = w2;
                    c0882lv2.f9508r = Xj.t(x8.z().h());
                    c0882lv2.f9506p = (Integer) tw.f7101f;
                    return c0882lv2.u();
                } catch (Oz | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                C0339Se c0339Se = AbstractC1141rx.f10554a;
                if (!((String) tw.f7099b).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    C0799jy y4 = C0799jy.y((AbstractC0886lz) tw.d, C1315vz.f11096b);
                    if (y4.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    u0.g gVar = new u0.g(17);
                    gVar.u(y4.A().l());
                    gVar.z(y4.z().v());
                    gVar.f14985r = (C0755ix) AbstractC1141rx.f10555b.a(y4.z().w());
                    gVar.f14986s = (C0798jx) AbstractC1141rx.f10554a.a((Jy) tw.f7100e);
                    C0841kx G3 = gVar.G();
                    C0882lv c0882lv3 = new C0882lv(7);
                    c0882lv3.f9508r = null;
                    c0882lv3.f9506p = null;
                    c0882lv3.f9507q = G3;
                    c0882lv3.f9508r = Xj.t(y4.A().h());
                    c0882lv3.f9506p = (Integer) tw.f7101f;
                    return c0882lv3.x();
                } catch (Oz | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public int mo6l(Object obj) {
        SD sd = (SD) obj;
        switch (this.f7932o) {
            case 28:
                Pattern pattern = AbstractC0518dE.f8479a;
                String str = sd.f6957a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (AbstractC0751is.f9071a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                Pattern pattern2 = AbstractC0518dE.f8479a;
                return sd.f6957a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public void mo6l(Object obj) {
        switch (this.f7932o) {
            case 22:
                ((VC) obj).k(new ZB(2, new RuntimeException("Player release timed out."), 1003));
                return;
            default:
                return;
        }
    }
}
