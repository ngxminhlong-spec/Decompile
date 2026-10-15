package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020p3 extends Dz {
    private static final C1020p3 zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private Hz zzh = Ez.f4961r;
    private long zzi;

    static {
        C1020p3 c1020p3 = new C1020p3();
        zzb = c1020p3;
        Dz.o(C1020p3.class, c1020p3);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new C1020p3();
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
