package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0401aj implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8156b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ CallableC0401aj(Cm cm, Ep ep, C1434yp c1434yp) {
        this.f8155a = 2;
        this.d = cm;
        this.f8156b = ep;
        this.c = c1434yp;
    }

    public /* synthetic */ CallableC0401aj(Object obj, Object obj2, Object obj3, int i4) {
        this.f8155a = i4;
        this.f8156b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i4 = 3;
        int i5 = 1;
        switch (this.f8155a) {
            case 0:
                Ci ci = new Ci();
                JSONObject jSONObject = (JSONObject) this.d;
                int optInt = jSONObject.optInt("template_id", -1);
                synchronized (ci) {
                    ci.f4502a = optInt;
                }
                ci.i(jSONObject.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
                String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                Ep ep = (Ep) this.f8156b;
                ci.r(optString);
                Jp jp = (Jp) ep.f4942a.f11290p;
                if (!jp.f5912g.contains(Integer.toString(ci.D()))) {
                    throw new Xk(U.a.i("Invalid template ID: ", ci.D()), 1);
                }
                if (ci.D() == 3) {
                    if (ci.a() == null) {
                        throw new Xk("No custom template id for custom template ad response.", 1);
                    }
                    if (!jp.f5913h.contains(ci.a())) {
                        throw new Xk("Unexpected custom template id in the response.", 1);
                    }
                }
                C1434yp c1434yp = (C1434yp) this.c;
                ci.t(jSONObject.optDouble("rating", -1.0d));
                String optString2 = jSONObject.optString("headline", null);
                if (c1434yp.f11487M) {
                    N1.n nVar = N1.n.f1204A;
                    Q1.N n4 = nVar.c;
                    Resources a4 = nVar.f1209g.a();
                    optString2 = n0.a.i(a4 != null ? a4.getString(R.string.s7) : "Test Ad", " : ", optString2);
                }
                ci.u("headline", optString2);
                ci.u("body", jSONObject.optString("body", null));
                ci.u("call_to_action", jSONObject.optString("call_to_action", null));
                ci.u("store", jSONObject.optString("store", null));
                ci.u("price", jSONObject.optString("price", null));
                ci.u("advertiser", jSONObject.optString("advertiser", null));
                return ci;
            case 1:
                return new Al((Fl) ((C0834kq) this.f8156b).f9325q.get(), (JSONObject) ((C0834kq) this.c).f9325q.get(), (C0393ab) ((C0834kq) this.d).f9325q.get());
            default:
                Cm cm = (Cm) this.d;
                Ep ep2 = (Ep) this.f8156b;
                C1434yp c1434yp2 = (C1434yp) this.c;
                Op op = new Op(ep2, c1434yp2, (String) null);
                int i6 = 6;
                C0783ji c0783ji = new C0783ji(22, ((Jp) ep2.f4942a.f11290p).a(), new RunnableC0801k(cm, ep2, c1434yp2, i6));
                C0262De c0262De = cm.f4541b;
                C1423ye c1423ye = c0262De.d;
                C0262De c0262De2 = c0262De.f4690e;
                C0654gg c0654gg = new C0654gg(op, 3);
                C0654gg c0654gg2 = new C0654gg(op, 0);
                int i7 = DB.c;
                List list = Collections.EMPTY_LIST;
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(c0262De2.f4661Q0);
                arrayList.add(c0262De2.f4663R0);
                C1414yB b4 = C1414yB.b(new Hg(new DB(list, arrayList), i4));
                ArrayList arrayList2 = new ArrayList(4);
                ArrayList arrayList3 = new ArrayList(4);
                arrayList2.add(c0262De2.f4704i1);
                arrayList3.add(c0262De2.f4707j1);
                arrayList2.add(c0262De2.k1);
                arrayList2.add(c0262De2.f4712l1);
                arrayList3.add(c0262De2.f4735t1);
                arrayList3.add(c0262De2.f4738u1);
                arrayList3.add(c0262De2.f4741v1);
                arrayList2.add(c0262De2.f4715m1);
                C1414yB b5 = C1414yB.b(new Hg(new DB(arrayList2, arrayList3), 5));
                C1252uf c1252uf = new C1252uf(c0654gg2, new C0654gg(op, 1), c0262De2.f4651K0, new C0654gg(op, 2), c0262De2.f4719o, 1);
                C1414yB b6 = C1414yB.b(Y9.f7758I);
                ArrayList arrayList4 = new ArrayList(1);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(c0262De2.f4747x1);
                arrayList4.add(c0262De2.f4749y1);
                Hg hg = new Hg(new DB(arrayList4, arrayList5), i6);
                List list2 = Collections.EMPTY_LIST;
                ArrayList arrayList6 = new ArrayList(1);
                arrayList6.add(c0262De2.f4695f1);
                Of of = (Of) C1414yB.b(new C0245Af((InterfaceC1457zB) new C1124rg(c0654gg, c0654gg2, b4, b5, c0262De2.f4744w1, c1252uf, b6, hg, C1414yB.b(new Hg(new DB(list2, arrayList6), 18))), (InterfaceC1457zB) new Pf(c0783ji, i5), (InterfaceC1457zB) new Pf(c0783ji, 0), c1423ye.f11403g, 2)).c();
                AbstractC0587ez.n(of);
                return of;
        }
    }
}
