package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Gx extends Dz {
    private static final Gx zzb;
    private int zzd;
    private Kx zze;
    private C0885ly zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.Gx] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(Gx.class, dz);
    }

    public static /* synthetic */ void A(Gx gx, C0885ly c0885ly) {
        gx.zzf = c0885ly;
        gx.zzd |= 2;
    }

    public static Fx v() {
        return (Fx) zzb.g();
    }

    public static Gx w(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (Gx) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    public static /* synthetic */ void z(Gx gx, Kx kx) {
        gx.zze = kx;
        gx.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new Dz();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final Kx x() {
        Kx kx = this.zze;
        return kx == null ? Kx.x() : kx;
    }

    public final C0885ly y() {
        C0885ly c0885ly = this.zzf;
        return c0885ly == null ? C0885ly.y() : c0885ly;
    }
}
