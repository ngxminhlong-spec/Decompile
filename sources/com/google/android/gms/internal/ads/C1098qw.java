package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098qw implements InterfaceC0583ev {

    /* renamed from: b, reason: collision with root package name */
    public static final R2 f10432b = new R2(2);
    public static final boolean c;

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10433a;

    static {
        boolean z4;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        c = z4;
    }

    public C1098qw(byte[] bArr) {
        Yy.a(bArr.length);
        this.f10433a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0583ev
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (c) {
            ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        } else {
            if (!"The Android Project".equals(System.getProperty("java.vendor"))) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
        }
        R2 r22 = f10432b;
        ((Cipher) r22.get()).init(2, this.f10433a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) r22.get()).updateAAD(bArr2);
        }
        return ((Cipher) r22.get()).doFinal(bArr, 12, length - 12);
    }
}
