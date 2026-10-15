package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y5 extends Dz {
    private static final Y5 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.Y5] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(Y5.class, dz);
    }

    public static X5 v() {
        return (X5) zzb.g();
    }

    public static /* synthetic */ void w(Y5 y5, int i4) {
        y5.zzd |= 1;
        y5.zze = i4;
    }

    public static /* synthetic */ void x(Y5 y5, int i4) {
        y5.zzd |= 2;
        y5.zzf = i4;
    }

    public static /* synthetic */ void y(Y5 y5, int i4) {
        y5.zzd |= 4;
        y5.zzg = i4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
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
}
