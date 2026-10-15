package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K4 extends AA {

    /* renamed from: q, reason: collision with root package name */
    public MessageDigest f5971q;

    public final byte[] r1(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i4 = 4;
        if (length == 1) {
            int d = AbstractC1230u.d(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(d);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int d4 = AbstractC1230u.d(split[i5]);
                    int i6 = (d4 >> 16) ^ ((char) d4);
                    byte b4 = (byte) i6;
                    byte b5 = (byte) (i6 >> 8);
                    int i7 = i5 + i5;
                    bArr[i7] = new byte[]{b4, b5}[0];
                    bArr[i7 + 1] = b5;
                }
            } else {
                bArr = new byte[length];
                for (int i8 = 0; i8 < split.length; i8++) {
                    int d5 = AbstractC1230u.d(split[i8]);
                    bArr[i8] = (byte) ((d5 >> 24) ^ (((d5 & 255) ^ ((d5 >> 8) & 255)) ^ ((d5 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.f5971q = S0();
        synchronized (this.f3928o) {
            try {
                MessageDigest messageDigest = this.f5971q;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f5971q.update(bArr2);
                byte[] digest = this.f5971q.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i4 = length2;
                }
                byte[] bArr3 = new byte[i4];
                System.arraycopy(digest, 0, bArr3, 0, i4);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
