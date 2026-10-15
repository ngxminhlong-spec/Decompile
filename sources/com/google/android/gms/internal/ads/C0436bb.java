package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436bb {

    /* renamed from: a, reason: collision with root package name */
    public int f8243a;

    /* renamed from: b, reason: collision with root package name */
    public int f8244b;
    public final boolean c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8245e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8246f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8247g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8248h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8249i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8250j;

    /* renamed from: k, reason: collision with root package name */
    public final float f8251k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8252l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8253m;

    /* renamed from: n, reason: collision with root package name */
    public final String f8254n;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009c A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b2, blocks: (B:12:0x008e, B:14:0x009c), top: B:11:0x008e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0436bb(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.AbstractC1066q6.a(r7)
            r6.c(r7)
            r6.e(r7)
            r6.d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            r2 = r3
            goto L24
        L23:
            r2 = r4
        L24:
            r6.c = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = r4
        L30:
            r6.d = r3
            java.lang.String r2 = r1.getCountry()
            r6.f8245e = r2
            N1.n r2 = N1.n.f1204A
            Q1.N r2 = r2.c
            O1.p r2 = O1.C0081p.f1374f
            com.google.android.gms.internal.ads.wc r2 = r2.f1375a
            boolean r2 = com.google.android.gms.internal.ads.C1335wc.j()
            r6.f8246f = r2
            boolean r2 = l2.AbstractC1799b.i(r7)
            r6.f8247g = r2
            boolean r2 = l2.AbstractC1799b.m(r7)
            r6.f8248h = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f8249i = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L65
        L63:
            r0 = r2
            goto L8c
        L65:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L6a
            goto L63
        L6a:
            m2.b r3 = m2.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            android.content.pm.PackageInfo r3 = r3.b(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            if (r3 == 0) goto L63
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
        L8c:
            r6.f8250j = r0
            m2.b r0 = m2.c.a(r7)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.b(r3, r4)     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto Lb2
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lb2
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lb2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb2
            r4.<init>()     // Catch: java.lang.Exception -> Lb2
            r4.append(r3)     // Catch: java.lang.Exception -> Lb2
            r4.append(r1)     // Catch: java.lang.Exception -> Lb2
            r4.append(r0)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lb2
        Lb2:
            r6.f8254n = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lbb
            goto Lcd
        Lbb:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto Lcd
            float r0 = r7.density
            r6.f8251k = r0
            int r0 = r7.widthPixels
            r6.f8252l = r0
            int r7 = r7.heightPixels
            r6.f8253m = r7
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0436bb.<init>(android.content.Context):void");
    }

    public C0436bb(Context context, C0478cb c0478cb) {
        AbstractC1066q6.a(context);
        c(context);
        e(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        C1452z6.a(context);
        this.c = c0478cb.f8355a;
        this.d = c0478cb.f8356b;
        this.f8245e = c0478cb.c;
        this.f8246f = c0478cb.d;
        this.f8247g = c0478cb.f8357e;
        this.f8248h = c0478cb.f8358f;
        this.f8249i = c0478cb.f8359g;
        this.f8250j = c0478cb.f8360h;
        this.f8254n = c0478cb.f8361i;
        this.f8251k = c0478cb.f8364l;
        this.f8252l = c0478cb.f8365m;
        this.f8253m = c0478cb.f8366n;
    }

    public static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            N1.n.f1204A.f1209g.h("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final C0478cb a() {
        return new C0478cb(this.c, this.d, this.f8245e, this.f8246f, this.f8247g, this.f8248h, this.f8249i, this.f8250j, this.f8254n, this.f8243a, this.f8244b, this.f8251k, this.f8252l, this.f8253m);
    }

    public final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                N1.n.f1204A.f1209g.h("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) O1.r.d.c.a(AbstractC1066q6.n9)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (registerReceiver != null) {
            registerReceiver.getIntExtra("status", -1);
            registerReceiver.getIntExtra("level", -1);
            registerReceiver.getIntExtra("scale", -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r5.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0.getNetworkOperator()
            boolean r2 = l2.AbstractC1799b.g()
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.n6 r2 = com.google.android.gms.internal.ads.AbstractC1066q6.w7
            O1.r r3 = O1.r.d
            com.google.android.gms.internal.ads.p6 r3 = r3.c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r0.getNetworkType()
        L31:
            r4.f8244b = r2
            r0.getPhoneType()
            r0 = -2
            r4.f8243a = r0
            N1.n r0 = N1.n.f1204A
            Q1.N r0 = r0.c
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r5 = Q1.N.I(r5, r0)
            if (r5 == 0) goto L5f
            android.net.NetworkInfo r5 = r1.getActiveNetworkInfo()
            if (r5 == 0) goto L59
            int r0 = r5.getType()
            r4.f8243a = r0
            android.net.NetworkInfo$DetailedState r5 = r5.getDetailedState()
            r5.ordinal()
            goto L5c
        L59:
            r5 = -1
            r4.f8243a = r5
        L5c:
            r1.isActiveNetworkMetered()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0436bb.e(android.content.Context):void");
    }
}
