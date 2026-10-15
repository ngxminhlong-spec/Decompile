package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C0 extends I1 {
    private static final C0 zza;
    private int zze;
    private int zzf;
    private long zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.C0, com.google.android.gms.internal.measurement.I1] */
    static {
        ?? i12 = new I1();
        zza = i12;
        I1.g(C0.class, i12);
    }

    public static B0 n() {
        return (B0) zza.h();
    }

    public static /* synthetic */ void o(C0 c02, int i4) {
        c02.zze |= 1;
        c02.zzf = i4;
    }

    public static /* synthetic */ void p(C0 c02, long j4) {
        c02.zze |= 2;
        c02.zzg = j4;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

    public final long m() {
        return this.zzg;
    }

    public final boolean q() {
        return (this.zze & 2) != 0;
    }

    public final boolean r() {
        return (this.zze & 1) != 0;
    }
}
