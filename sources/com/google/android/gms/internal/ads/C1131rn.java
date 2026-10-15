package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1131rn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10523a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10524b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f10525e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Executor f10526f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f10527g;

    public C1131rn(C0260Dc c0260Dc) {
        this.f10526f = c0260Dc;
    }

    public static final Bundle k(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized HashMap a(String str, String str2) {
        HashMap hashMap;
        try {
            Lt b4 = b(str, str2);
            Lt e4 = e(str2);
            hashMap = new HashMap();
            Iterator it = ((It) b4.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                if (e4.containsKey(str3)) {
                    C1260un c1260un = (C1260un) e4.get(str3);
                    List list = (List) entry.getValue();
                    hashMap.put(str3, new C1260un(str3, c1260un.f10940b, c1260un.c, c1260un.d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            Tt l4 = e4.entrySet().l();
            while (l4.hasNext()) {
                Map.Entry entry2 = (Map.Entry) l4.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((C1260un) entry2.getValue()).d) {
                    hashMap.put(str4, (C1260un) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized Lt b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(N1.n.f1204A.f1209g.c().x().f9735e) && (map = (Map) this.c.get(str)) != null) {
                List<C1174sn> list = (List) map.get(str2);
                if (list == null) {
                    String j4 = Zf.j(this.f10527g, str2, str);
                    if (((Boolean) O1.r.d.c.a(AbstractC1066q6.i9)).booleanValue()) {
                        j4 = j4.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(j4);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (C1174sn c1174sn : list) {
                        String str3 = c1174sn.f10634a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(c1174sn.f10635b);
                    }
                    return Lt.a(hashMap);
                }
            }
            return Lt.f6175u;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Lt c() {
        if (TextUtils.isEmpty(N1.n.f1204A.f1209g.c().x().f9735e)) {
            return Lt.f6175u;
        }
        return Lt.a(this.f10524b);
    }

    public final synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !this.f10523a.containsKey(str)) {
            this.f10523a.put(str, new C1174sn(new Bundle(), str));
        }
    }

    public final synchronized Lt e(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(N1.n.f1204A.f1209g.c().x().f9735e)) {
                C0937n6 c0937n6 = AbstractC1066q6.F2;
                O1.r rVar = O1.r.d;
                boolean matches = Pattern.matches((String) rVar.c.a(c0937n6), str);
                boolean matches2 = Pattern.matches((String) rVar.c.a(AbstractC1066q6.f10109G2), str);
                if (matches) {
                    hashMap = new HashMap(this.f10525e);
                } else if (matches2) {
                    hashMap = new HashMap(this.d);
                }
                return Lt.a(hashMap);
            }
            return Lt.f6175u;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList f(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle k3 = k(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                        String optString = optJSONArray.optString(i4, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList2.get(i5);
                        d(str);
                        if (((C1174sn) this.f10523a.get(str)) != null) {
                            arrayList.add(new C1174sn(k3, str));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void g() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) T6.f7046b.r()).booleanValue()) {
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10314z1)).booleanValue() && (jSONObject = N1.n.f1204A.f1209g.c().x().f9737g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        String optString = jSONObject2.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString)) {
                            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                JSONObject jSONObject3 = optJSONArray.getJSONObject(i5);
                                boolean optBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject3.optString("platform");
                                C1260un c1260un = new C1260un(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.d.put(optString, c1260un);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.f10525e.put(optString, c1260un);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e4) {
            Q1.I.x("Malformed config loading JSON.", e4);
        } finally {
        }
    }

    public final synchronized void h(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.c.put(str, map);
            List list = (List) map.get(str2);
            if (list == null) {
                list = new ArrayList();
            }
            list.addAll(arrayList);
            map.put(str2, list);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i() {
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = N1.n.f1204A.f1209g.c().x().f9737g;
            if (jSONObject != null) {
                try {
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f10527g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i4);
                            String lowerCase = ((Boolean) O1.r.d.c.a(AbstractC1066q6.i9)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                            String optString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                    arrayList.addAll(f(optJSONArray.getJSONObject(i5)));
                                }
                            }
                            h(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e4) {
                    Q1.I.x("Malformed config loading JSON.", e4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        JSONObject jSONObject;
        if (!((Boolean) T6.f7047e.r()).booleanValue()) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10309y1)).booleanValue() && (jSONObject = N1.n.f1204A.f1209g.c().x().f9737g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        Bundle k3 = k(jSONObject2.optJSONObject("data"));
                        String optString = jSONObject2.optString("adapter_class_name");
                        boolean optBoolean = jSONObject2.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f10524b.put(optString, new C1260un(optString, optBoolean2, optBoolean, true, k3));
                        }
                    }
                } catch (JSONException e4) {
                    Q1.I.x("Malformed config loading JSON.", e4);
                }
            }
        }
    }
}
