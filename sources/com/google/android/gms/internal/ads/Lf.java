package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Lf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6148a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6149b;

    public /* synthetic */ Lf(int i4, Object obj) {
        this.f6148a = i4;
        this.f6149b = obj;
    }

    public Ci a() {
        Ci ci = (Ci) ((C0874ln) this.f6149b).f9467p;
        AbstractC0587ez.n(ci);
        return ci;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [com.google.android.gms.internal.ads.Ai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.Sl, com.google.android.gms.internal.ads.Ic] */
    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6148a) {
            case 0:
                return ((Hf) this.f6149b).a();
            case 1:
                Nf nf = (Nf) this.f6149b;
                return new Wf(new C0331Rb(((C0865le) nf.f6352b).a(), ((Eg) nf.c).a().f5911f));
            case 2:
                return new C0398ag(((BB) this.f6149b).c());
            case 3:
                return (C0783ji) this.f6149b;
            case 4:
                Gi gi = (Gi) ((C0869li) this.f6149b).f9453a.f9211p;
                AbstractC0587ez.n(gi);
                Set singleton = gi.d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                AbstractC0587ez.n(singleton);
                return singleton;
            case 5:
                Di di = (Di) ((Zh) this.f6149b).f8024b.c();
                AbstractC0587ez.n(di);
                JSONObject jSONObject = di.f4769b;
                if (jSONObject != null) {
                    return jSONObject;
                }
                try {
                    return new JSONObject(di.f4913a.f11542z);
                } catch (JSONException unused) {
                    return null;
                }
            case 6:
                BinderC1169si binderC1169si = new BinderC1169si(((C1212ti) this.f6149b).f10716b.a());
                ?? obj = new Object();
                obj.f3972a = binderC1169si;
                return obj;
            case 7:
                Ci ci = (Ci) ((C0874ln) this.f6149b).f9467p;
                AbstractC0587ez.n(ci);
                return ci;
            case 8:
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new C0783ji(26, c0260Dc, ((C0700hj) this.f6149b).c());
            case 9:
                return new C0482cf(1, (InterfaceC0308Md) ((InterfaceC1457zB) this.f6149b).c());
            case 10:
                return new Ph(new C0482cf(1, (InterfaceC0308Md) ((InterfaceC1457zB) ((Lf) this.f6149b).f6149b).c()), AbstractC0266Ec.f4899e);
            case 11:
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                C0371Zb c0371Zb = (C0371Zb) this.f6149b;
                Set singleton2 = ((Boolean) O1.r.d.c.a(AbstractC1066q6.l4)).booleanValue() ? Collections.singleton(new Ph(new C0445bk((C0764j5) ((FB) c0371Zb.f8001b).c(), ((BB) c0371Zb.c).c()), c0260Dc2)) : Collections.EMPTY_SET;
                AbstractC0587ez.n(singleton2);
                return singleton2;
            case 12:
                Nf nf2 = (Nf) this.f6149b;
                C0872ll c0872ll = new C0872ll(((C0865le) nf2.f6352b).a(), (C0356Wb) nf2.c.c());
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                return new Ph(c0872ll, c0260Dc3);
            case 13:
                C0260Dc c0260Dc4 = AbstractC0266Ec.f4898b;
                AbstractC0587ez.n(c0260Dc4);
                C0260Dc c0260Dc5 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc5);
                return new Op((Object) c0260Dc4, (Object) c0260Dc5, (Object) ((Nf) this.f6149b).d(), 17, (byte) 0);
            case 14:
                C0371Zb c0371Zb2 = (C0371Zb) this.f6149b;
                Rl rl = (Rl) ((C1414yB) c0371Zb2.f8001b).c();
                C0371Zb c0371Zb3 = (C0371Zb) c0371Zb2.c;
                C0445bk c0445bk = new C0445bk(rl, (Sl) new AbstractC0287Ic(((Pl) c0371Zb3.f8001b).c(), ((C0822ke) c0371Zb3.c).c()));
                C0260Dc c0260Dc6 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc6);
                return new Ph(c0445bk, c0260Dc6);
            case 15:
                return new Kn(4, ((Bg) this.f6149b).f4149b.c);
            case 16:
                String str = ((C0305Ma) ((B0.r) this.f6149b).f113p).f6240t;
                AbstractC0587ez.n(str);
                return str;
            case 17:
                AbstractC0587ez.n(AbstractC0266Ec.f4897a);
                AbstractC0587ez.n(((C0370Za) ((Qo) this.f6149b).f6699b.f113p).f7992r);
                return new Ro(2);
            case 18:
                String str2 = ((C0315Oa) ((C1384xi) this.f6149b).f11290p).f6463u;
                AbstractC0587ez.n(str2);
                return str2;
            default:
                return new C1435yq(new Iv(), ((Pk) this.f6149b).a());
        }
    }
}
