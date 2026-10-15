package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Kx extends Dz {
    private static final Kx zzb;
    private int zzd;
    private Mx zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.Kx] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(Kx.class, dz);
    }

    public static /* synthetic */ void A(Kx kx, int i4) {
        kx.zzf = i4;
    }

    public static Jx w() {
        return (Jx) zzb.g();
    }

    public static Kx x() {
        return zzb;
    }

    public static /* synthetic */ void z(Kx kx, Mx mx) {
        kx.zze = mx;
        kx.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
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

    public final Mx y() {
        Mx mx = this.zze;
        return mx == null ? Mx.x() : mx;
    }
}
