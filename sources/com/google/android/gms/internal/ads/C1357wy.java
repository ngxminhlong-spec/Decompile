package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wy */
/* loaded from: classes.dex */
public final class C1357wy extends Dz {
    private static final C1357wy zzb;
    private int zzd;
    private Lz zze = C0769jA.f9138r;

    static {
        C1357wy c1357wy = new C1357wy();
        zzb = c1357wy;
        Dz.o(C1357wy.class, c1357wy);
    }

    public static void C(C1357wy c1357wy, C1314vy c1314vy) {
        Lz lz = c1357wy.zze;
        if (!((AbstractC0459bz) lz).f8310o) {
            c1357wy.zze = Dz.l(lz);
        }
        c1357wy.zze.add(c1314vy);
    }

    public static C1228ty x() {
        return (C1228ty) zzb.g();
    }

    public static C1357wy z(ByteArrayInputStream byteArrayInputStream, C1315vz c1315vz) {
        C1357wy c1357wy = zzb;
        C1015oz c1015oz = new C1015oz(byteArrayInputStream);
        Dz j4 = c1357wy.j();
        try {
            InterfaceC0984oA a4 = C0728iA.c.a(j4.getClass());
            C1058pz c1058pz = (C1058pz) c1015oz.f9865b;
            if (c1058pz == null) {
                c1058pz = new C1058pz(c1015oz);
            }
            a4.h(j4, c1058pz, c1315vz);
            a4.b(j4);
            Dz.t(j4);
            return (C1357wy) j4;
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

    public final Lz A() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.Dz
    public final Object s(int i4, Dz dz) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C0812kA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", C1314vy.class});
        }
        if (i5 == 3) {
            return new C1357wy();
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
        return this.zze.size();
    }

    public final int w() {
        return this.zzd;
    }

    public final C1314vy y(int i4) {
        return (C1314vy) this.zze.get(i4);
    }
}
