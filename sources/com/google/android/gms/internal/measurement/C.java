package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f11708a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f11709b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            java.lang.String r2 = "JobSchedulerCompat"
            r3 = 0
            r4 = 24
            if (r0 < r4) goto L33
            r0 = 4
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobInfo> r5 = android.app.job.JobInfo.class
            r6 = 0
            r0[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 1
            r0[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            r7 = 2
            r0[r7] = r6     // Catch: java.lang.NoSuchMethodException -> L28
            r6 = 3
            r0[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobScheduler> r5 = android.app.job.JobScheduler.class
            java.lang.String r6 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r6, r0)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L34
        L28:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L33
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r2, r0)
        L33:
            r0 = r3
        L34:
            com.google.android.gms.internal.measurement.C.f11708a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L4e
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r4 = "myUserId"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r4, r3)     // Catch: java.lang.NoSuchMethodException -> L43
            goto L4e
        L43:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L4e
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r2, r0)
        L4e:
            com.google.android.gms.internal.measurement.C.f11709b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C.<clinit>():void");
    }
}
