package com.google.android.gms.internal.ads;

import O1.C0057d;
import O1.C0077n;
import O1.C0081p;
import O1.C0097x0;
import O1.InterfaceC0089t0;
import Q1.C0120t;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import b0.RunnableC0203p;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.measurement.C1510e1;
import e2.C1664b;
import h2.InterfaceC1703b;
import h2.InterfaceC1704c;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import n2.BinderC1813b;
import o1.InterfaceC1830F;
import o1.InterfaceC1840P;
import o2.AbstractC1895f;
import p1.C1907E;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258Da implements InterfaceC1830F, InterfaceC1840P, y1.b, E2, b1.e, InterfaceC1704c, InterfaceC1703b, InterfaceC1399xx, Mu, InterfaceC0481ce, Cu, InterfaceC0876lp {

    /* renamed from: r, reason: collision with root package name */
    public static InterfaceC0650gc f4615r;

    /* renamed from: s, reason: collision with root package name */
    public static C0258Da f4616s;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4617o;

    /* renamed from: p, reason: collision with root package name */
    public Object f4618p;

    /* renamed from: q, reason: collision with root package name */
    public Object f4619q;

    public C0258Da(int i4) {
        this.f4617o = i4;
        switch (i4) {
            case 12:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f4618p = byteArrayOutputStream;
                this.f4619q = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f4618p = new Object();
                return;
        }
    }

    public /* synthetic */ C0258Da(int i4, Object obj, Object obj2) {
        this.f4617o = i4;
        this.f4618p = obj;
        this.f4619q = obj2;
    }

    public /* synthetic */ C0258Da(int i4, boolean z4) {
        this.f4617o = i4;
    }

    public C0258Da(Context context) {
        this.f4617o = 29;
        this.f4618p = context.getPackageName();
        this.f4619q = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public C0258Da(C0620fp c0620fp) {
        this.f4617o = 27;
        this.f4618p = c0620fp;
    }

    public /* synthetic */ C0258Da(Object obj, Object obj2, int i4, boolean z4) {
        this.f4617o = i4;
        this.f4619q = obj;
        this.f4618p = obj2;
    }

    private final void k(Throwable th) {
    }

    private final void l(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0481ce
    public void F(String str, int i4, String str2, boolean z4) {
        Ti ti = (Ti) this.f4618p;
        Map map = (Map) this.f4619q;
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        ti.f7064b.b(hashMap);
    }

    @Override // h2.InterfaceC1703b
    public void O(int i4) {
        ((C0272Fc) this.f4618p).c(new RuntimeException(U.a.i("onConnectionSuspended: ", i4)));
    }

    @Override // h2.InterfaceC1703b
    public void Q() {
        try {
            ((C0272Fc) this.f4618p).b((C1196t8) ((C0466c5) ((e2.i) this.f4619q).f12759p).t());
        } catch (DeadObjectException e4) {
            ((C0272Fc) this.f4618p).c(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0876lp
    public /* bridge */ /* synthetic */ InterfaceFutureC0239a a(Wl wl, InterfaceC0833kp interfaceC0833kp) {
        return m(wl, interfaceC0833kp, null);
    }

    @Override // h2.InterfaceC1704c
    public void a0(C1664b c1664b) {
        synchronized (((A2.o) this.f4619q).f36q) {
            ((C0594f5) this.f4618p).c(new RuntimeException("Connection failed."));
        }
    }

    @Override // com.google.android.gms.internal.ads.Cu
    /* renamed from: b */
    public InterfaceFutureC0239a mo0b() {
        Op op = (Op) this.f4618p;
        C0305Ma c0305Ma = (C0305Ma) this.f4619q;
        op.getClass();
        long longValue = ((Long) O1.r.d.c.a(AbstractC1066q6.L9)).longValue();
        C1258ul c1258ul = (C1258ul) op.f6527r;
        synchronized (c1258ul) {
            if (c1258ul.f10929p) {
                return Bs.o0(c1258ul.f10928o, longValue, TimeUnit.MILLISECONDS, c1258ul.f10934u);
            }
            c1258ul.f10929p = true;
            c1258ul.f10936w = c0305Ma;
            c1258ul.c();
            InterfaceFutureC0239a o02 = Bs.o0(c1258ul.f10928o, longValue, TimeUnit.MILLISECONDS, c1258ul.f10934u);
            o02.a(new RunnableC0744il(2, c1258ul), AbstractC0266Ec.f4900f);
            return o02;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399xx
    public Px b() {
        AtomicInteger atomicInteger = C0273Fd.f5018I;
        Px b4 = ((InterfaceC1399xx) this.f4618p).b();
        byte[] bArr = (byte[]) this.f4619q;
        return new C0261Dd(new Mw(bArr), bArr.length, b4);
    }

    @Override // o1.InterfaceC1830F
    public void c(boolean[][] zArr, boolean[][] zArr2) {
        switch (this.f4617o) {
            case 2:
                C0.D d = (C0.D) this.f4619q;
                String.valueOf(n0.a.e(5));
                p1.P p3 = (p1.P) this.f4618p;
                d.f202i0.d(new K0.a(AbstractC1895f.i(p3.f14439T), AbstractC1895f.i(p3.f14440U), AbstractC1895f.i(zArr), AbstractC1895f.i(zArr2), p3.f13117A));
                d.a0();
                d.p0();
                return;
            default:
                p1.P p4 = (p1.P) this.f4618p;
                K0.a aVar = new K0.a(AbstractC1895f.i(p4.f14439T), AbstractC1895f.i(p4.f14440U), AbstractC1895f.i(zArr), AbstractC1895f.i(zArr2), p4.f13117A);
                D0.g gVar = (D0.g) this.f4619q;
                gVar.f566h0.d(aVar);
                gVar.Z();
                return;
        }
    }

    public void d(int i4) {
        int[] iArr = (int[]) this.f4618p;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i4, 10) + 1];
            this.f4618p = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int length = iArr.length;
            while (length <= i4) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f4618p = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f4618p;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void e(int i4, int i5) {
        int[] iArr = (int[]) this.f4618p;
        if (iArr == null || i4 >= iArr.length) {
            return;
        }
        int i6 = i4 + i5;
        d(i6);
        int[] iArr2 = (int[]) this.f4618p;
        System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
        Arrays.fill((int[]) this.f4618p, i4, i6, -1);
        ArrayList arrayList = (ArrayList) this.f4619q;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0.j0 j0Var = (b0.j0) ((ArrayList) this.f4619q).get(size);
            int i7 = j0Var.f3327o;
            if (i7 >= i4) {
                j0Var.f3327o = i7 + i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.E2
    public void f(F2 f22) {
        Y9.s("Failed to load URL: " + ((String) this.f4618p) + "\n" + f22.toString());
        ((C0120t) this.f4619q).b(null);
    }

    public void g(int i4, int i5) {
        int[] iArr = (int[]) this.f4618p;
        if (iArr == null || i4 >= iArr.length) {
            return;
        }
        int i6 = i4 + i5;
        d(i6);
        int[] iArr2 = (int[]) this.f4618p;
        System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
        int[] iArr3 = (int[]) this.f4618p;
        Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f4619q;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0.j0 j0Var = (b0.j0) ((ArrayList) this.f4619q).get(size);
            int i7 = j0Var.f3327o;
            if (i7 >= i4) {
                if (i7 < i6) {
                    ((ArrayList) this.f4619q).remove(size);
                } else {
                    j0Var.f3327o = i7 - i5;
                }
            }
        }
    }

    @Override // I3.a
    public Object get() {
        V2.e eVar = new V2.e(6);
        C2033d c2033d = new C2033d(5);
        Object obj = ((I3.a) this.f4618p).get();
        I3.a aVar = (I3.a) this.f4619q;
        return new D1.h(eVar, c2033d, D1.a.f644f, (D1.j) obj, aVar);
    }

    public void h(InterfaceC0749iq interfaceC0749iq) {
        CallableC0336Sb callableC0336Sb = new CallableC0336Sb(5, (Nl) this.f4618p);
        Su su = (Su) this.f4619q;
        InterfaceFutureC0239a b4 = ((C0260Dc) su).b(callableC0336Sb);
        int i4 = 0;
        b4.a(new Nu(i4, b4, new Ol(interfaceC0749iq, i4)), su);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0876lp
    public Object i() {
        InterfaceC1425yg interfaceC1425yg;
        synchronized (this) {
            interfaceC1425yg = (InterfaceC1425yg) this.f4619q;
        }
        return interfaceC1425yg;
    }

    @Override // b1.e
    public void j(Canvas canvas) {
        Drawable drawable = (Drawable) this.f4619q;
        C1907E c1907e = (C1907E) this.f4618p;
        boolean z4 = c1907e.f14401Q;
        float G3 = c1907e.G();
        int max = (int) (Math.max(G3, c1907e.F()) / 1.2f);
        canvas.translate((int) ((G3 - max) / 2.0f), (-max) / 8);
        if (z4) {
            drawable.setBounds(0, 0, max, max);
            drawable.draw(canvas);
        }
        canvas.translate(-r3, -r4);
    }

    public synchronized InterfaceFutureC0239a m(Wl wl, InterfaceC0833kp interfaceC0833kp, InterfaceC1425yg interfaceC1425yg) {
        this.f4619q = interfaceC1425yg;
        if (((C0370Za) wl.f7563p) == null) {
            return ((C0620fp) this.f4618p).b(wl, interfaceC0833kp, interfaceC1425yg);
        }
        C0781jg c = interfaceC1425yg.c();
        return c.a(c.c(Bs.h0((C0370Za) wl.f7563p)));
    }

    public synchronized String n() {
        return (String) this.f4619q;
    }

    public void o(InterfaceC0089t0 interfaceC0089t0) {
        synchronized (this.f4618p) {
            this.f4619q = interfaceC0089t0;
        }
    }

    public void p(C1510e1 c1510e1) {
        InterfaceC0650gc interfaceC0650gc;
        String str;
        Context context = (Context) this.f4618p;
        synchronized (C0258Da.class) {
            try {
                if (f4615r == null) {
                    C0077n c0077n = C0081p.f1374f.f1376b;
                    BinderC0983o9 binderC0983o9 = new BinderC0983o9();
                    c0077n.getClass();
                    f4615r = (InterfaceC0650gc) new C0057d(context, binderC0983o9).d(context, false);
                }
                interfaceC0650gc = f4615r;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC0650gc == null) {
            c1510e1.p("Internal Error, query info generator is null.");
            return;
        }
        Context context2 = (Context) this.f4618p;
        C0097x0 c0097x0 = (C0097x0) this.f4619q;
        BinderC1813b binderC1813b = new BinderC1813b(context2);
        O1.U0 u02 = c0097x0 == null ? new O1.U0(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0) : O1.W0.a((Context) this.f4618p, c0097x0);
        switch (1) {
            case 1:
                str = "BANNER";
                break;
            case 2:
                str = "INTERSTITIAL";
                break;
            case 3:
                str = "REWARDED";
                break;
            case 4:
                str = "REWARDED_INTERSTITIAL";
                break;
            case 5:
                str = "NATIVE";
                break;
            case 6:
                str = "UNKNOWN";
                break;
            case 7:
                str = "APP_OPEN_AD";
                break;
            default:
                throw null;
        }
        try {
            interfaceC0650gc.E0(binderC1813b, new C0820kc(null, str, null, u02), new BinderC0252Ca(c1510e1));
        } catch (RemoteException unused) {
            c1510e1.p("Internal Error.");
        }
    }

    public void q(VB vb) {
        synchronized (vb) {
        }
        Handler handler = (Handler) this.f4618p;
        if (handler != null) {
            handler.post(new RunnableC0203p(2, this, vb));
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        switch (this.f4617o) {
            case 18:
                C0952nf c0952nf = (C0952nf) this.f4619q;
                String str = (String) obj;
                Lp lp = c0952nf.f9754v;
                Nq nq = c0952nf.f9753u;
                Ep ep = c0952nf.f9751s;
                C1434yp c1434yp = c0952nf.f9752t;
                lp.a(nq.b(ep, c1434yp, false, (String) this.f4618p, str, c1434yp.d));
                return;
            case 19:
                List list = ((C0483cg) obj).f8373a;
                C0275Ga c0275Ga = (C0275Ga) this.f4618p;
                C0611fg c0611fg = (C0611fg) this.f4619q;
                Executor executor = c0611fg.f8715a;
                if (list == null || list.isEmpty()) {
                    executor.execute(new RunnableC0526dg(c0275Ga, 0));
                    return;
                }
                InterfaceFutureC0239a interfaceFutureC0239a = Pu.f6608p;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    interfaceFutureC0239a = Bs.n0(Bs.c0(interfaceFutureC0239a, Throwable.class, new C0512d8(6, c0275Ga), executor), new C0568eg(c0611fg, c0275Ga, (InterfaceFutureC0239a) it.next(), 0), executor);
                }
                interfaceFutureC0239a.a(new Nu(0, interfaceFutureC0239a, new C0783ji(c0611fg, c0275Ga, 23, false)), executor);
                return;
            case 20:
                C1427yi c1427yi = (C1427yi) this.f4619q;
                View view = (View) this.f4618p;
                Pq pq = (Pq) obj;
                InterfaceC0308Md P4 = c1427yi.f11435k.P();
                if (!c1427yi.f11438n.c() || pq == null || P4 == null || view == null) {
                    return;
                }
                N1.n.f1204A.f1224v.getClass();
                C0347Uc.s(new RunnableC0532dm(pq, view, 1));
                return;
            case 21:
            case 24:
            case 25:
            default:
                ((C1006oq) ((C0381a5) this.f4619q).f8081t).c.n1(new C0920mq((C0834kq) this.f4618p, 0));
                return;
            case 22:
                ((InterfaceC0308Md) obj).D0((String) this.f4618p, (InterfaceC0597f8) this.f4619q);
                return;
            case 23:
                ((Hk) obj).f5503z = true;
                ((Vk) this.f4619q).f7278r.b((String) this.f4618p);
                return;
            case 26:
                Vm vm = (Vm) obj;
                synchronized (((C1151s6) this.f4619q)) {
                    try {
                        ((Nm) ((C1151s6) this.f4619q).f10581g).c(vm, (C1434yp) this.f4618p);
                        if (((Nm) ((C1151s6) this.f4619q).f10581g).e()) {
                            C1151s6 c1151s6 = (C1151s6) this.f4619q;
                            c1151s6.c(((Nm) c1151s6.f10581g).a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public void s(Object obj, String str) {
        boolean commit;
        String str2 = (String) this.f4618p;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f4619q;
        if (obj instanceof String) {
            commit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                String str3 = "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + str2;
                Log.e("PaidLifecycleSPHandler", str3);
                throw new IllegalArgumentException(str3);
            }
            commit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (commit) {
            return;
        }
        String str4 = "Failed to store " + str + " for app " + str2;
        Log.e("PaidLifecycleSPHandler", str4);
        throw new IOException(str4);
    }

    public void t(String str) {
        if (((SharedPreferences) this.f4619q).edit().remove(str).commit()) {
            return;
        }
        String str2 = "Failed to remove " + str + " for app " + ((String) this.f4618p);
        Log.e("PaidLifecycleSPHandler", str2);
        throw new IOException(str2);
    }

    public void u(C0914mk c0914mk) {
        Handler handler = (Handler) this.f4618p;
        if (handler != null) {
            handler.post(new RunnableC0203p(1, this, c0914mk));
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        switch (this.f4617o) {
            case 18:
                C0952nf c0952nf = (C0952nf) this.f4619q;
                Lp lp = c0952nf.f9754v;
                Nq nq = c0952nf.f9753u;
                Ep ep = c0952nf.f9751s;
                C1434yp c1434yp = c0952nf.f9752t;
                lp.a(nq.b(ep, c1434yp, false, (String) this.f4618p, null, c1434yp.d));
                return;
            case 19:
                ((C0275Ga) this.f4618p).y(th);
                AbstractC0266Ec.f4899e.execute(new D3(21, (C0611fg) this.f4619q));
                return;
            case 20:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x4)).booleanValue()) {
                    N1.n.f1204A.f1209g.g("omid native display exp", th);
                    return;
                }
                return;
            case 21:
            case 24:
            case 25:
            default:
                ((C1006oq) ((C0381a5) this.f4619q).f8081t).c.n1(new Wl(3, (C0834kq) this.f4618p, th));
                return;
            case 22:
            case 23:
                return;
            case 26:
                synchronized (((C1151s6) this.f4619q)) {
                    try {
                        ((Nm) ((C1151s6) this.f4619q).f10581g).b((C1434yp) this.f4618p);
                        if (((Nm) ((C1151s6) this.f4619q).f10581g).e()) {
                            C1151s6 c1151s6 = (C1151s6) this.f4619q;
                            c1151s6.c(((Nm) c1151s6.f10581g).a());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
