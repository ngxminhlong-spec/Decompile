package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969nw extends AbstractC1012ow {
    public final /* synthetic */ int c;

    public C0969nw(byte[] bArr, int i4, int i5) {
        this.c = i5;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f9865b = AbstractC0883lw.c(bArr);
        this.f9864a = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int f() {
        switch (this.c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1012ow
    public final int[] h(int[] iArr, int i4) {
        switch (this.c) {
            case 0:
                int length = iArr.length;
                if (length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f9865b;
                int[] iArr4 = AbstractC0883lw.f9509a;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i4;
                System.arraycopy(iArr, 0, iArr2, 13, 3);
                return iArr2;
            default:
                int length2 = iArr.length;
                if (length2 != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length2 * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArr6 = (int[]) this.f9865b;
                int[] iArr7 = AbstractC0883lw.f9509a;
                System.arraycopy(iArr7, 0, r4, 0, iArr7.length);
                System.arraycopy(iArr6, 0, r4, iArr7.length, 8);
                int[] iArr8 = {0, 0, 0, 0, iArr8[12], iArr8[13], iArr8[14], iArr8[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
                AbstractC0883lw.b(iArr8);
                int[] copyOf = Arrays.copyOf(iArr8, 8);
                System.arraycopy(iArr7, 0, iArr5, 0, iArr7.length);
                System.arraycopy(copyOf, 0, iArr5, iArr7.length, 8);
                iArr5[12] = i4;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }
}
