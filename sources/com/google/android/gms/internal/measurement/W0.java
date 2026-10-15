package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class W0 extends I1 {
    private static final W0 zza;
    private int zze;
    private N1 zzf = C1541k2.f11959r;
    private U0 zzg;

    static {
        W0 w02 = new W0();
        zza = w02;
        I1.g(W0.class, w02);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", X0.class, "zzg"});
        }
        if (i5 == 3) {
            return new W0();
        }
        if (i5 == 4) {
            return new H1(zza);
        }
        if (i5 != 5) {
            return null;
        }
        return zza;
    }

    public final U0 l() {
        U0 u02 = this.zzg;
        return u02 == null ? U0.m() : u02;
    }

    public final N1 m() {
        return this.zzf;
    }
}
