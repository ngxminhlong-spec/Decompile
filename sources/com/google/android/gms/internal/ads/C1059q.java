package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059q {

    /* renamed from: a, reason: collision with root package name */
    public long f10062a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f10063b = -1;
    public long c = -1;
    public long d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f10064e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f10065f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f10066g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f10067h = -1;

    public static long a(long j4, long j5, long j6, long j7, long j8, long j9) {
        if (j7 + 1 >= j8 || 1 + j5 >= j6) {
            return j7;
        }
        long j10 = (((float) (j8 - j7)) / ((float) (j6 - j5))) * ((float) (j4 - j5));
        return Math.max(j7, Math.min(((j7 + j10) - j9) - (j10 / 20), j8 - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
    
        if (r9.contains("REWARDED") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.content.Context r9, android.view.View r10) {
        /*
            r8 = this;
            long r0 = r8.c
            r8.d = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.c = r0
            long r0 = r8.f10064e
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            r8.f10065f = r0
        L14:
            java.lang.String r0 = "window"
            java.lang.Object r9 = r9.getSystemService(r0)
            android.view.WindowManager r9 = (android.view.WindowManager) r9
            android.view.Display r9 = r9.getDefaultDisplay()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r9.getRealMetrics(r0)     // Catch: java.lang.NoSuchMethodError -> L29
            goto L2c
        L29:
            r9.getMetrics(r0)
        L2c:
            int r9 = r0.widthPixels
            int r1 = r0.heightPixels
            int r9 = r9 * r1
            if (r10 != 0) goto L35
            goto Lc2
        L35:
            int r1 = r10.getWidth()
            int r4 = r0.widthPixels
            int r1 = java.lang.Math.min(r1, r4)
            int r4 = r10.getHeight()
            int r0 = r0.heightPixels
            int r0 = java.lang.Math.min(r4, r0)
            int r0 = r0 * r1
            int r1 = r0 + r0
            if (r1 < r9) goto L4f
            goto Lbd
        L4f:
            if (r0 != 0) goto Lc2
            java.lang.Class r9 = r10.getClass()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "DebugGestureViewWrapper"
            boolean r9 = r9.contains(r0)     // Catch: java.lang.Throwable -> Lc2
            r0 = 0
            if (r9 == 0) goto L68
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch: java.lang.Throwable -> Lc2
            android.view.View r10 = r10.getChildAt(r0)     // Catch: java.lang.Throwable -> Lc2
        L68:
            java.lang.Class r9 = r10.getClass()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "getAdConfiguration"
            r4 = 0
            java.lang.reflect.Method r9 = r9.getMethod(r1, r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r9 = r9.invoke(r10, r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Class r10 = r9.getClass()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "adType"
            java.lang.reflect.Field r10 = r10.getField(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r10 = r10.get(r9)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> Lc2
            r10.intValue()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "adTypeToString"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lc2
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lc2
            r6[r0] = r7     // Catch: java.lang.Throwable -> Lc2
            java.lang.reflect.Method r9 = r9.getMethod(r1, r6)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lc2
            r1[r0] = r10     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r9 = r9.invoke(r4, r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r10 = "INTERSTITIAL"
            boolean r10 = r9.contains(r10)     // Catch: java.lang.Throwable -> Lc2
            if (r10 != 0) goto Lbd
            java.lang.String r10 = "APP_OPEN"
            boolean r10 = r9.contains(r10)     // Catch: java.lang.Throwable -> Lc2
            if (r10 != 0) goto Lbd
            java.lang.String r10 = "REWARDED"
            boolean r9 = r9.contains(r10)     // Catch: java.lang.Throwable -> Lc2
            if (r9 == 0) goto Lc2
        Lbd:
            long r9 = r8.c
            r8.f10064e = r9
            return
        Lc2:
            r8.f10064e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1059q.b(android.content.Context, android.view.View):void");
    }
}
