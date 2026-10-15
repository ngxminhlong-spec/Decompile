package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016p implements r, D, A1, Iz, M1.a, InterfaceC0282Hc, InterfaceC0513d9, InterfaceC0555e9, S1.b, U1.b, InterfaceC0280Ha, InterfaceC1292vc, Mu, InterfaceC0277Gc {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9873o;

    public /* synthetic */ C1016p(int i4) {
        this.f9873o = i4;
    }

    public /* synthetic */ C1016p(int i4, Object obj) {
        this.f9873o = i4;
    }

    private final void i() {
    }

    private final void j(P p3) {
    }

    public static final C0594f5 k(Context context, C0509d5 c0509d5) {
        A2.o oVar = new A2.o(context, 4);
        C0594f5 c0594f5 = new C0594f5(oVar);
        Op op = new Op(oVar, c0509d5, c0594f5, 3);
        C0258Da c0258Da = new C0258Da(oVar, c0594f5, 13, false);
        synchronized (oVar.f36q) {
            C0466c5 c0466c5 = new C0466c5(context, N1.n.f1204A.f1220r.b(), op, c0258Da);
            oVar.f37r = c0466c5;
            c0466c5.n();
        }
        return c0594f5;
    }

    public static final void m(C1151s6 c1151s6, C0326Qb c0326Qb) {
        File externalStorageDirectory;
        Context context = (Context) c0326Qb.f6661q;
        String str = (String) c0326Qb.f6662r;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        String str2 = (String) c0326Qb.f6659o;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0326Qb.f6660p;
        HashMap hashMap = (HashMap) c1151s6.c;
        c1151s6.f10580f = context;
        c1151s6.f10579e = str;
        c1151s6.d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c1151s6.f10582h = atomicBoolean;
        atomicBoolean.set(((Boolean) I6.c.r()).booleanValue());
        if (((AtomicBoolean) c1151s6.f10582h).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            c1151s6.f10583i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) c1151s6.f10578b).put((String) entry.getKey(), (String) entry.getValue());
        }
        AbstractC0266Ec.f4897a.execute(new D3(8, c1151s6));
        C1194t6 c1194t6 = C1194t6.c;
        hashMap.put("action", c1194t6);
        hashMap.put("ad_format", c1194t6);
        hashMap.put("e", C1194t6.d);
    }

    public static final void n(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                arrayList.add(optJSONArray.getString(i4));
            }
            Collections.unmodifiableList(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.ads.D
    public void B(P p3) {
        switch (this.f9873o) {
            case 1:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.ads.A1
    public P a() {
        return new G(-9223372036854775807L, 0L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0277Gc
    /* renamed from: b */
    public void mo1b() {
    }

    @Override // com.google.android.gms.internal.ads.A1
    public void c(long j4) {
    }

    @Override // com.google.android.gms.internal.ads.r
    public long d(long j4) {
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.A1
    public long e(C c) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0513d9
    public /* bridge */ /* synthetic */ Object f(JSONObject jSONObject) {
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0280Ha
    public void g(String str, Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0280Ha
    public void h(Throwable th, String str, float f4) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0282Hc, com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        switch (this.f9873o) {
            case 12:
                Q1.I.w("Ending javascript session.");
                C0428b9 c0428b9 = (C0428b9) ((InterfaceC0385a9) obj);
                HashSet hashSet = c0428b9.f8215p;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    Q1.I.w("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC0597f8) simpleEntry.getValue()).toString())));
                    c0428b9.f8214o.e((String) simpleEntry.getKey(), (InterfaceC0597f8) simpleEntry.getValue());
                }
                hashSet.clear();
                return;
            default:
                AbstractC0266Ec.f4899e.execute(new P8((M8) obj, 2));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292vc
    public boolean o(String str) {
        new L1.c(1, str).start();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0555e9
    public /* bridge */ /* synthetic */ JSONObject r(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.D
    public void x() {
        switch (this.f9873o) {
            case 1:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        N1.n.f1204A.f1209g.g("ActiveViewListener.callActiveViewJs", th);
    }

    @Override // com.google.android.gms.internal.ads.D
    public V z(int i4, int i5) {
        switch (this.f9873o) {
            case 1:
                return new A();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
