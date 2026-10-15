package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tn implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7078a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7079b;

    public /* synthetic */ Tn(String str, int i4) {
        this.f7078a = i4;
        this.f7079b = str;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        switch (this.f7078a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String str = this.f7079b;
                if (str != null) {
                    bundle.putString("arek", str);
                    return;
                }
                return;
            case 1:
                ((Bundle) obj).putString("ms", this.f7079b);
                return;
            case 2:
                Zf.I("omid_v", this.f7079b, (Bundle) obj);
                return;
            case 3:
                Bundle bundle2 = (Bundle) obj;
                String str2 = this.f7079b;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                bundle2.putString("query_info", str2);
                return;
            case 4:
                try {
                    ((JSONObject) obj).put("ms", this.f7079b);
                    return;
                } catch (JSONException e4) {
                    Q1.I.x("Failed putting Ad ID.", e4);
                    return;
                }
            case 5:
                String str3 = this.f7079b;
                try {
                    JSONObject D4 = android.support.v4.media.session.a.D("pii", (JSONObject) obj);
                    if (TextUtils.isEmpty(str3)) {
                        return;
                    }
                    D4.put("attok", str3);
                    return;
                } catch (JSONException e5) {
                    Q1.I.x("Failed putting attestation token.", e5);
                    return;
                }
            default:
                String str4 = this.f7079b;
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                    android.support.v4.media.session.a.D("pii", jSONObject).put("adsid", str4);
                    return;
                } catch (JSONException e6) {
                    Y9.t("Failed putting trustless token.", e6);
                    return;
                }
        }
    }
}
