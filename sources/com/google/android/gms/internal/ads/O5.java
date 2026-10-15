package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class O5 extends Dz {
    private static final Iz zzb = new C1016p(6);
    private static final O5 zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private Hz zzj = Ez.f4961r;
    private L5 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        O5 o5 = new O5();
        zzd = o5;
        Dz.o(O5.class, o5);
    }

    public static N5 D() {
        return (N5) zzd.g();
    }

    public static O5 E(byte[] bArr) {
        Dz u2 = Dz.u(zzd, bArr, bArr.length, C1315vz.f11096b);
        Dz.t(u2);
        return (O5) u2;
    }

    public static /* synthetic */ void H(O5 o5, long j4) {
        o5.zze |= 1;
        o5.zzf = j4;
    }

    public static /* synthetic */ void I(O5 o5, long j4) {
        o5.zze |= 4;
        o5.zzh = j4;
    }

    public static /* synthetic */ void J(O5 o5, long j4) {
        o5.zze |= 8;
        o5.zzi = j4;
    }

    public static void K(O5 o5, ArrayList arrayList) {
        List list = o5.zzj;
        if (!((AbstractC0459bz) list).f8310o) {
            int size = list.size();
            int i4 = size == 0 ? 10 : size + size;
            Ez ez = (Ez) list;
            if (i4 < ez.f4963q) {
                throw new IllegalArgumentException();
            }
            o5.zzj = new Ez(Arrays.copyOf(ez.f4962p, i4), ez.f4963q, true);
        }
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList.get(i5);
            i5++;
            ((Ez) o5.zzj).h(((EnumC1279v5) obj).f10993o);
        }
    }

    public static /* synthetic */ void L(O5 o5, L5 l5) {
        o5.zzk = l5;
        o5.zze |= 16;
    }

    public static /* synthetic */ void M(O5 o5, int i4) {
        o5.zze |= 256;
        o5.zzo = i4;
    }

    public static void N(O5 o5, Q5 q5) {
        o5.zzq = q5.f6645o;
        o5.zze |= 1024;
    }

    public static /* synthetic */ void O(O5 o5, long j4) {
        o5.zze |= 2048;
        o5.zzr = j4;
    }

    public static /* synthetic */ void U(O5 o5, int i4) {
        o5.zzg = i4 - 1;
        o5.zze |= 2;
    }

    public static /* synthetic */ void V(O5 o5, int i4) {
        o5.zzl = i4 - 1;
        o5.zze |= 32;
    }

    public static /* synthetic */ void v(O5 o5, int i4) {
        o5.zzm = i4 - 1;
        o5.zze |= 64;
    }

    public static /* synthetic */ void w(O5 o5, int i4) {
        o5.zzn = i4 - 1;
        o5.zze |= 128;
    }

    public static /* synthetic */ void x(O5 o5, int i4) {
        o5.zzp = i4 - 1;
        o5.zze |= 512;
    }

    public final long A() {
        return this.zzh;
    }

    public final long B() {
        return this.zzf;
    }

    public final L5 C() {
        L5 l5 = this.zzk;
        return l5 == null ? L5.w() : l5;
    }

    public final Q5 F() {
        Q5 a4 = Q5.a(this.zzq);
        return a4 == null ? Q5.f6638p : a4;
    }

    public final Jz G() {
        return new Jz(this.zzj);
    }

    public final int P() {
        int q4 = AbstractC1230u.q(this.zzm);
        if (q4 == 0) {
            return 1;
        }
        return q4;
    }

    public final int Q() {
        int q4 = AbstractC1230u.q(this.zzn);
        if (q4 == 0) {
            return 1;
        }
        return q4;
    }

    public final int R() {
        int q4 = AbstractC1230u.q(this.zzp);
        if (q4 == 0) {
            return 1;
        }
        return q4;
    }

    public final int S() {
        int q4 = AbstractC1230u.q(this.zzg);
        if (q4 == 0) {
            return 1;
        }
        return q4;
    }

    public final int T() {
        int q4 = AbstractC1230u.q(this.zzl);
        if (q4 == 0) {
            return 1;
        }
        return q4;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            C0464c3 c0464c3 = C0464c3.f8330n;
            return new C0812kA(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", c0464c3, "zzh", "zzi", "zzj", C0464c3.f8328l, "zzk", "zzl", c0464c3, "zzm", c0464c3, "zzn", c0464c3, "zzo", "zzp", c0464c3, "zzq", C0464c3.f8333q, "zzr"});
        }
        if (i5 == 3) {
            return new O5();
        }
        if (i5 == 4) {
            return new Cz(zzd);
        }
        if (i5 != 5) {
            return null;
        }
        return zzd;
    }

    public final int y() {
        return this.zzo;
    }

    public final long z() {
        return this.zzi;
    }
}
