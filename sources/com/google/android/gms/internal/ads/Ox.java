package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ox extends Dz {
    private static final Ox zzb;
    private int zzd;
    private int zze;
    private Tx zzf;
    private AbstractC0886lz zzg = AbstractC0886lz.f9510p;

    static {
        Ox ox = new Ox();
        zzb = ox;
        Dz.o(Ox.class, ox);
    }

    public static /* synthetic */ void B(Ox ox, Tx tx) {
        tx.getClass();
        ox.zzf = tx;
        ox.zzd |= 1;
    }

    public static Nx w() {
        return (Nx) zzb.g();
    }

    public static Ox x(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (Ox) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new Ox();
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

    public final Tx y() {
        Tx tx = this.zzf;
        return tx == null ? Tx.x() : tx;
    }

    public final AbstractC0886lz z() {
        return this.zzg;
    }
}
