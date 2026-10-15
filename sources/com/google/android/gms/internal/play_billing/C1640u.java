package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.C1143rz;
import java.util.logging.Level;
import java.util.logging.Logger;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1640u extends AbstractC1806a {

    /* renamed from: r0, reason: collision with root package name */
    public static final Logger f12247r0 = Logger.getLogger(C1640u.class.getName());

    /* renamed from: s0, reason: collision with root package name */
    public static final boolean f12248s0 = AbstractC1645w0.f12257e;

    /* renamed from: n0, reason: collision with root package name */
    public W f12249n0;

    /* renamed from: o0, reason: collision with root package name */
    public final byte[] f12250o0;

    /* renamed from: p0, reason: collision with root package name */
    public final int f12251p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f12252q0;

    public C1640u(int i4, byte[] bArr) {
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i4)));
        }
        this.f12250o0 = bArr;
        this.f12252q0 = 0;
        this.f12251p0 = i4;
    }

    public static int k0(String str) {
        int length;
        try {
            length = z0.c(str);
        } catch (y0 unused) {
            length = str.getBytes(K.f12151a).length;
        }
        return l0(length) + length;
    }

    public static int l0(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int m0(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public final void V(byte b4) {
        try {
            byte[] bArr = this.f12250o0;
            int i4 = this.f12252q0;
            this.f12252q0 = i4 + 1;
            bArr[i4] = b4;
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12252q0), Integer.valueOf(this.f12251p0), 1), e4, 3);
        }
    }

    public final void W(int i4, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f12250o0, this.f12252q0, i4);
            this.f12252q0 += i4;
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12252q0), Integer.valueOf(this.f12251p0), Integer.valueOf(i4)), e4, 3);
        }
    }

    public final void X(int i4, C1638t c1638t) {
        h0((i4 << 3) | 2);
        h0(c1638t.j());
        W(c1638t.j(), c1638t.f12246p);
    }

    public final void Y(int i4, int i5) {
        h0((i4 << 3) | 5);
        Z(i5);
    }

    public final void Z(int i4) {
        try {
            byte[] bArr = this.f12250o0;
            int i5 = this.f12252q0;
            int i6 = i5 + 1;
            this.f12252q0 = i6;
            bArr[i5] = (byte) (i4 & 255);
            int i7 = i5 + 2;
            this.f12252q0 = i7;
            bArr[i6] = (byte) ((i4 >> 8) & 255);
            int i8 = i5 + 3;
            this.f12252q0 = i8;
            bArr[i7] = (byte) ((i4 >> 16) & 255);
            this.f12252q0 = i5 + 4;
            bArr[i8] = (byte) ((i4 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12252q0), Integer.valueOf(this.f12251p0), 1), e4, 3);
        }
    }

    public final void a0(int i4, long j4) {
        h0((i4 << 3) | 1);
        b0(j4);
    }

    public final void b0(long j4) {
        try {
            byte[] bArr = this.f12250o0;
            int i4 = this.f12252q0;
            int i5 = i4 + 1;
            this.f12252q0 = i5;
            bArr[i4] = (byte) (((int) j4) & 255);
            int i6 = i4 + 2;
            this.f12252q0 = i6;
            bArr[i5] = (byte) (((int) (j4 >> 8)) & 255);
            int i7 = i4 + 3;
            this.f12252q0 = i7;
            bArr[i6] = (byte) (((int) (j4 >> 16)) & 255);
            int i8 = i4 + 4;
            this.f12252q0 = i8;
            bArr[i7] = (byte) (((int) (j4 >> 24)) & 255);
            int i9 = i4 + 5;
            this.f12252q0 = i9;
            bArr[i8] = (byte) (((int) (j4 >> 32)) & 255);
            int i10 = i4 + 6;
            this.f12252q0 = i10;
            bArr[i9] = (byte) (((int) (j4 >> 40)) & 255);
            int i11 = i4 + 7;
            this.f12252q0 = i11;
            bArr[i10] = (byte) (((int) (j4 >> 48)) & 255);
            this.f12252q0 = i4 + 8;
            bArr[i11] = (byte) (((int) (j4 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12252q0), Integer.valueOf(this.f12251p0), 1), e4, 3);
        }
    }

    public final void c0(int i4, int i5) {
        h0(i4 << 3);
        d0(i5);
    }

    public final void d0(int i4) {
        if (i4 >= 0) {
            h0(i4);
        } else {
            j0(i4);
        }
    }

    public final void e0(String str, int i4) {
        h0((i4 << 3) | 2);
        int i5 = this.f12252q0;
        try {
            int l02 = l0(str.length() * 3);
            int l03 = l0(str.length());
            int i6 = this.f12251p0;
            byte[] bArr = this.f12250o0;
            if (l03 != l02) {
                h0(z0.c(str));
                int i7 = this.f12252q0;
                this.f12252q0 = z0.b(str, bArr, i7, i6 - i7);
            } else {
                int i8 = i5 + l03;
                this.f12252q0 = i8;
                int b4 = z0.b(str, bArr, i8, i6 - i8);
                this.f12252q0 = i5;
                h0((b4 - i5) - l03);
                this.f12252q0 = b4;
            }
        } catch (y0 e4) {
            this.f12252q0 = i5;
            f12247r0.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(K.f12151a);
            try {
                int length = bytes.length;
                h0(length);
                W(length, bytes);
            } catch (IndexOutOfBoundsException e5) {
                throw new C1143rz(e5);
            }
        } catch (IndexOutOfBoundsException e6) {
            throw new C1143rz(e6);
        }
    }

    public final void f0(int i4, int i5) {
        h0((i4 << 3) | i5);
    }

    public final void g0(int i4, int i5) {
        h0(i4 << 3);
        h0(i5);
    }

    public final void h0(int i4) {
        while (true) {
            int i5 = i4 & (-128);
            byte[] bArr = this.f12250o0;
            if (i5 == 0) {
                int i6 = this.f12252q0;
                this.f12252q0 = i6 + 1;
                bArr[i6] = (byte) i4;
                return;
            } else {
                try {
                    int i7 = this.f12252q0;
                    this.f12252q0 = i7 + 1;
                    bArr[i7] = (byte) ((i4 | 128) & 255);
                    i4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12252q0), Integer.valueOf(this.f12251p0), 1), e4, 3);
                }
            }
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12252q0), Integer.valueOf(this.f12251p0), 1), e4, 3);
        }
    }

    public final void i0(int i4, long j4) {
        h0(i4 << 3);
        j0(j4);
    }

    public final void j0(long j4) {
        boolean z4 = f12248s0;
        int i4 = this.f12251p0;
        byte[] bArr = this.f12250o0;
        if (!z4 || i4 - this.f12252q0 < 10) {
            while ((j4 & (-128)) != 0) {
                try {
                    int i5 = this.f12252q0;
                    this.f12252q0 = i5 + 1;
                    bArr[i5] = (byte) ((((int) j4) | 128) & 255);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12252q0), Integer.valueOf(i4), 1), e4, 3);
                }
            }
            int i6 = this.f12252q0;
            this.f12252q0 = i6 + 1;
            bArr[i6] = (byte) j4;
            return;
        }
        while (true) {
            int i7 = (int) j4;
            if ((j4 & (-128)) == 0) {
                int i8 = this.f12252q0;
                this.f12252q0 = i8 + 1;
                AbstractC1645w0.c.d(bArr, AbstractC1645w0.f12258f + i8, (byte) i7);
                return;
            } else {
                int i9 = this.f12252q0;
                this.f12252q0 = i9 + 1;
                AbstractC1645w0.c.d(bArr, AbstractC1645w0.f12258f + i9, (byte) ((i7 | 128) & 255));
                j4 >>>= 7;
            }
        }
    }
}
