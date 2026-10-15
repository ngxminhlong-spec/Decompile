package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382a6 extends Dz {
    private static final C0382a6 zzb;
    private int zzd;
    private int zze = 1000;
    private C0425b6 zzf;
    private W5 zzg;

    static {
        C0382a6 c0382a6 = new C0382a6();
        zzb = c0382a6;
        Dz.o(C0382a6.class, c0382a6);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", C0464c3.f8330n, "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new C0382a6();
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
