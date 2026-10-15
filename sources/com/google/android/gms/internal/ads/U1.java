package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U1 implements J1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7108a;

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f7109b;
    public final X c;
    public V d;

    /* renamed from: e, reason: collision with root package name */
    public String f7110e;

    /* renamed from: f, reason: collision with root package name */
    public C0976o2 f7111f;

    /* renamed from: g, reason: collision with root package name */
    public int f7112g;

    /* renamed from: h, reason: collision with root package name */
    public int f7113h;

    /* renamed from: i, reason: collision with root package name */
    public int f7114i;

    /* renamed from: j, reason: collision with root package name */
    public int f7115j;

    /* renamed from: k, reason: collision with root package name */
    public long f7116k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7117l;

    /* renamed from: m, reason: collision with root package name */
    public int f7118m;

    /* renamed from: n, reason: collision with root package name */
    public int f7119n;

    /* renamed from: o, reason: collision with root package name */
    public int f7120o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7121p;

    /* renamed from: q, reason: collision with root package name */
    public long f7122q;

    /* renamed from: r, reason: collision with root package name */
    public int f7123r;

    /* renamed from: s, reason: collision with root package name */
    public long f7124s;

    /* renamed from: t, reason: collision with root package name */
    public int f7125t;

    /* renamed from: u, reason: collision with root package name */
    public String f7126u;

    public U1(String str) {
        this.f7108a = str;
        C1134rq c1134rq = new C1134rq(1024);
        this.f7109b = c1134rq;
        byte[] bArr = c1134rq.f10536a;
        this.c = new X(bArr.length, bArr);
        this.f7116k = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void a() {
        this.f7112g = 0;
        this.f7116k = -9223372036854775807L;
        this.f7117l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0195, code lost:
    
        if (r23.f7117l == false) goto L68;
     */
    @Override // com.google.android.gms.internal.ads.J1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.gms.internal.ads.C1134rq r24) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.U1.f(com.google.android.gms.internal.ads.rq):void");
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void g(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void h(D d, C0591f2 c0591f2) {
        c0591f2.a();
        c0591f2.b();
        this.d = d.z(c0591f2.d, 1);
        c0591f2.b();
        this.f7110e = c0591f2.f8675e;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void i(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f7116k = j4;
        }
    }
}
