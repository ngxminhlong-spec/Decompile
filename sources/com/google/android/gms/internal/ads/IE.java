package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class IE extends AbstractC0560eE {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1399xx f5562h;

    /* renamed from: i, reason: collision with root package name */
    public final Yv f5563i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5564j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5565k;

    /* renamed from: l, reason: collision with root package name */
    public long f5566l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5567m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5568n;

    /* renamed from: o, reason: collision with root package name */
    public NB f5569o;

    /* renamed from: p, reason: collision with root package name */
    public Z9 f5570p;

    /* renamed from: q, reason: collision with root package name */
    public final RC f5571q;

    public /* synthetic */ IE(Z9 z9, InterfaceC1399xx interfaceC1399xx, RC rc, UC uc, int i4) {
        Yv yv = Yv.f7918P;
        this.f5570p = z9;
        this.f5562h = interfaceC1399xx;
        this.f5571q = rc;
        this.f5563i = yv;
        this.f5564j = i4;
        this.f5565k = true;
        this.f5566l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void a(InterfaceC1159sE interfaceC1159sE) {
        GE ge = (GE) interfaceC1159sE;
        if (ge.f5151G) {
            for (KE ke : ge.f5148D) {
                ke.o();
                if (ke.f5999A != null) {
                    ke.f5999A = null;
                    ke.f6003f = null;
                }
            }
        }
        Op op = ge.f5174u;
        ExecutorService executorService = (ExecutorService) op.f6525p;
        HandlerC1117rF handlerC1117rF = (HandlerC1117rF) op.f6526q;
        if (handlerC1117rF != null) {
            handlerC1117rF.a(true);
        }
        executorService.execute(new RunnableC0744il(20, ge));
        executorService.shutdown();
        ge.f5178z.removeCallbacksAndMessages(null);
        ge.f5146B = null;
        ge.f5166W = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final InterfaceC1159sE b(C1202tE c1202tE, C1058pz c1058pz, long j4) {
        Px b4 = this.f5562h.b();
        NB nb = this.f5569o;
        if (nb != null) {
            b4.b(nb);
        }
        C1068q8 c1068q8 = c().f7970b;
        c1068q8.getClass();
        Zf.C(this.f8597g);
        C0882lv c0882lv = new C0882lv((E) this.f5571q.f6796o);
        Qw qw = new Qw(4, (CopyOnWriteArrayList) this.d.f6711q, c1202tE);
        C0831kn c0831kn = new C0831kn((CopyOnWriteArrayList) this.c.f9320q, c1202tE, 8, false);
        return new GE(c1068q8.f10317a, b4, c0882lv, this.f5563i, qw, c0831kn, this, c1058pz, this.f5564j, AbstractC0751is.t(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final synchronized Z9 c() {
        return this.f5570p;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void j(NB nb) {
        this.f5569o = nb;
        Looper.myLooper().getClass();
        Zf.C(this.f8597g);
        t();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final synchronized void p(Z9 z9) {
        this.f5570p = z9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void r() {
    }

    public final void s(long j4, boolean z4, boolean z5) {
        if (j4 == -9223372036854775807L) {
            j4 = this.f5566l;
        }
        if (!this.f5565k && this.f5566l == j4 && this.f5567m == z4 && this.f5568n == z5) {
            return;
        }
        this.f5566l = j4;
        this.f5567m = z4;
        this.f5568n = z5;
        this.f5565k = false;
        t();
    }

    public final void t() {
        long j4 = this.f5566l;
        boolean z4 = this.f5567m;
        boolean z5 = this.f5568n;
        Z9 c = c();
        AbstractC0484ch oe = new OE(j4, j4, z4, c, z5 ? c.c : null);
        if (this.f5565k) {
            oe = new AbstractC0816kE(oe);
        }
        k(oe);
    }
}
