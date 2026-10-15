package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629fy extends Dz {
    private static final C0629fy zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.fy] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(C0629fy.class, dz);
    }

    public static C0629fy v() {
        return zzb;
    }

    public static C0629fy w(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (C0629fy) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0000", null);
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
}
