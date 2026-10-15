package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E5 extends Dz {
    private static final E5 zzb;
    private int zzd;
    private int zze;
    private Y5 zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        E5 e5 = new E5();
        zzb = e5;
        Dz.o(E5.class, e5);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", C0464c3.f8329m, "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new E5();
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
