package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467c6 extends Dz {
    private static final C0467c6 zzb;
    private int zzd;
    private Y5 zze;
    private int zzf = 1000;
    private C0425b6 zzg;
    private W5 zzh;

    static {
        C0467c6 c0467c6 = new C0467c6();
        zzb = c0467c6;
        Dz.o(C0467c6.class, c0467c6);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", C0464c3.f8330n, "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new C0467c6();
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
