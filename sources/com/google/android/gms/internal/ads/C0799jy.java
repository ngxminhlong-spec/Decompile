package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799jy extends Dz {
    private static final C0799jy zzb;
    private int zzd;
    private int zze;
    private C0971ny zzf;
    private AbstractC0886lz zzg = AbstractC0886lz.f9510p;

    static {
        C0799jy c0799jy = new C0799jy();
        zzb = c0799jy;
        Dz.o(C0799jy.class, c0799jy);
    }

    public static /* synthetic */ void C(C0799jy c0799jy, C0971ny c0971ny) {
        c0971ny.getClass();
        c0799jy.zzf = c0971ny;
        c0799jy.zzd |= 1;
    }

    public static C0756iy w() {
        return (C0756iy) zzb.g();
    }

    public static C0799jy x() {
        return zzb;
    }

    public static C0799jy y(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (C0799jy) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    public final AbstractC0886lz A() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new C0799jy();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final int v() {
        return this.zze;
    }

    public final C0971ny z() {
        C0971ny c0971ny = this.zzf;
        return c0971ny == null ? C0971ny.y() : c0971ny;
    }
}
