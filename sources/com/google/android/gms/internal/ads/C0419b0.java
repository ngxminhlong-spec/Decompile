package com.google.android.gms.internal.ads;

import H.C0034i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419b0 implements B {
    public int c;

    /* renamed from: e, reason: collision with root package name */
    public C0461c0 f8183e;

    /* renamed from: h, reason: collision with root package name */
    public long f8186h;

    /* renamed from: i, reason: collision with root package name */
    public C0546e0 f8187i;

    /* renamed from: m, reason: collision with root package name */
    public int f8191m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8192n;

    /* renamed from: a, reason: collision with root package name */
    public final C1134rq f8181a = new C1134rq(12);

    /* renamed from: b, reason: collision with root package name */
    public final C0034i f8182b = new Object();
    public D d = new C1016p(1);

    /* renamed from: g, reason: collision with root package name */
    public C0546e0[] f8185g = new C0546e0[0];

    /* renamed from: k, reason: collision with root package name */
    public long f8189k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f8190l = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f8188j = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f8184f = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        C1134rq c1134rq = this.f8181a;
        ((C1316w) c).E(c1134rq.f10536a, 0, 12, false);
        c1134rq.e(0);
        if (c1134rq.i() != 1179011410) {
            return false;
        }
        c1134rq.f(4);
        return c1134rq.i() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.c = 0;
        this.d = d;
        this.f8186h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a6  */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.C r31, com.google.android.gms.internal.ads.F r32) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0419b0.h(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        this.f8186h = -1L;
        this.f8187i = null;
        for (C0546e0 c0546e0 : this.f8185g) {
            if (c0546e0.f8540j == 0) {
                c0546e0.f8538h = 0;
            } else {
                c0546e0.f8538h = c0546e0.f8542l[AbstractC0751is.k(c0546e0.f8541k, j4, true)];
            }
        }
        if (j4 == 0) {
            this.c = this.f8185g.length != 0 ? 3 : 0;
        } else {
            this.c = 6;
        }
    }
}
