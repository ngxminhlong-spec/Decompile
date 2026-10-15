package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bq implements Aq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4188a;

    /* renamed from: o, reason: collision with root package name */
    public final int f4200o;

    /* renamed from: b, reason: collision with root package name */
    public long f4189b = 0;
    public long c = -1;
    public boolean d = false;

    /* renamed from: p, reason: collision with root package name */
    public int f4201p = 2;

    /* renamed from: q, reason: collision with root package name */
    public int f4202q = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f4190e = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f4191f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f4192g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f4193h = "";

    /* renamed from: i, reason: collision with root package name */
    public String f4194i = "";

    /* renamed from: j, reason: collision with root package name */
    public String f4195j = "";

    /* renamed from: k, reason: collision with root package name */
    public String f4196k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f4197l = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f4198m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4199n = false;

    public Bq(Context context, int i4) {
        this.f4188a = context;
        this.f4200o = i4;
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final Aq F(String str) {
        synchronized (this) {
            this.f4193h = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final Aq Y(String str) {
        synchronized (this) {
            this.f4194i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final Aq a(int i4) {
        synchronized (this) {
            this.f4201p = i4;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final Aq b(boolean z4) {
        synchronized (this) {
            this.d = z4;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r2.f4192g = r0.f11503b0;
     */
    @Override // com.google.android.gms.internal.ads.Aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.Aq c(com.google.android.gms.internal.ads.Op r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r3.f6526q     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.Ap r0 = (com.google.android.gms.internal.ads.Ap) r0     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r0.f3998b     // Catch: java.lang.Throwable -> L16
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            java.lang.Object r0 = r3.f6526q     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.Ap r0 = (com.google.android.gms.internal.ads.Ap) r0     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r0.f3998b     // Catch: java.lang.Throwable -> L16
            r2.f4191f = r0     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L3a
        L18:
            java.lang.Object r3 = r3.f6525p     // Catch: java.lang.Throwable -> L16
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L16
        L20:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.yp r0 = (com.google.android.gms.internal.ads.C1434yp) r0     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r0.f11503b0     // Catch: java.lang.Throwable -> L16
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L20
            java.lang.String r3 = r0.f11503b0     // Catch: java.lang.Throwable -> L16
            r2.f4192g = r3     // Catch: java.lang.Throwable -> L16
        L38:
            monitor-exit(r2)
            return r2
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Bq.c(com.google.android.gms.internal.ads.Op):com.google.android.gms.internal.ads.Aq");
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final Aq d(Throwable th) {
        synchronized (this) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.K7)).booleanValue()) {
                this.f4196k = Bs.O(C1335wc.n(C0275Ga.p(th), "SHA-256"));
                String p3 = C0275Ga.p(th);
                C1384xi G02 = C1384xi.G0(new C1437ys('\n'));
                p3.getClass();
                this.f4195j = (String) ((Js) ((Ks) G02.f11290p).d(G02, p3)).next();
            }
        }
        return this;
    }

    public final synchronized void e() {
        Configuration configuration;
        N1.n nVar = N1.n.f1204A;
        this.f4190e = nVar.f1207e.i(this.f4188a);
        Resources resources = this.f4188a.getResources();
        int i4 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i4 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f4202q = i4;
        nVar.f1212j.getClass();
        this.f4189b = SystemClock.elapsedRealtime();
        this.f4199n = true;
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final /* bridge */ /* synthetic */ Aq f() {
        e();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final /* bridge */ /* synthetic */ Aq g() {
        h();
        return this;
    }

    public final synchronized void h() {
        N1.n.f1204A.f1212j.getClass();
        this.c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final synchronized boolean j() {
        return this.f4199n;
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final boolean k() {
        return !TextUtils.isEmpty(this.f4193h);
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final synchronized Dq l() {
        try {
            if (this.f4198m) {
                return null;
            }
            this.f4198m = true;
            if (!this.f4199n) {
                e();
            }
            if (this.c < 0) {
                h();
            }
            return new Dq(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final Aq r(C0101z0 c0101z0) {
        synchronized (this) {
            try {
                IBinder iBinder = c0101z0.f1409s;
                if (iBinder != null) {
                    Fg fg = (Fg) iBinder;
                    String str = fg.f5062r;
                    if (!TextUtils.isEmpty(str)) {
                        this.f4191f = str;
                    }
                    String str2 = fg.f5060p;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f4192g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Aq
    public final Aq y(String str) {
        synchronized (this) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.K7)).booleanValue()) {
                this.f4197l = str;
            }
        }
        return this;
    }
}
