package x2;

import Q1.AbstractC0115n;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2073g extends AbstractC0115n {

    /* renamed from: b, reason: collision with root package name */
    public Boolean f15664b;
    public InterfaceC2071f c;
    public Boolean d;

    public final String h(String str) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            h2.y.i(str2);
            return str2;
        } catch (ClassNotFoundException e4) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.b(e4, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e5) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15394f.b(e5, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e6) {
            K k5 = c2066c0.f15568i;
            C2066c0.i(k5);
            k5.f15394f.b(e6, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e7) {
            K k6 = c2066c0.f15568i;
            C2066c0.i(k6);
            k6.f15394f.b(e7, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final double i(String str, C2060A c2060a) {
        if (str == null) {
            return ((Double) c2060a.a(null)).doubleValue();
        }
        String a4 = this.c.a(str, c2060a.f15255a);
        if (TextUtils.isEmpty(a4)) {
            return ((Double) c2060a.a(null)).doubleValue();
        }
        try {
            return ((Double) c2060a.a(Double.valueOf(Double.parseDouble(a4)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c2060a.a(null)).doubleValue();
        }
    }

    public final int j() {
        b1 b1Var = ((C2066c0) this.f1719a).f15571l;
        C2066c0.g(b1Var);
        Boolean bool = ((C2066c0) b1Var.f1719a).q().f15388e;
        if (b1Var.g0() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int k(String str, C2060A c2060a) {
        if (str == null) {
            return ((Integer) c2060a.a(null)).intValue();
        }
        String a4 = this.c.a(str, c2060a.f15255a);
        if (TextUtils.isEmpty(a4)) {
            return ((Integer) c2060a.a(null)).intValue();
        }
        try {
            return ((Integer) c2060a.a(Integer.valueOf(Integer.parseInt(a4)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c2060a.a(null)).intValue();
        }
    }

    public final void l() {
        ((C2066c0) this.f1719a).getClass();
    }

    public final long m(String str, C2060A c2060a) {
        if (str == null) {
            return ((Long) c2060a.a(null)).longValue();
        }
        String a4 = this.c.a(str, c2060a.f15255a);
        if (TextUtils.isEmpty(a4)) {
            return ((Long) c2060a.a(null)).longValue();
        }
        try {
            return ((Long) c2060a.a(Long.valueOf(Long.parseLong(a4)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c2060a.a(null)).longValue();
        }
    }

    public final Bundle n() {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        try {
            if (c2066c0.f15562a.getPackageManager() == null) {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15394f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a4 = m2.c.a(c2066c0.f15562a).a(c2066c0.f15562a.getPackageName(), 128);
            if (a4 != null) {
                return a4.metaData;
            }
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15394f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            K k5 = c2066c0.f15568i;
            C2066c0.i(k5);
            k5.f15394f.b(e4, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean o(String str) {
        h2.y.e(str);
        Bundle n4 = n();
        if (n4 != null) {
            if (n4.containsKey(str)) {
                return Boolean.valueOf(n4.getBoolean(str));
            }
            return null;
        }
        K k3 = ((C2066c0) this.f1719a).f15568i;
        C2066c0.i(k3);
        k3.f15394f.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean p(String str, C2060A c2060a) {
        if (str == null) {
            return ((Boolean) c2060a.a(null)).booleanValue();
        }
        String a4 = this.c.a(str, c2060a.f15255a);
        return TextUtils.isEmpty(a4) ? ((Boolean) c2060a.a(null)).booleanValue() : ((Boolean) c2060a.a(Boolean.valueOf("1".equals(a4)))).booleanValue();
    }

    public final boolean q(String str) {
        return "1".equals(this.c.a(str, "gaia_collection_enabled"));
    }

    public final boolean r() {
        Boolean o4 = o("google_analytics_automatic_screen_reporting_enabled");
        return o4 == null || o4.booleanValue();
    }

    public final boolean s() {
        ((C2066c0) this.f1719a).getClass();
        Boolean o4 = o("firebase_analytics_collection_deactivated");
        return o4 != null && o4.booleanValue();
    }

    public final boolean u(String str) {
        return "1".equals(this.c.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean v() {
        if (this.f15664b == null) {
            Boolean o4 = o("app_measurement_lite");
            this.f15664b = o4;
            if (o4 == null) {
                this.f15664b = Boolean.FALSE;
            }
        }
        return this.f15664b.booleanValue() || !((C2066c0) this.f1719a).f15564e;
    }
}
