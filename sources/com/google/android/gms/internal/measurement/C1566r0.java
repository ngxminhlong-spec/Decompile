package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1566r0 extends I1 {
    private static final C1566r0 zza;
    private int zze;
    private String zzf = "";
    private N1 zzg = C1541k2.f11959r;
    private boolean zzh;

    static {
        C1566r0 c1566r0 = new C1566r0();
        zza = c1566r0;
        I1.g(C1566r0.class, c1566r0);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C1586w0.class, "zzh"});
        }
        if (i5 == 3) {
            return new C1566r0();
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
}
