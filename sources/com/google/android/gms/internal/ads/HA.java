package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class HA extends Dz {
    private static final HA zzb;
    private Lz zzd = C0769jA.f9138r;

    static {
        HA ha = new HA();
        zzb = ha;
        Dz.o(HA.class, ha);
    }

    public static GA v() {
        return (GA) zzb.g();
    }

    public static void w(HA ha, FA fa) {
        Lz lz = ha.zzd;
        if (!((AbstractC0459bz) lz).f8310o) {
            ha.zzd = Dz.l(lz);
        }
        ha.zzd.add(fa);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", FA.class});
        }
        if (i5 == 3) {
            return new HA();
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
