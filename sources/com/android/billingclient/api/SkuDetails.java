package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class SkuDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f3567a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f3568b;

    public SkuDetails(String str) {
        this.f3567a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3568b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public final String a() {
        return this.f3568b.optString("productId");
    }

    public final String b() {
        return this.f3568b.optString("type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f3567a, ((SkuDetails) obj).f3567a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3567a.hashCode();
    }

    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f3567a));
    }
}
