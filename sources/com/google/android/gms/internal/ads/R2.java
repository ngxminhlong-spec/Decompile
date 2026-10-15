package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class R2 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6783a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        switch (this.f6783a) {
            case 0:
                return ByteBuffer.allocate(32);
            case 1:
                try {
                    return (Cipher) Uy.f7211b.f7212a.o("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case 2:
                try {
                    return (Cipher) Uy.f7211b.f7212a.o("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 3:
                try {
                } catch (GeneralSecurityException unused) {
                    secureRandom = new SecureRandom();
                }
                try {
                    try {
                        try {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
                            } catch (GeneralSecurityException unused2) {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null));
                            }
                        } catch (GeneralSecurityException unused3) {
                            secureRandom = SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                        }
                    } catch (GeneralSecurityException unused4) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                } catch (ClassNotFoundException e6) {
                    e = e6;
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                } catch (IllegalAccessException e7) {
                    e = e7;
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                } catch (IllegalArgumentException e8) {
                    e = e8;
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                } catch (NoSuchMethodException e9) {
                    e = e9;
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                } catch (InvocationTargetException e10) {
                    e = e10;
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                }
            case 4:
                try {
                    return (Cipher) Uy.f7211b.f7212a.o("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 5:
                try {
                    return (Cipher) Uy.f7211b.f7212a.o("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case 6:
                try {
                    return (Cipher) Uy.f7211b.f7212a.o("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            default:
                return 0L;
        }
    }
}
