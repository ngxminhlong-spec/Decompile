package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X0 extends I1 {
    private static final X0 zza;
    private int zze;
    private int zzf;
    private N1 zzg = C1541k2.f11959r;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        X0 x02 = new X0();
        zza = x02;
        I1.g(X0.class, x02);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C1547m0.f11972f, "zzg", X0.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i5 == 3) {
            return new X0();
        }
        if (i5 == 4) {
            return new H1(zza);
        }
        if (i5 != 5) {
            return null;
        }
        return zza;
    }

    public final double l() {
        return this.zzk;
    }

    public final String m() {
        return this.zzh;
    }

    public final String n() {
        return this.zzi;
    }

    public final N1 o() {
        return this.zzg;
    }

    public final boolean p() {
        return this.zzj;
    }

    public final boolean q() {
        return (this.zze & 8) != 0;
    }

    public final boolean r() {
        return (this.zze & 16) != 0;
    }

    public final boolean s() {
        return (this.zze & 4) != 0;
    }

    public final int t() {
        int i4;
        int i5 = this.zzf;
        if (i5 != 0) {
            i4 = 2;
            if (i5 != 1) {
                if (i5 != 2) {
                    i4 = 4;
                    if (i5 != 3) {
                        i4 = i5 != 4 ? 0 : 5;
                    }
                } else {
                    i4 = 3;
                }
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }
}
