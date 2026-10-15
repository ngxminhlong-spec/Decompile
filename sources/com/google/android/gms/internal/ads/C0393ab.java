package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ab, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393ab {

    /* renamed from: a, reason: collision with root package name */
    public final List f8115a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8116b;
    public final String c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8117e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8118f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8119g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f8120h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8121i;

    public C0393ab(JSONObject jSONObject) {
        this.f8118f = jSONObject.optString("url");
        this.f8116b = jSONObject.optString("base_uri");
        this.c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        this.d = optString != null && (optString.equals("1") || optString.equals("true"));
        String optString2 = jSONObject.optString("cookies_include", "true");
        this.f8117e = optString2 != null && (optString2.equals("1") || optString2.equals("true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString3 = jSONObject.optString("errors");
        this.f8115a = optString3 == null ? null : Arrays.asList(optString3.split(","));
        this.f8119g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f8120h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f8121i = jSONObject.optString("pool_key");
    }
}
