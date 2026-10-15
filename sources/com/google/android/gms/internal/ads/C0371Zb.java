package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l2.C1798a;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371Zb implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8000a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8001b;
    public final FB c;

    public /* synthetic */ C0371Zb(Object obj, FB fb, int i4) {
        this.f8000a = i4;
        this.f8001b = obj;
        this.c = fb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.google.android.gms.internal.ads.s4, java.lang.Object, com.google.android.gms.internal.ads.pj] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.ads.AA, com.google.android.gms.internal.ads.Kg] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.google.android.gms.internal.ads.Sl, com.google.android.gms.internal.ads.Ic] */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.google.android.gms.internal.ads.nq, com.google.android.gms.internal.ads.AA] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.AA, com.google.android.gms.internal.ads.mh] */
    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f8000a) {
            case 0:
                Context context = (Context) ((AB) this.f8001b).f3930a;
                C0321Pb c0321Pb = (C0321Pb) this.c;
                return new C0366Yb(context, new C0258Da(15, (C1798a) c0321Pb.c.f3930a, (C0316Ob) c0321Pb.f6583b.c()));
            case 1:
                return ((u0.g) this.f8001b).B(((DB) this.c).c());
            case 2:
                return new C0698hh(((DB) this.f8001b).c(), ((C0654gg) this.c).a());
            case 3:
                Set c = ((DB) this.c).c();
                Dh dh = (Dh) this.f8001b;
                if (dh.f4768p == null) {
                    dh.f4768p = new AA(c);
                }
                Kg kg = dh.f4768p;
                AbstractC0587ez.n(kg);
                return kg;
            case 4:
                Set z4 = ((C0783ji) this.f8001b).z((C1296vg) ((C1414yB) this.c).c());
                AbstractC0587ez.n(z4);
                return z4;
            case 5:
                return new Ph(new Jf(1, (InterfaceC0308Md) ((C0783ji) this.f8001b).f9212q), (Executor) this.c.c());
            case 6:
                C1434yp a4 = ((C0654gg) this.f8001b).a();
                JSONObject jSONObject = (JSONObject) ((C1126ri) this.c).f10496b.f11914p;
                AbstractC0587ez.n(jSONObject);
                return new Di(a4, jSONObject);
            case 7:
                return new C0331Rb(((C0865le) ((FB) this.f8001b)).a(), ((Eg) this.c).a().f5911f);
            case 8:
                return new Ph(new Fj(((C1212ti) this.f8001b).f10716b.a()), (Executor) this.c.c());
            case 9:
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Op((Object) c0260Dc, (Object) ((C0700hj) this.f8001b).c(), (Object) new C0783ji(26, c0260Dc, ((C0700hj) ((Lf) this.c).f6149b).c()), 13, (byte) 0);
            case 10:
                C1427yi c1427yi = (C1427yi) ((Eo) this.f8001b).c();
                Ci a5 = ((Lf) this.c).a();
                ?? abstractBinderC1149s4 = new AbstractBinderC1149s4("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                abstractBinderC1149s4.f10029o = a5.G();
                abstractBinderC1149s4.f10030p = a5.J();
                abstractBinderC1149s4.f10031q = c1427yi;
                abstractBinderC1149s4.f10032r = false;
                abstractBinderC1149s4.f10033s = false;
                if (a5.Q() != null) {
                    a5.Q().s0(abstractBinderC1149s4);
                }
                return abstractBinderC1149s4;
            case 11:
                return new Gj((Vg) ((C1414yB) this.f8001b).c(), ((C0654gg) this.c).a());
            case 12:
                return new Tj(Op.u(((C0329Qe) this.f8001b).f6668b.a()), (Sj) ((C1414yB) this.c).c());
            case 13:
                return new C0445bk((C0764j5) ((FB) this.f8001b).c(), ((BB) this.c).c());
            case 14:
                return new BinderC1171sk((C0268Ee) ((AB) this.f8001b).f3930a, new C1384xi(6, (C1025p8) ((C1128rk) this.c).f10500b.f3930a));
            case 15:
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4898b;
                AbstractC0587ez.n(c0260Dc2);
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                Context context2 = (Context) ((C1000ok) this.f8001b).f9851b.c();
                C0573el c0573el = new C0573el(0);
                c0573el.f8984t = new C0466c5(context2, N1.n.f1204A.f1220r.b(), (AbstractC0702hl) c0573el, (AbstractC0702hl) c0573el);
                return new u0.g(c0260Dc2, c0260Dc3, c0573el, C1414yB.a((C1252uf) this.c), 10);
            case 16:
                try {
                    return m2.c.a((Context) ((FB) this.f8001b).c()).b(((Zk) this.c).c().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 17:
                Map map = ((CB) this.f8001b).f11243a;
                C0260Dc c0260Dc4 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc4);
                return new C0915ml(map, c0260Dc4, new AA(((Hg) this.c).f5478b.c()));
            case 18:
                C0260Dc c0260Dc5 = AbstractC0266Ec.f4898b;
                AbstractC0587ez.n(c0260Dc5);
                C0260Dc c0260Dc6 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc6);
                return new C0326Qb(c0260Dc5, c0260Dc6, ((Nf) this.f8001b).a(), C1414yB.a((C0245Af) this.c), false);
            case 19:
                C0260Dc c0260Dc7 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc7);
                Lf lf = (Lf) this.f8001b;
                C0260Dc c0260Dc8 = AbstractC0266Ec.f4898b;
                AbstractC0587ez.n(c0260Dc8);
                byte b4 = 0;
                return new Op(c0260Dc7, new Op(c0260Dc8, c0260Dc7, ((Nf) lf.f6149b).d(), 17, b4), (C1006oq) this.c.c(), 18, b4);
            case 20:
                return new Ql(((C1252uf) this.f8001b).d(), ((C0822ke) this.c).c());
            case 21:
                return new AbstractC0287Ic(((Pl) this.f8001b).c(), ((C0822ke) this.c).c());
            case 22:
                Rl rl = (Rl) ((C1414yB) this.f8001b).c();
                C0371Zb c0371Zb = (C0371Zb) this.c;
                return new C0445bk(rl, (Sl) new AbstractC0287Ic(((Pl) c0371Zb.f8001b).c(), ((C0822ke) c0371Zb.c).c()));
            case 23:
                C0329Qe c0329Qe = (C0329Qe) this.f8001b;
                C0260Dc c0260Dc9 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc9);
                return new C0832ko(new C0662go(c0260Dc9, c0329Qe.f6668b.a(), 1), 10000L, (C1798a) ((C1414yB) this.c).c());
            case 24:
                C0329Qe c0329Qe2 = (C0329Qe) this.f8001b;
                C0260Dc c0260Dc10 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc10);
                return new C0832ko(new C0662go(c0260Dc10, c0329Qe2.f6668b.a(), 4), ((Long) E6.f4850a.r()).longValue(), (C1798a) ((C1414yB) this.c).c());
            case 25:
                ((C0865le) ((FB) this.f8001b)).a();
                AbstractC0587ez.n(((C0370Za) ((Qo) this.c).f6699b.f113p).f7992r);
                C0260Dc c0260Dc11 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc11);
                return new C0576eo(c0260Dc11, 5);
            case 26:
                C0260Dc c0260Dc12 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc12);
                return new C1006oq(c0260Dc12, (ScheduledExecutorService) ((FB) this.f8001b).c(), new AA(((Hg) this.c).f5478b.c()));
            default:
                return new C1392xq((C1177sq) ((C1414yB) this.f8001b).c(), new Iv(), ((Pk) this.c).a());
        }
    }
}
