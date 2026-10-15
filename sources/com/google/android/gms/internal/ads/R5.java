package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class R5 extends Dz {
    private static final R5 zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private Lz zze = C0769jA.f9138r;
    private String zzi = "";
    private String zzj = "";

    static {
        R5 r5 = new R5();
        zzb = r5;
        Dz.o(R5.class, r5);
    }

    public static /* synthetic */ void A(R5 r5, String str) {
        str.getClass();
        r5.zzd |= 8;
        r5.zzi = str;
    }

    public static /* synthetic */ void B(R5 r5) {
        String str = Build.MODEL;
        str.getClass();
        r5.zzd |= 16;
        r5.zzj = str;
    }

    public static /* synthetic */ void C(R5 r5, long j4) {
        r5.zzd |= 32;
        r5.zzk = j4;
    }

    public static /* synthetic */ void D(R5 r5, int i4) {
        r5.zzd |= 64;
        r5.zzl = i4;
    }

    public static P5 v() {
        return (P5) zzb.g();
    }

    public static void w(R5 r5, ArrayList arrayList) {
        Lz lz = r5.zze;
        if (!((AbstractC0459bz) lz).f8310o) {
            r5.zze = Dz.l(lz);
        }
        AbstractC0417az.d(arrayList, r5.zze);
    }

    public static /* synthetic */ void x(R5 r5, int i4) {
        r5.zzd |= 1;
        r5.zzf = i4;
    }

    public static /* synthetic */ void y(R5 r5, int i4) {
        r5.zzd |= 2;
        r5.zzg = i4;
    }

    public static /* synthetic */ void z(R5 r5, long j4) {
        r5.zzd |= 4;
        r5.zzh = j4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", O5.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i5 == 3) {
            return new R5();
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
