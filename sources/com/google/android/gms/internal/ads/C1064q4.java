package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.q4 */
/* loaded from: classes.dex */
public final class C1064q4 extends Dz {
    private static final C1064q4 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        C1064q4 c1064q4 = new C1064q4();
        zzb = c1064q4;
        Dz.o(C1064q4.class, c1064q4);
    }

    public static C1064q4 A(C0800jz c0800jz) {
        C1064q4 c1064q4 = zzb;
        C1315vz c1315vz = C1315vz.f11096b;
        AbstractC1012ow t4 = c0800jz.t();
        Dz j4 = c1064q4.j();
        try {
            InterfaceC0984oA a4 = C0728iA.c.a(j4.getClass());
            C1058pz c1058pz = (C1058pz) t4.f9865b;
            if (c1058pz == null) {
                c1058pz = new C1058pz(t4);
            }
            a4.h(j4, c1058pz, c1315vz);
            a4.b(j4);
            t4.B(0);
            Dz.t(j4);
            Dz.t(j4);
            return (C1064q4) j4;
        } catch (Oz e4) {
            if (e4.f6544o) {
                throw new IOException(e4.getMessage(), e4);
            }
            throw e4;
        } catch (C1112rA e5) {
            throw new IOException(e5.getMessage());
        } catch (IOException e6) {
            if (e6.getCause() instanceof Oz) {
                throw ((Oz) e6.getCause());
            }
            throw new IOException(e6.getMessage(), e6);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof Oz) {
                throw ((Oz) e7.getCause());
            }
            throw e7;
        }
    }

    public static C1064q4 B(C0800jz c0800jz, C1315vz c1315vz) {
        return (C1064q4) Dz.k(zzb, c0800jz, c1315vz);
    }

    public static /* synthetic */ void E(C1064q4 c1064q4, String str) {
        str.getClass();
        c1064q4.zzd |= 1;
        c1064q4.zze = str;
    }

    public static /* synthetic */ void F(C1064q4 c1064q4, long j4) {
        c1064q4.zzd |= 16;
        c1064q4.zzi = j4;
    }

    public static /* synthetic */ void G(C1064q4 c1064q4, String str) {
        str.getClass();
        c1064q4.zzd |= 2;
        c1064q4.zzf = str;
    }

    public static /* synthetic */ void H(C1064q4 c1064q4, long j4) {
        c1064q4.zzd |= 4;
        c1064q4.zzg = j4;
    }

    public static /* synthetic */ void I(C1064q4 c1064q4, long j4) {
        c1064q4.zzd |= 8;
        c1064q4.zzh = j4;
    }

    public static C1021p4 y() {
        return (C1021p4) zzb.g();
    }

    public static C1064q4 z() {
        return zzb;
    }

    public final String C() {
        return this.zzf;
    }

    public final String D() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new C1064q4();
        }
        if (i5 == 4) {
            return new Cz(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final long v() {
        return this.zzh;
    }

    public final long w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzi;
    }
}
