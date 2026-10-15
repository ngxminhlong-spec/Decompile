package com.google.android.gms.internal.ads;

import O1.InterfaceC0089t0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Gf extends Ff {

    /* renamed from: j, reason: collision with root package name */
    public final Context f5303j;

    /* renamed from: k, reason: collision with root package name */
    public final View f5304k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0308Md f5305l;

    /* renamed from: m, reason: collision with root package name */
    public final C1477zp f5306m;

    /* renamed from: n, reason: collision with root package name */
    public final Xf f5307n;

    /* renamed from: o, reason: collision with root package name */
    public final Gi f5308o;

    /* renamed from: p, reason: collision with root package name */
    public final Th f5309p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1328wB f5310q;

    /* renamed from: r, reason: collision with root package name */
    public final Executor f5311r;

    /* renamed from: s, reason: collision with root package name */
    public O1.X0 f5312s;

    public Gf(C1151s6 c1151s6, Context context, C1477zp c1477zp, View view, InterfaceC0308Md interfaceC0308Md, Xf xf, Gi gi, Th th, InterfaceC1328wB interfaceC1328wB, Executor executor) {
        super(c1151s6);
        this.f5303j = context;
        this.f5304k = view;
        this.f5305l = interfaceC0308Md;
        this.f5306m = c1477zp;
        this.f5307n = xf;
        this.f5308o = gi;
        this.f5309p = th;
        this.f5310q = interfaceC1328wB;
        this.f5311r = executor;
    }

    @Override // com.google.android.gms.internal.ads.Yf
    public final void a() {
        this.f5311r.execute(new D3(19, this));
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final int b() {
        C0937n6 c0937n6 = AbstractC1066q6.P6;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue() && this.f7859b.f11511g0) {
            if (!((Boolean) rVar.c.a(AbstractC1066q6.Q6)).booleanValue()) {
                return 0;
            }
        }
        return ((Ap) this.f7858a.f4943b.f6526q).c;
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final View c() {
        return this.f5304k;
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final InterfaceC0089t0 d() {
        try {
            return this.f5307n.b();
        } catch (Kp unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final C1477zp e() {
        O1.X0 x02 = this.f5312s;
        if (x02 != null) {
            return x02.f1330w ? new C1477zp(-3, 0, true) : new C1477zp(x02.f1326s, x02.f1323p, false);
        }
        C1434yp c1434yp = this.f7859b;
        if (c1434yp.f11504c0) {
            for (String str : c1434yp.f11500a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f5304k;
            return new C1477zp(view.getWidth(), view.getHeight(), false);
        }
        return (C1477zp) c1434yp.f11532r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final C1477zp f() {
        return this.f5306m;
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final void g() {
        Th th = this.f5309p;
        synchronized (th) {
            th.n1(C0782jh.f9185E);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final void h(FrameLayout frameLayout, O1.X0 x02) {
        InterfaceC0308Md interfaceC0308Md;
        if (frameLayout == null || (interfaceC0308Md = this.f5305l) == null) {
            return;
        }
        interfaceC0308Md.p0(C0887m.a(x02));
        frameLayout.setMinimumHeight(x02.f1324q);
        frameLayout.setMinimumWidth(x02.f1327t);
        this.f5312s = x02;
    }
}
