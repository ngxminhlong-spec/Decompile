package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1627n {
    protected int zza;

    public abstract int a(InterfaceC1622k0 interfaceC1622k0);

    public final byte[] b() {
        try {
            E e4 = (E) this;
            int c = e4.c();
            byte[] bArr = new byte[c];
            C1640u c1640u = new C1640u(c, bArr);
            InterfaceC1622k0 a4 = C1616h0.c.a(e4.getClass());
            W w2 = c1640u.f12249n0;
            if (w2 == null) {
                w2 = new W(c1640u);
            }
            a4.f(e4, w2);
            if (c - c1640u.f12252q0 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e5) {
            throw new RuntimeException(U.a.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e5);
        }
    }
}
