package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893m5 extends Dz {
    private static final C0893m5 zzb;
    private int zzd;
    private int zze;
    private int zzf = 1000;
    private C1365x5 zzg;
    private C1451z5 zzh;
    private Lz zzi;
    private A5 zzj;
    private S5 zzk;
    private M5 zzl;
    private I5 zzm;
    private J5 zzn;
    private Lz zzo;

    static {
        C0893m5 c0893m5 = new C0893m5();
        zzb = c0893m5;
        Dz.o(C0893m5.class, c0893m5);
    }

    public C0893m5() {
        C0769jA c0769jA = C0769jA.f9138r;
        this.zzi = c0769jA;
        this.zzo = c0769jA;
    }

    public static C0893m5 v() {
        return zzb;
    }

    public static void x(C0893m5 c0893m5, EnumC0807k5 enumC0807k5) {
        c0893m5.zze = enumC0807k5.f9273o;
        c0893m5.zzd |= 1;
    }

    public static /* synthetic */ void y(C0893m5 c0893m5, C1451z5 c1451z5) {
        c0893m5.zzh = c1451z5;
        c0893m5.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", C0464c3.f8326j, "zzf", C0464c3.f8330n, "zzg", "zzh", "zzi", C1322w5.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", Z5.class});
        }
        if (i5 == 3) {
            return new C0893m5();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final C1451z5 w() {
        C1451z5 c1451z5 = this.zzh;
        return c1451z5 == null ? C1451z5.v() : c1451z5;
    }
}
