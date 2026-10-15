package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xy implements InterfaceC1011ov {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f7719e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1313vx f7720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7721b;
    public final byte[] c;
    public final byte[] d;

    public Xy(C0458bx c0458bx) {
        this.f7720a = new C0882lv(((Zy) c0458bx.f8308q.f7687p).b());
        C0542dx c0542dx = c0458bx.f8307p;
        this.f7721b = c0542dx.f8528b;
        this.c = c0458bx.f8309r.b();
        if (c0542dx.c.equals(Iv.f5758J)) {
            this.d = Arrays.copyOf(f7719e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public Xy(C0671gx c0671gx) {
        String valueOf = String.valueOf(c0671gx.f8884p.d);
        this.f7720a = new C0621fq("HMAC".concat(valueOf), new SecretKeySpec(((Zy) c0671gx.f8885q.f7687p).b(), "HMAC"));
        C0841kx c0841kx = c0671gx.f8884p;
        this.f7721b = c0841kx.f9337b;
        this.c = c0671gx.f8886r.b();
        if (c0841kx.c.equals(C0798jx.d)) {
            this.d = Arrays.copyOf(f7719e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public Xy(InterfaceC1313vx interfaceC1313vx, int i4) {
        this.f7720a = interfaceC1313vx;
        this.f7721b = i4;
        this.c = new byte[0];
        this.d = new byte[0];
        if (i4 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC1313vx.h(i4, new byte[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1011ov
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.d;
        int length = bArr3.length;
        int i4 = this.f7721b;
        InterfaceC1313vx interfaceC1313vx = this.f7720a;
        byte[] bArr4 = this.c;
        if (!MessageDigest.isEqual(length > 0 ? Bs.J(bArr4, interfaceC1313vx.h(i4, Bs.J(bArr2, bArr3))) : Bs.J(bArr4, interfaceC1313vx.h(i4, bArr2)), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
