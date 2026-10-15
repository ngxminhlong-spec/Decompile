package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.b3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422b3 extends Dz {
    private static final C0422b3 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C0422b3 c0422b3 = new C0422b3();
        zzb = c0422b3;
        Dz.o(C0422b3.class, c0422b3);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new C0422b3();
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
