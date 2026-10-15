package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.u5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1236u5 extends Dz {
    private static final C1236u5 zzb;
    private Lz zzd = C0769jA.f9138r;

    static {
        C1236u5 c1236u5 = new C1236u5();
        zzb = c1236u5;
        Dz.o(C1236u5.class, c1236u5);
    }

    public static C1022p5 v() {
        return (C1022p5) zzb.g();
    }

    public static void w(C1236u5 c1236u5, C0979o5 c0979o5) {
        Lz lz = c1236u5.zzd;
        if (!((AbstractC0459bz) lz).f8310o) {
            c1236u5.zzd = Dz.l(lz);
        }
        c1236u5.zzd.add(c0979o5);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C0979o5.class});
        }
        if (i5 == 3) {
            return new C1236u5();
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
