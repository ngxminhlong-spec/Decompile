package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338wf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11180a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f11181b;
    public final FB c;
    public final FB d;

    public /* synthetic */ C1338wf(FB fb, FB fb2, FB fb3, int i4) {
        this.f11180a = i4;
        this.f11181b = fb;
        this.c = fb2;
        this.d = fb3;
    }

    public /* synthetic */ C1338wf(FB fb, FB fb2, C1414yB c1414yB, int i4) {
        this.f11180a = i4;
        this.c = fb;
        this.f11181b = fb2;
        this.d = c1414yB;
    }

    public C1338wf(C0865le c0865le, C0908me c0908me, C1414yB c1414yB) {
        this.f11180a = 12;
        this.f11181b = c0865le;
        this.d = c0908me;
        this.c = c1414yB;
    }

    public /* synthetic */ C1338wf(InterfaceC1457zB interfaceC1457zB, FB fb, FB fb2, int i4) {
        this.f11180a = i4;
        this.d = interfaceC1457zB;
        this.f11181b = fb;
        this.c = fb2;
    }

    public /* synthetic */ C1338wf(InterfaceC1457zB interfaceC1457zB, InterfaceC1457zB interfaceC1457zB2, C1414yB c1414yB, int i4) {
        this.f11180a = i4;
        this.c = interfaceC1457zB;
        this.d = interfaceC1457zB2;
        this.f11181b = c1414yB;
    }

    public C0275Ga a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11181b.c();
        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc);
        C0260Dc c0260Dc2 = AbstractC0266Ec.f4898b;
        AbstractC0587ez.n(c0260Dc2);
        Context a4 = ((C0865le) ((C1000ok) this.c).f9851b).a();
        C0573el c0573el = new C0573el(1);
        c0573el.f8984t = new C0466c5(a4, N1.n.f1204A.f1220r.b(), (AbstractC0702hl) c0573el, (AbstractC0702hl) c0573el);
        return new C0275Ga(scheduledExecutorService, c0260Dc, c0260Dc2, c0573el, C1414yB.a((C1252uf) this.d));
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.android.gms.internal.ads.AA, com.google.android.gms.internal.ads.Ng] */
    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        Set set;
        switch (this.f11180a) {
            case 0:
                C0248Bc a4 = ((C1122re) this.f11181b).a();
                JSONObject jSONObject = (JSONObject) ((C1414yB) this.c).c();
                String str = (String) ((InterfaceC1457zB) this.d).c();
                boolean equals = "native".equals(str);
                Q1.N n4 = N1.n.f1204A.c;
                return new C1364x4(UUID.randomUUID().toString(), a4, str, jSONObject, equals);
            case 1:
                return ((Eg) this.f11181b).a().a() == null ? ((C0610ff) this.d).a() : ((C0245Af) this.c).d();
            case 2:
                return ((C0334Re) this.f11181b).a().booleanValue() ? ((Hf) this.c).b() : ((C0245Af) this.d).b();
            case 3:
                return new Sf(((C0654gg) this.f11181b).a(), (Qg) ((C1414yB) this.c).c(), (C0569eh) ((C1414yB) this.d).c());
            case 4:
                Context context = (Context) this.f11181b.c();
                C0248Bc a5 = ((C1122re) this.c).a();
                C1434yp a6 = ((C0654gg) this.d).a();
                C0296Kb c0296Kb = a6.f11475A;
                if (c0296Kb == null) {
                    return null;
                }
                Cp cp = a6.f11534s;
                return new C0291Jb(context, a5, c0296Kb, cp != null ? cp.f4552b : null);
            case 5:
                ?? aa = new AA(((Hg) this.c).f5478b.c());
                Set c = ((DB) this.d).c();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Og(aa, c, c0260Dc, (ScheduledExecutorService) this.f11181b.c());
            case 6:
                return new Qh((Context) this.f11181b.c(), ((DB) this.c).c(), ((C0654gg) this.d).a());
            case 7:
                Ci a7 = ((Lf) this.c).a();
                Di di = (Di) ((Zh) this.d).f8024b.c();
                AbstractC0587ez.n(di);
                Executor executor = (Executor) this.f11181b.c();
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                return new Vi(a7, di, executor, c0260Dc2);
            case 8:
                return new C0913mj((Executor) this.f11181b.c(), (C1381xf) ((C1414yB) this.c).c(), (Qh) ((C1414yB) this.d).c());
            case 9:
                int i4 = ((Eg) this.d).a().f5920o.f14098p;
                if (i4 != 0) {
                    return i4 + (-1) != 0 ? ((C0245Af) this.c).b() : ((C0245Af) this.f11181b).b();
                }
                throw null;
            case 10:
                String str2 = (String) ((InterfaceC1457zB) this.d).c();
                Context a8 = ((C0865le) this.f11181b).a();
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                Map c2 = ((BB) this.c).c();
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.l4)).booleanValue()) {
                    C0764j5 c0764j5 = new C0764j5(new A2.o(a8, 5));
                    synchronized (c0764j5) {
                        if (c0764j5.c) {
                            try {
                                F5 f5 = c0764j5.f9124b;
                                f5.d();
                                G5.z((G5) f5.f4561p, str2);
                            } catch (NullPointerException e4) {
                                N1.n.f1204A.f1209g.h("AdMobClearcutLogger.modify", e4);
                            }
                        }
                    }
                    set = Collections.singleton(new Ph(new C0445bk(c0764j5, c2), c0260Dc3));
                } else {
                    set = Collections.EMPTY_SET;
                }
                AbstractC0587ez.n(set);
                return set;
            case 11:
                C0260Dc c0260Dc4 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc4);
                return new C0828kk(c0260Dc4, (C0242Ac) this.f11181b.c(), ((Pk) this.c).a(), new Iv(), ((C0865le) this.d).a());
            case 12:
                Context a9 = ((C0865le) this.f11181b).a();
                WeakReference weakReference = ((C0908me) this.d).f9628b.c;
                AbstractC0587ez.n(weakReference);
                Qk qk = (Qk) ((C1414yB) this.c).c();
                C0260Dc c0260Dc5 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc5);
                return new Vk(a9, weakReference, qk, c0260Dc5);
            case 13:
                return a();
            case 14:
                AbstractC0587ez.n(((C0370Za) ((Qo) this.c).f6699b.f113p).f7992r);
                C1035pc c1035pc = (C1035pc) this.f11181b.c();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.c();
                C0260Dc c0260Dc6 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc6);
                return new Ao(c1035pc, scheduledExecutorService, c0260Dc6);
            case 15:
                return new BinderC1348wp((C1219tp) ((C1414yB) this.c).c(), (C1133rp) ((C1414yB) this.f11181b).c(), (Fp) ((C1414yB) this.d).c());
            case 16:
                Object c1306vq = ((Boolean) O1.r.d.c.a(AbstractC1066q6.C7)).booleanValue() ? new C1306vq((InterfaceC1263uq) C1414yB.a((C1414yB) this.c).c(), (ScheduledExecutorService) ((C1414yB) this.d).c()) : (InterfaceC1263uq) C1414yB.a((Lf) this.f11181b).c();
                AbstractC0587ez.n(c1306vq);
                return c1306vq;
            default:
                Context a10 = ((C0865le) this.d).a();
                C0260Dc c0260Dc7 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc7);
                return new Oq(a10, c0260Dc7, (C0242Ac) this.f11181b.c(), (Fq) ((C1414yB) this.c).c());
        }
    }
}
