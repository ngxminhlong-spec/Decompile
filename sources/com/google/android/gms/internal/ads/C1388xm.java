package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1388xm implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11299a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f11300b;
    public final FB c;
    public final AB d;

    public /* synthetic */ C1388xm(AB ab, C1414yB c1414yB, C1414yB c1414yB2, int i4) {
        this.f11299a = i4;
        this.d = ab;
        this.f11300b = c1414yB;
        this.c = c1414yB2;
    }

    public /* synthetic */ C1388xm(C1414yB c1414yB, AB ab, FB fb, int i4) {
        this.f11299a = i4;
        this.f11300b = c1414yB;
        this.d = ab;
        this.c = fb;
    }

    public /* synthetic */ C1388xm(C1414yB c1414yB, FB fb, AB ab, int i4) {
        this.f11299a = i4;
        this.f11300b = c1414yB;
        this.c = fb;
        this.d = ab;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.lp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.google.android.gms.internal.ads.fp] */
    private final InterfaceC0876lp b() {
        C0949nc c0949nc;
        Context context = (Context) this.d.f3930a;
        Sp sp = (Sp) this.f11300b.c();
        C0535dq c0535dq = (C0535dq) this.c.c();
        C0937n6 c0937n6 = AbstractC1066q6.z5;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            c0949nc = N1.n.f1204A.f1209g.c().x();
        } else {
            Q1.K c = N1.n.f1204A.f1209g.c();
            synchronized (c.f1642a) {
                c0949nc = c.f1655p;
            }
        }
        boolean z4 = false;
        if (c0949nc != null && c0949nc.f9740j) {
            z4 = true;
        }
        if (((Integer) rVar.c.a(AbstractC1066q6.P5)).intValue() > 0) {
            if (!((Boolean) rVar.c.a(AbstractC1066q6.y5)).booleanValue() || z4) {
                C0493cq a4 = c0535dq.a(Wp.f7571q, context, sp, new C1384xi(19, new Xj(14, false)));
                Op op = a4.f8417a;
                C0258Da c0258Da = new C0258Da((C0620fp) new Object());
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                return new C0381a5(c0258Da, new Op(op, c0260Dc), a4.f8418b, ((Xp) op.f6526q).f7699u, c0260Dc);
            }
        }
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.lp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.google.android.gms.internal.ads.fp] */
    public InterfaceC0876lp a() {
        C0949nc c0949nc;
        switch (this.f11299a) {
            case 6:
                return b();
            default:
                Context context = (Context) this.d.f3930a;
                Sp sp = (Sp) this.f11300b.c();
                C0535dq c0535dq = (C0535dq) this.c.c();
                C0937n6 c0937n6 = AbstractC1066q6.z5;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    c0949nc = N1.n.f1204A.f1209g.c().x();
                } else {
                    Q1.K c = N1.n.f1204A.f1209g.c();
                    synchronized (c.f1642a) {
                        c0949nc = c.f1655p;
                    }
                }
                boolean z4 = false;
                if (c0949nc != null && c0949nc.f9740j) {
                    z4 = true;
                }
                if (((Integer) rVar.c.a(AbstractC1066q6.B5)).intValue() > 0) {
                    if (!((Boolean) rVar.c.a(AbstractC1066q6.y5)).booleanValue() || z4) {
                        C0493cq a4 = c0535dq.a(Wp.f7569o, context, sp, new C1384xi(19, new Xj(14, false)));
                        Op op = a4.f8417a;
                        C0258Da c0258Da = new C0258Da((C0620fp) new Object());
                        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                        return new C0381a5(c0258Da, new Op(op, c0260Dc), a4.f8418b, ((Xp) op.f6526q).f7699u, c0260Dc);
                    }
                }
                return new Object();
        }
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f11299a) {
            case 0:
                return new C1173sm((Context) this.f11300b.c(), (C0262De) this.d.f3930a, (Executor) this.c.c(), 1);
            case 1:
                Context context = (Context) this.f11300b.c();
                C0248Bc a4 = ((C1122re) this.c).a();
                C0279Ge c0279Ge = (C0279Ge) this.d.f3930a;
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Am(context, a4, c0279Ge, c0260Dc);
            case 2:
                return new C1173sm((Context) this.f11300b.c(), (C1251ue) this.d.f3930a, (Executor) this.c.c(), 2);
            case 3:
                return new Am((Context) this.f11300b.c(), (C1251ue) this.d.f3930a, ((C1122re) this.c).a());
            case 4:
                return new C0405an((Context) this.f11300b.c(), (Executor) this.c.c(), (C0289Ie) this.d.f3930a, 0);
            case 5:
                return new C0405an((Context) this.f11300b.c(), (Executor) this.c.c(), (C0289Ie) this.d.f3930a, 1);
            case 6:
                return a();
            default:
                return a();
        }
    }
}
