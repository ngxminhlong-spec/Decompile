package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Py implements InterfaceC0583ev {

    /* renamed from: e, reason: collision with root package name */
    public static final R2 f6613e = new R2(5);

    /* renamed from: f, reason: collision with root package name */
    public static final R2 f6614f = new R2(6);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6615a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6616b;
    public final SecretKeySpec c;
    public final int d;

    public Py(int i4, byte[] bArr) {
        if (!Bs.q(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i4 != 12 && i4 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = i4;
        Yy.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.c = secretKeySpec;
        Cipher cipher = (Cipher) f6613e.get();
        cipher.init(1, secretKeySpec);
        byte[] b4 = b(cipher.doFinal(new byte[16]));
        this.f6615a = b4;
        this.f6616b = b(b4);
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i4 = 0;
        while (i4 < 15) {
            byte b4 = bArr[i4];
            int i5 = i4 + 1;
            bArr2[i4] = (byte) (((b4 + b4) ^ ((bArr[i5] & 255) >>> 7)) & 255);
            i4 = i5;
        }
        byte b5 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b5 + b5));
        return bArr2;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            bArr3[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0583ev
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i4 = this.d;
        int i5 = (length - i4) - 16;
        if (i5 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f6613e.get();
        SecretKeySpec secretKeySpec = this.c;
        cipher.init(1, secretKeySpec);
        byte[] c = c(cipher, 0, bArr, 0, this.d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] c2 = c(cipher, 1, bArr3, 0, bArr3.length);
        byte[] c4 = c(cipher, 2, bArr, this.d, i5);
        int i6 = length - 16;
        byte b4 = 0;
        for (int i7 = 0; i7 < 16; i7++) {
            b4 = (byte) (b4 | (((bArr[i6 + i7] ^ c2[i7]) ^ c[i7]) ^ c4[i7]));
        }
        if (b4 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f6614f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(c));
        return cipher2.doFinal(bArr, i4, i5);
    }

    public final byte[] c(Cipher cipher, int i4, byte[] bArr, int i5, int i6) {
        byte[] copyOf;
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i4;
        byte[] bArr3 = this.f6615a;
        if (i6 == 0) {
            return cipher.doFinal(d(bArr2, bArr3));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i7 = 0;
        int i8 = 0;
        while (i6 - i8 > 16) {
            for (int i9 = 0; i9 < 16; i9++) {
                doFinal[i9] = (byte) (bArr[(i5 + i8) + i9] ^ doFinal[i9]);
            }
            doFinal = cipher.doFinal(doFinal);
            i8 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i8 + i5, i5 + i6);
        if (copyOfRange.length == 16) {
            copyOf = d(copyOfRange, bArr3);
        } else {
            copyOf = Arrays.copyOf(this.f6616b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i7 >= length) {
                    break;
                }
                copyOf[i7] = (byte) (copyOf[i7] ^ copyOfRange[i7]);
                i7++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
        }
        return cipher.doFinal(d(doFinal, copyOf));
    }
}
