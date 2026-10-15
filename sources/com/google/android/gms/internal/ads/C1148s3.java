package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148s3 extends Dz {
    private static final C1148s3 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private AbstractC0886lz zzg = AbstractC0886lz.f9510p;

    static {
        C1148s3 c1148s3 = new C1148s3();
        zzb = c1148s3;
        Dz.o(C1148s3.class, c1148s3);
    }

    public static C1148s3 w() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new C1148s3();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final long v() {
        return this.zze;
    }

    public final boolean x() {
        return (this.zzd & 1) != 0;
    }
}
