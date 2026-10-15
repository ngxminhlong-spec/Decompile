package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G5 extends Dz {
    private static final G5 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private Y5 zzi;
    private C5 zzk;
    private E5 zzl;
    private L5 zzm;
    private C0893m5 zzn;
    private R5 zzo;
    private C0808k6 zzp;
    private C1236u5 zzq;
    private String zzf = "";
    private int zzh = 1000;
    private Kz zzj = Wz.f7580r;

    static {
        G5 g5 = new G5();
        zzb = g5;
        Dz.o(G5.class, g5);
    }

    public static void A(G5 g5, ArrayList arrayList) {
        List list = g5.zzj;
        if (!((AbstractC0459bz) list).f8310o) {
            int size = list.size();
            int i4 = size == 0 ? 10 : size + size;
            Wz wz = (Wz) list;
            if (i4 < wz.f7582q) {
                throw new IllegalArgumentException();
            }
            g5.zzj = new Wz(Arrays.copyOf(wz.f7581p, i4), wz.f7582q, true);
        }
        AbstractC0417az.d(arrayList, g5.zzj);
    }

    public static void B(G5 g5) {
        g5.zzj = Wz.f7580r;
    }

    public static /* synthetic */ void C(G5 g5, C5 c5) {
        g5.zzk = c5;
        g5.zzd |= 32;
    }

    public static /* synthetic */ void D(G5 g5, C0893m5 c0893m5) {
        g5.zzn = c0893m5;
        g5.zzd |= 256;
    }

    public static /* synthetic */ void E(G5 g5, R5 r5) {
        g5.zzo = r5;
        g5.zzd |= 512;
    }

    public static /* synthetic */ void F(G5 g5, C0808k6 c0808k6) {
        g5.zzp = c0808k6;
        g5.zzd |= 1024;
    }

    public static /* synthetic */ void G(G5 g5, C1236u5 c1236u5) {
        g5.zzq = c1236u5;
        g5.zzd |= 2048;
    }

    public static F5 x() {
        return (F5) zzb.g();
    }

    public static /* synthetic */ void z(G5 g5, String str) {
        str.getClass();
        g5.zzd |= 2;
        g5.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C0464c3.f8330n, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i5 == 3) {
            return new G5();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final C0893m5 v() {
        C0893m5 c0893m5 = this.zzn;
        return c0893m5 == null ? C0893m5.v() : c0893m5;
    }

    public final C5 w() {
        C5 c5 = this.zzk;
        return c5 == null ? C5.v() : c5;
    }

    public final String y() {
        return this.zzf;
    }
}
