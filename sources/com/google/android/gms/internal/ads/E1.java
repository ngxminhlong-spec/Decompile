package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E1 implements J1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4807a;

    /* renamed from: b, reason: collision with root package name */
    public final X f4808b;
    public final C1134rq c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public String f4809e;

    /* renamed from: f, reason: collision with root package name */
    public V f4810f;

    /* renamed from: g, reason: collision with root package name */
    public int f4811g;

    /* renamed from: h, reason: collision with root package name */
    public int f4812h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4813i;

    /* renamed from: j, reason: collision with root package name */
    public long f4814j;

    /* renamed from: k, reason: collision with root package name */
    public C0976o2 f4815k;

    /* renamed from: l, reason: collision with root package name */
    public int f4816l;

    /* renamed from: m, reason: collision with root package name */
    public long f4817m;

    public E1(String str, int i4) {
        this.f4807a = i4;
        switch (i4) {
            case 1:
                X x4 = new X(16, new byte[16]);
                this.f4808b = x4;
                this.c = new C1134rq(x4.f7583a);
                this.f4811g = 0;
                this.f4812h = 0;
                this.f4813i = false;
                this.f4817m = -9223372036854775807L;
                this.d = str;
                return;
            default:
                X x5 = new X(128, new byte[128]);
                this.f4808b = x5;
                this.c = new C1134rq(x5.f7583a);
                this.f4811g = 0;
                this.f4817m = -9223372036854775807L;
                this.d = str;
                return;
        }
    }

    private final void b(boolean z4) {
    }

    private final void c(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void a() {
        switch (this.f4807a) {
            case 0:
                this.f4811g = 0;
                this.f4812h = 0;
                this.f4813i = false;
                this.f4817m = -9223372036854775807L;
                return;
            default:
                this.f4811g = 0;
                this.f4812h = 0;
                this.f4813i = false;
                this.f4817m = -9223372036854775807L;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0389 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a6  */
    @Override // com.google.android.gms.internal.ads.J1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.gms.internal.ads.C1134rq r25) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.E1.f(com.google.android.gms.internal.ads.rq):void");
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void g(boolean z4) {
        int i4 = this.f4807a;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void h(D d, C0591f2 c0591f2) {
        switch (this.f4807a) {
            case 0:
                c0591f2.a();
                c0591f2.b();
                this.f4809e = c0591f2.f8675e;
                c0591f2.b();
                this.f4810f = d.z(c0591f2.d, 1);
                return;
            default:
                c0591f2.a();
                c0591f2.b();
                this.f4809e = c0591f2.f8675e;
                c0591f2.b();
                this.f4810f = d.z(c0591f2.d, 1);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void i(int i4, long j4) {
        switch (this.f4807a) {
            case 0:
                if (j4 != -9223372036854775807L) {
                    this.f4817m = j4;
                    return;
                }
                return;
            default:
                if (j4 != -9223372036854775807L) {
                    this.f4817m = j4;
                    return;
                }
                return;
        }
    }
}
