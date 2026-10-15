package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L0 extends E {
    private static final L0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        L0 l02 = new L0();
        zzb = l02;
        E.g(L0.class, l02);
    }

    public static /* synthetic */ void l(L0 l02, String str) {
        str.getClass();
        l02.zzd |= 1;
        l02.zze = str;
    }

    public static /* synthetic */ void m(L0 l02, String str) {
        str.getClass();
        l02.zzd |= 2;
        l02.zzf = str;
    }

    public static /* synthetic */ void n(L0 l02, int i4) {
        l02.zzd |= 4;
        l02.zzg = i4;
    }

    public static K0 o() {
        return (K0) ((D) zzb.k(5));
    }

    @Override // com.google.android.gms.internal.play_billing.E
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1620j0(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new L0();
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
