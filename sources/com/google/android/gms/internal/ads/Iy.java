package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Iy extends Dz {
    private static final Iy zzb;
    private int zzd;
    private String zze = "";
    private C1142ry zzf;

    static {
        Iy iy = new Iy();
        zzb = iy;
        Dz.o(Iy.class, iy);
    }

    public static /* synthetic */ void A(Iy iy, String str) {
        str.getClass();
        iy.zze = str;
    }

    public static /* synthetic */ void B(Iy iy, C1142ry c1142ry) {
        iy.zzf = c1142ry;
        iy.zzd |= 1;
    }

    public static Hy w() {
        return (Hy) zzb.g();
    }

    public static Iy x() {
        return zzb;
    }

    public static Iy y(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (Iy) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    public final boolean C() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new Iy();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final C1142ry v() {
        C1142ry c1142ry = this.zzf;
        return c1142ry == null ? C1142ry.w() : c1142ry;
    }

    public final String z() {
        return this.zze;
    }
}
