package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949nc {
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f9735e;

    /* renamed from: f, reason: collision with root package name */
    public long f9736f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f9737g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9738h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9740j;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9733a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9734b = new ArrayList();
    public final HashMap c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9739i = new ArrayList();

    public C0949nc(String str, long j4) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.d = "";
        this.f9738h = false;
        this.f9740j = false;
        this.f9735e = str;
        this.f9736f = j4;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f9737g = new JSONObject(str);
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.S9)).booleanValue() && a()) {
                return;
            }
            if (this.f9737g.optInt("status", -1) != 1) {
                this.f9738h = false;
                Y9.s("App settings could not be fetched successfully.");
                return;
            }
            this.f9738h = true;
            this.d = this.f9737g.optString("app_id");
            JSONArray optJSONArray2 = this.f9737g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i4);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.f9734b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.c.put(optString2, new C0940n9(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f9737g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                    this.f9733a.add(optJSONArray3.optString(i5));
                }
            }
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.c6)).booleanValue() && (optJSONObject2 = this.f9737g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    this.f9739i.add(optJSONArray.get(i6).toString());
                }
            }
            if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.x5)).booleanValue() || (optJSONObject = this.f9737g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f9740j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e4) {
            Y9.t("Exception occurred while processing app setting json", e4);
            N1.n.f1204A.f1209g.h("AppSettings.parseAppSettingsJson", e4);
        }
    }

    public final boolean a() {
        if (!TextUtils.isEmpty(this.f9735e) && this.f9737g != null) {
            C0937n6 c0937n6 = AbstractC1066q6.V9;
            O1.r rVar = O1.r.d;
            SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
            SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
            long longValue = ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).longValue();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.U9)).booleanValue() && !TextUtils.isEmpty(this.f9735e)) {
                longValue = this.f9737g.optLong("cache_ttl_sec", ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(c0937n6)).longValue());
            }
            N1.n.f1204A.f1212j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (longValue >= 0) {
                long j4 = this.f9736f;
                if (j4 > currentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j4) > longValue) {
                    this.f9733a.clear();
                    this.f9734b.clear();
                    this.c.clear();
                    this.d = "";
                    this.f9735e = "";
                    this.f9737g = null;
                    this.f9738h = false;
                    this.f9739i.clear();
                    this.f9740j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
