package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E0 extends I1 {
    private static final E0 zza;
    private int zze;
    private N1 zzf = C1541k2.f11959r;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        E0 e02 = new E0();
        zza = e02;
        I1.g(E0.class, e02);
    }

    public static /* synthetic */ void A(long j4, E0 e02) {
        e02.zze |= 4;
        e02.zzi = j4;
    }

    public static D0 p() {
        return (D0) zza.h();
    }

    public static /* synthetic */ void t(E0 e02, int i4, H0 h02) {
        e02.E();
        e02.zzf.set(i4, h02);
    }

    public static /* synthetic */ void u(E0 e02, H0 h02) {
        e02.E();
        e02.zzf.add(h02);
    }

    public static /* synthetic */ void v(E0 e02, Iterable iterable) {
        e02.E();
        AbstractC1571s1.a(iterable, e02.zzf);
    }

    public static void w(E0 e02) {
        e02.zzf = C1541k2.f11959r;
    }

    public static /* synthetic */ void x(E0 e02, int i4) {
        e02.E();
        e02.zzf.remove(i4);
    }

    public static /* synthetic */ void y(E0 e02, String str) {
        str.getClass();
        e02.zze |= 1;
        e02.zzg = str;
    }

    public static /* synthetic */ void z(long j4, E0 e02) {
        e02.zze |= 2;
        e02.zzh = j4;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final boolean C() {
        return (this.zze & 4) != 0;
    }

    public final boolean D() {
        return (this.zze & 2) != 0;
    }

    public final void E() {
        N1 n12 = this.zzf;
        if (((AbstractC1575t1) n12).f12028o) {
            return;
        }
        this.zzf = I1.e(n12);
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", H0.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i5 == 3) {
            return new E0();
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
        return this.zzj;
    }

    public final int m() {
        return this.zzf.size();
    }

    public final long n() {
        return this.zzi;
    }

    public final long o() {
        return this.zzh;
    }

    public final H0 q(int i4) {
        return (H0) this.zzf.get(i4);
    }

    public final String r() {
        return this.zzg;
    }

    public final N1 s() {
        return this.zzf;
    }
}
