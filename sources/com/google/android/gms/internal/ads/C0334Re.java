package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334Re implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6806a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f6807b;

    public /* synthetic */ C0334Re(FB fb, int i4) {
        this.f6806a = i4;
        this.f6807b = fb;
    }

    public Boolean a() {
        boolean z4 = true;
        if (((Eg) this.f6807b).a().a() == null) {
            if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.K4)).booleanValue()) {
                z4 = false;
            }
        }
        return Boolean.valueOf(z4);
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        Object obj;
        int i4 = this.f6806a;
        int i5 = 1;
        int i6 = 0;
        FB fb = this.f6807b;
        switch (i4) {
            case 0:
                return new Q1.v(((C0865le) fb).a());
            case 1:
                return new C0354Ve(((C0822ke) fb).c(), 0);
            case 2:
                return new C0354Ve(((C0822ke) fb).c(), 1);
            case 3:
                return new C0359We((Ok) fb.c(), 0);
            case 4:
                return new C0369Ye(i6, new C0536dr(((C0865le) ((C0703hm) fb).f8985a).a(), 3));
            case 5:
                return new C0374Ze(0, (Ok) fb.c());
            case 6:
                return new C0440bf(((C0865le) fb).a());
            case 7:
                return new C0369Ye(i5, (C1391xp) fb.c());
            case 8:
                return new C0374Ze(1, C0326Qb.N(((C0324Pe) fb).f6588a.a()).G());
            case 9:
                return new C0369Ye((Context) fb.c());
            case 10:
                return new C0359We((Ok) fb.c(), 1);
            case 11:
                return new C0768j9(((C0641g9) fb.c()).f8790a);
            case 12:
                return new Ph(new Jf(0, (C0825kh) ((Vf) fb).f7267a.f11914p), AbstractC0266Ec.f4900f);
            case 13:
                return a();
            case 14:
                return new Ph((C0910mg) fb.c(), AbstractC0266Ec.f4900f);
            case 15:
                return new Ph((C0910mg) fb.c(), AbstractC0266Ec.f4900f);
            case 16:
                return new Ph((C0910mg) fb.c(), AbstractC0266Ec.f4900f);
            case 17:
                return new Ph((C0910mg) fb.c(), AbstractC0266Ec.f4900f);
            case 18:
                return new Ph((C0910mg) fb.c(), AbstractC0266Ec.f4900f);
            case 19:
                return new Ph((C0910mg) fb.c(), AbstractC0266Ec.f4900f);
            case 20:
                C0996og c0996og = (C0996og) fb.c();
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.O4)).booleanValue()) {
                    Ph ph = new Ph(c0996og, AbstractC0266Ec.f4900f);
                    int i7 = AbstractC1266ut.f10952q;
                    obj = new Rt(ph);
                } else {
                    int i8 = AbstractC1266ut.f10952q;
                    obj = Mt.f6281x;
                }
                AbstractC0587ez.n(obj);
                return obj;
            case 21:
                return ((C0269Ef) fb).c();
            case 22:
                C0248Bc a4 = ((C1122re) fb).a();
                Q1.N n4 = N1.n.f1204A.c;
                return new C1364x4(UUID.randomUUID().toString(), a4, "native", new JSONObject(), true);
            case 23:
                Yj yj = (Yj) fb.c();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Ph(yj, c0260Dc);
            case 24:
                Yj yj2 = (Yj) fb.c();
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                return new Ph(yj2, c0260Dc2);
            case 25:
                Yj yj3 = (Yj) fb.c();
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                return new Ph(yj3, c0260Dc3);
            case 26:
                Yj yj4 = (Yj) fb.c();
                C0260Dc c0260Dc4 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc4);
                return new Ph(yj4, c0260Dc4);
            case 27:
                Yj yj5 = (Yj) fb.c();
                C0260Dc c0260Dc5 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc5);
                return new Ph(yj5, c0260Dc5);
            case 28:
                C1043pk c1043pk = (C1043pk) fb.c();
                C0260Dc c0260Dc6 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc6);
                Set d02 = Zf.d0(c1043pk, c0260Dc6);
                AbstractC0587ez.n(d02);
                return d02;
            default:
                C1043pk c1043pk2 = (C1043pk) fb.c();
                C0260Dc c0260Dc7 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc7);
                Set d03 = Zf.d0(c1043pk2, c0260Dc7);
                AbstractC0587ez.n(d03);
                return d03;
        }
    }
}
