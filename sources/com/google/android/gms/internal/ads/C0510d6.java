package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.d6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510d6 extends Dz {
    private static final C0510d6 zzb;
    private int zzd;
    private int zze = 1000;
    private C0425b6 zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        C0510d6 c0510d6 = new C0510d6();
        zzb = c0510d6;
        Dz.o(C0510d6.class, c0510d6);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", C0464c3.f8330n, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new C0510d6();
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
