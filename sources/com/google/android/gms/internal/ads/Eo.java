package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Eo implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4940a;

    /* renamed from: b, reason: collision with root package name */
    public FB f4941b;

    public /* synthetic */ Eo() {
        this.f4940a = 8;
    }

    public /* synthetic */ Eo(FB fb, int i4) {
        this.f4940a = i4;
        this.f4941b = fb;
    }

    public static void a(Eo eo, FB fb) {
        if (eo.f4941b != null) {
            throw new IllegalStateException();
        }
        eo.f4941b = fb;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f4940a) {
            case 0:
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new C0662go(c0260Dc, ((C0865le) this.f4941b).a(), 3);
            case 1:
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                return new C0662go(c0260Dc2, ((C0865le) this.f4941b).a(), 5);
            case 2:
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                ((C0865le) this.f4941b).a();
                return new C0576eo(c0260Dc3, 6);
            case 3:
                return new To((Sp) this.f4941b.c());
            case 4:
                return new C1133rp((Sp) this.f4941b.c());
            case 5:
                C0260Dc c0260Dc4 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc4);
                return new C1177sq(c0260Dc4, (C0242Ac) this.f4941b.c());
            case 6:
                return new Eq((Fq) this.f4941b.c());
            case 7:
                return new Eq((Fq) this.f4941b.c());
            default:
                FB fb = this.f4941b;
                if (fb != null) {
                    return fb.c();
                }
                throw new IllegalStateException();
        }
    }
}
