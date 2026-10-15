package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class A0 extends I1 {
    private static final A0 zza;
    private int zze;
    private int zzf;
    private P0 zzg;
    private P0 zzh;
    private boolean zzi;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.A0, com.google.android.gms.internal.measurement.I1] */
    static {
        ?? i12 = new I1();
        zza = i12;
        I1.g(A0.class, i12);
    }

    public static C1598z0 m() {
        return (C1598z0) zza.h();
    }

    public static /* synthetic */ void p(A0 a02, int i4) {
        a02.zze |= 1;
        a02.zzf = i4;
    }

    public static /* synthetic */ void q(A0 a02, P0 p02) {
        a02.zzg = p02;
        a02.zze |= 2;
    }

    public static /* synthetic */ void r(A0 a02, P0 p02) {
        a02.zzh = p02;
        a02.zze |= 4;
    }

    public static /* synthetic */ void s(A0 a02, boolean z4) {
        a02.zze |= 8;
        a02.zzi = z4;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new I1();
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

    public final P0 n() {
        P0 p02 = this.zzg;
        return p02 == null ? P0.r() : p02;
    }

    public final P0 o() {
        P0 p02 = this.zzh;
        return p02 == null ? P0.r() : p02;
    }

    public final boolean t() {
        return this.zzi;
    }

    public final boolean u() {
        return (this.zze & 1) != 0;
    }

    public final boolean v() {
        return (this.zze & 8) != 0;
    }

    public final boolean w() {
        return (this.zze & 4) != 0;
    }
}
