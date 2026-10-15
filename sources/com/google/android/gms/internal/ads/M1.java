package com.google.android.gms.internal.ads;

import b0.C0208u;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class M1 implements J1 {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f6192q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f6193a;

    /* renamed from: b, reason: collision with root package name */
    public V f6194b;
    public final C0463c2 c;
    public final C1134rq d;

    /* renamed from: e, reason: collision with root package name */
    public final C0208u f6195e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f6196f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final K1 f6197g;

    /* renamed from: h, reason: collision with root package name */
    public long f6198h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6199i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6200j;

    /* renamed from: k, reason: collision with root package name */
    public long f6201k;

    /* renamed from: l, reason: collision with root package name */
    public long f6202l;

    /* renamed from: m, reason: collision with root package name */
    public long f6203m;

    /* renamed from: n, reason: collision with root package name */
    public long f6204n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6205o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6206p;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.K1, java.lang.Object] */
    public M1(C0463c2 c0463c2) {
        C1134rq c1134rq;
        this.c = c0463c2;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.f6197g = obj;
        if (c0463c2 != null) {
            this.f6195e = new C0208u(178);
            c1134rq = new C1134rq();
        } else {
            c1134rq = null;
            this.f6195e = null;
        }
        this.d = c1134rq;
        this.f6202l = -9223372036854775807L;
        this.f6204n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void a() {
        Wj.m(this.f6196f);
        K1 k1 = this.f6197g;
        k1.f5961a = false;
        k1.f5962b = 0;
        k1.c = 0;
        C0208u c0208u = this.f6195e;
        if (c0208u != null) {
            c0208u.f();
        }
        this.f6198h = 0L;
        this.f6199i = false;
        this.f6202l = -9223372036854775807L;
        this.f6204n = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    @Override // com.google.android.gms.internal.ads.J1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.gms.internal.ads.C1134rq r23) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M1.f(com.google.android.gms.internal.ads.rq):void");
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void g(boolean z4) {
        Zf.C(this.f6194b);
        if (z4) {
            boolean z5 = this.f6205o;
            long j4 = this.f6198h - this.f6203m;
            this.f6194b.d(this.f6204n, z5 ? 1 : 0, (int) j4, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void h(D d, C0591f2 c0591f2) {
        c0591f2.a();
        c0591f2.b();
        this.f6193a = c0591f2.f8675e;
        c0591f2.b();
        this.f6194b = d.z(c0591f2.d, 2);
        C0463c2 c0463c2 = this.c;
        if (c0463c2 != null) {
            c0463c2.b(d, c0591f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void i(int i4, long j4) {
        this.f6202l = j4;
    }
}
