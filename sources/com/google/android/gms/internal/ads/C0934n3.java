package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934n3 extends Dz {
    private static final C0934n3 zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        C0934n3 c0934n3 = new C0934n3();
        zzb = c0934n3;
        Dz.o(C0934n3.class, c0934n3);
    }

    public static /* synthetic */ void A(C0934n3 c0934n3, long j4) {
        c0934n3.zzd |= 32;
        c0934n3.zzj = j4;
    }

    public static C0891m3 v() {
        return (C0891m3) zzb.g();
    }

    public static /* synthetic */ void w(C0934n3 c0934n3, long j4) {
        c0934n3.zzd |= 1;
        c0934n3.zze = j4;
    }

    public static /* synthetic */ void x(C0934n3 c0934n3, long j4) {
        c0934n3.zzd |= 4;
        c0934n3.zzg = j4;
    }

    public static /* synthetic */ void y(C0934n3 c0934n3, long j4) {
        c0934n3.zzd |= 8;
        c0934n3.zzh = j4;
    }

    public static /* synthetic */ void z(C0934n3 c0934n3, long j4) {
        c0934n3.zzd |= 16;
        c0934n3.zzi = j4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i5 == 3) {
            return new C0934n3();
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
