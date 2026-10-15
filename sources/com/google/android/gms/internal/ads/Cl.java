package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Cl extends AbstractC0659gl {
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7 A[ADDED_TO_REGION, LOOP:6: B:43:0x00e7->B:44:0x00e9, LOOP_START, PHI: r0
      0x00e7: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:14:0x003d, B:44:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Cl.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final Fk g(Fk fk) {
        int i4 = fk.c;
        if (i4 != 3) {
            if (i4 == 2) {
                return Fk.f5070e;
            }
            if (i4 != 268435456 && i4 != 536870912 && i4 != 1342177280 && i4 != 805306368 && i4 != 1610612736 && i4 != 4) {
                throw new Sk(fk);
            }
        }
        return new Fk(fk.f5071a, fk.f5072b, 2);
    }
}
