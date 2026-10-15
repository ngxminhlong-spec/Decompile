package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ax extends Dz {
    private static final Ax zzb;
    private int zzd;
    private int zze;
    private Cx zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Ax, com.google.android.gms.internal.ads.Dz] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(Ax.class, dz);
    }

    public static /* synthetic */ void A(Ax ax, Cx cx) {
        ax.zzf = cx;
        ax.zzd |= 1;
    }

    public static C1485zx w() {
        return (C1485zx) zzb.g();
    }

    public static Ax x(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (Ax) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    public static /* synthetic */ void z(Ax ax, int i4) {
        ax.zze = i4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
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
        return this.zze;
    }

    public final Cx y() {
        Cx cx = this.zzf;
        return cx == null ? Cx.x() : cx;
    }
}
