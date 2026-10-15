package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1519g0 extends I1 {
    private static final C1519g0 zza;
    private int zze;
    private int zzf;
    private N1 zzg;
    private N1 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C1519g0 c1519g0 = new C1519g0();
        zza = c1519g0;
        I1.g(C1519g0.class, c1519g0);
    }

    public C1519g0() {
        C1541k2 c1541k2 = C1541k2.f11959r;
        this.zzg = c1541k2;
        this.zzh = c1541k2;
    }

    public static void s(C1519g0 c1519g0, int i4, C1559p0 c1559p0) {
        N1 n12 = c1519g0.zzg;
        if (!((AbstractC1575t1) n12).f12028o) {
            c1519g0.zzg = I1.e(n12);
        }
        c1519g0.zzg.set(i4, c1559p0);
    }

    public static void t(C1519g0 c1519g0, int i4, C1529i0 c1529i0) {
        N1 n12 = c1519g0.zzh;
        if (!((AbstractC1575t1) n12).f12028o) {
            c1519g0.zzh = I1.e(n12);
        }
        c1519g0.zzh.set(i4, c1529i0);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C1559p0.class, "zzh", C1529i0.class, "zzi", "zzj"});
        }
        if (i5 == 3) {
            return new C1519g0();
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

    public final int m() {
        return this.zzh.size();
    }

    public final int n() {
        return this.zzg.size();
    }

    public final C1529i0 o(int i4) {
        return (C1529i0) this.zzh.get(i4);
    }

    public final C1559p0 p(int i4) {
        return (C1559p0) this.zzg.get(i4);
    }

    public final List q() {
        return this.zzh;
    }

    public final N1 r() {
        return this.zzg;
    }

    public final boolean u() {
        return (this.zze & 1) != 0;
    }
}
