package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198tA {
    public static /* bridge */ C1155sA a(Object obj) {
        Dz dz = (Dz) obj;
        C1155sA c1155sA = dz.zzc;
        if (c1155sA != C1155sA.f10596f) {
            return c1155sA;
        }
        C1155sA b4 = C1155sA.b();
        dz.zzc = b4;
        return b4;
    }

    public static boolean b(Object obj, C1058pz c1058pz) {
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) c1058pz.d;
        int i4 = c1058pz.f10060a;
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        if (i6 == 0) {
            c1058pz.q(0);
            ((C1155sA) obj).c(i5 << 3, Long.valueOf(abstractC1012ow.u()));
            return true;
        }
        if (i6 == 1) {
            c1058pz.q(1);
            ((C1155sA) obj).c((i5 << 3) | 1, Long.valueOf(abstractC1012ow.t()));
            return true;
        }
        if (i6 == 2) {
            ((C1155sA) obj).c((i5 << 3) | 2, c1058pz.w());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                return false;
            }
            if (i6 != 5) {
                throw Oz.a();
            }
            c1058pz.q(5);
            C1155sA c1155sA = (C1155sA) obj;
            c1155sA.c((i5 << 3) | 5, Integer.valueOf(abstractC1012ow.n()));
            return true;
        }
        C1155sA b4 = C1155sA.b();
        int i7 = i5 << 3;
        while (c1058pz.t() != Integer.MAX_VALUE && b(b4, c1058pz)) {
        }
        if ((i7 | 4) != c1058pz.f10060a) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        if (b4.f10599e) {
            b4.f10599e = false;
        }
        ((C1155sA) obj).c(i7 | 3, b4);
        return true;
    }
}
