package x2;

import Q1.AbstractC0115n;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2066c0 implements InterfaceC2078i0 {

    /* renamed from: H, reason: collision with root package name */
    public static volatile C2066c0 f15554H;

    /* renamed from: A, reason: collision with root package name */
    public volatile Boolean f15555A;

    /* renamed from: B, reason: collision with root package name */
    public final Boolean f15556B;

    /* renamed from: C, reason: collision with root package name */
    public final Boolean f15557C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f15558D;

    /* renamed from: E, reason: collision with root package name */
    public int f15559E;

    /* renamed from: G, reason: collision with root package name */
    public final long f15561G;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15562a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15563b;
    public final String c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15564e;

    /* renamed from: f, reason: collision with root package name */
    public final C2106x f15565f;

    /* renamed from: g, reason: collision with root package name */
    public final C2073g f15566g;

    /* renamed from: h, reason: collision with root package name */
    public final T f15567h;

    /* renamed from: i, reason: collision with root package name */
    public final K f15568i;

    /* renamed from: j, reason: collision with root package name */
    public final C2064b0 f15569j;

    /* renamed from: k, reason: collision with root package name */
    public final Q0 f15570k;

    /* renamed from: l, reason: collision with root package name */
    public final b1 f15571l;

    /* renamed from: m, reason: collision with root package name */
    public final G f15572m;

    /* renamed from: n, reason: collision with root package name */
    public final C1798a f15573n;

    /* renamed from: o, reason: collision with root package name */
    public final C0 f15574o;

    /* renamed from: p, reason: collision with root package name */
    public final C2103v0 f15575p;

    /* renamed from: q, reason: collision with root package name */
    public final C2104w f15576q;

    /* renamed from: r, reason: collision with root package name */
    public final C2109y0 f15577r;

    /* renamed from: s, reason: collision with root package name */
    public final String f15578s;

    /* renamed from: t, reason: collision with root package name */
    public F f15579t;

    /* renamed from: u, reason: collision with root package name */
    public J0 f15580u;

    /* renamed from: v, reason: collision with root package name */
    public C2087n f15581v;

    /* renamed from: w, reason: collision with root package name */
    public E f15582w;
    public Boolean y;

    /* renamed from: z, reason: collision with root package name */
    public long f15584z;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15583x = false;

    /* renamed from: F, reason: collision with root package name */
    public final AtomicInteger f15560F = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        throw r11;
     */
    /* JADX WARN: Type inference failed for: r3v7, types: [x2.g, Q1.n] */
    /* JADX WARN: Type inference failed for: r5v3, types: [x2.y0, x2.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2066c0(x2.C2084l0 r11) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2066c0.<init>(x2.l0):void");
    }

    public static final void g(AbstractC0115n abstractC0115n) {
        if (abstractC0115n == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void h(S s4) {
        if (s4 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!s4.f15437b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(s4.getClass())));
        }
    }

    public static final void i(AbstractC2076h0 abstractC2076h0) {
        if (abstractC2076h0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC2076h0.f15673b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2076h0.getClass())));
        }
    }

    public static C2066c0 p(Context context, com.google.android.gms.internal.measurement.O o4, Long l4) {
        Bundle bundle;
        if (o4 != null && (o4.f11792s == null || o4.f11793t == null)) {
            o4 = new com.google.android.gms.internal.measurement.O(o4.f11788o, o4.f11789p, o4.f11790q, o4.f11791r, null, null, o4.f11794u, null);
        }
        h2.y.i(context);
        h2.y.i(context.getApplicationContext());
        if (f15554H == null) {
            synchronized (C2066c0.class) {
                try {
                    if (f15554H == null) {
                        f15554H = new C2066c0(new C2084l0(context, o4, l4));
                    }
                } finally {
                }
            }
        } else if (o4 != null && (bundle = o4.f11794u) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            h2.y.i(f15554H);
            f15554H.f15555A = Boolean.valueOf(o4.f11794u.getBoolean("dataCollectionDefaultEnabled"));
        }
        h2.y.i(f15554H);
        return f15554H;
    }

    public final void a() {
        this.f15560F.incrementAndGet();
    }

    @Override // x2.InterfaceC2078i0
    public final Context b() {
        return this.f15562a;
    }

    @Override // x2.InterfaceC2078i0
    public final K c() {
        K k3 = this.f15568i;
        i(k3);
        return k3;
    }

    @Override // x2.InterfaceC2078i0
    public final C1798a d() {
        return this.f15573n;
    }

    public final boolean e() {
        return j() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f15584z) > 1000) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r6 = this;
            boolean r0 = r6.f15583x
            if (r0 == 0) goto Lb4
            x2.b0 r0 = r6.f15569j
            i(r0)
            r0.g()
            java.lang.Boolean r0 = r6.y
            l2.a r1 = r6.f15573n
            if (r0 == 0) goto L34
            long r2 = r6.f15584z
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lad
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f15584z
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lad
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f15584z = r0
            x2.b1 r0 = r6.f15571l
            g(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.O(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.O(r1)
            if (r1 == 0) goto L76
            android.content.Context r1 = r6.f15562a
            m2.b r4 = m2.c.a(r1)
            boolean r4 = r4.c()
            if (r4 != 0) goto L74
            x2.g r4 = r6.f15566g
            boolean r4 = r4.v()
            if (r4 != 0) goto L74
            boolean r4 = x2.b1.T(r1)
            if (r4 == 0) goto L76
            boolean r1 = x2.b1.U(r1)
            if (r1 == 0) goto L76
        L74:
            r1 = r2
            goto L77
        L76:
            r1 = r3
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.y = r4
            if (r1 == 0) goto Lad
            x2.E r1 = r6.m()
            java.lang.String r1 = r1.k()
            x2.E r4 = r6.m()
            r4.e()
            java.lang.String r4 = r4.f15359m
            boolean r0 = r0.H(r1, r4)
            if (r0 != 0) goto La7
            x2.E r0 = r6.m()
            r0.e()
            java.lang.String r0 = r0.f15359m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La6
            goto La7
        La6:
            r2 = r3
        La7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.y = r0
        Lad:
            java.lang.Boolean r0 = r6.y
            boolean r0 = r0.booleanValue()
            return r0
        Lb4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2066c0.f():boolean");
    }

    public final int j() {
        C2064b0 c2064b0 = this.f15569j;
        i(c2064b0);
        c2064b0.g();
        if (this.f15566g.s()) {
            return 1;
        }
        Boolean bool = this.f15557C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C2064b0 c2064b02 = this.f15569j;
        i(c2064b02);
        c2064b02.g();
        if (!this.f15558D) {
            return 8;
        }
        T t4 = this.f15567h;
        g(t4);
        t4.g();
        Boolean valueOf = t4.k().contains("measurement_enabled") ? Boolean.valueOf(t4.k().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        C2073g c2073g = this.f15566g;
        C2106x c2106x = ((C2066c0) c2073g.f1719a).f15565f;
        Boolean o4 = c2073g.o("firebase_analytics_collection_enabled");
        if (o4 != null) {
            return o4.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f15556B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f15555A == null || this.f15555A.booleanValue()) ? 0 : 7;
    }

    public final C2104w k() {
        C2104w c2104w = this.f15576q;
        if (c2104w != null) {
            return c2104w;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C2087n l() {
        i(this.f15581v);
        return this.f15581v;
    }

    public final E m() {
        h(this.f15582w);
        return this.f15582w;
    }

    public final F n() {
        h(this.f15579t);
        return this.f15579t;
    }

    public final G o() {
        return this.f15572m;
    }

    public final J0 q() {
        h(this.f15580u);
        return this.f15580u;
    }

    @Override // x2.InterfaceC2078i0
    public final C2064b0 t() {
        C2064b0 c2064b0 = this.f15569j;
        i(c2064b0);
        return c2064b0;
    }

    @Override // x2.InterfaceC2078i0
    public final C2106x w() {
        return this.f15565f;
    }
}
