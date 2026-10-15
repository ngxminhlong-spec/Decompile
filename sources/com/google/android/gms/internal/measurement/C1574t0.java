package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1574t0 extends I1 {
    private static final C1574t0 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C1574t0 c1574t0 = new C1574t0();
        zza = c1574t0;
        I1.g(C1574t0.class, c1574t0);
    }

    public static /* synthetic */ void n(C1574t0 c1574t0, String str) {
        str.getClass();
        c1574t0.zze |= 1;
        c1574t0.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new C1574t0();
        }
        if (i5 == 4) {
            return new H1(zza);
        }
        if (i5 != 5) {
            return null;
        }
        return zza;
    }

    public final int l() {
        return this.zzi;
    }

    public final String m() {
        return this.zzf;
    }

    public final boolean o() {
        return this.zzg;
    }

    public final boolean p() {
        return this.zzh;
    }

    public final boolean q() {
        return (this.zze & 2) != 0;
    }

    public final boolean r() {
        return (this.zze & 4) != 0;
    }

    public final boolean s() {
        return (this.zze & 8) != 0;
    }
}
