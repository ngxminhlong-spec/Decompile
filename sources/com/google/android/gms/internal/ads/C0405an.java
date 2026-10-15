package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import java.util.concurrent.Executor;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.an, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405an implements InterfaceC1002om {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8163a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8164b;
    public final Executor c;
    public final C0289Ie d;

    public /* synthetic */ C0405an(Context context, Executor executor, C0289Ie c0289Ie, int i4) {
        this.f8163a = i4;
        this.f8164b = context;
        this.c = executor;
        this.d = c0289Ie;
    }

    public static final void c(Ep ep, C1434yp c1434yp, C0873lm c0873lm) {
        try {
            Pp pp = (Pp) c0873lm.f9463b;
            try {
                pp.f6603a.k0(((Jp) ep.f4942a.f11290p).d, c1434yp.f11539v.toString());
            } catch (Throwable th) {
                throw new Exception(th);
            }
        } catch (Exception e4) {
            Y9.t("Fail to load ad from adapter ".concat(String.valueOf(c0873lm.f9462a)), e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1002om
    public final Object a(Ep ep, C1434yp c1434yp, C0873lm c0873lm) {
        switch (this.f8163a) {
            case 0:
                Op op = new Op(ep, c1434yp, c0873lm.f9462a);
                Ij ij = new Ij(new C1431ym(c0873lm), null, 0);
                C0289Ie c0289Ie = this.d;
                C0284He c0284He = new C0284He(c0289Ie.c, c0289Ie.d, op, ij);
                ((Ug) c0284He.f5449g.c()).m1(new C0482cf(0, (Pp) c0873lm.f9463b), this.c);
                ((Dm) c0873lm.c).L3((BinderC0490cn) c0284He.f5467z.c());
                return c0284He.f0();
            default:
                Op op2 = new Op(ep, c1434yp, c0873lm.f9462a);
                Ij ij2 = new Ij(new C1130rm(c0873lm, 1), null, 0);
                C0289Ie c0289Ie2 = this.d;
                C0284He c0284He2 = new C0284He(c0289Ie2.c, c0289Ie2.d, op2, ij2);
                ((Ug) c0284He2.f5449g.c()).m1(new C0482cf(0, (Pp) c0873lm.f9463b), this.c);
                Vg vg = (Vg) c0284He2.f5454l.c();
                Gg gg = (Gg) c0284He2.f5455m.c();
                C0655gh c0655gh = (C0655gh) c0284He2.f5460r.c();
                Vh vh = (Vh) c0284He2.f5466x.c();
                Em em = (Em) c0873lm.c;
                BinderC0575en binderC0575en = new BinderC0575en(c0655gh, gg, vg, vh);
                synchronized (em) {
                    em.f4927o = binderC0575en;
                }
                return c0284He2.f0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1002om
    public final void b(Ep ep, C1434yp c1434yp, C0873lm c0873lm) {
        Exception exc;
        switch (this.f8163a) {
            case 0:
                IInterface iInterface = c0873lm.c;
                Object obj = c0873lm.f9463b;
                Context context = this.f8164b;
                try {
                    Jp jp = (Jp) ep.f4942a.f11290p;
                    n0.n nVar = jp.f5920o;
                    O1.U0 u02 = jp.d;
                    if (nVar.f14098p == 3) {
                        Pp pp = (Pp) obj;
                        try {
                            pp.f6603a.F2(new BinderC1813b(context), u02, c1434yp.f11539v.toString(), (InterfaceC1283v9) iInterface);
                            return;
                        } finally {
                        }
                    }
                    Pp pp2 = (Pp) obj;
                    try {
                        pp2.f6603a.m3(new BinderC1813b(context), u02, c1434yp.f11539v.toString(), (InterfaceC1283v9) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception e4) {
                    Y9.t("Fail to load ad from adapter ".concat(String.valueOf(c0873lm.f9462a)), e4);
                    return;
                }
                Y9.t("Fail to load ad from adapter ".concat(String.valueOf(c0873lm.f9462a)), e4);
                return;
            default:
                if (((Pp) c0873lm.f9463b).a()) {
                    c(ep, c1434yp, c0873lm);
                    return;
                }
                C0326Qb c0326Qb = new C0326Qb(this, ep, c1434yp, c0873lm);
                Em em = (Em) c0873lm.c;
                synchronized (em) {
                    em.f4929q = c0326Qb;
                }
                Object obj2 = c0873lm.f9463b;
                Context context2 = this.f8164b;
                Pp pp3 = (Pp) obj2;
                Jp jp2 = (Jp) ep.f4942a.f11290p;
                InterfaceC0905mb interfaceC0905mb = (InterfaceC0905mb) c0873lm.c;
                String jSONObject = c1434yp.f11539v.toString();
                try {
                    pp3.f6603a.N1(new BinderC1813b(context2), jp2.d, interfaceC0905mb, jSONObject);
                    return;
                } finally {
                }
        }
    }
}
