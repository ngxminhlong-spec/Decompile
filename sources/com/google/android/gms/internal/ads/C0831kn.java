package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.work.impl.WorkDatabase_Impl;
import c0.C0229j;
import c1.C0237f;
import c1.InterfaceC0235d;
import com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import com.google.android.gms.internal.measurement.AbstractC1515f1;
import com.google.android.gms.internal.measurement.C1554o;
import com.google.android.gms.internal.measurement.C1569s;
import com.google.android.gms.internal.measurement.EnumC1581v;
import com.google.android.gms.internal.measurement.InterfaceC1550n;
import com.google.android.gms.internal.measurement.InterfaceC1577u;
import e1.EnumC1662c;
import h1.AbstractC1698a;
import j.AbstractC1719a;
import j.C1723e;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k.MenuC1742C;
import p1.C1921g;
import p1.C1932s;
import s1.InterfaceC1974d;
import t2.C1995b;
import t2.C2005l;
import t2.C2006m;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0831kn implements InterfaceC0791jq, Mu, InterfaceC1390xo, InterfaceC1577u, InterfaceC1974d, InterfaceC0235d, t2.F {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9318o;

    /* renamed from: p, reason: collision with root package name */
    public Object f9319p;

    /* renamed from: q, reason: collision with root package name */
    public Object f9320q;

    public C0831kn(int i4) {
        this.f9318o = i4;
        switch (i4) {
            case 9:
                this.f9319p = new HashMap();
                this.f9320q = new C1569s(6);
                C1569s c1569s = new C1569s(0);
                EnumC1581v enumC1581v = EnumC1581v.f12083t;
                ArrayList arrayList = c1569s.f12012a;
                arrayList.add(enumC1581v);
                arrayList.add(EnumC1581v.f12085u);
                arrayList.add(EnumC1581v.f12087v);
                arrayList.add(EnumC1581v.f12089w);
                arrayList.add(EnumC1581v.f12091x);
                arrayList.add(EnumC1581v.y);
                arrayList.add(EnumC1581v.f12094z);
                A(c1569s);
                C1569s c1569s2 = new C1569s(1);
                EnumC1581v enumC1581v2 = EnumC1581v.f12045K;
                ArrayList arrayList2 = c1569s2.f12012a;
                arrayList2.add(enumC1581v2);
                arrayList2.add(EnumC1581v.f12057X);
                arrayList2.add(EnumC1581v.f12058Y);
                arrayList2.add(EnumC1581v.f12059Z);
                arrayList2.add(EnumC1581v.f12060a0);
                arrayList2.add(EnumC1581v.f12062c0);
                arrayList2.add(EnumC1581v.f12063d0);
                arrayList2.add(EnumC1581v.f12068i0);
                A(c1569s2);
                C1569s c1569s3 = new C1569s(2);
                EnumC1581v enumC1581v3 = EnumC1581v.f12079r;
                ArrayList arrayList3 = c1569s3.f12012a;
                arrayList3.add(enumC1581v3);
                arrayList3.add(EnumC1581v.f12034A);
                arrayList3.add(EnumC1581v.f12036B);
                arrayList3.add(EnumC1581v.f12037C);
                arrayList3.add(EnumC1581v.f12042H);
                arrayList3.add(EnumC1581v.f12039E);
                arrayList3.add(EnumC1581v.f12043I);
                arrayList3.add(EnumC1581v.f12047M);
                arrayList3.add(EnumC1581v.f12061b0);
                arrayList3.add(EnumC1581v.f12073n0);
                arrayList3.add(EnumC1581v.f12078q0);
                arrayList3.add(EnumC1581v.f12084t0);
                arrayList3.add(EnumC1581v.f12086u0);
                A(c1569s3);
                C1569s c1569s4 = new C1569s(3);
                EnumC1581v enumC1581v4 = EnumC1581v.f12077q;
                ArrayList arrayList4 = c1569s4.f12012a;
                arrayList4.add(enumC1581v4);
                arrayList4.add(EnumC1581v.f12067h0);
                arrayList4.add(EnumC1581v.f12070k0);
                A(c1569s4);
                C1569s c1569s5 = new C1569s(4);
                EnumC1581v enumC1581v5 = EnumC1581v.N;
                ArrayList arrayList5 = c1569s5.f12012a;
                arrayList5.add(enumC1581v5);
                arrayList5.add(EnumC1581v.f12048O);
                arrayList5.add(EnumC1581v.f12049P);
                arrayList5.add(EnumC1581v.f12050Q);
                arrayList5.add(EnumC1581v.f12051R);
                arrayList5.add(EnumC1581v.f12052S);
                arrayList5.add(EnumC1581v.f12053T);
                arrayList5.add(EnumC1581v.f12093y0);
                A(c1569s5);
                C1569s c1569s6 = new C1569s(5);
                EnumC1581v enumC1581v6 = EnumC1581v.f12075p;
                ArrayList arrayList6 = c1569s6.f12012a;
                arrayList6.add(enumC1581v6);
                arrayList6.add(EnumC1581v.f12044J);
                arrayList6.add(EnumC1581v.f12064e0);
                arrayList6.add(EnumC1581v.f12065f0);
                arrayList6.add(EnumC1581v.f12066g0);
                arrayList6.add(EnumC1581v.f12071l0);
                arrayList6.add(EnumC1581v.f12072m0);
                arrayList6.add(EnumC1581v.f12074o0);
                arrayList6.add(EnumC1581v.f12076p0);
                arrayList6.add(EnumC1581v.f12082s0);
                A(c1569s6);
                C1569s c1569s7 = new C1569s(7);
                EnumC1581v enumC1581v7 = EnumC1581v.f12081s;
                ArrayList arrayList7 = c1569s7.f12012a;
                arrayList7.add(enumC1581v7);
                arrayList7.add(EnumC1581v.f12038D);
                arrayList7.add(EnumC1581v.f12040F);
                arrayList7.add(EnumC1581v.f12041G);
                arrayList7.add(EnumC1581v.f12046L);
                arrayList7.add(EnumC1581v.f12054U);
                arrayList7.add(EnumC1581v.f12055V);
                arrayList7.add(EnumC1581v.f12056W);
                arrayList7.add(EnumC1581v.f12069j0);
                arrayList7.add(EnumC1581v.f12080r0);
                arrayList7.add(EnumC1581v.f12088v0);
                arrayList7.add(EnumC1581v.f12090w0);
                arrayList7.add(EnumC1581v.f12092x0);
                A(c1569s7);
                return;
            case 13:
                e2.e eVar = e2.e.d;
                this.f9319p = new SparseIntArray();
                this.f9320q = eVar;
                return;
            default:
                this.f9319p = new HashMap();
                return;
        }
    }

    public /* synthetic */ C0831kn(int i4, Object obj) {
        this.f9318o = i4;
        this.f9320q = obj;
    }

    public /* synthetic */ C0831kn(int i4, Object obj, Object obj2) {
        this.f9318o = i4;
        this.f9319p = obj;
        this.f9320q = obj2;
    }

    public /* synthetic */ C0831kn(int i4, boolean z4) {
        this.f9318o = i4;
    }

    public C0831kn(WorkDatabase_Impl workDatabase_Impl) {
        this.f9318o = 20;
        this.f9319p = workDatabase_Impl;
        this.f9320q = new w0.b(workDatabase_Impl, 1);
    }

    public /* synthetic */ C0831kn(Object obj, Object obj2, int i4, boolean z4) {
        this.f9318o = i4;
        this.f9320q = obj;
        this.f9319p = obj2;
    }

    private final void B(Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.C0831kn l(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            com.google.android.gms.internal.ads.kn r2 = new com.google.android.gms.internal.ads.kn     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 23
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0831kn.l(android.content.Context):com.google.android.gms.internal.ads.kn");
    }

    public void A(C1569s c1569s) {
        ArrayList arrayList = c1569s.f12012a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((HashMap) this.f9319p).put(Integer.valueOf(((EnumC1581v) obj).f12096o).toString(), c1569s);
        }
    }

    public void C(C1074qE c1074qE) {
        Iterator it = ((CopyOnWriteArrayList) this.f9320q).iterator();
        while (it.hasNext()) {
            C1331wE c1331wE = (C1331wE) it.next();
            AbstractC0751is.f(c1331wE.f11170a, new RunnableC0801k(this, c1331wE.f11171b, c1074qE, 11));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.android.gms.internal.ads.xE] */
    public void D(C0859lE c0859lE, C1074qE c1074qE) {
        Iterator it = ((CopyOnWriteArrayList) this.f9320q).iterator();
        while (it.hasNext()) {
            C1331wE c1331wE = (C1331wE) it.next();
            AbstractC0751is.f(c1331wE.f11170a, new RunnableC1288vE(this, c1331wE.f11171b, c0859lE, c1074qE, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.android.gms.internal.ads.xE] */
    public void E(C0859lE c0859lE, C1074qE c1074qE) {
        Iterator it = ((CopyOnWriteArrayList) this.f9320q).iterator();
        while (it.hasNext()) {
            C1331wE c1331wE = (C1331wE) it.next();
            AbstractC0751is.f(c1331wE.f11170a, new RunnableC1288vE(this, c1331wE.f11171b, c0859lE, c1074qE, 1));
        }
    }

    public void F(C0859lE c0859lE, C1074qE c1074qE, IOException iOException, boolean z4) {
        Iterator it = ((CopyOnWriteArrayList) this.f9320q).iterator();
        while (it.hasNext()) {
            C1331wE c1331wE = (C1331wE) it.next();
            AbstractC0751is.f(c1331wE.f11170a, new AC(this, c1331wE.f11171b, c0859lE, c1074qE, iOException, z4, 1));
        }
    }

    public void G(VB vb) {
        synchronized (vb) {
        }
        Handler handler = (Handler) this.f9319p;
        if (handler != null) {
            handler.post(new Jn(13, this, vb));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.android.gms.internal.ads.xE] */
    public void H(C0859lE c0859lE, C1074qE c1074qE) {
        Iterator it = ((CopyOnWriteArrayList) this.f9320q).iterator();
        while (it.hasNext()) {
            C1331wE c1331wE = (C1331wE) it.next();
            AbstractC0751is.f(c1331wE.f11170a, new RunnableC1288vE(this, c1331wE.f11171b, c0859lE, c1074qE, 0));
        }
    }

    @Override // s1.InterfaceC1974d
    public /* synthetic */ void a() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0791jq
    public void b() {
        Bm bm = (Bm) this.f9319p;
        BinderC1366x6 binderC1366x6 = (BinderC1366x6) this.f9320q;
        C1409y6 c1409y6 = (C1409y6) bm.f4172b;
        Parcel Q3 = c1409y6.Q();
        AbstractC1192t4.e(Q3, binderC1366x6);
        c1409y6.G1(Q3, 1);
    }

    @Override // t2.H
    public Object c() {
        C2006m c2006m = (C2006m) ((t2.E) this.f9319p).c();
        Handler handler = t2.s.f14935a;
        t2.r.c(handler);
        return new C2005l(c2006m, handler, ((N1.l) this.f9320q).h());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1390xo
    public void d(Object obj, Q0 q02) {
        PC pc = (PC) obj;
        pc.a((AA) this.f9320q, new Wl(q02, ((VC) this.f9319p).f7252s));
    }

    @Override // s1.InterfaceC1974d
    public void e() {
    }

    @Override // s1.InterfaceC1974d
    public void f() {
    }

    @Override // s1.InterfaceC1974d
    public void g() {
    }

    @Override // s1.InterfaceC1974d
    public void h() {
        ViewGroup k3;
        CircuitExploreDialog circuitExploreDialog = (CircuitExploreDialog) this.f9320q;
        AbstractC1698a selectedElement = ((BoardView) this.f9319p).getSelectedElement();
        if (selectedElement instanceof e1.d) {
            circuitExploreDialog.f3588r.setVisibility(0);
        } else {
            circuitExploreDialog.f3588r.setVisibility(4);
        }
        if (circuitExploreDialog.f3593w.getChildCount() > 0) {
            circuitExploreDialog.f3593w.removeAllViews();
        }
        if (((selectedElement instanceof C1921g) || (selectedElement instanceof p1.b0)) && (k3 = circuitExploreDialog.f3592v.k(circuitExploreDialog.getContext(), selectedElement)) != null) {
            circuitExploreDialog.f3593w.addView(k3);
            circuitExploreDialog.f3593w.setOnTouchListener(new Y2.k(1, this, selectedElement));
        }
    }

    @Override // s1.InterfaceC1974d
    public void i(EnumC1662c enumC1662c, EnumC1662c enumC1662c2) {
    }

    @Override // s1.InterfaceC1974d
    public void j(j1.b bVar) {
    }

    @Override // c1.InterfaceC0235d
    public void k(boolean z4) {
        switch (this.f9318o) {
            case 16:
                C1932s c1932s = (C1932s) this.f9320q;
                if (c1932s.f14584Q == z4) {
                    return;
                }
                c1932s.f14584Q = z4;
                ((C1995b) this.f9319p).h(c1932s.f13120D, z4);
                return;
            default:
                p1.Z z5 = (p1.Z) this.f9320q;
                z5.f14491Q[z5.f14490P.indexOf((C0237f) this.f9319p)] = z4;
                return;
        }
    }

    @Override // s1.InterfaceC1974d
    public void m() {
    }

    @Override // s1.InterfaceC1974d
    public /* synthetic */ void n() {
    }

    @Override // s1.InterfaceC1974d
    public void o() {
    }

    public Long p(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9319p;
        C0229j d = C0229j.d("SELECT long_value FROM Preference where `key`=?", 1);
        d.g(str, 1);
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            Long l4 = null;
            if (g4.moveToFirst() && !g4.isNull(0)) {
                l4 = Long.valueOf(g4.getLong(0));
            }
            return l4;
        } finally {
            g4.close();
            d.h();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1577u
    public u0.g q(InterfaceC1550n interfaceC1550n) {
        u0.g gVar = (u0.g) this.f9319p;
        gVar.H((String) this.f9320q, interfaceC1550n);
        return gVar;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        switch (this.f9318o) {
            case 1:
                synchronized (((C0817kF) this.f9320q)) {
                    try {
                        C0817kF c0817kF = (C0817kF) this.f9320q;
                        c0817kF.f9288s = null;
                        ((ArrayDeque) c0817kF.f9287r).addFirst((C0450bp) this.f9319p);
                        C0817kF c0817kF2 = (C0817kF) this.f9320q;
                        if (c0817kF2.f9284o == 1) {
                            c0817kF2.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    public void s(w0.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9319p;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((w0.b) this.f9320q).e(cVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void t(AbstractC1719a abstractC1719a) {
        C0326Qb c0326Qb = (C0326Qb) this.f9319p;
        ((ActionMode.Callback) c0326Qb.f6659o).onDestroyActionMode(c0326Qb.o(abstractC1719a));
        f.q qVar = (f.q) this.f9320q;
        if (qVar.f12875E != null) {
            qVar.f12910t.getDecorView().removeCallbacks(qVar.f12876F);
        }
        if (qVar.f12874D != null) {
            H.F f4 = qVar.f12877G;
            if (f4 != null) {
                f4.b();
            }
            H.F a4 = H.A.a(qVar.f12874D);
            a4.a(0.0f);
            qVar.f12877G = a4;
            a4.d(new f.l(2, this));
        }
        qVar.f12873C = null;
    }

    public boolean u(AbstractC1719a abstractC1719a, Menu menu) {
        C0326Qb c0326Qb = (C0326Qb) this.f9319p;
        ActionMode.Callback callback = (ActionMode.Callback) c0326Qb.f6659o;
        C1723e o4 = c0326Qb.o(abstractC1719a);
        r.i iVar = (r.i) c0326Qb.f6662r;
        Menu menu2 = (Menu) iVar.get(menu);
        if (menu2 == null) {
            menu2 = new MenuC1742C((Context) c0326Qb.f6660p, (k.m) menu);
            iVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(o4, menu2);
    }

    public void v() {
        try {
            ((FileLock) this.f9320q).release();
            ((FileChannel) this.f9319p).close();
        } catch (IOException e4) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e4);
        }
    }

    public void w(int i4, int i5, int i6, int i7) {
        CardView cardView = (CardView) this.f9320q;
        cardView.f2649r.set(i4, i5, i6, i7);
        Rect rect = cardView.f2648q;
        CardView.a(cardView, i4 + rect.left, i5 + rect.top, i6 + rect.right, i7 + rect.bottom);
    }

    public InterfaceC1550n x(u0.g gVar, InterfaceC1550n interfaceC1550n) {
        HashMap hashMap = (HashMap) this.f9319p;
        AbstractC1515f1.q(gVar);
        if (!(interfaceC1550n instanceof C1554o)) {
            return interfaceC1550n;
        }
        C1554o c1554o = (C1554o) interfaceC1550n;
        ArrayList arrayList = c1554o.f11991p;
        String str = c1554o.f11990o;
        return (hashMap.containsKey(str) ? (C1569s) hashMap.get(str) : (C1569s) this.f9320q).a(str, gVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        switch (this.f9318o) {
            case 1:
                synchronized (((C0817kF) this.f9320q)) {
                    ((C0817kF) this.f9320q).f9288s = null;
                }
                return;
            default:
                Aq aq = (Aq) this.f9320q;
                aq.d(th);
                aq.b(false);
                ((Eq) this.f9319p).a(aq);
                return;
        }
    }

    public synchronized Map z() {
        try {
            if (((Map) this.f9320q) == null) {
                this.f9320q = Collections.unmodifiableMap(new HashMap((HashMap) this.f9319p));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f9320q;
    }
}
