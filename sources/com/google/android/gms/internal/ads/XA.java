package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class XA extends Dz {
    private static final XA zzb;
    private int zzd;
    private WA zze;
    private AbstractC0886lz zzg;
    private AbstractC0886lz zzh;
    private int zzi;
    private AbstractC0886lz zzj;
    private byte zzk = 2;
    private Lz zzf = C0769jA.f9138r;

    static {
        XA xa = new XA();
        zzb = xa;
        Dz.o(XA.class, xa);
    }

    public XA() {
        C0800jz c0800jz = AbstractC0886lz.f9510p;
        this.zzg = c0800jz;
        this.zzh = c0800jz;
        this.zzj = c0800jz;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", SA.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i5 == 3) {
            return new XA();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzk = dz == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
