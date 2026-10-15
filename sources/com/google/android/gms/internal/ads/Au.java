package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Au extends Bs {
    @Override // com.google.android.gms.internal.ads.Bs
    public final void E(AbstractC1439yu abstractC1439yu, Set set) {
        synchronized (abstractC1439yu) {
            try {
                if (abstractC1439yu.f4205v == null) {
                    abstractC1439yu.f4205v = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final int c(AbstractC1439yu abstractC1439yu) {
        int i4;
        synchronized (abstractC1439yu) {
            i4 = abstractC1439yu.f4206w - 1;
            abstractC1439yu.f4206w = i4;
        }
        return i4;
    }
}
