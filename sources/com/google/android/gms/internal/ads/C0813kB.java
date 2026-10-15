package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813kB extends Dz {
    private static final C0813kB zzb;
    private Lz zzA;
    private OA zzB;
    private String zzC;
    private JA zzD;
    private Lz zzE;
    private ZA zzF;
    private int zzG;
    private Lz zzH;
    private Lz zzI;
    private long zzJ;
    private int zzd;
    private int zze;
    private int zzf;
    private MA zzj;
    private Lz zzk;
    private Lz zzl;
    private String zzm;
    private C0515dB zzn;
    private boolean zzo;
    private Lz zzp;
    private String zzq;
    private boolean zzr;
    private boolean zzs;
    private AbstractC0886lz zzt;
    private C0729iB zzu;
    private boolean zzv;
    private String zzw;
    private Lz zzx;
    private Lz zzy;
    private C0770jB zzz;
    private byte zzK = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C0813kB c0813kB = new C0813kB();
        zzb = c0813kB;
        Dz.o(C0813kB.class, c0813kB);
    }

    public C0813kB() {
        C0769jA c0769jA = C0769jA.f9138r;
        this.zzk = c0769jA;
        this.zzl = c0769jA;
        this.zzm = "";
        this.zzp = c0769jA;
        this.zzq = "";
        this.zzt = AbstractC0886lz.f9510p;
        this.zzw = "";
        this.zzx = c0769jA;
        this.zzy = c0769jA;
        this.zzA = c0769jA;
        this.zzC = "";
        this.zzE = c0769jA;
        this.zzH = c0769jA;
        this.zzI = c0769jA;
    }

    public static /* synthetic */ void A(C0813kB c0813kB, String str) {
        str.getClass();
        c0813kB.zzd |= 8;
        c0813kB.zzh = str;
    }

    public static /* synthetic */ void B(C0813kB c0813kB, MA ma) {
        c0813kB.zzj = ma;
        c0813kB.zzd |= 32;
    }

    public static void C(C0813kB c0813kB, C0643gB c0643gB) {
        Lz lz = c0813kB.zzk;
        if (!((AbstractC0459bz) lz).f8310o) {
            c0813kB.zzk = Dz.l(lz);
        }
        c0813kB.zzk.add(c0643gB);
    }

    public static /* synthetic */ void D(C0813kB c0813kB, String str) {
        c0813kB.zzd |= 64;
        c0813kB.zzm = str;
    }

    public static /* synthetic */ void E(C0813kB c0813kB) {
        c0813kB.zzd &= -65;
        c0813kB.zzm = zzb.zzm;
    }

    public static /* synthetic */ void F(C0813kB c0813kB, C0515dB c0515dB) {
        c0813kB.zzn = c0515dB;
        c0813kB.zzd |= 128;
    }

    public static /* synthetic */ void G(C0813kB c0813kB, C0729iB c0729iB) {
        c0813kB.zzu = c0729iB;
        c0813kB.zzd |= 8192;
    }

    public static void H(C0813kB c0813kB, ArrayList arrayList) {
        Lz lz = c0813kB.zzx;
        if (!((AbstractC0459bz) lz).f8310o) {
            c0813kB.zzx = Dz.l(lz);
        }
        AbstractC0417az.d(arrayList, c0813kB.zzx);
    }

    public static void I(C0813kB c0813kB, ArrayList arrayList) {
        Lz lz = c0813kB.zzy;
        if (!((AbstractC0459bz) lz).f8310o) {
            c0813kB.zzy = Dz.l(lz);
        }
        AbstractC0417az.d(arrayList, c0813kB.zzy);
    }

    public static /* synthetic */ void J(C0813kB c0813kB, int i4) {
        c0813kB.zze = i4 - 1;
        c0813kB.zzd |= 1;
    }

    public static KA v() {
        return (KA) zzb.g();
    }

    public static /* synthetic */ void z(C0813kB c0813kB, String str) {
        str.getClass();
        c0813kB.zzd |= 4;
        c0813kB.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzK);
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001 \u0000\u0001\u0001  \u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", C0643gB.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", C0557eB.f8585b, "zzf", C0464c3.y, "zzj", "zzm", "zzn", "zzt", "zzl", C0899mB.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", C0985oB.class, "zzB", "zzC", "zzD", "zzE", QA.class, "zzF", "zzG", C0557eB.f8586e, "zzH", C0387aB.class, "zzI", C0430bB.class, "zzJ"});
        }
        if (i5 == 3) {
            return new C0813kB();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzK = dz == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String w() {
        return this.zzm;
    }

    public final String x() {
        return this.zzg;
    }

    public final Lz y() {
        return this.zzk;
    }
}
