package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V1 implements J1 {

    /* renamed from: a, reason: collision with root package name */
    public final C1134rq f7215a;

    /* renamed from: b, reason: collision with root package name */
    public final M f7216b;
    public final String c;
    public V d;

    /* renamed from: e, reason: collision with root package name */
    public String f7217e;

    /* renamed from: f, reason: collision with root package name */
    public int f7218f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f7219g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7220h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7221i;

    /* renamed from: j, reason: collision with root package name */
    public long f7222j;

    /* renamed from: k, reason: collision with root package name */
    public int f7223k;

    /* renamed from: l, reason: collision with root package name */
    public long f7224l;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.M, java.lang.Object] */
    public V1(String str) {
        C1134rq c1134rq = new C1134rq(4);
        this.f7215a = c1134rq;
        c1134rq.f10536a[0] = -1;
        this.f7216b = new Object();
        this.f7224l = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void a() {
        this.f7218f = 0;
        this.f7219g = 0;
        this.f7221i = false;
        this.f7224l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void f(C1134rq c1134rq) {
        Zf.C(this.d);
        while (c1134rq.g() > 0) {
            int i4 = this.f7218f;
            C1134rq c1134rq2 = this.f7215a;
            if (i4 == 0) {
                byte[] bArr = c1134rq.f10536a;
                int i5 = c1134rq.f10537b;
                int i6 = c1134rq.c;
                while (true) {
                    if (i5 >= i6) {
                        c1134rq.e(i6);
                        break;
                    }
                    int i7 = i5 + 1;
                    byte b4 = bArr[i5];
                    boolean z4 = (b4 & 255) == 255;
                    boolean z5 = this.f7221i && (b4 & 224) == 224;
                    this.f7221i = z4;
                    if (z5) {
                        c1134rq.e(i7);
                        this.f7221i = false;
                        c1134rq2.f10536a[1] = bArr[i5];
                        this.f7219g = 2;
                        this.f7218f = 1;
                        break;
                    }
                    i5 = i7;
                }
            } else if (i4 != 1) {
                int min = Math.min(c1134rq.g(), this.f7223k - this.f7219g);
                this.d.f(min, c1134rq);
                int i8 = this.f7219g + min;
                this.f7219g = i8;
                int i9 = this.f7223k;
                if (i8 >= i9) {
                    long j4 = this.f7224l;
                    if (j4 != -9223372036854775807L) {
                        this.d.d(j4, 1, i9, 0, null);
                        this.f7224l += this.f7222j;
                    }
                    this.f7219g = 0;
                    this.f7218f = 0;
                }
            } else {
                int min2 = Math.min(c1134rq.g(), 4 - this.f7219g);
                c1134rq.a(c1134rq2.f10536a, this.f7219g, min2);
                int i10 = this.f7219g + min2;
                this.f7219g = i10;
                if (i10 >= 4) {
                    c1134rq2.e(0);
                    int h4 = c1134rq2.h();
                    M m4 = this.f7216b;
                    if (m4.a(h4)) {
                        this.f7223k = m4.f6186b;
                        if (!this.f7220h) {
                            long j5 = m4.f6188f;
                            int i11 = m4.c;
                            this.f7222j = (j5 * 1000000) / i11;
                            L1 l12 = new L1();
                            l12.f6094a = this.f7217e;
                            l12.f6101j = (String) m4.f6189g;
                            l12.f6102k = 4096;
                            l12.f6114w = m4.d;
                            l12.f6115x = i11;
                            l12.c = this.c;
                            this.d.a(new C0976o2(l12));
                            this.f7220h = true;
                        }
                        c1134rq2.e(0);
                        this.d.f(4, c1134rq2);
                        this.f7218f = 2;
                    } else {
                        this.f7219g = 0;
                        this.f7218f = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void g(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void h(D d, C0591f2 c0591f2) {
        c0591f2.a();
        c0591f2.b();
        this.f7217e = c0591f2.f8675e;
        c0591f2.b();
        this.d = d.z(c0591f2.d, 1);
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void i(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f7224l = j4;
        }
    }
}
