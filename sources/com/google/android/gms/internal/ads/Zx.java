package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zx extends Dz {
    private static final Zx zzb;
    private int zzd;
    private AbstractC0886lz zze = AbstractC0886lz.f9510p;

    static {
        Zx zx = new Zx();
        zzb = zx;
        Dz.o(Zx.class, zx);
    }

    public static Yx w() {
        return (Yx) zzb.g();
    }

    public static Zx x(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (Zx) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        if (i5 == 3) {
            return new Zx();
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

    public final AbstractC0886lz y() {
        return this.zze;
    }
}
