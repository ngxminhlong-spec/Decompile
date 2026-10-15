package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P0 extends I1 {
    private static final P0 zza;
    private M1 zze;
    private M1 zzf;
    private N1 zzg;
    private N1 zzh;

    static {
        P0 p02 = new P0();
        zza = p02;
        I1.g(P0.class, p02);
    }

    public P0() {
        Y1 y12 = Y1.f11853r;
        this.zze = y12;
        this.zzf = y12;
        C1541k2 c1541k2 = C1541k2.f11959r;
        this.zzg = c1541k2;
        this.zzh = c1541k2;
    }

    public static void A(P0 p02) {
        p02.zzf = Y1.f11853r;
    }

    public static void B(P0 p02, ArrayList arrayList) {
        N1 n12 = p02.zzg;
        if (!((AbstractC1575t1) n12).f12028o) {
            p02.zzg = I1.e(n12);
        }
        AbstractC1571s1.a(arrayList, p02.zzg);
    }

    public static void C(P0 p02) {
        p02.zzg = C1541k2.f11959r;
    }

    public static void D(P0 p02, int i4) {
        N1 n12 = p02.zzg;
        if (!((AbstractC1575t1) n12).f12028o) {
            p02.zzg = I1.e(n12);
        }
        p02.zzg.remove(i4);
    }

    public static void E(P0 p02, Iterable iterable) {
        N1 n12 = p02.zzh;
        if (!((AbstractC1575t1) n12).f12028o) {
            p02.zzh = I1.e(n12);
        }
        AbstractC1571s1.a(iterable, p02.zzh);
    }

    public static void F(P0 p02) {
        p02.zzh = C1541k2.f11959r;
    }

    public static void G(P0 p02, int i4) {
        N1 n12 = p02.zzh;
        if (!((AbstractC1575t1) n12).f12028o) {
            p02.zzh = I1.e(n12);
        }
        p02.zzh.remove(i4);
    }

    public static O0 q() {
        return (O0) zza.h();
    }

    public static P0 r() {
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void x(P0 p02, Iterable iterable) {
        M1 m12 = p02.zze;
        if (!((AbstractC1575t1) m12).f12028o) {
            p02.zze = I1.d(m12);
        }
        AbstractC1571s1.a(iterable, p02.zze);
    }

    public static void y(P0 p02) {
        p02.zze = Y1.f11853r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void z(P0 p02, List list) {
        M1 m12 = p02.zzf;
        if (!((AbstractC1575t1) m12).f12028o) {
            p02.zzf = I1.d(m12);
        }
        AbstractC1571s1.a(list, p02.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C0.class, "zzh", R0.class});
        }
        if (i5 == 3) {
            return new P0();
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
        return this.zzf.size();
    }

    public final int n() {
        return this.zzh.size();
    }

    public final int o() {
        return this.zze.size();
    }

    public final C0 p(int i4) {
        return (C0) this.zzg.get(i4);
    }

    public final R0 s(int i4) {
        return (R0) this.zzh.get(i4);
    }

    public final N1 t() {
        return this.zzg;
    }

    public final List u() {
        return this.zzf;
    }

    public final N1 v() {
        return this.zzh;
    }

    public final List w() {
        return this.zze;
    }
}
