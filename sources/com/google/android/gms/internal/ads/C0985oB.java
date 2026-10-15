package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.oB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985oB extends Dz {
    private static final C0985oB zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg = 4;
    private Lz zzh;
    private String zzi;
    private String zzj;
    private boolean zzk;
    private double zzl;
    private Lz zzm;
    private int zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;

    static {
        C0985oB c0985oB = new C0985oB();
        zzb = c0985oB;
        Dz.o(C0985oB.class, c0985oB);
    }

    public C0985oB() {
        C0769jA c0769jA = C0769jA.f9138r;
        this.zzh = c0769jA;
        this.zzi = "";
        this.zzj = "";
        this.zzm = c0769jA;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzd", "zze", "zzg", C0557eB.f8588g, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", C0942nB.class, "zzf", "zzn", C0557eB.f8587f, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i5 == 3) {
            return new C0985oB();
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
