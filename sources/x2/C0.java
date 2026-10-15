package x2;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.C0590f1;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C0 extends S {
    public volatile C2111z0 c;
    public volatile C2111z0 d;

    /* renamed from: e, reason: collision with root package name */
    public C2111z0 f15338e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f15339f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f15340g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f15341h;

    /* renamed from: i, reason: collision with root package name */
    public volatile C2111z0 f15342i;

    /* renamed from: j, reason: collision with root package name */
    public C2111z0 f15343j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15344k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f15345l;

    public C0(C2066c0 c2066c0) {
        super(c2066c0);
        this.f15345l = new Object();
        this.f15339f = new ConcurrentHashMap();
    }

    @Override // x2.S
    public final boolean i() {
        return false;
    }

    public final void j(C2111z0 c2111z0, C2111z0 c2111z02, long j4, boolean z4, Bundle bundle) {
        boolean z5 = c2111z0.f15863e;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        g();
        boolean z6 = false;
        boolean z7 = (c2111z02 != null && c2111z02.c == c2111z0.c && AbstractC2080j0.e(c2111z02.f15862b, c2111z0.f15862b) && AbstractC2080j0.e(c2111z02.f15861a, c2111z0.f15861a)) ? false : true;
        if (z4 && this.f15338e != null) {
            z6 = true;
        }
        if (z7) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            b1.s(c2111z0, bundle2, true);
            if (c2111z02 != null) {
                String str = c2111z02.f15861a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = c2111z02.f15862b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", c2111z02.c);
            }
            if (z6) {
                Q0 q02 = c2066c0.f15570k;
                C2066c0.h(q02);
                C0590f1 c0590f1 = q02.f15433e;
                long j5 = j4 - c0590f1.f8670p;
                c0590f1.f8670p = j4;
                if (j5 > 0) {
                    b1 b1Var = c2066c0.f15571l;
                    C2066c0.g(b1Var);
                    b1Var.q(bundle2, j5);
                }
            }
            if (!c2066c0.f15566g.r()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != z5 ? "auto" : "app";
            c2066c0.f15573n.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (z5) {
                long j6 = c2111z0.f15864f;
                if (j6 != 0) {
                    currentTimeMillis = j6;
                }
            }
            C2103v0 c2103v0 = c2066c0.f15575p;
            C2066c0.h(c2103v0);
            c2103v0.n(currentTimeMillis, bundle2, str3, "_vs");
        }
        if (z6) {
            k(this.f15338e, true, j4);
        }
        this.f15338e = c2111z0;
        if (z5) {
            this.f15343j = c2111z0;
        }
        J0 q4 = c2066c0.q();
        q4.g();
        q4.e();
        q4.r(new x0.j(q4, c2111z0, 7, false));
    }

    public final void k(C2111z0 c2111z0, boolean z4, long j4) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        C2104w k3 = c2066c0.k();
        c2066c0.f15573n.getClass();
        k3.j(SystemClock.elapsedRealtime());
        boolean z5 = c2111z0 != null && c2111z0.d;
        Q0 q02 = c2066c0.f15570k;
        C2066c0.h(q02);
        if (!q02.f15433e.b(j4, z5, z4) || c2111z0 == null) {
            return;
        }
        c2111z0.d = false;
    }

    public final C2111z0 l(boolean z4) {
        e();
        g();
        if (!z4) {
            return this.f15338e;
        }
        C2111z0 c2111z0 = this.f15338e;
        return c2111z0 != null ? c2111z0 : this.f15343j;
    }

    public final String m(Class cls) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str = length > 0 ? split[length - 1] : "";
        int length2 = str.length();
        c2066c0.getClass();
        return length2 > 100 ? str.substring(0, 100) : str;
    }

    public final void n(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((C2066c0) this.f1719a).f15566g.r() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f15339f.put(activity, new C2111z0(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final C2111z0 o(Activity activity) {
        h2.y.i(activity);
        C2111z0 c2111z0 = (C2111z0) this.f15339f.get(activity);
        if (c2111z0 == null) {
            String m4 = m(activity.getClass());
            b1 b1Var = ((C2066c0) this.f1719a).f15571l;
            C2066c0.g(b1Var);
            C2111z0 c2111z02 = new C2111z0(null, m4, b1Var.i0());
            this.f15339f.put(activity, c2111z02);
            c2111z0 = c2111z02;
        }
        return this.f15342i != null ? this.f15342i : c2111z0;
    }

    public final void p(Activity activity, C2111z0 c2111z0, boolean z4) {
        C2111z0 c2111z02;
        C2111z0 c2111z03 = this.c == null ? this.d : this.c;
        if (c2111z0.f15862b == null) {
            c2111z02 = new C2111z0(c2111z0.f15861a, activity != null ? m(activity.getClass()) : null, c2111z0.c, c2111z0.f15863e, c2111z0.f15864f);
        } else {
            c2111z02 = c2111z0;
        }
        this.d = this.c;
        this.c = c2111z02;
        ((C2066c0) this.f1719a).f15573n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C2064b0 c2064b0 = ((C2066c0) this.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new A0(this, c2111z02, c2111z03, elapsedRealtime, z4));
    }
}
