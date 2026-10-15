package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479zr extends Dz {
    private static final Iz zzb = new C0347Uc(12, (byte) 0);
    private static final C1479zr zzd;
    private int zze;
    private Hz zzf = Ez.f4961r;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C1479zr c1479zr = new C1479zr();
        zzd = c1479zr;
        Dz.o(C1479zr.class, c1479zr);
    }

    public static C1436yr v() {
        return (C1436yr) zzd.g();
    }

    public static /* synthetic */ void w(C1479zr c1479zr, String str) {
        str.getClass();
        c1479zr.zze |= 1;
        c1479zr.zzg = str;
    }

    public static void x(C1479zr c1479zr) {
        List list = c1479zr.zzf;
        if (!((AbstractC0459bz) list).f8310o) {
            int size = list.size();
            int i4 = size == 0 ? 10 : size + size;
            Ez ez = (Ez) list;
            if (i4 < ez.f4963q) {
                throw new IllegalArgumentException();
            }
            c1479zr.zzf = new Ez(Arrays.copyOf(ez.f4962p, i4), ez.f4963q, true);
        }
        ((Ez) c1479zr.zzf).h(2);
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", C0464c3.f8335s, "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new C1479zr();
        }
        if (i5 == 4) {
            return new Cz(zzd);
        }
        if (i5 != 5) {
            return null;
        }
        return zzd;
    }
}
