package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B0 extends E {
    private static final B0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private G0 zzh;

    static {
        B0 b02 = new B0();
        zzb = b02;
        E.g(B0.class, b02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.k0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.play_billing.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.dz, java.lang.Object] */
    public static B0 l(byte[] bArr, AbstractC1644w abstractC1644w) {
        B0 b02 = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r22 = (E) b02.k(4);
            try {
                ?? a4 = C1616h0.c.a(r22.getClass());
                ?? obj = new Object();
                abstractC1644w.getClass();
                a4.g(r22, bArr, 0, length, obj);
                a4.b(r22);
                b02 = r22;
            } catch (M e4) {
                throw e4;
            } catch (C1626m0 e5) {
                throw new IOException(e5.getMessage());
            } catch (IOException e6) {
                if (e6.getCause() instanceof M) {
                    throw ((M) e6.getCause());
                }
                throw new IOException(e6.getMessage(), e6);
            } catch (IndexOutOfBoundsException unused) {
                throw M.c();
            }
        }
        if (b02 == null || E.i(b02, true)) {
            return b02;
        }
        throw new IOException(new C1626m0().getMessage());
    }

    public static /* synthetic */ void m(B0 b02, G0 g02) {
        b02.zzh = g02;
        b02.zzd |= 2;
    }

    public static /* synthetic */ void n(B0 b02, int i4) {
        b02.zzg = i4 - 1;
        b02.zzd |= 1;
    }

    public static A0 o() {
        return (A0) ((D) zzb.k(5));
    }

    @Override // com.google.android.gms.internal.play_billing.E
    public final Object k(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new C1620j0(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C0.f12135b, "zzh", N0.class});
        }
        if (i5 == 3) {
            return new B0();
        }
        if (i5 == 4) {
            return new D(zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
