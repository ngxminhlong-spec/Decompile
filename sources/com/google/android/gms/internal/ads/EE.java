package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class EE implements LE {

    /* renamed from: a, reason: collision with root package name */
    public final int f4866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GE f4867b;

    public EE(GE ge, int i4) {
        this.f4867b = ge;
        this.f4866a = i4;
    }

    @Override // com.google.android.gms.internal.ads.LE
    public final boolean a() {
        GE ge = this.f4867b;
        return !ge.A() && ge.f5148D[this.f4866a].r(ge.f5165V);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r8 == (-1)) goto L28;
     */
    @Override // com.google.android.gms.internal.ads.LE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(long r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.GE r0 = r11.f4867b
            int r1 = r11.f4866a
            boolean r2 = r0.A()
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            r0.u(r1)
            com.google.android.gms.internal.ads.KE[] r2 = r0.f5148D
            r4 = r2[r1]
            boolean r2 = r0.f5165V
            monitor-enter(r4)
            int r5 = r4.f6014q     // Catch: java.lang.Throwable -> L4b
            r6 = r5
            int r5 = r4.i(r6)     // Catch: java.lang.Throwable -> L4b
            int r7 = r4.f6014q     // Catch: java.lang.Throwable -> L4b
            int r8 = r4.f6011n     // Catch: java.lang.Throwable -> L4b
            if (r7 == r8) goto L25
            r7 = 1
            goto L26
        L25:
            r7 = r3
        L26:
            if (r7 == 0) goto L4e
            long[] r7 = r4.f6009l     // Catch: java.lang.Throwable -> L4b
            r9 = r7[r5]     // Catch: java.lang.Throwable -> L4b
            int r7 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r7 >= 0) goto L31
            goto L4e
        L31:
            long r9 = r4.f6017t     // Catch: java.lang.Throwable -> L4b
            int r7 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r7 <= 0) goto L3d
            if (r2 != 0) goto L3a
            goto L3d
        L3a:
            int r8 = r8 - r6
            monitor-exit(r4)
            goto L50
        L3d:
            int r6 = r8 - r6
            r9 = 1
            r7 = r12
            int r8 = r4.h(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4b
            r12 = -1
            monitor-exit(r4)
            if (r8 != r12) goto L50
        L49:
            r8 = r3
            goto L50
        L4b:
            r0 = move-exception
            r12 = r0
            goto L5a
        L4e:
            monitor-exit(r4)
            goto L49
        L50:
            r4.q(r8)
            if (r8 != 0) goto L59
            r0.v(r1)
            return r3
        L59:
            return r8
        L5a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4b
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.EE.b(long):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
    
        if (r0 != 0) goto L77;
     */
    @Override // com.google.android.gms.internal.ads.LE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(com.google.android.gms.internal.ads.C0831kn r18, com.google.android.gms.internal.ads.RB r19, int r20) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.EE.c(com.google.android.gms.internal.ads.kn, com.google.android.gms.internal.ads.RB, int):int");
    }

    @Override // com.google.android.gms.internal.ads.LE
    public final void i() {
        IOException iOException;
        int i4 = this.f4866a;
        GE ge = this.f4867b;
        C0388aC c0388aC = ge.f5148D[i4].f5999A;
        if (c0388aC != null) {
            throw ((CD) c0388aC.f8087p);
        }
        int i5 = ge.f5157M == 7 ? 6 : 3;
        Op op = ge.f5174u;
        IOException iOException2 = (IOException) op.f6527r;
        if (iOException2 != null) {
            throw iOException2;
        }
        HandlerC1117rF handlerC1117rF = (HandlerC1117rF) op.f6526q;
        if (handlerC1117rF != null && (iOException = handlerC1117rF.f10470q) != null && handlerC1117rF.f10471r > i5) {
            throw iOException;
        }
    }
}
