package com.google.android.gms.internal.ads;

import O1.C0101z0;
import O1.InterfaceC0089t0;
import Q1.C0117p;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import b0.RunnableC0203p;
import c3.InterfaceFutureC0239a;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Xj implements InterfaceC0723i5, Mu, Xf, InterfaceC0481ce, N1.e, Gn, Cu, InterfaceC0833kp, InterfaceC0876lp, InterfaceC0749iq, Ks, Ty, Ls, InterfaceC1132ro {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7686o;

    /* renamed from: p, reason: collision with root package name */
    public Object f7687p;

    public /* synthetic */ Xj(int i4) {
        this.f7686o = i4;
        switch (i4) {
            case 25:
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
                int i5 = AbstractC0751is.f9071a;
                if (i5 >= 29) {
                    Xo.a(usage, 1);
                }
                if (i5 >= 32) {
                    AbstractC1396xu.a(usage, 0);
                }
                this.f7687p = usage.build();
                return;
            default:
                this.f7687p = new ArrayDeque();
                return;
        }
    }

    public /* synthetic */ Xj(int i4, Object obj) {
        this.f7686o = i4;
        this.f7687p = obj;
    }

    public /* synthetic */ Xj(int i4, Object obj, Object obj2) {
        this.f7686o = i4;
        this.f7687p = obj2;
    }

    public /* synthetic */ Xj(int i4, boolean z4) {
        this.f7686o = i4;
    }

    public Xj(AbstractC1441yw abstractC1441yw, Class cls) {
        this.f7686o = 21;
        if (abstractC1441yw.f11551b.keySet().contains(cls) || Void.class.equals(cls)) {
            this.f7687p = abstractC1441yw;
            return;
        }
        throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1441yw.toString() + " does not support primitive class " + cls.getName());
    }

    public static void k(HashMap hashMap, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("pii");
        if (optJSONObject == null) {
            Q1.I.w("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
            hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
        }
        if (TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
            return;
        }
        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
    }

    private final void m(Throwable th) {
    }

    private final void n() {
        synchronized (((BinderC1432yn) this.f7687p)) {
            ((BinderC1432yn) this.f7687p).f11469w = null;
        }
    }

    private final void p() {
        synchronized (((Op) this.f7687p)) {
        }
    }

    public static Xj t(byte[] bArr) {
        return new Xj(23, Zy.a(bArr));
    }

    private final void w(Yf yf) {
        Ff ff = (Ff) yf;
        synchronized (((BinderC1432yn) this.f7687p)) {
            Ff ff2 = ((BinderC1432yn) this.f7687p).f11469w;
            if (ff2 != null) {
                Ug ug = ff2.c;
                ug.getClass();
                ug.n1(new C0894m6(null, 3));
            }
            ((BinderC1432yn) this.f7687p).f11469w = ff;
            ff.a();
        }
    }

    private final void x(Yf yf) {
        synchronized (((Op) this.f7687p)) {
            ((Op) this.f7687p).f6527r = yf.f7861f;
            yf.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.Gn
    public void B(Yf yf) {
        switch (this.f7686o) {
            case 10:
                w(yf);
                return;
            case 11:
                x(yf);
                return;
            default:
                synchronized (((BinderC1305vp) this.f7687p)) {
                    try {
                        ((BinderC1305vp) this.f7687p).f11074x = (Hj) yf;
                        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10182W2)).booleanValue()) {
                            ((Hj) yf).f5489s.f5339a = ((BinderC1305vp) this.f7687p).f11069s;
                        }
                        ((BinderC1305vp) this.f7687p).f11074x.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0481ce
    public void F(String str, int i4, String str2, boolean z4) {
        C0348Ud c0348Ud = (C0348Ud) this.f7687p;
        c0348Ud.B();
        c0348Ud.f7165o.f7464A.j0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0876lp
    public /* bridge */ /* synthetic */ InterfaceFutureC0239a a(Wl wl, InterfaceC0833kp interfaceC0833kp) {
        return s(wl, interfaceC0833kp, null);
    }

    @Override // com.google.android.gms.internal.ads.Xf, com.google.android.gms.internal.ads.Ls
    public InterfaceC0089t0 b() {
        try {
            return ((Pp) this.f7687p).f6603a.f();
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.google.android.gms.internal.ads.zg] */
    @Override // com.google.android.gms.internal.ads.Cu
    /* renamed from: b */
    public InterfaceFutureC0239a mo0b() {
        C1433yo c1433yo = (C1433yo) this.f7687p;
        C0937n6 c0937n6 = AbstractC1066q6.o6;
        O1.r rVar = O1.r.d;
        String str = ((Boolean) rVar.c.a(c0937n6)).booleanValue() ? "UNKNOWN" : (String) c1433yo.f11473f;
        C1423ye c1423ye = (C1423ye) c1433yo.f11474g;
        Su su = c1433yo.c;
        C1423ye c1423ye2 = c1423ye.f11395b;
        ?? obj = new Object();
        obj.f11620a = c1433yo.f11471b;
        Ip ip = new Ip();
        ip.c = "adUnitId";
        ip.f5727a = c1433yo.f11472e.d;
        ip.f5728b = new O1.X0();
        ip.f5742r = true;
        obj.f11621b = ip.a();
        C1468zg c1468zg = new C1468zg(obj);
        B0.f fVar = new B0.f(3);
        fVar.f75p = str;
        B0.a aVar = new B0.a(fVar, (byte) 0);
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        return Bs.Z(Bs.m0((Ku) Bs.o0(Ku.q((InterfaceFutureC0239a) new C0294Je(c1423ye2, aVar, c1468zg).c.c()), ((Long) rVar.c.a(AbstractC1066q6.p6)).longValue(), TimeUnit.MILLISECONDS, c1433yo.d), C0932n1.f9703m, su), Exception.class, C0932n1.f9704n, su);
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public Object b() {
        switch (this.f7686o) {
            case 26:
                return (C0874ln) this.f7687p;
            case 27:
                return (C0604fF) this.f7687p;
            default:
                return Boolean.valueOf(((C1029pC) this.f7687p).f9929K);
        }
    }

    @Override // com.google.android.gms.internal.ads.Gn
    /* renamed from: b, reason: collision with other method in class */
    public void mo5b() {
        switch (this.f7686o) {
            case 10:
                n();
                return;
            case 11:
                p();
                return;
            default:
                synchronized (((BinderC1305vp) this.f7687p)) {
                    ((BinderC1305vp) this.f7687p).f11074x = null;
                }
                return;
        }
    }

    @Override // N1.e
    public void c() {
        InterfaceFutureC0239a m02;
        switch (this.f7686o) {
            case 4:
                C0326Qb c0326Qb = (C0326Qb) this.f7687p;
                synchronized (c0326Qb.f6659o) {
                    try {
                        if (((SharedPreferences) c0326Qb.f6661q) == null) {
                            c0326Qb.f6661q = ((Context) c0326Qb.f6660p).getSharedPreferences("google_ads_flags_meta", 0);
                        }
                    } finally {
                    }
                }
                long j4 = ((SharedPreferences) c0326Qb.f6661q).getLong("js_last_update", 0L);
                N1.n.f1204A.f1212j.getClass();
                if (System.currentTimeMillis() - j4 < ((Long) N6.f6305b.r()).longValue()) {
                    m02 = Pu.f6608p;
                } else {
                    m02 = Bs.m0(((C0727i9) c0326Qb.f6662r).a(C0326Qb.K((Context) c0326Qb.f6660p)), new C0563eb(0, c0326Qb), AbstractC0266Ec.f4900f);
                }
                AbstractC1230u.k(m02, "persistFlags");
                return;
            default:
                ((Gg) ((C0274Fe) this.f7687p).f5047m.c()).D();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ks
    public /* synthetic */ Iterator d(C1384xi c1384xi, CharSequence charSequence) {
        return new Hs(this, c1384xi, charSequence);
    }

    @Override // N1.e
    public void e() {
        C0274Fe c0274Fe = (C0274Fe) this.f7687p;
        ((Qg) c0274Fe.f5043i.c()).b();
        Th th = (Th) c0274Fe.f5049o.c();
        synchronized (th) {
            th.n1(C0782jh.f9185E);
        }
    }

    @Override // N1.e
    public void f(View view) {
    }

    public C1057py g(AbstractC0886lz abstractC0886lz) {
        AbstractC1441yw abstractC1441yw = (AbstractC1441yw) this.f7687p;
        try {
            Bs a4 = abstractC1441yw.a();
            AbstractC0417az A3 = a4.A(abstractC0886lz);
            a4.R(A3);
            AbstractC0417az i4 = a4.i(A3);
            C1014oy v4 = C1057py.v();
            String d = abstractC1441yw.d();
            v4.d();
            C1057py.A((C1057py) v4.f4561p, d);
            C0800jz c = i4.c();
            v4.d();
            C1057py.B((C1057py) v4.f4561p, c);
            int b4 = abstractC1441yw.b();
            v4.d();
            C1057py.C((C1057py) v4.f4561p, b4);
            return (C1057py) v4.b();
        } catch (Oz e4) {
            throw new GeneralSecurityException("Unexpected proto", e4);
        }
    }

    public JSONObject h(View view) {
        int currentModeType;
        JSONObject a4 = AbstractC0750ir.a(0, 0, 0, 0);
        UiModeManager uiModeManager = Zf.f8021a;
        int i4 = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : Zf.f8022b;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        try {
            a4.put("noOutputDevice", i5 == 0);
            return a4;
        } catch (JSONException e4) {
            Zf.q("Error with setting output device status", e4);
            return a4;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0876lp
    public /* synthetic */ Object i() {
        return (InterfaceC1425yg) this.f7687p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723i5
    public void j(F5 f5) {
        switch (this.f7686o) {
            case 0:
                C0850l5 c0850l5 = (C0850l5) ((G5) f5.f4561p).v().h();
                C1408y5 c1408y5 = (C1408y5) ((G5) f5.f4561p).v().w().h();
                String str = ((Ap) ((Ep) this.f7687p).f4943b.f6526q).f3998b;
                c1408y5.d();
                C1451z5.w((C1451z5) c1408y5.f4561p, str);
                c0850l5.d();
                C0893m5.y((C0893m5) c0850l5.f4561p, (C1451z5) c1408y5.b());
                f5.d();
                G5.D((G5) f5.f4561p, (C0893m5) c0850l5.b());
                return;
            default:
                B5 b5 = (B5) ((G5) f5.f4561p).w().h();
                Y5 y5 = (Y5) this.f7687p;
                b5.d();
                C5.x((C5) b5.f4561p, y5);
                f5.d();
                G5.C((G5) f5.f4561p, (C5) b5.b());
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        if (((Boolean) G6.c.r()).booleanValue()) {
            ((Aq) this.f7687p).f();
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l, reason: collision with other method in class */
    public void mo6l(Object obj) {
        ((PC) obj).b((AbstractC0318Od) this.f7687p);
    }

    @Override // com.google.android.gms.internal.ads.Ty
    public Object o(String str) {
        return ((C0347Uc) this.f7687p).f(str, null);
    }

    public int q() {
        int optInt = ((JSONObject) this.f7687p).optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        switch (this.f7686o) {
            case 1:
                String str = (String) obj;
                synchronized (this) {
                    Ck ck = (Ck) this.f7687p;
                    ck.c = true;
                    N1.n.f1204A.f1212j.getClass();
                    ck.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - ((Ck) this.f7687p).d), "", true);
                    ((Ck) this.f7687p).f4531i.execute(new RunnableC0203p(27, this, str));
                }
                return;
            case 2:
                ((C0915ml) this.f7687p).c.K0((Ep) obj);
                return;
            default:
                try {
                    ((InterfaceC0360Xa) this.f7687p).J((ParcelFileDescriptor) obj);
                    return;
                } catch (RemoteException e4) {
                    Q1.I.x("Service can't call client", e4);
                    return;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.mp, java.lang.Object] */
    public InterfaceFutureC0239a s(Wl wl, InterfaceC0833kp interfaceC0833kp, InterfaceC1425yg interfaceC1425yg) {
        C0244Ae u2 = interfaceC0833kp.u((InterfaceC0790jp) wl.f7564q);
        ?? obj = new Object();
        switch (u2.f3963a) {
            case 0:
                u2.c = obj;
                break;
            default:
                u2.c = obj;
                break;
        }
        InterfaceC1425yg interfaceC1425yg2 = (InterfaceC1425yg) u2.c();
        this.f7687p = interfaceC1425yg2;
        C0781jg c = interfaceC1425yg2.c();
        Object obj2 = new Object();
        Ku q4 = Ku.q(c.b());
        N1.c cVar = new N1.c(12, obj2, c);
        Iu iu = Iu.f5747o;
        return Bs.m0(Bs.n0(q4, cVar, iu), new C0563eb(9, obj2), iu);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0833kp
    public C0244Ae u(InterfaceC0790jp interfaceC0790jp) {
        return ((Uo) this.f7687p).b(interfaceC0790jp);
    }

    public void v(AbstractC0886lz abstractC0886lz) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f7687p;
        if (!abstractC0886lz.p()) {
            if (!(abstractC0886lz instanceof C0941nA)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC0886lz.getClass())));
            }
            C0941nA c0941nA = (C0941nA) abstractC0886lz;
            v(c0941nA.f9720r);
            v(c0941nA.f9721s);
            return;
        }
        int binarySearch = Arrays.binarySearch(C0941nA.f9718v, abstractC0886lz.l());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int C4 = C0941nA.C(binarySearch + 1);
        if (arrayDeque.isEmpty() || ((AbstractC0886lz) arrayDeque.peek()).l() >= C4) {
            arrayDeque.push(abstractC0886lz);
            return;
        }
        int C5 = C0941nA.C(binarySearch);
        AbstractC0886lz abstractC0886lz2 = (AbstractC0886lz) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((AbstractC0886lz) arrayDeque.peek()).l() < C5) {
            abstractC0886lz2 = new C0941nA((AbstractC0886lz) arrayDeque.pop(), abstractC0886lz2);
        }
        C0941nA c0941nA2 = new C0941nA(abstractC0886lz2, abstractC0886lz);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(C0941nA.f9718v, c0941nA2.f9719q);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((AbstractC0886lz) arrayDeque.peek()).l() >= C0941nA.C(binarySearch2 + 1)) {
                break;
            } else {
                c0941nA2 = new C0941nA((AbstractC0886lz) arrayDeque.pop(), c0941nA2);
            }
        }
        arrayDeque.push(c0941nA2);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        switch (this.f7686o) {
            case 1:
                synchronized (this) {
                    Ck ck = (Ck) this.f7687p;
                    ck.c = true;
                    N1.n.f1204A.f1212j.getClass();
                    ck.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - ((Ck) this.f7687p).d), "Internal Error.", false);
                    ((Ck) this.f7687p).f4527e.c(new Exception());
                }
                return;
            case 2:
                return;
            default:
                try {
                    InterfaceC0360Xa interfaceC0360Xa = (InterfaceC0360Xa) this.f7687p;
                    C0101z0 b4 = Zf.b(th);
                    interfaceC0360Xa.c0(new C0117p(Ds.a(th.getMessage()) ? b4.f1406p : th.getMessage(), b4.f1405o));
                    return;
                } catch (RemoteException e4) {
                    Q1.I.x("Service can't call client", e4);
                    return;
                }
        }
    }
}
