package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442yx extends Dz {
    private static final C1442yx zzb;
    private int zzd;
    private int zze;
    private AbstractC0886lz zzf = AbstractC0886lz.f9510p;
    private Cx zzg;

    static {
        C1442yx c1442yx = new C1442yx();
        zzb = c1442yx;
        Dz.o(C1442yx.class, c1442yx);
    }

    public static /* synthetic */ void C(C1442yx c1442yx, Cx cx) {
        cx.getClass();
        c1442yx.zzg = cx;
        c1442yx.zzd |= 1;
    }

    public static C1356wx w() {
        return (C1356wx) zzb.g();
    }

    public static C1442yx x(AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        return (C1442yx) Dz.k(zzb, abstractC0886lz, c1315vz);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new C1442yx();
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
        return this.zze;
    }

    public final Cx y() {
        Cx cx = this.zzg;
        return cx == null ? Cx.x() : cx;
    }

    public final AbstractC0886lz z() {
        return this.zzf;
    }
}
