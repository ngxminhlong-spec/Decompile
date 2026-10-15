package com.google.android.gms.internal.ads;

import Q1.C0111j;
import android.content.Context;
import android.view.View;
import b0.RunnableC0203p;
import c3.InterfaceFutureC0239a;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0568eg implements Du {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8630b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0568eg(InterfaceC0745im interfaceC0745im, C1434yp c1434yp, Ep ep, C0347Uc c0347Uc, int i4) {
        this.f8629a = i4;
        this.f8630b = interfaceC0745im;
        this.c = c1434yp;
        this.d = ep;
    }

    public /* synthetic */ C0568eg(Object obj, Object obj2, Object obj3, int i4) {
        this.f8629a = i4;
        this.f8630b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.Du
    public final InterfaceFutureC0239a l(Object obj) {
        switch (this.f8629a) {
            case 0:
                C0611fg c0611fg = (C0611fg) this.f8630b;
                C0275Ga c0275Ga = (C0275Ga) this.c;
                InterfaceFutureC0239a interfaceFutureC0239a = (InterfaceFutureC0239a) this.d;
                Yf yf = (Yf) obj;
                if (yf != null) {
                    c0275Ga.mo4r(yf);
                }
                return Bs.o0(interfaceFutureC0239a, ((Long) AbstractC0383a7.f8082a.r()).longValue(), TimeUnit.MILLISECONDS, c0611fg.f8716b);
            case 1:
                Aj aj = (Aj) this.f8630b;
                String str = (String) this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                C0469c8 c0469c8 = aj.f3979i;
                c0469c8.getClass();
                C0272Fc c0272Fc = new C0272Fc();
                Q1.N n4 = N1.n.f1204A.c;
                String uuid = UUID.randomUUID().toString();
                c0469c8.b(uuid, new C0896m8(c0272Fc, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", uuid);
                    jSONObject2.put("args", jSONObject);
                    interfaceC0308Md.l(str, jSONObject2);
                } catch (Exception e4) {
                    c0272Fc.c(e4);
                }
                return c0272Fc;
            case 2:
                C1088qm c1088qm = (C1088qm) this.f8630b;
                C1434yp c1434yp = (C1434yp) this.c;
                Ep ep = (Ep) this.d;
                Ap ap = (Ap) ep.f4943b.f6526q;
                Oj oj = c1088qm.f10397b;
                Jp jp = c1088qm.c;
                final C0348Ud a4 = oj.a(jp.f5910e, c1434yp, ap);
                a4.F(c1434yp.f11496W);
                C0272Fc c0272Fc2 = new C0272Fc();
                Op op = new Op(ep, c1434yp, (String) null);
                boolean z4 = c1088qm.f10400g;
                C0640g8 c0640g8 = c1088qm.f10399f;
                C0783ji c0783ji = new C0783ji(24, new Z.c(c1088qm.f10398e, c0272Fc2, c1434yp, a4, jp, z4, c0640g8, c1088qm.f10401h), a4);
                n0.n nVar = new n0.n(c1434yp.f11501a0, 3);
                C0250Be c0250Be = c1088qm.f10396a;
                C1466ze c1466ze = new C1466ze(c0250Be.c, c0250Be.d, op, c0783ji, nVar);
                C1414yB c1414yB = c1466ze.f11613w;
                ((Nj) c1414yB.c()).a(a4, false, c1088qm.f10400g ? c0640g8 : null);
                c0272Fc2.b(c1466ze);
                final int i4 = 0;
                ((Qg) c1466ze.f11600j.c()).m1(new Sg() { // from class: com.google.android.gms.internal.ads.pm
                    @Override // com.google.android.gms.internal.ads.Sg
                    public final void p() {
                        switch (i4) {
                            case 0:
                                C0396ae c0396ae = a4.f7165o.f7464A;
                                if (c0396ae != null) {
                                    c0396ae.j0();
                                    return;
                                }
                                return;
                            case 1:
                                C0396ae c0396ae2 = a4.f7165o.f7464A;
                                if (c0396ae2 != null) {
                                    c0396ae2.j0();
                                    return;
                                }
                                return;
                            case 2:
                                C0396ae c0396ae3 = a4.f7165o.f7464A;
                                if (c0396ae3 != null) {
                                    c0396ae3.j0();
                                    return;
                                }
                                return;
                            default:
                                C0396ae c0396ae4 = a4.f7165o.f7464A;
                                if (c0396ae4 != null) {
                                    c0396ae4.j0();
                                    return;
                                }
                                return;
                        }
                    }
                }, AbstractC0266Ec.f4900f);
                Cp cp = c1434yp.f11534s;
                return Bs.m0(Nj.b(a4, cp.f4552b, cp.f4551a), new C1253ug(a4, c1434yp, c1466ze, 1), c1088qm.d);
            case 3:
                C1345wm c1345wm = (C1345wm) this.f8630b;
                Ep ep2 = (Ep) this.c;
                C1434yp c1434yp2 = (C1434yp) this.d;
                Executor executor = c1345wm.f11195e;
                Context context = c1345wm.f11194b;
                O1.X0 c = Zf.c(context, c1434yp2.f11538u);
                final C0348Ud a5 = c1345wm.c.a(c, c1434yp2, (Ap) ep2.f4943b.f6526q);
                a5.F(c1434yp2.f11496W);
                View a6 = (((Boolean) O1.r.d.c.a(AbstractC1066q6.P6)).booleanValue() && c1434yp2.f11511g0) ? Qf.a(context, a5, c1434yp2) : new Pj(context, a5, (C0111j) c1345wm.f11196f.apply(c1434yp2));
                C0262De c0262De = c1345wm.f11193a;
                C0256Ce c0256Ce = new C0256Ce(c0262De.d, c0262De.f4690e, new Op(ep2, c1434yp2, (String) null), new u0.g(a6, a5, new C1302vm(a5), c.f1330w ? new C1477zp(-3, 0, true) : new C1477zp(c.f1326s, c.f1323p, false)));
                C1414yB c1414yB2 = c0256Ce.f4482z;
                ((Nj) c1414yB2.c()).a(a5, false, null);
                Qg qg = (Qg) c0256Ce.f4471n.c();
                final int i5 = 1;
                Sg sg = new Sg() { // from class: com.google.android.gms.internal.ads.pm
                    @Override // com.google.android.gms.internal.ads.Sg
                    public final void p() {
                        switch (i5) {
                            case 0:
                                C0396ae c0396ae = a5.f7165o.f7464A;
                                if (c0396ae != null) {
                                    c0396ae.j0();
                                    return;
                                }
                                return;
                            case 1:
                                C0396ae c0396ae2 = a5.f7165o.f7464A;
                                if (c0396ae2 != null) {
                                    c0396ae2.j0();
                                    return;
                                }
                                return;
                            case 2:
                                C0396ae c0396ae3 = a5.f7165o.f7464A;
                                if (c0396ae3 != null) {
                                    c0396ae3.j0();
                                    return;
                                }
                                return;
                            default:
                                C0396ae c0396ae4 = a5.f7165o.f7464A;
                                if (c0396ae4 != null) {
                                    c0396ae4.j0();
                                    return;
                                }
                                return;
                        }
                    }
                };
                C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
                qg.m1(sg, c0260Dc);
                Cp cp2 = c1434yp2.f11534s;
                C0272Fc b4 = Nj.b(a5, cp2.f4552b, cp2.f4551a);
                Xu xu = b4.f5017o;
                if (c1434yp2.f11487M) {
                    xu.a(new RunnableC0744il(3, a5), executor);
                }
                xu.a(new RunnableC0203p(29, c1345wm, a5), executor);
                return Bs.m0(b4, new C0563eb(3, c0256Ce), c0260Dc);
            case 4:
                return Bs.h0(Qf.a(((C1173sm) this.f8630b).f10633b, (View) this.c, (C1434yp) this.d));
            case 5:
                return Bs.h0(Qf.a(((Am) this.f8630b).f3993b, (View) this.c, (C1434yp) this.d));
            case 6:
                Gm gm = (Gm) this.f8630b;
                C1434yp c1434yp3 = (C1434yp) this.c;
                Ep ep3 = (Ep) this.d;
                Ap ap2 = (Ap) ep3.f4943b.f6526q;
                Oj oj2 = gm.c;
                Jp jp2 = gm.d;
                final C0348Ud a7 = oj2.a(jp2.f5910e, c1434yp3, ap2);
                a7.F(c1434yp3.f11496W);
                C0272Fc c0272Fc3 = new C0272Fc();
                Op op2 = new Op(ep3, c1434yp3, (String) null);
                boolean z5 = gm.f5336h;
                Context context2 = gm.f5332b;
                C0640g8 c0640g82 = gm.f5335g;
                C0274Fe a8 = ((C0279Ge) gm.f5338j).a(op2, new C0783ji(24, new Fm(context2, gm.f5334f, c0272Fc3, c1434yp3, a7, jp2, z5, c0640g82, gm.f5337i), a7));
                c0272Fc3.b(a8);
                final int i6 = 2;
                ((Qg) a8.f5043i.c()).m1(new Sg() { // from class: com.google.android.gms.internal.ads.pm
                    @Override // com.google.android.gms.internal.ads.Sg
                    public final void p() {
                        switch (i6) {
                            case 0:
                                C0396ae c0396ae = a7.f7165o.f7464A;
                                if (c0396ae != null) {
                                    c0396ae.j0();
                                    return;
                                }
                                return;
                            case 1:
                                C0396ae c0396ae2 = a7.f7165o.f7464A;
                                if (c0396ae2 != null) {
                                    c0396ae2.j0();
                                    return;
                                }
                                return;
                            case 2:
                                C0396ae c0396ae3 = a7.f7165o.f7464A;
                                if (c0396ae3 != null) {
                                    c0396ae3.j0();
                                    return;
                                }
                                return;
                            default:
                                C0396ae c0396ae4 = a7.f7165o.f7464A;
                                if (c0396ae4 != null) {
                                    c0396ae4.j0();
                                    return;
                                }
                                return;
                        }
                    }
                }, AbstractC0266Ec.f4900f);
                C1414yB c1414yB3 = a8.y;
                ((Nj) c1414yB3.c()).a(a7, true, gm.f5336h ? c0640g82 : null);
                Cp cp3 = c1434yp3.f11534s;
                return Bs.m0(Nj.b(a7, cp3.f4552b, cp3.f4551a), new C1253ug(a7, c1434yp3, a8, 2), gm.f5333e);
            case 7:
                Km km = (Km) this.f8630b;
                Ep ep4 = (Ep) this.c;
                C1434yp c1434yp4 = (C1434yp) this.d;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return Bs.f0(new Xk(3));
                }
                Jp jp3 = (Jp) ep4.f4942a.f11290p;
                if (jp3.f5916k <= 1) {
                    return Bs.m0(km.c(ep4, c1434yp4, jSONArray.getJSONObject(0)), C0932n1.f9700j, km.f6056b);
                }
                int length = jSONArray.length();
                Qp qp = km.d;
                int i7 = jp3.f5916k;
                qp.b(Math.min(length, jp3.f5916k));
                ArrayList arrayList = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    if (i8 < length) {
                        arrayList.add(km.c(ep4, c1434yp4, jSONArray.getJSONObject(i8)));
                    } else {
                        arrayList.add(Bs.f0(new Xk(3)));
                    }
                }
                return Bs.h0(arrayList);
            default:
                Gm gm2 = (Gm) this.f8630b;
                C1434yp c1434yp5 = (C1434yp) this.c;
                Ep ep5 = (Ep) this.d;
                Ap ap3 = (Ap) ep5.f4943b.f6526q;
                Oj oj3 = gm2.c;
                Jp jp4 = gm2.d;
                final C0348Ud a9 = oj3.a(jp4.f5910e, c1434yp5, ap3);
                a9.F(c1434yp5.f11496W);
                C0272Fc c0272Fc4 = new C0272Fc();
                Op op3 = new Op(ep5, c1434yp5, (String) null);
                Context context3 = gm2.f5332b;
                Oj oj4 = gm2.c;
                C0640g8 c0640g83 = gm2.f5335g;
                Ij ij = new Ij(new V2.l(context3, oj4, jp4, gm2.f5334f, c1434yp5, c0272Fc4, a9, c0640g83, gm2.f5336h, gm2.f5337i), a9, 0);
                C0289Ie c0289Ie = (C0289Ie) gm2.f5338j;
                C0284He c0284He = new C0284He(c0289Ie.c, c0289Ie.d, op3, ij);
                c0272Fc4.b(c0284He);
                a9.A0("/reward", new X7(4, (Vh) c0284He.f5466x.c()));
                final int i9 = 3;
                ((Qg) c0284He.f5451i.c()).m1(new Sg() { // from class: com.google.android.gms.internal.ads.pm
                    @Override // com.google.android.gms.internal.ads.Sg
                    public final void p() {
                        switch (i9) {
                            case 0:
                                C0396ae c0396ae = a9.f7165o.f7464A;
                                if (c0396ae != null) {
                                    c0396ae.j0();
                                    return;
                                }
                                return;
                            case 1:
                                C0396ae c0396ae2 = a9.f7165o.f7464A;
                                if (c0396ae2 != null) {
                                    c0396ae2.j0();
                                    return;
                                }
                                return;
                            case 2:
                                C0396ae c0396ae3 = a9.f7165o.f7464A;
                                if (c0396ae3 != null) {
                                    c0396ae3.j0();
                                    return;
                                }
                                return;
                            default:
                                C0396ae c0396ae4 = a9.f7165o.f7464A;
                                if (c0396ae4 != null) {
                                    c0396ae4.j0();
                                    return;
                                }
                                return;
                        }
                    }
                }, AbstractC0266Ec.f4900f);
                C1414yB c1414yB4 = c0284He.y;
                ((Nj) c1414yB4.c()).a(a9, true, gm2.f5336h ? c0640g83 : null);
                Cp cp4 = c1434yp5.f11534s;
                return Bs.m0(Nj.b(a9, cp4.f4552b, cp4.f4551a), new C1253ug(a9, c1434yp5, c0284He, 3), gm2.f5333e);
        }
    }
}
