package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Oo implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6519a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f6520b;

    public /* synthetic */ Oo(JSONObject jSONObject, int i4) {
        this.f6519a = i4;
        this.f6520b = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f6519a) {
            case 0:
                try {
                    JSONObject D4 = android.support.v4.media.session.a.D("content_info", (JSONObject) obj);
                    JSONObject jSONObject = this.f6520b;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        D4.put(next, jSONObject.get(next));
                    }
                    return;
                } catch (JSONException unused) {
                    Q1.I.w("Failed putting app indexing json.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("cache_state", this.f6520b);
                    return;
                } catch (JSONException unused2) {
                    Q1.I.w("Unable to get cache_state");
                    return;
                }
        }
    }
}
