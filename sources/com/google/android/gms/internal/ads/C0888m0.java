package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888m0 implements B {

    /* renamed from: a, reason: collision with root package name */
    public final C1134rq f9514a = new C1134rq(4);

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f9515b = new C1134rq(9);
    public final C1134rq c = new C1134rq(11);
    public final C1134rq d = new C1134rq();

    /* renamed from: e, reason: collision with root package name */
    public final C0931n0 f9516e;

    /* renamed from: f, reason: collision with root package name */
    public D f9517f;

    /* renamed from: g, reason: collision with root package name */
    public int f9518g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9519h;

    /* renamed from: i, reason: collision with root package name */
    public long f9520i;

    /* renamed from: j, reason: collision with root package name */
    public int f9521j;

    /* renamed from: k, reason: collision with root package name */
    public int f9522k;

    /* renamed from: l, reason: collision with root package name */
    public int f9523l;

    /* renamed from: m, reason: collision with root package name */
    public long f9524m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9525n;

    /* renamed from: o, reason: collision with root package name */
    public C0845l0 f9526o;

    /* renamed from: p, reason: collision with root package name */
    public C1017p0 f9527p;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.n0, com.google.android.gms.internal.ads.AA] */
    public C0888m0() {
        ?? aa = new AA(new A());
        aa.f9691q = -9223372036854775807L;
        aa.f9692r = new long[0];
        aa.f9693s = new long[0];
        this.f9516e = aa;
        this.f9518g = 1;
    }

    public final C1134rq a(C c) {
        int i4 = this.f9523l;
        C1134rq c1134rq = this.d;
        byte[] bArr = c1134rq.f10536a;
        if (i4 > bArr.length) {
            int length = bArr.length;
            c1134rq.c(0, new byte[Math.max(length + length, i4)]);
        } else {
            c1134rq.e(0);
        }
        c1134rq.d(this.f9523l);
        ((C1316w) c).C(c1134rq.f10536a, 0, this.f9523l, false);
        return c1134rq;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        C1134rq c1134rq = this.f9514a;
        C1316w c1316w = (C1316w) c;
        c1316w.E(c1134rq.f10536a, 0, 3, false);
        c1134rq.e(0);
        if (c1134rq.o() == 4607062) {
            c1316w.E(c1134rq.f10536a, 0, 2, false);
            c1134rq.e(0);
            if ((c1134rq.q() & 250) == 0) {
                c1316w.E(c1134rq.f10536a, 0, 4, false);
                c1134rq.e(0);
                int h4 = c1134rq.h();
                c1316w.f11102t = 0;
                c1316w.c(h4, false);
                c1316w.E(c1134rq.f10536a, 0, 4, false);
                c1134rq.e(0);
                if (c1134rq.h() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f9517f = d;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v35, types: [com.google.android.gms.internal.ads.l0, com.google.android.gms.internal.ads.AA] */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.C r31, com.google.android.gms.internal.ads.F r32) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0888m0.h(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        if (j4 == 0) {
            this.f9518g = 1;
            this.f9519h = false;
        } else {
            this.f9518g = 3;
        }
        this.f9521j = 0;
    }
}
