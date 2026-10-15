package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class UA extends Dz {
    private static final UA zzb;
    private int zzd;
    private AbstractC0886lz zze;
    private AbstractC0886lz zzf;
    private AbstractC0886lz zzg;

    static {
        UA ua = new UA();
        zzb = ua;
        Dz.o(UA.class, ua);
    }

    public UA() {
        C0800jz c0800jz = AbstractC0886lz.f9510p;
        this.zze = c0800jz;
        this.zzf = c0800jz;
        this.zzg = c0800jz;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new UA();
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
