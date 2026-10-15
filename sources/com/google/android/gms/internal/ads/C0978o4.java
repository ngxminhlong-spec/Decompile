package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978o4 extends Dz {
    private static final C0978o4 zzb;
    private int zzd;
    private C1064q4 zze;
    private AbstractC0886lz zzf;
    private AbstractC0886lz zzg;

    static {
        C0978o4 c0978o4 = new C0978o4();
        zzb = c0978o4;
        Dz.o(C0978o4.class, c0978o4);
    }

    public C0978o4() {
        C0800jz c0800jz = AbstractC0886lz.f9510p;
        this.zzf = c0800jz;
        this.zzg = c0800jz;
    }

    public static C0978o4 v(C0800jz c0800jz, C1315vz c1315vz) {
        return (C0978o4) Dz.k(zzb, c0800jz, c1315vz);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new C0978o4();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final C1064q4 w() {
        C1064q4 c1064q4 = this.zze;
        return c1064q4 == null ? C1064q4.z() : c1064q4;
    }

    public final AbstractC0886lz x() {
        return this.zzg;
    }

    public final AbstractC0886lz y() {
        return this.zzf;
    }
}
