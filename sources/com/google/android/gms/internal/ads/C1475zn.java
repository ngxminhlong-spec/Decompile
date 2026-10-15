package com.google.android.gms.internal.ads;

import O1.InterfaceC0096x;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1475zn implements InterfaceC0577ep, A2.a, Ls, Nw, Kw, InterfaceC1312vw {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11682o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11672p = new C1475zn(0);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11673q = new C1475zn(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11674r = new C1475zn(2);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11675s = new C1475zn(3);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11676t = new C1475zn(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11677u = new C1475zn(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11678v = new C1475zn(6);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11679w = new C1475zn(7);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11680x = new C1475zn(8);
    public static final /* synthetic */ C1475zn y = new C1475zn(9);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11681z = new C1475zn(10);

    /* renamed from: A, reason: collision with root package name */
    public static final C1475zn f11653A = new C1475zn(11);

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f11654B = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f11655C = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11656D = new C1475zn(13);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11657E = new C1475zn(14);

    /* renamed from: F, reason: collision with root package name */
    public static final C1475zn f11658F = new C1475zn(15);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11659G = new C1475zn(16);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11660H = new C1475zn(17);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11661I = new C1475zn(18);

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11662J = new C1475zn(19);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11663K = new C1475zn(20);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11664L = new C1475zn(21);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11665M = new C1475zn(22);
    public static final /* synthetic */ C1475zn N = new C1475zn(23);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11666O = new C1475zn(24);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11667P = new C1475zn(25);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11668Q = new C1475zn(26);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11669R = new C1475zn(27);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11670S = new C1475zn(28);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ C1475zn f11671T = new C1475zn(29);

    public /* synthetic */ C1475zn(int i4) {
        this.f11682o = i4;
    }

    public static boolean a(File file) {
        try {
            X509Certificate[][] p3 = AbstractC1230u.p(file.getAbsolutePath());
            if (p3.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(p3[0][0].getEncoded());
            return Arrays.equals(f11654B, digest) || (!"user".equals(Build.TYPE) && Arrays.equals(f11655C, digest));
        } catch (C1062q2 e4) {
            throw new GeneralSecurityException("Package is not signed", e4);
        } catch (IOException | RuntimeException e5) {
            throw new GeneralSecurityException("Failed to verify signatures", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public Object b() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.Kw
    public AbstractC1054pv c(Uw uw) {
        switch (this.f11682o) {
            case 17:
                Lw lw = Kv.f6079a;
                C1142ry c1142ry = uw.f7210b;
                if (!c1142ry.A().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c1142ry.A())));
                }
                try {
                    Gx w2 = Gx.w(c1142ry.z(), C1315vz.f11096b);
                    if (w2.y().w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C0381a5 c0381a5 = new C0381a5(9);
                    c0381a5.h(w2.x().v());
                    c0381a5.l(w2.y().v());
                    c0381a5.o(w2.x().y().v());
                    c0381a5.q(w2.y().A().v());
                    c0381a5.f8076o = Kv.a(w2.y().A().w());
                    c0381a5.f8081t = Kv.b(c1142ry.y());
                    return c0381a5.t();
                } catch (Oz e4) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e4);
                }
            case 20:
                Lw lw2 = Pv.f6611a;
                C1142ry c1142ry2 = uw.f7210b;
                if (!c1142ry2.A().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(c1142ry2.A())));
                }
                try {
                    Rx x4 = Rx.x(c1142ry2.z(), C1315vz.f11096b);
                    C0326Qb c0326Qb = new C0326Qb(16);
                    c0326Qb.H(x4.v());
                    c0326Qb.D(x4.y().v());
                    c0326Qb.L();
                    c0326Qb.f6662r = Pv.a(c1142ry2.y());
                    return c0326Qb.R();
                } catch (Oz e5) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e5);
                }
            case 23:
                Lw lw3 = Sv.f7021a;
                C1142ry c1142ry3 = uw.f7210b;
                if (!c1142ry3.A().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c1142ry3.A())));
                }
                try {
                    Xx y4 = Xx.y(c1142ry3.z(), C1315vz.f11096b);
                    if (y4.w() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    u0.g gVar = new u0.g(16);
                    gVar.u(y4.v());
                    gVar.b();
                    gVar.x();
                    gVar.f14986s = Sv.a(c1142ry3.y());
                    return gVar.F();
                } catch (Oz e6) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e6);
                }
            case 26:
                Lw lw4 = Vv.f7309a;
                C1142ry c1142ry4 = uw.f7210b;
                if (!c1142ry4.A().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(c1142ry4.A())));
                }
                try {
                    C0501cy y5 = C0501cy.y(c1142ry4.z(), C1315vz.f11096b);
                    if (y5.w() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int v4 = y5.v();
                    if (v4 == 16 || v4 == 32) {
                        return new Uv(v4, Vv.a(c1142ry4.y()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(v4)));
                } catch (Oz e7) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e7);
                }
            default:
                Lw lw5 = Zv.f8063a;
                C1142ry c1142ry5 = uw.f7210b;
                if (!c1142ry5.A().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c1142ry5.A())));
                }
                try {
                    C0629fy.w(c1142ry5.z(), C1315vz.f11096b);
                    return new Xv(Zv.a(c1142ry5.y()));
                } catch (Oz e8) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e8);
                }
        }
    }

    public C1135rr d(Looper looper, Handler.Callback callback) {
        return new C1135rr(new Handler(looper, callback));
    }

    @Override // A2.a
    public Object e(A2.h hVar) {
        return Boolean.valueOf(hVar.j());
    }

    @Override // com.google.android.gms.internal.ads.Nw
    public Uw f(AbstractC1054pv abstractC1054pv) {
        EnumC0672gy enumC0672gy;
        int i4 = this.f11682o;
        Jy jy = Jy.f5945s;
        Jy jy2 = Jy.f5946t;
        Jy jy3 = Jy.f5943q;
        switch (i4) {
            case 16:
                Jv jv = (Jv) abstractC1054pv;
                Lw lw = Kv.f6079a;
                C1100qy v4 = C1142ry.v();
                v4.f("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                Fx v5 = Gx.v();
                Jx w2 = Kx.w();
                Lx w4 = Mx.w();
                int i5 = jv.c;
                w4.d();
                Mx.y((Mx) w4.f4561p, i5);
                Mx mx = (Mx) w4.b();
                w2.d();
                Kx.z((Kx) w2.f4561p, mx);
                int i6 = jv.f5936a;
                w2.d();
                Kx.A((Kx) w2.f4561p, i6);
                Kx kx = (Kx) w2.b();
                v5.d();
                Gx.z((Gx) v5.f4561p, kx);
                C0842ky x4 = C0885ly.x();
                C0928my x5 = C0971ny.x();
                int i7 = jv.d;
                x5.d();
                C0971ny.A((C0971ny) x5.f4561p, i7);
                Iv iv = jv.f5939f;
                if (Iv.f5760q.equals(iv)) {
                    enumC0672gy = EnumC0672gy.f8888q;
                } else if (Iv.f5761r.equals(iv)) {
                    enumC0672gy = EnumC0672gy.f8892u;
                } else if (Iv.f5762s.equals(iv)) {
                    enumC0672gy = EnumC0672gy.f8890s;
                } else if (Iv.f5763t.equals(iv)) {
                    enumC0672gy = EnumC0672gy.f8889r;
                } else {
                    if (!Iv.f5764u.equals(iv)) {
                        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(iv)));
                    }
                    enumC0672gy = EnumC0672gy.f8891t;
                }
                x5.d();
                C0971ny.z((C0971ny) x5.f4561p, enumC0672gy);
                C0971ny c0971ny = (C0971ny) x5.b();
                x4.d();
                C0885ly.B((C0885ly) x4.f4561p, c0971ny);
                int i8 = jv.f5937b;
                x4.d();
                C0885ly.C((C0885ly) x4.f4561p, i8);
                C0885ly c0885ly = (C0885ly) x4.b();
                v5.d();
                Gx.A((Gx) v5.f4561p, c0885ly);
                v4.g(((Gx) v5.b()).c());
                C0753iv c0753iv = jv.f5938e;
                if (C0753iv.f9091t.equals(c0753iv)) {
                    jy = jy3;
                } else if (C0753iv.f9092u.equals(c0753iv)) {
                    jy = jy2;
                } else if (!C0753iv.f9093v.equals(c0753iv)) {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c0753iv)));
                }
                v4.e(jy);
                return Uw.a((C1142ry) v4.b());
            case 19:
                Ov ov = (Ov) abstractC1054pv;
                Lw lw2 = Pv.f6611a;
                C1100qy v6 = C1142ry.v();
                v6.f("type.googleapis.com/google.crypto.tink.AesEaxKey");
                Qx w5 = Rx.w();
                Sx w6 = Tx.w();
                int i9 = ov.f6539b;
                w6.d();
                Tx.y((Tx) w6.f4561p, i9);
                Tx tx = (Tx) w6.b();
                w5.d();
                Rx.z((Rx) w5.f4561p, tx);
                int i10 = ov.f6538a;
                w5.d();
                Rx.A((Rx) w5.f4561p, i10);
                v6.g(((Rx) w5.b()).c());
                Iv iv2 = ov.c;
                if (Iv.f5765v.equals(iv2)) {
                    jy = jy3;
                } else if (Iv.f5766w.equals(iv2)) {
                    jy = jy2;
                } else if (!Iv.f5767x.equals(iv2)) {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(iv2)));
                }
                v6.e(jy);
                return Uw.a((C1142ry) v6.b());
            case 22:
                Rv rv = (Rv) abstractC1054pv;
                Lw lw3 = Sv.f7021a;
                C1100qy v7 = C1142ry.v();
                v7.f("type.googleapis.com/google.crypto.tink.AesGcmKey");
                Wx x6 = Xx.x();
                int i11 = rv.f6866a;
                x6.d();
                Xx.z((Xx) x6.f4561p, i11);
                v7.g(((Xx) x6.b()).c());
                C0753iv c0753iv2 = rv.f6867b;
                if (C0753iv.f9094w.equals(c0753iv2)) {
                    jy = jy3;
                } else if (C0753iv.f9095x.equals(c0753iv2)) {
                    jy = jy2;
                } else if (!C0753iv.y.equals(c0753iv2)) {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c0753iv2)));
                }
                v7.e(jy);
                return Uw.a((C1142ry) v7.b());
            case 25:
                Uv uv = (Uv) abstractC1054pv;
                Lw lw4 = Vv.f7309a;
                C1100qy v8 = C1142ry.v();
                v8.f("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                C0416ay x7 = C0501cy.x();
                int i12 = uv.f7207a;
                x7.d();
                C0501cy.z((C0501cy) x7.f4561p, i12);
                v8.g(((C0501cy) x7.b()).c());
                Iv iv3 = uv.f7208b;
                if (Iv.y.equals(iv3)) {
                    jy = jy3;
                } else if (Iv.f5768z.equals(iv3)) {
                    jy = jy2;
                } else if (!Iv.f5749A.equals(iv3)) {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(iv3)));
                }
                v8.e(jy);
                return Uw.a((C1142ry) v8.b());
            default:
                Lw lw5 = Zv.f8063a;
                C1100qy v9 = C1142ry.v();
                v9.f("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                v9.g(C0629fy.v().c());
                C0753iv c0753iv3 = ((Xv) abstractC1054pv).f7716a;
                if (C0753iv.f9096z.equals(c0753iv3)) {
                    jy = jy3;
                } else if (C0753iv.f9083A.equals(c0753iv3)) {
                    jy = jy2;
                } else if (!C0753iv.f9084B.equals(c0753iv3)) {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(c0753iv3.f9098p));
                }
                v9.e(jy);
                return Uw.a((C1142ry) v9.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1312vw
    public Bs g(Tw tw) {
        boolean z4 = false;
        switch (this.f11682o) {
            case 18:
                Lw lw = Kv.f6079a;
                if (!((String) tw.f7099b).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    Ex x4 = Ex.x((AbstractC0886lz) tw.d, C1315vz.f11096b);
                    if (x4.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (x4.y().v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (x4.z().v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    C0381a5 c0381a5 = new C0381a5(9);
                    c0381a5.h(x4.y().z().l());
                    c0381a5.l(x4.z().A().l());
                    c0381a5.o(x4.y().y().v());
                    c0381a5.q(x4.z().z().v());
                    c0381a5.f8076o = Kv.a(x4.z().z().w());
                    c0381a5.f8081t = Kv.b((Jy) tw.f7100e);
                    Jv t4 = c0381a5.t();
                    u0.g gVar = new u0.g(15, z4);
                    gVar.f14984q = null;
                    gVar.f14985r = null;
                    gVar.f14986s = null;
                    gVar.f14983p = t4;
                    gVar.f14984q = Xj.t(x4.y().z().h());
                    gVar.f14985r = Xj.t(x4.z().A().h());
                    gVar.f14986s = (Integer) tw.f7101f;
                    return gVar.E();
                } catch (Oz unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 21:
                Lw lw2 = Pv.f6611a;
                if (!((String) tw.f7099b).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    Ox x5 = Ox.x((AbstractC0886lz) tw.d, C1315vz.f11096b);
                    if (x5.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C0326Qb c0326Qb = new C0326Qb(16);
                    c0326Qb.H(x5.z().l());
                    c0326Qb.D(x5.y().v());
                    c0326Qb.L();
                    c0326Qb.f6662r = Pv.a((Jy) tw.f7100e);
                    Ov R4 = c0326Qb.R();
                    C0882lv c0882lv = new C0882lv(2);
                    c0882lv.f9508r = null;
                    c0882lv.f9506p = null;
                    c0882lv.f9507q = R4;
                    c0882lv.f9508r = Xj.t(x5.z().h());
                    c0882lv.f9506p = (Integer) tw.f7101f;
                    return c0882lv.r();
                } catch (Oz unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 24:
                Lw lw3 = Sv.f7021a;
                if (!((String) tw.f7099b).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    Vx x6 = Vx.x((AbstractC0886lz) tw.d, C1315vz.f11096b);
                    if (x6.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    u0.g gVar2 = new u0.g(16);
                    gVar2.u(x6.y().l());
                    gVar2.b();
                    gVar2.x();
                    gVar2.f14986s = Sv.a((Jy) tw.f7100e);
                    Rv F2 = gVar2.F();
                    C0882lv c0882lv2 = new C0882lv(3);
                    c0882lv2.f9508r = null;
                    c0882lv2.f9506p = null;
                    c0882lv2.f9507q = F2;
                    c0882lv2.f9508r = Xj.t(x6.y().h());
                    c0882lv2.f9506p = (Integer) tw.f7101f;
                    return c0882lv2.s();
                } catch (Oz unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            default:
                Lw lw4 = Vv.f7309a;
                if (!((String) tw.f7099b).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    Zx x7 = Zx.x((AbstractC0886lz) tw.d, C1315vz.f11096b);
                    if (x7.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int l4 = x7.y().l();
                    if (l4 != 16 && l4 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(l4)));
                    }
                    Uv uv = new Uv(l4, Vv.a((Jy) tw.f7100e));
                    C0882lv c0882lv3 = new C0882lv(4);
                    c0882lv3.f9508r = null;
                    c0882lv3.f9506p = null;
                    c0882lv3.f9507q = uv;
                    c0882lv3.f9508r = Xj.t(x7.y().h());
                    c0882lv3.f9506p = (Integer) tw.f7101f;
                    return c0882lv3.t();
                } catch (Oz unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0577ep
    public void l(Object obj) {
        switch (this.f11682o) {
            case 0:
                ((InterfaceC0096x) obj).h();
                return;
            case 1:
                ((InterfaceC0096x) obj).i();
                return;
            case 2:
                ((O1.U) obj).e();
                return;
            case 3:
                ((X4) obj).d();
                return;
            case 4:
                ((X4) obj).a();
                return;
            case 5:
                ((P1.g) obj).y3();
                return;
            case 6:
                ((InterfaceC0612fh) obj).h();
                return;
            case 7:
                ((P1.g) obj).W2();
                return;
            case 8:
                ((P1.g) obj).a0();
                return;
            case 9:
                ((Y1.a) obj).l();
                return;
            default:
                ((InterfaceC1291vb) obj).a();
                return;
        }
    }
}
