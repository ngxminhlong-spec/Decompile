package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U0 extends I1 {
    private static final U0 zza;
    private N1 zze = C1541k2.f11959r;

    static {
        U0 u02 = new U0();
        zza = u02;
        I1.g(U0.class, u02);
    }

    public static U0 m() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", V0.class});
        }
        if (i5 == 3) {
            return new U0();
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
        return this.zze.size();
    }

    public final N1 n() {
        return this.zze;
    }
}
