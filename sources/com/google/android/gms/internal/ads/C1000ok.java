package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000ok implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9850a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f9851b;

    public /* synthetic */ C1000ok(FB fb, int i4) {
        this.f9850a = i4;
        this.f9851b = fb;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.hl, com.google.android.gms.internal.ads.kl] */
    public C0829kl a() {
        Context a4 = ((C0865le) this.f9851b).a();
        ?? abstractC0702hl = new AbstractC0702hl();
        abstractC0702hl.f9317v = 1;
        abstractC0702hl.f8984t = new C0466c5(a4, N1.n.f1204A.f1220r.b(), (AbstractC0702hl) abstractC0702hl, (AbstractC0702hl) abstractC0702hl);
        return abstractC0702hl;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        Object obj;
        int i4 = this.f9850a;
        int i5 = 2;
        int i6 = 3;
        int i7 = 0;
        int i8 = 1;
        FB fb = this.f9851b;
        switch (i4) {
            case 0:
                C1043pk c1043pk = (C1043pk) fb.c();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                Set d02 = Zf.d0(c1043pk, c0260Dc);
                AbstractC0587ez.n(d02);
                return d02;
            case 1:
                C1043pk c1043pk2 = (C1043pk) fb.c();
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                Set d03 = Zf.d0(c1043pk2, c0260Dc2);
                AbstractC0587ez.n(d03);
                return d03;
            case 2:
                C1043pk c1043pk3 = (C1043pk) fb.c();
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                Set d04 = Zf.d0(c1043pk3, c0260Dc3);
                AbstractC0587ez.n(d04);
                return d04;
            case 3:
                C1043pk c1043pk4 = (C1043pk) fb.c();
                C0260Dc c0260Dc4 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc4);
                Set d05 = Zf.d0(c1043pk4, c0260Dc4);
                AbstractC0587ez.n(d05);
                return d05;
            case 4:
                C1043pk c1043pk5 = (C1043pk) fb.c();
                C0260Dc c0260Dc5 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc5);
                Set d06 = Zf.d0(c1043pk5, c0260Dc5);
                AbstractC0587ez.n(d06);
                return d06;
            case 5:
                C1043pk c1043pk6 = (C1043pk) fb.c();
                C0260Dc c0260Dc6 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc6);
                Set d07 = Zf.d0(c1043pk6, c0260Dc6);
                AbstractC0587ez.n(d07);
                return d07;
            case 6:
                C1043pk c1043pk7 = (C1043pk) fb.c();
                C0260Dc c0260Dc7 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc7);
                Set d08 = Zf.d0(c1043pk7, c0260Dc7);
                AbstractC0587ez.n(d08);
                return d08;
            case 7:
                Hk hk = (Hk) fb.c();
                C0260Dc c0260Dc8 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc8);
                return new Ph(hk, c0260Dc8);
            case 8:
                Hk hk2 = (Hk) fb.c();
                C0260Dc c0260Dc9 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc9);
                return new Ph(hk2, c0260Dc9);
            case 9:
                Context context = (Context) fb.c();
                C0573el c0573el = new C0573el(i7);
                c0573el.f8984t = new C0466c5(context, N1.n.f1204A.f1220r.b(), (AbstractC0702hl) c0573el, (AbstractC0702hl) c0573el);
                return c0573el;
            case 10:
                String str = (String) fb.c();
                C1220tq c1220tq = new C1220tq();
                c1220tq.f10751a.put("request_id", str);
                return c1220tq;
            case 11:
                Context a4 = ((C0865le) fb).a();
                C0573el c0573el2 = new C0573el(i8);
                c0573el2.f8984t = new C0466c5(a4, N1.n.f1204A.f1220r.b(), (AbstractC0702hl) c0573el2, (AbstractC0702hl) c0573el2);
                return c0573el2;
            case 12:
                return a();
            case 13:
                return new Xj(4, ((C1208te) fb).c());
            case 14:
                Ql ql = (Ql) fb.c();
                C0260Dc c0260Dc10 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc10);
                return new Ph(ql, c0260Dc10);
            case 15:
                return new Nl(((C0865le) fb).a());
            case 16:
                return new C0660gm(((C0865le) fb).a());
            case 17:
                return new C1046pn((Tj) fb.c());
            case 18:
                return new Bn((InterfaceC1263uq) fb.c());
            case 19:
                return new Kn(i7, ((C0865le) fb).a());
            case 20:
                return new Kn(i8, (Set) fb.c());
            case 21:
                C0260Dc c0260Dc11 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc11);
                return new Qn(i5, c0260Dc11, (C1035pc) fb.c());
            case 22:
                C0260Dc c0260Dc12 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc12);
                return new C0662go(c0260Dc12, ((C0865le) fb).a(), i7);
            case 23:
                C0260Dc c0260Dc13 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc13);
                C0576eo c0576eo = new C0576eo(c0260Dc13, 1);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) fb.c();
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10307x3)).booleanValue()) {
                    C1175so c1175so = new C1175so(c0576eo, ((Integer) r3.c.a(AbstractC1066q6.f10311y3)).intValue(), scheduledExecutorService);
                    int i9 = AbstractC1266ut.f10952q;
                    obj = new Rt(c1175so);
                } else {
                    int i10 = AbstractC1266ut.f10952q;
                    obj = Mt.f6281x;
                }
                AbstractC0587ez.n(obj);
                return obj;
            case 24:
                Context a5 = ((C0865le) fb).a();
                C0260Dc c0260Dc14 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc14);
                return new C0662go(a5, c0260Dc14);
            case 25:
                C0260Dc c0260Dc15 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc15);
                return new C0576eo(c0260Dc15, 2);
            case 26:
                C0260Dc c0260Dc16 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc16);
                return new Sn(c0260Dc16, ((Eg) fb).a(), i8);
            case 27:
                C0260Dc c0260Dc17 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc17);
                return new Qn(i6, c0260Dc17, (Ok) fb.c());
            case 28:
                return new Kn(i6, (C1391xp) fb.c());
            default:
                return new Do((C0919mp) fb.c());
        }
    }
}
