package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1535j1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f11947g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static volatile C1495b1 f11948h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f11949i;

    /* renamed from: a, reason: collision with root package name */
    public final B0.q f11950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11951b;
    public final Object c;
    public volatile int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f11952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11953f;

    static {
        new AtomicReference();
        f11949i = new AtomicInteger();
    }

    public /* synthetic */ C1535j1(B0.q qVar, String str, Object obj, int i4) {
        this.f11953f = i4;
        if (((Uri) qVar.f111p) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f11950a = qVar;
        this.f11951b = str;
        this.c = obj;
    }

    public final Object a(String str) {
        switch (this.f11953f) {
            case 0:
                try {
                    return Long.valueOf(Long.parseLong(str));
                } catch (NumberFormatException unused) {
                    Log.e("PhenotypeFlag", "Invalid long value for " + this.f11951b + ": " + str);
                    return null;
                }
            case 1:
                if (Z0.f11860b.matcher(str).matches()) {
                    return Boolean.TRUE;
                }
                if (Z0.c.matcher(str).matches()) {
                    return Boolean.FALSE;
                }
                Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f11951b + ": " + str);
                return null;
            case 2:
                try {
                    return Double.valueOf(Double.parseDouble(str));
                } catch (NumberFormatException unused2) {
                    Log.e("PhenotypeFlag", "Invalid double value for " + this.f11951b + ": " + str);
                    return null;
                }
            default:
                return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x001e, B:13:0x0026, B:15:0x003f, B:17:0x004d, B:20:0x007c, B:22:0x008a, B:24:0x009d, B:27:0x00ac, B:29:0x00bb, B:30:0x00be, B:31:0x00c2, B:32:0x0056, B:34:0x005c, B:37:0x006c, B:39:0x0072, B:41:0x007a, B:42:0x006a, B:46:0x00c7, B:47:0x00ca, B:49:0x00cb, B:50:0x00d0, B:51:0x00d1), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x001e, B:13:0x0026, B:15:0x003f, B:17:0x004d, B:20:0x007c, B:22:0x008a, B:24:0x009d, B:27:0x00ac, B:29:0x00bb, B:30:0x00be, B:31:0x00c2, B:32:0x0056, B:34:0x005c, B:37:0x006c, B:39:0x0072, B:41:0x007a, B:42:0x006a, B:46:0x00c7, B:47:0x00ca, B:49:0x00cb, B:50:0x00d0, B:51:0x00d1), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x001e, B:13:0x0026, B:15:0x003f, B:17:0x004d, B:20:0x007c, B:22:0x008a, B:24:0x009d, B:27:0x00ac, B:29:0x00bb, B:30:0x00be, B:31:0x00c2, B:32:0x0056, B:34:0x005c, B:37:0x006c, B:39:0x0072, B:41:0x007a, B:42:0x006a, B:46:0x00c7, B:47:0x00ca, B:49:0x00cb, B:50:0x00d0, B:51:0x00d1), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.C1535j1.f11949i
            int r0 = r0.get()
            int r1 = r6.d
            if (r1 >= r0) goto Ld5
            monitor-enter(r6)
            int r1 = r6.d     // Catch: java.lang.Throwable -> L39
            if (r1 >= r0) goto Ld1
            com.google.android.gms.internal.measurement.b1 r1 = com.google.android.gms.internal.measurement.C1535j1.f11948h     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto Lcb
            B0.q r2 = r6.f11950a     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.f111p     // Catch: java.lang.Throwable -> L39
            android.net.Uri r2 = (android.net.Uri) r2     // Catch: java.lang.Throwable -> L39
            r3 = 0
            if (r2 == 0) goto Lc7
            android.content.Context r4 = r1.f11885a     // Catch: java.lang.Throwable -> L39
            boolean r2 = com.google.android.gms.internal.measurement.AbstractC1520g1.a(r4, r2)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L3c
            android.content.Context r2 = r1.f11885a     // Catch: java.lang.Throwable -> L39
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L39
            B0.q r4 = r6.f11950a     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r4.f111p     // Catch: java.lang.Throwable -> L39
            android.net.Uri r4 = (android.net.Uri) r4     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.measurement.i1 r5 = com.google.android.gms.internal.measurement.RunnableC1530i1.f11946o     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.measurement.c1 r2 = com.google.android.gms.internal.measurement.C1500c1.a(r2, r4, r5)     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r0 = move-exception
            goto Ld3
        L3c:
            r2 = r3
        L3d:
            if (r2 == 0) goto L52
            java.lang.String r4 = r6.f11951b     // Catch: java.lang.Throwable -> L39
            java.util.Map r2 = r2.b()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L52
            java.lang.Object r2 = r6.a(r2)     // Catch: java.lang.Throwable -> L39
            goto L53
        L52:
            r2 = r3
        L53:
            if (r2 == 0) goto L56
            goto L7c
        L56:
            B0.q r2 = r6.f11950a     // Catch: java.lang.Throwable -> L39
            boolean r2 = r2.f110o     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L77
            android.content.Context r2 = r1.f11885a     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.measurement.e1 r2 = com.google.android.gms.internal.measurement.C1510e1.x(r2)     // Catch: java.lang.Throwable -> L39
            B0.q r4 = r6.f11950a     // Catch: java.lang.Throwable -> L39
            boolean r4 = r4.f110o     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L6a
            r4 = r3
            goto L6c
        L6a:
            java.lang.String r4 = r6.f11951b     // Catch: java.lang.Throwable -> L39
        L6c:
            java.lang.String r2 = r2.B(r4)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L77
            java.lang.Object r2 = r6.a(r2)     // Catch: java.lang.Throwable -> L39
            goto L78
        L77:
            r2 = r3
        L78:
            if (r2 != 0) goto L7c
            java.lang.Object r2 = r6.c     // Catch: java.lang.Throwable -> L39
        L7c:
            com.google.android.gms.internal.measurement.o1 r1 = r1.f11886b     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.measurement.m1 r1 = (com.google.android.gms.internal.measurement.AbstractC1548m1) r1     // Catch: java.lang.Throwable -> L39
            boolean r4 = r1.b()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto Lc2
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.measurement.d1 r1 = (com.google.android.gms.internal.measurement.C1505d1) r1     // Catch: java.lang.Throwable -> L39
            B0.q r2 = r6.f11950a     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.f111p     // Catch: java.lang.Throwable -> L39
            android.net.Uri r2 = (android.net.Uri) r2     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r6.f11951b     // Catch: java.lang.Throwable -> L39
            r1.getClass()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto Lb9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L39
            r.i r1 = r1.f11904a     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L39
            r.i r1 = (r.i) r1     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto Lac
            goto Lb9
        Lac:
            java.lang.String r2 = ""
            java.lang.String r2 = r2.concat(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L39
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L39
        Lb9:
            if (r3 != 0) goto Lbe
            java.lang.Object r2 = r6.c     // Catch: java.lang.Throwable -> L39
            goto Lc2
        Lbe:
            java.lang.Object r2 = r6.a(r3)     // Catch: java.lang.Throwable -> L39
        Lc2:
            r6.f11952e = r2     // Catch: java.lang.Throwable -> L39
            r6.d = r0     // Catch: java.lang.Throwable -> L39
            goto Ld1
        Lc7:
            com.google.android.gms.internal.measurement.AbstractC1540k1.a()     // Catch: java.lang.Throwable -> L39
            throw r3     // Catch: java.lang.Throwable -> L39
        Lcb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L39
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        Ld1:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            goto Ld5
        Ld3:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            throw r0
        Ld5:
            java.lang.Object r0 = r6.f11952e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1535j1.b():java.lang.Object");
    }
}
