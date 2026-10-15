package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c3.InterfaceFutureC0239a;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bm implements InterfaceC0745im {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4171a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4172b;
    public final Object c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4173e;

    public Bm(Context context, Executor executor, C0279Ge c0279Ge, C1391xp c1391xp) {
        this.f4172b = context;
        this.c = c0279Ge;
        this.d = executor;
        this.f4173e = c1391xp;
    }

    public Bm(C1006oq c1006oq, Su su, InterfaceC0830km interfaceC0830km, InterfaceC1002om interfaceC1002om) {
        this.d = c1006oq;
        this.f4173e = su;
        this.c = interfaceC1002om;
        this.f4172b = interfaceC0830km;
    }

    public Bm(C1006oq c1006oq, Su su, C1409y6 c1409y6, C1384xi c1384xi) {
        this.d = c1006oq;
        this.c = su;
        this.f4172b = c1409y6;
        this.f4173e = c1384xi;
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.nn, java.lang.Object, N1.e] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.s4, com.google.android.gms.internal.ads.Wg] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final InterfaceFutureC0239a a(Ep ep, C1434yp c1434yp) {
        String str;
        C0873lm c0873lm;
        switch (this.f4171a) {
            case 0:
                try {
                    str = c1434yp.f11539v.getString("tab_url");
                } catch (Exception unused) {
                    str = null;
                }
                return Bs.n0(Pu.f6608p, new C0727i9(this, str != null ? Uri.parse(str) : null, ep, c1434yp, 3), (Executor) this.d);
            case 1:
                Iterator it = c1434yp.f11536t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            c0873lm = ((InterfaceC0830km) this.f4172b).a((String) it.next(), c1434yp.f11539v);
                        } catch (Kp unused2) {
                        }
                    } else {
                        c0873lm = null;
                    }
                }
                if (c0873lm == null) {
                    return Bs.f0(new Xk("Unable to instantiate mediation adapter class.", 3));
                }
                C0272Fc c0272Fc = new C0272Fc();
                c0873lm.c.Q(new A2.o(c0873lm, c0272Fc));
                if (c1434yp.f11487M) {
                    Bundle bundle = ((Jp) ep.f4942a.f11290p).d.f1293A;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                C1006oq c1006oq = (C1006oq) this.d;
                C0381a5 b4 = c1006oq.b(new C0381a5(c1006oq, EnumC0877lq.f9472D, null, C1006oq.d, Collections.EMPTY_LIST, ((C0260Dc) ((Su) this.f4173e)).b(new CallableC0336Sb(27, new u0.g(this, ep, c1434yp, c0873lm, 12)))).d(), EnumC0877lq.f9473E);
                C0811k9 c0811k9 = new C0811k9(c0272Fc, 1);
                C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
                InterfaceFutureC0239a interfaceFutureC0239a = (InterfaceFutureC0239a) b4.f8076o;
                C1006oq c1006oq2 = (C1006oq) b4.f8081t;
                return c1006oq2.b(new C0381a5(c1006oq2, b4.f8079r, null, (InterfaceFutureC0239a) b4.f8078q, (List) b4.f8080s, Bs.n0(interfaceFutureC0239a, c0811k9, c0260Dc)).d(), EnumC0877lq.f9474F).p(new C0326Qb(this, ep, c1434yp, c0873lm, false)).d();
            default:
                C0272Fc c0272Fc2 = new C0272Fc();
                ?? obj = new Object();
                C0275Ga c0275Ga = new C0275Ga(this, c0272Fc2, ep, c1434yp, (Object) obj, 3);
                synchronized (obj) {
                    obj.f9777o = c0275Ga;
                }
                Cp cp = c1434yp.f11534s;
                BinderC1366x6 binderC1366x6 = new BinderC1366x6(obj, cp.f4552b, cp.f4551a);
                EnumC0877lq enumC0877lq = EnumC0877lq.f9475G;
                C0831kn c0831kn = new C0831kn(0, this, binderC1366x6);
                C1006oq c1006oq3 = (C1006oq) this.d;
                C0381a5 b5 = c1006oq3.b(new C0381a5(c1006oq3, enumC0877lq, null, C1006oq.d, Collections.EMPTY_LIST, ((C0260Dc) ((Su) this.c)).b(new CallableC0336Sb(27, c0831kn))).d(), EnumC0877lq.f9476H);
                return new C0381a5((C1006oq) b5.f8081t, b5.f8079r, null, (InterfaceFutureC0239a) b5.f8078q, (List) b5.f8080s, Bs.n0((InterfaceFutureC0239a) b5.f8076o, new C0811k9(c0272Fc2, 1), AbstractC0266Ec.f4900f)).d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final boolean b(Ep ep, C1434yp c1434yp) {
        String str;
        Cp cp;
        switch (this.f4171a) {
            case 0:
                Context context = (Context) this.f4172b;
                if ((context instanceof Activity) && C1452z6.a(context)) {
                    try {
                        str = c1434yp.f11539v.getString("tab_url");
                    } catch (Exception unused) {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        return true;
                    }
                }
                return false;
            case 1:
                return !c1434yp.f11536t.isEmpty();
            default:
                return (((C1409y6) this.f4172b) == null || (cp = c1434yp.f11534s) == null || cp.f4551a == null) ? false : true;
        }
    }
}
