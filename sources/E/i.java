package E;

import b0.l0;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f694a = new l0(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f695b;
    public static final Object c;
    public static final r.i d;

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f695b = threadPoolExecutor;
        c = new Object();
        d = new r.i(0);
    }

    public static String a(int i4, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(((e) list.get(i5)).f686g);
            sb.append("-");
            sb.append(i4);
            if (i5 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static E.h b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            b0.l0 r0 = E.i.f694a
            java.lang.String r1 = "getFontSync"
            m2.AbstractC1806a.f(r1)
            java.lang.Object r1 = r0.g(r8)     // Catch: java.lang.Throwable -> Lb7
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> Lb7
            if (r1 == 0) goto L18
            E.h r8 = new E.h     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        L18:
            B0.r r10 = E.d.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lad java.lang.Throwable -> Lb7
            java.lang.Object r1 = r10.f113p     // Catch: java.lang.Throwable -> Lb7
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lb7
            int r10 = r10.f112o     // Catch: java.lang.Throwable -> Lb7
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2d
            if (r10 == r2) goto L2b
        L29:
            r10 = r3
            goto L4e
        L2b:
            r10 = -2
            goto L4e
        L2d:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb7
            E.j[] r10 = (E.j[]) r10     // Catch: java.lang.Throwable -> Lb7
            if (r10 == 0) goto L4d
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb7
            if (r5 != 0) goto L39
            goto L4d
        L39:
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb7
            r6 = r4
        L3b:
            if (r6 >= r5) goto L4b
            r7 = r10[r6]     // Catch: java.lang.Throwable -> Lb7
            int r7 = r7.f699f     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto L48
            if (r7 >= 0) goto L46
            goto L29
        L46:
            r10 = r7
            goto L4e
        L48:
            int r6 = r6 + 1
            goto L3b
        L4b:
            r10 = r4
            goto L4e
        L4d:
            r10 = r2
        L4e:
            if (r10 == 0) goto L59
            E.h r8 = new E.h     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        L59:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> Lb7
            if (r10 <= r2) goto L7b
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb7
            r2 = 29
            if (r10 < r2) goto L7b
            com.google.android.gms.internal.play_billing.B r10 = A.g.f5a     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            m2.AbstractC1806a.f(r10)     // Catch: java.lang.Throwable -> Lb7
            com.google.android.gms.internal.play_billing.B r10 = A.g.f5a     // Catch: java.lang.Throwable -> L76
            android.graphics.Typeface r9 = r10.m(r9, r1, r11)     // Catch: java.lang.Throwable -> L76
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
            goto L91
        L76:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
            throw r8     // Catch: java.lang.Throwable -> Lb7
        L7b:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb7
            E.j[] r10 = (E.j[]) r10     // Catch: java.lang.Throwable -> Lb7
            com.google.android.gms.internal.play_billing.B r1 = A.g.f5a     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = "TypefaceCompat.createFromFontInfo"
            m2.AbstractC1806a.f(r1)     // Catch: java.lang.Throwable -> Lb7
            com.google.android.gms.internal.play_billing.B r1 = A.g.f5a     // Catch: java.lang.Throwable -> La8
            android.graphics.Typeface r9 = r1.l(r9, r10, r11)     // Catch: java.lang.Throwable -> La8
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
        L91:
            if (r9 == 0) goto L9f
            r0.k(r8, r9)     // Catch: java.lang.Throwable -> Lb7
            E.h r8 = new E.h     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        L9f:
            E.h r8 = new E.h     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        La8:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
            throw r8     // Catch: java.lang.Throwable -> Lb7
        Lad:
            E.h r8 = new E.h     // Catch: java.lang.Throwable -> Lb7
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        Lb7:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: E.i.b(java.lang.String, android.content.Context, java.util.List, int):E.h");
    }
}
