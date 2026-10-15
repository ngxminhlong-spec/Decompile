package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Am implements InterfaceC1002om {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3992a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3993b;
    public final Object c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3994e;

    public Am(Context context, C0248Bc c0248Bc, C0279Ge c0279Ge, C0260Dc c0260Dc) {
        this.f3993b = context;
        this.d = c0248Bc;
        this.c = c0279Ge;
        this.f3994e = c0260Dc;
    }

    public Am(Context context, C0262De c0262De) {
        this.f3993b = context;
        this.c = c0262De;
    }

    public Am(Context context, C1251ue c1251ue, C0248Bc c0248Bc) {
        this.f3993b = context;
        this.c = c1251ue;
        this.f3994e = c0248Bc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC1002om
    public final Object a(Ep ep, C1434yp c1434yp, C0873lm c0873lm) {
        View view;
        int i4 = this.f3992a;
        Object obj = null;
        int i5 = 24;
        Object obj2 = this.c;
        int i6 = 1;
        switch (i4) {
            case 0:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.P6)).booleanValue() && c1434yp.f11511g0) {
                    try {
                        C1326w9 c1326w9 = (C1326w9) this.f3994e;
                        Parcel q12 = c1326w9.q1(c1326w9.Q(), 1);
                        InterfaceC1812a G12 = BinderC1813b.G1(q12.readStrongBinder());
                        q12.recycle();
                        view = (View) BinderC1813b.C2(G12);
                        C1326w9 c1326w92 = (C1326w9) this.f3994e;
                        Parcel q13 = c1326w92.q1(c1326w92.Q(), 2);
                        ClassLoader classLoader = AbstractC1192t4.f10673a;
                        boolean z4 = q13.readInt() != 0;
                        q13.recycle();
                        if (view == null) {
                            throw new Exception(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (z4) {
                            try {
                                view = (View) Bs.n0(Pu.f6608p, new C0568eg(this, view, c1434yp, 5), AbstractC0266Ec.f4899e).get();
                            } catch (InterruptedException | ExecutionException e4) {
                                throw new Exception(e4);
                            }
                        }
                    } catch (RemoteException e5) {
                        throw new Exception(e5);
                    }
                } else {
                    view = (View) this.d;
                }
                C0262De c0262De = (C0262De) obj2;
                Op op = new Op(ep, c1434yp, c0873lm.f9462a);
                u0.g gVar = new u0.g(view, (C0348Ud) null, new C1431ym(c0873lm), (C1477zp) c1434yp.f11538u.get(0));
                C1423ye c1423ye = c0262De.d;
                C0262De c0262De2 = c0262De.f4690e;
                C0256Ce c0256Ce = new C0256Ce(c1423ye, c0262De2, op, gVar);
                ((Qh) c0256Ce.y.c()).r1(view);
                ((Dm) c0873lm.c).L3(new BinderC0704hn((Gg) c0256Ce.f4469l.c(), (Rh) c0256Ce.f4474q.c(), (Qg) c0256Ce.f4471n.c(), (Vg) c0256Ce.f4468k.c(), c0256Ce.g0(), (C1254uh) c0262De2.f4721o1.c(), (C0655gh) c0256Ce.f4477t.c(), (Wh) c0256Ce.f4478u.c(), (C1168sh) c0256Ce.f4479v.c(), (Og) c0256Ce.f4480w.c()));
                return c0256Ce.f0();
            case 1:
                C0274Fe a4 = ((C0279Ge) obj2).a(new Op(ep, c1434yp, c0873lm.f9462a), new C0783ji(i5, new C1510e1((Object) this, (Object) c0873lm, 29, false), obj));
                ((Ug) a4.f5041g.c()).m1(new C0482cf(0 == true ? 1 : 0, (Pp) c0873lm.f9463b), (Executor) this.f3994e);
                ((Dm) c0873lm.c).L3(new BinderC0746in((Gg) a4.f5047m.c(), (Rh) a4.f5050p.c(), (Qg) a4.f5043i.c(), (Vg) a4.f5046l.c(), (Xg) a4.f5051q.c(), (C1254uh) a4.f5040f.f5272m1.c(), (C0655gh) a4.f5053s.c(), (Wh) a4.f5054t.c(), (C1168sh) a4.f5055u.c(), (Og) a4.f5057w.c()));
                return a4.f0();
            default:
                if (!((Jp) ep.f4942a.f11290p).f5912g.contains(Integer.toString(6))) {
                    throw new Xk("Unified must be used for RTB.", 2);
                }
                Ci R4 = Ci.R((B9) this.d);
                if (!((Jp) ep.f4942a.f11290p).f5912g.contains(Integer.toString(R4.D()))) {
                    throw new Xk("No corresponding native ad listener", 1);
                }
                C1251ue c1251ue = (C1251ue) obj2;
                Op op2 = new Op(ep, c1434yp, c0873lm.f9462a);
                C0874ln c0874ln = new C0874ln(28, R4);
                Object obj3 = null;
                Op op3 = new Op(obj3, obj3, this.d, 12, false);
                C1423ye c1423ye2 = c1251ue.f10845b;
                C1251ue c1251ue2 = c1251ue.c;
                C0654gg c0654gg = new C0654gg(op2, 0);
                C1414yB c1414yB = c1251ue2.f10795B;
                C4 c4 = c1423ye2.f11396b0;
                C1414yB b4 = C1414yB.b(new C0696hf(c1414yB, c0654gg, i6));
                C1414yB b5 = C1414yB.b(new C1037pe(b4, i5));
                int i7 = DB.c;
                ArrayList arrayList = new ArrayList(1);
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(c1251ue2.f10821P0);
                arrayList2.add(c1251ue2.f10823Q0);
                arrayList.add(b5);
                C1414yB b6 = C1414yB.b(new Hg(new DB(arrayList, arrayList2), 3));
                C1414yB b7 = C1414yB.b(Y9.f7758I);
                C1414yB c1414yB2 = c1423ye2.f11403g;
                C1414yB b8 = C1414yB.b(new C1123rf(b7, c1414yB2, 4));
                C0654gg c0654gg2 = new C0654gg(op2, 3);
                C0654gg c0654gg3 = new C0654gg(op2, 2);
                C0865le c0865le = c1423ye2.c;
                C1414yB b9 = C1414yB.b(new C1000ok(c0865le, 16));
                C1414yB b10 = C1414yB.b(Y9.f7766R);
                C0822ke c0822ke = c1423ye2.f11380M;
                C1414yB c1414yB3 = c1423ye2.N;
                C1414yB c1414yB4 = c1423ye2.f11399e;
                C1414yB b11 = C1414yB.b(new C0319Oe(c0865le, c1423ye2.f11403g, c1414yB4, c0654gg2, c0654gg, c1251ue2.f10815L0, C1414yB.b(new C0610ff(c1423ye2.f11368A, c1423ye2.f11369B, c0654gg, c0654gg3, C1414yB.b(new C0610ff(c0865le, c0822ke, b9, b10, c1414yB3, c1414yB4)), c1251ue2.f10852e)), new Hi(2), new Hi(0), c1423ye2.f11424z, c1251ue2.f10817M0, c1251ue2.f10852e, c1251ue2.f10831U0));
                C1037pe c1037pe = new C1037pe(b11, 17);
                C1037pe c1037pe2 = new C1037pe(C1414yB.b(new C0696hf(c0654gg, c1423ye2.f11378K, 0)), 27);
                ArrayList arrayList3 = new ArrayList(4);
                ArrayList arrayList4 = new ArrayList(2);
                arrayList3.add(c1251ue2.f10825R0);
                arrayList4.add(c1251ue2.f10827S0);
                arrayList4.add(c1251ue2.f10829T0);
                arrayList3.add(b8);
                arrayList3.add(c1037pe);
                arrayList3.add(c1037pe2);
                C1414yB b12 = C1414yB.b(new Hg(new DB(arrayList3, arrayList4), 4));
                C0865le c0865le2 = c1423ye2.c;
                C1414yB c1414yB5 = c1423ye2.f11387U;
                C1414yB c1414yB6 = c1423ye2.f11370C;
                C1414yB c1414yB7 = c1423ye2.f11368A;
                C1414yB b13 = C1414yB.b(new C0610ff(c0865le2, c1414yB5, c1414yB6, c0654gg2, c0654gg, c1414yB7));
                C1414yB b14 = C1414yB.b(new Bj(c1423ye2.c, c1414yB5, c0654gg2, c0654gg, c1414yB7, c1423ye2.f11401f, c1251ue2.f10867j));
                C1414yB b15 = C1414yB.b(new C1295vf(b13, b14, 7));
                C1414yB b16 = C1414yB.b(new C1123rf(b7, c1414yB2, 3));
                C1414yB b17 = C1414yB.b(new C1037pe(C1414yB.b(new Nf(c1423ye2.f11381O, c1251ue2.d, 1)), 23));
                C1037pe c1037pe3 = new C1037pe(b11, 16);
                ArrayList arrayList5 = new ArrayList(5);
                ArrayList arrayList6 = new ArrayList(3);
                arrayList5.add(c1251ue2.f10833V0);
                arrayList5.add(c1251ue2.f10835W0);
                arrayList6.add(c1251ue2.f10837X0);
                arrayList6.add(c1251ue2.f10839Y0);
                arrayList5.add(b15);
                arrayList5.add(b16);
                arrayList6.add(b17);
                arrayList5.add(c1037pe3);
                C1414yB b18 = C1414yB.b(new Hg(new DB(arrayList5, arrayList6), 0));
                C1414yB b19 = C1414yB.b(new C1295vf(b13, b14, 8));
                C1414yB b20 = C1414yB.b(new C1123rf(b7, c1414yB2, 6));
                C1414yB b21 = C1414yB.b(new C1123rf(b7, c1414yB2, 9));
                C1414yB b22 = C1414yB.b(Y9.f7764P);
                Zh zh = new Zh(b22, 14);
                ArrayList arrayList7 = new ArrayList(2);
                ArrayList arrayList8 = new ArrayList(1);
                arrayList8.add(c1251ue2.f10851d1);
                arrayList7.add(b21);
                arrayList7.add(zh);
                C1037pe c1037pe4 = new C1037pe(C1414yB.b(new C0371Zb(new DB(arrayList7, arrayList8), c0654gg, 2)), 12);
                C1037pe c1037pe5 = new C1037pe(b11, 19);
                ArrayList arrayList9 = new ArrayList(6);
                ArrayList arrayList10 = new ArrayList(2);
                arrayList9.add(c1251ue2.f10841Z0);
                arrayList9.add(c1251ue2.f10844a1);
                arrayList10.add(c1251ue2.f10847b1);
                arrayList10.add(c1251ue2.f10849c1);
                arrayList9.add(b19);
                arrayList9.add(b20);
                arrayList9.add(c1037pe4);
                arrayList9.add(c1037pe5);
                C1414yB b23 = C1414yB.b(new Hg(new DB(arrayList9, arrayList10), 2));
                C1037pe c1037pe6 = new C1037pe(b11, 21);
                ArrayList arrayList11 = new ArrayList(1);
                ArrayList arrayList12 = new ArrayList(1);
                arrayList12.add(c1251ue2.f10854e1);
                arrayList11.add(c1037pe6);
                C1414yB b24 = C1414yB.b(new Hg(new DB(arrayList11, arrayList12), 18));
                C1037pe c1037pe7 = new C1037pe(C1414yB.b(new C0696hf(c0654gg, c1423ye2.f11369B, 2)), 15);
                ArrayList arrayList13 = new ArrayList(1);
                new ArrayList(1).add(c1251ue2.f10857f1);
                arrayList13.add(c1037pe7);
                C1414yB b25 = C1414yB.b(new C1123rf(b7, c1414yB2, 10));
                ArrayList arrayList14 = new ArrayList(1);
                ArrayList arrayList15 = new ArrayList(1);
                arrayList15.add(c1251ue2.f10860g1);
                arrayList14.add(b25);
                C1414yB b26 = C1414yB.b(new Hg(new DB(arrayList14, arrayList15), 19));
                C1414yB b27 = C1414yB.b(new C1037pe(b4, 25));
                C1037pe c1037pe8 = new C1037pe(b11, 20);
                ArrayList arrayList16 = new ArrayList(6);
                ArrayList arrayList17 = new ArrayList(4);
                arrayList16.add(c1251ue2.f10863h1);
                arrayList17.add(c1251ue2.f10866i1);
                arrayList16.add(c1251ue2.f10869j1);
                arrayList16.add(c1251ue2.k1);
                arrayList17.add(c1251ue2.f10874l1);
                arrayList17.add(c1251ue2.f10877m1);
                arrayList17.add(c1251ue2.f10880n1);
                arrayList16.add(c1251ue2.f10883o1);
                arrayList16.add(b27);
                arrayList16.add(c1037pe8);
                C1414yB b28 = C1414yB.b(new Hg(new DB(arrayList16, arrayList17), 5));
                C1037pe c1037pe9 = new C1037pe(C1414yB.b(new C1037pe(b12, 11)), 22);
                C1414yB b29 = C1414yB.b(new C1123rf(b7, c1414yB2, 8));
                ArrayList arrayList18 = new ArrayList(2);
                ArrayList arrayList19 = new ArrayList(1);
                arrayList19.add(c1251ue2.f10889q1);
                arrayList18.add(c1037pe9);
                arrayList18.add(b29);
                C1414yB b30 = C1414yB.b(new Hg(new DB(arrayList18, arrayList19), 9));
                Lf lf = new Lf(7, c0874ln);
                C0371Zb c0371Zb = new C0371Zb(new C1212ti(lf, 1), c1414yB2, 8);
                ArrayList arrayList20 = new ArrayList(1);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add(c1251ue2.r1);
                arrayList20.add(c0371Zb);
                C1414yB b31 = C1414yB.b(new Hg(new DB(arrayList20, arrayList21), 22));
                C1414yB b32 = C1414yB.b(new C1295vf(b13, b14, 6));
                ArrayList arrayList22 = new ArrayList(1);
                List list = Collections.EMPTY_LIST;
                arrayList22.add(b32);
                C1414yB b33 = C1414yB.b(new Hg(new DB(arrayList22, list), 12));
                C1414yB b34 = C1414yB.b(new C1123rf(b7, c1414yB2, 5));
                C1037pe c1037pe10 = new C1037pe(b11, 18);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(c1251ue2.f10894s1);
                arrayList23.add(b34);
                arrayList23.add(c1037pe10);
                Hg hg = new Hg(new DB(arrayList23, arrayList24), 1);
                int i8 = 5;
                C1414yB b35 = C1414yB.b(new C1295vf(b13, b14, i8));
                ArrayList arrayList25 = new ArrayList(1);
                List list2 = Collections.EMPTY_LIST;
                arrayList25.add(b35);
                C1414yB b36 = C1414yB.b(new C1338wf((InterfaceC1457zB) hg, (InterfaceC1457zB) new DB(arrayList25, list2), c1423ye2.f11399e, i8));
                C0654gg c0654gg4 = new C0654gg(op2, 1);
                C1252uf c1252uf = new C1252uf(c0654gg, c0654gg4, c1251ue2.f10818O, c0654gg3, c1251ue2.f10855f, 1);
                ArrayList arrayList26 = new ArrayList(1);
                ArrayList arrayList27 = new ArrayList(1);
                arrayList27.add(c1251ue2.f10900u1);
                arrayList26.add(c1251ue2.f10903v1);
                C1124rg c1124rg = new C1124rg(c0654gg2, c0654gg, b6, b28, c1251ue2.f10897t1, c1252uf, b7, new Hg(new DB(arrayList26, arrayList27), 6), b24);
                Zh zh2 = new Zh(C1414yB.b(new Hf(new Xi(op3, 0), new Xi(op3, 1), new Xi(op3, 2), b23, b18, b26, c1251ue2.f10795B, c0654gg, c1423ye2.d, c1251ue2.d)), 15);
                C1414yB b37 = C1414yB.b(new C1424yf(c0654gg, 1));
                Hi hi = new Hi(3);
                Hi hi2 = new Hi(4);
                C1414yB b38 = C1414yB.b(new Lf(6, new C1212ti(lf, 0)));
                C0822ke c0822ke2 = c1423ye2.f11380M;
                Eg eg = c1251ue2.d;
                C1414yB c1414yB8 = c1423ye2.f11403g;
                W1.c cVar = new W1.c(c0822ke2, eg, b37, lf, hi, hi2, c1414yB8, b38);
                Eo eo = new Eo();
                C1414yB b39 = C1414yB.b(new C1127rj(c0654gg4, eo, lf, 1));
                C1414yB b40 = C1414yB.b(new C1127rj(c0654gg4, eo, lf, 0));
                C1414yB b41 = C1414yB.b(new C0245Af((InterfaceC1457zB) c0654gg4, (InterfaceC1457zB) eo, (InterfaceC1457zB) lf, c1423ye2.f11370C, 9));
                C1414yB b42 = C1414yB.b(new C0371Zb(eo, lf, 10));
                C0865le c0865le3 = c1423ye2.c;
                Eo.a(eo, C1414yB.b(new C1470zi(c1124rg, c1414yB8, lf, zh2, cVar, b37, c1251ue2.f10865i0, b39, b40, b41, b42, C1414yB.b(new C0245Af(c0865le3, lf, cVar, eo, 8)), new C0371Zb(c0865le3, c1251ue2.d, 7), c1423ye2.f11424z, c1423ye2.d, c0865le3, b38, b22, c1423ye2.f11406h0)));
                ((Dm) c0873lm.c).L3(new BinderC0704hn((Gg) b18.c(), (Rh) b26.c(), (Qg) b23.c(), (Vg) b12.c(), (Xg) b28.c(), (C1254uh) c1251ue2.f10886p1.c(), (C0655gh) b30.c(), (Wh) b31.c(), (C1168sh) b33.c(), (Og) b36.c()));
                return (C1427yi) eo.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1002om
    public final void b(Ep ep, C1434yp c1434yp, C0873lm c0873lm) {
        switch (this.f3992a) {
            case 0:
                try {
                    Object obj = c0873lm.f9463b;
                    IInterface iInterface = c0873lm.c;
                    String str = c1434yp.f11499Z;
                    JSONObject jSONObject = c1434yp.f11539v;
                    ((V9) obj).j3(str);
                    boolean booleanValue = ((Boolean) O1.r.d.c.a(AbstractC1066q6.P6)).booleanValue();
                    Context context = this.f3993b;
                    if (booleanValue && c1434yp.f11511g0) {
                        ((V9) obj).U2(c1434yp.f11494U, jSONObject.toString(), ((Jp) ep.f4942a.f11290p).d, new BinderC1813b(context), new BinderC1474zm(this, c0873lm), (InterfaceC1283v9) iInterface, ((Jp) ep.f4942a.f11290p).f5910e);
                        return;
                    } else {
                        ((V9) obj).R1(c1434yp.f11494U, jSONObject.toString(), ((Jp) ep.f4942a.f11290p).d, new BinderC1813b(context), new BinderC1474zm(this, c0873lm), (InterfaceC1283v9) iInterface, ((Jp) ep.f4942a.f11290p).f5910e);
                        return;
                    }
                } catch (RemoteException th) {
                    throw new Exception(th);
                }
            case 1:
                Pp pp = (Pp) c0873lm.f9463b;
                Jp jp = (Jp) ep.f4942a.f11290p;
                String jSONObject2 = c1434yp.f11539v.toString();
                String H3 = android.support.v4.media.session.a.H(c1434yp.f11534s);
                Context context2 = this.f3993b;
                try {
                    pp.f6603a.J2(new BinderC1813b(context2), jp.d, jSONObject2, H3, (InterfaceC1283v9) c0873lm.c);
                    return;
                } finally {
                    Exception exc = new Exception(th);
                }
            default:
                try {
                    Object obj2 = c0873lm.f9463b;
                    IInterface iInterface2 = c0873lm.c;
                    String str2 = c1434yp.f11499Z;
                    JSONObject jSONObject3 = c1434yp.f11539v;
                    ((V9) obj2).j3(str2);
                    int i4 = ((C0248Bc) this.f3994e).f4086q;
                    int intValue = ((Integer) O1.r.d.c.a(AbstractC1066q6.f10292u1)).intValue();
                    Context context3 = this.f3993b;
                    if (i4 < intValue) {
                        ((V9) obj2).x0(c1434yp.f11494U, jSONObject3.toString(), ((Jp) ep.f4942a.f11290p).d, new BinderC1813b(context3), new Lm(this, c0873lm), (InterfaceC1283v9) iInterface2);
                        return;
                    } else {
                        ((V9) obj2).T1(c1434yp.f11494U, jSONObject3.toString(), ((Jp) ep.f4942a.f11290p).d, new BinderC1813b(context3), new Lm(this, c0873lm), (InterfaceC1283v9) iInterface2, ((Jp) ep.f4942a.f11290p).f5914i);
                        return;
                    }
                } catch (RemoteException th2) {
                    throw new Exception(th2);
                }
        }
    }
}
