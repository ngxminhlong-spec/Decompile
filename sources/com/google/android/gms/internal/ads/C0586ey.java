package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ey, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586ey extends Dz {
    private static final C0586ey zzb;
    private int zzd;
    private AbstractC0886lz zze = AbstractC0886lz.f9510p;

    static {
        C0586ey c0586ey = new C0586ey();
        zzb = c0586ey;
        Dz.o(C0586ey.class, c0586ey);
    }

    public static C0543dy w() {
        return (C0543dy) zzb.g();
    }

    public static C0586ey x(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (C0586ey) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        if (i5 == 3) {
            return new C0586ey();
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

    public final AbstractC0886lz y() {
        return this.zze;
    }
}
