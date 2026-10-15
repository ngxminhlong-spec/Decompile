package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ap {

    /* renamed from: a, reason: collision with root package name */
    public final List f3997a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3998b;
    public final int c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3999e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4000f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4001g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4002h;

    /* renamed from: i, reason: collision with root package name */
    public final C0753iv f4003i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f4004j;

    /* renamed from: k, reason: collision with root package name */
    public final String f4005k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4006l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4007m;

    /* renamed from: n, reason: collision with root package name */
    public final JSONObject f4008n;

    /* renamed from: o, reason: collision with root package name */
    public final String f4009o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4010p;

    public Ap(JsonReader jsonReader) {
        List list = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        int i4 = 0;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        boolean z4 = false;
        C0753iv c0753iv = null;
        long j4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str9 = str;
            if ("nofill_urls".equals(nextName)) {
                list = android.support.v4.media.session.a.A(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i4 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str5 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z4 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i6 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j4 = jsonReader.nextLong();
            } else {
                C0937n6 c0937n6 = AbstractC1066q6.l7;
                JSONObject jSONObject2 = jSONObject;
                O1.r rVar = O1.r.d;
                String str10 = str3;
                SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
                SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    C0753iv c0753iv2 = new C0753iv();
                    jsonReader.beginObject();
                    String str11 = str9;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != -1724546052) {
                            if (hashCode == 3059181 && nextName2.equals("code")) {
                                jsonReader.nextInt();
                            }
                            jsonReader.skipValue();
                        } else if (nextName2.equals("description")) {
                            str11 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    c0753iv2.f9098p = str11;
                    c0753iv = c0753iv2;
                } else if ("bidding_data".equals(nextName)) {
                    str2 = jsonReader.nextString();
                } else {
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.O8)).booleanValue() && Zf.s(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str8 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.Y5)).booleanValue()) {
                            try {
                                Bundle x4 = android.support.v4.media.session.a.x(android.support.v4.media.session.a.E(jsonReader));
                                if (x4 != null) {
                                    bundle = x4;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.i8)).booleanValue()) {
                            str6 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (!"adRequestUrl".equals(nextName)) {
                        C0937n6 c0937n62 = AbstractC1066q6.j8;
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(c0937n62)).booleanValue() && Zf.s(nextName, "adResponseBody")) {
                            str7 = jsonReader.nextString();
                        } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(c0937n62)).booleanValue() && Zf.s(nextName, "adResponseHeaders")) {
                            jSONObject = android.support.v4.media.session.a.E(jsonReader);
                            str3 = str10;
                        } else {
                            if (Zf.s(nextName, "max_parallel_renderers")) {
                                i5 = Math.max(1, jsonReader.nextInt());
                            } else {
                                jsonReader.skipValue();
                            }
                            jSONObject = jSONObject2;
                            str3 = str10;
                            str = str9;
                        }
                    } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.i8)).booleanValue()) {
                        str3 = jsonReader.nextString();
                        jSONObject = jSONObject2;
                    } else {
                        jsonReader.skipValue();
                    }
                    jSONObject = jSONObject2;
                    str3 = str10;
                    str = str9;
                }
                jSONObject = jSONObject2;
                str3 = str10;
            }
            str = str9;
        }
        jsonReader.endObject();
        this.f3997a = list;
        this.c = i4;
        this.f3998b = str4;
        this.d = str5;
        this.f3999e = i6;
        this.f4000f = j4;
        this.f4003i = c0753iv;
        this.f4001g = z4;
        this.f4002h = str2;
        this.f4004j = bundle;
        this.f4005k = str3;
        this.f4006l = str6;
        this.f4007m = str7;
        this.f4008n = jSONObject;
        this.f4009o = str8;
        J2 j22 = S6.f6948a;
        this.f4010p = ((Long) j22.r()).longValue() > 0 ? ((Long) j22.r()).intValue() : i5;
    }
}
