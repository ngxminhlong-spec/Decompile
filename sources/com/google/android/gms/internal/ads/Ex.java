package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ex extends Dz {
    private static final Ex zzb;
    private int zzd;
    private int zze;
    private Ix zzf;
    private C0799jy zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.Ex] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(Ex.class, dz);
    }

    public static /* synthetic */ void B(Ex ex, Ix ix) {
        ex.zzf = ix;
        ex.zzd |= 1;
    }

    public static /* synthetic */ void C(Ex ex, C0799jy c0799jy) {
        ex.zzg = c0799jy;
        ex.zzd |= 2;
    }

    public static Dx w() {
        return (Dx) zzb.g();
    }

    public static Ex x(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (Ex) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
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

    public final int v() {
        return this.zze;
    }

    public final Ix y() {
        Ix ix = this.zzf;
        return ix == null ? Ix.x() : ix;
    }

    public final C0799jy z() {
        C0799jy c0799jy = this.zzg;
        return c0799jy == null ? C0799jy.x() : c0799jy;
    }
}
