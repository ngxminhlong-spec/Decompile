package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class I2 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f5528a = Log.isLoggable("Volley", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final String f5529b = I2.class.getName();

    public static void a(String str, Object... objArr) {
        Log.d("Volley", d(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e("Volley", d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f5528a) {
            Log.v("Volley", d(str, objArr));
        }
    }

    public static String d(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i4 = 2;
        while (true) {
            if (i4 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i4].getClassName().equals(f5529b)) {
                String className = stackTrace[i4].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = n0.a.i(substring.substring(substring.lastIndexOf(36) + 1), ".", stackTrace[i4].getMethodName());
                break;
            }
            i4++;
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("[");
        sb.append(id);
        sb.append("] ");
        sb.append(str2);
        return n0.a.j(sb, ": ", format);
    }
}
