package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.math.BigInteger;
import java.util.concurrent.ScheduledExecutorService;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B6 implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4027a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f4028b;
    public final FB c;
    public final FB d;

    public /* synthetic */ B6(FB fb, FB fb2, FB fb3, int i4) {
        this.f4027a = i4;
        this.f4028b = fb;
        this.c = fb2;
        this.d = fb3;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        String bigInteger;
        switch (this.f4027a) {
            case 0:
                ((C0865le) this.f4028b).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.c();
                return new A6(scheduledExecutorService);
            case 1:
                C1798a c1798a = (C1798a) this.f4028b.c();
                C1163sc c = ((C1165se) this.c).c();
                String str = ((Eg) this.d).a().f5911f;
                C0258Da c0258Da = c.c;
                synchronized (c0258Da) {
                    bigInteger = ((BigInteger) c0258Da.f4618p).toString();
                    c0258Da.f4618p = ((BigInteger) c0258Da.f4618p).add(BigInteger.ONE);
                    c0258Da.f4619q = bigInteger;
                }
                return new C0906mc(c1798a, c, bigInteger, str);
            case 2:
                return new C1253ug((Context) this.f4028b.c(), ((C1122re) this.c).a(), ((Eg) this.d).a(), 0);
            case 3:
                return new Jl((C1220tq) this.f4028b.c(), (InterfaceC1263uq) this.c.c(), ((C1165se) this.d).c());
            case 4:
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Un(c0260Dc, (Tj) this.f4028b.c(), (Ck) this.c.c(), (Yn) this.d.c(), 1);
            case 5:
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                return new Un(c0260Dc2, ((Eg) this.f4028b).a(), ((C1122re) this.c).a(), ((C1165se) this.d).c(), 2);
            case 6:
                Context a4 = ((C0865le) this.f4028b).a();
                C1035pc c1035pc = (C1035pc) this.c.c();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.d.c();
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                return new Nn(a4, c1035pc, scheduledExecutorService2, c0260Dc3);
            case 7:
                C0260Dc c0260Dc4 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc4);
                return new Un((Su) c0260Dc4, this.f4028b.c(), (Object) ((Eg) this.c).a(), (String) this.d.c(), 3);
            case 8:
                return new C1218to(((Zk) this.f4028b).c(), (PackageInfo) this.c.c(), ((C0865le) this.d).a());
            case 9:
                Context a5 = ((C0865le) this.f4028b).a();
                C0260Dc c0260Dc5 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc5);
                return new Un(a5, c0260Dc5, ((Eg) this.c).a(), ((C1122re) this.d).a());
            default:
                C0260Dc c0260Dc6 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc6);
                return new Un((Su) c0260Dc6, (Object) ((C0865le) this.f4028b).a(), (Object) ((C1122re) this.c).a(), ((C0994oe) this.d).c(), 7);
        }
    }
}
