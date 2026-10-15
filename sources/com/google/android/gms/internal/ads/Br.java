package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Br extends Dz {
    private static final Br zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C1479zr zzh;

    static {
        Br br = new Br();
        zzb = br;
        Dz.o(Br.class, br);
    }

    public static Ar v() {
        return (Ar) zzb.g();
    }

    public static /* synthetic */ void w(Br br, String str) {
        str.getClass();
        br.zzd |= 2;
        br.zzf = str;
    }

    public static /* synthetic */ void x(Br br, C1479zr c1479zr) {
        br.zzh = c1479zr;
        br.zzd |= 8;
    }

    public static /* synthetic */ void y(Br br) {
        br.zze = 1;
        br.zzd = 1 | br.zzd;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", C0464c3.f8336t, "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new Br();
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
