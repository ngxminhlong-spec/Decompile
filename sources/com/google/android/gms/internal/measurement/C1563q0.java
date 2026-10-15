package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1563q0 extends I1 {
    private static final C1563q0 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private N1 zzi = C1541k2.f11959r;

    static {
        C1563q0 c1563q0 = new C1563q0();
        zza = c1563q0;
        I1.g(C1563q0.class, c1563q0);
    }

    public static C1563q0 m() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C1547m0.c, "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new C1563q0();
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
        return this.zzi.size();
    }

    public final String n() {
        return this.zzg;
    }

    public final N1 o() {
        return this.zzi;
    }

    public final boolean p() {
        return this.zzh;
    }

    public final boolean q() {
        return (this.zze & 4) != 0;
    }

    public final boolean r() {
        return (this.zze & 2) != 0;
    }

    public final boolean s() {
        return (this.zze & 1) != 0;
    }

    public final int t() {
        int i4;
        switch (this.zzf) {
            case 0:
                i4 = 1;
                break;
            case 1:
                i4 = 2;
                break;
            case 2:
                i4 = 3;
                break;
            case 3:
                i4 = 4;
                break;
            case 4:
                i4 = 5;
                break;
            case 5:
                i4 = 6;
                break;
            case 6:
                i4 = 7;
                break;
            default:
                i4 = 0;
                break;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }
}
