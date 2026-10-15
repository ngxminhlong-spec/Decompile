package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class R0 extends I1 {
    private static final R0 zza;
    private int zze;
    private int zzf;
    private M1 zzg = Y1.f11853r;

    static {
        R0 r02 = new R0();
        zza = r02;
        I1.g(R0.class, r02);
    }

    public static Q0 o() {
        return (Q0) zza.h();
    }

    public static /* synthetic */ void q(R0 r02, int i4) {
        r02.zze |= 1;
        r02.zzf = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(R0 r02, List list) {
        M1 m12 = r02.zzg;
        if (!((AbstractC1575t1) m12).f12028o) {
            r02.zzg = I1.d(m12);
        }
        AbstractC1571s1.a(list, r02.zzg);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new R0();
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
        return this.zzg.size();
    }

    public final int m() {
        return this.zzf;
    }

    public final long n(int i4) {
        Y1 y12 = (Y1) this.zzg;
        y12.i(i4);
        return y12.f11854p[i4];
    }

    public final List p() {
        return this.zzg;
    }

    public final boolean s() {
        return (this.zze & 1) != 0;
    }
}
