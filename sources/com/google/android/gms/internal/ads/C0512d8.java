package com.google.android.gms.internal.ads;

import O1.C0081p;
import Q1.C0120t;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.measurement.C1510e1;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.d8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0512d8 implements Du {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8464b;

    public /* synthetic */ C0512d8(int i4, Object obj) {
        this.f8463a = i4;
        this.f8464b = obj;
    }

    public /* synthetic */ C0512d8(Xq xq, C1384xi c1384xi) {
        this.f8463a = 25;
        this.f8464b = xq;
    }

    public /* synthetic */ C0512d8(C0811k9 c0811k9, Object obj) {
        this.f8463a = 2;
        this.f8464b = obj;
    }

    private final InterfaceFutureC0239a a(Object obj) {
        Xq xq = (Xq) this.f8464b;
        Exception exc = (Exception) obj;
        synchronized (xq) {
            xq.f7705p = true;
            throw exc;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.Du
    public final InterfaceFutureC0239a l(Object obj) {
        C0567ef c0567ef;
        C0600fB c0600fB;
        C1310vu m02;
        byte[] a4;
        Yp yp;
        C0450bp c0450bp;
        int i4 = 22;
        int i5 = 24;
        int i6 = 3;
        int i7 = 4;
        int i8 = 0;
        Object[] objArr = 0;
        int i9 = 5;
        int i10 = 2;
        int i11 = 1;
        switch (this.f8463a) {
            case 0:
                String str = (String) obj;
                C0427b8 c0427b8 = AbstractC0554e8.f8561a;
                return (!((Boolean) O1.r.d.c.a(AbstractC1066q6.G8)).booleanValue() || (c0567ef = (C0567ef) this.f8464b) == null) ? Bs.h0(str) : c0567ef.a(str, C0081p.f1374f.f1377e);
            case 1:
                C1196t8 c1196t8 = (C1196t8) obj;
                C0272Fc c0272Fc = new C0272Fc();
                BinderC1239u8 binderC1239u8 = new BinderC1239u8(c0272Fc);
                C1110r8 c1110r8 = (C1110r8) this.f8464b;
                Parcel Q3 = c1196t8.Q();
                AbstractC1192t4.c(Q3, c1110r8);
                AbstractC1192t4.e(Q3, binderC1239u8);
                c1196t8.C2(Q3, 2);
                return c0272Fc;
            case 2:
                Object obj2 = this.f8464b;
                C0272Fc c0272Fc2 = new C0272Fc();
                Q1.N n4 = N1.n.f1204A.c;
                String uuid = UUID.randomUUID().toString();
                AbstractC0554e8.f8568j.b(uuid, new C0896m8(c0272Fc2, 1));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", uuid);
                jSONObject.put("args", (JSONObject) obj2);
                ((InterfaceC0385a9) obj).l("google.afma.activeView.handleUpdate", jSONObject);
                return c0272Fc2;
            case 3:
                C0291Jb c0291Jb = (C0291Jb) this.f8464b;
                Map map = (Map) obj;
                if (map != null) {
                    try {
                        for (String str2 : map.keySet()) {
                            JSONArray optJSONArray = new JSONObject((String) map.get(str2)).optJSONArray("matches");
                            if (optJSONArray != null) {
                                synchronized (c0291Jb.f5862h) {
                                    try {
                                        int length = optJSONArray.length();
                                        synchronized (c0291Jb.f5862h) {
                                            c0600fB = (C0600fB) c0291Jb.f5858b.get(str2);
                                        }
                                        if (c0600fB == null) {
                                            AbstractC1230u.m("Cannot find the corresponding resource object for " + str2);
                                        } else {
                                            for (int i12 = 0; i12 < length; i12++) {
                                                String string = optJSONArray.getJSONObject(i12).getString("threat_type");
                                                c0600fB.d();
                                                C0643gB.B((C0643gB) c0600fB.f4561p, string);
                                            }
                                            c0291Jb.f5860f |= length > 0;
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
                    } catch (JSONException e4) {
                        if (((Boolean) V6.f7234a.r()).booleanValue()) {
                            Y9.o("Failed to get SafeBrowsing metadata", e4);
                        }
                        return Bs.f0(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (c0291Jb.f5860f) {
                    synchronized (c0291Jb.f5862h) {
                        KA ka = c0291Jb.f5857a;
                        ka.d();
                        C0813kB.J((C0813kB) ka.f4561p, 10);
                    }
                }
                boolean z4 = c0291Jb.f5860f;
                if (!(z4 && c0291Jb.f5861g.f6030u) && (!(c0291Jb.f5865k && c0291Jb.f5861g.f6029t) && (z4 || !c0291Jb.f5861g.f6027r))) {
                    return Pu.f6608p;
                }
                synchronized (c0291Jb.f5862h) {
                    try {
                        for (C0600fB c0600fB2 : c0291Jb.f5858b.values()) {
                            KA ka2 = c0291Jb.f5857a;
                            C0643gB c0643gB = (C0643gB) c0600fB2.b();
                            ka2.d();
                            C0813kB.C((C0813kB) ka2.f4561p, c0643gB);
                        }
                        KA ka3 = c0291Jb.f5857a;
                        ArrayList arrayList = c0291Jb.c;
                        ka3.d();
                        C0813kB.H((C0813kB) ka3.f4561p, arrayList);
                        KA ka4 = c0291Jb.f5857a;
                        ArrayList arrayList2 = c0291Jb.d;
                        ka4.d();
                        C0813kB.I((C0813kB) ka4.f4561p, arrayList2);
                        if (((Boolean) V6.f7234a.r()).booleanValue()) {
                            StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + ((C0813kB) c0291Jb.f5857a.f4561p).x() + "\n  clickUrl: " + ((C0813kB) c0291Jb.f5857a.f4561p).w() + "\n  resources: \n");
                            for (C0643gB c0643gB2 : Collections.unmodifiableList(((C0813kB) c0291Jb.f5857a.f4561p).y())) {
                                sb.append("    [");
                                sb.append(c0643gB2.v());
                                sb.append("] ");
                                sb.append(c0643gB2.x());
                            }
                            AbstractC1230u.m(sb.toString());
                        }
                        byte[] e5 = ((C0813kB) c0291Jb.f5857a.b()).e();
                        String str3 = c0291Jb.f5861g.f6025p;
                        new Q1.v(c0291Jb.f5859e);
                        C0120t a5 = Q1.v.a(1, str3, null, e5);
                        if (((Boolean) V6.f7234a.r()).booleanValue()) {
                            a5.f5017o.a(RunnableC0286Ib.f5572p, AbstractC0266Ec.f4897a);
                        }
                        m02 = Bs.m0(a5, C0932n1.d, AbstractC0266Ec.f4900f);
                    } finally {
                    }
                }
                return m02;
            case 4:
                return Bs.h0((String) this.f8464b);
            case 5:
                String str4 = (String) O1.r.d.c.a(AbstractC1066q6.J8);
                Uri.Builder builder = (Uri.Builder) this.f8464b;
                builder.appendQueryParameter(str4, "12");
                return Bs.h0(builder.toString());
            case 6:
                ((C0275Ga) this.f8464b).y((Throwable) obj);
                return Pu.f6608p;
            case 7:
                Op op = (Op) this.f8464b;
                final C0370Za c0370Za = (C0370Za) obj;
                Pu pu = Pu.f6608p;
                final int i13 = 0;
                As as = new As() { // from class: com.google.android.gms.internal.ads.sl
                    @Override // com.google.android.gms.internal.ads.As
                    public final Object apply(Object obj3) {
                        switch (i13) {
                            case 0:
                                C0370Za c0370Za2 = c0370Za;
                                return new C0305Ma(c0370Za2.f7991q, c0370Za2.f7992r, c0370Za2.f7994t, Bs.O(c0370Za2.f7989o.getString("ms")), -1, c0370Za2.f7996v, c0370Za2.f7993s, c0370Za2.y, c0370Za2.f7999z);
                            default:
                                JSONObject jSONObject2 = (JSONObject) obj3;
                                Bundle bundle = c0370Za.f7989o;
                                if (bundle == null) {
                                    return jSONObject2;
                                }
                                try {
                                    C0081p c0081p = C0081p.f1374f;
                                    JSONObject f4 = c0081p.f1375a.f(bundle);
                                    try {
                                        c0081p.f1375a.getClass();
                                        C1335wc.h(jSONObject2, f4);
                                        return jSONObject2;
                                    } catch (JSONException unused) {
                                        return f4;
                                    }
                                } catch (JSONException unused2) {
                                    return jSONObject2;
                                }
                        }
                    }
                };
                Su su = (Su) op.f6525p;
                final int i14 = 1;
                return Bs.m0(((C1006oq) op.f6527r).b(Bs.m0(pu, as, su), EnumC0877lq.f9487t).r(new C0512d8(16, (Op) op.f6526q)).d(), new As() { // from class: com.google.android.gms.internal.ads.sl
                    @Override // com.google.android.gms.internal.ads.As
                    public final Object apply(Object obj3) {
                        switch (i14) {
                            case 0:
                                C0370Za c0370Za2 = c0370Za;
                                return new C0305Ma(c0370Za2.f7991q, c0370Za2.f7992r, c0370Za2.f7994t, Bs.O(c0370Za2.f7989o.getString("ms")), -1, c0370Za2.f7996v, c0370Za2.f7993s, c0370Za2.y, c0370Za2.f7999z);
                            default:
                                JSONObject jSONObject2 = (JSONObject) obj3;
                                Bundle bundle = c0370Za.f7989o;
                                if (bundle == null) {
                                    return jSONObject2;
                                }
                                try {
                                    C0081p c0081p = C0081p.f1374f;
                                    JSONObject f4 = c0081p.f1375a.f(bundle);
                                    try {
                                        c0081p.f1375a.getClass();
                                        C1335wc.h(jSONObject2, f4);
                                        return jSONObject2;
                                    } catch (JSONException unused) {
                                        return f4;
                                    }
                                } catch (JSONException unused2) {
                                    return jSONObject2;
                                }
                        }
                    }
                }, su);
            case 8:
                C0381a5 c0381a5 = (C0381a5) this.f8464b;
                return Bs.n0(Ku.q(Bs.h0((JSONObject) obj)), N1.n.f1204A.f1218p.B((Context) c0381a5.f8076o, (C0248Bc) c0381a5.f8081t, (Fq) c0381a5.f8080s).a("AFMA_getAdDictionary", AbstractC0598f9.f8690b, C0782jh.N), (Su) c0381a5.f8077p);
            case 9:
                return ((C0915ml) this.f8464b).a((C0370Za) obj);
            case 10:
                return obj != null ? (C1310vu) this.f8464b : Bs.f0(new Xk("Retrieve required value in native ad response failed.", 1));
            case 11:
                C0956nj c0956nj = (C0956nj) this.f8464b;
                C0348Ud a6 = c0956nj.c.a(O1.X0.i(), null, null);
                C0594f5 c0594f5 = new C0594f5(a6);
                c0956nj.a(a6);
                ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = a6.f7165o;
                viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7464A.f8148v = new C0328Qd(c0594f5, 2);
                viewTreeObserverOnGlobalLayoutListenerC0358Wd.loadUrl((String) O1.r.d.c.a(AbstractC1066q6.f10238i3));
                return c0594f5;
            case 12:
                return Bs.h0(new Ep(new C1384xi(i4, ((C0488cl) this.f8464b).c), Op.j(new InputStreamReader((InputStream) obj))));
            case 13:
                return ((C0727i9) this.f8464b).a((JSONObject) obj);
            case 14:
                return Bs.h0(new Ep(new C1384xi(i4, (Jp) ((C1995b) this.f8464b).f14883r), Op.j(new StringReader(((JSONObject) obj).toString()))));
            case 15:
                InputStream inputStream = (InputStream) obj;
                int i15 = Vt.f7307a;
                inputStream.getClass();
                ArrayDeque arrayDeque = new ArrayDeque(20);
                int highestOneBit = Integer.highestOneBit(0);
                int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
                int i16 = 0;
                while (true) {
                    if (i16 < 2147483639) {
                        int min2 = Math.min(min, 2147483639 - i16);
                        byte[] bArr = new byte[min2];
                        arrayDeque.add(bArr);
                        int i17 = i16;
                        int i18 = 0;
                        while (i18 < min2) {
                            int read = inputStream.read(bArr, i18, min2 - i18);
                            if (read == -1) {
                                a4 = Vt.a(arrayDeque, i17);
                            } else {
                                i18 += read;
                                i17 += read;
                            }
                        }
                        min = Bs.L(min * (min < 4096 ? 4 : 2));
                        i16 = i17;
                    } else {
                        if (inputStream.read() != -1) {
                            throw new OutOfMemoryError("input is too large to fit in a byte array");
                        }
                        a4 = Vt.a(arrayDeque, 2147483639);
                    }
                }
                String str5 = new String(a4, AbstractC1480zs.c);
                C0370Za c0370Za2 = (C0370Za) this.f8464b;
                c0370Za2.f7998x = str5;
                return Bs.h0(c0370Za2);
            case 16:
                Op op2 = (Op) this.f8464b;
                C0305Ma c0305Ma = (C0305Ma) obj;
                Su su2 = (Su) op2.f6526q;
                String str6 = c0305Ma.f6236p;
                Q1.N n5 = N1.n.f1204A.c;
                return Bs.n0(Bs.c0(Ku.q(Q1.N.b(str6) ? Bs.f0(new Xk("Ads signal service force local", 1)) : Bs.c0(Bs.k0(new C0258Da(24, op2, c0305Ma), (Su) op2.f6525p), ExecutionException.class, C0364Xe.f7663i, su2)), C1001ol.class, C0364Xe.f7664j, su2), C0364Xe.f7665k, su2);
            case 17:
                C0326Qb c0326Qb = (C0326Qb) this.f8464b;
                C0315Oa c0315Oa = (C0315Oa) obj;
                Su su3 = (Su) c0326Qb.f6660p;
                String str7 = c0315Oa.f6462t;
                Q1.N n6 = N1.n.f1204A.c;
                return Bs.c0(Q1.N.b(str7) ? Bs.f0(new Xk("Ads service proxy force local", 1)) : Bs.c0(Bs.k0(new C1510e1((Object) c0326Qb, (Object) c0315Oa, 27, (boolean) (objArr == true ? 1 : 0)), (Su) c0326Qb.f6659o), ExecutionException.class, C0364Xe.f7662h, su3), C1001ol.class, new N1.c(c0326Qb, c0315Oa, Binder.getCallingUid()), su3);
            case 18:
                return Bs.h0(new Ep(new C1384xi(i4, (Jp) ((C1151s6) this.f8464b).d), Op.j(new InputStreamReader((InputStream) obj))));
            case 19:
                C0326Qb c0326Qb2 = (C0326Qb) this.f8464b;
                C1423ye c1423ye = (C1423ye) c0326Qb2.f6662r;
                Context context = c1423ye.f11393a.f9164b;
                AbstractC0587ez.n(context);
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                B0.r rVar = (B0.r) c0326Qb2.f6659o;
                C0370Za c0370Za3 = (C0370Za) rVar.f113p;
                AbstractC0587ez.n(c0370Za3.f7992r);
                Ro ro = new Ro(2);
                C1414yB c1414yB = c1423ye.f11399e;
                C1175so c1175so = new C1175so(ro, 0L, (ScheduledExecutorService) c1414yB.c());
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c1414yB.c();
                Context context2 = c1423ye.f11393a.f9164b;
                AbstractC0587ez.n(context2);
                C1175so c1175so2 = new C1175so(new Kn(5, scheduledExecutorService), ((Long) O1.r.d.c.a(AbstractC1066q6.f10086B3)).longValue(), (ScheduledExecutorService) c1414yB.c());
                C1016p c1016p = new C1016p(24);
                AbstractC0587ez.n(context2);
                C1175so c1175so3 = new C1175so(new No(c1016p, context2, (ScheduledExecutorService) c1414yB.c(), c0260Dc, rVar.f112o, c0370Za3.f7999z, c0370Za3.y), 0L, (ScheduledExecutorService) c1414yB.c());
                C1175so c1175so4 = new C1175so(new C0576eo(c0260Dc, 7), 0L, (ScheduledExecutorService) c1414yB.c());
                AbstractC0587ez.n(context2);
                String str8 = c0370Za3.f7992r;
                AbstractC0587ez.n(str8);
                C0576eo c0576eo = new C0576eo(c0260Dc, 5);
                AbstractC0587ez.n(context2);
                C0576eo c0576eo2 = new C0576eo(c0260Dc, 6);
                AbstractC0587ez.n(c0260Dc);
                List list = ((C0370Za) rVar.f113p).f7993s;
                AbstractC0587ez.n(list);
                Qn qn = new Qn(7, c0260Dc, list);
                c0326Qb2.getClass();
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                C0370Za c0370Za4 = (C0370Za) ((B0.r) c0326Qb2.f6659o).f113p;
                String O4 = Bs.O(c0370Za4.f7989o.getString("ms"));
                PackageInfo packageInfo = c0370Za4.f7994t;
                Qn qn2 = new Qn(6, c0260Dc2, O4);
                AbstractC0587ez.n(context2);
                C1414yB c1414yB2 = c1423ye.f11377J;
                C1035pc c1035pc = (C1035pc) c1414yB2.c();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) c1414yB.c();
                AbstractC0587ez.n(str8);
                Ao ao = new Ao(c1035pc, scheduledExecutorService2, c0260Dc, 2);
                Go go = (Go) c1423ye.f11408i0.c();
                AbstractC0587ez.n(str8);
                return new Io(context, c0260Dc, AbstractC1266ut.s(c1175so, c1175so2, c1175so3, c1175so4, c0576eo, c0576eo2, qn, qn2, ao, go, new Ao((C1035pc) c1414yB2.c(), (ScheduledExecutorService) c1414yB.c(), c0260Dc)), (Eq) ((C1414yB) c0326Qb2.f6660p).c(), (C0658gk) c1423ye.f11370C.c()).a(C0081p.f1374f.f1375a.f((Bundle) obj));
            case 20:
                return ((Io) this.f8464b).a(C0081p.f1374f.f1375a.f((Bundle) obj));
            case 21:
                u0.g gVar = (u0.g) this.f8464b;
                C1423ye c1423ye2 = (C1423ye) gVar.f14984q;
                C0779je c0779je = c1423ye2.f11393a;
                Context context3 = c0779je.f9164b;
                AbstractC0587ez.n(context3);
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                B0.r rVar2 = (B0.r) gVar.f14983p;
                AbstractC0587ez.n(((C0305Ma) rVar2.f113p).f6236p);
                Ro ro2 = new Ro(i11);
                C1414yB c1414yB3 = c1423ye2.f11399e;
                C1175so c1175so5 = new C1175so(ro2, 0L, (ScheduledExecutorService) c1414yB3.c());
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) c1414yB3.c();
                Context context4 = c0779je.f9164b;
                AbstractC0587ez.n(context4);
                C1175so c1175so6 = new C1175so(new Kn(i9, scheduledExecutorService3), ((Long) O1.r.d.c.a(AbstractC1066q6.f10086B3)).longValue(), (ScheduledExecutorService) c1414yB3.c());
                C1016p c1016p2 = new C1016p(i5);
                AbstractC0587ez.n(context4);
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) c1414yB3.c();
                int i19 = rVar2.f112o;
                C0305Ma c0305Ma2 = (C0305Ma) rVar2.f113p;
                C1175so c1175so7 = new C1175so(new No(c1016p2, context4, scheduledExecutorService4, c0260Dc3, i19, c0305Ma2.f6243w, c0305Ma2.f6242v), 0L, (ScheduledExecutorService) c1414yB3.c());
                C1175so c1175so8 = new C1175so(new C0576eo(c0260Dc3, 7), 0L, (ScheduledExecutorService) c1414yB3.c());
                AbstractC0587ez.n(context4);
                AbstractC0587ez.n(c0305Ma2.f6236p);
                C0576eo c0576eo3 = new C0576eo(c0260Dc3, 5);
                AbstractC0587ez.n(context4);
                C0576eo c0576eo4 = new C0576eo(c0260Dc3, 6);
                List list2 = c0305Ma2.f6241u;
                AbstractC0587ez.n(list2);
                Qn qn3 = new Qn(7, c0260Dc3, list2);
                String str9 = c0305Ma2.f6238r;
                AbstractC0587ez.n(str9);
                Qn qn4 = new Qn(6, c0260Dc3, str9);
                AbstractC0587ez.n(context4);
                C1414yB c1414yB4 = c1423ye2.f11377J;
                C1035pc c1035pc2 = (C1035pc) c1414yB4.c();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) c1414yB3.c();
                AbstractC0587ez.n(c0305Ma2.f6236p);
                Ao ao2 = new Ao(c1035pc2, scheduledExecutorService5, c0260Dc3, 2);
                Go go2 = (Go) c1423ye2.f11408i0.c();
                AbstractC0587ez.n(c0305Ma2.f6236p);
                return new Io(context3, c0260Dc3, AbstractC1266ut.s(c1175so5, c1175so6, c1175so7, c1175so8, c0576eo3, c0576eo4, qn3, qn4, ao2, go2, new Ao((C1035pc) c1414yB4.c(), (ScheduledExecutorService) c1414yB3.c(), c0260Dc3)), (Eq) ((C1414yB) gVar.f14985r).c(), (C0658gk) c1423ye2.f11370C.c()).a(new JSONObject());
            case 22:
                Throwable th = (Throwable) obj;
                String str10 = "";
                C0275Ga.b(((C1433yo) this.f8464b).f11471b).g("TopicsSignal.fetchTopicsSignal", th);
                return Bs.h0(th instanceof SecurityException ? new C0406ao(i10, i11, str10) : th instanceof IllegalStateException ? new C0406ao(i6, i11, str10) : th instanceof IllegalArgumentException ? new C0406ao(i7, i11, str10) : th instanceof TimeoutException ? new C0406ao(i9, i11, str10) : new C0406ao(i8, i11, str10));
            case 23:
                return Bs.h0(new Tn((String) ((Qn) this.f8464b).c, i7));
            case 24:
                C0381a5 c0381a52 = (C0381a5) this.f8464b;
                C0578eq c0578eq = (C0578eq) obj;
                if (c0578eq == null || (yp = c0578eq.f8647a) == null || (c0450bp = c0578eq.f8648b) == null) {
                    throw new Xk("Empty prefetch", 1);
                }
                C1022p5 v4 = C1236u5.v();
                C0936n5 v5 = C0979o5.v();
                v5.d();
                C0979o5.y((C0979o5) v5.f4561p);
                C1107r5 w2 = C1107r5.w();
                v5.d();
                C0979o5.w((C0979o5) v5.f4561p, w2);
                v4.d();
                C1236u5.w((C1236u5) v4.f4561p, (C0979o5) v5.b());
                yp.f7898a.c().f9172f.X((C1236u5) v4.b());
                return c0381a52.s(yp, c0450bp.f8287b);
            case 25:
                return a(obj);
            default:
                return Bs.h0(((InterfaceC0749iq) this.f8464b).l(obj));
        }
    }
}
