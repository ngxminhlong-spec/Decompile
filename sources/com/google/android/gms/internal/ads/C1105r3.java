package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.r3 */
/* loaded from: classes.dex */
public final class C1105r3 extends Dz {
    private static final C1105r3 zzb;
    private int zzd;
    private AbstractC0886lz zze;
    private AbstractC0886lz zzf;
    private AbstractC0886lz zzg;
    private AbstractC0886lz zzh;

    static {
        C1105r3 c1105r3 = new C1105r3();
        zzb = c1105r3;
        Dz.o(C1105r3.class, c1105r3);
    }

    public C1105r3() {
        C0800jz c0800jz = AbstractC0886lz.f9510p;
        this.zze = c0800jz;
        this.zzf = c0800jz;
        this.zzg = c0800jz;
        this.zzh = c0800jz;
    }

    public static /* synthetic */ void B(C1105r3 c1105r3, C0800jz c0800jz) {
        c1105r3.zzd |= 1;
        c1105r3.zze = c0800jz;
    }

    public static /* synthetic */ void C(C1105r3 c1105r3, C0800jz c0800jz) {
        c1105r3.zzd |= 2;
        c1105r3.zzf = c0800jz;
    }

    public static /* synthetic */ void D(C1105r3 c1105r3, C0800jz c0800jz) {
        c1105r3.zzd |= 4;
        c1105r3.zzg = c0800jz;
    }

    public static /* synthetic */ void E(C1105r3 c1105r3, C0800jz c0800jz) {
        c1105r3.zzd |= 8;
        c1105r3.zzh = c0800jz;
    }

    public static C1063q3 v() {
        return (C1063q3) zzb.g();
    }

    public static C1105r3 w(byte[] bArr, C1315vz c1315vz) {
        Dz u2 = Dz.u(zzb, bArr, bArr.length, c1315vz);
        Dz.t(u2);
        return (C1105r3) u2;
    }

    public final AbstractC0886lz A() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new C1105r3();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final AbstractC0886lz x() {
        return this.zze;
    }

    public final AbstractC0886lz y() {
        return this.zzf;
    }

    public final AbstractC0886lz z() {
        return this.zzh;
    }
}
