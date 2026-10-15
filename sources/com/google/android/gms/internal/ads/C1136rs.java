package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136rs extends AbstractRunnableC1008os {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ A2.i f10540p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractRunnableC1008os f10541q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1308vs f10542r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1136rs(C1308vs c1308vs, A2.i iVar, A2.i iVar2, AbstractRunnableC1008os abstractRunnableC1008os) {
        super(iVar);
        this.f10542r = c1308vs;
        this.f10540p = iVar2;
        this.f10541q = abstractRunnableC1008os;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1008os
    public final void a() {
        synchronized (this.f10542r.f11082f) {
            try {
                C1308vs c1308vs = this.f10542r;
                A2.i iVar = this.f10540p;
                c1308vs.f11081e.add(iVar);
                A2.r rVar = iVar.f26a;
                C1094qs c1094qs = new C1094qs(c1308vs, iVar, 0);
                rVar.getClass();
                rVar.f41b.e(new A2.l(A2.j.f27a, c1094qs));
                rVar.p();
                if (this.f10542r.f11087k.getAndIncrement() > 0) {
                    this.f10542r.f11080b.g("Already connected to the service.", new Object[0]);
                }
                C1308vs.b(this.f10542r, this.f10541q);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
