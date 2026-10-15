package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Cp {

    /* renamed from: a, reason: collision with root package name */
    public final String f4551a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4552b;
    public final JSONObject c;
    public final JSONObject d;

    public Cp(JsonReader jsonReader) {
        JSONObject E4 = android.support.v4.media.session.a.E(jsonReader);
        this.d = E4;
        this.f4551a = E4.optString("ad_html", null);
        this.f4552b = E4.optString("ad_base_url", null);
        this.c = E4.optJSONObject("ad_json");
    }
}
