package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ry, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142ry extends Dz {
    private static final C1142ry zzb;
    private String zzd = "";
    private AbstractC0886lz zze = AbstractC0886lz.f9510p;
    private int zzf;

    static {
        C1142ry c1142ry = new C1142ry();
        zzb = c1142ry;
        Dz.o(C1142ry.class, c1142ry);
    }

    public static /* synthetic */ void B(C1142ry c1142ry, String str) {
        str.getClass();
        c1142ry.zzd = str;
    }

    public static /* synthetic */ void C(C1142ry c1142ry, AbstractC0886lz abstractC0886lz) {
        abstractC0886lz.getClass();
        c1142ry.zze = abstractC0886lz;
    }

    public static C1100qy v() {
        return (C1100qy) zzb.g();
    }

    public static C1142ry w() {
        return zzb;
    }

    public static C1142ry x(byte[] bArr, C1315vz c1315vz) {
        Dz u2 = Dz.u(zzb, bArr, bArr.length, c1315vz);
        Dz.t(u2);
        return (C1142ry) u2;
    }

    public final String A() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new C1142ry();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final Jy y() {
        Jy b4 = Jy.b(this.zzf);
        return b4 == null ? Jy.f5947u : b4;
    }

    public final AbstractC0886lz z() {
        return this.zze;
    }
}
