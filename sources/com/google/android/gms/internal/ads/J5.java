package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class J5 extends Dz {
    private static final J5 zzb;
    private int zzd;
    private H5 zze;
    private Lz zzf = C0769jA.f9138r;
    private int zzg;
    private W5 zzh;

    static {
        J5 j5 = new J5();
        zzb = j5;
        Dz.o(J5.class, j5);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", V5.class, "zzg", C0464c3.f8330n, "zzh"});
        }
        if (i5 == 3) {
            return new J5();
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
