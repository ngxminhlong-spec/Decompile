package e2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f12755b;
    public static boolean c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f12756e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f12754a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!c) {
                try {
                    PackageInfo b4 = m2.c.a(context).b("com.google.android.gms", 64);
                    i.a(context);
                    if (b4 == null || i.e(b4, false) || !i.e(b4, true)) {
                        f12755b = false;
                    } else {
                        f12755b = true;
                    }
                    c = true;
                } catch (PackageManager.NameNotFoundException e4) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e4);
                    c = true;
                }
            }
            return f12755b || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            c = true;
            throw th;
        }
    }
}
