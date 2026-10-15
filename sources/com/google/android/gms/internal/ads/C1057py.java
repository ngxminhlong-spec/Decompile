package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.py, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057py extends Dz {
    private static final C1057py zzb;
    private String zzd = "";
    private AbstractC0886lz zze = AbstractC0886lz.f9510p;
    private int zzf;

    static {
        C1057py c1057py = new C1057py();
        zzb = c1057py;
        Dz.o(C1057py.class, c1057py);
    }

    public static /* synthetic */ void A(C1057py c1057py, String str) {
        str.getClass();
        c1057py.zzd = str;
    }

    public static /* synthetic */ void B(C1057py c1057py, AbstractC0886lz abstractC0886lz) {
        abstractC0886lz.getClass();
        c1057py.zze = abstractC0886lz;
    }

    public static void C(C1057py c1057py, int i4) {
        int i5;
        if (i4 == 6) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        switch (i4) {
            case 1:
                i5 = 0;
                break;
            case 2:
                i5 = 1;
                break;
            case 3:
                i5 = 2;
                break;
            case 4:
                i5 = 3;
                break;
            case 5:
                i5 = 4;
                break;
            case 6:
                i5 = -1;
                break;
            default:
                throw null;
        }
        c1057py.zzf = i5;
    }

    public static C1014oy v() {
        return (C1014oy) zzb.g();
    }

    public static C1057py x() {
        return zzb;
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
            return new C1057py();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final int w() {
        int i4 = this.zzf;
        int i5 = 1;
        if (i4 != 0) {
            int i6 = 2;
            if (i4 != 1) {
                i5 = 3;
                if (i4 != 2) {
                    i6 = 4;
                    if (i4 != 3) {
                        i5 = i4 != 4 ? 0 : 5;
                    }
                }
            }
            i5 = i6;
        }
        if (i5 == 0) {
            return 6;
        }
        return i5;
    }

    public final AbstractC0886lz y() {
        return this.zze;
    }

    public final String z() {
        return this.zzd;
    }
}
