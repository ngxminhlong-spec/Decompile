package Q1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0949nc;
import com.google.android.gms.internal.ads.F6;
import com.google.android.gms.internal.ads.I4;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.Y9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1643b;
    public InterfaceFutureC0239a d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f1645f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f1646g;

    /* renamed from: i, reason: collision with root package name */
    public String f1648i;

    /* renamed from: j, reason: collision with root package name */
    public String f1649j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1642a = new Object();
    public final ArrayList c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public I4 f1644e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1647h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1650k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f1651l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public String f1652m = "-1";

    /* renamed from: n, reason: collision with root package name */
    public String f1653n = "-1";

    /* renamed from: o, reason: collision with root package name */
    public int f1654o = -1;

    /* renamed from: p, reason: collision with root package name */
    public C0949nc f1655p = new C0949nc("", 0);

    /* renamed from: q, reason: collision with root package name */
    public long f1656q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f1657r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f1658s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f1659t = 0;

    /* renamed from: u, reason: collision with root package name */
    public Set f1660u = Collections.EMPTY_SET;

    /* renamed from: v, reason: collision with root package name */
    public JSONObject f1661v = new JSONObject();

    /* renamed from: w, reason: collision with root package name */
    public boolean f1662w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1663x = true;
    public String y = null;

    /* renamed from: z, reason: collision with root package name */
    public String f1664z = "";

    /* renamed from: A, reason: collision with root package name */
    public boolean f1637A = false;

    /* renamed from: B, reason: collision with root package name */
    public String f1638B = "";

    /* renamed from: C, reason: collision with root package name */
    public int f1639C = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f1640D = -1;

    /* renamed from: E, reason: collision with root package name */
    public long f1641E = 0;

    public final String A() {
        String str;
        r();
        synchronized (this.f1642a) {
            str = this.y;
        }
        return str;
    }

    public final String B(String str) {
        r();
        synchronized (this.f1642a) {
            int hashCode = str.hashCode();
            if (hashCode != -2004976699) {
                if (hashCode != 83641339) {
                    if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                        return this.f1652m;
                    }
                } else if (str.equals("IABTCF_gdprApplies")) {
                    return this.f1651l;
                }
            } else if (str.equals("IABTCF_PurposeConsents")) {
                return this.f1653n;
            }
            return null;
        }
    }

    public final String C() {
        String str;
        r();
        synchronized (this.f1642a) {
            str = this.f1664z;
        }
        return str;
    }

    public final JSONObject D() {
        JSONObject jSONObject;
        r();
        synchronized (this.f1642a) {
            jSONObject = this.f1661v;
        }
        return jSONObject;
    }

    public final void E(Context context) {
        synchronized (this.f1642a) {
            try {
                if (this.f1645f != null) {
                    return;
                }
                this.d = AbstractC0266Ec.f4897a.a(new Nu(25, this, context));
                this.f1643b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F() {
        r();
        synchronized (this.f1642a) {
            try {
                this.f1661v = new JSONObject();
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void G(int i4) {
        r();
        synchronized (this.f1642a) {
            try {
                if (this.f1659t == i4) {
                    return;
                }
                this.f1659t = i4;
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putInt("version_code", i4);
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void H(String str) {
        r();
        synchronized (this.f1642a) {
            try {
                if (str.equals(this.f1648i)) {
                    return;
                }
                this.f1648i = str;
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I(String str) {
        r();
        synchronized (this.f1642a) {
            try {
                if (str.equals(this.f1649j)) {
                    return;
                }
                this.f1649j = str;
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.e8)).booleanValue()) {
            r();
            synchronized (this.f1642a) {
                try {
                    if (this.f1638B.equals(str)) {
                        return;
                    }
                    this.f1638B = str;
                    SharedPreferences.Editor editor = this.f1646g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f1646g.apply();
                    }
                    s();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(boolean z4) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.e8)).booleanValue()) {
            r();
            synchronized (this.f1642a) {
                try {
                    if (this.f1637A == z4) {
                        return;
                    }
                    this.f1637A = z4;
                    SharedPreferences.Editor editor = this.f1646g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z4);
                        this.f1646g.apply();
                    }
                    s();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(String str) {
        r();
        synchronized (this.f1642a) {
            try {
                if (TextUtils.equals(this.y, str)) {
                    return;
                }
                this.y = str;
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j4) {
        r();
        synchronized (this.f1642a) {
            try {
                if (this.f1657r == j4) {
                    return;
                }
                this.f1657r = j4;
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j4);
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i4) {
        r();
        synchronized (this.f1642a) {
            try {
                this.f1654o = i4;
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    if (i4 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i4);
                    }
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: all -> 0x0025, TryCatch #0 {, blocks: (B:4:0x0006, B:13:0x0022, B:14:0x003c, B:16:0x0040, B:18:0x0048, B:19:0x0053, B:20:0x004e, B:21:0x0058, B:22:0x005b, B:25:0x005d, B:29:0x002f, B:32:0x003a), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            r3.r()
            java.lang.Object r0 = r3.f1642a
            monitor-enter(r0)
            int r1 = r4.hashCode()     // Catch: java.lang.Throwable -> L25
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            if (r1 == r2) goto L32
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L27
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L1a
            goto L5d
        L1a:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L5d
            r3.f1652m = r5     // Catch: java.lang.Throwable -> L25
            goto L3c
        L25:
            r4 = move-exception
            goto L5f
        L27:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L5d
            r3.f1651l = r5     // Catch: java.lang.Throwable -> L25
            goto L3c
        L32:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L5d
            r3.f1653n = r5     // Catch: java.lang.Throwable -> L25
        L3c:
            android.content.SharedPreferences$Editor r1 = r3.f1646g     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L58
            java.lang.String r1 = "-1"
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L4e
            android.content.SharedPreferences$Editor r5 = r3.f1646g     // Catch: java.lang.Throwable -> L25
            r5.remove(r4)     // Catch: java.lang.Throwable -> L25
            goto L53
        L4e:
            android.content.SharedPreferences$Editor r1 = r3.f1646g     // Catch: java.lang.Throwable -> L25
            r1.putString(r4, r5)     // Catch: java.lang.Throwable -> L25
        L53:
            android.content.SharedPreferences$Editor r4 = r3.f1646g     // Catch: java.lang.Throwable -> L25
            r4.apply()     // Catch: java.lang.Throwable -> L25
        L58:
            r3.s()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.K.f(java.lang.String, java.lang.String):void");
    }

    public final void g(String str) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.P7)).booleanValue()) {
            r();
            synchronized (this.f1642a) {
                try {
                    if (this.f1664z.equals(str)) {
                        return;
                    }
                    this.f1664z = str;
                    SharedPreferences.Editor editor = this.f1646g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f1646g.apply();
                    }
                    s();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void h(boolean z4) {
        r();
        synchronized (this.f1642a) {
            try {
                if (z4 == this.f1650k) {
                    return;
                }
                this.f1650k = z4;
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z4);
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(boolean z4) {
        r();
        synchronized (this.f1642a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) O1.r.d.c.a(AbstractC1066q6.Q8)).longValue();
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z4);
                    this.f1646g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(String str, String str2, boolean z4) {
        r();
        synchronized (this.f1642a) {
            try {
                JSONArray optJSONArray = this.f1661v.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z4 && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i4;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z4);
                    N1.n.f1204A.f1212j.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    optJSONArray.put(length, jSONObject);
                    this.f1661v.put(str, optJSONArray);
                } catch (JSONException e4) {
                    Y9.t("Could not update native advanced settings", e4);
                }
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f1661v.toString());
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(int i4) {
        r();
        synchronized (this.f1642a) {
            try {
                if (this.f1658s == i4) {
                    return;
                }
                this.f1658s = i4;
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i4);
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(int i4) {
        r();
        synchronized (this.f1642a) {
            try {
                if (this.f1640D == i4) {
                    return;
                }
                this.f1640D = i4;
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i4);
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(long j4) {
        r();
        synchronized (this.f1642a) {
            try {
                if (this.f1641E == j4) {
                    return;
                }
                this.f1641E = j4;
                SharedPreferences.Editor editor = this.f1646g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j4);
                    this.f1646g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n() {
        boolean z4;
        r();
        synchronized (this.f1642a) {
            z4 = this.f1662w;
        }
        return z4;
    }

    public final boolean o() {
        boolean z4;
        r();
        synchronized (this.f1642a) {
            z4 = this.f1663x;
        }
        return z4;
    }

    public final boolean p() {
        boolean z4;
        r();
        synchronized (this.f1642a) {
            z4 = this.f1637A;
        }
        return z4;
    }

    public final boolean q() {
        boolean z4;
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10253m0)).booleanValue()) {
            return false;
        }
        r();
        synchronized (this.f1642a) {
            z4 = this.f1650k;
        }
        return z4;
    }

    public final void r() {
        InterfaceFutureC0239a interfaceFutureC0239a = this.d;
        if (interfaceFutureC0239a == null || interfaceFutureC0239a.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            Y9.t("Interrupted while waiting for preferences loaded.", e4);
        } catch (CancellationException e5) {
            e = e5;
            Y9.q("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e6) {
            e = e6;
            Y9.q("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e7) {
            e = e7;
            Y9.q("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void s() {
        AbstractC0266Ec.f4897a.execute(new D0.o(11, this));
    }

    public final int t() {
        int i4;
        r();
        synchronized (this.f1642a) {
            i4 = this.f1658s;
        }
        return i4;
    }

    public final long u() {
        long j4;
        r();
        synchronized (this.f1642a) {
            j4 = this.f1656q;
        }
        return j4;
    }

    public final long v() {
        long j4;
        r();
        synchronized (this.f1642a) {
            j4 = this.f1657r;
        }
        return j4;
    }

    public final I4 w() {
        if (!this.f1643b || ((n() && o()) || !((Boolean) F6.f4987b.r()).booleanValue())) {
            return null;
        }
        synchronized (this.f1642a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f1644e == null) {
                    this.f1644e = new I4();
                }
                this.f1644e.c();
                Y9.r("start fetching content...");
                return this.f1644e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0949nc x() {
        C0949nc c0949nc;
        r();
        synchronized (this.f1642a) {
            try {
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.T9)).booleanValue() && this.f1655p.a()) {
                    ArrayList arrayList = this.c;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((Runnable) obj).run();
                    }
                }
                c0949nc = this.f1655p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0949nc;
    }

    public final String y() {
        String str;
        r();
        synchronized (this.f1642a) {
            str = this.f1648i;
        }
        return str;
    }

    public final String z() {
        String str;
        r();
        synchronized (this.f1642a) {
            str = this.f1649j;
        }
        return str;
    }
}
