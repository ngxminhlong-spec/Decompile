package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1451z5 extends Dz {
    private static final C1451z5 zzb;
    private int zzd;
    private String zze = "";
    private Lz zzf = C0769jA.f9138r;
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        C1451z5 c1451z5 = new C1451z5();
        zzb = c1451z5;
        Dz.o(C1451z5.class, c1451z5);
    }

    public static C1451z5 v() {
        return zzb;
    }

    public static /* synthetic */ void w(C1451z5 c1451z5, String str) {
        str.getClass();
        c1451z5.zzd |= 1;
        c1451z5.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            C0464c3 c0464c3 = C0464c3.f8330n;
            return new C0812kA(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", C1322w5.class, "zzg", c0464c3, "zzh", c0464c3, "zzi", c0464c3});
        }
        if (i5 == 3) {
            return new C1451z5();
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
