package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.measurement.C1510e1;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.a5 */
/* loaded from: classes.dex */
public final class C0381a5 implements Cu, N1.e, InterfaceC0876lp {

    /* renamed from: o */
    public Object f8076o;

    /* renamed from: p */
    public Object f8077p;

    /* renamed from: q */
    public Object f8078q;

    /* renamed from: r */
    public Object f8079r;

    /* renamed from: s */
    public Object f8080s;

    /* renamed from: t */
    public Object f8081t;

    public C0381a5(int i4) {
        switch (i4) {
            case 9:
                this.f8077p = null;
                this.f8078q = null;
                this.f8079r = null;
                this.f8080s = null;
                this.f8076o = null;
                this.f8081t = C0753iv.f9093v;
                return;
            default:
                this.f8077p = null;
                this.f8078q = new D3(6, this);
                this.f8079r = new Object();
                return;
        }
    }

    public C0381a5(C0258Da c0258Da, Op op, C0817kF c0817kF, String str, C0260Dc c0260Dc) {
        this.f8077p = c0258Da;
        this.f8078q = op;
        this.f8079r = c0817kF;
        this.f8080s = str;
        this.f8081t = c0260Dc;
    }

    public C0381a5(C1006oq c1006oq, Object obj, String str, InterfaceFutureC0239a interfaceFutureC0239a, List list, InterfaceFutureC0239a interfaceFutureC0239a2) {
        this.f8081t = c1006oq;
        this.f8079r = obj;
        this.f8077p = str;
        this.f8078q = interfaceFutureC0239a;
        this.f8080s = list;
        this.f8076o = interfaceFutureC0239a2;
    }

    public /* synthetic */ C0381a5(String str) {
        this.f8078q = str;
    }

    public static boolean C(C1202tE c1202tE, Object obj, boolean z4, int i4, int i5) {
        Object obj2 = c1202tE.f10688a;
        int i6 = c1202tE.f10689b;
        if (obj2.equals(obj)) {
            return z4 ? i6 == i4 && c1202tE.c == i5 : i6 == -1 && c1202tE.f10690e == -1;
        }
        return false;
    }

