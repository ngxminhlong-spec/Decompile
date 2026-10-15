package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Qy implements InterfaceC0583ev {

    /* renamed from: a, reason: collision with root package name */
    public final C0926mw f6712a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6713b;

    public Qy(byte[] bArr) {
        Zy a4 = Zy.a(new byte[0]);
        if (!Bs.q(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f6712a = new C0926mw(bArr);
        this.f6713b = a4.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0583ev
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f6713b;
        int length = bArr3.length;
        C0926mw c0926mw = this.f6712a;
        if (length == 0) {
            return c0926mw.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
        }
        int i4 = AbstractC0415ax.f8180a;
        if (bArr.length >= length) {
            for (int i5 = 0; i5 < bArr3.length; i5++) {
                if (bArr[i5] == bArr3[i5]) {
                }
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length);
            return c0926mw.a(Arrays.copyOf(copyOfRange, 12), copyOfRange, bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
