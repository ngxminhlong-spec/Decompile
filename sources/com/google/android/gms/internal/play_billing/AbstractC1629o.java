package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1629o {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12237a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            e(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            d(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        e(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static B0.d b(Intent intent, String str) {
        if (intent != null) {
            B0.d b4 = B0.d.b();
            b4.f72b = a(intent.getExtras(), str);
            b4.c = c(intent.getExtras(), str);
            return b4.a();
        }
        e("BillingHelper", "Got null intent!");
        B0.d b5 = B0.d.b();
        b5.f72b = 6;
        b5.c = "An internal error occurred.";
        return b5.a();
    }

    public static String c(Bundle bundle, String str) {
        if (bundle == null) {
            e(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            d(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        e(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void d(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i4 = 40000;
            while (!str2.isEmpty() && i4 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i4));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i4 -= min;
            }
        }
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static Purchase g(String str, String str2) {
        if (str == null || str2 == null) {
            d("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e4) {
            e("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e4.toString()));
            return null;
        }
    }
}
