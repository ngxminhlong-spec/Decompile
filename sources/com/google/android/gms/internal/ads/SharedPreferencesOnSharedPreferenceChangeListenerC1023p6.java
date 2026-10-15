package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.p6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public Context f9907g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9903a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ConditionVariable f9904b = new ConditionVariable();
    public volatile boolean c = false;
    public volatile boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f9905e = null;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f9906f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public JSONObject f9908h = new JSONObject();

    public final Object a(C0937n6 c0937n6) {
        if (!this.f9904b.block(5000L)) {
            synchronized (this.f9903a) {
                try {
                    if (!this.d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.c || this.f9905e == null) {
            synchronized (this.f9903a) {
                if (this.c && this.f9905e != null) {
                }
                return c0937n6.c;
            }
        }
        int i4 = c0937n6.f9714a;
        if (i4 != 2) {
            if (i4 == 1 && this.f9908h.has(c0937n6.f9715b)) {
                return c0937n6.a(this.f9908h);
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return c0937n6.b(this.f9905e);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        Bundle bundle = this.f9906f;
        if (bundle == null) {
            return c0937n6.c;
        }
        switch (c0937n6.d) {
            case 0:
                String str = c0937n6.f9715b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) c0937n6.c;
            case 1:
                String str2 = c0937n6.f9715b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2))) : (Integer) c0937n6.c;
            case 2:
                String str3 = c0937n6.f9715b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3))) : (Long) c0937n6.c;
            case 3:
                String str4 = c0937n6.f9715b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4))) : (Float) c0937n6.c;
            default:
                String str5 = c0937n6.f9715b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str5)) : (String) c0937n6.c;
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || sharedPreferences == null) {
            return;
        }
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                String string = sharedPreferences.getString("flag_configuration", "{}");
                StrictMode.setThreadPolicy(threadPolicy);
                this.f9908h = new JSONObject(string);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (JSONException unused) {
        }
    }
}
