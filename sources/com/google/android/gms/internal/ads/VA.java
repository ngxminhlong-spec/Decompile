package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class VA extends Dz {
    private static final VA zzb;
    private int zzd;
    private UA zze;
    private AbstractC0886lz zzg;
    private AbstractC0886lz zzh;
    private int zzi;
    private byte zzj = 2;
    private Lz zzf = C0769jA.f9138r;

    static {
        VA va = new VA();
        zzb = va;
        Dz.o(VA.class, va);
    }

    public VA() {
        C0800jz c0800jz = AbstractC0886lz.f9510p;
        this.zzg = c0800jz;
        this.zzh = c0800jz;
    }

    public static TA v() {
        return (TA) zzb.g();
    }

    public static void w(VA va, SA sa) {
        Lz lz = va.zzf;
        if (!((AbstractC0459bz) lz).f8310o) {
            va.zzf = Dz.l(lz);
        }
        va.zzf.add(sa);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", SA.class, "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new VA();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzj = dz == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
