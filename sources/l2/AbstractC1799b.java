package l2;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import e2.h;
import e2.i;
import h2.y;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1799b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f13958a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f13959b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static Boolean c;
    public static Boolean d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f13960e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f13961f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f13962g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f13963h;

    /* renamed from: i, reason: collision with root package name */
    public static String f13964i;

    /* renamed from: j, reason: collision with root package name */
    public static int f13965j;

    public static void a(Context context, Throwable th) {
        try {
            y.i(context);
        } catch (Exception e4) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i4 = 0;
        for (byte b4 : bArr) {
            char[] cArr2 = f13959b;
            cArr[i4] = cArr2[(b4 & 255) >>> 4];
            cArr[i4 + 1] = cArr2[b4 & 15];
            i4 += 2;
        }
        return new String(cArr);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long d(InputStream inputStream, OutputStream outputStream, boolean z4) {
        byte[] bArr = new byte[1024];
        long j4 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                j4 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z4) {
                    c(inputStream);
                    c(outputStream);
                }
                throw th;
            }
        }
        if (z4) {
            c(inputStream);
            c(outputStream);
        }
        return j4;
    }

    public static String e() {
        BufferedReader bufferedReader;
        String processName;
        if (f13964i == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f13964i = processName;
            } else {
                int i4 = f13965j;
                if (i4 == 0) {
                    i4 = Process.myPid();
                    f13965j = i4;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i4 > 0) {
                    try {
                        String str2 = "/proc/" + i4 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                y.i(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                c(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    c(bufferedReader);
                }
                f13964i = str;
            }
        }
        return f13964i;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean h(Context context, int i4) {
        if (l(i4, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                i a4 = i.a(context);
                a4.getClass();
                if (packageInfo != null) {
                    if (!i.e(packageInfo, false)) {
                        if (i.e(packageInfo, true)) {
                            if (!h.a(a4.f12758o)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean i(Context context) {
        if (f13960e == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z4 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z4 = true;
            }
            f13960e = Boolean.valueOf(z4);
        }
        return f13960e.booleanValue();
    }

    public static boolean j(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (c == null) {
            c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (c.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (m(context)) {
            return !f() || g();
        }
        return false;
    }

    public static byte[] k(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 2;
            bArr[i4 / 2] = (byte) Integer.parseInt(str.substring(i4, i5), 16);
            i4 = i5;
        }
        return bArr;
    }

    public static boolean l(int i4, Context context, String str) {
        m2.b a4 = m2.c.a(context);
        a4.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a4.f14053a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i4, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean m(Context context) {
        if (d == null) {
            d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return d.booleanValue();
    }
}
