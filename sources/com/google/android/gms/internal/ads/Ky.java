package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ky extends Dz {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6081a = 0;
    private static final Ky zzb;
    private String zzd = "";
    private Lz zze = C0769jA.f9138r;

    static {
        Ky ky = new Ky();
        zzb = ky;
        Dz.o(Ky.class, ky);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", C1185sy.class});
        }
        if (i5 == 3) {
            return new Ky();
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
