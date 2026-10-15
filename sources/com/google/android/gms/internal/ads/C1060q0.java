package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1060q0 implements B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10068a;

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f10069b;
    public final S c;

    public C1060q0(int i4) {
        this.f10068a = i4;
        switch (i4) {
            case 1:
                this.f10069b = new C1134rq(4);
                this.c = new S(-1, -1, "image/webp");
                return;
            default:
                this.f10069b = new C1134rq(4);
                this.c = new S(-1, -1, "image/heif");
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        switch (this.f10068a) {
            case 0:
                C1316w c1316w = (C1316w) c;
                c1316w.c(4, false);
                C1134rq c1134rq = this.f10069b;
                c1134rq.b(4);
                c1316w.E(c1134rq.f10536a, 0, 4, false);
                if (c1134rq.u() != 1718909296) {
                    return false;
                }
                c1134rq.b(4);
                c1316w.E(c1134rq.f10536a, 0, 4, false);
                return c1134rq.u() == ((long) 1751476579);
            default:
                C1134rq c1134rq2 = this.f10069b;
                c1134rq2.b(4);
                C1316w c1316w2 = (C1316w) c;
                c1316w2.E(c1134rq2.f10536a, 0, 4, false);
                if (c1134rq2.u() != 1380533830) {
                    return false;
                }
                c1316w2.c(4, false);
                c1134rq2.b(4);
                c1316w2.E(c1134rq2.f10536a, 0, 4, false);
                return c1134rq2.u() == 1464156752;
        }
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        switch (this.f10068a) {
            case 0:
                this.c.g(d);
                return;
            default:
                this.c.g(d);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.B
    public final int h(C c, F f4) {
        switch (this.f10068a) {
            case 0:
                return this.c.h(c, f4);
            default:
                return this.c.h(c, f4);
        }
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        switch (this.f10068a) {
            case 0:
                this.c.i(j4, j5);
                return;
            default:
                this.c.i(j4, j5);
                return;
        }
    }
}
