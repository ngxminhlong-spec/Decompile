package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class SA extends Dz {
    private static final SA zzb;
    private int zzd;
    private AbstractC0886lz zze;
    private AbstractC0886lz zzf;
    private byte zzg = 2;

    static {
        SA sa = new SA();
        zzb = sa;
        Dz.o(SA.class, sa);
    }

    public SA() {
        C0800jz c0800jz = AbstractC0886lz.f9510p;
        this.zze = c0800jz;
        this.zzf = c0800jz;
    }

    public static RA v() {
        return (RA) zzb.g();
    }

    public static /* synthetic */ void w(SA sa, C0800jz c0800jz) {
        sa.zzd |= 1;
        sa.zze = c0800jz;
    }

    public static /* synthetic */ void x(SA sa, C0800jz c0800jz) {
        sa.zzd |= 2;
        sa.zzf = c0800jz;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new SA();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzg = dz == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
