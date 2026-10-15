package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1173sm implements InterfaceC1002om {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10632a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10633b;
    public final Executor c;
    public final Object d;

    public /* synthetic */ C1173sm(Context context, Object obj, Executor executor, int i4) {
        this.f10632a = i4;
        this.f10633b = context;
        this.d = obj;
        this.c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0bc9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(com.google.android.gms.internal.ads.Ep r56, com.google.android.gms.internal.ads.C1434yp r57, com.google.android.gms.internal.ads.C0873lm r58) {
        /*
            Method dump skipped, instructions count: 3066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1173sm.c(com.google.android.gms.internal.ads.Ep, com.google.android.gms.internal.ads.yp, com.google.android.gms.internal.ads.lm):java.lang.Object");
    }

    public static final boolean d(Ep ep, int i4) {
        return ((Jp) ep.f4942a.f11290p).f5912g.contains(Integer.toString(i4));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1002om
    public final Object a(Ep ep, C1434yp c1434yp, C0873lm c0873lm) {
        Exception exc;
        View view;
        int i4 = this.f10632a;
        Executor executor = this.c;
        Object obj = this.d;
        switch (i4) {
            case 0:
                Op op = new Op(ep, c1434yp, c0873lm.f9462a);
                C0783ji c0783ji = new C0783ji(24, new C1130rm(c0873lm, 0), (Object) null);
                n0.n nVar = new n0.n(c1434yp.f11501a0, 3);
                C0250Be c0250Be = (C0250Be) obj;
                C1423ye c1423ye = c0250Be.c;
                C0250Be c0250Be2 = c0250Be.d;
                C1466ze c1466ze = new C1466ze(c1423ye, c0250Be2, op, c0783ji, nVar);
                ((Ug) c1466ze.f11598h.c()).m1(new C0482cf(0, (Pp) c0873lm.f9463b), executor);
                ((Dm) c0873lm.c).L3(new BinderC0746in((Gg) c1466ze.f11604n.c(), (Rh) c1466ze.f11606p.c(), (Qg) c1466ze.f11600j.c(), (Vg) c1466ze.f11603m.c(), (Xg) c1466ze.f11607q.c(), (C1254uh) c0250Be2.f4108P.c(), (C0655gh) c1466ze.f11608r.c(), (Wh) c1466ze.f11609s.c(), (C1168sh) c1466ze.f11610t.c(), (Og) c1466ze.f11612v.c()));
                return c1466ze.f0();
            case 1:
                Object obj2 = c0873lm.f9463b;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.P6)).booleanValue() && c1434yp.f11511g0) {
                    try {
                        C1326w9 j4 = ((Pp) obj2).f6603a.j();
                        if (j4 == null) {
                            Y9.p("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new Exception(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            boolean z4 = true;
                            Parcel q12 = j4.q1(j4.Q(), 1);
                            InterfaceC1812a G12 = BinderC1813b.G1(q12.readStrongBinder());
                            q12.recycle();
                            view = (View) BinderC1813b.C2(G12);
                            Parcel q13 = j4.q1(j4.Q(), 2);
                            ClassLoader classLoader = AbstractC1192t4.f10673a;
                            if (q13.readInt() == 0) {
                                z4 = false;
                            }
                            q13.recycle();
                            if (view == null) {
                                throw new Exception(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (z4) {
                                try {
                                    view = (View) Bs.n0(Pu.f6608p, new C0568eg(this, view, c1434yp, 4), AbstractC0266Ec.f4899e).get();
                                } catch (InterruptedException | ExecutionException e4) {
                                    throw new Exception(e4);
                                }
                            }
                        } catch (RemoteException e42) {
                            throw new Exception(e42);
                        }
                    } finally {
                    }
                } else {
                    try {
                        view = (View) BinderC1813b.C2(((Pp) obj2).f6603a.m());
                    } finally {
                    }
                }
                C0262De c0262De = (C0262De) obj;
                Op op2 = new Op(ep, c1434yp, c0873lm.f9462a);
                Pp pp = (Pp) obj2;
                u0.g gVar = new u0.g(view, (C0348Ud) null, new Xj(6, pp), (C1477zp) c1434yp.f11538u.get(0));
                C1423ye c1423ye2 = c0262De.d;
                C0262De c0262De2 = c0262De.f4690e;
                C0256Ce c0256Ce = new C0256Ce(c1423ye2, c0262De2, op2, gVar);
                ((Qh) c0256Ce.y.c()).r1(view);
                ((Ug) c0256Ce.f4465h.c()).m1(new C0482cf(0, pp), executor);
                ((Dm) c0873lm.c).L3(new BinderC0746in((Gg) c0256Ce.f4469l.c(), (Rh) c0256Ce.f4474q.c(), (Qg) c0256Ce.f4471n.c(), (Vg) c0256Ce.f4468k.c(), c0256Ce.g0(), (C1254uh) c0262De2.f4721o1.c(), (C0655gh) c0256Ce.f4477t.c(), (Wh) c0256Ce.f4478u.c(), (C1168sh) c0256Ce.f4479v.c(), (Og) c0256Ce.f4480w.c()));
                return c0256Ce.f0();
            default:
                return c(ep, c1434yp, c0873lm);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1002om
    public final void b(Ep ep, C1434yp c1434yp, C0873lm c0873lm) {
        Exception exc;
        O1.X0 c;
        switch (this.f10632a) {
            case 0:
                Pp pp = (Pp) c0873lm.f9463b;
                Jp jp = (Jp) ep.f4942a.f11290p;
                String jSONObject = c1434yp.f11539v.toString();
                Context context = this.f10633b;
                try {
                    pp.f6603a.M0(new BinderC1813b(context), jp.d, jSONObject, (InterfaceC1283v9) c0873lm.c);
                    return;
                } finally {
                }
            case 1:
                IInterface iInterface = c0873lm.c;
                Object obj = c0873lm.f9463b;
                C1384xi c1384xi = ep.f4942a;
                Jp jp2 = (Jp) c1384xi.f11290p;
                O1.X0 x02 = ((Jp) c1384xi.f11290p).f5910e;
                boolean z4 = x02.f1320B;
                int i4 = x02.f1323p;
                int i5 = x02.f1326s;
                Context context2 = this.f10633b;
                if (z4) {
                    H1.f fVar = new H1.f(i5, i4);
                    fVar.d = true;
                    fVar.f869e = i4;
                    c = new O1.X0(context2, fVar);
                } else {
                    if (((Boolean) O1.r.d.c.a(AbstractC1066q6.P6)).booleanValue() && c1434yp.f11511g0) {
                        H1.f fVar2 = new H1.f(i5, i4);
                        fVar2.f870f = true;
                        fVar2.f871g = i4;
                        c = new O1.X0(context2, fVar2);
                    } else {
                        c = Zf.c(context2, c1434yp.f11538u);
                    }
                }
                O1.X0 x03 = c;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.P6)).booleanValue() && c1434yp.f11511g0) {
                    Pp pp2 = (Pp) obj;
                    String jSONObject2 = c1434yp.f11539v.toString();
                    String H3 = android.support.v4.media.session.a.H(c1434yp.f11534s);
                    try {
                        pp2.f6603a.b1(new BinderC1813b(context2), x03, jp2.d, jSONObject2, H3, (InterfaceC1283v9) iInterface);
                        return;
                    } finally {
                    }
                }
                Pp pp3 = (Pp) obj;
                String jSONObject3 = c1434yp.f11539v.toString();
                String H4 = android.support.v4.media.session.a.H(c1434yp.f11534s);
                try {
                    pp3.f6603a.s2(new BinderC1813b(context2), x03, jp2.d, jSONObject3, H4, (InterfaceC1283v9) iInterface);
                    return;
                } finally {
                }
            default:
                Pp pp4 = (Pp) c0873lm.f9463b;
                Jp jp3 = (Jp) ep.f4942a.f11290p;
                String jSONObject4 = c1434yp.f11539v.toString();
                String H5 = android.support.v4.media.session.a.H(c1434yp.f11534s);
                InterfaceC1283v9 interfaceC1283v9 = (InterfaceC1283v9) c0873lm.c;
                Jp jp4 = (Jp) ep.f4942a.f11290p;
                C0766j7 c0766j7 = jp4.f5914i;
                Context context3 = this.f10633b;
                try {
                    pp4.f6603a.o0(new BinderC1813b(context3), jp3.d, jSONObject4, H5, interfaceC1283v9, c0766j7, jp4.f5912g);
                    return;
                } finally {
                }
        }
    }
}
