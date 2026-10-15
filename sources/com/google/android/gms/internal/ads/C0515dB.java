package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515dB extends Dz {
    private static final C0515dB zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private AbstractC0886lz zzg;
    private AbstractC0886lz zzh;

    static {
        C0515dB c0515dB = new C0515dB();
        zzb = c0515dB;
        Dz.o(C0515dB.class, c0515dB);
    }

    public C0515dB() {
        C0800jz c0800jz = AbstractC0886lz.f9510p;
        this.zzg = c0800jz;
        this.zzh = c0800jz;
    }

    public static C0472cB v() {
        return (C0472cB) zzb.g();
    }

    public static /* synthetic */ void w(C0515dB c0515dB) {
        c0515dB.zzd |= 2;
        c0515dB.zzf = "image/png";
    }

    public static /* synthetic */ void x(C0515dB c0515dB, AbstractC0886lz abstractC0886lz) {
        abstractC0886lz.getClass();
        c0515dB.zzd |= 4;
        c0515dB.zzg = abstractC0886lz;
    }

    public static /* synthetic */ void y(C0515dB c0515dB) {
        c0515dB.zze = 1;
        c0515dB.zzd = 1 | c0515dB.zzd;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", C0464c3.f8319E, "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new C0515dB();
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
