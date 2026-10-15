package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C1143rz;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1595y1 extends AbstractC1515f1 {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f12116f = Logger.getLogger(C1595y1.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f12117g = AbstractC1584v2.f12103e;

    /* renamed from: b, reason: collision with root package name */
    public C1599z1 f12118b;
    public final byte[] c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public int f12119e;

    public C1595y1(int i4, byte[] bArr) {
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i4)));
        }
        this.c = bArr;
        this.f12119e = 0;
        this.d = i4;
    }

    public static int L(int i4) {
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

    public static int M(long j4) {
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
            i4 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? i4 + 1 : i4;
    }

    public static int Z(int i4, AbstractC1571s1 abstractC1571s1, InterfaceC1549m2 interfaceC1549m2) {
        int L4 = L(i4 << 3);
        int i5 = L4 + L4;
        I1 i12 = (I1) abstractC1571s1;
        int i6 = i12.zzd;
        if (i6 == -1) {
            i6 = interfaceC1549m2.l(abstractC1571s1);
            i12.zzd = i6;
        }
        return i5 + i6;
    }

    public static int a0(int i4) {
        if (i4 >= 0) {
            return L(i4);
        }
        return 10;
    }

    public static int b0(String str) {
        int length;
        try {
            length = AbstractC1600z2.c(str);
        } catch (C1596y2 unused) {
            length = str.getBytes(O1.f11796a).length;
        }
        return L(length) + length;
    }

    public static int c0(int i4) {
        return L(i4 << 3);
    }

    public final void N(byte b4) {
        try {
            byte[] bArr = this.c;
            int i4 = this.f12119e;
            this.f12119e = i4 + 1;
            bArr[i4] = b4;
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12119e), Integer.valueOf(this.d), 1), e4, 2);
        }
    }

    public final void O(int i4, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.c, this.f12119e, i4);
            this.f12119e += i4;
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12119e), Integer.valueOf(this.d), Integer.valueOf(i4)), e4, 2);
        }
    }

    public final void P(int i4, C1591x1 c1591x1) {
        W((i4 << 3) | 2);
        W(c1591x1.j());
        O(c1591x1.j(), c1591x1.f12115p);
    }

    public final void Q(int i4, int i5) {
        W((i4 << 3) | 5);
        R(i5);
    }

    public final void R(int i4) {
        try {
            byte[] bArr = this.c;
            int i5 = this.f12119e;
            int i6 = i5 + 1;
            this.f12119e = i6;
            bArr[i5] = (byte) (i4 & 255);
            int i7 = i5 + 2;
            this.f12119e = i7;
            bArr[i6] = (byte) ((i4 >> 8) & 255);
            int i8 = i5 + 3;
            this.f12119e = i8;
            bArr[i7] = (byte) ((i4 >> 16) & 255);
            this.f12119e = i5 + 4;
            bArr[i8] = (byte) ((i4 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12119e), Integer.valueOf(this.d), 1), e4, 2);
        }
    }

    public final void S(int i4, long j4) {
        W((i4 << 3) | 1);
        T(j4);
    }

    public final void T(long j4) {
        try {
            byte[] bArr = this.c;
            int i4 = this.f12119e;
            int i5 = i4 + 1;
            this.f12119e = i5;
            bArr[i4] = (byte) (((int) j4) & 255);
            int i6 = i4 + 2;
            this.f12119e = i6;
            bArr[i5] = (byte) (((int) (j4 >> 8)) & 255);
            int i7 = i4 + 3;
            this.f12119e = i7;
            bArr[i6] = (byte) (((int) (j4 >> 16)) & 255);
            int i8 = i4 + 4;
            this.f12119e = i8;
            bArr[i7] = (byte) (((int) (j4 >> 24)) & 255);
            int i9 = i4 + 5;
            this.f12119e = i9;
            bArr[i8] = (byte) (((int) (j4 >> 32)) & 255);
            int i10 = i4 + 6;
            this.f12119e = i10;
            bArr[i9] = (byte) (((int) (j4 >> 40)) & 255);
            int i11 = i4 + 7;
            this.f12119e = i11;
            bArr[i10] = (byte) (((int) (j4 >> 48)) & 255);
            this.f12119e = i4 + 8;
            bArr[i11] = (byte) (((int) (j4 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12119e), Integer.valueOf(this.d), 1), e4, 2);
        }
    }

    public final void U(String str, int i4) {
        W((i4 << 3) | 2);
        int i5 = this.f12119e;
        try {
            int L4 = L(str.length() * 3);
            int L5 = L(str.length());
            int i6 = this.d;
            byte[] bArr = this.c;
            if (L5 != L4) {
                W(AbstractC1600z2.c(str));
                int i7 = this.f12119e;
                this.f12119e = AbstractC1600z2.b(str, bArr, i7, i6 - i7);
            } else {
                int i8 = i5 + L5;
                this.f12119e = i8;
                int b4 = AbstractC1600z2.b(str, bArr, i8, i6 - i8);
                this.f12119e = i5;
                W((b4 - i5) - L5);
                this.f12119e = b4;
            }
        } catch (C1596y2 e4) {
            this.f12119e = i5;
            f12116f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(O1.f11796a);
            try {
                int length = bytes.length;
                W(length);
                O(length, bytes);
            } catch (IndexOutOfBoundsException e5) {
                throw new C1143rz(e5);
            }
        } catch (IndexOutOfBoundsException e6) {
            throw new C1143rz(e6);
        }
    }

    public final void V(int i4, int i5) {
        W((i4 << 3) | i5);
    }

    public final void W(int i4) {
        while (true) {
            int i5 = i4 & (-128);
            byte[] bArr = this.c;
            if (i5 == 0) {
                int i6 = this.f12119e;
                this.f12119e = i6 + 1;
                bArr[i6] = (byte) i4;
                return;
            } else {
                try {
                    int i7 = this.f12119e;
                    this.f12119e = i7 + 1;
                    bArr[i7] = (byte) ((i4 & 127) | 128);
                    i4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12119e), Integer.valueOf(this.d), 1), e4, 2);
                }
            }
            throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12119e), Integer.valueOf(this.d), 1), e4, 2);
        }
    }

    public final void X(int i4, long j4) {
        W(i4 << 3);
        Y(j4);
    }

    public final void Y(long j4) {
        boolean z4 = f12117g;
        int i4 = this.d;
        byte[] bArr = this.c;
        if (z4 && i4 - this.f12119e >= 10) {
            while ((j4 & (-128)) != 0) {
                int i5 = this.f12119e;
                this.f12119e = i5 + 1;
                AbstractC1584v2.c.d(bArr, AbstractC1584v2.f12104f + i5, (byte) ((((int) j4) & 127) | 128));
                j4 >>>= 7;
            }
            int i6 = this.f12119e;
            this.f12119e = i6 + 1;
            AbstractC1584v2.c.d(bArr, AbstractC1584v2.f12104f + i6, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            try {
                int i7 = this.f12119e;
                this.f12119e = i7 + 1;
                bArr[i7] = (byte) ((((int) j4) & 127) | 128);
                j4 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new C1143rz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12119e), Integer.valueOf(i4), 1), e4, 2);
            }
        }
        int i8 = this.f12119e;
        this.f12119e = i8 + 1;
        bArr[i8] = (byte) j4;
    }
}
