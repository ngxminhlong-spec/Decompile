package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.n9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940n9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f9717a;

    public C0940n9(JSONObject jSONObject) {
        if (Y9.v(2)) {
            Q1.I.w("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i4 = -1;
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                C0897m9 c0897m9 = new C0897m9(jSONArray.getJSONObject(i5));
                "banner".equalsIgnoreCase(c0897m9.c);
                arrayList.add(c0897m9);
                if (i4 < 0) {
                    Iterator it = c0897m9.f9569a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i4 = i5;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f9717a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            C1016p c1016p = N1.n.f1204A.f1222t;
            C1016p.n("click_urls", optJSONObject);
            C1016p.n("imp_urls", optJSONObject);
            C1016p.n("downloaded_imp_urls", optJSONObject);
            C1016p.n("nofill_urls", optJSONObject);
            C1016p.n("remote_ping_urls", optJSONObject);
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            C0948nb.h(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
