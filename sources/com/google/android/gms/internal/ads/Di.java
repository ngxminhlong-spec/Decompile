package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Di extends Ei {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f4769b;
    public final boolean c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4770e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4771f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4772g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f4773h;

    public Di(C1434yp c1434yp, JSONObject jSONObject) {
        super(c1434yp);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject I4 = android.support.v4.media.session.a.I(jSONObject, strArr);
        this.f4769b = I4 == null ? null : I4.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject I5 = android.support.v4.media.session.a.I(jSONObject, strArr2);
        this.c = I5 == null ? false : I5.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject I6 = android.support.v4.media.session.a.I(jSONObject, strArr3);
        this.d = I6 == null ? false : I6.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject I7 = android.support.v4.media.session.a.I(jSONObject, strArr4);
        this.f4770e = I7 == null ? false : I7.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject I8 = android.support.v4.media.session.a.I(jSONObject, strArr5);
        this.f4772g = I8 != null ? I8.optString(strArr5[0], "") : "";
        this.f4771f = jSONObject.optJSONObject("overlay") != null;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.u4)).booleanValue()) {
            this.f4773h = jSONObject.optJSONObject("omid_settings");
        } else {
            this.f4773h = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ei
    public final Xj a() {
        JSONObject jSONObject = this.f4773h;
        return jSONObject != null ? new Xj(16, jSONObject) : this.f4913a.f11495V;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    public final String b() {
        return this.f4772g;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    public final boolean c() {
        return this.f4770e;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    public final boolean d() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    public final boolean e() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    public final boolean f() {
        return this.f4771f;
    }
}
