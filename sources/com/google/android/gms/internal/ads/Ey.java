package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ey extends Dz {
    private static final Ey zzb;
    private String zzd = "";

    static {
        Ey ey = new Ey();
        zzb = ey;
        Dz.o(Ey.class, ey);
    }

    public static Dy v() {
        return (Dy) zzb.g();
    }

    public static Ey w() {
        return zzb;
    }

    public static Ey x(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (Ey) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    public static /* synthetic */ void z(Ey ey, String str) {
        str.getClass();
        ey.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i5 == 3) {
            return new Ey();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final String y() {
        return this.zzd;
    }
}
