package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V0 extends I1 {
    private static final V0 zza;
    private int zze;
    private String zzf = "";
    private N1 zzg = C1541k2.f11959r;

    static {
        V0 v02 = new V0();
        zza = v02;
        I1.g(V0.class, v02);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", X0.class});
        }
        if (i5 == 3) {
            return new V0();
        }
        if (i5 == 4) {
            return new H1(zza);
        }
        if (i5 != 5) {
            return null;
        }
        return zza;
    }

    public final String l() {
        return this.zzf;
    }

    public final N1 m() {
        return this.zzg;
    }
}
