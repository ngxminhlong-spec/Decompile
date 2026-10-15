package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1582v0 extends I1 {
    private static final C1582v0 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private N1 zzi;
    private N1 zzj;
    private N1 zzk;
    private String zzl;
    private boolean zzm;
    private N1 zzn;
    private N1 zzo;
    private String zzp;

    static {
        C1582v0 c1582v0 = new C1582v0();
        zza = c1582v0;
        I1.g(C1582v0.class, c1582v0);
    }

    public C1582v0() {
        C1541k2 c1541k2 = C1541k2.f11959r;
        this.zzi = c1541k2;
        this.zzj = c1541k2;
        this.zzk = c1541k2;
        this.zzl = "";
        this.zzn = c1541k2;
        this.zzo = c1541k2;
        this.zzp = "";
    }

    public static C1578u0 p() {
        return (C1578u0) zza.h();
    }

    public static C1582v0 q() {
        return zza;
    }

    public static void x(C1582v0 c1582v0, int i4, C1574t0 c1574t0) {
        N1 n12 = c1582v0.zzj;
        if (!((AbstractC1575t1) n12).f12028o) {
            c1582v0.zzj = I1.e(n12);
        }
        c1582v0.zzj.set(i4, c1574t0);
    }

    public static void y(C1582v0 c1582v0) {
        c1582v0.zzk = C1541k2.f11959r;
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C1590x0.class, "zzj", C1574t0.class, "zzk", C1519g0.class, "zzl", "zzm", "zzn", W0.class, "zzo", C1566r0.class, "zzp"});
        }
        if (i5 == 3) {
            return new C1582v0();
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
        return this.zzn.size();
    }

    public final int m() {
        return this.zzj.size();
    }

    public final long n() {
        return this.zzf;
    }

    public final C1574t0 o(int i4) {
        return (C1574t0) this.zzj.get(i4);
    }

    public final String r() {
        return this.zzg;
    }

    public final String s() {
        return this.zzp;
    }

    public final N1 t() {
        return this.zzk;
    }

    public final List u() {
        return this.zzo;
    }

    public final N1 v() {
        return this.zzn;
    }

    public final List w() {
        return this.zzi;
    }

    public final boolean z() {
        return this.zzm;
    }
}
