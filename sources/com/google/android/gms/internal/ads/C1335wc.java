package com.google.android.gms.internal.ads;

import a2.AbstractC0151a;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1335wc {

    /* renamed from: b, reason: collision with root package name */
    public static final Ur f11173b = new Ur(Looper.getMainLooper(), 0);
    public static final String c = H1.g.class.getName();
    public static final String d = R1.a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    public static final String f11174e = I1.a.class.getName();

    /* renamed from: f, reason: collision with root package name */
    public static final String f11175f = H8.class.getName();

    /* renamed from: g, reason: collision with root package name */
    public static final String f11176g = AbstractC0151a.class.getName();

    /* renamed from: h, reason: collision with root package name */
    public static final String f11177h = H1.d.class.getName();

    /* renamed from: a, reason: collision with root package name */
    public float f11178a;

    public static void h(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    h((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public static final int i(DisplayMetrics displayMetrics, int i4) {
        return (int) TypedValue.applyDimension(1, i4, displayMetrics);
    }

    public static final boolean j() {
        boolean booleanValue = ((Boolean) O1.r.d.c.a(AbstractC1066q6.D9)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return booleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final void k(Context context, String str, Bundle bundle, InterfaceC1292vc interfaceC1292vc) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            e2.f.f12753b.getClass();
            str = e2.f.a(context) + ".234310000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        interfaceC1292vc.o(appendQueryParameter.toString());
    }

    public static final int l(Context context, int i4) {
        return i(context.getResources().getDisplayMetrics(), i4);
    }

    public static final String m(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || j()) {
            string = "emulator";
        }
        return n(string, "MD5");
    }

    public static String n(String str, String str2) {
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public final JSONArray a(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(jSONArray, it.next());
        }
        return jSONArray;
    }

    public final void b(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(f((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(g((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(e((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final void c(JSONObject jSONObject, String str, Object obj) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10257n)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, f((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, g((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), a((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, a(Arrays.asList((Object[]) obj)));
            return;
        }
        int i4 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            Integer[] numArr = new Integer[length];
            while (i4 < length) {
                numArr[i4] = Integer.valueOf(iArr[i4]);
                i4++;
            }
            jSONObject.put(str, e(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            Double[] dArr2 = new Double[length2];
            while (i4 < length2) {
                dArr2[i4] = Double.valueOf(dArr[i4]);
                i4++;
            }
            jSONObject.put(str, e(dArr2));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            Long[] lArr = new Long[length3];
            while (i4 < length3) {
                lArr[i4] = Long.valueOf(jArr[i4]);
                i4++;
            }
            jSONObject.put(str, e(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length4 = zArr.length;
        Boolean[] boolArr = new Boolean[length4];
        while (i4 < length4) {
            boolArr[i4] = Boolean.valueOf(zArr[i4]);
            i4++;
        }
        jSONObject.put(str, e(boolArr));
    }

    public final int d(Context context, int i4) {
        if (this.f11178a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f11178a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f11178a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i4 / this.f11178a);
    }

    public final JSONArray e(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            b(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject f(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            c(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject g(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                c(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e4) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e4.getMessage())));
        }
    }
}
