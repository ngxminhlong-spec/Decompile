package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H5 extends Dz {
    private static final H5 zzb;
    private int zzd;
    private int zzf;
    private W5 zzh;
    private String zze = "";
    private Hz zzg = Ez.f4961r;

    static {
        H5 h5 = new H5();
        zzb = h5;
        Dz.o(H5.class, h5);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", C0464c3.f8330n, "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new H5();
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
