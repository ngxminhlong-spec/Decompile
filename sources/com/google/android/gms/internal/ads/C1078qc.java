package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078qc {

    /* renamed from: g, reason: collision with root package name */
    public final String f10356g;

    /* renamed from: h, reason: collision with root package name */
    public final Q1.K f10357h;

    /* renamed from: a, reason: collision with root package name */
    public long f10352a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f10353b = -1;
    public int c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f10354e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10355f = new Object();

    /* renamed from: i, reason: collision with root package name */
    public int f10358i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f10359j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f10360k = 0;

    public C1078qc(String str, Q1.K k3) {
        this.f10356g = str;
        this.f10357h = k3;
    }

    public final int a() {
        int i4;
        synchronized (this.f10355f) {
            i4 = this.f10360k;
        }
        return i4;
    }

    public final Bundle b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f10355f) {
            try {
                bundle = new Bundle();
                if (!this.f10357h.q()) {
                    bundle.putString("session_id", this.f10356g);
                }
                bundle.putLong("basets", this.f10353b);
                bundle.putLong("currts", this.f10352a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.c);
                bundle.putInt("preqs_in_session", this.d);
                bundle.putLong("time_in_session", this.f10354e);
                bundle.putInt("pclick", this.f10358i);
                bundle.putInt("pimp", this.f10359j);
                int i4 = AbstractC0649gb.f8820a;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z4 = false;
                if (identifier == 0) {
                    Y9.r("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z4 = true;
                        } else {
                            Y9.r("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Y9.s("Fail to fetch AdActivity theme");
                        Y9.r("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z4);
                bundle.putInt("consent_form_action_identifier", a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void c() {
        synchronized (this.f10355f) {
            this.f10358i++;
        }
    }

    public final void d() {
        synchronized (this.f10355f) {
            this.f10359j++;
        }
    }

    public final void e(O1.U0 u02, long j4) {
        Bundle bundle;
        synchronized (this.f10355f) {
            try {
                long u2 = this.f10357h.u();
                N1.n.f1204A.f1212j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f10353b == -1) {
                    if (currentTimeMillis - u2 > ((Long) O1.r.d.c.a(AbstractC1066q6.f10115I0)).longValue()) {
                        this.d = -1;
                    } else {
                        this.d = this.f10357h.t();
                    }
                    this.f10353b = j4;
                    this.f10352a = j4;
                } else {
                    this.f10352a = j4;
                }
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10195Z2)).booleanValue() || (bundle = u02.f1308q) == null || bundle.getInt("gw", 2) != 1) {
                    this.c++;
                    int i4 = this.d + 1;
                    this.d = i4;
                    if (i4 == 0) {
                        this.f10354e = 0L;
                        this.f10357h.d(currentTimeMillis);
                    } else {
                        this.f10354e = currentTimeMillis - this.f10357h.v();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f10355f) {
            this.f10360k++;
        }
    }

    public final void g() {
        if (((Boolean) U6.f7142a.r()).booleanValue()) {
            synchronized (this.f10355f) {
                this.c--;
                this.d--;
            }
        }
    }
}
