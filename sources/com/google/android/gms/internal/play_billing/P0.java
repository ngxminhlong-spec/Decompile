package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P0 extends E {
    private static final P0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private L0 zzg;
    private M0 zzh;

    static {
        P0 p02 = new P0();
        zzb = p02;
        E.g(P0.class, p02);
    }

    public static /* synthetic */ void l(P0 p02, R0 r02) {
        p02.zzf = r02;
        p02.zze = 4;
    }

    public static /* synthetic */ void m(P0 p02, L0 l02) {
        l02.getClass();
        p02.zzg = l02;
        p02.zzd |= 1;
    }

    public static /* synthetic */ void n(P0 p02, B0 b02) {
        p02.zzf = b02;
        p02.zze = 2;
    }

    public static /* synthetic */ void o(P0 p02, E0 e02) {
        p02.zzf = e02;
        p02.zze = 3;
    }

    public static O0 p() {
        return (O0) ((D) zzb.k(5));
    }

    @Override // com.google.android.gms.internal.play_billing.E
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1620j0(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", B0.class, E0.class, R0.class, J0.class, "zzh"});
        }
        if (i5 == 3) {
            return new P0();
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
