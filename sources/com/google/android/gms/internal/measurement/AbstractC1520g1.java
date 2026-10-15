package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1520g1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile AbstractC1548m1 f11935a = C1544l1.f11964o;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f11936b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(1:20)(8:33|(1:35)(1:41)|36|(2:38|(1:40))|27|28|29|30)|21|22|23|24|(1:26)|27|28|29|30) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L1d
            java.lang.String r5 = "PhenotypeClientHelper"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r6 = r6.concat(r0)
            android.util.Log.e(r5, r6)
            return r1
        L1d:
            com.google.android.gms.internal.measurement.m1 r6 = com.google.android.gms.internal.measurement.AbstractC1520g1.f11935a
            boolean r6 = r6.b()
            if (r6 == 0) goto L32
            com.google.android.gms.internal.measurement.m1 r5 = com.google.android.gms.internal.measurement.AbstractC1520g1.f11935a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L32:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.AbstractC1520g1.f11936b
            monitor-enter(r6)
            com.google.android.gms.internal.measurement.m1 r0 = com.google.android.gms.internal.measurement.AbstractC1520g1.f11935a     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.measurement.m1 r5 = com.google.android.gms.internal.measurement.AbstractC1520g1.f11935a     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Throwable -> L4b
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L4b
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4b
            return r5
        L4b:
            r5 = move-exception
            goto La5
        L4d:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L5a
            goto L7b
        L5a:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4b
            r4 = 29
            if (r3 >= r4) goto L68
            r3 = r1
            goto L6a
        L68:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L6a:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L8c
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L7b
            goto L8c
        L7b:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: java.lang.Throwable -> L4b android.content.pm.PackageManager.NameNotFoundException -> L8c
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L4b
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L8c
            r1 = 1
        L8c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.internal.measurement.n1 r0 = new com.google.android.gms.internal.measurement.n1     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.internal.measurement.AbstractC1520g1.f11935a = r0     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.internal.measurement.m1 r5 = com.google.android.gms.internal.measurement.AbstractC1520g1.f11935a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        La5:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC1520g1.a(android.content.Context, android.net.Uri):boolean");
    }
}
