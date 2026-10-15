package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759j0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0973o f9112a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1187t f9113b;
    public C1059q c;
    public final int d;

    public C0759j0(r rVar, InterfaceC1187t interfaceC1187t, long j4, long j5, long j6, long j7, long j8, int i4) {
        this.f9113b = interfaceC1187t;
        this.d = i4;
        this.f9112a = new C0973o(rVar, j4, j5, j6, j7, j8);
    }

    public static final int c(C c, long j4, F f4) {
        if (j4 == c.d()) {
            return 0;
        }
        f4.f4964a = j4;
        return 1;
    }

    public static /* bridge */ /* synthetic */ int d(int i4, byte[] bArr) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.google.android.gms.internal.ads.C r28, com.google.android.gms.internal.ads.F r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            com.google.android.gms.internal.ads.q r3 = r0.c
            com.google.android.gms.internal.ads.Zf.C(r3)
            long r4 = r3.f10065f
            long r6 = r3.f10066g
            long r6 = r6 - r4
            long r8 = r3.f10067h
            int r10 = r0.d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            com.google.android.gms.internal.ads.t r10 = r0.f9113b
            if (r6 > 0) goto L26
            r0.c = r7
            r10.c()
            int r1 = c(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.d()
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lc4
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lc4
            int r4 = (int) r4
            r5 = r1
            com.google.android.gms.internal.ads.w r5 = (com.google.android.gms.internal.ads.C1316w) r5
            r5.f(r4)
            r1.j()
            long r4 = r3.f10063b
            com.google.android.gms.internal.ads.s r4 = r10.d(r1, r4)
            int r5 = r4.f10558a
            r15 = r11
            long r11 = r4.f10559b
            r17 = r13
            long r13 = r4.c
            r4 = -3
            if (r5 == r4) goto Lba
            r4 = -2
            if (r5 == r4) goto L99
            r4 = -1
            if (r5 == r4) goto L7a
            long r3 = r1.d()
            long r3 = r13 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L70
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 > 0) goto L70
            int r3 = (int) r3
            r4 = r1
            com.google.android.gms.internal.ads.w r4 = (com.google.android.gms.internal.ads.C1316w) r4
            r4.f(r3)
        L70:
            r0.c = r7
            r10.c()
            int r1 = c(r1, r13, r2)
            return r1
        L7a:
            r3.f10064e = r11
            r3.f10066g = r13
            long r4 = r3.f10063b
            long r6 = r3.d
            long r8 = r3.f10065f
            r15 = r4
            long r4 = r3.c
            r25 = r4
            r17 = r6
            r21 = r8
            r19 = r11
            r23 = r13
            long r4 = com.google.android.gms.internal.ads.C1059q.a(r15, r17, r19, r21, r23, r25)
            r3.f10067h = r4
            goto L6
        L99:
            r4 = r11
            r6 = r13
            r3.d = r4
            r3.f10065f = r6
            long r8 = r3.f10063b
            long r10 = r3.f10064e
            long r12 = r3.f10066g
            long r14 = r3.c
            r17 = r4
            r21 = r6
            r19 = r10
            r23 = r12
            r25 = r14
            r15 = r8
            long r4 = com.google.android.gms.internal.ads.C1059q.a(r15, r17, r19, r21, r23, r25)
            r3.f10067h = r4
            goto L6
        Lba:
            r0.c = r7
            r10.c()
            int r1 = c(r1, r8, r2)
            return r1
        Lc4:
            int r1 = c(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0759j0.a(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, com.google.android.gms.internal.ads.q] */
    public final void b(long j4) {
        C1059q c1059q = this.c;
        if (c1059q == null || c1059q.f10062a != j4) {
            C0973o c0973o = this.f9112a;
            long d = c0973o.f9791a.d(j4);
            long j5 = c0973o.c;
            long j6 = c0973o.d;
            long j7 = c0973o.f9793e;
            long j8 = c0973o.f9794f;
            ?? obj = new Object();
            obj.f10062a = j4;
            obj.f10063b = d;
            obj.d = 0L;
            obj.f10064e = j5;
            obj.f10065f = j6;
            obj.f10066g = j7;
            obj.c = j8;
            obj.f10067h = C1059q.a(d, 0L, j5, j6, j7, j8);
            this.c = obj;
        }
    }
}
