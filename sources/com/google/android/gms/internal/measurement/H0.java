package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H0 extends I1 {
    private static final H0 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private N1 zzk = C1541k2.f11959r;

    static {
        H0 h02 = new H0();
        zza = h02;
        I1.g(H0.class, h02);
    }

    public static void A(H0 h02, H0 h03) {
        N1 n12 = h02.zzk;
        if (!((AbstractC1575t1) n12).f12028o) {
            h02.zzk = I1.e(n12);
        }
        h02.zzk.add(h03);
    }

    public static void B(H0 h02, ArrayList arrayList) {
        N1 n12 = h02.zzk;
        if (!((AbstractC1575t1) n12).f12028o) {
            h02.zzk = I1.e(n12);
        }
        AbstractC1571s1.a(arrayList, h02.zzk);
    }

    public static void C(H0 h02) {
        h02.zzk = C1541k2.f11959r;
    }

    public static G0 p() {
        return (G0) zza.h();
    }

    public static /* synthetic */ void t(H0 h02, String str) {
        str.getClass();
        h02.zze |= 1;
        h02.zzf = str;
    }

    public static /* synthetic */ void u(H0 h02, String str) {
        h02.zze |= 2;
        h02.zzg = str;
    }

    public static /* synthetic */ void v(H0 h02) {
        h02.zze &= -3;
        h02.zzg = zza.zzg;
    }

    public static /* synthetic */ void w(H0 h02, long j4) {
        h02.zze |= 4;
        h02.zzh = j4;
    }

    public static /* synthetic */ void x(H0 h02) {
        h02.zze &= -5;
        h02.zzh = 0L;
    }

    public static /* synthetic */ void y(H0 h02, double d) {
        h02.zze |= 16;
        h02.zzj = d;
    }

    public static /* synthetic */ void z(H0 h02) {
        h02.zze &= -17;
        h02.zzj = 0.0d;
    }

    public final boolean D() {
        return (this.zze & 16) != 0;
    }

    public final boolean E() {
        return (this.zze & 8) != 0;
    }

    public final boolean F() {
        return (this.zze & 4) != 0;
    }

    public final boolean G() {
        return (this.zze & 1) != 0;
    }

    public final boolean H() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", H0.class});
        }
        if (i5 == 3) {
            return new H0();
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
        return this.zzj;
    }

    public final float m() {
        return this.zzi;
    }

    public final int n() {
        return this.zzk.size();
    }

    public final long o() {
        return this.zzh;
    }

    public final String q() {
        return this.zzf;
    }

    public final String r() {
        return this.zzg;
    }

    public final N1 s() {
        return this.zzk;
    }
}
