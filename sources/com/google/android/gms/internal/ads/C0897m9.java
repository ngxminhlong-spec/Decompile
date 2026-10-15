package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.m9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0897m9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f9569a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9570b;
    public final String c;

    public C0897m9(JSONObject jSONObject) {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(jSONArray.getString(i4));
        }
        this.f9569a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        C1016p c1016p = N1.n.f1204A.f1222t;
        C1016p.n("clickurl", jSONObject);
        C1016p.n("imp_urls", jSONObject);
        C1016p.n("downloaded_imp_urls", jSONObject);
        C1016p.n("fill_urls", jSONObject);
        C1016p.n("video_start_urls", jSONObject);
        C1016p.n("video_complete_urls", jSONObject);
        C1016p.n("video_reward_urls", jSONObject);
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            C1016p.n("manual_impression_urls", optJSONObject);
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f9570b = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        C1016p.n("template_ids", jSONObject);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
