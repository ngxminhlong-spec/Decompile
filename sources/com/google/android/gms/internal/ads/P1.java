package com.google.android.gms.internal.ads;

import b0.C0208u;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P1 implements J1 {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f6550l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final C0463c2 f6551a;

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f6552b;
    public final boolean[] c = new boolean[4];
    public final N1 d;

    /* renamed from: e, reason: collision with root package name */
    public final C0208u f6553e;

    /* renamed from: f, reason: collision with root package name */
    public O1 f6554f;

    /* renamed from: g, reason: collision with root package name */
    public long f6555g;

    /* renamed from: h, reason: collision with root package name */
    public String f6556h;

    /* renamed from: i, reason: collision with root package name */
    public V f6557i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6558j;

    /* renamed from: k, reason: collision with root package name */
    public long f6559k;

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.N1, java.lang.Object] */
    public P1(C0463c2 c0463c2) {
        this.f6551a = c0463c2;
        ?? obj = new Object();
        obj.f6301e = new byte[128];
        this.d = obj;
        this.f6559k = -9223372036854775807L;
        this.f6553e = new C0208u(178);
        this.f6552b = new C1134rq();
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void a() {
        Wj.m(this.c);
        N1 n12 = this.d;
        n12.f6299a = false;
        n12.c = 0;
        n12.f6300b = 0;
        O1 o12 = this.f6554f;
        if (o12 != null) {
            o12.f6426b = false;
            o12.c = false;
            o12.d = false;
            o12.f6427e = -1;
        }
        this.f6553e.f();
        this.f6555g = 0L;
        this.f6559k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0161  */
    @Override // com.google.android.gms.internal.ads.J1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.gms.internal.ads.C1134rq r20) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P1.f(com.google.android.gms.internal.ads.rq):void");
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void g(boolean z4) {
        Zf.C(this.f6554f);
        if (z4) {
            this.f6554f.b(0, this.f6555g, this.f6558j);
            O1 o12 = this.f6554f;
            o12.f6426b = false;
            o12.c = false;
            o12.d = false;
            o12.f6427e = -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void h(D d, C0591f2 c0591f2) {
        c0591f2.a();
        c0591f2.b();
        this.f6556h = c0591f2.f8675e;
        c0591f2.b();
        V z4 = d.z(c0591f2.d, 2);
        this.f6557i = z4;
        this.f6554f = new O1(z4);
        this.f6551a.b(d, c0591f2);
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void i(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f6559k = j4;
        }
    }
}
