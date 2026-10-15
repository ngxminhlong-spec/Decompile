package t2;

import android.os.Build;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static String f14933a;

    /* renamed from: b, reason: collision with root package name */
    public static final C2001h f14934b = new C2001h(1);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String a(android.content.Context r8) {
        /*
            java.lang.Class<t2.r> r0 = t2.r.class
            monitor-enter(r0)
            java.lang.String r1 = t2.r.f14933a     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L50
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L1e
            if (r8 != 0) goto Lf
            r8 = 0
            goto L15
        Lf:
            java.lang.String r1 = "android_id"
            java.lang.String r8 = android.provider.Settings.Secure.getString(r8, r1)     // Catch: java.lang.Throwable -> L1e
        L15:
            if (r8 == 0) goto L20
            boolean r1 = d()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L22
            goto L20
        L1e:
            r8 = move-exception
            goto L54
        L20:
            java.lang.String r8 = "emulator"
        L22:
            java.lang.String r1 = ""
            r2 = 0
            r3 = r2
        L26:
            r4 = 3
            if (r3 >= r4) goto L4e
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L4b java.lang.ArithmeticException -> L4e
            byte[] r5 = r8.getBytes()     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L4b java.lang.ArithmeticException -> L4e
            r4.update(r5)     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L4b java.lang.ArithmeticException -> L4e
            java.lang.String r5 = "%032X"
            java.math.BigInteger r6 = new java.math.BigInteger     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L4b java.lang.ArithmeticException -> L4e
            byte[] r4 = r4.digest()     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L4b java.lang.ArithmeticException -> L4e
            r7 = 1
            r6.<init>(r7, r4)     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L4b java.lang.ArithmeticException -> L4e
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L4b java.lang.ArithmeticException -> L4e
            r4[r2] = r6     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L4b java.lang.ArithmeticException -> L4e
            java.lang.String r1 = java.lang.String.format(r5, r4)     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L4b java.lang.ArithmeticException -> L4e
            goto L4e
        L4b:
            int r3 = r3 + 1
            goto L26
        L4e:
            t2.r.f14933a = r1     // Catch: java.lang.Throwable -> L1e
        L50:
            java.lang.String r8 = t2.r.f14933a     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r8
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.r.a(android.content.Context):java.lang.String");
    }

    public static void b(int i4, int i5) {
        String b4;
        if (i4 < 0 || i4 >= i5) {
            if (i4 < 0) {
                b4 = t.b("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i5 < 0) {
                    throw new IllegalArgumentException(U.a.i("negative size: ", i5));
                }
                b4 = t.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(b4);
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static boolean d() {
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith("unknown")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("sdk_goog3") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    public static void e(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i6) ? f(i4, i6, "start index") : (i5 < 0 || i5 > i6) ? f(i5, i6, "end index") : t.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4)));
        }
    }

    public static String f(int i4, int i5, String str) {
        if (i4 < 0) {
            return t.b("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return t.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(U.a.i("negative size: ", i5));
    }
}
