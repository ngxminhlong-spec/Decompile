package com.google.android.gms.internal.ads;

import O1.C0101z0;
import Q1.C0117p;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import c3.InterfaceFutureC0239a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1384xi implements Mu, InterfaceC0481ce, InterfaceC0725i7, N1.i, InterfaceC1087ql, InterfaceC0749iq, Gn, Cu, InterfaceC0833kp, Bh {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11289o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f11290p;

    public C1384xi() {
        this.f11289o = 26;
        this.f11290p = new int[2];
    }

    public C1384xi(int i4) {
        this.f11289o = 29;
        this.f11290p = AbstractC0587ez.l(i4);
    }

    public /* synthetic */ C1384xi(int i4, Object obj) {
        this.f11289o = i4;
        this.f11290p = obj;
    }

    public C1384xi(AbstractC1229tz abstractC1229tz) {
        this.f11289o = 28;
        Charset charset = Mz.f6292a;
        this.f11290p = abstractC1229tz;
        abstractC1229tz.f10762b = this;
    }

    private final void F0(Yf yf) {
        C0251Bf c0251Bf = (C0251Bf) yf;
        synchronized (((Yo) this.f11290p)) {
            try {
                C0251Bf c0251Bf2 = ((Yo) this.f11290p).y;
                if (c0251Bf2 != null) {
                    c0251Bf2.b();
                }
                Yo yo = (Yo) this.f11290p;
                yo.y = c0251Bf;
                InterfaceC0308Md interfaceC0308Md = c0251Bf.f4138j;
                if (interfaceC0308Md != null) {
                    interfaceC0308Md.C0(yo);
                }
                Yo yo2 = (Yo) this.f11290p;
                yo2.f7893t.b(new BinderC0257Cf(c0251Bf, yo2, yo2.f7893t, yo2.f7895v));
                c0251Bf.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1384xi G0(C1437ys c1437ys) {
        return new C1384xi(27, new Xj(20, c1437ys));
    }

    private final InterfaceFutureC0239a N(C0370Za c0370Za) {
        C0829kl c0829kl = (C0829kl) ((C0381a5) this.f11290p).f8078q;
        String str = c0370Za.f7996v;
        synchronized (c0829kl.f8980p) {
            try {
                int i4 = c0829kl.f9317v;
                if (i4 != 1 && i4 != 3) {
                    return Bs.f0(new Xk(2));
                }
                if (c0829kl.f8981q) {
                    return c0829kl.f8979o;
                }
                c0829kl.f9317v = 3;
                c0829kl.f8981q = true;
                c0829kl.f9316u = str;
                c0829kl.f8984t.n();
                C0272Fc c0272Fc = c0829kl.f8979o;
                c0272Fc.f5017o.a(new RunnableC0786jl(c0829kl, 1), AbstractC0266Ec.f4900f);
                return c0829kl.f8979o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void O(Throwable th) {
    }

    private final void X() {
        synchronized (((En) this.f11290p)) {
            ((En) this.f11290p).f4939x = null;
        }
    }

    private final void a0() {
        synchronized (((Yo) this.f11290p)) {
            ((Yo) this.f11290p).y = null;
        }
    }

    private final void j0(Throwable th) {
    }

    private final void n0(Object obj) {
        Ep ep = (Ep) obj;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r5)).booleanValue()) {
            ((C0488cl) this.f11290p).f8396e.f(((Ap) ep.f4943b.f6526q).f3999e);
            Rl rl = ((C0488cl) this.f11290p).f8396e;
            long j4 = ((Ap) ep.f4943b.f6526q).f4000f;
            synchronized (rl.f6838h) {
                rl.c = j4;
            }
        }
    }

    private final /* bridge */ /* synthetic */ void t0(Yf yf) {
        Xh xh = (Xh) yf;
        synchronized (((En) this.f11290p)) {
            ((En) this.f11290p).f4939x = xh;
            xh.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.Gn
    public void B(Yf yf) {
        switch (this.f11289o) {
            case 15:
                t0(yf);
                return;
            case 18:
                F0(yf);
                return;
            default:
                synchronized (((BinderC1348wp) this.f11290p)) {
                    try {
                        ((BinderC1348wp) this.f11290p).f11211r = (Hj) yf;
                        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10182W2)).booleanValue()) {
                            ((Hj) yf).f5489s.f5339a = ((BinderC1348wp) this.f11290p).f11210q;
                        }
                        ((BinderC1348wp) this.f11290p).f11211r.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0725i7
    public void D(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0481ce
    public void F(String str, int i4, String str2, boolean z4) {
        ((C0594f5) this.f11290p).d();
    }

    public JSONObject J(View view) {
        int[] iArr = (int[]) this.f11290p;
        if (view == null) {
            return AbstractC0750ir.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return AbstractC0750ir.a(iArr[0], iArr[1], width, height);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.BB, com.google.android.gms.internal.ads.xB] */
    public BB J0() {
        return new AbstractC1371xB((LinkedHashMap) this.f11290p);
    }

    public List K0(String str) {
        str.getClass();
        Iterator d = ((Ks) this.f11290p).d(this, str);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Js js = (Js) d;
            if (!js.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) js.next());
        }
    }

    public void L0(long j4) {
        C0381a5 c0381a5 = new C0381a5("creation");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "nativeObjectNotCreated";
        R0(c0381a5);
    }

    public void M(String str, FB fb) {
        AbstractC0587ez.f(fb, "provider");
        ((LinkedHashMap) this.f11290p).put(str, fb);
    }

    public void M0(int i4, Object obj, InterfaceC0984oA interfaceC0984oA) {
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) this.f11290p;
        abstractC1229tz.N(i4, 3);
        interfaceC0984oA.f((AbstractC0417az) obj, abstractC1229tz.f10762b);
        abstractC1229tz.N(i4, 4);
    }

    public void R0(C0381a5 c0381a5) {
        String g4 = C0381a5.g(c0381a5);
        Y9.r("Dispatching AFMA event on publisher webview: ".concat(g4));
        C1025p8 c1025p8 = (C1025p8) this.f11290p;
        Parcel Q3 = c1025p8.Q();
        Q3.writeString(g4);
        c1025p8.G1(Q3, 1);
    }

    @Override // N1.i
    public void a() {
        C0825kh c0825kh = ((Oj) this.f11290p).f6492g;
        synchronized (c0825kh) {
            try {
                if (c0825kh.f9303u) {
                    return;
                }
                ScheduledFuture scheduledFuture = c0825kh.f9304v;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    c0825kh.f9302t = -1L;
                } else {
                    c0825kh.f9304v.cancel(true);
                    long j4 = c0825kh.f9301s;
                    c0825kh.f9300r.getClass();
                    c0825kh.f9302t = j4 - SystemClock.elapsedRealtime();
                }
                c0825kh.f9303u = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.Hu, com.google.android.gms.internal.ads.yu, c3.a] */
    @Override // com.google.android.gms.internal.ads.Cu
    /* renamed from: b */
    public InterfaceFutureC0239a mo0b() {
        Bundle bundle;
        C0491co c0491co = (C0491co) this.f11290p;
        C0937n6 c0937n6 = AbstractC1066q6.i9;
        O1.r rVar = O1.r.d;
        String lowerCase = ((Boolean) rVar.c.a(c0937n6)).booleanValue() ? c0491co.c.f5911f.toLowerCase(Locale.ROOT) : c0491co.c.f5911f;
        if (((Boolean) rVar.c.a(AbstractC1066q6.f10273q1)).booleanValue()) {
            Dk dk = (Dk) c0491co.f8415j;
            synchronized (dk) {
                bundle = new Bundle(dk.f4778o);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) rVar.c.a(AbstractC1066q6.f10314z1)).booleanValue()) {
            c0491co.d(arrayList, ((C1131rn) c0491co.f8412g).a(c0491co.d, lowerCase));
        } else {
            Iterator it = ((It) ((C1131rn) c0491co.f8412g).b(c0491co.d, lowerCase).entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                Bundle bundle3 = c0491co.c.d.f1293A;
                arrayList.add(c0491co.a(str, list, bundle3 != null ? bundle3.getBundle(str) : null, true, true));
            }
            c0491co.d(arrayList, ((C1131rn) c0491co.f8412g).c());
        }
        AbstractC1137rt r4 = AbstractC1137rt.r(arrayList);
        B0.v vVar = new B0.v(15, arrayList, bundle2);
        Su su = (Su) c0491co.f8410e;
        ?? abstractC1439yu = new AbstractC1439yu(r4, true, false);
        abstractC1439yu.f5517D = new Gu(abstractC1439yu, vVar, su);
        abstractC1439yu.v();
        return abstractC1439yu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0725i7
    public JSONObject b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Gn
    /* renamed from: b */
    public void mo5b() {
        switch (this.f11289o) {
            case 15:
                X();
                return;
            case 18:
                a0();
                return;
            default:
                synchronized (((BinderC1348wp) this.f11290p)) {
                    ((BinderC1348wp) this.f11290p).f11211r = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0725i7
    public JSONObject c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0725i7
    public void e() {
        C1427yi c1427yi = ((BinderC1213tj) this.f11290p).f10720r;
        if (c1427yi != null) {
            c1427yi.e("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        Xl.e((SQLiteDatabase) obj, (C0242Ac) this.f11290p);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        C0834kq c0834kq = (C0834kq) this.f11290p;
        ((InterfaceC1049pq) obj).O(c0834kq.f9324p);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1087ql
    public InterfaceFutureC0239a o(C0370Za c0370Za) {
        InterfaceFutureC0239a interfaceFutureC0239a;
        switch (this.f11289o) {
            case 8:
                return N(c0370Za);
            default:
                C0829kl c0829kl = (C0829kl) this.f11290p;
                synchronized (c0829kl.f8980p) {
                    try {
                        int i4 = c0829kl.f9317v;
                        if (i4 != 1 && i4 != 2) {
                            interfaceFutureC0239a = Bs.f0(new Xk(2));
                        } else if (c0829kl.f8981q) {
                            interfaceFutureC0239a = c0829kl.f8979o;
                        } else {
                            c0829kl.f9317v = 2;
                            c0829kl.f8981q = true;
                            c0829kl.f8983s = c0370Za;
                            c0829kl.f8984t.n();
                            C0272Fc c0272Fc = c0829kl.f8979o;
                            c0272Fc.f5017o.a(new RunnableC0786jl(c0829kl, 0), AbstractC0266Ec.f4900f);
                            interfaceFutureC0239a = c0829kl.f8979o;
                        }
                    } finally {
                    }
                }
                return interfaceFutureC0239a;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        C0272Fc c0272Fc;
        switch (this.f11289o) {
            case 0:
                C1427yi c1427yi = (C1427yi) this.f11290p;
                c1427yi.f11435k.p((InterfaceC0308Md) obj);
                Ci ci = c1427yi.f11435k;
                synchronized (ci) {
                    c0272Fc = ci.f4513n;
                }
                Pq y = c1427yi.y("Google", true);
                if (y != null && c0272Fc != null) {
                    c0272Fc.b(y);
                    return;
                } else {
                    if (c0272Fc != null) {
                        c0272Fc.cancel(false);
                        return;
                    }
                    return;
                }
            case 1:
                try {
                    InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) ((List) obj).get(0);
                    if (interfaceC0308Md != null) {
                        Vi vi = (Vi) this.f11290p;
                        vi.f7270q.execute(new RunnableC0343Td(interfaceC0308Md, 2));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e4) {
                    if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x4)).booleanValue()) {
                        N1.n.f1204A.f1209g.h("omid native display exp", e4);
                        return;
                    }
                    return;
                }
            case 7:
                n0(obj);
                return;
            case 10:
                ((C0911mh) ((C1151s6) this.f11290p).f10577a).K0((Ep) obj);
                return;
            case 11:
                try {
                    ((InterfaceC0350Va) this.f11290p).J((ParcelFileDescriptor) obj);
                    return;
                } catch (RemoteException e5) {
                    Q1.I.x("Ad service can't call client", e5);
                    return;
                }
            case 13:
                ((Ff) obj).a();
                return;
            default:
                ((Aq) this.f11290p).f();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0833kp
    public C0244Ae u(InterfaceC0790jp interfaceC0790jp) {
        return ((C1219tp) this.f11290p).b(interfaceC0790jp);
    }

    @Override // N1.i
    public void v() {
        C0825kh c0825kh = ((Oj) this.f11290p).f6492g;
        synchronized (c0825kh) {
            try {
                if (c0825kh.f9303u) {
                    if (c0825kh.f9302t > 0 && c0825kh.f9304v.isCancelled()) {
                        c0825kh.s1(c0825kh.f9302t);
                    }
                    c0825kh.f9303u = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        switch (this.f11289o) {
            case 0:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x4)).booleanValue()) {
                    N1.n.f1204A.f1209g.g("omid native display exp", th);
                    return;
                }
                return;
            case 1:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x4)).booleanValue()) {
                    N1.n.f1204A.f1209g.h("omid native display exp", th);
                    return;
                }
                return;
            case 7:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r5)).booleanValue()) {
                    Matcher matcher = C0488cl.f8393h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        ((C0488cl) this.f11290p).f8396e.f(Integer.parseInt(matcher.group(1)));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                return;
            case 11:
                try {
                    InterfaceC0350Va interfaceC0350Va = (InterfaceC0350Va) this.f11290p;
                    C0101z0 b4 = Zf.b(th);
                    interfaceC0350Va.c0(new C0117p(Ds.a(th.getMessage()) ? b4.f1406p : th.getMessage(), b4.f1405o));
                    return;
                } catch (RemoteException e4) {
                    Q1.I.x("Ad service can't call client", e4);
                    return;
                }
            case 13:
                Cm cm = (Cm) this.f11290p;
                C0101z0 u2 = Zf.u(th, ((C0781jg) cm.f4541b.f4659P0.c()).f9178l);
                ((Kg) cm.f4542e).J(u2);
                Zf.z(u2.f1405o, th, "DelayedBannerAd.onFailure");
                return;
            default:
                return;
        }
    }
}
