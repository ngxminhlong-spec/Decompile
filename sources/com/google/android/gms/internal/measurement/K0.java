package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K0 extends I1 {
    private static final K0 zza;
    private N1 zze = C1541k2.f11959r;

    static {
        K0 k02 = new K0();
        zza = k02;
        I1.g(K0.class, k02);
    }

    public static J0 l() {
        return (J0) zza.h();
    }

    public static void o(K0 k02, M0 m02) {
        N1 n12 = k02.zze;
        if (!((AbstractC1575t1) n12).f12028o) {
            k02.zze = I1.e(n12);
        }
        k02.zze.add(m02);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", M0.class});
        }
        if (i5 == 3) {
            return new K0();
        }
        if (i5 == 4) {
            return new H1(zza);
        }
        if (i5 != 5) {
            return null;
        }
        return zza;
    }

    public final M0 m() {
        return (M0) this.zze.get(0);
    }

    public final N1 n() {
        return this.zze;
    }
}
