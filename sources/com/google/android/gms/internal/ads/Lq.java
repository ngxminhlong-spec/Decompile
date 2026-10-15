package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Lq extends Dz {
    private static final Lq zzb;
    private Lz zzd = C0769jA.f9138r;

    static {
        Lq lq = new Lq();
        zzb = lq;
        Dz.o(Lq.class, lq);
    }

    public static Iq w() {
        return (Iq) zzb.g();
    }

    public static void x(Lq lq) {
        lq.zzd = C0769jA.f9138r;
    }

    public static void y(Lq lq, Kq kq) {
        Lz lz = lq.zzd;
        if (!((AbstractC0459bz) lz).f8310o) {
            lq.zzd = Dz.l(lz);
        }
        lq.zzd.add(kq);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", Kq.class});
        }
        if (i5 == 3) {
            return new Lq();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final int v() {
        return this.zzd.size();
    }
}
