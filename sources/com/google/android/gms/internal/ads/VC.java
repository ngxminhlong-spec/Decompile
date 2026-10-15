package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class VC implements InterfaceC1374xE, ED {

    /* renamed from: o, reason: collision with root package name */
    public final C1475zn f7248o;

    /* renamed from: p, reason: collision with root package name */
    public final C1210tg f7249p;

    /* renamed from: q, reason: collision with root package name */
    public final Rg f7250q;

    /* renamed from: r, reason: collision with root package name */
    public final C0381a5 f7251r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f7252s;

    /* renamed from: t, reason: collision with root package name */
    public C0.s0 f7253t;

    /* renamed from: u, reason: collision with root package name */
    public AA f7254u;

    /* renamed from: v, reason: collision with root package name */
    public C1135rr f7255v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7256w;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.a5, java.lang.Object] */
    public VC(C1475zn c1475zn) {
        c1475zn.getClass();
        this.f7248o = c1475zn;
        int i4 = AbstractC0751is.f9071a;
        Looper myLooper = Looper.myLooper();
        this.f7253t = new C0.s0(myLooper == null ? Looper.getMainLooper() : myLooper, c1475zn, Yv.N);
        C1210tg c1210tg = new C1210tg();
        this.f7249p = c1210tg;
        this.f7250q = new Rg();
        ?? obj = new Object();
        obj.f8077p = c1210tg;
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        obj.f8078q = Gt.f5344s;
        obj.f8079r = Lt.f6175u;
        this.f7251r = obj;
        this.f7252s = new SparseArray();
    }

    public final void a(MC mc, Looper looper) {
        boolean z4 = true;
        if (this.f7254u != null && !((AbstractC1137rt) this.f7251r.f8078q).isEmpty()) {
            z4 = false;
        }
        Zf.X(z4);
        mc.getClass();
        this.f7254u = mc;
        this.f7255v = this.f7248o.d(looper, null);
        C0.s0 s0Var = this.f7253t;
        this.f7253t = new C0.s0((CopyOnWriteArraySet) s0Var.f390f, looper, (C1475zn) s0Var.c, new C0831kn(6, this, mc), s0Var.f388b);
    }

    public final OC b() {
        return f((C1202tE) this.f7251r.f8080s);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public final void c(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE) {
        e(i(i4, c1202tE), 1000, new C0558eC(7));
    }

    public final OC d(AbstractC0484ch abstractC0484ch, int i4, C1202tE c1202tE) {
        C1202tE c1202tE2 = true == abstractC0484ch.o() ? null : c1202tE;
        this.f7248o.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = false;
        if (abstractC0484ch.equals(this.f7254u.k1()) && i4 == this.f7254u.Y0()) {
            z4 = true;
        }
        long j4 = 0;
        if (c1202tE2 == null || !c1202tE2.b()) {
            if (z4) {
                j4 = this.f7254u.g1();
            } else if (!abstractC0484ch.o()) {
                abstractC0484ch.e(i4, this.f7250q, 0L).getClass();
                j4 = AbstractC0751is.w(0L);
            }
        } else if (z4 && this.f7254u.V0() == c1202tE2.f10689b && this.f7254u.X0() == c1202tE2.c) {
            j4 = this.f7254u.h1();
        }
        return new OC(elapsedRealtime, abstractC0484ch, i4, c1202tE2, j4, this.f7254u.k1(), this.f7254u.Y0(), (C1202tE) this.f7251r.f8080s, this.f7254u.h1(), this.f7254u.j1());
    }

    public final void e(OC oc, int i4, InterfaceC1132ro interfaceC1132ro) {
        this.f7252s.put(i4, oc);
        C0.s0 s0Var = this.f7253t;
        s0Var.f(i4, interfaceC1132ro);
        s0Var.e();
    }

    public final OC f(C1202tE c1202tE) {
        this.f7254u.getClass();
        AbstractC0484ch abstractC0484ch = c1202tE == null ? null : (AbstractC0484ch) ((Lt) this.f7251r.f8079r).get(c1202tE);
        if (c1202tE != null && abstractC0484ch != null) {
            return d(abstractC0484ch, abstractC0484ch.n(c1202tE.f10688a, this.f7249p).c, c1202tE);
        }
        int Y02 = this.f7254u.Y0();
        AbstractC0484ch k1 = this.f7254u.k1();
        if (Y02 >= k1.c()) {
            k1 = AbstractC0484ch.f8374a;
        }
        return d(k1, Y02, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public final void g(int i4, C1202tE c1202tE, C1074qE c1074qE) {
        OC i5 = i(i4, c1202tE);
        e(i5, 1004, new Qw(i5, c1074qE, 3, false));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public final void h(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE) {
        e(i(i4, c1202tE), 1002, new C0558eC(25));
    }

    public final OC i(int i4, C1202tE c1202tE) {
        AA aa = this.f7254u;
        aa.getClass();
        if (c1202tE != null) {
            return ((AbstractC0484ch) ((Lt) this.f7251r.f8079r).get(c1202tE)) != null ? f(c1202tE) : d(AbstractC0484ch.f8374a, i4, c1202tE);
        }
        AbstractC0484ch k1 = aa.k1();
        if (i4 >= k1.c()) {
            k1 = AbstractC0484ch.f8374a;
        }
        return d(k1, i4, null);
    }

    public final OC j() {
        return f((C1202tE) this.f7251r.f8081t);
    }

    public final void k(AbstractC0318Od abstractC0318Od) {
        C1202tE c1202tE;
        OC b4 = (!(abstractC0318Od instanceof ZB) || (c1202tE = ((ZB) abstractC0318Od).f7977v) == null) ? b() : f(c1202tE);
        e(b4, 10, new Xj(29, b4, abstractC0318Od));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public final void m(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE, IOException iOException, boolean z4) {
        OC i5 = i(i4, c1202tE);
        e(i5, 1003, new C0388aC(i5, c0859lE, c1074qE, iOException, z4));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public final void n(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE) {
        e(i(i4, c1202tE), 1001, new C0558eC(27));
    }
}
