package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1539k0 extends I1 {
    private static final C1539k0 zza;
    private int zze;
    private C1563q0 zzf;
    private C1551n0 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C1539k0 c1539k0 = new C1539k0();
        zza = c1539k0;
        I1.g(C1539k0.class, c1539k0);
    }

    public static C1539k0 l() {
        return zza;
    }

    public static /* synthetic */ void p(C1539k0 c1539k0, String str) {
        c1539k0.zze |= 8;
        c1539k0.zzi = str;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new C1539k0();
        }
        if (i5 == 4) {
            return new H1(zza);
        }
        if (i5 != 5) {
            return null;
        }
        return zza;
    }

    public final C1551n0 m() {
        C1551n0 c1551n0 = this.zzg;
        return c1551n0 == null ? C1551n0.l() : c1551n0;
    }

    public final C1563q0 n() {
        C1563q0 c1563q0 = this.zzf;
        return c1563q0 == null ? C1563q0.m() : c1563q0;
    }

    public final String o() {
        return this.zzi;
    }

    public final boolean q() {
        return this.zzh;
    }

    public final boolean r() {
        return (this.zze & 4) != 0;
    }

    public final boolean s() {
        return (this.zze & 2) != 0;
    }

    public final boolean t() {
        return (this.zze & 8) != 0;
    }

    public final boolean u() {
        return (this.zze & 1) != 0;
    }
}
