package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ny, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971ny extends Dz {
    private static final C0971ny zzb;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.ny] */
    static {
        ?? dz = new Dz();
        zzb = dz;
        Dz.o(C0971ny.class, dz);
    }

    public static /* synthetic */ void A(C0971ny c0971ny, int i4) {
        c0971ny.zze = i4;
    }

    public static C0928my x() {
        return (C0928my) zzb.g();
    }

    public static C0971ny y() {
        return zzb;
    }

    public static void z(C0971ny c0971ny, EnumC0672gy enumC0672gy) {
        if (enumC0672gy == EnumC0672gy.f8893v) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c0971ny.zzd = enumC0672gy.f8895o;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
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

    public final int v() {
        return this.zze;
    }

    public final EnumC0672gy w() {
        int i4 = this.zzd;
        EnumC0672gy enumC0672gy = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? null : EnumC0672gy.f8892u : EnumC0672gy.f8891t : EnumC0672gy.f8890s : EnumC0672gy.f8889r : EnumC0672gy.f8888q : EnumC0672gy.f8887p;
        return enumC0672gy == null ? EnumC0672gy.f8893v : enumC0672gy;
    }
}
