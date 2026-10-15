package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class IC extends AbstractC0816kE {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public IC(AbstractC0484ch abstractC0484ch) {
        super(abstractC0484ch);
        this.d = new Rg();
    }

    public IC(AbstractC0484ch abstractC0484ch, Z9 z9) {
        super(abstractC0484ch);
        this.d = z9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0816kE, com.google.android.gms.internal.ads.AbstractC0484ch
    public C1210tg d(int i4, C1210tg c1210tg, boolean z4) {
        switch (this.c) {
            case 0:
                AbstractC0484ch abstractC0484ch = this.f9283b;
                C1210tg d = abstractC0484ch.d(i4, c1210tg, z4);
                if (abstractC0484ch.e(d.c, (Rg) this.d, 0L).b()) {
                    Object obj = c1210tg.f10711a;
                    Object obj2 = c1210tg.f10712b;
                    int i5 = c1210tg.c;
                    long j4 = c1210tg.d;
                    C0442bh c0442bh = C0442bh.f8264b;
                    d.b(i5, j4, obj, obj2, true);
                } else {
                    d.f10713e = true;
                }
                return d;
            default:
                return super.d(i4, c1210tg, z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0816kE, com.google.android.gms.internal.ads.AbstractC0484ch
    public Rg e(int i4, Rg rg, long j4) {
        switch (this.c) {
            case 1:
                this.f9283b.e(i4, rg, j4);
                Z9 z9 = (Z9) this.d;
                rg.f6817b = z9;
                C1068q8 c1068q8 = z9.f7970b;
                return rg;
            default:
                return super.e(i4, rg, j4);
        }
    }
}
