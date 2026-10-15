package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T0 implements InterfaceC0633g1 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f7027e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f7028f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public int f7029a;

    /* renamed from: b, reason: collision with root package name */
    public int f7030b;
    public Object c = new byte[8];

    public static long f(int i4, boolean z4, byte[] bArr) {
        long j4 = bArr[0] & 255;
        if (z4) {
            j4 &= ~d[i4 - 1];
        }
        for (int i5 = 1; i5 < i4; i5++) {
            j4 = (j4 << 8) | (bArr[i5] & 255);
        }
        return j4;
    }

    public static final void g(ByteBuffer byteBuffer, long j4, int i4, int i5, boolean z4) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z4 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j4);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i4);
        byteBuffer.putInt(0);
        long j5 = i5;
        if (!((j5 >> 8) == 0)) {
            throw new IllegalArgumentException(Bs.B("out of range: %s", Long.valueOf(j5)));
        }
        byteBuffer.put((byte) j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r12.charAt(r5) == ' ') goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.util.ArrayList r18, java.util.ArrayList r19) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.T0.a(java.util.ArrayList, java.util.ArrayList):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633g1
    public int b() {
        return this.f7029a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633g1
    public int c() {
        return this.f7030b;
    }

    public void d(RB rb, List list) {
        int i4;
        ByteBuffer byteBuffer;
        int i5;
        ByteBuffer byteBuffer2 = rb.f6791e;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - rb.f6791e.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f7029a == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = rb.f6791e;
        int position = byteBuffer3.position();
        int limit = byteBuffer3.limit();
        int i6 = limit - position;
        int i7 = (i6 + 255) / 255;
        int i8 = i7 + 27 + i6;
        if (this.f7029a == 2) {
            i4 = bArr != null ? bArr.length + 28 : 47;
            i8 += i4 + 44;
        } else {
            i4 = 0;
        }
        if (((ByteBuffer) this.c).capacity() < i8) {
            this.c = ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.c).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.c;
        if (this.f7029a == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i5 = 22;
                g(byteBuffer, 0L, 0, 1, true);
                int length = bArr.length;
                long j4 = length;
                if (!((j4 >> 8) == 0)) {
                    throw new IllegalArgumentException(Bs.B("out of range: %s", Long.valueOf(j4)));
                }
                byteBuffer.put((byte) j4);
                byteBuffer.put(bArr);
                int i9 = length + 28;
                byteBuffer.putInt(22, AbstractC0751is.l(byteBuffer.arrayOffset(), i9, 0, byteBuffer.array()));
                byteBuffer.position(i9);
            } else {
                byteBuffer = byteBuffer4;
                i5 = 22;
                byteBuffer.put(f7027e);
            }
            byteBuffer.put(f7028f);
        } else {
            byteBuffer = byteBuffer4;
            i5 = 22;
        }
        int Z4 = this.f7030b + ((int) ((AbstractC1230u.Z(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f7030b = Z4;
        int i10 = i5;
        ByteBuffer byteBuffer5 = byteBuffer;
        g(byteBuffer5, Z4, this.f7029a, i7, false);
        for (int i11 = 0; i11 < i7; i11++) {
            if (i6 >= 255) {
                byteBuffer5.put((byte) -1);
                i6 -= 255;
            } else {
                byteBuffer5.put((byte) i6);
                i6 = 0;
            }
        }
        while (position < limit) {
            byteBuffer5.put(byteBuffer3.get(position));
            position++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f7029a == 2) {
            byteBuffer5.putInt(i4 + 66, AbstractC0751is.l(byteBuffer5.arrayOffset() + i4 + 44, byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        } else {
            byteBuffer5.putInt(i10, AbstractC0751is.l(byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        }
        this.f7029a++;
        this.c = byteBuffer5;
        rb.d();
        rb.e(((ByteBuffer) this.c).remaining());
        rb.f6791e.put((ByteBuffer) this.c);
        rb.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633g1
    public int e() {
        int i4 = this.f7029a;
        return i4 == -1 ? ((C1134rq) this.c).p() : i4;
    }

    public long h(C c, boolean z4, boolean z5, int i4) {
        int i5;
        byte[] bArr = (byte[]) this.c;
        if (this.f7029a == 0) {
            if (!c.C(bArr, 0, 1, z4)) {
                return -1L;
            }
            int i6 = bArr[0] & 255;
            int i7 = 0;
            while (true) {
                if (i7 >= 8) {
                    i5 = -1;
                    break;
                }
                i5 = i7 + 1;
                if ((d[i7] & i6) != 0) {
                    break;
                }
                i7 = i5;
            }
            this.f7030b = i5;
            if (i5 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f7029a = 1;
        }
        int i8 = this.f7030b;
        if (i8 > i4) {
            this.f7029a = 0;
            return -2L;
        }
        if (i8 != 1) {
            ((C1316w) c).C(bArr, 1, i8 - 1, false);
        }
        this.f7029a = 0;
        return f(this.f7030b, z5, bArr);
    }
}
