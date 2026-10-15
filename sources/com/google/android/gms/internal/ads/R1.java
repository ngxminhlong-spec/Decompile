package com.google.android.gms.internal.ads;

import b0.C0208u;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class R1 implements J1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0463c2 f6772a;

    /* renamed from: e, reason: collision with root package name */
    public long f6774e;

    /* renamed from: g, reason: collision with root package name */
    public String f6776g;

    /* renamed from: h, reason: collision with root package name */
    public V f6777h;

    /* renamed from: i, reason: collision with root package name */
    public Q1 f6778i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6779j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6781l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f6775f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    public final C0208u f6773b = new C0208u(7);
    public final C0208u c = new C0208u(8);
    public final C0208u d = new C0208u(6);

    /* renamed from: k, reason: collision with root package name */
    public long f6780k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public final C1134rq f6782m = new C1134rq();

    public R1(C0463c2 c0463c2) {
        this.f6772a = c0463c2;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void a() {
        this.f6774e = 0L;
        this.f6781l = false;
        this.f6780k = -9223372036854775807L;
        Wj.m(this.f6775f);
        this.f6773b.f();
        this.c.f();
        this.d.f();
        Q1 q12 = this.f6778i;
        if (q12 != null) {
            q12.f6633g = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d8  */
    @Override // com.google.android.gms.internal.ads.J1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.gms.internal.ads.C1134rq r31) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.R1.f(com.google.android.gms.internal.ads.rq):void");
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void g(boolean z4) {
        Zf.C(this.f6777h);
        int i4 = AbstractC0751is.f9071a;
        if (z4) {
            Q1 q12 = this.f6778i;
            long j4 = this.f6774e;
            q12.f6631e = j4;
            long j5 = q12.f6635i;
            if (j5 != -9223372036854775807L) {
                boolean z5 = q12.f6636j;
                long j6 = j4 - q12.f6634h;
                q12.f6629a.d(j5, z5 ? 1 : 0, (int) j6, 0, null);
            }
            q12.f6633g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void h(D d, C0591f2 c0591f2) {
        c0591f2.a();
        c0591f2.b();
        this.f6776g = c0591f2.f8675e;
        c0591f2.b();
        V z4 = d.z(c0591f2.d, 2);
        this.f6777h = z4;
        this.f6778i = new Q1(z4);
        this.f6772a.b(d, c0591f2);
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void i(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f6780k = j4;
        }
        this.f6781l = ((i4 & 2) != 0) | this.f6781l;
    }
}
