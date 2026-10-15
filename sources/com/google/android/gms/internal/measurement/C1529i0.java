package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1529i0 extends I1 {
    private static final C1529i0 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private N1 zzh = C1541k2.f11959r;
    private boolean zzi;
    private C1551n0 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C1529i0 c1529i0 = new C1529i0();
        zza = c1529i0;
        I1.g(C1529i0.class, c1529i0);
    }

    public static C1524h0 n() {
        return (C1524h0) zza.h();
    }

    public static /* synthetic */ void s(C1529i0 c1529i0, String str) {
        c1529i0.zze |= 2;
        c1529i0.zzg = str;
    }

    public static void t(C1529i0 c1529i0, int i4, C1539k0 c1539k0) {
        N1 n12 = c1529i0.zzh;
        if (!((AbstractC1575t1) n12).f12028o) {
            c1529i0.zzh = I1.e(n12);
        }
        c1529i0.zzh.set(i4, c1539k0);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C1539k0.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i5 == 3) {
            return new C1529i0();
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
        return this.zzh.size();
    }

    public final int m() {
        return this.zzf;
    }

    public final C1539k0 o(int i4) {
        return (C1539k0) this.zzh.get(i4);
    }

    public final C1551n0 p() {
        C1551n0 c1551n0 = this.zzj;
        return c1551n0 == null ? C1551n0.l() : c1551n0;
    }

    public final String q() {
        return this.zzg;
    }

    public final N1 r() {
        return this.zzh;
    }

    public final boolean u() {
        return this.zzk;
    }

    public final boolean v() {
        return this.zzl;
    }

    public final boolean w() {
        return this.zzm;
    }

    public final boolean x() {
        return (this.zze & 8) != 0;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }

    public final boolean z() {
        return (this.zze & 64) != 0;
    }
}
