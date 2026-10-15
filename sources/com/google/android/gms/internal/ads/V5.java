package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V5 extends Dz {
    private static final V5 zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private W5 zzg;

    static {
        V5 v5 = new V5();
        zzb = v5;
        Dz.o(V5.class, v5);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", C0464c3.f8330n, "zzg"});
        }
        if (i5 == 3) {
            return new V5();
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
