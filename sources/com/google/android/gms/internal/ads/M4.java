package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class M4 extends AA {

    /* renamed from: q, reason: collision with root package name */
    public MessageDigest f6209q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6210r;

    /* renamed from: s, reason: collision with root package name */
    public final int f6211s;

    public M4(int i4) {
        super(2);
        int i5 = i4 >> 3;
        this.f6210r = (i4 & 7) > 0 ? i5 + 1 : i5;
        this.f6211s = i4;
    }

    public final byte[] r1(String str) {
        synchronized (this.f3928o) {
            try {
                MessageDigest S02 = S0();
                this.f6209q = S02;
                if (S02 == null) {
                    return new byte[0];
                }
                S02.reset();
                this.f6209q.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] digest = this.f6209q.digest();
                int length = digest.length;
                int i4 = this.f6210r;
                if (length > i4) {
                    length = i4;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                if ((this.f6211s & 7) > 0) {
                    long j4 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        if (i5 > 0) {
                            j4 <<= 8;
                        }
                        j4 += bArr[i5] & 255;
                    }
                    long j5 = j4 >>> (8 - (this.f6211s & 7));
                    int i6 = this.f6210r;
                    while (true) {
                        i6--;
                        if (i6 < 0) {
                            break;
                        }
                        bArr[i6] = (byte) (255 & j5);
                        j5 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
