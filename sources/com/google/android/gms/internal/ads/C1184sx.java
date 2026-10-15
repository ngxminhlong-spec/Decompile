package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184sx implements InterfaceC1011ov {
    public static final byte[] d = {0};

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1011ov f10654a;

    /* renamed from: b, reason: collision with root package name */
    public final Jy f10655b;
    public final byte[] c;

    public C1184sx(InterfaceC1011ov interfaceC1011ov, Jy jy, byte[] bArr) {
        this.f10654a = interfaceC1011ov;
        this.f10655b = jy;
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1011ov
    public final void a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        Jy jy = Jy.f5944r;
        Jy jy2 = this.f10655b;
        if (jy2.equals(jy)) {
            bArr2 = Bs.J(bArr2, d);
        }
        byte[] bArr3 = new byte[0];
        if (!jy2.equals(Jy.f5945s)) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, length);
            bArr3 = copyOf;
        }
        if (!Arrays.equals(this.c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f10654a.a(bArr, bArr2);
    }
}
