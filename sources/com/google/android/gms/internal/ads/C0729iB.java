package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.iB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729iB extends Dz {
    private static final C0729iB zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C0729iB c0729iB = new C0729iB();
        zzb = c0729iB;
        Dz.o(C0729iB.class, c0729iB);
    }

    public static C0686hB v() {
        return (C0686hB) zzb.g();
    }

    public static /* synthetic */ void w(C0729iB c0729iB, String str) {
        c0729iB.zzd |= 1;
        c0729iB.zze = str;
    }

    public static /* synthetic */ void x(C0729iB c0729iB, long j4) {
        c0729iB.zzd |= 2;
        c0729iB.zzf = j4;
    }

    public static /* synthetic */ void y(C0729iB c0729iB, boolean z4) {
        c0729iB.zzd |= 4;
        c0729iB.zzg = z4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C0557eB.d, "zzi", "zzj"});
        }
        if (i5 == 3) {
            return new C0729iB();
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
