package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Sj {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6999a = new HashMap();

    public final synchronized Rj a(String str) {
        return (Rj) this.f6999a.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(java.lang.String r6, com.google.android.gms.internal.ads.Pp r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.HashMap r0 = r5.f6999a     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.Rj r0 = new com.google.android.gms.internal.ads.Rj     // Catch: java.lang.Throwable -> L4e
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L20
        L12:
            com.google.android.gms.internal.ads.s9 r2 = r7.f6603a     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.internal.ads.ba r2 = r2.l()     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.Kp r3 = new com.google.android.gms.internal.ads.Kp     // Catch: com.google.android.gms.internal.ads.Kp -> L10 java.lang.Throwable -> L4e
            r3.<init>(r2)     // Catch: com.google.android.gms.internal.ads.Kp -> L10 java.lang.Throwable -> L4e
            throw r3     // Catch: com.google.android.gms.internal.ads.Kp -> L10 java.lang.Throwable -> L4e
        L20:
            if (r7 != 0) goto L23
            goto L31
        L23:
            com.google.android.gms.internal.ads.s9 r3 = r7.f6603a     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.ads.ba r1 = r3.q()     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r3 = move-exception
            com.google.android.gms.internal.ads.Kp r4 = new com.google.android.gms.internal.ads.Kp     // Catch: com.google.android.gms.internal.ads.Kp -> L31 java.lang.Throwable -> L4e
            r4.<init>(r3)     // Catch: com.google.android.gms.internal.ads.Kp -> L31 java.lang.Throwable -> L4e
            throw r4     // Catch: com.google.android.gms.internal.ads.Kp -> L31 java.lang.Throwable -> L4e
        L31:
            com.google.android.gms.internal.ads.n6 r3 = com.google.android.gms.internal.ads.AbstractC1066q6.m8     // Catch: java.lang.Throwable -> L4e
            O1.r r4 = O1.r.d     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.ads.p6 r4 = r4.c     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4e
            r4 = 1
            if (r3 != 0) goto L45
            goto L50
        L45:
            r3 = 0
            if (r7 != 0) goto L4a
        L48:
            r4 = r3
            goto L50
        L4a:
            r7.a()     // Catch: com.google.android.gms.internal.ads.Kp -> L48 java.lang.Throwable -> L4e
            goto L50
        L4e:
            r6 = move-exception
            goto L5a
        L50:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L4e
            java.util.HashMap r7 = r5.f6999a     // Catch: java.lang.Throwable -> L4e
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)
            return
        L5a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Sj.b(java.lang.String, com.google.android.gms.internal.ads.Pp):void");
    }
}
