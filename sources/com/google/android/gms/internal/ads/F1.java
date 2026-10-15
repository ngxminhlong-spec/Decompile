package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F1 implements B {
    public final C1134rq c;
    public final X d;

    /* renamed from: e, reason: collision with root package name */
    public D f4968e;

    /* renamed from: f, reason: collision with root package name */
    public long f4969f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4971h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4972i;

    /* renamed from: a, reason: collision with root package name */
    public final G1 f4966a = new G1(true, null);

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f4967b = new C1134rq(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f4970g = -1;

    public F1() {
        C1134rq c1134rq = new C1134rq(10);
        this.c = c1134rq;
        byte[] bArr = c1134rq.f10536a;
        this.d = new X(bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        C1134rq c1134rq;
        C1316w c1316w;
        int i4 = 0;
        while (true) {
            c1134rq = this.c;
            c1316w = (C1316w) c;
            c1316w.E(c1134rq.f10536a, 0, 10, false);
            c1134rq.e(0);
            if (c1134rq.o() != 4801587) {
                break;
            }
            c1134rq.f(3);
            int l4 = c1134rq.l();
            i4 += l4 + 10;
            c1316w.c(l4, false);
        }
        c1316w.f11102t = 0;
        c1316w.c(i4, false);
        if (this.f4970g == -1) {
            this.f4970g = i4;
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = i4;
        do {
            c1316w.E(c1134rq.f10536a, 0, 2, false);
            c1134rq.e(0);
            if ((c1134rq.q() & 65526) == 65520) {
                i5++;
                if (i5 >= 4 && i6 > 188) {
                    return true;
                }
                c1316w.E(c1134rq.f10536a, 0, 4, false);
                X x4 = this.d;
                x4.q(14);
                int f4 = x4.f(13);
                if (f4 <= 6) {
                    i7++;
                    c1316w.f11102t = 0;
                    c1316w.c(i7, false);
                } else {
                    c1316w.c(f4 - 6, false);
                    i6 += f4;
                }
            } else {
                i7++;
                c1316w.f11102t = 0;
                c1316w.c(i7, false);
            }
            i5 = 0;
            i6 = 0;
        } while (i7 - i4 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f4968e = d;
        this.f4966a.h(d, new C0591f2(Integer.MIN_VALUE, 0, 1));
        d.x();
    }

    @Override // com.google.android.gms.internal.ads.B
    public final int h(C c, F f4) {
        Zf.C(this.f4968e);
        C1134rq c1134rq = this.f4967b;
        int r4 = ((C1316w) c).r(c1134rq.f10536a, 0, 2048);
        if (!this.f4972i) {
            this.f4968e.B(new G(-9223372036854775807L, 0L));
            this.f4972i = true;
        }
        if (r4 == -1) {
            return -1;
        }
        c1134rq.e(0);
        c1134rq.d(r4);
        boolean z4 = this.f4971h;
        G1 g12 = this.f4966a;
        if (!z4) {
            g12.i(4, this.f4969f);
            this.f4971h = true;
        }
        g12.f(c1134rq);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        this.f4971h = false;
        this.f4966a.a();
        this.f4969f = j5;
    }
}
