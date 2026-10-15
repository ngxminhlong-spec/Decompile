package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ly, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885ly extends Dz {
    private static final C0885ly zzb;
    private int zzd;
    private C0971ny zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.ly] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(C0885ly.class, dz);
    }

    public static /* synthetic */ void B(C0885ly c0885ly, C0971ny c0971ny) {
        c0885ly.zze = c0971ny;
        c0885ly.zzd |= 1;
    }

    public static /* synthetic */ void C(C0885ly c0885ly, int i4) {
        c0885ly.zzf = i4;
    }

    public static C0842ky x() {
        return (C0842ky) zzb.g();
    }

    public static C0885ly y() {
        return zzb;
    }

    public static C0885ly z(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (C0885ly) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    public final C0971ny A() {
        C0971ny c0971ny = this.zze;
        return c0971ny == null ? C0971ny.y() : c0971ny;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
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
        return this.zzf;
    }

    public final int w() {
        return this.zzg;
    }
}
