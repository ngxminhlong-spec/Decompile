package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770jB extends Dz {
    private static final C0770jB zzb;
    private int zzd;
    private String zze = "";
    private AbstractC0886lz zzf = AbstractC0886lz.f9510p;

    static {
        C0770jB c0770jB = new C0770jB();
        zzb = c0770jB;
        Dz.o(C0770jB.class, c0770jB);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new C0770jB();
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
