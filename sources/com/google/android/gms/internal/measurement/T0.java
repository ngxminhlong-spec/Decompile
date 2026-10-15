package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T0 extends I1 {
    private static final T0 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        T0 t02 = new T0();
        zza = t02;
        I1.g(T0.class, t02);
    }

    public static S0 o() {
        return (S0) zza.h();
    }

    public static /* synthetic */ void r(T0 t02, long j4) {
        t02.zze |= 1;
        t02.zzf = j4;
    }

    public static /* synthetic */ void s(T0 t02, String str) {
        str.getClass();
        t02.zze |= 2;
        t02.zzg = str;
    }

    public static /* synthetic */ void t(T0 t02, String str) {
        str.getClass();
        t02.zze |= 4;
        t02.zzh = str;
    }

    public static /* synthetic */ void u(T0 t02) {
        t02.zze &= -5;
        t02.zzh = zza.zzh;
    }

    public static /* synthetic */ void v(T0 t02, long j4) {
        t02.zze |= 8;
        t02.zzi = j4;
    }

    public static /* synthetic */ void w(T0 t02) {
        t02.zze &= -9;
        t02.zzi = 0L;
    }

    public static /* synthetic */ void x(T0 t02, double d) {
        t02.zze |= 32;
        t02.zzk = d;
    }

    public static /* synthetic */ void y(T0 t02) {
        t02.zze &= -33;
        t02.zzk = 0.0d;
    }

    public final boolean A() {
        return (this.zze & 8) != 0;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i5 == 3) {
            return new T0();
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

    public final long m() {
        return this.zzi;
    }

    public final long n() {
        return this.zzf;
    }

    public final String p() {
        return this.zzg;
    }

    public final String q() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zze & 32) != 0;
    }
}
