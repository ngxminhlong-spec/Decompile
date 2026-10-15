package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ry implements InterfaceC0583ev {

    /* renamed from: a, reason: collision with root package name */
    public final Vy f6870a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1011ov f6871b;
    public final int c;

    public Ry(Vy vy, InterfaceC1011ov interfaceC1011ov, int i4) {
        this.f6870a = vy;
        this.f6871b = interfaceC1011ov;
        this.c = i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0583ev
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i4 = this.c;
        if (length < i4) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i5 = length - i4;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i5);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i5, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f6871b.a(copyOfRange2, Bs.J(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        Oy oy = (Oy) this.f6870a;
        oy.getClass();
        int length2 = copyOfRange.length;
        int i6 = oy.f6543b;
        if (length2 < i6) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i6];
        System.arraycopy(copyOfRange, 0, bArr3, 0, i6);
        int i7 = oy.f6543b;
        int i8 = length2 - i7;
        byte[] bArr4 = new byte[i8];
        Cipher cipher = (Cipher) Oy.d.get();
        byte[] bArr5 = new byte[oy.c];
        System.arraycopy(bArr3, 0, bArr5, 0, i6);
        cipher.init(2, oy.f6542a, new IvParameterSpec(bArr5));
        if (cipher.doFinal(copyOfRange, i7, i8, bArr4, 0) == i8) {
            return bArr4;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
