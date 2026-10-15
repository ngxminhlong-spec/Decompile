package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1314vy extends Dz {
    private static final C1314vy zzb;
    private int zzd;
    private C1057py zze;
    private int zzf;
    private int zzg;
    private int zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.vy] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(C1314vy.class, dz);
    }

    public static void E(C1314vy c1314vy, int i4) {
        if (i4 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c1314vy.zzf = i4 - 2;
    }

    public static C1271uy x() {
        return (C1271uy) zzb.g();
    }

    public static /* synthetic */ void z(C1314vy c1314vy, C1057py c1057py) {
        c1314vy.zze = c1057py;
        c1314vy.zzd |= 1;
    }

    public final boolean C() {
        return (this.zzd & 1) != 0;
    }

    public final int D() {
        int i4 = this.zzf;
        int i5 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new Dz();
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
        return this.zzg;
    }

    public final C1057py w() {
        C1057py c1057py = this.zze;
        return c1057py == null ? C1057py.x() : c1057py;
    }

    public final Jy y() {
        Jy b4 = Jy.b(this.zzh);
        return b4 == null ? Jy.f5947u : b4;
    }
}
