package x2;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0590f1;
import com.google.android.gms.internal.ads.Wl;
import com.google.android.gms.internal.measurement.Y2;
import com.google.android.gms.internal.measurement.Z2;
import com.google.android.gms.internal.measurement.t3;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k.C1748e;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2103v0 extends S {
    public C2101u0 c;
    public Wl d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f15827e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15828f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f15829g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f15830h;

    /* renamed from: i, reason: collision with root package name */
    public C2077i f15831i;

    /* renamed from: j, reason: collision with root package name */
    public int f15832j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLong f15833k;

    /* renamed from: l, reason: collision with root package name */
    public long f15834l;

    /* renamed from: m, reason: collision with root package name */
    public int f15835m;

    /* renamed from: n, reason: collision with root package name */
    public final U f15836n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15837o;

    /* renamed from: p, reason: collision with root package name */
    public final C1748e f15838p;

    public C2103v0(C2066c0 c2066c0) {
        super(c2066c0);
        this.f15827e = new CopyOnWriteArraySet();
        this.f15830h = new Object();
        this.f15837o = true;
        this.f15838p = new C1748e(22, this);
        this.f15829g = new AtomicReference();
        this.f15831i = new C2077i(null, null);
        this.f15832j = 100;
        this.f15834l = -1L;
        this.f15835m = 100;
        this.f15833k = new AtomicLong(0L);
        this.f15836n = new U(c2066c0, 2);
    }

    public static /* bridge */ /* synthetic */ void B(C2103v0 c2103v0, C2077i c2077i, C2077i c2077i2) {
        boolean z4;
        EnumC2075h enumC2075h = EnumC2075h.f15669q;
        EnumC2075h enumC2075h2 = EnumC2075h.f15668p;
        EnumC2075h[] enumC2075hArr = {enumC2075h, enumC2075h2};
        int i4 = 0;
        while (true) {
            if (i4 >= 2) {
                z4 = false;
                break;
            }
            EnumC2075h enumC2075h3 = enumC2075hArr[i4];
            if (!c2077i2.f(enumC2075h3) && c2077i.f(enumC2075h3)) {
                z4 = true;
                break;
            }
            i4++;
        }
        boolean g4 = c2077i.g(c2077i2, enumC2075h, enumC2075h2);
        if (z4 || g4) {
            ((C2066c0) c2103v0.f1719a).m().l();
        }
    }

    public static void C(C2103v0 c2103v0, C2077i c2077i, int i4, long j4, boolean z4, boolean z5) {
        c2103v0.g();
        C2066c0 c2066c0 = (C2066c0) c2103v0.f1719a;
        c2103v0.e();
        if (j4 <= c2103v0.f15834l) {
            int i5 = c2103v0.f15835m;
            C2077i c2077i2 = C2077i.f15674b;
            if (i5 <= i4) {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15400l.b(c2077i, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        T t4 = c2066c0.f15567h;
        C2066c0.g(t4);
        t4.g();
        if (!t4.o(i4)) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15400l.b(Integer.valueOf(i4), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = t4.k().edit();
        edit.putString("consent_settings", c2077i.e());
        edit.putInt("consent_source", i4);
        edit.apply();
        c2103v0.f15834l = j4;
        c2103v0.f15835m = i4;
        J0 q4 = c2066c0.q();
        q4.g();
        C2066c0 c2066c02 = (C2066c0) q4.f1719a;
        q4.e();
        if (z4) {
            c2066c02.getClass();
            c2066c02.n().k();
        }
        if (q4.m()) {
            q4.r(new E0(q4, q4.o(false), 3));
        }
        if (z5) {
            c2066c0.q().y(new AtomicReference());
        }
    }

    public final String A() {
        return (String) this.f15829g.get();
    }

    public final void D() {
        g();
        e();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        boolean f4 = c2066c0.f();
        C2073g c2073g = c2066c0.f15566g;
        if (f4) {
            if (c2073g.p(null, B.f15286X)) {
                ((C2066c0) c2073g.f1719a).getClass();
                Boolean o4 = c2073g.o("google_analytics_deferred_deep_link_enabled");
                if (o4 != null && o4.booleanValue()) {
                    K k3 = c2066c0.f15568i;
                    C2066c0.i(k3);
                    k3.f15401m.a("Deferred Deep Link feature enabled.");
                    C2064b0 c2064b0 = c2066c0.f15569j;
                    C2066c0.i(c2064b0);
                    c2064b0.o(new RunnableC2088n0(this, 0));
                }
            }
            J0 q4 = c2066c0.q();
            q4.g();
            q4.e();
            d1 o5 = q4.o(true);
            ((C2066c0) q4.f1719a).n().m(3, new byte[0]);
            q4.r(new E0(q4, o5, 1));
            this.f15837o = false;
            T t4 = c2066c0.f15567h;
            C2066c0.g(t4);
            t4.g();
            String string = t4.k().getString("previous_os_version", null);
            ((C2066c0) t4.f1719a).l().i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = t4.k().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c2066c0.l().i();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m("auto", "_ou", bundle);
        }
    }

    @Override // x2.S
    public final boolean i() {
        return false;
    }

    public final void j(String str, String str2, Bundle bundle) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        c2066c0.f15573n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        h2.y.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        C2064b0 c2064b0 = c2066c0.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new RunnableC2086m0(this, bundle2, 2));
    }

    public final void k() {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (!(c2066c0.f15562a.getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) c2066c0.f15562a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f6, code lost:
    
        if (r6 > 100) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012b, code lost:
    
        if (r7 > 100) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2103v0.l(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void m(String str, String str2, Bundle bundle) {
        g();
        ((C2066c0) this.f1719a).f15573n.getClass();
        n(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void n(long j4, Bundle bundle, String str, String str2) {
        g();
        boolean z4 = true;
        if (this.d != null && !b1.R(str2)) {
            z4 = false;
        }
        o(str, str2, j4, bundle, true, z4, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.String r30, java.lang.String r31, long r32, android.os.Bundle r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2103v0.o(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    public final void p(boolean z4, long j4) {
        g();
        e();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        K k3 = c2066c0.f15568i;
        C2066c0.i(k3);
        k3.f15401m.a("Resetting analytics data (FE)");
        Q0 q02 = c2066c0.f15570k;
        C2066c0.h(q02);
        q02.g();
        C0590f1 c0590f1 = q02.f15433e;
        ((P0) c0590f1.f8671q).a();
        c0590f1.f8669o = 0L;
        c0590f1.f8670p = 0L;
        t3.a();
        C2073g c2073g = c2066c0.f15566g;
        if (c2073g.p(null, B.f15318p0)) {
            c2066c0.m().l();
        }
        boolean e4 = c2066c0.e();
        T t4 = c2066c0.f15567h;
        C2066c0.g(t4);
        C2066c0 c2066c02 = (C2066c0) t4.f1719a;
        t4.f15440e.b(j4);
        T t5 = c2066c02.f15567h;
        C2073g c2073g2 = c2066c02.f15566g;
        C2066c0.g(t5);
        if (!TextUtils.isEmpty(t5.f15454s.b())) {
            t4.f15454s.c(null);
        }
        Y2 y22 = Y2.f11856p;
        ((Z2) y22.f11857o.b()).getClass();
        C2060A c2060a = B.f15294d0;
        if (c2073g2.p(null, c2060a)) {
            t4.f15449n.b(0L);
        }
        if (!c2073g2.s()) {
            t4.m(!e4);
        }
        t4.f15455t.c(null);
        t4.f15456u.b(0L);
        t4.f15457v.I(null);
        if (z4) {
            J0 q4 = c2066c0.q();
            q4.g();
            C2066c0 c2066c03 = (C2066c0) q4.f1719a;
            q4.e();
            d1 o4 = q4.o(false);
            c2066c03.getClass();
            c2066c03.n().k();
            q4.r(new E0(q4, o4, 0));
        }
        ((Z2) y22.f11857o.b()).getClass();
        if (c2073g.p(null, c2060a)) {
            C2066c0.h(q02);
            q02.d.w();
        }
        this.f15837o = !e4;
    }

    public final void q(Bundle bundle, long j4) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        h2.y.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15397i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC2080j0.a(bundle2, "app_id", String.class, null);
        AbstractC2080j0.a(bundle2, "origin", String.class, null);
        AbstractC2080j0.a(bundle2, "name", String.class, null);
        AbstractC2080j0.a(bundle2, "value", Object.class, null);
        AbstractC2080j0.a(bundle2, "trigger_event_name", String.class, null);
        AbstractC2080j0.a(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC2080j0.a(bundle2, "timed_out_event_name", String.class, null);
        AbstractC2080j0.a(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC2080j0.a(bundle2, "triggered_event_name", String.class, null);
        AbstractC2080j0.a(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC2080j0.a(bundle2, "time_to_live", Long.class, 0L);
        AbstractC2080j0.a(bundle2, "expired_event_name", String.class, null);
        AbstractC2080j0.a(bundle2, "expired_event_params", Bundle.class, null);
        h2.y.e(bundle2.getString("name"));
        h2.y.e(bundle2.getString("origin"));
        h2.y.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j4);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        b1 b1Var = c2066c0.f15571l;
        b1 b1Var2 = c2066c0.f15571l;
        G g4 = c2066c0.f15572m;
        K k4 = c2066c0.f15568i;
        C2066c0.g(b1Var);
        if (b1Var.f0(string) != 0) {
            C2066c0.i(k4);
            k4.f15394f.b(g4.f(string), "Invalid conditional user property name");
            return;
        }
        C2066c0.g(b1Var2);
        if (b1Var2.b0(obj, string) != 0) {
            C2066c0.i(k4);
            k4.f15394f.c(g4.f(string), obj, "Invalid conditional user property value");
            return;
        }
        C2066c0.g(b1Var2);
        Object l4 = b1Var2.l(obj, string);
        if (l4 == null) {
            C2066c0.i(k4);
            k4.f15394f.c(g4.f(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        AbstractC2080j0.g(bundle2, l4);
        long j5 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j5 > 15552000000L || j5 < 1)) {
            C2066c0.i(k4);
            k4.f15394f.c(g4.f(string), Long.valueOf(j5), "Invalid conditional user property timeout");
            return;
        }
        long j6 = bundle2.getLong("time_to_live");
        if (j6 > 15552000000L || j6 < 1) {
            C2066c0.i(k4);
            k4.f15394f.c(g4.f(string), Long.valueOf(j6), "Invalid conditional user property time to live");
        } else {
            C2064b0 c2064b0 = c2066c0.f15569j;
            C2066c0.i(c2064b0);
            c2064b0.o(new RunnableC2086m0(this, bundle2, 1));
        }
    }

    public final void r(Bundle bundle, int i4, long j4) {
        Object obj;
        String string;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        e();
        C2077i c2077i = C2077i.f15674b;
        EnumC2075h[] values = EnumC2075h.values();
        int length = values.length;
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= length) {
                break;
            }
            EnumC2075h enumC2075h = values[i5];
            if (bundle.containsKey(enumC2075h.f15672o) && (string = bundle.getString(enumC2075h.f15672o)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i5++;
        }
        if (obj != null) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15399k.b(obj, "Ignoring invalid consent setting");
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15399k.a("Valid consent values are 'granted', 'denied'");
        }
        s(C2077i.a(bundle), i4, j4);
    }

    public final void s(C2077i c2077i, int i4, long j4) {
        C2077i c2077i2;
        boolean z4;
        boolean z5;
        C2077i c2077i3;
        int i5;
        boolean z6;
        e();
        if (i4 != -10 && ((Boolean) c2077i.f15675a.get(EnumC2075h.f15668p)) == null && ((Boolean) c2077i.f15675a.get(EnumC2075h.f15669q)) == null) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15399k.a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f15830h) {
            try {
                c2077i2 = this.f15831i;
                int i6 = this.f15832j;
                C2077i c2077i4 = C2077i.f15674b;
                boolean z7 = false;
                if (i4 <= i6) {
                    z4 = c2077i.g(c2077i2, (EnumC2075h[]) c2077i.f15675a.keySet().toArray(new EnumC2075h[0]));
                    EnumC2075h enumC2075h = EnumC2075h.f15669q;
                    z5 = true;
                    if (c2077i.f(enumC2075h) && !this.f15831i.f(enumC2075h)) {
                        z7 = true;
                    }
                    C2077i d = c2077i.d(this.f15831i);
                    this.f15831i = d;
                    this.f15832j = i4;
                    boolean z8 = z7;
                    c2077i3 = d;
                    i5 = -10;
                    z6 = z8;
                } else {
                    z4 = false;
                    z5 = false;
                    c2077i3 = c2077i;
                    i5 = -10;
                    z6 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z5) {
            K k4 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k4);
            k4.f15400l.b(c2077i3, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f15833k.getAndIncrement();
        if (z4) {
            this.f15829g.set(null);
            C2064b0 c2064b0 = ((C2066c0) this.f1719a).f15569j;
            C2066c0.i(c2064b0);
            c2064b0.p(new RunnableC2095r0(this, c2077i3, j4, i4, andIncrement, z6, c2077i2));
            return;
        }
        RunnableC2097s0 runnableC2097s0 = new RunnableC2097s0(this, c2077i3, i4, andIncrement, z6, c2077i2);
        if (i4 == 30 || i4 == i5) {
            C2064b0 c2064b02 = ((C2066c0) this.f1719a).f15569j;
            C2066c0.i(c2064b02);
            c2064b02.p(runnableC2097s0);
        } else {
            C2064b0 c2064b03 = ((C2066c0) this.f1719a).f15569j;
            C2066c0.i(c2064b03);
            c2064b03.o(runnableC2097s0);
        }
    }

    public final void u(C2077i c2077i) {
        g();
        boolean z4 = (c2077i.f(EnumC2075h.f15669q) && c2077i.f(EnumC2075h.f15668p)) || ((C2066c0) this.f1719a).q().m();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        C2064b0 c2064b0 = c2066c0.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        if (z4 != c2066c0.f15558D) {
            C2066c0 c2066c02 = (C2066c0) this.f1719a;
            C2064b0 c2064b02 = c2066c02.f15569j;
            C2066c0.i(c2064b02);
            c2064b02.g();
            c2066c02.f15558D = z4;
            T t4 = ((C2066c0) this.f1719a).f15567h;
            C2066c0.g(t4);
            t4.g();
            Boolean valueOf = t4.k().contains("measurement_enabled_from_api") ? Boolean.valueOf(t4.k().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z4 || valueOf == null || valueOf.booleanValue()) {
                y(Boolean.valueOf(z4), false);
            }
        }
    }

    public final void v(String str, String str2, Object obj, boolean z4, long j4) {
        int i4;
        int length;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        String str3 = str == null ? "app" : str;
        if (z4) {
            b1 b1Var = c2066c0.f15571l;
            C2066c0.g(b1Var);
            i4 = b1Var.f0(str2);
        } else {
            b1 b1Var2 = c2066c0.f15571l;
            C2066c0.g(b1Var2);
            if (b1Var2.N("user property", str2)) {
                if (b1Var2.J("user property", AbstractC2080j0.f15685i, null, str2)) {
                    ((C2066c0) b1Var2.f1719a).getClass();
                    if (b1Var2.I(24, "user property", str2)) {
                        i4 = 0;
                    }
                } else {
                    i4 = 15;
                }
            }
            i4 = 6;
        }
        C1748e c1748e = this.f15838p;
        if (i4 != 0) {
            C2066c0.g(c2066c0.f15571l);
            String m4 = b1.m(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            C2066c0.g(c2066c0.f15571l);
            b1.x(c1748e, null, i4, "_ev", m4, length);
            return;
        }
        if (obj == null) {
            C2064b0 c2064b0 = c2066c0.f15569j;
            C2066c0.i(c2064b0);
            c2064b0.o(new RunnableC2072f0(this, str3, str2, null, j4, 1));
            return;
        }
        b1 b1Var3 = c2066c0.f15571l;
        b1 b1Var4 = c2066c0.f15571l;
        C2066c0.g(b1Var3);
        int b02 = b1Var3.b0(obj, str2);
        if (b02 != 0) {
            C2066c0.g(b1Var4);
            String m5 = b1.m(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            C2066c0.g(b1Var4);
            b1.x(c1748e, null, b02, "_ev", m5, length);
            return;
        }
        C2066c0.g(b1Var4);
        Object l4 = b1Var4.l(obj, str2);
        if (l4 != null) {
            C2064b0 c2064b02 = c2066c0.f15569j;
            C2066c0.i(c2064b02);
            c2064b02.o(new RunnableC2072f0(this, str3, str2, l4, j4, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(long r19, java.lang.Object r21, java.lang.String r22, java.lang.String r23) {
        /*
            r18 = this;
            r0 = r21
            r1 = r18
            java.lang.Object r2 = r1.f1719a
            x2.c0 r2 = (x2.C2066c0) r2
            h2.y.e(r22)
            h2.y.e(r23)
            r1.g()
            r1.e()
            java.lang.String r3 = "allow_personalized_ads"
            r4 = r23
            boolean r3 = r3.equals(r4)
            r5 = 1
            if (r3 == 0) goto L68
            boolean r3 = r0 instanceof java.lang.String
            java.lang.String r6 = "_npa"
            if (r3 == 0) goto L59
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L59
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r3 = "false"
            boolean r0 = r3.equals(r0)
            r7 = 1
            if (r5 == r0) goto L41
            r9 = 0
            goto L42
        L41:
            r9 = r7
        L42:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            x2.T r4 = r2.f15567h
            x2.C2066c0.g(r4)
            B0.c r4 = r4.f15447l
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 != 0) goto L53
            java.lang.String r3 = "true"
        L53:
            r4.c(r3)
        L56:
            r10 = r0
            r11 = r6
            goto L6a
        L59:
            if (r0 != 0) goto L68
            x2.T r3 = r2.f15567h
            x2.C2066c0.g(r3)
            B0.c r3 = r3.f15447l
            java.lang.String r4 = "unset"
            r3.c(r4)
            goto L56
        L68:
            r10 = r0
            r11 = r4
        L6a:
            boolean r0 = r2.e()
            if (r0 != 0) goto L7d
            x2.K r0 = r2.f15568i
            x2.C2066c0.i(r0)
            x2.I r0 = r0.f15402n
            java.lang.String r2 = "User property not set since app measurement is disabled"
            r0.a(r2)
            return
        L7d:
            boolean r0 = r2.f()
            if (r0 != 0) goto L84
            return
        L84:
            x2.Y0 r16 = new x2.Y0
            r8 = r19
            r12 = r22
            r7 = r16
            r7.<init>(r8, r10, r11, r12)
            x2.J0 r13 = r2.q()
            r13.g()
            java.lang.Object r0 = r13.f1719a
            x2.c0 r0 = (x2.C2066c0) r0
            r13.e()
            r0.getClass()
            x2.F r0 = r0.n()
            r0.getClass()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            x2.C2067d.b(r7, r2)
            byte[] r3 = r2.marshall()
            r2.recycle()
            int r2 = r3.length
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r2 <= r4) goto Lcd
            java.lang.Object r0 = r0.f1719a
            x2.c0 r0 = (x2.C2066c0) r0
            x2.K r0 = r0.f15568i
            x2.C2066c0.i(r0)
            x2.I r0 = r0.f15395g
            java.lang.String r2 = "User property too long for local database. Sending directly to service"
            r0.a(r2)
            r0 = 0
        Lcb:
            r15 = r0
            goto Ld2
        Lcd:
            boolean r0 = r0.m(r5, r3)
            goto Lcb
        Ld2:
            x2.d1 r14 = r13.o(r5)
            x2.D0 r12 = new x2.D0
            r17 = 0
            r16 = r7
            r12.<init>(r13, r14, r15, r16, r17)
            r13.r(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2103v0.x(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void y(Boolean bool, boolean z4) {
        g();
        e();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        K k3 = c2066c0.f15568i;
        C2066c0.i(k3);
        k3.f15401m.b(bool, "Setting app measurement enabled (FE)");
        T t4 = c2066c0.f15567h;
        C2066c0.g(t4);
        t4.g();
        SharedPreferences.Editor edit = t4.k().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z4) {
            T t5 = c2066c0.f15567h;
            C2066c0.g(t5);
            t5.g();
            SharedPreferences.Editor edit2 = t5.k().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        C2064b0 c2064b0 = c2066c0.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        if (c2066c0.f15558D || !(bool == null || bool.booleanValue())) {
            z();
        }
    }

    public final void z() {
        g();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        T t4 = c2066c0.f15567h;
        K k3 = c2066c0.f15568i;
        C1798a c1798a = c2066c0.f15573n;
        C2066c0.g(t4);
        String b4 = t4.f15447l.b();
        if (b4 != null) {
            if ("unset".equals(b4)) {
                c1798a.getClass();
                x(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(b4) ? 0L : 1L);
                c1798a.getClass();
                x(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!c2066c0.e() || !this.f15837o) {
            C2066c0.i(k3);
            k3.f15401m.a("Updating Scion state (FE)");
            J0 q4 = c2066c0.q();
            q4.g();
            q4.e();
            q4.r(new E0(q4, q4.o(true), 2));
            return;
        }
        C2066c0.i(k3);
        k3.f15401m.a("Recording app launch after enabling measurement for the first time (FE)");
        D();
        ((Z2) Y2.f11856p.f11857o.b()).getClass();
        if (c2066c0.f15566g.p(null, B.f15294d0)) {
            Q0 q02 = c2066c0.f15570k;
            C2066c0.h(q02);
            q02.d.w();
        }
        C2064b0 c2064b0 = c2066c0.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new RunnableC2088n0(this, 1));
    }
}
