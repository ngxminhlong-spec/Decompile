package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.d3 */
/* loaded from: classes.dex */
public final class C0507d3 extends Dz {
    private static final C0507d3 zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private Lz zzp = C0769jA.f9138r;

    static {
        C0507d3 c0507d3 = new C0507d3();
        zzb = c0507d3;
        Dz.o(C0507d3.class, c0507d3);
    }

    public static /* synthetic */ void A(C0507d3 c0507d3, String str) {
        c0507d3.zzd |= 1024;
        c0507d3.zzo = str;
    }

    public static /* synthetic */ void B(C0507d3 c0507d3, String str) {
        str.getClass();
        c0507d3.zzd |= 1;
        c0507d3.zze = str;
    }

    public static /* synthetic */ void C(C0507d3 c0507d3, int i4) {
        c0507d3.zzq = i4 - 1;
        c0507d3.zzd |= 2048;
    }

    public static Z2 v() {
        return (Z2) zzb.g();
    }

    public static /* synthetic */ void w(C0507d3 c0507d3, long j4) {
        c0507d3.zzd |= 2;
        c0507d3.zzf = j4;
    }

    public static /* synthetic */ void x(C0507d3 c0507d3, String str) {
        str.getClass();
        c0507d3.zzd |= 4;
        c0507d3.zzg = str;
    }

    public static /* synthetic */ void y(C0507d3 c0507d3, String str) {
        c0507d3.zzd |= 8;
        c0507d3.zzh = str;
    }

    public static /* synthetic */ void z(C0507d3 c0507d3, String str) {
        c0507d3.zzd |= 16;
        c0507d3.zzi = str;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", C0422b3.class, "zzq", C0464c3.f8320b});
        }
        if (i5 == 3) {
            return new C0507d3();
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
