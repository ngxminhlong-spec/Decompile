package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.o5 */
/* loaded from: classes.dex */
public final class C0979o5 extends Dz {
    private static final C0979o5 zzb;
    private int zzd;
    private int zze;
    private C1107r5 zzf;
    private C1193t5 zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.o5] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(C0979o5.class, dz);
    }

    public static C0936n5 v() {
        return (C0936n5) zzb.g();
    }

    public static /* synthetic */ void w(C0979o5 c0979o5, C1107r5 c1107r5) {
        c1107r5.getClass();
        c0979o5.zzf = c1107r5;
        c0979o5.zzd |= 2;
    }

    public static /* synthetic */ void x(C0979o5 c0979o5, C1193t5 c1193t5) {
        c0979o5.zzg = c1193t5;
        c0979o5.zzd |= 4;
    }

    public static /* synthetic */ void y(C0979o5 c0979o5) {
        c0979o5.zze = 1;
        c0979o5.zzd = 1 | c0979o5.zzd;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", C0464c3.f8327k, "zzf", "zzg"});
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
