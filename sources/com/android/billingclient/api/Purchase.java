package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f3565a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3566b;
    public final JSONObject c;

    public Purchase(String str, String str2) {
        this.f3565a = str;
        this.f3566b = str2;
        this.c = new JSONObject(str);
    }

    public final int a() {
        return this.c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f3565a, purchase.f3565a) && TextUtils.equals(this.f3566b, purchase.f3566b);
    }

    public final int hashCode() {
        return this.f3565a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f3565a));
    }
}
