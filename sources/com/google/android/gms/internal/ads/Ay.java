package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ay extends Dz {
    private static final Ay zzb;
    private int zzd;
    private Lz zze = C0769jA.f9138r;

    static {
        Ay ay = new Ay();
        zzb = ay;
        Dz.o(Ay.class, ay);
    }

    public static C1400xy v() {
        return (C1400xy) zzb.g();
    }

    public static void x(Ay ay, C1486zy c1486zy) {
        Lz lz = ay.zze;
        if (!((AbstractC0459bz) lz).f8310o) {
            ay.zze = Dz.l(lz);
        }
        ay.zze.add(c1486zy);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", C1486zy.class});
        }
        if (i5 == 3) {
            return new Ay();
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
