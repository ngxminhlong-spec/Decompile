package com.google.android.gms.internal.measurement;

import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class M0 extends I1 {
    public static final /* synthetic */ int zza = 0;
    private static final M0 zze;
    private boolean zzA;
    private String zzB;
    private long zzC;
    private int zzD;
    private String zzE;
    private String zzF;
    private boolean zzG;
    private N1 zzH;
    private String zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private String zzQ;
    private int zzR;
    private String zzS;
    private N0 zzT;
    private L1 zzU;
    private long zzV;
    private long zzW;
    private String zzX;
    private String zzY;
    private int zzZ;
    private boolean zzaa;
    private String zzab;
    private boolean zzac;
    private I0 zzad;
    private String zzae;
    private N1 zzaf;
    private String zzag;
    private int zzf;
    private int zzg;
    private int zzh;
    private N1 zzi;
    private N1 zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private int zzt;
    private String zzu;
    private String zzv;
    private String zzw;
    private long zzx;
    private long zzy;
    private String zzz;

    static {
        M0 m02 = new M0();
        zze = m02;
        I1.g(M0.class, m02);
    }

    public M0() {
        C1541k2 c1541k2 = C1541k2.f11959r;
        this.zzi = c1541k2;
        this.zzj = c1541k2;
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
        this.zzu = "";
        this.zzv = "";
        this.zzw = "";
        this.zzz = "";
        this.zzB = "";
        this.zzE = "";
        this.zzF = "";
        this.zzH = c1541k2;
        this.zzI = "";
        this.zzM = "";
        this.zzP = "";
        this.zzQ = "";
        this.zzS = "";
        this.zzU = J1.f11778r;
        this.zzX = "";
        this.zzY = "";
        this.zzab = "";
        this.zzae = "";
        this.zzaf = c1541k2;
        this.zzag = "";
    }

    public static /* synthetic */ void A(M0 m02) {
        m02.zzf &= Integer.MAX_VALUE;
        m02.zzP = zze.zzP;
    }

    public static /* synthetic */ void A0(M0 m02) {
        m02.zzf &= -33;
        m02.zzo = 0L;
    }

    public static /* synthetic */ void B(M0 m02, int i4) {
        m02.zzg |= 2;
        m02.zzR = i4;
    }

    public static /* synthetic */ void B0(M0 m02) {
        m02.zzf |= 64;
        m02.zzp = "android";
    }

    public static /* synthetic */ void C(M0 m02, int i4, E0 e02) {
        m02.L0();
        m02.zzi.set(i4, e02);
    }

    public static /* synthetic */ void C0(M0 m02, String str) {
        str.getClass();
        m02.zzf |= 128;
        m02.zzq = str;
    }

    public static /* synthetic */ void D(M0 m02, String str) {
        str.getClass();
        m02.zzg |= 4;
        m02.zzS = str;
    }

    public static /* synthetic */ void D0(M0 m02) {
        m02.zzf &= -129;
        m02.zzq = zze.zzq;
    }

    public static void E(M0 m02, ArrayList arrayList) {
        List list = m02.zzU;
        if (!((AbstractC1575t1) list).f12028o) {
            int size = list.size();
            int i4 = size == 0 ? 10 : size + size;
            J1 j12 = (J1) list;
            if (i4 < j12.f11780q) {
                throw new IllegalArgumentException();
            }
            m02.zzU = new J1(Arrays.copyOf(j12.f11779p, i4), j12.f11780q);
        }
        AbstractC1571s1.a(arrayList, m02.zzU);
    }

    public static /* synthetic */ void E0(M0 m02) {
        String str = Build.MODEL;
        str.getClass();
        m02.zzf |= 256;
        m02.zzr = str;
    }

    public static /* synthetic */ void F(M0 m02, E0 e02) {
        m02.L0();
        m02.zzi.add(e02);
    }

    public static /* synthetic */ void F0(M0 m02) {
        m02.zzf &= -257;
        m02.zzr = zze.zzr;
    }

    public static /* synthetic */ void G(M0 m02, long j4) {
        m02.zzg |= 16;
        m02.zzV = j4;
    }

    public static /* synthetic */ void G0(M0 m02, String str) {
        str.getClass();
        m02.zzf |= 512;
        m02.zzs = str;
    }

    public static /* synthetic */ void H(M0 m02, long j4) {
        m02.zzg |= 32;
        m02.zzW = j4;
    }

    public static /* synthetic */ void H0(M0 m02, int i4) {
        m02.zzf |= 1024;
        m02.zzt = i4;
    }

    public static /* synthetic */ void I(M0 m02, String str) {
        m02.zzg |= 128;
        m02.zzY = str;
    }

    public static /* synthetic */ void I0(M0 m02, String str) {
        str.getClass();
        m02.zzf |= 2048;
        m02.zzu = str;
    }

    public static /* synthetic */ void J(M0 m02, ArrayList arrayList) {
        m02.L0();
        AbstractC1571s1.a(arrayList, m02.zzi);
    }

    public static /* synthetic */ void J0(M0 m02, String str) {
        str.getClass();
        m02.zzf |= 4096;
        m02.zzv = str;
    }

    public static /* synthetic */ void L(M0 m02, String str) {
        str.getClass();
        m02.zzf |= 8192;
        m02.zzw = str;
    }

    public static /* synthetic */ void M(M0 m02, long j4) {
        m02.zzf |= 16384;
        m02.zzx = j4;
    }

    public static /* synthetic */ void N(M0 m02) {
        m02.zzf |= 32768;
        m02.zzy = 73000L;
    }

    public static /* synthetic */ void O(M0 m02, String str) {
        str.getClass();
        m02.zzf |= 65536;
        m02.zzz = str;
    }

    public static /* synthetic */ void P(M0 m02) {
        m02.zzf &= -65537;
        m02.zzz = zze.zzz;
    }

    public static /* synthetic */ void Q(M0 m02, boolean z4) {
        m02.zzf |= 131072;
        m02.zzA = z4;
    }

    public static /* synthetic */ void R(M0 m02) {
        m02.zzf &= -131073;
        m02.zzA = false;
    }

    public static /* synthetic */ void S(M0 m02, String str) {
        m02.zzf |= 262144;
        m02.zzB = str;
    }

    public static /* synthetic */ void T(M0 m02) {
        m02.zzf &= -262145;
        m02.zzB = zze.zzB;
    }

    public static /* synthetic */ void U(M0 m02, long j4) {
        m02.zzf |= 524288;
        m02.zzC = j4;
    }

    public static /* synthetic */ void V(M0 m02, int i4) {
        m02.zzf |= 1048576;
        m02.zzD = i4;
    }

    public static /* synthetic */ void W(M0 m02, String str) {
        m02.zzf |= 2097152;
        m02.zzE = str;
    }

    public static /* synthetic */ void X(M0 m02) {
        m02.zzf &= -2097153;
        m02.zzE = zze.zzE;
    }

    public static /* synthetic */ void Y(M0 m02, String str) {
        str.getClass();
        m02.zzf |= 4194304;
        m02.zzF = str;
    }

    public static /* synthetic */ void Z(M0 m02) {
        m02.zzf |= 8388608;
        m02.zzG = false;
    }

    public static void a0(M0 m02, ArrayList arrayList) {
        N1 n12 = m02.zzH;
        if (!((AbstractC1575t1) n12).f12028o) {
            m02.zzH = I1.e(n12);
        }
        AbstractC1571s1.a(arrayList, m02.zzH);
    }

    public static void b0(M0 m02) {
        m02.zzH = C1541k2.f11959r;
    }

    public static /* synthetic */ void c0(M0 m02, String str) {
        m02.zzf |= 16777216;
        m02.zzI = str;
    }

    public static /* synthetic */ void d0(M0 m02, int i4) {
        m02.zzf |= 33554432;
        m02.zzJ = i4;
    }

    public static /* synthetic */ void e0(M0 m02) {
        m02.zzf |= 1;
        m02.zzh = 1;
    }

    public static /* synthetic */ void f0(M0 m02) {
        m02.zzf &= -268435457;
        m02.zzM = zze.zzM;
    }

    public static /* synthetic */ void g0(M0 m02, long j4) {
        m02.zzf |= 536870912;
        m02.zzN = j4;
    }

    public static /* synthetic */ void l0(M0 m02, String str) {
        str.getClass();
        m02.zzg |= 8192;
        m02.zzae = str;
    }

    public static /* synthetic */ void m0(M0 m02) {
        m02.zzg &= -8193;
        m02.zzae = zze.zzae;
    }

    public static void n0(M0 m02, Set set) {
        N1 n12 = m02.zzaf;
        if (!((AbstractC1575t1) n12).f12028o) {
            m02.zzaf = I1.e(n12);
        }
        AbstractC1571s1.a(set, m02.zzaf);
    }

    public static void o0(M0 m02) {
        m02.zzi = C1541k2.f11959r;
    }

    public static /* synthetic */ void p0(M0 m02, String str) {
        str.getClass();
        m02.zzg |= 16384;
        m02.zzag = str;
    }

    public static /* synthetic */ void q0(M0 m02, int i4) {
        m02.L0();
        m02.zzi.remove(i4);
    }

    public static /* synthetic */ void r0(M0 m02, int i4, T0 t02) {
        m02.M0();
        m02.zzj.set(i4, t02);
    }

    public static /* synthetic */ void s0(M0 m02, T0 t02) {
        m02.M0();
        m02.zzj.add(t02);
    }

    public static /* synthetic */ void t0(M0 m02, int i4) {
        m02.M0();
        m02.zzj.remove(i4);
    }

    public static /* synthetic */ void u0(M0 m02, long j4) {
        m02.zzf |= 2;
        m02.zzk = j4;
    }

    public static L0 u1() {
        return (L0) zze.h();
    }

    public static /* synthetic */ void v0(M0 m02, long j4) {
        m02.zzf |= 4;
        m02.zzl = j4;
    }

    public static /* synthetic */ void w0(M0 m02, long j4) {
        m02.zzf |= 8;
        m02.zzm = j4;
    }

    public static /* synthetic */ void x0(M0 m02, long j4) {
        m02.zzf |= 16;
        m02.zzn = j4;
    }

    public static /* synthetic */ void y0(M0 m02) {
        m02.zzf &= -17;
        m02.zzn = 0L;
    }

    public static /* synthetic */ void z0(M0 m02, long j4) {
        m02.zzf |= 32;
        m02.zzo = j4;
    }

    public final int K() {
        return this.zzJ;
    }

    public final int K0() {
        return this.zzD;
    }

    public final void L0() {
        N1 n12 = this.zzi;
        if (((AbstractC1575t1) n12).f12028o) {
            return;
        }
        this.zzi = I1.e(n12);
    }

    public final void M0() {
        N1 n12 = this.zzj;
        if (((AbstractC1575t1) n12).f12028o) {
            return;
        }
        this.zzj = I1.e(n12);
    }

    public final boolean N0() {
        return (this.zzf & 536870912) != 0;
    }

    public final boolean O0() {
        return (this.zzg & 128) != 0;
    }

    public final boolean P0() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean Q0() {
        return (this.zzg & 16) != 0;
    }

    public final boolean R0() {
        return (this.zzf & 8) != 0;
    }

    public final boolean S0() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean T0() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean U0() {
        return (this.zzf & 32) != 0;
    }

    public final boolean V0() {
        return (this.zzf & 16) != 0;
    }

    public final boolean W0() {
        return (this.zzf & 1) != 0;
    }

    public final boolean X0() {
        return (this.zzg & 2) != 0;
    }

    public final boolean Y0() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean Z0() {
        return (this.zzg & 8192) != 0;
    }

    public final boolean a1() {
        return (this.zzf & 4) != 0;
    }

    public final boolean b1() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean c1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean d1() {
        return (this.zzf & 32768) != 0;
    }

    public final int e1() {
        return this.zzi.size();
    }

    public final int f1() {
        return this.zzh;
    }

    public final int g1() {
        return this.zzR;
    }

    public final boolean h0() {
        return this.zzA;
    }

    public final int h1() {
        return this.zzt;
    }

    public final boolean i0() {
        return this.zzG;
    }

    public final int i1() {
        return this.zzj.size();
    }

    public final boolean j0() {
        return (this.zzf & 33554432) != 0;
    }

    public final long j1() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.measurement.I1
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1545l2(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", E0.class, "zzj", T0.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", A0.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C1547m0.d, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        if (i5 == 3) {
            return new M0();
        }
        if (i5 == 4) {
            return new H1(zze);
        }
        if (i5 != 5) {
            return null;
        }
        return zze;
    }

    public final boolean k0() {
        return (this.zzf & 1048576) != 0;
    }

    public final long k1() {
        return this.zzC;
    }

    public final String l() {
        return this.zzw;
    }

    public final long l1() {
        return this.zzV;
    }

    public final String m() {
        return this.zzY;
    }

    public final long m1() {
        return this.zzm;
    }

    public final String n() {
        return this.zzr;
    }

    public final long n1() {
        return this.zzx;
    }

    public final String o() {
        return this.zzP;
    }

    public final long o1() {
        return this.zzo;
    }

    public final String p() {
        return this.zzI;
    }

    public final long p1() {
        return this.zzn;
    }

    public final String q() {
        return this.zzF;
    }

    public final long q1() {
        return this.zzl;
    }

    public final String r() {
        return this.zzE;
    }

    public final long r1() {
        return this.zzk;
    }

    public final String s() {
        return this.zzq;
    }

    public final long s1() {
        return this.zzy;
    }

    public final String t() {
        return this.zzp;
    }

    public final E0 t1(int i4) {
        return (E0) this.zzi.get(i4);
    }

    public final String u() {
        return this.zzz;
    }

    public final String v() {
        return this.zzae;
    }

    public final T0 v1(int i4) {
        return (T0) this.zzj.get(i4);
    }

    public final String w() {
        return this.zzs;
    }

    public final String w1() {
        return this.zzS;
    }

    public final N1 x() {
        return this.zzH;
    }

    public final String x1() {
        return this.zzv;
    }

    public final N1 y() {
        return this.zzi;
    }

    public final String y1() {
        return this.zzB;
    }

    public final N1 z() {
        return this.zzj;
    }

    public final String z1() {
        return this.zzu;
    }
}
