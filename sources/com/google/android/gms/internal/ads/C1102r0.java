package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102r0 implements B {

    /* renamed from: b, reason: collision with root package name */
    public D f10440b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f10441e;

    /* renamed from: g, reason: collision with root package name */
    public L0 f10443g;

    /* renamed from: h, reason: collision with root package name */
    public C f10444h;

    /* renamed from: i, reason: collision with root package name */
    public N1.d f10445i;

    /* renamed from: j, reason: collision with root package name */
    public C1018p1 f10446j;

    /* renamed from: a, reason: collision with root package name */
    public final C1134rq f10439a = new C1134rq(6);

    /* renamed from: f, reason: collision with root package name */
    public long f10442f = -1;

    public final int a(C1316w c1316w) {
        C1134rq c1134rq = this.f10439a;
        c1134rq.b(2);
        c1316w.E(c1134rq.f10536a, 0, 2, false);
        return c1134rq.q();
    }

    public final void b() {
        c(new InterfaceC0479cc[0]);
        D d = this.f10440b;
        d.getClass();
        d.x();
        this.f10440b.B(new G(-9223372036854775807L, 0L));
        this.c = 6;
    }

    public final void c(InterfaceC0479cc... interfaceC0479ccArr) {
        D d = this.f10440b;
        d.getClass();
        V z4 = d.z(1024, 4);
        L1 l12 = new L1();
        l12.f6100i = "image/jpeg";
        l12.f6099h = new C1120rc(-9223372036854775807L, interfaceC0479ccArr);
        z4.a(new C0976o2(l12));
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        C1316w c1316w = (C1316w) c;
        if (a(c1316w) == 65496) {
            int a4 = a(c1316w);
            this.d = a4;
            C1134rq c1134rq = this.f10439a;
            if (a4 == 65504) {
                c1134rq.b(2);
                c1316w.E(c1134rq.f10536a, 0, 2, false);
                c1316w.c(c1134rq.q() - 2, false);
                a4 = a(c1316w);
                this.d = a4;
            }
            if (a4 == 65505) {
                c1316w.c(2, false);
                c1134rq.b(6);
                c1316w.E(c1134rq.f10536a, 0, 6, false);
                if (c1134rq.u() == 1165519206 && c1134rq.q() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f10440b = d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0166, code lost:
    
        r15 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.C r33, com.google.android.gms.internal.ads.F r34) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1102r0.h(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        if (j4 == 0) {
            this.c = 0;
            this.f10446j = null;
        } else if (this.c == 5) {
            C1018p1 c1018p1 = this.f10446j;
            c1018p1.getClass();
            c1018p1.i(j4, j5);
        }
    }
}
