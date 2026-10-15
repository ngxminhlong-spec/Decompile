package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501cy extends Dz {
    private static final C0501cy zzb;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.cy] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(C0501cy.class, dz);
    }

    public static C0416ay x() {
        return (C0416ay) zzb.g();
    }

    public static C0501cy y(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (C0501cy) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    public static /* synthetic */ void z(C0501cy c0501cy, int i4) {
        c0501cy.zzd = i4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
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
        return this.zzd;
    }

    public final int w() {
        return this.zze;
    }
}
