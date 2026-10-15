package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937n6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9714a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9715b;
    public final Object c;
    public final /* synthetic */ int d;

    public C0937n6(int i4, String str, Object obj, int i5) {
        this.d = i5;
        this.f9714a = i4;
        this.f9715b = str;
        this.c = obj;
        ((ArrayList) O1.r.d.f1379a.f6525p).add(this);
    }

    public static C0937n6 c(String str, int i4) {
        return new C0937n6(1, str, Integer.valueOf(i4), 1);
    }

    public static C0937n6 d(String str, long j4) {
        return new C0937n6(1, str, Long.valueOf(j4), 2);
    }

    public static C0937n6 e(int i4, String str, Boolean bool) {
        return new C0937n6(i4, str, bool, 0);
    }

    public static C0937n6 f(String str, String str2) {
        return new C0937n6(1, str, str2, 4);
    }

    public static void g() {
        ((ArrayList) O1.r.d.f1379a.f6526q).add(f("gads:sdk_core_constants:experiment_id", null));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.d) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f9715b, ((Boolean) this.c).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f9715b, ((Integer) this.c).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f9715b, ((Long) this.c).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f9715b, ((Float) this.c).floatValue()));
            default:
                return jSONObject.optString(this.f9715b, (String) this.c);
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.d) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f9715b, ((Boolean) this.c).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f9715b, ((Integer) this.c).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f9715b, ((Long) this.c).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f9715b, ((Float) this.c).floatValue()));
            default:
                return sharedPreferences.getString(this.f9715b, (String) this.c);
        }
    }
}
