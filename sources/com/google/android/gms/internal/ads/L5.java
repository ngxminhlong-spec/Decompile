package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L5 extends Dz {
    private static final L5 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.L5] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(L5.class, dz);
    }

    public static /* synthetic */ void B(L5 l5, int i4) {
        l5.zze = i4 - 1;
        l5.zzd |= 1;
    }

    public static /* synthetic */ void C(L5 l5, int i4) {
        l5.zzf = i4 - 1;
        l5.zzd |= 2;
    }

    public static K5 v() {
        return (K5) zzb.g();
    }

    public static L5 w() {
        return zzb;
    }

    public final int A() {
        int i4;
        int i5 = this.zze;
        if (i5 != 0) {
            i4 = 2;
            if (i5 != 1) {
                i4 = i5 != 2 ? 0 : 3;
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", C0464c3.f8332p, "zzf", C0464c3.f8331o});
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

    public final boolean x() {
        return (this.zzd & 2) != 0;
    }

    public final boolean y() {
        return (this.zzd & 1) != 0;
    }

    public final int z() {
        int i4;
        int i5 = this.zzf;
        if (i5 != 0) {
            i4 = 2;
            if (i5 != 1) {
                i4 = i5 != 2 ? i5 != 4 ? 0 : 5 : 3;
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }
}
