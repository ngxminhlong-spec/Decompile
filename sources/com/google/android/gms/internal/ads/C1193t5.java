package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.t5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193t5 extends Dz {
    private static final C1193t5 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.t5] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(C1193t5.class, dz);
    }

    public static C1150s5 v() {
        return (C1150s5) zzb.g();
    }

    public static /* synthetic */ void w(C1193t5 c1193t5, boolean z4) {
        c1193t5.zzd |= 1;
        c1193t5.zze = z4;
    }

    public static /* synthetic */ void x(C1193t5 c1193t5, boolean z4) {
        c1193t5.zzd |= 2;
        c1193t5.zzf = z4;
    }

    public static /* synthetic */ void y(C1193t5 c1193t5, int i4) {
        c1193t5.zzd |= 4;
        c1193t5.zzg = i4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
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
