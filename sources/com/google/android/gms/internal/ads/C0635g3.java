package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635g3 extends Dz {
    private static final C0635g3 zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        C0635g3 c0635g3 = new C0635g3();
        zzb = c0635g3;
        Dz.o(C0635g3.class, c0635g3);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            C0464c3 c0464c3 = C0464c3.f8324h;
            return new C0812kA(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", c0464c3, "zzg", c0464c3});
        }
        if (i5 == 3) {
            return new C0635g3();
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
