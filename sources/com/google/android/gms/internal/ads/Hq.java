package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hq extends Dz {
    private static final Iz zzb = new C0347Uc(11, (byte) 0);
    private static final Hq zzd;
    private int zzA;
    private int zzB;
    private long zzC;
    private int zzD;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int zze;
    private int zzf;
    private long zzh;
    private long zzi;
    private long zzj;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private int zzw;
    private String zzg = "";
    private Hz zzk = Ez.f4961r;
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzx = "";
    private String zzy = "";
    private Kz zzz = Wz.f7580r;
    private String zzE = "";
    private String zzF = "";
    private String zzG = "";
    private String zzH = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";

    static {
        Hq hq = new Hq();
        zzd = hq;
        Dz.o(Hq.class, hq);
    }

    public static /* synthetic */ void A(Hq hq, long j4) {
        hq.zzn = j4;
    }

    public static /* synthetic */ void B(Hq hq, String str) {
        str.getClass();
        hq.zzr = str;
    }

    public static /* synthetic */ void C(Hq hq, String str) {
        str.getClass();
        hq.zzu = str;
    }

    public static /* synthetic */ void D(Hq hq) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        hq.zzv = str;
    }

    public static /* synthetic */ void E(Hq hq, int i4) {
        hq.zzw = i4;
    }

    public static void F(Hq hq, AbstractCollection abstractCollection) {
        List list = hq.zzz;
        if (!((AbstractC0459bz) list).f8310o) {
            int size = list.size();
            int i4 = size == 0 ? 10 : size + size;
            Wz wz = (Wz) list;
            if (i4 < wz.f7582q) {
                throw new IllegalArgumentException();
            }
            hq.zzz = new Wz(Arrays.copyOf(wz.f7581p, i4), wz.f7582q, true);
        }
        AbstractC0417az.d(abstractCollection, hq.zzz);
    }

    public static /* synthetic */ void G(Hq hq, int i4) {
        hq.zzB = i4;
    }

    public static /* synthetic */ void H(Hq hq, long j4) {
        hq.zzC = j4;
    }

    public static /* synthetic */ void I(Hq hq, String str) {
        str.getClass();
        hq.zzE = str;
    }

    public static /* synthetic */ void J(Hq hq, String str) {
        str.getClass();
        hq.zzF = str;
    }

    public static /* synthetic */ void K(Hq hq, String str) {
        str.getClass();
        hq.zzJ = str;
    }

    public static /* synthetic */ void L(Hq hq, String str) {
        hq.zzK = str;
    }

    public static /* synthetic */ void M(Hq hq, String str) {
        str.getClass();
        hq.zzL = str;
    }

    public static /* synthetic */ void N(Hq hq, String str) {
        str.getClass();
        hq.zzM = str;
    }

    public static /* synthetic */ void O(Hq hq, int i4) {
        hq.zze = i4 - 2;
    }

    public static /* synthetic */ void P(Hq hq) {
        hq.zzq = 1;
    }

    public static /* synthetic */ void Q(Hq hq, int i4) {
        if (i4 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        hq.zzA = i4 - 2;
    }

    public static /* synthetic */ void R(Hq hq, int i4) {
        if (i4 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        hq.zzD = i4 - 2;
    }

    public static Gq v() {
        return (Gq) zzd.g();
    }

    public static /* synthetic */ void w(Hq hq, String str) {
        hq.zzN = str;
    }

    public static /* synthetic */ void x(Hq hq, String str) {
        str.getClass();
        hq.zzO = str;
    }

    public static /* synthetic */ void y(Hq hq, boolean z4) {
        hq.zzl = z4;
    }

    public static /* synthetic */ void z(Hq hq, long j4) {
        hq.zzm = j4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzd, "\u0000(\u0000\u0000\u0001((\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f", new Object[]{"zze", "zzl", "zzm", "zzq", "zzr", "zzu", "zzv", "zzw", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzs", "zzt", "zzx", "zzy", "zzz", "zzG", "zzH", "zzI", "zzP", "zzg", "zzh", "zzi", "zzj", "zzn", "zzo", "zzp", "zzk", "zzQ", "zzR", "zzf"});
        }
        if (i5 == 3) {
            return new Hq();
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
