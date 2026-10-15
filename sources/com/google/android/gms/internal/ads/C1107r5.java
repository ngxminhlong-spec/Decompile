package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1107r5 extends Dz {
    private static final C1107r5 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.r5] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(C1107r5.class, dz);
    }

    public static C1065q5 v() {
        return (C1065q5) zzb.g();
    }

    public static C1107r5 w() {
        return zzb;
    }

    public static /* synthetic */ void x(C1107r5 c1107r5, boolean z4) {
        c1107r5.zzd |= 1;
        c1107r5.zze = z4;
    }

    public static /* synthetic */ void y(C1107r5 c1107r5, int i4) {
        c1107r5.zzd |= 2;
        c1107r5.zzf = i4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
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
