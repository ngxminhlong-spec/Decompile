package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643gB extends Dz {
    private static final C0643gB zzb;
    private int zzd;
    private int zze;
    private VA zzg;
    private XA zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private Hz zzj = Ez.f4961r;
    private String zzk = "";
    private Lz zzm = C0769jA.f9138r;

    static {
        C0643gB c0643gB = new C0643gB();
        zzb = c0643gB;
        Dz.o(C0643gB.class, c0643gB);
    }

    public static /* synthetic */ void A(C0643gB c0643gB, VA va) {
        c0643gB.zzg = va;
        c0643gB.zzd |= 4;
    }

    public static void B(C0643gB c0643gB, String str) {
        str.getClass();
        Lz lz = c0643gB.zzm;
        if (!((AbstractC0459bz) lz).f8310o) {
            c0643gB.zzm = Dz.l(lz);
        }
        c0643gB.zzm.add(str);
    }

    public static /* synthetic */ void C(C0643gB c0643gB, int i4) {
        c0643gB.zzl = i4 - 1;
        c0643gB.zzd |= 64;
    }

    public static C0600fB w() {
        return (C0600fB) zzb.g();
    }

    public static /* synthetic */ void y(C0643gB c0643gB, int i4) {
        c0643gB.zzd |= 1;
        c0643gB.zze = i4;
    }

    public static /* synthetic */ void z(C0643gB c0643gB, String str) {
        str.getClass();
        c0643gB.zzd |= 2;
        c0643gB.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C0557eB.c, "zzm"});
        }
        if (i5 == 3) {
            return new C0643gB();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzn = dz == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int v() {
        return this.zzm.size();
    }

    public final String x() {
        return this.zzf;
    }
}
