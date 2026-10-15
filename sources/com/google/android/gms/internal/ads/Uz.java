package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Uz extends Vz {
    @Override // com.google.android.gms.internal.ads.Vz
    public final List a(long j4, Object obj) {
        Lz lz = (Lz) BA.j(j4, obj);
        if (((AbstractC0459bz) lz).f8310o) {
            return lz;
        }
        int size = lz.size();
        Lz c = lz.c(size == 0 ? 10 : size + size);
        BA.o(j4, obj, c);
        return c;
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final void b(long j4, Object obj) {
        AbstractC0459bz abstractC0459bz = (AbstractC0459bz) ((Lz) BA.j(j4, obj));
        if (abstractC0459bz.f8310o) {
            abstractC0459bz.f8310o = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final void c(long j4, Object obj, Object obj2) {
        Lz lz = (Lz) BA.j(j4, obj);
        Lz lz2 = (Lz) BA.j(j4, obj2);
        int size = lz.size();
        int size2 = lz2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0459bz) lz).f8310o) {
                lz = lz.c(size2 + size);
            }
            lz.addAll(lz2);
        }
        if (size > 0) {
            lz2 = lz;
        }
        BA.o(j4, obj, lz2);
    }
}
