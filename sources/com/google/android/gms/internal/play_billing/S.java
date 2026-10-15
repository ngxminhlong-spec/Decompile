package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class S extends T {
    @Override // com.google.android.gms.internal.play_billing.T
    public final void a(long j4, Object obj) {
        AbstractC1631p abstractC1631p = (AbstractC1631p) ((J) AbstractC1645w0.h(j4, obj));
        if (abstractC1631p.f12238o) {
            abstractC1631p.f12238o = false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.T
    public final void b(long j4, Object obj, Object obj2) {
        J j5 = (J) AbstractC1645w0.h(j4, obj);
        J j6 = (J) AbstractC1645w0.h(j4, obj2);
        int size = j5.size();
        int size2 = j6.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1631p) j5).f12238o) {
                j5 = j5.c(size2 + size);
            }
            j5.addAll(j6);
        }
        if (size > 0) {
            j6 = j5;
        }
        AbstractC1645w0.l(j4, obj, j6);
    }
}
