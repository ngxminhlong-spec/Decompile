package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878lr {

    /* renamed from: g, reason: collision with root package name */
    public static final C0878lr f9494g = new C0878lr();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f9495h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f9496i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC0286Ib f9497j = new RunnableC0286Ib(6);

    /* renamed from: k, reason: collision with root package name */
    public static final RunnableC0286Ib f9498k = new RunnableC0286Ib(7);

    /* renamed from: f, reason: collision with root package name */
    public long f9502f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9499a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9500b = new ArrayList();
    public final Fm d = new Fm();
    public final Wl c = new Wl(4, (byte) 0);

    /* renamed from: e, reason: collision with root package name */
    public final C0831kn f9501e = new C0831kn(3, new Op(28));

    public static void b() {
        if (f9496i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f9496i = handler;
            handler.post(f9497j);
            f9496i.postDelayed(f9498k, 200L);
        }
    }

    public final void a(View view, C1384xi c1384xi, JSONObject jSONObject, boolean z4) {
        Object obj;
        boolean z5;
        int i4;
        if (Zf.x(view) == null) {
            Fm fm = this.d;
            char c = ((HashSet) fm.f5079s).contains(view) ? (char) 1 : fm.f5075o ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            JSONObject J4 = c1384xi.J(view);
            AbstractC0750ir.b(jSONObject, J4);
            HashMap hashMap = (HashMap) fm.f5076p;
            if (hashMap.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) hashMap.get(view);
                if (obj2 != null) {
                    hashMap.remove(view);
                }
                obj = obj2;
            }
            boolean z6 = false;
            if (obj != null) {
                try {
                    J4.put("adSessionId", obj);
                } catch (JSONException e4) {
                    Zf.q("Error with setting ad session id", e4);
                }
                WeakHashMap weakHashMap = (WeakHashMap) fm.f5083w;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z6 = true;
                }
                try {
                    J4.put("hasWindowFocus", Boolean.valueOf(z6));
                } catch (JSONException e5) {
                    Zf.q("Error with setting has window focus", e5);
                }
                fm.f5075o = true;
                return;
            }
            HashMap hashMap2 = (HashMap) fm.f5077q;
            C0792jr c0792jr = (C0792jr) hashMap2.get(view);
            if (c0792jr != null) {
                hashMap2.remove(view);
            }
            if (c0792jr != null) {
                C0494cr c0494cr = c0792jr.f9221a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = c0792jr.f9222b;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    jSONArray.put((String) arrayList.get(i5));
                }
                try {
                    J4.put("isFriendlyObstructionFor", jSONArray);
                    J4.put("friendlyObstructionClass", c0494cr.f8420b);
                    J4.put("friendlyObstructionPurpose", c0494cr.c);
                    J4.put("friendlyObstructionReason", c0494cr.d);
                } catch (JSONException e6) {
                    Zf.q("Error with setting friendly obstruction", e6);
                }
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z7 = z4 || z5;
            boolean z8 = c == 1;
            c1384xi.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z8) {
                    for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                        a(viewGroup.getChildAt(i6), c1384xi, J4, z7);
                    }
                    return;
                }
                HashMap hashMap3 = new HashMap();
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    ArrayList arrayList2 = (ArrayList) hashMap3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hashMap3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(hashMap3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i8 = 0;
                while (i8 < size2) {
                    ArrayList arrayList4 = (ArrayList) hashMap3.get((Float) arrayList3.get(i8));
                    int size3 = arrayList4.size();
                    int i9 = 0;
                    while (true) {
                        i4 = i8 + 1;
                        if (i9 < size3) {
                            a((View) arrayList4.get(i9), c1384xi, J4, z7);
                            i9++;
                        }
                    }
                    i8 = i4;
                }
            }
        }
    }
}
