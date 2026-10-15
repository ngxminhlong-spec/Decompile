package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import c3.InterfaceFutureC0239a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488cl implements InterfaceC0958nl {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f8393h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    public final u0.g f8394a;

    /* renamed from: b, reason: collision with root package name */
    public final Su f8395b;
    public final Jp c;
    public final ScheduledExecutorService d;

    /* renamed from: e, reason: collision with root package name */
    public final Rl f8396e;

    /* renamed from: f, reason: collision with root package name */
    public final Eq f8397f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f8398g;

    public C0488cl(Context context, Jp jp, u0.g gVar, Su su, ScheduledExecutorService scheduledExecutorService, Rl rl, Eq eq) {
        this.f8398g = context;
        this.c = jp;
        this.f8394a = gVar;
        this.f8395b = su;
        this.d = scheduledExecutorService;
        this.f8396e = rl;
        this.f8397f = eq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0958nl
    public final InterfaceFutureC0239a a(C0370Za c0370Za) {
        InterfaceFutureC0239a c02;
        u0.g gVar = this.f8394a;
        Su su = (Su) gVar.f14984q;
        String str = c0370Za.f7992r;
        Q1.N n4 = N1.n.f1204A.c;
        if (Q1.N.b(str)) {
            c02 = Bs.f0(new Xk(1));
        } else {
            c02 = Bs.c0(((C0260Dc) ((Su) gVar.f14983p)).b(new B0.v(10, gVar, c0370Za)), ExecutionException.class, C0364Xe.d, su);
        }
        C0497cu c03 = Bs.c0(c02, C1001ol.class, new Yk(gVar, c0370Za, Binder.getCallingUid(), 0), su);
        Aq f4 = Zf.f(this.f8398g, 11);
        Zf.N(c03, f4);
        AbstractC1138ru n02 = Bs.n0(c03, new C0512d8(12, this), this.f8395b);
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.I4)).booleanValue()) {
            n02 = Bs.c0(Bs.o0(n02, ((Integer) r2.c.a(AbstractC1066q6.J4)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, C0364Xe.f7659e, AbstractC0266Ec.f4900f);
        }
        Zf.Z(n02, this.f8397f, f4, false);
        n02.a(new Nu(0, n02, new C1384xi(7, this)), AbstractC0266Ec.f4900f);
        return n02;
    }
}
