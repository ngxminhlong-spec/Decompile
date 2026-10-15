package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1486zy extends Dz {
    private static final C1486zy zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C1486zy c1486zy = new C1486zy();
        zzb = c1486zy;
        Dz.o(C1486zy.class, c1486zy);
    }

    public static C1443yy v() {
        return (C1443yy) zzb.g();
    }

    public static /* synthetic */ void w(C1486zy c1486zy, String str) {
        str.getClass();
        c1486zy.zzd = str;
    }

    public static void z(C1486zy c1486zy, int i4) {
        if (i4 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c1486zy.zze = i4 - 2;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new C1486zy();
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
