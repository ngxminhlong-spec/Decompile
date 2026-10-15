package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1229tz extends AbstractC0587ez {
    public static final Logger c = Logger.getLogger(AbstractC1229tz.class.getName());
    public static final boolean d = BA.f4033e;

    /* renamed from: b, reason: collision with root package name */
    public C1384xi f10762b;

    public static int A(long j4) {
        int i4;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i4 = 6;
        } else {
            i4 = 2;
        }
        if (((-2097152) & j4) != 0) {
            j4 >>>= 14;
            i4 += 2;
        }
        return (j4 & (-16384)) != 0 ? i4 + 1 : i4;
    }

    public static int S(int i4) {
        if (i4 >= 0) {
            return z(i4);
        }
        return 10;
    }

    public static int T(String str) {
        int length;
        try {
            length = DA.c(str);
        } catch (CA unused) {
            length = str.getBytes(Mz.f6292a).length;
        }
        return z(length) + length;
    }

    public static int z(int i4) {
        if ((i4 & (-128)) == 0) {
            return 1;
        }
        if ((i4 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i4) == 0) {
            return 3;
        }
        return (i4 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void B(String str, CA ca) {
        c.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ca);
        byte[] bytes = str.getBytes(Mz.f6292a);
        try {
            int length = bytes.length;
            P(length);
            i(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(e4);
        }
    }

    public abstract void C(byte b4);

    public abstract void D(int i4, boolean z4);

    public abstract void E(int i4, AbstractC0886lz abstractC0886lz);

    public abstract void F(int i4, int i5);

    public abstract void G(int i4);

    public abstract void H(int i4, long j4);

    public abstract void I(long j4);

    public abstract void J(int i4, int i5);

    public abstract void K(int i4);

    public abstract void L(int i4, AbstractC0417az abstractC0417az, InterfaceC0984oA interfaceC0984oA);

    public abstract void M(String str, int i4);

    public abstract void N(int i4, int i5);

    public abstract void O(int i4, int i5);

    public abstract void P(int i4);

    public abstract void Q(int i4, long j4);

    public abstract void R(long j4);
}
