package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1559p0 extends I1 {
    private static final C1559p0 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C1539k0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C1559p0 c1559p0 = new C1559p0();
        zza = c1559p0;
        I1.g(C1559p0.class, c1559p0);
    }

    public static C1555o0 n() {
        return (C1555o0) zza.h();
    }

    public static /* synthetic */ void p(C1559p0 c1559p0, String str) {
        c1559p0.zze |= 2;
        c1559p0.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i5 == 3) {
            return new C1559p0();
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
        return this.zzf;
    }

    public final C1539k0 m() {
        C1539k0 c1539k0 = this.zzh;
        return c1539k0 == null ? C1539k0.l() : c1539k0;
    }

    public final String o() {
        return this.zzg;
    }

    public final boolean q() {
        return this.zzi;
    }

    public final boolean r() {
        return this.zzj;
    }

    public final boolean s() {
        return this.zzk;
    }

    public final boolean t() {
        return (this.zze & 1) != 0;
    }

    public final boolean u() {
        return (this.zze & 32) != 0;
    }
}
