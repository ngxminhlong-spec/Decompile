package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ix extends Dz {
    private static final Ix zzb;
    private int zzd;
    private int zze;
    private Mx zzf;
    private AbstractC0886lz zzg = AbstractC0886lz.f9510p;

    static {
        Ix ix = new Ix();
        zzb = ix;
        Dz.o(Ix.class, ix);
    }

    public static /* synthetic */ void B(Ix ix, Mx mx) {
        mx.getClass();
        ix.zzf = mx;
        ix.zzd |= 1;
    }

    public static Hx w() {
        return (Hx) zzb.g();
    }

    public static Ix x() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new Ix();
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

    public final Mx y() {
        Mx mx = this.zzf;
        return mx == null ? Mx.x() : mx;
    }

    public final AbstractC0886lz z() {
        return this.zzg;
    }
}
