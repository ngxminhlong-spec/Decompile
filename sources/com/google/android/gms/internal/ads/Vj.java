package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Vj {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f7272a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f7273b;
    public final Executor c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f7274e;

    public Vj(C0260Dc c0260Dc) {
        this.c = c0260Dc;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.d = true;
            C0949nc x4 = N1.n.f1204A.f1209g.c().x();
            if (x4 != null && (jSONObject = x4.f9737g) != null) {
                this.f7273b = ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10302w3)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f7274e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                if (this.f7272a.containsKey(optString2)) {
                                    map = (Map) this.f7272a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f7272a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }
}
