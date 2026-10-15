package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import n2.BinderC1813b;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259um implements InterfaceC1002om {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10937a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10938b;
    public final Object c;

    public /* synthetic */ C1259um(Context context, Object obj, int i4) {
        this.f10937a = i4;
        this.f10938b = context;
        this.c = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1002om
    public final Object a(Ep ep, C1434yp c1434yp, C0873lm c0873lm) {
        switch (this.f10937a) {
            case 0:
                C0621fq c0621fq = new C0621fq(c1434yp, (V9) c0873lm.f9463b, 7);
                Op op = new Op(ep, c1434yp, c0873lm.f9462a);
                C0783ji c0783ji = new C0783ji(24, c0621fq, (Object) null);
                n0.n nVar = new n0.n(c1434yp.f11501a0, 3);
                C0250Be c0250Be = (C0250Be) this.c;
                C1423ye c1423ye = c0250Be.c;
                C0250Be c0250Be2 = c0250Be.d;
                C1466ze c1466ze = new C1466ze(c1423ye, c0250Be2, op, c0783ji, nVar);
                C1414yB c1414yB = c1466ze.f11600j;
                c0621fq.f8749r = (Qg) c1414yB.c();
                ((Dm) c0873lm.c).L3(new BinderC0704hn((Gg) c1466ze.f11604n.c(), (Rh) c1466ze.f11606p.c(), (Qg) c1414yB.c(), (Vg) c1466ze.f11603m.c(), (Xg) c1466ze.f11607q.c(), (C1254uh) c0250Be2.f4108P.c(), (C0655gh) c1466ze.f11608r.c(), (Wh) c1466ze.f11609s.c(), (C1168sh) c1466ze.f11610t.c(), (Og) c1466ze.f11612v.c()));
                return c1466ze.f0();
            case 1:
                C0621fq c0621fq2 = new C0621fq(c1434yp, (V9) c0873lm.f9463b, 2);
                C0274Fe a4 = ((C0279Ge) this.c).a(new Op(ep, c1434yp, c0873lm.f9462a), new C0783ji(24, c0621fq2, (Object) null));
                C1414yB c1414yB2 = a4.f5043i;
                c0621fq2.f8749r = (Qg) c1414yB2.c();
                ((Dm) c0873lm.c).L3(new BinderC0704hn((Gg) a4.f5047m.c(), (Rh) a4.f5050p.c(), (Qg) c1414yB2.c(), (Vg) a4.f5046l.c(), (Xg) a4.f5051q.c(), (C1254uh) a4.f5040f.f5272m1.c(), (C0655gh) a4.f5053s.c(), (Wh) a4.f5054t.c(), (C1168sh) a4.f5055u.c(), (Og) a4.f5057w.c()));
                return a4.f0();
            default:
                C0621fq c0621fq3 = new C0621fq(c1434yp, (V9) c0873lm.f9463b, 3);
                Op op2 = new Op(ep, c1434yp, c0873lm.f9462a);
                Ij ij = new Ij(c0621fq3, null, 0);
                C0289Ie c0289Ie = (C0289Ie) this.c;
                C1423ye c1423ye2 = c0289Ie.c;
                C0289Ie c0289Ie2 = c0289Ie.d;
                C0284He c0284He = new C0284He(c1423ye2, c0289Ie2, op2, ij);
                C1414yB c1414yB3 = c0284He.f5451i;
                c0621fq3.f8749r = (Qg) c1414yB3.c();
                ((Dm) c0873lm.c).L3(new BinderC0661gn((Gg) c0284He.f5455m.c(), (Rh) c0284He.f5457o.c(), (Qg) c1414yB3.c(), (Vg) c0284He.f5454l.c(), (Xg) c0284He.f5458p.c(), (Og) c0284He.f5464v.c(), (C1254uh) c0289Ie2.f5671p1.c(), (Wh) c0284He.f5461s.c(), (C0655gh) c0284He.f5460r.c(), (Vh) c0284He.f5466x.c(), (C1168sh) c0284He.f5462t.c()));
                return c0284He.f0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1002om
    public final void b(Ep ep, C1434yp c1434yp, C0873lm c0873lm) {
        switch (this.f10937a) {
            case 0:
                Object obj = c0873lm.f9463b;
                try {
                    ((V9) obj).j3(c1434yp.f11499Z);
                    ((V9) obj).I0(c1434yp.f11494U, c1434yp.f11539v.toString(), ((Jp) ep.f4942a.f11290p).d, new BinderC1813b(this.f10938b), new BinderC1216tm(c0873lm), (InterfaceC1283v9) c0873lm.c);
                    return;
                } catch (RemoteException e4) {
                    Q1.I.x("Remote exception loading an app open RTB ad", e4);
                    throw new Exception(e4);
                }
            case 1:
                Object obj2 = c0873lm.f9463b;
                try {
                    ((V9) obj2).j3(c1434yp.f11499Z);
                    ((V9) obj2).i2(c1434yp.f11494U, c1434yp.f11539v.toString(), ((Jp) ep.f4942a.f11290p).d, new BinderC1813b(this.f10938b), new Hm(c0873lm), (InterfaceC1283v9) c0873lm.c);
                    return;
                } catch (RemoteException e5) {
                    Q1.I.x("Remote exception loading a interstitial RTB ad", e5);
                    throw new Exception(e5);
                }
            default:
                try {
                    Object obj3 = c0873lm.f9463b;
                    IInterface iInterface = c0873lm.c;
                    String str = c1434yp.f11499Z;
                    JSONObject jSONObject = c1434yp.f11539v;
                    ((V9) obj3).j3(str);
                    C1384xi c1384xi = ep.f4942a;
                    Jp jp = (Jp) c1384xi.f11290p;
                    int i4 = ((Jp) c1384xi.f11290p).f5920o.f14098p;
                    Context context = this.f10938b;
                    if (i4 == 3) {
                        ((V9) obj3).t1(c1434yp.f11494U, jSONObject.toString(), jp.d, new BinderC1813b(context), new BinderC0448bn(c0873lm), (InterfaceC1283v9) iInterface);
                    } else {
                        ((V9) obj3).z0(c1434yp.f11494U, jSONObject.toString(), jp.d, new BinderC1813b(context), new BinderC0448bn(c0873lm), (InterfaceC1283v9) iInterface);
                    }
                    return;
                } catch (RemoteException e6) {
                    Q1.I.x("Remote exception loading a rewarded RTB ad", e6);
                    return;
                }
        }
    }
}
