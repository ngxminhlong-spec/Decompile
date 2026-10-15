package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.AbstractC1515f1;
import com.google.android.gms.internal.measurement.C1518g;
import com.google.android.gms.internal.measurement.C1546m;
import com.google.android.gms.internal.measurement.C1554o;
import com.google.android.gms.internal.measurement.C1599z1;
import com.google.android.gms.internal.measurement.CallableC1499c0;
import com.google.android.gms.internal.measurement.InterfaceC1550n;
import j.AbstractC1719a;
import j.C1723e;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k.MenuC1742C;
import l2.C1798a;
import n3.InterfaceC1815b;
import o1.InterfaceC1873l0;
import o2.C1893d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u3.InterfaceC2015a;
import w3.InterfaceC2053a;
import x2.C2066c0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326Qb implements InterfaceC1873l0, y1.b, InterfaceC0723i5, InterfaceC0749iq, Mu, InterfaceC1374xE, ED, InterfaceC1815b {

    /* renamed from: s, reason: collision with root package name */
    public static C0326Qb f6657s;

    /* renamed from: t, reason: collision with root package name */
    public static C0326Qb f6658t;

    /* renamed from: o, reason: collision with root package name */
    public Object f6659o;

    /* renamed from: p, reason: collision with root package name */
    public Object f6660p;

    /* renamed from: q, reason: collision with root package name */
    public Object f6661q;

    /* renamed from: r, reason: collision with root package name */
    public Object f6662r;

    public C0326Qb(int i4) {
        switch (i4) {
            case 5:
                this.f6659o = new Object();
                this.f6660p = new Object();
                return;
            case 16:
                this.f6659o = null;
                this.f6660p = null;
                this.f6661q = null;
                this.f6662r = Iv.f5767x;
                return;
            case 17:
                this.f6659o = new HashMap();
                this.f6660p = new HashMap();
                this.f6661q = new HashMap();
                this.f6662r = new HashMap();
                return;
            case 19:
                C0831kn c0831kn = new C0831kn(9);
                this.f6659o = c0831kn;
                u0.g gVar = new u0.g((u0.g) null, c0831kn);
                this.f6661q = gVar;
                this.f6660p = gVar.k();
                C1599z1 c1599z1 = new C1599z1(4);
                this.f6662r = c1599z1;
                gVar.I("require", new com.google.android.gms.internal.measurement.J3(c1599z1));
                ((HashMap) c1599z1.f12124p).put("internal.platform", CallableC1499c0.f11891a);
                gVar.I("runtime.counter", new C1518g(Double.valueOf(0.0d)));
                return;
            case 22:
                this.f6659o = new B0.r(10, 2);
                this.f6660p = new r.i(0);
                this.f6661q = new ArrayList();
                this.f6662r = new HashSet();
                return;
            default:
                this.f6659o = new Object();
                this.f6660p = new Handler(Looper.getMainLooper(), new W2.o(this));
                return;
        }
    }

    public C0326Qb(Context context, C1798a c1798a, Q1.K k3, C0356Wb c0356Wb) {
        this.f6659o = c1798a;
        AB a4 = AB.a(context);
        AB a5 = AB.a(k3);
        AB a6 = AB.a(c0356Wb);
        this.f6660p = C1414yB.b(new C0311Nb(a4, a5, a6, 0));
        AB a7 = AB.a(c1798a);
        C1414yB b4 = C1414yB.b(new C0311Nb(a7, a5, a6, 1));
        this.f6661q = b4;
        this.f6662r = C1414yB.b(new C0371Zb(a4, new C0321Pb(a7, b4), 0));
    }

    public C0326Qb(Zw zw) {
        this.f6659o = new HashMap(zw.f8065a);
        this.f6660p = new HashMap(zw.f8066b);
        this.f6661q = new HashMap(zw.c);
        this.f6662r = new HashMap(zw.d);
    }

    public C0326Qb(C1423ye c1423ye, B0.r rVar) {
        this.f6662r = c1423ye;
        this.f6659o = rVar;
        this.f6660p = C1414yB.b(new Eo(c1423ye.f11416q, 7));
        Qo qo = new Qo(rVar, 1);
        int i4 = 2;
        Qo qo2 = new Qo(rVar, i4);
        Qo qo3 = new Qo(rVar, 4);
        C0865le c0865le = c1423ye.c;
        C1414yB c1414yB = c1423ye.f11399e;
        new C1252uf(c0865le, c1414yB, qo, qo2, qo3, 15);
        Qo qo4 = new Qo(rVar, 0);
        new C0371Zb(c0865le, qo4, 25);
        C1414yB c1414yB2 = c1423ye.f11377J;
        new C0245Af(qo, c0865le, c1414yB2, c1414yB, qo4);
        new Eo(c0865le, i4);
        new Lf(17, qo4);
        new Nf(c1414yB, c0865le, 20);
        new C1252uf(c1414yB2, new Qo(rVar, 3), qo3, qo4, c1414yB);
        new C1338wf((FB) qo4, (FB) c1414yB2, c1414yB, 14);
        Qo qo5 = new Qo(rVar, 5);
        C1414yB b4 = C1414yB.b(Wj.d);
        C1414yB b5 = C1414yB.b(Wj.c);
        C1414yB b6 = C1414yB.b(Wj.f7536e);
        C1414yB b7 = C1414yB.b(Wj.f7537f);
        int i5 = BB.f4037b;
        LinkedHashMap l4 = AbstractC0587ez.l(4);
        l4.put(EnumC0877lq.f9487t, b4);
        l4.put(EnumC0877lq.f9488u, b5);
        l4.put(EnumC0877lq.f9490w, b6);
        l4.put(EnumC0877lq.y, b7);
        C1414yB b8 = C1414yB.b(new C1338wf((InterfaceC1457zB) qo5, (FB) c1423ye.c, (FB) new AbstractC1371xB(l4), 10));
        int i6 = DB.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b8);
        this.f6661q = C1414yB.b(new C0371Zb(c1423ye.f11399e, new Hg(new DB(list, arrayList), 23), 26));
    }

    public /* synthetic */ C0326Qb(C1423ye c1423ye, C0268Ee c0268Ee, Long l4, String str) {
        this.f6661q = c1423ye;
        this.f6662r = c0268Ee;
        this.f6659o = l4;
        this.f6660p = str;
    }

    public /* synthetic */ C0326Qb(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6662r = obj;
        this.f6659o = obj2;
        this.f6660p = obj3;
        this.f6661q = obj4;
    }

    public /* synthetic */ C0326Qb(Object obj, Object obj2, Object obj3, Object obj4, boolean z4) {
        this.f6659o = obj;
        this.f6660p = obj2;
        this.f6661q = obj3;
        this.f6662r = obj4;
    }

    public static JSONObject K(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", C0248Bc.h().f4084o);
            jSONObject.put("mf", N6.f6304a.r());
            jSONObject.put("cl", "579009612");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", C1893d.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static synchronized C0326Qb N(Context context) {
        synchronized (C0326Qb.class) {
            try {
                C0326Qb c0326Qb = f6657s;
                if (c0326Qb != null) {
                    return c0326Qb;
                }
                Context applicationContext = context.getApplicationContext();
                AbstractC1066q6.a(applicationContext);
                N1.n nVar = N1.n.f1204A;
                Q1.K c = nVar.f1209g.c();
                c.E(applicationContext);
                applicationContext.getClass();
                C1798a c1798a = nVar.f1212j;
                c1798a.getClass();
                C0356Wb c0356Wb = nVar.f1225w;
                AbstractC0587ez.p(c0356Wb, C0356Wb.class);
                C0326Qb c0326Qb2 = new C0326Qb(applicationContext, c1798a, c, c0356Wb);
                f6657s = c0326Qb2;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC0306Mb) ((C1414yB) c0326Qb2.f6660p).c()).a();
                ((C0316Ob) f6657s.G().f4619q).a();
                C0366Yb c0366Yb = (C0366Yb) ((C1414yB) f6657s.f6662r).c();
                C0937n6 c0937n6 = AbstractC1066q6.f10245k0;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    HashMap F2 = Q1.N.F((String) rVar.c.a(AbstractC1066q6.f10248l0));
                    Iterator it = F2.keySet().iterator();
                    while (it.hasNext()) {
                        c0366Yb.a((String) it.next());
                    }
                    c0366Yb.b(new C0361Xb(c0366Yb, F2));
                }
                return f6657s;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String W(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C1234u3 v4 = C1277v3.v();
        v4.d();
        C1277v3.y((C1277v3) v4.f4561p);
        C0800jz A3 = AbstractC0886lz.A(bArr, 0, bArr.length);
        v4.d();
        C1277v3.w((C1277v3) v4.f4561p, A3);
        return Base64.encodeToString(((C1277v3) v4.b()).e(), 11);
    }

    public static C0326Qb p() {
        if (f6658t == null) {
            f6658t = new C0326Qb(3);
        }
        return f6658t;
    }

    public Bundle A() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        x2.T t4 = (x2.T) this.f6662r;
        if (((Bundle) this.f6661q) == null) {
            String string3 = t4.k().getString((String) this.f6659o, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i4);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            x2.K k3 = ((C2066c0) t4.f1719a).f15568i;
                            C2066c0.i(k3);
                            k3.f15394f.a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode == 115 && string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        x2.K k4 = ((C2066c0) t4.f1719a).f15568i;
                        C2066c0.i(k4);
                        k4.f15394f.b(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.f6661q = bundle;
                } catch (JSONException unused2) {
                    x2.K k5 = ((C2066c0) t4.f1719a).f15568i;
                    C2066c0.i(k5);
                    k5.f15394f.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f6661q) == null) {
                this.f6661q = (Bundle) this.f6660p;
            }
        }
        return (Bundle) this.f6661q;
    }

    public C0641g9 B(Context context, C0248Bc c0248Bc, Fq fq) {
        C0641g9 c0641g9;
        synchronized (this.f6659o) {
            try {
                if (((C0641g9) this.f6661q) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f6661q = new C0641g9(context, c0248Bc, (String) O1.r.d.c.a(AbstractC1066q6.f10197a), fq);
                }
                c0641g9 = (C0641g9) this.f6661q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0641g9;
    }

    public InterfaceC1550n C(u0.g gVar, com.google.android.gms.internal.measurement.X0... x0Arr) {
        InterfaceC1550n interfaceC1550n = InterfaceC1550n.f11977e;
        for (com.google.android.gms.internal.measurement.X0 x02 : x0Arr) {
            interfaceC1550n = AbstractC1515f1.d(x02);
            AbstractC1515f1.q((u0.g) this.f6661q);
            if ((interfaceC1550n instanceof C1554o) || (interfaceC1550n instanceof C1546m)) {
                interfaceC1550n = ((C0831kn) this.f6659o).x(gVar, interfaceC1550n);
            }
        }
        return interfaceC1550n;
    }

    public void D(int i4) {
        if (i4 != 12 && i4 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i4)));
        }
        this.f6660p = Integer.valueOf(i4);
    }

    public void E(C1269uw c1269uw) {
        c1269uw.getClass();
        Xw xw = new Xw(Tw.class, c1269uw.f10954a);
        HashMap hashMap = (HashMap) this.f6660p;
        if (!hashMap.containsKey(xw)) {
            hashMap.put(xw, c1269uw);
            return;
        }
        C1269uw c1269uw2 = (C1269uw) hashMap.get(xw);
        if (!c1269uw2.equals(c1269uw) || !c1269uw.equals(c1269uw2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(xw.toString()));
        }
    }

    public C0641g9 F(Context context, C0248Bc c0248Bc, Fq fq) {
        C0641g9 c0641g9;
        synchronized (this.f6660p) {
            try {
                if (((C0641g9) this.f6662r) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f6662r = new C0641g9(context, c0248Bc, (String) X6.f7602a.r(), fq);
                }
                c0641g9 = (C0641g9) this.f6662r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0641g9;
    }

    public C0258Da G() {
        return new C0258Da(15, (C1798a) this.f6659o, (C0316Ob) ((C1414yB) this.f6661q).c());
    }

    public void H(int i4) {
        if (i4 != 16 && i4 != 24 && i4 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i4)));
        }
        this.f6659o = Integer.valueOf(i4);
    }

    public void I(Bundle bundle) {
        String str = (String) this.f6659o;
        x2.T t4 = (x2.T) this.f6662r;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = t4.k().edit();
        if (bundle.size() == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            x2.K k3 = ((C2066c0) t4.f1719a).f15568i;
                            C2066c0.i(k3);
                            k3.f15394f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e4) {
                        x2.K k4 = ((C2066c0) t4.f1719a).f15568i;
                        C2066c0.i(k4);
                        k4.f15394f.b(e4, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f6661q = bundle;
    }

    public void J(C1355ww c1355ww) {
        Yw yw = new Yw(c1355ww.f11222a, Tw.class);
        HashMap hashMap = (HashMap) this.f6659o;
        if (!hashMap.containsKey(yw)) {
            hashMap.put(yw, c1355ww);
            return;
        }
        C1355ww c1355ww2 = (C1355ww) hashMap.get(yw);
        if (!c1355ww2.equals(c1355ww) || !c1355ww.equals(c1355ww2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(yw.toString()));
        }
    }

    public void L() {
        this.f6661q = 16;
    }

    public void M(Jw jw) {
        jw.getClass();
        Xw xw = new Xw(Uw.class, jw.f5940a);
        HashMap hashMap = (HashMap) this.f6662r;
        if (!hashMap.containsKey(xw)) {
            hashMap.put(xw, jw);
            return;
        }
        Jw jw2 = (Jw) hashMap.get(xw);
        if (!jw2.equals(jw) || !jw.equals(jw2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(xw.toString()));
        }
    }

    public synchronized void O(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.f6659o.getClass().getDeclaredMethod("he", Map.class).invoke(this.f6659o, hashMap);
            ((B0.c) this.f6662r).e(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e4) {
            throw new Mr(2005, e4);
        }
    }

    public void P(Lw lw) {
        Yw yw = new Yw(lw.f6183a, Uw.class);
        HashMap hashMap = (HashMap) this.f6661q;
        if (!hashMap.containsKey(yw)) {
            hashMap.put(yw, lw);
            return;
        }
        Lw lw2 = (Lw) hashMap.get(yw);
        if (!lw2.equals(lw) || !lw.equals(lw2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(yw.toString()));
        }
    }

    public synchronized int Q() {
        try {
        } catch (Exception e4) {
            throw new Mr(2006, e4);
        }
        return ((Integer) this.f6659o.getClass().getDeclaredMethod("lcs", null).invoke(this.f6659o, null)).intValue();
    }

    public Ov R() {
        Integer num = (Integer) this.f6659o;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f6660p) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f6661q) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = ((Integer) this.f6660p).intValue();
        ((Integer) this.f6661q).getClass();
        return new Ov(intValue, intValue2, (Iv) this.f6662r);
    }

    public C1074qE S(C1074qE c1074qE, C1202tE c1202tE) {
        AbstractC0773jE abstractC0773jE = (AbstractC0773jE) this.f6662r;
        Object obj = this.f6659o;
        long j4 = c1074qE.c;
        abstractC0773jE.v(j4, obj);
        long j5 = c1074qE.d;
        abstractC0773jE.v(j5, obj);
        return (j4 == c1074qE.c && j5 == c1074qE.d) ? c1074qE : new C1074qE(c1074qE.f10333a, c1074qE.f10334b, j4, j5);
    }

    public synchronized void T() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f6659o.getClass().getDeclaredMethod("close", null).invoke(this.f6659o, null);
            ((B0.c) this.f6662r).e(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e4) {
            throw new Mr(2003, e4);
        }
    }

    public boolean U(C1202tE c1202tE) {
        C1202tE c1202tE2;
        Object obj = this.f6659o;
        AbstractC0773jE abstractC0773jE = (AbstractC0773jE) this.f6662r;
        if (c1202tE != null) {
            c1202tE2 = abstractC0773jE.w(obj, c1202tE);
            if (c1202tE2 == null) {
                return false;
            }
        } else {
            c1202tE2 = null;
        }
        abstractC0773jE.u(obj);
        C0831kn c0831kn = (C0831kn) this.f6660p;
        c0831kn.getClass();
        if (!AbstractC0751is.c((C1202tE) c0831kn.f9319p, c1202tE2)) {
            this.f6660p = new C0831kn((CopyOnWriteArrayList) abstractC0773jE.c.f9320q, c1202tE2, 8, false);
        }
        Qw qw = (Qw) this.f6661q;
        qw.getClass();
        if (AbstractC0751is.c((C1202tE) qw.f6710p, c1202tE2)) {
            return true;
        }
        this.f6661q = new Qw(4, (CopyOnWriteArrayList) abstractC0773jE.d.f6711q, c1202tE2);
        return true;
    }

    public synchronized boolean V() {
        try {
        } catch (Exception e4) {
            throw new Mr(2001, e4);
        }
        return ((Boolean) this.f6659o.getClass().getDeclaredMethod("init", null).invoke(this.f6659o, null)).booleanValue();
    }

    public synchronized byte[] X(HashMap hashMap) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e4) {
            ((B0.c) this.f6662r).d(2007, System.currentTimeMillis() - currentTimeMillis, e4);
            return null;
        }
        return (byte[]) this.f6659o.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f6659o, null, hashMap);
    }

    @Override // n3.InterfaceC1815b
    public Object a(Class cls) {
        if (!((Set) this.f6659o).contains(n3.q.a(cls))) {
            throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a4 = ((InterfaceC1815b) this.f6662r).a(cls);
        if (!cls.equals(InterfaceC2015a.class)) {
            return a4;
        }
        return new Object();
    }

    @Override // n3.InterfaceC1815b
    public Set b(n3.q qVar) {
        if (((Set) this.f6661q).contains(qVar)) {
            return ((InterfaceC1815b) this.f6662r).b(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public void c(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE) {
        if (U(c1202tE)) {
            ((C0831kn) this.f6660p).H(c0859lE, S(c1074qE, c1202tE));
        }
    }

    @Override // n3.InterfaceC1815b
    public Object d(n3.q qVar) {
        if (((Set) this.f6659o).contains(qVar)) {
            return ((InterfaceC1815b) this.f6662r).d(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // n3.InterfaceC1815b
    public InterfaceC2053a e(Class cls) {
        return f(n3.q.a(cls));
    }

    @Override // n3.InterfaceC1815b
    public InterfaceC2053a f(n3.q qVar) {
        if (((Set) this.f6660p).contains(qVar)) {
            return ((InterfaceC1815b) this.f6662r).f(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public void g(int i4, C1202tE c1202tE, C1074qE c1074qE) {
        if (U(c1202tE)) {
            ((C0831kn) this.f6660p).C(S(c1074qE, c1202tE));
        }
    }

    @Override // I3.a
    public Object get() {
        return new u0.g((Executor) ((I3.a) this.f6659o).get(), (D1.d) ((I3.a) this.f6660p).get(), (q2.e) ((q2.e) this.f6661q).get(), (E1.c) ((I3.a) this.f6662r).get(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public void h(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE) {
        if (U(c1202tE)) {
            ((C0831kn) this.f6660p).D(c0859lE, S(c1074qE, c1202tE));
        }
    }

    public boolean i(W2.p pVar, int i4) {
        W2.f fVar = (W2.f) pVar.f2057a.get();
        if (fVar == null) {
            return false;
        }
        ((Handler) this.f6660p).removeCallbacksAndMessages(pVar);
        Handler handler = W2.l.f2040n;
        handler.sendMessage(handler.obtainMessage(1, i4, 0, fVar.f2030a));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723i5
    public void j(F5 f5) {
        C0850l5 c0850l5 = (C0850l5) ((G5) f5.f4561p).v().h();
        EnumC0807k5 enumC0807k5 = (EnumC0807k5) this.f6659o;
        c0850l5.d();
        C0893m5.x((C0893m5) c0850l5.f4561p, enumC0807k5);
        f5.d();
        G5.D((G5) f5.f4561p, (C0893m5) c0850l5.b());
        B5 b5 = (B5) ((G5) f5.f4561p).w().h();
        String str = (String) this.f6660p;
        b5.d();
        C5.w((C5) b5.f4561p, str);
        Y5 y5 = (Y5) this.f6661q;
        b5.d();
        C5.x((C5) b5.f4561p, y5);
        f5.d();
        G5.C((G5) f5.f4561p, (C5) b5.b());
        String str2 = (String) this.f6662r;
        f5.d();
        G5.z((G5) f5.f4561p, str2);
    }

    public void k(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((r.i) this.f6660p).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                k(arrayList2.get(i4), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        Bm bm = (Bm) this.f6659o;
        return ((InterfaceC1002om) bm.c).a((Ep) this.f6660p, (C1434yp) this.f6661q, (C0873lm) this.f6662r);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public void m(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE, IOException iOException, boolean z4) {
        if (U(c1202tE)) {
            ((C0831kn) this.f6660p).F(c0859lE, S(c1074qE, c1202tE), iOException, z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public void n(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE) {
        if (U(c1202tE)) {
            ((C0831kn) this.f6660p).E(c0859lE, S(c1074qE, c1202tE));
        }
    }

    public C1723e o(AbstractC1719a abstractC1719a) {
        ArrayList arrayList = (ArrayList) this.f6661q;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1723e c1723e = (C1723e) arrayList.get(i4);
            if (c1723e != null && c1723e.f13283b == abstractC1719a) {
                return c1723e;
            }
        }
        C1723e c1723e2 = new C1723e((Context) this.f6660p, abstractC1719a);
        arrayList.add(c1723e2);
        return c1723e2;
    }

    public boolean q(W2.f fVar) {
        W2.p pVar = (W2.p) this.f6661q;
        return (pVar == null || fVar == null || pVar.f2057a.get() != fVar) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        C0567ef c0567ef;
        Oq oq = (Oq) this.f6661q;
        String str = (String) obj;
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f6659o;
        if (interfaceC0308Md.x().f11515i0) {
            N1.n nVar = N1.n.f1204A;
            nVar.f1212j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = interfaceC0308Md.W().f3998b;
            int i4 = 2;
            if (!nVar.f1209g.j(interfaceC0308Md.getContext())) {
                if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.w5)).booleanValue() || !interfaceC0308Md.x().f11492S) {
                    i4 = 1;
                }
            }
            ((Xl) this.f6662r).b(new N2(currentTimeMillis, str2, str, i4));
            return;
        }
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.G8)).booleanValue() || (c0567ef = (C0567ef) this.f6660p) == null) {
            oq.a(str, null);
            return;
        }
        Random random = C0081p.f1374f.f1377e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        InterfaceFutureC0239a o02 = Bs.o0(c0567ef.b(str, c0567ef.d.f6679a, random), ((Integer) r1.c.a(AbstractC1066q6.N8)).intValue(), TimeUnit.MILLISECONDS, c0567ef.f8627g);
        o02.a(new Nu(0, o02, new Op(c0567ef, oq, str, 7)), c0567ef.f8625e);
    }

    public boolean s(AbstractC1719a abstractC1719a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f6659o).onActionItemClicked(o(abstractC1719a), new k.u((Context) this.f6660p, (C.a) menuItem));
    }

    public boolean t(AbstractC1719a abstractC1719a, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f6659o;
        C1723e o4 = o(abstractC1719a);
        r.i iVar = (r.i) this.f6662r;
        Menu menu2 = (Menu) iVar.get(menu);
        if (menu2 == null) {
            menu2 = new MenuC1742C((Context) this.f6660p, (k.m) menu);
            iVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(o4, menu2);
    }

    public void u(W2.f fVar) {
        synchronized (this.f6659o) {
            try {
                if (q(fVar)) {
                    W2.p pVar = (W2.p) this.f6661q;
                    if (!pVar.c) {
                        pVar.c = true;
                        ((Handler) this.f6660p).removeCallbacksAndMessages(pVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(W2.f fVar) {
        synchronized (this.f6659o) {
            try {
                if (q(fVar)) {
                    W2.p pVar = (W2.p) this.f6661q;
                    if (pVar.c) {
                        pVar.c = false;
                        w(pVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(W2.p pVar) {
        Handler handler = (Handler) this.f6660p;
        int i4 = pVar.f2058b;
        if (i4 == -2) {
            return;
        }
        if (i4 <= 0) {
            i4 = i4 == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(pVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, pVar), i4);
    }

    public Set x(Class cls) {
        return b(n3.q.a(cls));
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
    }

    public void z() {
        W2.p pVar = (W2.p) this.f6662r;
        if (pVar != null) {
            this.f6661q = pVar;
            this.f6662r = null;
            W2.f fVar = (W2.f) pVar.f2057a.get();
            if (fVar == null) {
                this.f6661q = null;
            } else {
                Handler handler = W2.l.f2040n;
                handler.sendMessage(handler.obtainMessage(0, fVar.f2030a));
            }
        }
    }
}
