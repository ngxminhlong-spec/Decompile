package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G0 extends E {
    private static final G0 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        G0 g02 = new G0();
        zzb = g02;
        E.g(G0.class, g02);
    }

    public static /* synthetic */ void l(G0 g02, int i4) {
        g02.zzd |= 1;
        g02.zze = i4;
    }

    public static /* synthetic */ void m(G0 g02, String str) {
        str.getClass();
        g02.zzd |= 2;
        g02.zzf = str;
    }

    public static /* synthetic */ void n(G0 g02, String str) {
        g02.zzd |= 8;
        g02.zzh = str;
    }

    public static /* synthetic */ void o(G0 g02, int i4) {
        g02.zzg = i4 - 1;
        g02.zzd |= 4;
    }

    public static F0 p() {
        return (F0) ((D) zzb.k(5));
    }

    @Override // com.google.android.gms.internal.play_billing.E
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1620j0(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C0.c, "zzh"});
        }
        if (i5 == 3) {
            return new G0();
        }
        if (i5 == 4) {
            return new D(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
