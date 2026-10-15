package com.google.android.gms.internal.ads;

import O1.InterfaceC0068i0;
import Q1.C0111j;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import b0.RunnableC0203p;
import java.io.IOException;
import java.util.List;
import l2.C1798a;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0314Ne extends O1.Z {

    /* renamed from: A, reason: collision with root package name */
    public final C1108r6 f6338A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f6339B = false;

    /* renamed from: o, reason: collision with root package name */
    public final Context f6340o;

    /* renamed from: p, reason: collision with root package name */
    public final C0248Bc f6341p;

    /* renamed from: q, reason: collision with root package name */
    public final Tj f6342q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC0830km f6343r;

    /* renamed from: s, reason: collision with root package name */
    public final C1131rn f6344s;

    /* renamed from: t, reason: collision with root package name */
    public final Ck f6345t;

    /* renamed from: u, reason: collision with root package name */
    public final C0356Wb f6346u;

    /* renamed from: v, reason: collision with root package name */
    public final Vj f6347v;

    /* renamed from: w, reason: collision with root package name */
    public final Ok f6348w;

    /* renamed from: x, reason: collision with root package name */
    public final C0894m6 f6349x;
    public final Fq y;

    /* renamed from: z, reason: collision with root package name */
    public final Op f6350z;

    public BinderC0314Ne(Context context, C0248Bc c0248Bc, Tj tj, InterfaceC0830km interfaceC0830km, C1131rn c1131rn, Ck ck, C0356Wb c0356Wb, Vj vj, Ok ok, C0894m6 c0894m6, Fq fq, Op op, C1108r6 c1108r6) {
        this.f6340o = context;
        this.f6341p = c0248Bc;
        this.f6342q = tj;
        this.f6343r = interfaceC0830km;
        this.f6344s = c1131rn;
        this.f6345t = ck;
        this.f6346u = c0356Wb;
        this.f6347v = vj;
        this.f6348w = ok;
        this.f6349x = c0894m6;
        this.y = fq;
        this.f6350z = op;
        this.f6338A = c1108r6;
    }

    @Override // O1.InterfaceC0052a0
    public final void B1(InterfaceC0068i0 interfaceC0068i0) {
        this.f6348w.d(interfaceC0068i0, Nk.f6373p);
    }

    @Override // O1.InterfaceC0052a0
    public final void D0(String str) {
        this.f6344s.d(str);
    }

    @Override // O1.InterfaceC0052a0
    public final synchronized void F3(boolean z4) {
        N1.n.f1204A.f1210h.b(z4);
    }

    @Override // O1.InterfaceC0052a0
    public final void K(String str) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.p8)).booleanValue()) {
            N1.n.f1204A.f1209g.f9972g = str;
        }
    }

    @Override // O1.InterfaceC0052a0
    public final void T0(String str, InterfaceC1812a interfaceC1812a) {
        if (interfaceC1812a == null) {
            Y9.p("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        if (context == null) {
            Y9.p("Context is null. Failed to open debug menu.");
            return;
        }
        C0111j c0111j = new C0111j(context);
        c0111j.d = str;
        c0111j.f1705e = this.f6341p.f4084o;
        c0111j.b();
    }

    @Override // O1.InterfaceC0052a0
    public final void U(boolean z4) {
        try {
            Xr g4 = Xr.g(this.f6340o);
            g4.f7305f.s(Boolean.valueOf(z4), "paidv2_publisher_option");
            if (z4) {
                return;
            }
            g4.h();
        } catch (IOException e4) {
            throw new RemoteException(e4.getMessage());
        }
    }

    @Override // O1.InterfaceC0052a0
    public final synchronized void V(String str) {
        AbstractC1066q6.a(this.f6340o);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10293u3)).booleanValue()) {
                N1.n.f1204A.f1213k.q(this.f6340o, this.f6341p, true, null, str, null, null, this.y);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    @Override // O1.InterfaceC0052a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X2(java.lang.String r13, n2.InterfaceC1812a r14) {
        /*
            r12 = this;
            android.content.Context r0 = r12.f6340o
            com.google.android.gms.internal.ads.AbstractC1066q6.a(r0)
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10316z3
            O1.r r2 = O1.r.d
            com.google.android.gms.internal.ads.p6 r2 = r2.c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2a
            N1.n r1 = N1.n.f1204A     // Catch: android.os.RemoteException -> L20
            Q1.N r1 = r1.c     // Catch: android.os.RemoteException -> L20
            java.lang.String r0 = Q1.N.C(r0)     // Catch: android.os.RemoteException -> L20
            goto L2c
        L20:
            r0 = move-exception
            N1.n r1 = N1.n.f1204A
            com.google.android.gms.internal.ads.pc r1 = r1.f1209g
            java.lang.String r2 = "NonagonMobileAdsSettingManager_AppId"
            r1.h(r2, r0)
        L2a:
            java.lang.String r0 = ""
        L2c:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L35
            r8 = r13
            goto L36
        L35:
            r8 = r0
        L36:
            boolean r13 = android.text.TextUtils.isEmpty(r8)
            if (r13 == 0) goto L3d
            goto L8b
        L3d:
            com.google.android.gms.internal.ads.n6 r13 = com.google.android.gms.internal.ads.AbstractC1066q6.f10293u3
            O1.r r0 = O1.r.d
            com.google.android.gms.internal.ads.p6 r1 = r0.c
            com.google.android.gms.internal.ads.p6 r0 = r0.c
            java.lang.Object r13 = r1.a(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10103F0
            java.lang.Object r3 = r0.a(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r13 = r13 | r3
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L76
            java.lang.Object r13 = n2.BinderC1813b.C2(r14)
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            com.google.android.gms.internal.ads.Me r14 = new com.google.android.gms.internal.ads.Me
            r0 = 0
            r14.<init>(r12, r13, r0)
        L74:
            r10 = r14
            goto L79
        L76:
            r14 = 0
            r2 = r13
            goto L74
        L79:
            if (r2 == 0) goto L8b
            N1.n r13 = N1.n.f1204A
            N1.d r3 = r13.f1213k
            r7 = 0
            r9 = 0
            android.content.Context r4 = r12.f6340o
            com.google.android.gms.internal.ads.Bc r5 = r12.f6341p
            r6 = 1
            com.google.android.gms.internal.ads.Fq r11 = r12.y
            r3.q(r4, r5, r6, r7, r8, r9, r10, r11)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC0314Ne.X2(java.lang.String, n2.a):void");
    }

    @Override // O1.InterfaceC0052a0
    public final synchronized float a() {
        return N1.n.f1204A.f1210h.a();
    }

    @Override // O1.InterfaceC0052a0
    public final String d() {
        return this.f6341p.f4084o;
    }

    @Override // O1.InterfaceC0052a0
    public final void g() {
        this.f6345t.f4539q = false;
    }

    @Override // O1.InterfaceC0052a0
    public final void g1(A8 a8) {
        Ck ck = this.f6345t;
        ck.getClass();
        ck.f4527e.f5017o.a(new RunnableC0203p(26, ck, a8), ck.f4532j);
    }

    @Override // O1.InterfaceC0052a0
    public final void g3(O1.P0 p02) {
        C0356Wb c0356Wb = this.f6346u;
        Context context = this.f6340o;
        c0356Wb.getClass();
        C0258Da G3 = C0326Qb.N(context).G();
        ((C1798a) G3.f4618p).getClass();
        ((C0316Ob) G3.f4619q).b(-1, System.currentTimeMillis());
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10225g0)).booleanValue() && c0356Wb.j(context) && C0356Wb.k(context)) {
            synchronized (c0356Wb.f7456l) {
            }
        }
    }

    @Override // O1.InterfaceC0052a0
    public final List h() {
        return this.f6345t.a();
    }

    @Override // O1.InterfaceC0052a0
    public final synchronized void k() {
        if (this.f6339B) {
            Y9.s("Mobile ads is initialized already.");
            return;
        }
        AbstractC1066q6.a(this.f6340o);
        this.f6338A.a();
        Context context = this.f6340o;
        C0248Bc c0248Bc = this.f6341p;
        N1.n nVar = N1.n.f1204A;
        nVar.f1209g.f(context, c0248Bc);
        nVar.f1211i.x(this.f6340o);
        this.f6339B = true;
        this.f6345t.b();
        C1131rn c1131rn = this.f6344s;
        c1131rn.getClass();
        Q1.K c = nVar.f1209g.c();
        c.c.add(new RunnableC1089qn(c1131rn, 1));
        c1131rn.f10526f.execute(new RunnableC1089qn(c1131rn, 0));
        C0937n6 c0937n6 = AbstractC1066q6.f10298v3;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            Vj vj = this.f6347v;
            vj.getClass();
            Q1.K c2 = nVar.f1209g.c();
            c2.c.add(new Uj(vj, 0));
            vj.c.execute(new Uj(vj, 1));
        }
        this.f6348w.c();
        if (((Boolean) rVar.c.a(AbstractC1066q6.e8)).booleanValue()) {
            final int i4 = 0;
            AbstractC0266Ec.f4897a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Le

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ BinderC0314Ne f6147p;

                {
                    this.f6147p = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    AbstractC1106r4 abstractC1106r4;
                    switch (i4) {
                        case 0:
                            BinderC0314Ne binderC0314Ne = this.f6147p;
                            binderC0314Ne.getClass();
                            N1.n nVar2 = N1.n.f1204A;
                            if (nVar2.f1209g.c().p()) {
                                Q1.K c4 = nVar2.f1209g.c();
                                c4.r();
                                synchronized (c4.f1642a) {
                                    str = c4.f1638B;
                                }
                                if (nVar2.f1215m.i(binderC0314Ne.f6340o, str, binderC0314Ne.f6341p.f4084o)) {
                                    return;
                                }
                                nVar2.f1209g.c().b(false);
                                nVar2.f1209g.c().a("");
                                return;
                            }
                            return;
                        case 1:
                            Wj.e(this.f6147p.f6340o, true);
                            return;
                        default:
                            BinderC0314Ne binderC0314Ne2 = this.f6147p;
                            binderC0314Ne2.getClass();
                            AbstractBinderC1149s4 abstractBinderC1149s4 = new AbstractBinderC1149s4("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C0894m6 c0894m6 = binderC0314Ne2.f6349x;
                            c0894m6.getClass();
                            try {
                                try {
                                    IBinder b4 = AbstractC1230u.J(c0894m6.f9566p).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (b4 == null) {
                                        abstractC1106r4 = null;
                                    } else {
                                        IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        abstractC1106r4 = queryLocalInterface instanceof C0553e7 ? (C0553e7) queryLocalInterface : new AbstractC1106r4(b4, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                    }
                                    Parcel Q3 = abstractC1106r4.Q();
                                    AbstractC1192t4.e(Q3, abstractBinderC1149s4);
                                    abstractC1106r4.G1(Q3, 1);
                                    return;
                                } catch (Exception e4) {
                                    throw new Exception(e4);
                                }
                            } catch (RemoteException e5) {
                                Y9.s("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e5.getMessage())));
                                return;
                            } catch (C1464zc e6) {
                                Y9.s("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e6.getMessage())));
                                return;
                            }
                    }
                }
            });
        }
        if (((Boolean) rVar.c.a(AbstractC1066q6.k9)).booleanValue()) {
            final int i5 = 2;
            AbstractC0266Ec.f4897a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Le

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ BinderC0314Ne f6147p;

                {
                    this.f6147p = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    AbstractC1106r4 abstractC1106r4;
                    switch (i5) {
                        case 0:
                            BinderC0314Ne binderC0314Ne = this.f6147p;
                            binderC0314Ne.getClass();
                            N1.n nVar2 = N1.n.f1204A;
                            if (nVar2.f1209g.c().p()) {
                                Q1.K c4 = nVar2.f1209g.c();
                                c4.r();
                                synchronized (c4.f1642a) {
                                    str = c4.f1638B;
                                }
                                if (nVar2.f1215m.i(binderC0314Ne.f6340o, str, binderC0314Ne.f6341p.f4084o)) {
                                    return;
                                }
                                nVar2.f1209g.c().b(false);
                                nVar2.f1209g.c().a("");
                                return;
                            }
                            return;
                        case 1:
                            Wj.e(this.f6147p.f6340o, true);
                            return;
                        default:
                            BinderC0314Ne binderC0314Ne2 = this.f6147p;
                            binderC0314Ne2.getClass();
                            AbstractBinderC1149s4 abstractBinderC1149s4 = new AbstractBinderC1149s4("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C0894m6 c0894m6 = binderC0314Ne2.f6349x;
                            c0894m6.getClass();
                            try {
                                try {
                                    IBinder b4 = AbstractC1230u.J(c0894m6.f9566p).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (b4 == null) {
                                        abstractC1106r4 = null;
                                    } else {
                                        IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        abstractC1106r4 = queryLocalInterface instanceof C0553e7 ? (C0553e7) queryLocalInterface : new AbstractC1106r4(b4, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                    }
                                    Parcel Q3 = abstractC1106r4.Q();
                                    AbstractC1192t4.e(Q3, abstractBinderC1149s4);
                                    abstractC1106r4.G1(Q3, 1);
                                    return;
                                } catch (Exception e4) {
                                    throw new Exception(e4);
                                }
                            } catch (RemoteException e5) {
                                Y9.s("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e5.getMessage())));
                                return;
                            } catch (C1464zc e6) {
                                Y9.s("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e6.getMessage())));
                                return;
                            }
                    }
                }
            });
        }
        if (((Boolean) rVar.c.a(AbstractC1066q6.f10274q2)).booleanValue()) {
            final int i6 = 1;
            AbstractC0266Ec.f4897a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Le

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ BinderC0314Ne f6147p;

                {
                    this.f6147p = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    AbstractC1106r4 abstractC1106r4;
                    switch (i6) {
                        case 0:
                            BinderC0314Ne binderC0314Ne = this.f6147p;
                            binderC0314Ne.getClass();
                            N1.n nVar2 = N1.n.f1204A;
                            if (nVar2.f1209g.c().p()) {
                                Q1.K c4 = nVar2.f1209g.c();
                                c4.r();
                                synchronized (c4.f1642a) {
                                    str = c4.f1638B;
                                }
                                if (nVar2.f1215m.i(binderC0314Ne.f6340o, str, binderC0314Ne.f6341p.f4084o)) {
                                    return;
                                }
                                nVar2.f1209g.c().b(false);
                                nVar2.f1209g.c().a("");
                                return;
                            }
                            return;
                        case 1:
                            Wj.e(this.f6147p.f6340o, true);
                            return;
                        default:
                            BinderC0314Ne binderC0314Ne2 = this.f6147p;
                            binderC0314Ne2.getClass();
                            AbstractBinderC1149s4 abstractBinderC1149s4 = new AbstractBinderC1149s4("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C0894m6 c0894m6 = binderC0314Ne2.f6349x;
                            c0894m6.getClass();
                            try {
                                try {
                                    IBinder b4 = AbstractC1230u.J(c0894m6.f9566p).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (b4 == null) {
                                        abstractC1106r4 = null;
                                    } else {
                                        IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        abstractC1106r4 = queryLocalInterface instanceof C0553e7 ? (C0553e7) queryLocalInterface : new AbstractC1106r4(b4, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                    }
                                    Parcel Q3 = abstractC1106r4.Q();
                                    AbstractC1192t4.e(Q3, abstractBinderC1149s4);
                                    abstractC1106r4.G1(Q3, 1);
                                    return;
                                } catch (Exception e4) {
                                    throw new Exception(e4);
                                }
                            } catch (RemoteException e5) {
                                Y9.s("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e5.getMessage())));
                                return;
                            } catch (C1464zc e6) {
                                Y9.s("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e6.getMessage())));
                                return;
                            }
                    }
                }
            });
        }
    }

    @Override // O1.InterfaceC0052a0
    public final void p0(InterfaceC1069q9 interfaceC1069q9) {
        this.f6350z.C(interfaceC1069q9);
    }

    @Override // O1.InterfaceC0052a0
    public final synchronized void s0(float f4) {
        N1.n.f1204A.f1210h.c(f4);
    }

    @Override // O1.InterfaceC0052a0
    public final synchronized boolean t() {
        return N1.n.f1204A.f1210h.d();
    }
}
