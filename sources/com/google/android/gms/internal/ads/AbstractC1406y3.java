package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.y3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1406y3 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f11328a;

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f11329b;
    public static final Object c = new Object();
    public static final Object d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f11330e = new CountDownLatch(1);

    public static String a(String str, byte[] bArr) {
        byte[] d4;
        int length = bArr.length;
        Vector vector = null;
        if (length > 0) {
            int i4 = length + 254;
            Vector vector2 = new Vector();
            for (int i5 = 0; i5 < i4 / 255; i5++) {
                int i6 = i5 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i6 > 255) {
                        length2 = i6 + 255;
                    }
                    vector2.add(Arrays.copyOfRange(bArr, i6, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            vector = vector2;
        }
        if (vector == null || vector.isEmpty()) {
            C0549e3 V4 = C0977o3.V();
            V4.d();
            C0977o3.F0((C0977o3) V4.f4561p, 4096L);
            d4 = d(((C0977o3) V4.b()).e(), str, true);
        } else {
            C1234u3 v4 = C1277v3.v();
            int size = vector.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0800jz A3 = AbstractC0886lz.A(d((byte[]) vector.get(i7), str, false), 0, 256);
                v4.d();
                C1277v3.w((C1277v3) v4.f4561p, A3);
            }
            byte[] c2 = c(bArr);
            C0800jz c0800jz = AbstractC0886lz.f9510p;
            C0800jz A4 = AbstractC0886lz.A(c2, 0, c2.length);
            v4.d();
            C1277v3.x((C1277v3) v4.f4561p, A4);
            d4 = ((C1277v3) v4.b()).e();
        }
        return Base64.encodeToString(d4, 11);
    }

    public static void b() {
        synchronized (d) {
            try {
                if (!f11328a) {
                    f11328a = true;
                    new Thread(new RunnableC0286Ib(1)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.AbstractC1406y3.f11329b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] c(byte[] r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.AbstractC1406y3.c
            monitor-enter(r0)
            b()     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.AbstractC1406y3.f11330e     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            if (r2 != 0) goto L14
            goto L1d
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.AbstractC1406y3.f11329b     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L19
            goto L1d
        L19:
            r1 = r2
            goto L1d
        L1b:
            r6 = move-exception
            goto L35
        L1d:
            if (r1 == 0) goto L2d
            r1.reset()     // Catch: java.lang.Throwable -> L1b
            r1.update(r6)     // Catch: java.lang.Throwable -> L1b
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.AbstractC1406y3.f11329b     // Catch: java.lang.Throwable -> L1b
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r6
        L2d:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            throw r6     // Catch: java.lang.Throwable -> L1b
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1406y3.c(byte[]):byte[]");
    }

    public static byte[] d(byte[] bArr, String str, boolean z4) {
        byte[] array;
        int length = bArr.length;
        int i4 = true != z4 ? 255 : 239;
        if (length > i4) {
            C0549e3 V4 = C0977o3.V();
            V4.d();
            C0977o3.F0((C0977o3) V4.f4561p, 4096L);
            bArr = ((C0977o3) V4.b()).e();
        }
        int i5 = i4 + 1;
        int length2 = bArr.length;
        byte b4 = (byte) length2;
        if (length2 < i4) {
            byte[] bArr2 = new byte[i4 - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i5).put(b4).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i5).put(b4).put(bArr).array();
        }
        if (z4) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        C3 c32 = new C3();
        for (int i6 = 0; i6 < 12; i6++) {
            c32.f4251G2[i6].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            C1320w3 c1320w3 = new C1320w3(0, str.getBytes("UTF-8"));
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < 256; i9++) {
                i7 = (i7 + 1) & 255;
                byte[] bArr4 = c1320w3.f11110o;
                byte b5 = bArr4[i7];
                i8 = (i8 + b5) & 255;
                bArr4[i7] = bArr4[i8];
                bArr4[i8] = b5;
                bArr3[i9] = (byte) (bArr4[(bArr4[i7] + b5) & 255] ^ bArr3[i9]);
            }
        }
        return bArr3;
    }
}
