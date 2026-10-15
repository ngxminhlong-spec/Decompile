package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V1 extends W1 {
    @Override // com.google.android.gms.internal.measurement.W1
    public final void a(long j4, Object obj) {
        ((AbstractC1575t1) ((N1) AbstractC1584v2.c.m(j4, obj))).f12028o = false;
    }

    @Override // com.google.android.gms.internal.measurement.W1
    public final void b(long j4, Object obj, Object obj2) {
        AbstractC1580u2 abstractC1580u2 = AbstractC1584v2.c;
        N1 n12 = (N1) abstractC1580u2.m(j4, obj);
        N1 n13 = (N1) abstractC1580u2.m(j4, obj2);
        int size = n12.size();
        int size2 = n13.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1575t1) n12).f12028o) {
                n12 = n12.c(size2 + size);
            }
            n12.addAll(n13);
        }
        if (size > 0) {
            n13 = n12;
        }
        AbstractC1584v2.h(j4, obj, n13);
    }
}
