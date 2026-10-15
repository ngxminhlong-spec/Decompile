package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Gv extends Bs {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5351p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Gv(int i4) {
        super(25);
        this.f5351p = i4;
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final AbstractC0417az A(AbstractC0886lz abstractC0886lz) {
        switch (this.f5351p) {
            case 0:
                return Gx.w(abstractC0886lz, C1315vz.f11096b);
            case 1:
                return Rx.x(abstractC0886lz, C1315vz.f11096b);
            case 2:
                return Xx.y(abstractC0886lz, C1315vz.f11096b);
            case 3:
                return C0501cy.y(abstractC0886lz, C1315vz.f11096b);
            case 4:
                return C0629fy.w(abstractC0886lz, C1315vz.f11096b);
            case 5:
                return Ey.x(abstractC0886lz, C1315vz.f11096b);
            case 6:
                return Iy.y(abstractC0886lz, C1315vz.f11096b);
            case 7:
                return Ny.x(abstractC0886lz, C1315vz.f11096b);
            case 8:
                return Ax.x(abstractC0886lz, C1315vz.f11096b);
            default:
                return C0885ly.z(abstractC0886lz, C1315vz.f11096b);
        }
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final void R(AbstractC0417az abstractC0417az) {
        switch (this.f5351p) {
            case 0:
                Gx gx = (Gx) abstractC0417az;
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
                Kx x4 = gx.x();
                Yy.a(x4.v());
                Mx y = x4.y();
                if (y.v() < 12 || y.v() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                new C0714hx();
                C0885ly y4 = gx.y();
                if (y4.v() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C0714hx.i(y4.A());
                Yy.a(gx.x().v());
                return;
            case 1:
                Rx rx = (Rx) abstractC0417az;
                Yy.a(rx.v());
                if (rx.y().v() != 12 && rx.y().v() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                Yy.a(((Xx) abstractC0417az).v());
                return;
            case 3:
                Yy.a(((C0501cy) abstractC0417az).v());
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                Iy iy = (Iy) abstractC0417az;
                if (!AbstractC0414aw.f8179a.contains(iy.v().A())) {
                    throw new GeneralSecurityException(U.a.k("Unsupported DEK key type: ", iy.v().A(), ". Only Tink AEAD key types are supported."));
                }
                if (iy.z().isEmpty() || !iy.C()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case 7:
                return;
            case 8:
                Ax ax = (Ax) abstractC0417az;
                C0500cx.h(ax.y());
                if (ax.v() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                return;
            default:
                C0885ly c0885ly = (C0885ly) abstractC0417az;
                if (c0885ly.v() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C0714hx.i(c0885ly.A());
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final AbstractC0417az i(AbstractC0417az abstractC0417az) {
        switch (this.f5351p) {
            case 0:
                Gx gx = (Gx) abstractC0417az;
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
                Kx x4 = gx.x();
                Hx w2 = Ix.w();
                Mx y = x4.y();
                w2.d();
                Ix.B((Ix) w2.f4561p, y);
                byte[] a4 = Vw.a(x4.v());
                C0800jz A3 = AbstractC0886lz.A(a4, 0, a4.length);
                w2.d();
                ((Ix) w2.f4561p).zzg = A3;
                w2.d();
                ((Ix) w2.f4561p).zze = 0;
                Ix ix = (Ix) w2.b();
                new C0714hx();
                C0885ly y4 = gx.y();
                C0756iy w4 = C0799jy.w();
                w4.d();
                ((C0799jy) w4.f4561p).zze = 0;
                C0971ny A4 = y4.A();
                w4.d();
                C0799jy.C((C0799jy) w4.f4561p, A4);
                byte[] a5 = Vw.a(y4.v());
                C0800jz A5 = AbstractC0886lz.A(a5, 0, a5.length);
                w4.d();
                ((C0799jy) w4.f4561p).zzg = A5;
                C0799jy c0799jy = (C0799jy) w4.b();
                Dx w5 = Ex.w();
                w5.d();
                Ex.B((Ex) w5.f4561p, ix);
                w5.d();
                Ex.C((Ex) w5.f4561p, c0799jy);
                w5.d();
                ((Ex) w5.f4561p).zze = 0;
                return (Ex) w5.b();
            case 1:
                Rx rx = (Rx) abstractC0417az;
                Nx w6 = Ox.w();
                byte[] a6 = Vw.a(rx.v());
                C0800jz A6 = AbstractC0886lz.A(a6, 0, a6.length);
                w6.d();
                ((Ox) w6.f4561p).zzg = A6;
                Tx y5 = rx.y();
                w6.d();
                Ox.B((Ox) w6.f4561p, y5);
                w6.d();
                ((Ox) w6.f4561p).zze = 0;
                return (Ox) w6.b();
            case 2:
                Ux w7 = Vx.w();
                byte[] a7 = Vw.a(((Xx) abstractC0417az).v());
                C0800jz A7 = AbstractC0886lz.A(a7, 0, a7.length);
                w7.d();
                ((Vx) w7.f4561p).zze = A7;
                w7.d();
                ((Vx) w7.f4561p).zzd = 0;
                return (Vx) w7.b();
            case 3:
                Yx w8 = Zx.w();
                byte[] a8 = Vw.a(((C0501cy) abstractC0417az).v());
                C0800jz A8 = AbstractC0886lz.A(a8, 0, a8.length);
                w8.d();
                ((Zx) w8.f4561p).zze = A8;
                w8.d();
                ((Zx) w8.f4561p).zzd = 0;
                return (Zx) w8.b();
            case 4:
                C0543dy w9 = C0586ey.w();
                w9.d();
                ((C0586ey) w9.f4561p).zzd = 0;
                byte[] a9 = Vw.a(32);
                C0800jz A9 = AbstractC0886lz.A(a9, 0, a9.length);
                w9.d();
                ((C0586ey) w9.f4561p).zze = A9;
                return (C0586ey) w9.b();
            case 5:
                By w10 = Cy.w();
                w10.d();
                Cy.A((Cy) w10.f4561p, (Ey) abstractC0417az);
                w10.d();
                ((Cy) w10.f4561p).zze = 0;
                return (Cy) w10.b();
            case 6:
                Fy w11 = Gy.w();
                w11.d();
                Gy.A((Gy) w11.f4561p, (Iy) abstractC0417az);
                w11.d();
                ((Gy) w11.f4561p).zze = 0;
                return (Gy) w11.b();
            case 7:
                Ly w12 = My.w();
                w12.d();
                ((My) w12.f4561p).zzd = 0;
                byte[] a10 = Vw.a(32);
                C0800jz A10 = AbstractC0886lz.A(a10, 0, a10.length);
                w12.d();
                ((My) w12.f4561p).zze = A10;
                return (My) w12.b();
            case 8:
                Ax ax = (Ax) abstractC0417az;
                C1356wx w13 = C1442yx.w();
                w13.d();
                ((C1442yx) w13.f4561p).zze = 0;
                byte[] a11 = Vw.a(ax.v());
                C0800jz A11 = AbstractC0886lz.A(a11, 0, a11.length);
                w13.d();
                ((C1442yx) w13.f4561p).zzf = A11;
                Cx y6 = ax.y();
                w13.d();
                C1442yx.C((C1442yx) w13.f4561p, y6);
                return (C1442yx) w13.b();
            default:
                C0885ly c0885ly = (C0885ly) abstractC0417az;
                C0756iy w14 = C0799jy.w();
                w14.d();
                ((C0799jy) w14.f4561p).zze = 0;
                C0971ny A12 = c0885ly.A();
                w14.d();
                C0799jy.C((C0799jy) w14.f4561p, A12);
                byte[] a12 = Vw.a(c0885ly.v());
                C0800jz A13 = AbstractC0886lz.A(a12, 0, a12.length);
                w14.d();
                ((C0799jy) w14.f4561p).zzg = A13;
                return (C0799jy) w14.b();
        }
    }
}
