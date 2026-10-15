package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1590x0 extends I1 {
    private static final C1590x0 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C1590x0 c1590x0 = new C1590x0();
        zza = c1590x0;
        I1.g(C1590x0.class, c1590x0);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new C1590x0();
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

    public final String m() {
        return this.zzg;
    }
}
