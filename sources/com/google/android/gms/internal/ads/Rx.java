package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rx extends Dz {
    private static final Rx zzb;
    private int zzd;
    private Tx zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.Rx] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(Rx.class, dz);
    }

    public static /* synthetic */ void A(Rx rx, int i4) {
        rx.zzf = i4;
    }

    public static Qx w() {
        return (Qx) zzb.g();
    }

    public static Rx x(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (Rx) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    public static /* synthetic */ void z(Rx rx, Tx tx) {
        rx.zze = tx;
        rx.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
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
        return this.zzf;
    }

    public final Tx y() {
        Tx tx = this.zze;
        return tx == null ? Tx.x() : tx;
    }
}
