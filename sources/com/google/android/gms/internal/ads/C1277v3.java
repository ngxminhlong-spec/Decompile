package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1277v3 extends Dz {
    private static final C1277v3 zzb;
    private int zzd;
    private Lz zze = C0769jA.f9138r;
    private AbstractC0886lz zzf = AbstractC0886lz.f9510p;
    private int zzg = 1;
    private int zzh = 1;

    static {
        C1277v3 c1277v3 = new C1277v3();
        zzb = c1277v3;
        Dz.o(C1277v3.class, c1277v3);
    }

    public static C1234u3 v() {
        return (C1234u3) zzb.g();
    }

    public static void w(C1277v3 c1277v3, C0800jz c0800jz) {
        Lz lz = c1277v3.zze;
        if (!((AbstractC0459bz) lz).f8310o) {
            c1277v3.zze = Dz.l(lz);
        }
        c1277v3.zze.add(c0800jz);
    }

    public static /* synthetic */ void x(C1277v3 c1277v3, C0800jz c0800jz) {
        c1277v3.zzd |= 1;
        c1277v3.zzf = c0800jz;
    }

    public static /* synthetic */ void y(C1277v3 c1277v3) {
        c1277v3.zzh = 4;
        c1277v3.zzd = 4 | c1277v3.zzd;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", C0464c3.f8325i, "zzh", C0464c3.f8323g});
        }
        if (i5 == 3) {
            return new C1277v3();
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
