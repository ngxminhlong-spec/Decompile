package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class S implements B {

    /* renamed from: a, reason: collision with root package name */
    public final int f6873a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6874b;
    public final String c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f6875e;

    /* renamed from: f, reason: collision with root package name */
    public D f6876f;

    /* renamed from: g, reason: collision with root package name */
    public V f6877g;

    public S(int i4, int i5, String str) {
        this.f6873a = i4;
        this.f6874b = i5;
        this.c = str;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        int i4 = this.f6874b;
        int i5 = this.f6873a;
        Zf.X((i5 == -1 || i4 == -1) ? false : true);
        C1134rq c1134rq = new C1134rq(i4);
        ((C1316w) c).E(c1134rq.f10536a, 0, i4, false);
        return c1134rq.q() == i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.P, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f6876f = d;
        V z4 = d.z(1024, 4);
        this.f6877g = z4;
        L1 l12 = new L1();
        l12.f6100i = this.c;
        l12.f6091C = 1;
        l12.f6092D = 1;
        z4.a(new C0976o2(l12));
        this.f6876f.x();
        this.f6876f.B(new Object());
        this.f6875e = 1;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final int h(C c, F f4) {
        int i4 = this.f6875e;
        if (i4 != 1) {
            if (i4 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        V v4 = this.f6877g;
        v4.getClass();
        int e4 = v4.e(c, 1024, true);
        if (e4 != -1) {
            this.d += e4;
            return 0;
        }
        this.f6875e = 2;
        this.f6877g.d(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        if (j4 == 0 || this.f6875e == 1) {
            this.f6875e = 1;
            this.d = 0;
        }
    }
}
