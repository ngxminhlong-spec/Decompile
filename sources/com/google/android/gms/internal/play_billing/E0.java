package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E0 extends E {
    private static final E0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        E0 e02 = new E0();
        zzb = e02;
        E.g(E0.class, e02);
    }

    public static /* synthetic */ void l(E0 e02, int i4) {
        e02.zzg = i4 - 1;
        e02.zzd |= 1;
    }

    public static D0 m() {
        return (D0) ((D) zzb.k(5));
    }

    @Override // com.google.android.gms.internal.play_billing.E
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1620j0(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C0.f12135b, N0.class, S0.class});
        }
        if (i5 == 3) {
            return new E0();
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