    public static String g(C0381a5 c0381a5) {
        String str = (String) O1.r.d.c.a(AbstractC1066q6.D8);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) c0381a5.f8077p);
            jSONObject.put("eventCategory", (String) c0381a5.f8078q);
            jSONObject.putOpt("event", (String) c0381a5.f8079r);
            jSONObject.putOpt("errorCode", (Integer) c0381a5.f8080s);
            jSONObject.putOpt("rewardType", (String) c0381a5.f8076o);
            jSONObject.putOpt("rewardAmount", (Integer) c0381a5.f8081t);
        } catch (JSONException unused) {
            Y9.s("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }

    public static final void m(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            O5 o5 = (O5) arrayList.get(i4);
            if (o5.S() == 2 && o5.B() > j4) {
                j4 = o5.B();
            }
        }
        if (j4 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j4));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public static /* bridge */ /* synthetic */ void v(C0381a5 c0381a5) {
        synchronized (c0381a5.f8079r) {
            try {
                C0466c5 c0466c5 = (C0466c5) c0381a5.f8080s;
                if (c0466c5 == null) {
                    return;
                }
                if (c0466c5.a() || ((C0466c5) c0381a5.f8080s).g()) {
                    ((C0466c5) c0381a5.f8080s).k();
                }
                c0381a5.f8080s = null;
                c0381a5.f8081t = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1202tE y(AA aa, AbstractC1137rt abstractC1137rt, C1202tE c1202tE, C1210tg c1210tg) {
        AbstractC0484ch k1 = aa.k1();
        int a12 = aa.a1();
        Object f4 = k1.o() ? null : k1.f(a12);
        if (!aa.p1() && !k1.o()) {
            C1210tg d = k1.d(a12, c1210tg, false);
            aa.h1();
            int i4 = AbstractC0751is.f9071a;
            d.getClass();
        }
        for (int i5 = 0; i5 < abstractC1137rt.size(); i5++) {
            C1202tE c1202tE2 = (C1202tE) abstractC1137rt.get(i5);
            if (C(c1202tE2, f4, aa.p1(), aa.V0(), aa.X0())) {
                return c1202tE2;
            }
        }
        if (abstractC1137rt.isEmpty() && c1202tE != null && C(c1202tE, f4, aa.p1(), aa.V0(), aa.X0())) {
            return c1202tE;
        }
        return null;
    }

    public void A() {
        synchronized (this.f8079r) {
            try {
                if (((Context) this.f8076o) != null && ((C0466c5) this.f8080s) == null) {
                    C0466c5 n4 = n(new C0874ln(9, this), new M3(9, this));
                    this.f8080s = n4;
                    n4.n();
                }
            } finally {
            }
        }
    }

    public void B(AbstractC0484ch abstractC0484ch) {
        J2 j22 = new J2(4);
        if (((AbstractC1137rt) this.f8078q).isEmpty()) {
            z(j22, (C1202tE) this.f8076o, abstractC0484ch);
            if (!Bs.r((C1202tE) this.f8081t, (C1202tE) this.f8076o)) {
                z(j22, (C1202tE) this.f8081t, abstractC0484ch);
            }
            if (!Bs.r((C1202tE) this.f8080s, (C1202tE) this.f8076o) && !Bs.r((C1202tE) this.f8080s, (C1202tE) this.f8081t)) {
                z(j22, (C1202tE) this.f8080s, abstractC0484ch);
            }
        } else {
            for (int i4 = 0; i4 < ((AbstractC1137rt) this.f8078q).size(); i4++) {
                z(j22, (C1202tE) ((AbstractC1137rt) this.f8078q).get(i4), abstractC0484ch);
            }
            if (!((AbstractC1137rt) this.f8078q).contains((C1202tE) this.f8080s)) {
                z(j22, (C1202tE) this.f8080s, abstractC0484ch);
            }
        }
        this.f8079r = j22.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0876lp
    public InterfaceFutureC0239a a(final Wl wl, final InterfaceC0833kp interfaceC0833kp) {
        synchronized (this) {
            C0244Ae u2 = interfaceC0833kp.u((InterfaceC0790jp) wl.f7564q);
            C0492cp c0492cp = new C0492cp((String) this.f8080s);
            switch (u2.f3963a) {
                case 0:
                    u2.d = c0492cp;
                    break;
                default:
                    u2.d = c0492cp;
                    break;
            }
            final InterfaceC1425yg interfaceC1425yg = (InterfaceC1425yg) u2.c();
            interfaceC1425yg.h();
            interfaceC1425yg.h();
            O1.U0 u02 = interfaceC1425yg.h().d;
            if (u02.f1299G != null || u02.f1304L != null) {
                this.f8076o = interfaceC1425yg;
                return ((C0258Da) this.f8077p).m(wl, interfaceC0833kp, interfaceC1425yg);
            }
            Jp h4 = interfaceC1425yg.h();
            final C0450bp c0450bp = new C0450bp(interfaceC0833kp, wl, h4.d, h4.f5911f, (Executor) this.f8081t, h4.f5915j, null);
            return Bs.n0(Ku.q(((Op) this.f8078q).o(wl, interfaceC0833kp, interfaceC1425yg)), new Du() { // from class: com.google.android.gms.internal.ads.ap
                @Override // com.google.android.gms.internal.ads.Du
                public final InterfaceFutureC0239a l(Object obj) {
                    C0497cu a4;
                    C0381a5 c0381a5 = C0381a5.this;
                    Wl wl2 = wl;
                    C0450bp c0450bp2 = c0450bp;
                    InterfaceC0833kp interfaceC0833kp2 = interfaceC0833kp;
                    InterfaceC1425yg interfaceC1425yg2 = interfaceC1425yg;
                    C0534dp c0534dp = (C0534dp) obj;
                    if (c0534dp != null) {
                        C0450bp c0450bp3 = new C0450bp(c0450bp2.f8286a, c0450bp2.f8287b, c0450bp2.c, c0450bp2.d, c0450bp2.f8288e, c0450bp2.f8289f, c0534dp.f8511a);
                        if (c0534dp.c != null) {
                            c0381a5.f8076o = null;
                            ((C0817kF) c0381a5.f8079r).c(c0450bp3);
                            return c0381a5.s(c0534dp.c, wl2);
                        }
                        C0817kF c0817kF = (C0817kF) c0381a5.f8079r;
                        synchronized (c0817kF) {
                            c0817kF.f9284o = 2;
                            a4 = c0817kF.g() ? null : ((Xq) c0817kF.f9288s).a(c0450bp3);
                        }
                        if (a4 != null) {
                            c0381a5.f8076o = null;
                            return Bs.n0(a4, new C0512d8(24, c0381a5), (Executor) c0381a5.f8081t);
                        }
                        ((C0817kF) c0381a5.f8079r).c(c0450bp3);
                        wl2 = new Wl((InterfaceC0790jp) wl2.f7564q, c0534dp.f8512b, 2, false);
                    }
                    InterfaceFutureC0239a m4 = ((C0258Da) c0381a5.f8077p).m(wl2, interfaceC0833kp2, interfaceC1425yg2);
                    c0381a5.f8076o = interfaceC1425yg2;
                    return m4;
                }
            }, (Executor) this.f8081t);
        }
    }

    @Override // com.google.android.gms.internal.ads.Cu
    /* renamed from: b */
    public InterfaceFutureC0239a mo0b() {
        C0347Uc c0347Uc = N1.n.f1204A.d;
        Context context = (Context) this.f8076o;
        C0887m c0887m = new C0887m(0, 0, 0);
        I3 i32 = (I3) this.f8077p;
        C1510e1 c1510e1 = (C1510e1) this.f8079r;
        C0348Ud c = C0347Uc.c(context, c0887m, "", false, false, i32, null, (C0248Bc) this.f8078q, null, c1510e1, new C0764j5(), null, null, (BinderC0489cm) this.f8080s);
        C0594f5 c0594f5 = new C0594f5(c);
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = c.f7165o;
        viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7464A.f8147u = new C0328Qd(c0594f5, 0);
        viewTreeObserverOnGlobalLayoutListenerC0358Wd.loadUrl((String) this.f8081t);
        return c0594f5;
    }

    @Override // N1.e
    public void c() {
        if (((AtomicBoolean) this.f8081t).get()) {
            ((Gg) this.f8077p).D();
        }
    }

    public C0834kq d() {
        C1006oq c1006oq = (C1006oq) this.f8081t;
        Object obj = this.f8079r;
        String str = (String) this.f8077p;
        if (str == null) {
            c1006oq.getClass();
            str = ((EnumC0877lq) obj).f9493o;
        }
        C0834kq c0834kq = new C0834kq(obj, str, (InterfaceFutureC0239a) this.f8076o);
        c1006oq.c.n1(new C1384xi(24, c0834kq));
        InterfaceFutureC0239a interfaceFutureC0239a = (InterfaceFutureC0239a) this.f8078q;
        Jn jn = new Jn(6, this, c0834kq);
        C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
        interfaceFutureC0239a.a(jn, c0260Dc);
        c0834kq.a(new Nu(0, c0834kq, new C0258Da(this, c0834kq, 28, false)), c0260Dc);
        return c0834kq;
    }

    @Override // N1.e
    public void e() {
        if (((AtomicBoolean) this.f8081t).get()) {
            ((Qg) this.f8078q).b();
            Th th = (Th) this.f8079r;
            synchronized (th) {
                th.n1(C0782jh.f9185E);
            }
        }
    }

    @Override // N1.e
    public synchronized void f(View view) {
        if (((AtomicBoolean) this.f8081t).compareAndSet(false, true)) {
            ((C1209tf) this.f8076o).p();
            ((Qh) this.f8080s).r1(view);
        }
    }

    public void h(int i4) {
        if (i4 != 16 && i4 != 24 && i4 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i4)));
        }
        this.f8077p = Integer.valueOf(i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0876lp
    public Object i() {
        InterfaceC1425yg interfaceC1425yg;
        synchronized (this) {
            interfaceC1425yg = (InterfaceC1425yg) this.f8076o;
        }
        return interfaceC1425yg;
    }

    public C0424b5 j(C0509d5 c0509d5) {
        synchronized (this.f8079r) {
            if (((C0551e5) this.f8081t) == null) {
                return new C0424b5();
            }
            try {
                if (((C0466c5) this.f8080s).A()) {
                    C0551e5 c0551e5 = (C0551e5) this.f8081t;
                    Parcel Q3 = c0551e5.Q();
                    AbstractC1192t4.c(Q3, c0509d5);
                    Parcel q12 = c0551e5.q1(Q3, 2);
                    C0424b5 c0424b5 = (C0424b5) AbstractC1192t4.a(q12, C0424b5.CREATOR);
                    q12.recycle();
                    return c0424b5;
                }
                C0551e5 c0551e52 = (C0551e5) this.f8081t;
                Parcel Q4 = c0551e52.Q();
                AbstractC1192t4.c(Q4, c0509d5);
                Parcel q13 = c0551e52.q1(Q4, 1);
                C0424b5 c0424b52 = (C0424b5) AbstractC1192t4.a(q13, C0424b5.CREATOR);
                q13.recycle();
                return c0424b52;
            } catch (RemoteException e4) {
                Y9.q("Unable to call into cache service.", e4);
                return new C0424b5();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, com.google.android.gms.internal.ads.zg] */
    public boolean k(O1.U0 u02, String str, Zf zf, Gn gn) {
        Op op = (Op) this.f8079r;
        Bn bn = (Bn) op.f6526q;
        C1423ye c1423ye = (C1423ye) this.f8078q;
        Q1.N n4 = N1.n.f1204A.c;
        Context context = (Context) this.f8076o;
        if (Q1.N.e(context) && u02.f1299G == null) {
            Y9.p("Failed to load the ad because app ID is missing.");
            final int i4 = 0;
            c1423ye.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.In

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ C0381a5 f5721p;

                {
                    this.f5721p = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            ((Fn) ((Op) this.f5721p.f8079r).f6527r).J(Zf.L(4, null, null));
                            return;
                        default:
                            ((Fn) ((Op) this.f5721p.f8079r).f6527r).J(Zf.L(6, null, null));
                            return;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            Y9.p("Ad unit ID should not be null for NativeAdLoader.");
            final int i5 = 1;
            c1423ye.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.In

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ C0381a5 f5721p;

                {
                    this.f5721p = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i5) {
                        case 0:
                            ((Fn) ((Op) this.f5721p.f8079r).f6527r).J(Zf.L(4, null, null));
                            return;
                        default:
                            ((Fn) ((Op) this.f5721p.f8079r).f6527r).J(Zf.L(6, null, null));
                            return;
                    }
                }
            });
            return false;
        }
        Zf.n(context, u02.f1311t);
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.P7)).booleanValue() && u02.f1311t) {
            ((Ok) c1423ye.f11422w.c()).e(true);
        }
        int i6 = ((Hn) zf).c;
        Ip ip = (Ip) this.f8077p;
        ip.f5727a = u02;
        ip.f5737m = i6;
        Jp a4 = ip.a();
        Aq v4 = Zf.v(context, Zf.U(a4), 8, u02);
        O1.O o4 = a4.f5919n;
        if (o4 != null) {
            bn.v(o4);
        }
        C1423ye c1423ye2 = c1423ye.f11395b;
        ?? obj = new Object();
        obj.f11620a = context;
        obj.f11621b = a4;
        C1468zg c1468zg = new C1468zg(obj);
        Ch ch = new Ch();
        ch.c(bn, c1423ye.a());
        Dh dh = new Dh(ch);
        C0783ji c0783ji = new C0783ji(0, (Gi) op.f6525p, bn.l());
        Eq eq = null;
        C1251ue c1251ue = new C1251ue(c1423ye2, new C0874ln(20, null), c0783ji, dh, c1468zg, new Xj(7, false), null, null);
        if (((Boolean) G6.c.r()).booleanValue()) {
            eq = (Eq) c1251ue.f10852e.c();
            eq.h(8);
            eq.b(u02.f1296D);
        }
        ((Qp) c1423ye.f11372E.c()).b(1);
        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c1423ye.f11399e.c();
        C0781jg c0781jg = (C0781jg) c1251ue.f10819O0.c();
        C0834kq a5 = c0781jg.a(c0781jg.b());
        C0611fg c0611fg = new C0611fg(c0260Dc, scheduledExecutorService, a5);
        this.f8081t = c0611fg;
        a5.a(new Nu(0, a5, new C0258Da(c0611fg, new C0275Ga(this, (Xj) gn, eq, v4, c1251ue, 4), 19, false)), c0260Dc);
        return true;
    }

    public void l(int i4) {
        if (i4 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i4)));
        }
        this.f8078q = Integer.valueOf(i4);
    }

    public synchronized C0466c5 n(C0874ln c0874ln, M3 m32) {
        return new C0466c5((Context) this.f8076o, N1.n.f1204A.f1220r.b(), c0874ln, m32);
    }

    public void o(int i4) {
        if (i4 < 12 || i4 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i4)));
        }
        this.f8079r = Integer.valueOf(i4);
    }

    public C0381a5 p(InterfaceC0749iq interfaceC0749iq) {
        return r(new C0512d8(26, interfaceC0749iq));
    }

    public void q(int i4) {
        if (i4 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i4)));
        }
        this.f8080s = Integer.valueOf(i4);
    }

    public C0381a5 r(Du du) {
        C1006oq c1006oq = (C1006oq) this.f8081t;
        Su su = c1006oq.f9859a;
        return new C0381a5(c1006oq, this.f8079r, (String) this.f8077p, (InterfaceFutureC0239a) this.f8078q, (List) this.f8080s, Bs.n0((InterfaceFutureC0239a) this.f8076o, du, su));
    }

    public InterfaceFutureC0239a s(Yp yp, Wl wl) {
        InterfaceC1425yg interfaceC1425yg = yp.f7898a;
        this.f8076o = interfaceC1425yg;
        if (yp.c != null) {
            if (interfaceC1425yg.d() != null) {
                yp.c.f7860e.v(yp.f7898a.d());
            }
            return Bs.h0(yp.c);
        }
        interfaceC1425yg.c().f9173g = yp.f7899b;
        return ((C0258Da) this.f8077p).m(wl, null, yp.f7898a);
    }

    public Jv t() {
        if (((Integer) this.f8077p) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f8078q) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f8079r) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f8080s;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((Iv) this.f8076o) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int intValue = num.intValue();
        Iv iv = (Iv) this.f8076o;
        if (iv == Iv.f5760q) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (iv == Iv.f5761r) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (iv == Iv.f5762s) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (iv == Iv.f5763t) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (iv != Iv.f5764u) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new Jv(((Integer) this.f8077p).intValue(), ((Integer) this.f8078q).intValue(), ((Integer) this.f8079r).intValue(), ((Integer) this.f8080s).intValue(), (C0753iv) this.f8081t, (Iv) this.f8076o);
    }

    public C0497cu u(C0370Za c0370Za, InterfaceC1087ql interfaceC1087ql, InterfaceC1087ql interfaceC1087ql2, Du du) {
        Su su = (Su) this.f8077p;
        String str = c0370Za.f7992r;
        Q1.N n4 = N1.n.f1204A.c;
        return Bs.c0(Bs.n0(Ku.q(Q1.N.b(str) ? Bs.f0(new Xk(1)) : Bs.c0(interfaceC1087ql.o(c0370Za), ExecutionException.class, C0364Xe.f7661g, su)), du, su), C1001ol.class, new C0727i9(this, interfaceC1087ql2, c0370Za, du, 2), su);
    }

    public C0381a5 w(long j4) {
        return new C0381a5((C1006oq) this.f8081t, this.f8079r, (String) this.f8077p, (InterfaceFutureC0239a) this.f8078q, (List) this.f8080s, Bs.o0((InterfaceFutureC0239a) this.f8076o, j4, TimeUnit.SECONDS, ((C1006oq) this.f8081t).f9860b));
    }

    public void x(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f8079r) {
            try {
                if (((Context) this.f8076o) != null) {
                    return;
                }
                this.f8076o = context.getApplicationContext();
                C0937n6 c0937n6 = AbstractC1066q6.f10096D3;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    A();
                } else {
                    if (((Boolean) rVar.c.a(AbstractC1066q6.f10091C3)).booleanValue()) {
                        N1.n.f1204A.f1208f.i(new Z4(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(J2 j22, C1202tE c1202tE, AbstractC0484ch abstractC0484ch) {
        if (c1202tE == null) {
            return;
        }
        if (abstractC0484ch.a(c1202tE.f10688a) != -1) {
            j22.a(c1202tE, abstractC0484ch);
            return;
        }
        AbstractC0484ch abstractC0484ch2 = (AbstractC0484ch) ((Lt) this.f8079r).get(c1202tE);
        if (abstractC0484ch2 != null) {
            j22.a(c1202tE, abstractC0484ch2);
        }
    }
}
