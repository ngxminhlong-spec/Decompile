package com.google.android.gms.internal.ads;

import O1.C0056c0;
import O1.InterfaceC0060e0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Wi implements Fi {

    /* renamed from: a, reason: collision with root package name */
    public final B9 f7513a;

    /* renamed from: b, reason: collision with root package name */
    public final Qg f7514b;
    public final Gg c;
    public final Rh d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f7515e;

    /* renamed from: f, reason: collision with root package name */
    public final C1434yp f7516f;

    /* renamed from: g, reason: collision with root package name */
    public final C0248Bc f7517g;

    /* renamed from: h, reason: collision with root package name */
    public final Jp f7518h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7519i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7520j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7521k = true;

    /* renamed from: l, reason: collision with root package name */
    public final C1412y9 f7522l;

    /* renamed from: m, reason: collision with root package name */
    public final C1455z9 f7523m;

    public Wi(C1412y9 c1412y9, C1455z9 c1455z9, B9 b9, Qg qg, Gg gg, Rh rh, Context context, C1434yp c1434yp, C0248Bc c0248Bc, Jp jp) {
        this.f7522l = c1412y9;
        this.f7523m = c1455z9;
        this.f7513a = b9;
        this.f7514b = qg;
        this.c = gg;
        this.d = rh;
        this.f7515e = context;
        this.f7516f = c1434yp;
        this.f7517g = c0248Bc;
        this.f7518h = jp;
    }

    public static final HashMap v(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void C() {
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final boolean G() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void N(String str) {
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void c(View view, MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void d(C0056c0 c0056c0) {
        Y9.s("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final JSONObject e(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void h(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType, int i4) {
        if (!this.f7520j) {
            Y9.s("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f7516f.f11486L) {
            u(view2);
        } else {
            Y9.s("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void i(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f7519i) {
                this.f7519i = N1.n.f1204A.f1215m.l(this.f7515e, this.f7517g.f4084o, this.f7516f.f11477C.toString(), this.f7518h.f5911f);
            }
            if (this.f7521k) {
                B9 b9 = this.f7513a;
                Qg qg = this.f7514b;
                if (b9 != null && !b9.z()) {
                    b9.w();
                    qg.b();
                    return;
                }
                C1412y9 c1412y9 = this.f7522l;
                if (c1412y9 != null) {
                    Parcel q12 = c1412y9.q1(c1412y9.Q(), 13);
                    ClassLoader classLoader = AbstractC1192t4.f10673a;
                    boolean z4 = q12.readInt() != 0;
                    q12.recycle();
                    if (!z4) {
                        c1412y9.G1(c1412y9.Q(), 10);
                        qg.b();
                        return;
                    }
                }
                C1455z9 c1455z9 = this.f7523m;
                if (c1455z9 != null) {
                    Parcel q13 = c1455z9.q1(c1455z9.Q(), 11);
                    ClassLoader classLoader2 = AbstractC1192t4.f10673a;
                    boolean z5 = q13.readInt() != 0;
                    q13.recycle();
                    if (z5) {
                        return;
                    }
                    c1455z9.G1(c1455z9.Q(), 8);
                    qg.b();
                }
            }
        } catch (RemoteException e4) {
            Y9.t("Failed to call recordImpression", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final boolean j(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void k(View view) {
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void l(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        InterfaceC1812a m4;
        try {
            BinderC1813b binderC1813b = new BinderC1813b(view);
            JSONObject jSONObject = this.f7516f.f11517j0;
            boolean booleanValue = ((Boolean) O1.r.d.c.a(AbstractC1066q6.k1)).booleanValue();
            B9 b9 = this.f7513a;
            C1455z9 c1455z9 = this.f7523m;
            C1412y9 c1412y9 = this.f7522l;
            boolean z4 = true;
            if (booleanValue && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10249l1)).booleanValue() && next.equals("3010")) {
                                Object obj2 = null;
                                if (b9 != null) {
                                    try {
                                        m4 = b9.m();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    m4 = c1412y9 != null ? c1412y9.W2() : c1455z9 != null ? c1455z9.W2() : null;
                                }
                                if (m4 != null) {
                                    obj2 = BinderC1813b.C2(m4);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                android.support.v4.media.session.a.z(optJSONArray, arrayList);
                                Q1.N n4 = N1.n.f1204A.c;
                                ClassLoader classLoader = this.f7515e.getClassLoader();
                                int size = arrayList.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    Object obj3 = arrayList.get(i4);
                                    i4++;
                                    if (Class.forName((String) obj3, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z4 = false;
                        break loop0;
                    }
                }
            }
            this.f7521k = z4;
            HashMap v4 = v(map);
            HashMap v5 = v(map2);
            if (b9 != null) {
                b9.b3(binderC1813b, new BinderC1813b(v4), new BinderC1813b(v5));
                return;
            }
            if (c1412y9 != null) {
                BinderC1813b binderC1813b2 = new BinderC1813b(v4);
                BinderC1813b binderC1813b3 = new BinderC1813b(v5);
                Parcel Q3 = c1412y9.Q();
                AbstractC1192t4.e(Q3, binderC1813b);
                AbstractC1192t4.e(Q3, binderC1813b2);
                AbstractC1192t4.e(Q3, binderC1813b3);
                c1412y9.G1(Q3, 22);
                Parcel Q4 = c1412y9.Q();
                AbstractC1192t4.e(Q4, binderC1813b);
                c1412y9.G1(Q4, 12);
                return;
            }
            if (c1455z9 != null) {
                BinderC1813b binderC1813b4 = new BinderC1813b(v4);
                BinderC1813b binderC1813b5 = new BinderC1813b(v5);
                Parcel Q5 = c1455z9.Q();
                AbstractC1192t4.e(Q5, binderC1813b);
                AbstractC1192t4.e(Q5, binderC1813b4);
                AbstractC1192t4.e(Q5, binderC1813b5);
                c1455z9.G1(Q5, 22);
                Parcel Q6 = c1455z9.Q();
                AbstractC1192t4.e(Q6, binderC1813b);
                c1455z9.G1(Q6, 10);
            }
        } catch (RemoteException e4) {
            Y9.t("Failed to call trackView", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void m(View view) {
        try {
            BinderC1813b binderC1813b = new BinderC1813b(view);
            B9 b9 = this.f7513a;
            if (b9 != null) {
                b9.I3(binderC1813b);
                return;
            }
            C1412y9 c1412y9 = this.f7522l;
            if (c1412y9 != null) {
                Parcel Q3 = c1412y9.Q();
                AbstractC1192t4.e(Q3, binderC1813b);
                c1412y9.G1(Q3, 16);
            } else {
                C1455z9 c1455z9 = this.f7523m;
                if (c1455z9 != null) {
                    Parcel Q4 = c1455z9.Q();
                    AbstractC1192t4.e(Q4, binderC1813b);
                    c1455z9.G1(Q4, 14);
                }
            }
        } catch (RemoteException e4) {
            Y9.t("Failed to call untrackView", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void n(InterfaceC0060e0 interfaceC0060e0) {
        Y9.s("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void p(R7 r7) {
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final JSONObject q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void r(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType) {
        if (this.f7520j && this.f7516f.f11486L) {
            return;
        }
        u(view);
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void s(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final void t() {
        this.f7520j = true;
    }

    public final void u(View view) {
        B9 b9 = this.f7513a;
        Rh rh = this.d;
        Gg gg = this.c;
        if (b9 != null) {
            try {
                if (!b9.G()) {
                    b9.I2(new BinderC1813b(view));
                    gg.D();
                    if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f9)).booleanValue()) {
                        rh.G0();
                        return;
                    }
                    return;
                }
            } catch (RemoteException e4) {
                Y9.t("Failed to call handleClick", e4);
                return;
            }
        }
        C1412y9 c1412y9 = this.f7522l;
        if (c1412y9 != null) {
            Parcel q12 = c1412y9.q1(c1412y9.Q(), 14);
            ClassLoader classLoader = AbstractC1192t4.f10673a;
            boolean z4 = q12.readInt() != 0;
            q12.recycle();
            if (!z4) {
                BinderC1813b binderC1813b = new BinderC1813b(view);
                Parcel Q3 = c1412y9.Q();
                AbstractC1192t4.e(Q3, binderC1813b);
                c1412y9.G1(Q3, 11);
                gg.D();
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f9)).booleanValue()) {
                    rh.G0();
                    return;
                }
                return;
            }
        }
        C1455z9 c1455z9 = this.f7523m;
        if (c1455z9 != null) {
            Parcel q13 = c1455z9.q1(c1455z9.Q(), 12);
            ClassLoader classLoader2 = AbstractC1192t4.f10673a;
            boolean z5 = q13.readInt() != 0;
            q13.recycle();
            if (z5) {
                return;
            }
            BinderC1813b binderC1813b2 = new BinderC1813b(view);
            Parcel Q4 = c1455z9.Q();
            AbstractC1192t4.e(Q4, binderC1813b2);
            c1455z9.G1(Q4, 9);
            gg.D();
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f9)).booleanValue()) {
                rh.G0();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Fi
    public final boolean z() {
        return this.f7516f.f11486L;
    }
}
