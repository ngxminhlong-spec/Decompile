package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xx extends Dz {
    private static final Xx zzb;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.Xx] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(Xx.class, dz);
    }

    public static Wx x() {
        return (Wx) zzb.g();
    }

    public static Xx y(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (Xx) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    public static /* synthetic */ void z(Xx xx, int i4) {
        xx.zzd = i4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
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
        return this.zzd;
    }

    public final int w() {
        return this.zze;
    }
}
