package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1423ye {

    /* renamed from: j0, reason: collision with root package name */
    public static C1423ye f11367j0;

    /* renamed from: A, reason: collision with root package name */
    public final C1414yB f11368A;

    /* renamed from: B, reason: collision with root package name */
    public final C1414yB f11369B;

    /* renamed from: C, reason: collision with root package name */
    public final C1414yB f11370C;

    /* renamed from: D, reason: collision with root package name */
    public final C1414yB f11371D;

    /* renamed from: E, reason: collision with root package name */
    public final C1414yB f11372E;

    /* renamed from: F, reason: collision with root package name */
    public final C1414yB f11373F;

    /* renamed from: G, reason: collision with root package name */
    public final C1414yB f11374G;

    /* renamed from: H, reason: collision with root package name */
    public final C1414yB f11375H;

    /* renamed from: I, reason: collision with root package name */
    public final C1414yB f11376I;

    /* renamed from: J, reason: collision with root package name */
    public final C1414yB f11377J;

    /* renamed from: K, reason: collision with root package name */
    public final C1165se f11378K;

    /* renamed from: L, reason: collision with root package name */
    public final C1414yB f11379L;

    /* renamed from: M, reason: collision with root package name */
    public final C0822ke f11380M;
    public final C1414yB N;

    /* renamed from: O, reason: collision with root package name */
    public final C1414yB f11381O;

    /* renamed from: P, reason: collision with root package name */
    public final C1414yB f11382P;

    /* renamed from: Q, reason: collision with root package name */
    public final C1414yB f11383Q;

    /* renamed from: R, reason: collision with root package name */
    public final C1414yB f11384R;

    /* renamed from: S, reason: collision with root package name */
    public final C1414yB f11385S;

    /* renamed from: T, reason: collision with root package name */
    public final C0324Pe f11386T;

    /* renamed from: U, reason: collision with root package name */
    public final C1414yB f11387U;

    /* renamed from: V, reason: collision with root package name */
    public final C1414yB f11388V;

    /* renamed from: W, reason: collision with root package name */
    public final C1080qe f11389W;

    /* renamed from: X, reason: collision with root package name */
    public final C1208te f11390X;

    /* renamed from: Y, reason: collision with root package name */
    public final C1414yB f11391Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C1380xe f11392Z;

    /* renamed from: a, reason: collision with root package name */
    public final C0779je f11393a;

    /* renamed from: a0, reason: collision with root package name */
    public final C1380xe f11394a0;

    /* renamed from: b, reason: collision with root package name */
    public final C1423ye f11395b = this;

    /* renamed from: b0, reason: collision with root package name */
    public final C4 f11396b0;
    public final C0865le c;

    /* renamed from: c0, reason: collision with root package name */
    public final C1414yB f11397c0;
    public final C1122re d;

    /* renamed from: d0, reason: collision with root package name */
    public final C0269Ef f11398d0;

    /* renamed from: e, reason: collision with root package name */
    public final C1414yB f11399e;

    /* renamed from: e0, reason: collision with root package name */
    public final C1414yB f11400e0;

    /* renamed from: f, reason: collision with root package name */
    public final C1414yB f11401f;

    /* renamed from: f0, reason: collision with root package name */
    public final C1414yB f11402f0;

    /* renamed from: g, reason: collision with root package name */
    public final C1414yB f11403g;

    /* renamed from: g0, reason: collision with root package name */
    public final C1414yB f11404g0;

    /* renamed from: h, reason: collision with root package name */
    public final C1414yB f11405h;

    /* renamed from: h0, reason: collision with root package name */
    public final C1414yB f11406h0;

    /* renamed from: i, reason: collision with root package name */
    public final C1414yB f11407i;

    /* renamed from: i0, reason: collision with root package name */
    public final C1414yB f11408i0;

    /* renamed from: j, reason: collision with root package name */
    public final C1414yB f11409j;

    /* renamed from: k, reason: collision with root package name */
    public final C1414yB f11410k;

    /* renamed from: l, reason: collision with root package name */
    public final C1414yB f11411l;

    /* renamed from: m, reason: collision with root package name */
    public final C1414yB f11412m;

    /* renamed from: n, reason: collision with root package name */
    public final C1414yB f11413n;

    /* renamed from: o, reason: collision with root package name */
    public final C1414yB f11414o;

    /* renamed from: p, reason: collision with root package name */
    public final C1414yB f11415p;

    /* renamed from: q, reason: collision with root package name */
    public final C1414yB f11416q;

    /* renamed from: r, reason: collision with root package name */
    public final C1414yB f11417r;

    /* renamed from: s, reason: collision with root package name */
    public final C1414yB f11418s;

    /* renamed from: t, reason: collision with root package name */
    public final C1414yB f11419t;

    /* renamed from: u, reason: collision with root package name */
    public final C1414yB f11420u;

    /* renamed from: v, reason: collision with root package name */
    public final C0994oe f11421v;

    /* renamed from: w, reason: collision with root package name */
    public final C1414yB f11422w;

    /* renamed from: x, reason: collision with root package name */
    public final C1414yB f11423x;
    public final AB y;

    /* renamed from: z, reason: collision with root package name */
    public final C1414yB f11424z;

    public C1423ye(C0779je c0779je) {
        this.f11393a = c0779je;
        int i4 = 3;
        int i5 = 5;
        FB a4 = EB.a(new C1037pe(C1414yB.b(new C0908me(c0779je, i4)), i5));
        C1414yB b4 = C1414yB.b(new Eo(a4, i5));
        C0865le c0865le = new C0865le(c0779je);
        this.c = c0865le;
        C1122re c1122re = new C1122re(c0779je);
        this.d = c1122re;
        int i6 = 1;
        Pk pk = new Pk(c0865le, c1122re, i6);
        C1414yB b5 = C1414yB.b(new C0371Zb(b4, pk, 27));
        Lf lf = new Lf(19, pk);
        C1414yB b6 = C1414yB.b(new Zh(C1414yB.b(Wj.f7527D), 25));
        this.f11399e = b6;
        C1414yB b7 = C1414yB.b(new C1338wf((FB) b5, (FB) lf, b6, 16));
        this.f11401f = b7;
        C1414yB b8 = C1414yB.b(Wj.f7524A);
        this.f11403g = b8;
        this.f11405h = C1414yB.b(Wj.f7525B);
        C1414yB b9 = C1414yB.b(new Hp(i4));
        this.f11407i = b9;
        C0329Qe c0329Qe = new C0329Qe(c0865le, i6);
        C1414yB b10 = C1414yB.b(Y9.f7767S);
        this.f11409j = b10;
        C1414yB b11 = C1414yB.b(new C0371Zb(c0329Qe, b10, 12));
        this.f11410k = b11;
        C1414yB b12 = C1414yB.b(new C1037pe(b11, i4));
        this.f11411l = b12;
        C1414yB b13 = C1414yB.b(new Hi(21));
        this.f11412m = b13;
        C0908me c0908me = new C0908me(c0779je, 0);
        C1414yB b14 = C1414yB.b(new C4(3));
        this.f11413n = b14;
        C1414yB b15 = C1414yB.b(new C1338wf(a4, pk, c0865le, 11));
        this.f11414o = b15;
        C1414yB b16 = C1414yB.b(new C1295vf(b14, b15, 10));
        C1414yB b17 = C1414yB.b(new C1037pe(C1414yB.b(new C1295vf(b14, b7, 12)), 0));
        C1414yB b18 = C1414yB.b(Wj.f7540i);
        this.f11415p = b18;
        C1414yB b19 = C1414yB.b(new C1037pe(b18, 1));
        int i7 = DB.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(b17);
        arrayList.add(b19);
        Hg hg = new Hg(new DB(list, arrayList), 16);
        C1414yB b20 = C1414yB.b(new C1092qq(c0865le, c1122re, b10, 1));
        this.f11416q = b20;
        C1414yB b21 = C1414yB.b(new C1124rg(b8, c0865le, c0908me, b11, b6, b16, c1122re, hg, b20));
        this.f11417r = b21;
        C1414yB b22 = C1414yB.b(new C4(9));
        this.f11418s = b22;
        C1414yB b23 = C1414yB.b(new Hi(8));
        this.f11419t = b23;
        C1414yB b24 = C1414yB.b(new Pk(c0865le, c1122re, 0));
        C1414yB b25 = C1414yB.b(new C0329Qe(c0865le, 3));
        C1414yB b26 = C1414yB.b(new C0329Qe(c0865le, 2));
        C1414yB b27 = C1414yB.b(new C1295vf(b21, b10, 11));
        C1414yB b28 = C1414yB.b(new C1338wf(c0865le, c0908me, b24));
        this.f11420u = b28;
        C0994oe c0994oe = new C0994oe(c0865le);
        this.f11421v = c0994oe;
        C1414yB b29 = C1414yB.b(new W1.c(b24, b25, b26, c0865le, c1122re, b27, b28, c0994oe));
        this.f11422w = b29;
        this.f11423x = C1414yB.b(new C0319Oe(c0865le, c1122re, b11, b12, b13, b21, b22, b23, b29, new C0908me(c0779je, 1), b20, c0329Qe, C1414yB.b(Y9.f7790z)));
        AB a5 = AB.a(this);
        this.y = a5;
        int i8 = 2;
        C1414yB b30 = C1414yB.b(new C0908me(c0779je, i8));
        this.f11424z = b30;
        int i9 = 4;
        C1414yB b31 = C1414yB.b(new C0329Qe(c0865le, i9));
        this.f11368A = b31;
        C1414yB b32 = C1414yB.b(new C1338wf((InterfaceC1457zB) c0865le, a4, (FB) b20, 17));
        this.f11369B = b32;
        C1414yB b33 = C1414yB.b(new Zh(b15, 18));
        this.f11370C = b33;
        C1414yB b34 = C1414yB.b(new C1252uf(c0865le, b31, a4, b33, b7));
        this.f11371D = b34;
        C1414yB b35 = C1414yB.b(new C1037pe(C1414yB.b(new C1124rg(c0865le, b8, b30, c1122re, b31, b32, b33, b7, b34)), i9));
        this.f11372E = b35;
        this.f11373F = C1414yB.b(new W1.c(a5, c0865le, b30, b35, b6, b15, b32, c1122re, 0));
        this.f11374G = C1414yB.b(new Q1.D(b15, i8));
        this.f11375H = C1414yB.b(Wj.f7551t);
        this.f11376I = C1414yB.b(new Q1.D(c0865le, 0));
        C1414yB b36 = C1414yB.b(new C4(i8));
        this.f11377J = b36;
        this.f11378K = new C1165se(b36);
        this.f11379L = C1414yB.b(new Zh(b9, 19));
        this.f11380M = new C0822ke(b36);
        this.N = C1414yB.b(Wj.f7526C);
        this.f11381O = C1414yB.b(Y9.f7757H);
        this.f11382P = C1414yB.b(new C0371Zb(new C0329Qe(c0865le, 6), b9, 24));
        this.f11383Q = C1414yB.b(Wj.f7547p);
        int i10 = 23;
        this.f11384R = C1414yB.b(new C0371Zb(new C0329Qe(c0865le, 5), b9, i10));
        this.f11385S = C1414yB.b(new Zh(b9, i10));
        this.f11386T = new C0324Pe(c0865le);
        this.f11387U = C1414yB.b(Wj.f7552u);
        this.f11388V = C1414yB.b(new C1037pe(b11, i8));
        this.f11389W = new C1080qe(a5);
        this.f11390X = new C1208te(c0865le, b20);
        this.f11391Y = C1414yB.b(Y9.f7751B);
        int i11 = 0;
        this.f11392Z = new C1380xe(this, i11);
        this.f11394a0 = new C1380xe(this, 1);
        int i12 = 7;
        this.f11396b0 = new C4(i12);
        this.f11397c0 = C1414yB.b(new C1092qq(c0865le, c1122re, b20, i11));
        this.f11398d0 = new C0269Ef(b6, b9);
        this.f11400e0 = C1414yB.b(Wj.y);
        this.f11402f0 = C1414yB.b(Wj.f7556z);
        this.f11404g0 = C1414yB.b(new C0329Qe(c0865le, 0));
        this.f11406h0 = C1414yB.b(Y9.y);
        this.f11408i0 = C1414yB.b(new C0329Qe(c0865le, i12));
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, com.google.android.gms.internal.ads.je] */
    /* JADX WARN: Type inference failed for: r10v30, types: [com.google.android.gms.internal.ads.a5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, com.google.android.gms.internal.ads.je] */
    public static C1423ye c(Context context, InterfaceC1069q9 interfaceC1069q9, int i4) {
        synchronized (C1423ye.class) {
            try {
                C1423ye c1423ye = f11367j0;
                if (c1423ye != null) {
                    return c1423ye;
                }
                AbstractC1066q6.a(context);
                Op u2 = Op.u(context);
                N1.n nVar = N1.n.f1204A;
                Q1.N n4 = nVar.c;
                boolean c = Q1.N.c((Context) u2.f6525p);
                C0248Bc c0248Bc = new C0248Bc(i4, c);
                if (((Boolean) P6.c.r()).booleanValue()) {
                    O1.X x4 = (O1.X) u2.f6526q;
                    O1.G0 g02 = null;
                    if (x4 != null) {
                        try {
                            g02 = x4.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (g02 != null) {
                        c0248Bc = new C0248Bc(g02.f1276p, c);
                    }
                }
                u2.C(interfaceC1069q9);
                ?? obj = new Object();
                obj.f9163a = c0248Bc;
                obj.c = new WeakReference(context);
                obj.f9164b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                ?? obj2 = new Object();
                obj2.f9163a = obj.f9163a;
                obj2.f9164b = obj.f9164b;
                obj2.c = obj.c;
                C1423ye c1423ye2 = new C1423ye(obj2);
                nVar.f1209g.f(context, c0248Bc);
                nVar.f1211i.x(context);
                nVar.c.y(context);
                nVar.c.x(context);
                AbstractC1806a.U(context);
                nVar.f1208f.m(context);
                nVar.f1226x.b(context);
                ((Q1.C) c1423ye2.f11376I.c()).a();
                C0326Qb.N(context);
                C0937n6 c0937n6 = AbstractC1066q6.r5;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    if (!((Boolean) rVar.c.a(AbstractC1066q6.f10258n0)).booleanValue()) {
                        C0764j5 c0764j5 = new C0764j5(new A2.o(context, 5));
                        C0258Da c0258Da = new C0258Da(25, new Nl(context), (Su) c1423ye2.f11405h.c());
                        String uuid = UUID.randomUUID().toString();
                        InterfaceC1263uq interfaceC1263uq = (InterfaceC1263uq) c1423ye2.f11401f.c();
                        ?? obj3 = new Object();
                        obj3.f8076o = context;
                        obj3.f8078q = c0248Bc;
                        obj3.f8077p = c0764j5;
                        obj3.f8079r = uuid;
                        obj3.f8080s = interfaceC1263uq;
                        obj3.f8081t = N1.n.f1204A.f1209g.c();
                        try {
                            c0258Da.h(new B0.q((Object) obj3, nVar.f1209g.c().q()));
                        } catch (Exception e4) {
                            Y9.p("Error in offline signals database startup: ".concat(String.valueOf(e4.getMessage())));
                        }
                    }
                }
                f11367j0 = c1423ye2;
                return c1423ye2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Executor a() {
        return (Executor) this.f11403g.c();
    }

    public final Fq d() {
        return (Fq) this.f11416q.c();
    }
}
