package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C5 extends Dz {
    private static final C5 zzb;
    private int zzd;
    private W5 zzf;
    private int zzg;
    private Y5 zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        C5 c5 = new C5();
        zzb = c5;
        Dz.o(C5.class, c5);
    }

    public static C5 v() {
        return zzb;
    }

    public static /* synthetic */ void w(C5 c5, String str) {
        c5.zzd |= 1;
        c5.zze = str;
    }

    public static /* synthetic */ void x(C5 c5, Y5 y5) {
        c5.zzh = y5;
        c5.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            C0464c3 c0464c3 = C0464c3.f8330n;
            return new C0812kA(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", c0464c3, "zzk", c0464c3, "zzl", c0464c3});
        }
        if (i5 == 3) {
            return new C5();
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
