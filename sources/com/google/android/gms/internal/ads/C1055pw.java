package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055pw extends AbstractC0287Ic {
    public final /* synthetic */ int c;

    public C1055pw(int i4, byte[] bArr) {
        this.c = i4;
        if (!Bs.q(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f5574a = k(1, bArr);
        this.f5575b = k(0, bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0287Ic
    public final AbstractC1012ow k(int i4, byte[] bArr) {
        switch (this.c) {
            case 0:
                return new C0969nw(bArr, i4, 0);
            default:
                return new C0969nw(bArr, i4, 1);
        }
    }
}
