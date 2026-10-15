package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832ko implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f9321a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final C1798a f9322b;
    public final Go c;
    public final long d;

    public C0832ko(Go go, long j4, C1798a c1798a) {
        this.f9322b = c1798a;
        this.c = go;
        this.d = j4;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        return 16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3 < android.os.SystemClock.elapsedRealtime()) goto L6;
     */
    @Override // com.google.android.gms.internal.ads.Go
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c3.InterfaceFutureC0239a c() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r7.f9321a
            java.lang.Object r1 = r0.get()
            com.google.android.gms.internal.ads.jo r1 = (com.google.android.gms.internal.ads.C0789jo) r1
            if (r1 == 0) goto L19
            l2.a r2 = r1.c
            long r3 = r1.f9220b
            r2.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L2b
        L19:
            com.google.android.gms.internal.ads.jo r1 = new com.google.android.gms.internal.ads.jo
            com.google.android.gms.internal.ads.Go r2 = r7.c
            c3.a r2 = r2.c()
            long r3 = r7.d
            l2.a r5 = r7.f9322b
            r1.<init>(r2, r3, r5)
            r0.set(r1)
        L2b:
            c3.a r0 = r1.f9219a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0832ko.c():c3.a");
    }
}
